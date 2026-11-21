.class public final Ln4/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln4/g;
.implements Landroidx/lifecycle/u;


# instance fields
.field public final j:Ljava/util/HashSet;

.field public final k:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Ln4/h;->k:Landroidx/lifecycle/o;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ln4/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln4/h;->k:Landroidx/lifecycle/o;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ln4/i;->d()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Landroidx/lifecycle/n;->m:Landroidx/lifecycle/n;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ltz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Ln4/i;->k()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-interface {p1}, Ln4/i;->f()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final l(Ln4/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/v;)V
    .locals 4
    .annotation runtime Landroidx/lifecycle/b0;
        value = .enum Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;
    .end annotation

    .line 1
    iget-object v0, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {v0}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Ln4/i;

    .line 21
    .line 22
    invoke-interface {v3}, Ln4/i;->d()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onStart(Landroidx/lifecycle/v;)V
    .locals 3
    .annotation runtime Landroidx/lifecycle/b0;
        value = .enum Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;
    .end annotation

    .line 1
    iget-object p1, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p1}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Ln4/i;

    .line 21
    .line 22
    invoke-interface {v2}, Ln4/i;->k()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public onStop(Landroidx/lifecycle/v;)V
    .locals 3
    .annotation runtime Landroidx/lifecycle/b0;
        value = .enum Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;
    .end annotation

    .line 1
    iget-object p1, p0, Ln4/h;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p1}, Lu4/m;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Ln4/i;

    .line 21
    .line 22
    invoke-interface {v2}, Ln4/i;->f()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
