.class public final Lokhttp3/internal/connection/f$b;
.super Lz6/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/f;->connectTls(Lokhttp3/internal/connection/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $address:Lokhttp3/a;

.field final synthetic $certificatePinner:Lokhttp3/i;

.field final synthetic $unverifiedHandshake:Lokhttp3/x;


# direct methods
.method public constructor <init>(Lokhttp3/i;Lokhttp3/x;Lokhttp3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/connection/f$b;->$certificatePinner:Lokhttp3/i;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/internal/connection/f$b;->$unverifiedHandshake:Lokhttp3/x;

    .line 4
    .line 5
    iput-object p3, p0, Lokhttp3/internal/connection/f$b;->$address:Lokhttp3/a;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lz6/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/f$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/f$b;->$certificatePinner:Lokhttp3/i;

    invoke-virtual {v0}, Lokhttp3/i;->getCertificateChainCleaner$okhttp()Lu7/c;

    move-result-object v0

    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lokhttp3/internal/connection/f$b;->$unverifiedHandshake:Lokhttp3/x;

    invoke-virtual {v1}, Lokhttp3/x;->peerCertificates()Ljava/util/List;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lokhttp3/internal/connection/f$b;->$address:Lokhttp3/a;

    invoke-virtual {v2}, Lokhttp3/a;->url()Lokhttp3/z;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/z;->host()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v1, v2}, Lu7/c;->clean(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
