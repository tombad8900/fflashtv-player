.class public final Lu3/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lu3/d;


# virtual methods
.method public final a(Lt3/a;Lr3/l;)Lu3/e;
    .locals 1

    .line 1
    new-instance v0, Lu3/c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lu3/c;-><init>(Lt3/a;Lr3/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lu3/b;

    .line 2
    .line 3
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const-class v0, Lu3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
