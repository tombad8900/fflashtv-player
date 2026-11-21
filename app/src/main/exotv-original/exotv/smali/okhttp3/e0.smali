.class public Lokhttp3/e0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lokhttp3/f;
.implements Lokhttp3/m0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/e0$a;,
        Lokhttp3/e0$b;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/e0$b;

.field private static final DEFAULT_CONNECTION_SPECS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_PROTOCOLS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final authenticator:Lokhttp3/c;

.field private final cache:Lokhttp3/d;

.field private final callTimeoutMillis:I

.field private final certificateChainCleaner:Lu7/c;

.field private final certificatePinner:Lokhttp3/i;

.field private final connectTimeoutMillis:I

.field private final connectionPool:Lokhttp3/m;

.field private final connectionSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;"
        }
    .end annotation
.end field

.field private final cookieJar:Lokhttp3/q;

.field private final dispatcher:Lokhttp3/s;

.field private final dns:Lokhttp3/u;

.field private final eventListenerFactory:Lokhttp3/w;

.field private final followRedirects:Z

.field private final followSslRedirects:Z

.field private final hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private final interceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final minWebSocketMessageToCompress:J

.field private final networkInterceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final pingIntervalMillis:I

.field private final protocols:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final proxy:Ljava/net/Proxy;

.field private final proxyAuthenticator:Lokhttp3/c;

.field private final proxySelector:Ljava/net/ProxySelector;

.field private final readTimeoutMillis:I

.field private final retryOnConnectionFailure:Z

.field private final routeDatabase:Lokhttp3/internal/connection/i;

.field private final socketFactory:Ljavax/net/SocketFactory;

.field private final sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

.field private final writeTimeoutMillis:I

