.class public final Lc7/d;
.super Lc7/e;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    sget-object v0, Lc7/e;->k:Lc7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc7/a;->d()Ljava/util/Random;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final b()J
    .locals 2

    .line 1
    sget-object v0, Lc7/e;->k:Lc7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc7/a;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    sget-object v0, Lc7/e;->k:Lc7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc7/e;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
