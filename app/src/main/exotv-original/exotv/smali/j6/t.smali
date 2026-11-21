.class public final Lj6/t;
.super Lj6/n;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lj6/g;


# virtual methods
.method public final isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/n;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Lj6/a;

    .line 4
    .line 5
    return v0
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lj6/n;->p:Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lj6/n;->o:Lcom/bumptech/glide/d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p0, v1, p1}, Lcom/bumptech/glide/d;->j(Lj6/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lj6/n;->d(Lj6/n;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final k(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    new-instance v0, Lj6/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lj6/c;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lj6/n;->o:Lcom/bumptech/glide/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, p0, v1, v0}, Lcom/bumptech/glide/d;->j(Lj6/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lj6/n;->d(Lj6/n;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method
