.class public final Ls3/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ls3/i;


# virtual methods
.method public final a(Lh3/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Ls3/h;->c:Ls3/h;

    .line 2
    .line 3
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of p1, p1, Ls3/e;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object p1, Ls3/h;->c:Ls3/h;

    .line 9
    .line 10
    invoke-virtual {p1, p1}, Ls3/h;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    sget-object v0, Ls3/h;->c:Ls3/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls3/h;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
