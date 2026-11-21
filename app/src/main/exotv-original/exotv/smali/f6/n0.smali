.class public abstract Lf6/n0;
.super Lf6/s;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lf6/b1;
.implements Ljava/io/Serializable;


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/q;->j:Ljava/util/Collection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf6/t0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lf6/t0;-><init>(Lf6/n0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf6/q;->j:Ljava/util/Collection;

    .line 11
    .line 12
    :cond_0
    check-cast v0, Lf6/h0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1}, Lf6/q;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final e(Ljava/lang/Object;)Lf6/m0;
    .locals 1

    .line 1
    sget-object v0, Lf6/q1;->p:Lf6/q1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf6/q1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf6/m0;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 12
    .line 13
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 14
    .line 15
    :cond_0
    return-object p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lf6/n0;->e(Ljava/lang/Object;)Lf6/m0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lf6/n0;->e(Ljava/lang/Object;)Lf6/m0;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final size()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/q;->l:Ljava/util/Collection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf6/u0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lf6/u0;-><init>(Lf6/n0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf6/q;->l:Ljava/util/Collection;

    .line 11
    .line 12
    :cond_0
    check-cast v0, Lf6/h0;

    .line 13
    .line 14
    return-object v0
.end method
