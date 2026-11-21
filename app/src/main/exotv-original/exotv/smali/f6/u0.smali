.class public final Lf6/u0;
.super Lf6/h0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final transient k:Lf6/n0;


# direct methods
.method public constructor <init>(Lf6/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/u0;->k:Lf6/n0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(I[Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/u0;->k:Lf6/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lf6/q1;->p:Lf6/q1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lf6/q0;->d()Lf6/h0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lf6/m0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lf6/m0;->l(I)Lf6/k0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-virtual {v0}, Lf6/a;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lf6/a;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lf6/h0;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Lf6/h0;->b(I[Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/u0;->k:Lf6/n0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf6/n0;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g()Lf6/z1;
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/u0;->k:Lf6/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf6/s0;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lf6/s0;-><init>(Lf6/n0;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/u0;->k:Lf6/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method
