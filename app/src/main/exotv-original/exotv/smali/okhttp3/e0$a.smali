.class public final Lokhttp3/e0$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private authenticator:Lokhttp3/c;

.field private cache:Lokhttp3/d;

.field private callTimeout:I

.field private certificateChainCleaner:Lu7/c;

.field private certificatePinner:Lokhttp3/i;

.field private connectTimeout:I

.field private connectionPool:Lokhttp3/m;

.field private connectionSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;"
        }
    .end annotation
.end field

.field private cookieJar:Lokhttp3/q;

.field private dispatcher:Lokhttp3/s;

.field private dns:Lokhttp3/u;

.field private eventListenerFactory:Lokhttp3/w;

.field private followRedirects:Z

.field private followSslRedirects:Z

.field private hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private final interceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation
.end field

.field private minWebSocketMessageToCompress:J

.field private final networkInterceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/c0;",
            ">;"
        }
    .end annotation
.end field

.field private pingInterval:I

.field private protocols:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lokhttp3/f0;",
            ">;"
        }
    .end annotation
.end field

.field private proxy:Ljava/net/Proxy;

.field private proxyAuthenticator:Lokhttp3/c;

.field private proxySelector:Ljava/net/ProxySelector;

.field private readTimeout:I

.field private retryOnConnectionFailure:Z

.field private routeDatabase:Lokhttp3/internal/connection/i;

.field private socketFactory:Ljavax/net/SocketFactory;

.field private sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

.field private writeTimeout:I

.field private x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lokhttp3/s;

    invoke-direct {v0}, Lokhttp3/s;-><init>()V

    iput-object v0, p0, Lokhttp3/e0$a;->dispatcher:Lokhttp3/s;

    .line 3
    new-instance v0, Lokhttp3/m;

    invoke-direct {v0}, Lokhttp3/m;-><init>()V

    iput-object v0, p0, Lokhttp3/e0$a;->connectionPool:Lokhttp3/m;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/e0$a;->interceptors:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/e0$a;->networkInterceptors:Ljava/util/List;

    .line 6
    sget-object v0, Lokhttp3/v;->NONE:Lokhttp3/v;

    invoke-static {v0}, Lq7/c;->asFactory(Lokhttp3/v;)Lokhttp3/w;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lokhttp3/e0$a;->retryOnConnectionFailure:Z

    .line 8
    sget-object v1, Lokhttp3/c;->NONE:Lokhttp3/c;

    iput-object v1, p0, Lokhttp3/e0$a;->authenticator:Lokhttp3/c;

    .line 9
    iput-boolean v0, p0, Lokhttp3/e0$a;->followRedirects:Z

    .line 10
    iput-boolean v0, p0, Lokhttp3/e0$a;->followSslRedirects:Z

    .line 11
    sget-object v0, Lokhttp3/q;->NO_COOKIES:Lokhttp3/q;

    iput-object v0, p0, Lokhttp3/e0$a;->cookieJar:Lokhttp3/q;

    .line 12
    sget-object v0, Lokhttp3/u;->SYSTEM:Lokhttp3/u;

    iput-object v0, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 13
    iput-object v1, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Lokhttp3/e0;->Companion:Lokhttp3/e0$b;

    invoke-virtual {v0}, Lokhttp3/e0$b;->getDEFAULT_CONNECTION_SPECS$okhttp()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Lokhttp3/e0$b;->getDEFAULT_PROTOCOLS$okhttp()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 17
    sget-object v0, Lu7/d;->INSTANCE:Lu7/d;

    iput-object v0, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Lokhttp3/i;->DEFAULT:Lokhttp3/i;

    iput-object v0, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Lokhttp3/e0$a;->connectTimeout:I

    .line 20
    iput v0, p0, Lokhttp3/e0$a;->readTimeout:I

    .line 21
    iput v0, p0, Lokhttp3/e0$a;->writeTimeout:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Lokhttp3/e0$a;->minWebSocketMessageToCompress:J

    return-void
.end method

