.class public final Ll1/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lk1/g;


# instance fields
.field public j:Lk1/g;


# virtual methods
.method public final l()Lk1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/b;->j:Lk1/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lk1/g;->l()Lk1/h;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    throw v0
.end method