.field private final x509TrustManager:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/e0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/e0$b;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/e0;->Companion:Lokhttp3/e0$b;

    .line 8
    .line 9
    sget-object v0, Lokhttp3/f0;->HTTP_2:Lokhttp3/f0;

    .line 10
    .line 11
    sget-object v1, Lokhttp3/f0;->HTTP_1_1:Lokhttp3/f0;

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Lokhttp3/f0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lq7/c;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lokhttp3/e0;->DEFAULT_PROTOCOLS:Ljava/util/List;

    .line 22
    .line 23
    sget-object v0, Lokhttp3/n;->MODERN_TLS:Lokhttp3/n;

    .line 24
    .line 25
    sget-object v1, Lokhttp3/n;->CLEARTEXT:Lokhttp3/n;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [Lokhttp3/n;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lq7/c;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lokhttp3/e0;->DEFAULT_CONNECTION_SPECS:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    new-instance v0, Lokhttp3/e0$a;

    invoke-direct {v0}, Lokhttp3/e0$a;-><init>()V

    invoke-direct {p0, v0}, Lokhttp3/e0;-><init>(Lokhttp3/e0$a;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/e0$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lokhttp3/e0$a;->getDispatcher$okhttp()Lokhttp3/s;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->dispatcher:Lokhttp3/s;

    .line 3
    invoke-virtual {p1}, Lokhttp3/e0$a;->getConnectionPool$okhttp()Lokhttp3/m;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->connectionPool:Lokhttp3/m;

    .line 4
    invoke-virtual {p1}, Lokhttp3/e0$a;->getInterceptors$okhttp()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq7/c;->toImmutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->interceptors:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Lokhttp3/e0$a;->getNetworkInterceptors$okhttp()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq7/c;->toImmutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->networkInterceptors:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Lokhttp3/e0$a;->getEventListenerFactory$okhttp()Lokhttp3/w;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->eventListenerFactory:Lokhttp3/w;

    .line 7
    invoke-virtual {p1}, Lokhttp3/e0$a;->getRetryOnConnectionFailure$okhttp()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0;->retryOnConnectionFailure:Z

    .line 8
    invoke-virtual {p1}, Lokhttp3/e0$a;->getAuthenticator$okhttp()Lokhttp3/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->authenticator:Lokhttp3/c;

    .line 9
    invoke-virtual {p1}, Lokhttp3/e0$a;->getFollowRedirects$okhttp()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0;->followRedirects:Z

    .line 10
    invoke-virtual {p1}, Lokhttp3/e0$a;->getFollowSslRedirects$okhttp()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0;->followSslRedirects:Z

    .line 11
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCookieJar$okhttp()Lokhttp3/q;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->cookieJar:Lokhttp3/q;

    .line 12
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCache$okhttp()Lokhttp3/d;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->cache:Lokhttp3/d;

    .line 13
    invoke-virtual {p1}, Lokhttp3/e0$a;->getDns$okhttp()Lokhttp3/u;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->dns:Lokhttp3/u;

    .line 14
    invoke-virtual {p1}, Lokhttp3/e0$a;->getProxy$okhttp()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->proxy:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, Lokhttp3/e0$a;->getProxy$okhttp()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lt7/a;->INSTANCE:Lt7/a;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lokhttp3/e0$a;->getProxySelector$okhttp()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lt7/a;->INSTANCE:Lt7/a;

    .line 17
    :cond_2
    :goto_0
    iput-object v0, p0, Lokhttp3/e0;->proxySelector:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, Lokhttp3/e0$a;->getProxyAuthenticator$okhttp()Lokhttp3/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->proxyAuthenticator:Lokhttp3/c;

    .line 19
    invoke-virtual {p1}, Lokhttp3/e0$a;->getSocketFactory$okhttp()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->socketFactory:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, Lokhttp3/e0$a;->getConnectionSpecs$okhttp()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->connectionSpecs:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Lokhttp3/e0$a;->getProtocols$okhttp()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/e0;->protocols:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, Lokhttp3/e0$a;->getHostnameVerifier$okhttp()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/e0;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCallTimeout$okhttp()I

    move-result v1

    iput v1, p0, Lokhttp3/e0;->callTimeoutMillis:I

    .line 24
    invoke-virtual {p1}, Lokhttp3/e0$a;->getConnectTimeout$okhttp()I

    move-result v1

    iput v1, p0, Lokhttp3/e0;->connectTimeoutMillis:I

    .line 25
    invoke-virtual {p1}, Lokhttp3/e0$a;->getReadTimeout$okhttp()I

    move-result v1

    iput v1, p0, Lokhttp3/e0;->readTimeoutMillis:I

    .line 26
    invoke-virtual {p1}, Lokhttp3/e0$a;->getWriteTimeout$okhttp()I

    move-result v1

    iput v1, p0, Lokhttp3/e0;->writeTimeoutMillis:I

    .line 27
    invoke-virtual {p1}, Lokhttp3/e0$a;->getPingInterval$okhttp()I

    move-result v1

    iput v1, p0, Lokhttp3/e0;->pingIntervalMillis:I

    .line 28
    invoke-virtual {p1}, Lokhttp3/e0$a;->getMinWebSocketMessageToCompress$okhttp()J

    move-result-wide v1

    iput-wide v1, p0, Lokhttp3/e0;->minWebSocketMessageToCompress:J

    .line 29
    invoke-virtual {p1}, Lokhttp3/e0$a;->getRouteDatabase$okhttp()Lokhttp3/internal/connection/i;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lokhttp3/internal/connection/i;

    invoke-direct {v1}, Lokhttp3/internal/connection/i;-><init>()V

    :cond_3
    iput-object v1, p0, Lokhttp3/e0;->routeDatabase:Lokhttp3/internal/connection/i;

    if-eqz v0, :cond_4

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 31
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/n;

    .line 32
    invoke-virtual {v1}, Lokhttp3/n;->isTls()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 33
    invoke-virtual {p1}, Lokhttp3/e0$a;->getSslSocketFactoryOrNull$okhttp()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 34
    invoke-virtual {p1}, Lokhttp3/e0$a;->getSslSocketFactoryOrNull$okhttp()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 35
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCertificateChainCleaner$okhttp()Lu7/c;

    move-result-object v0

    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 36
    invoke-virtual {p1}, Lokhttp3/e0$a;->getX509TrustManagerOrNull$okhttp()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    iput-object v1, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 37
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCertificatePinner$okhttp()Lokhttp3/i;

    move-result-object p1

    .line 38
    invoke-virtual {p1, v0}, Lokhttp3/i;->withCertificateChainCleaner$okhttp(Lu7/c;)Lokhttp3/i;

    move-result-object p1

    .line 39
    iput-object p1, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    goto :goto_2

    .line 40
    :cond_6
    sget-object v0, Ls7/h;->Companion:Ls7/h$a;

    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v1

    invoke-virtual {v1}, Ls7/h;->platformTrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 41
    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v0

    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ls7/h;->newSslSocketFactory(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 42
    sget-object v0, Lu7/c;->Companion:Lu7/c$a;

    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lu7/c$a;->get(Ljavax/net/ssl/X509TrustManager;)Lu7/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 43
    invoke-virtual {p1}, Lokhttp3/e0$a;->getCertificatePinner$okhttp()Lokhttp3/i;

    move-result-object p1

    .line 44
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lokhttp3/i;->withCertificateChainCleaner$okhttp(Lu7/c;)Lokhttp3/i;

    move-result-object p1

    .line 45
    iput-object p1, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    goto :goto_2

    :cond_7
    :goto_1
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 47
    iput-object p1, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 48
    iput-object p1, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 49
    sget-object p1, Lokhttp3/i;->DEFAULT:Lokhttp3/i;

    iput-object p1, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    .line 50
    :goto_2
    invoke-direct {p0}, Lokhttp3/e0;->verifyClientState()V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_CONNECTION_SPECS$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/e0;->DEFAULT_CONNECTION_SPECS:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDEFAULT_PROTOCOLS$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/e0;->DEFAULT_PROTOCOLS:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSslSocketFactoryOrNull$p(Lokhttp3/e0;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method private final verifyClientState()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->interceptors:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_b

    .line 14
    .line 15
    iget-object v0, p0, Lokhttp3/e0;->networkInterceptors:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-object v0, p0, Lokhttp3/e0;->connectionSpecs:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lokhttp3/n;

    .line 52
    .line 53
    invoke-virtual {v1}, Lokhttp3/n;->isTls()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "x509TrustManager == null"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "certificateChainCleaner == null"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v1, "sslSocketFactory == null"

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_5
    :goto_0
    iget-object v0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 97
    .line 98
    const-string v1, "Check failed."

    .line 99
    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    iget-object v0, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 103
    .line 104
    if-nez v0, :cond_8

    .line 105
    .line 106
    iget-object v0, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    .line 111
    .line 112
    sget-object v2, Lokhttp3/i;->DEFAULT:Lokhttp3/i;

    .line 113
    .line 114
    invoke-static {v0, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v1, "Null network interceptor: "

    .line 148
    .line 149
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lokhttp3/e0;->networkInterceptors:Ljava/util/List;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v1

    .line 171
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v1, "Null interceptor: "

    .line 174
    .line 175
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Lokhttp3/e0;->interceptors:Ljava/util/List;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1
.end method


# virtual methods
.method public final -deprecated_authenticator()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->authenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_cache()Lokhttp3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_callTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->callTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_certificatePinner()Lokhttp3/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_connectTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->connectTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_connectionPool()Lokhttp3/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->connectionPool:Lokhttp3/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_connectionSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->connectionSpecs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_cookieJar()Lokhttp3/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->cookieJar:Lokhttp3/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_dispatcher()Lokhttp3/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->dispatcher:Lokhttp3/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_dns()Lokhttp3/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->dns:Lokhttp3/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_eventListenerFactory()Lokhttp3/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->eventListenerFactory:Lokhttp3/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_followRedirects()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->followRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_followSslRedirects()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->followSslRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_interceptors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->interceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_networkInterceptors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->networkInterceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_pingIntervalMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->pingIntervalMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_protocols()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->protocols:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_proxy()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_proxyAuthenticator()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxyAuthenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_proxySelector()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxySelector:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_readTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->readTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_retryOnConnectionFailure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_socketFactory()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->socketFactory:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/e0;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final -deprecated_writeTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->writeTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final authenticator()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->authenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final cache()Lokhttp3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final callTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->callTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final certificateChainCleaner()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->certificateChainCleaner:Lu7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final certificatePinner()Lokhttp3/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->certificatePinner:Lokhttp3/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final connectTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->connectTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final connectionPool()Lokhttp3/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->connectionPool:Lokhttp3/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final connectionSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->connectionSpecs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final cookieJar()Lokhttp3/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->cookieJar:Lokhttp3/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final dispatcher()Lokhttp3/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->dispatcher:Lokhttp3/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final dns()Lokhttp3/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->dns:Lokhttp3/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final eventListenerFactory()Lokhttp3/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->eventListenerFactory:Lokhttp3/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final followRedirects()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->followRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final followSslRedirects()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->followSslRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRouteDatabase()Lokhttp3/internal/connection/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final interceptors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->interceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final minWebSocketMessageToCompress()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/e0;->minWebSocketMessageToCompress:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final networkInterceptors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->networkInterceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public newBuilder()Lokhttp3/e0$a;
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/e0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokhttp3/e0$a;-><init>(Lokhttp3/e0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public newCall(Lokhttp3/g0;)Lokhttp3/g;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/internal/connection/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lokhttp3/internal/connection/e;-><init>(Lokhttp3/e0;Lokhttp3/g0;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public newWebSocket(Lokhttp3/g0;Lokhttp3/o0;)Lokhttp3/n0;
    .locals 11

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lokhttp3/internal/ws/d;

    .line 12
    .line 13
    sget-object v2, Lokhttp3/internal/concurrent/e;->INSTANCE:Lokhttp3/internal/concurrent/e;

    .line 14
    .line 15
    new-instance v5, Ljava/util/Random;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lokhttp3/e0;->pingIntervalMillis:I

    .line 21
    .line 22
    int-to-long v6, v0

    .line 23
    const/4 v8, 0x0

    .line 24
    iget-wide v9, p0, Lokhttp3/e0;->minWebSocketMessageToCompress:J

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    move-object v4, p2

    .line 28
    invoke-direct/range {v1 .. v10}, Lokhttp3/internal/ws/d;-><init>(Lokhttp3/internal/concurrent/e;Lokhttp3/g0;Lokhttp3/o0;Ljava/util/Random;JLokhttp3/internal/ws/e;J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lokhttp3/internal/ws/d;->connect(Lokhttp3/e0;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final pingIntervalMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->pingIntervalMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final protocols()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->protocols:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final proxy()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final proxyAuthenticator()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxyAuthenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final proxySelector()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->proxySelector:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final readTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->readTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final retryOnConnectionFailure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return v0
.end method

.method public final socketFactory()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->socketFactory:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "CLEARTEXT-only client"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final writeTimeoutMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0;->writeTimeoutMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final x509TrustManager()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0;->x509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method
