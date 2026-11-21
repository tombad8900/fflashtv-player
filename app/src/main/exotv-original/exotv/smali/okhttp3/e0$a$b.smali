.class public final Lokhttp3/e0$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/e0$a;->-addNetworkInterceptor(Ly6/l;)Lokhttp3/e0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $block:Ly6/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly6/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/e0$a$b;->$block:Ly6/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/a0;)Lokhttp3/i0;
    .locals 1

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/e0$a$b;->$block:Ly6/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ly6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lokhttp3/i0;

    .line 13
    .line 14
    return-object p1
.end method