.method public constructor <init>(Lokhttp3/e0;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    invoke-direct {p0}, Lokhttp3/e0$a;-><init>()V

    .line 24
    invoke-virtual {p1}, Lokhttp3/e0;->dispatcher()Lokhttp3/s;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->dispatcher:Lokhttp3/s;

    .line 25
    invoke-virtual {p1}, Lokhttp3/e0;->connectionPool()Lokhttp3/m;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->connectionPool:Lokhttp3/m;

    .line 26
    iget-object v0, p0, Lokhttp3/e0$a;->interceptors:Ljava/util/List;

    invoke-virtual {p1}, Lokhttp3/e0;->interceptors()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lm6/n;->x0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 27
    iget-object v0, p0, Lokhttp3/e0$a;->networkInterceptors:Ljava/util/List;

    invoke-virtual {p1}, Lokhttp3/e0;->networkInterceptors()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lm6/n;->x0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 28
    invoke-virtual {p1}, Lokhttp3/e0;->eventListenerFactory()Lokhttp3/w;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    .line 29
    invoke-virtual {p1}, Lokhttp3/e0;->retryOnConnectionFailure()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0$a;->retryOnConnectionFailure:Z

    .line 30
    invoke-virtual {p1}, Lokhttp3/e0;->authenticator()Lokhttp3/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->authenticator:Lokhttp3/c;

    .line 31
    invoke-virtual {p1}, Lokhttp3/e0;->followRedirects()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0$a;->followRedirects:Z

    .line 32
    invoke-virtual {p1}, Lokhttp3/e0;->followSslRedirects()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/e0$a;->followSslRedirects:Z

    .line 33
    invoke-virtual {p1}, Lokhttp3/e0;->cookieJar()Lokhttp3/q;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->cookieJar:Lokhttp3/q;

    .line 34
    invoke-virtual {p1}, Lokhttp3/e0;->cache()Lokhttp3/d;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->cache:Lokhttp3/d;

    .line 35
    invoke-virtual {p1}, Lokhttp3/e0;->dns()Lokhttp3/u;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 36
    invoke-virtual {p1}, Lokhttp3/e0;->proxy()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->proxy:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Lokhttp3/e0;->proxySelector()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->proxySelector:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Lokhttp3/e0;->proxyAuthenticator()Lokhttp3/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 39
    invoke-virtual {p1}, Lokhttp3/e0;->socketFactory()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Lokhttp3/e0;->access$getSslSocketFactoryOrNull$p(Lokhttp3/e0;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Lokhttp3/e0;->x509TrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Lokhttp3/e0;->connectionSpecs()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Lokhttp3/e0;->protocols()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Lokhttp3/e0;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Lokhttp3/e0;->certificatePinner()Lokhttp3/i;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    .line 46
    invoke-virtual {p1}, Lokhttp3/e0;->certificateChainCleaner()Lu7/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/e0$a;->certificateChainCleaner:Lu7/c;

    .line 47
    invoke-virtual {p1}, Lokhttp3/e0;->callTimeoutMillis()I

    move-result v0

    iput v0, p0, Lokhttp3/e0$a;->callTimeout:I

    .line 48
    invoke-virtual {p1}, Lokhttp3/e0;->connectTimeoutMillis()I

    move-result v0

    iput v0, p0, Lokhttp3/e0$a;->connectTimeout:I

    .line 49
    invoke-virtual {p1}, Lokhttp3/e0;->readTimeoutMillis()I

    move-result v0

    iput v0, p0, Lokhttp3/e0$a;->readTimeout:I

    .line 50
    invoke-virtual {p1}, Lokhttp3/e0;->writeTimeoutMillis()I

    move-result v0

    iput v0, p0, Lokhttp3/e0$a;->writeTimeout:I

    .line 51
    invoke-virtual {p1}, Lokhttp3/e0;->pingIntervalMillis()I

    move-result v0

    iput v0, p0, Lokhttp3/e0$a;->pingInterval:I

    .line 52
    invoke-virtual {p1}, Lokhttp3/e0;->minWebSocketMessageToCompress()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/e0$a;->minWebSocketMessageToCompress:J

    .line 53
    invoke-virtual {p1}, Lokhttp3/e0;->getRouteDatabase()Lokhttp3/internal/connection/i;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    return-void
.end method


# virtual methods
.method public final -addInterceptor(Ly6/l;)Lokhttp3/e0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/l;",
            ")",
            "Lokhttp3/e0$a;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/e0$a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/e0$a$a;-><init>(Ly6/l;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lokhttp3/e0$a;->addInterceptor(Lokhttp3/c0;)Lokhttp3/e0$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final -addNetworkInterceptor(Ly6/l;)Lokhttp3/e0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/l;",
            ")",
            "Lokhttp3/e0$a;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/e0$a$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/e0$a$b;-><init>(Ly6/l;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lokhttp3/e0$a;->addNetworkInterceptor(Lokhttp3/c0;)Lokhttp3/e0$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final addInterceptor(Lokhttp3/c0;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->interceptors:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final addNetworkInterceptor(Lokhttp3/c0;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->networkInterceptors:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final authenticator(Lokhttp3/c;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "authenticator"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->authenticator:Lokhttp3/c;

    .line 7
    .line 8
    return-object p0
.end method

.method public final build()Lokhttp3/e0;
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/e0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokhttp3/e0;-><init>(Lokhttp3/e0$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final cache(Lokhttp3/d;)Lokhttp3/e0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lq7/c;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lokhttp3/e0$a;->callTimeout:I

    return-object p0
.end method

.method public final callTimeout(Lj$/time/Duration;)Lokhttp3/e0$a;
    .locals 2
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    const-string v0, "duration"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lj$/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lokhttp3/e0$a;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    return-object p0
.end method

.method public final certificatePinner(Lokhttp3/i;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "certificatePinner"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lokhttp3/i;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public final connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lq7/c;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lokhttp3/e0$a;->connectTimeout:I

    return-object p0
.end method

.method public final connectTimeout(Lj$/time/Duration;)Lokhttp3/e0$a;
    .locals 2
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    const-string v0, "duration"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lj$/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lokhttp3/e0$a;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    return-object p0
.end method

.method public final connectionPool(Lokhttp3/m;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->connectionPool:Lokhttp3/m;

    .line 7
    .line 8
    return-object p0
.end method

.method public final connectionSpecs(Ljava/util/List;)Lokhttp3/e0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;)",
            "Lokhttp3/e0$a;"
        }
    .end annotation

    .line 1
    const-string v0, "connectionSpecs"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    invoke-static {p1}, Lq7/c;->toImmutableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 22
    .line 23
    return-object p0
.end method

.method public final cookieJar(Lokhttp3/q;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "cookieJar"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->cookieJar:Lokhttp3/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public final dispatcher(Lokhttp3/s;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->dispatcher:Lokhttp3/s;

    .line 7
    .line 8
    return-object p0
.end method

.method public final dns(Lokhttp3/u;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "dns"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 18
    .line 19
    return-object p0
.end method

.method public final eventListener(Lokhttp3/v;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "eventListener"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lq7/c;->asFactory(Lokhttp3/v;)Lokhttp3/w;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    .line 11
    .line 12
    return-object p0
.end method

.method public final eventListenerFactory(Lokhttp3/w;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "eventListenerFactory"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    .line 7
    .line 8
    return-object p0
.end method

.method public final followRedirects(Z)Lokhttp3/e0$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->followRedirects:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final followSslRedirects(Z)Lokhttp3/e0$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->followSslRedirects:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuthenticator$okhttp()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->authenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCache$okhttp()Lokhttp3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCallTimeout$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0$a;->callTimeout:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCertificateChainCleaner$okhttp()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->certificateChainCleaner:Lu7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCertificatePinner$okhttp()Lokhttp3/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnectTimeout$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0$a;->connectTimeout:I

    .line 2
    .line 3
    return v0
.end method

.method public final getConnectionPool$okhttp()Lokhttp3/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->connectionPool:Lokhttp3/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnectionSpecs$okhttp()Ljava/util/List;
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
    iget-object v0, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCookieJar$okhttp()Lokhttp3/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->cookieJar:Lokhttp3/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDispatcher$okhttp()Lokhttp3/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->dispatcher:Lokhttp3/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDns$okhttp()Lokhttp3/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEventListenerFactory$okhttp()Lokhttp3/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFollowRedirects$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0$a;->followRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getFollowSslRedirects$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0$a;->followSslRedirects:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHostnameVerifier$okhttp()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInterceptors$okhttp()Ljava/util/List;
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
    iget-object v0, p0, Lokhttp3/e0$a;->interceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMinWebSocketMessageToCompress$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/e0$a;->minWebSocketMessageToCompress:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNetworkInterceptors$okhttp()Ljava/util/List;
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
    iget-object v0, p0, Lokhttp3/e0$a;->networkInterceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPingInterval$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0$a;->pingInterval:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProtocols$okhttp()Ljava/util/List;
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
    iget-object v0, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProxy$okhttp()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProxyAuthenticator$okhttp()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProxySelector$okhttp()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->proxySelector:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReadTimeout$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0$a;->readTimeout:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRetryOnConnectionFailure$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/e0$a;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRouteDatabase$okhttp()Lokhttp3/internal/connection/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSocketFactory$okhttp()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSslSocketFactoryOrNull$okhttp()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWriteTimeout$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/e0$a;->writeTimeout:I

    .line 2
    .line 3
    return v0
.end method

.method public final getX509TrustManagerOrNull$okhttp()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "hostnameVerifier"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    .line 19
    return-object p0
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
    iget-object v0, p0, Lokhttp3/e0$a;->interceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final minWebSocketMessageToCompress(J)Lokhttp3/e0$a;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lokhttp3/e0$a;->minWebSocketMessageToCompress:J

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "minWebSocketMessageToCompress must be positive: "

    .line 11
    .line 12
    invoke-static {v0, p1, p2}, La1/a1;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p2
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
    iget-object v0, p0, Lokhttp3/e0$a;->networkInterceptors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final pingInterval(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    const-string v0, "interval"

    invoke-static {v0, p1, p2, p3}, Lq7/c;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lokhttp3/e0$a;->pingInterval:I

    return-object p0
.end method

.method public final pingInterval(Lj$/time/Duration;)Lokhttp3/e0$a;
    .locals 2
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    const-string v0, "duration"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lj$/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lokhttp3/e0$a;->pingInterval(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    return-object p0
.end method

.method public final protocols(Ljava/util/List;)Lokhttp3/e0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/f0;",
            ">;)",
            "Lokhttp3/e0$a;"
        }
    .end annotation

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lm6/h;->M0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lokhttp3/f0;->H2_PRIOR_KNOWLEDGE:Lokhttp3/f0;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Lokhttp3/f0;->HTTP_1_1:Lokhttp3/f0;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x1

    .line 62
    if-gt v0, v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_3
    :goto_1
    sget-object v0, Lokhttp3/f0;->HTTP_1_0:Lokhttp3/f0;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_6

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_5

    .line 103
    .line 104
    sget-object v1, Lokhttp3/f0;->SPDY_3:Lokhttp3/f0;

    .line 105
    .line 106
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 118
    .line 119
    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-string v0, "unmodifiableList(protocolsCopy)"

    .line 124
    .line 125
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 132
    .line 133
    const-string v0, "protocols must not contain null"

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v1, "protocols must not contain http/1.0: "

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0
.end method

.method public final proxy(Ljava/net/Proxy;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->proxy:Ljava/net/Proxy;

    .line 13
    .line 14
    return-object p0
.end method

.method public final proxyAuthenticator(Lokhttp3/c;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "proxyAuthenticator"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 18
    .line 19
    return-object p0
.end method

.method public final proxySelector(Ljava/net/ProxySelector;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "proxySelector"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a;->proxySelector:Ljava/net/ProxySelector;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->proxySelector:Ljava/net/ProxySelector;

    .line 18
    .line 19
    return-object p0
.end method

.method public final readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lq7/c;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lokhttp3/e0$a;->readTimeout:I

    return-object p0
.end method

.method public final readTimeout(Lj$/time/Duration;)Lokhttp3/e0$a;
    .locals 2
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    const-string v0, "duration"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lj$/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lokhttp3/e0$a;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    return-object p0
.end method

.method public final retryOnConnectionFailure(Z)Lokhttp3/e0$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAuthenticator$okhttp(Lokhttp3/c;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->authenticator:Lokhttp3/c;

    .line 7
    .line 8
    return-void
.end method

.method public final setCache$okhttp(Lokhttp3/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-void
.end method

.method public final setCallTimeout$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/e0$a;->callTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public final setCertificateChainCleaner$okhttp(Lu7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->certificateChainCleaner:Lu7/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setCertificatePinner$okhttp(Lokhttp3/i;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->certificatePinner:Lokhttp3/i;

    .line 7
    .line 8
    return-void
.end method

.method public final setConnectTimeout$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/e0$a;->connectTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public final setConnectionPool$okhttp(Lokhttp3/m;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->connectionPool:Lokhttp3/m;

    .line 7
    .line 8
    return-void
.end method

.method public final setConnectionSpecs$okhttp(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lokhttp3/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->connectionSpecs:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setCookieJar$okhttp(Lokhttp3/q;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->cookieJar:Lokhttp3/q;

    .line 7
    .line 8
    return-void
.end method

.method public final setDispatcher$okhttp(Lokhttp3/s;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->dispatcher:Lokhttp3/s;

    .line 7
    .line 8
    return-void
.end method

.method public final setDns$okhttp(Lokhttp3/u;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->dns:Lokhttp3/u;

    .line 7
    .line 8
    return-void
.end method

.method public final setEventListenerFactory$okhttp(Lokhttp3/w;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->eventListenerFactory:Lokhttp3/w;

    .line 7
    .line 8
    return-void
.end method

.method public final setFollowRedirects$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->followRedirects:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFollowSslRedirects$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->followSslRedirects:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHostnameVerifier$okhttp(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 7
    .line 8
    return-void
.end method

.method public final setMinWebSocketMessageToCompress$okhttp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/e0$a;->minWebSocketMessageToCompress:J

    .line 2
    .line 3
    return-void
.end method

.method public final setPingInterval$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/e0$a;->pingInterval:I

    .line 2
    .line 3
    return-void
.end method

.method public final setProtocols$okhttp(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/f0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->protocols:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setProxy$okhttp(Ljava/net/Proxy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    return-void
.end method

.method public final setProxyAuthenticator$okhttp(Lokhttp3/c;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->proxyAuthenticator:Lokhttp3/c;

    .line 7
    .line 8
    return-void
.end method

.method public final setProxySelector$okhttp(Ljava/net/ProxySelector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->proxySelector:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-void
.end method

.method public final setReadTimeout$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/e0$a;->readTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRetryOnConnectionFailure$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/e0$a;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRouteDatabase$okhttp(Lokhttp3/internal/connection/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    return-void
.end method

.method public final setSocketFactory$okhttp(Ljavax/net/SocketFactory;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 7
    .line 8
    return-void
.end method

.method public final setSslSocketFactoryOrNull$okhttp(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-void
.end method

.method public final setWriteTimeout$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/e0$a;->writeTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public final setX509TrustManagerOrNull$okhttp(Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-void
.end method

.method public final socketFactory(Ljavax/net/SocketFactory;)Lokhttp3/e0$a;
    .locals 1

    .line 1
    const-string v0, "socketFactory"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljavax/net/ssl/SSLSocketFactory;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->socketFactory:Ljavax/net/SocketFactory;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v0, "socketFactory instanceof SSLSocketFactory"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public final sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/e0$a;
    .locals 4

    const-string v0, "sslSocketFactory"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    iget-object v0, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 4
    :cond_0
    iput-object p1, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 5
    sget-object v0, Ls7/h;->Companion:Ls7/h$a;

    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls7/h;->trustManager(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    if-eqz v1, :cond_1

    iput-object v1, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 6
    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object p1

    iget-object v0, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ls7/h;->buildCertificateChainCleaner(Ljavax/net/ssl/X509TrustManager;)Lu7/c;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/e0$a;->certificateChainCleaner:Lu7/c;

    return-object p0

    .line 7
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to extract the trust manager on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sslSocketFactory is "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 10
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "sslSocketFactory"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "trustManager"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    iget-object v0, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lokhttp3/e0$a;->routeDatabase:Lokhttp3/internal/connection/i;

    .line 17
    :cond_1
    iput-object p1, p0, Lokhttp3/e0$a;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 18
    sget-object p1, Lu7/c;->Companion:Lu7/c$a;

    invoke-virtual {p1, p2}, Lu7/c$a;->get(Ljavax/net/ssl/X509TrustManager;)Lu7/c;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/e0$a;->certificateChainCleaner:Lu7/c;

    .line 19
    iput-object p2, p0, Lokhttp3/e0$a;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    return-object p0
.end method

.method public final writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lq7/c;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lokhttp3/e0$a;->writeTimeout:I

    return-object p0
.end method

.method public final writeTimeout(Lj$/time/Duration;)Lokhttp3/e0$a;
    .locals 2
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    const-string v0, "duration"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Lj$/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Lokhttp3/e0$a;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/e0$a;

    return-object p0
.end method
