.class public abstract Lp6/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lp6/f;


# instance fields
.field public final j:Lp6/g;


# direct methods
.method public constructor <init>(Lp6/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/a;->j:Lp6/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Lp6/g;)Lp6/f;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lp6/a;->getKey()Lp6/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public final c(Lp6/h;)Lp6/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/bumptech/glide/c;->W(Lp6/f;Lp6/h;)Lp6/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lp6/g;)Lp6/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/bumptech/glide/c;->T(Lp6/f;Lp6/g;)Lp6/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Lp6/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/a;->j:Lp6/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ly6/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
