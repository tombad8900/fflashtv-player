.class public final Lokhttp3/i$d;
.super Lz6/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/i;->check(Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $hostname:Ljava/lang/String;

.field final synthetic $peerCertificates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lokhttp3/i;


# direct methods
.method public constructor <init>(Lokhttp3/i;Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/i;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/i$d;->this$0:Lokhttp3/i;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/i$d;->$peerCertificates:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lokhttp3/i$d;->$hostname:Ljava/lang/String;

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
    invoke-virtual {p0}, Lokhttp3/i$d;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lokhttp3/i$d;->this$0:Lokhttp3/i;

    invoke-virtual {v0}, Lokhttp3/i;->getCertificateChainCleaner$okhttp()Lu7/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lokhttp3/i$d;->$peerCertificates:Ljava/util/List;

    iget-object v2, p0, Lokhttp3/i$d;->$hostname:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lu7/c;->clean(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lokhttp3/i$d;->$peerCertificates:Ljava/util/List;

    .line 3
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 5
    check-cast v2, Ljava/security/cert/Certificate;

    .line 6
    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v3, v2}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 7
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
