.class public final Lu7/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, Lu7/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Ljavax/net/ssl/X509TrustManager;)Lu7/c;
    .locals 1

    const-string v0, "trustManager"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    sget-object v0, Ls7/h;->Companion:Ls7/h$a;

    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls7/h;->buildCertificateChainCleaner(Ljavax/net/ssl/X509TrustManager;)Lu7/c;

    move-result-object p1

    return-object p1
.end method

.method public final varargs get([Ljava/security/cert/X509Certificate;)Lu7/c;
    .locals 3

    const-string v0, "caCerts"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lu7/a;

    new-instance v1, Lu7/b;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-direct {v1, p1}, Lu7/b;-><init>([Ljava/security/cert/X509Certificate;)V

    invoke-direct {v0, v1}, Lu7/a;-><init>(Lu7/e;)V

    return-object v0
.end method
