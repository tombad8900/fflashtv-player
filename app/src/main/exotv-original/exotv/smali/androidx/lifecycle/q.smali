.class public final Landroidx/lifecycle/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/t;
.implements Li7/u;


# instance fields
.field public final j:Landroidx/lifecycle/o;

.field public final k:Lp6/h;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;Lp6/h;)V
    .locals 2

    .line 1
    const-string v0, "coroutineContext"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/lifecycle/q;->j:Landroidx/lifecycle/o;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/lifecycle/q;->k:Lp6/h;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    sget-object p1, Li7/s;->k:Li7/s;

    .line 22
    .line 23
    invoke-interface {p2, p1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Li7/s0;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    check-cast p1, Li7/a1;

    .line 32
    .line 33
    new-instance p2, Li7/t0;

    .line 34
    .line 35
    invoke-virtual {p1}, Li7/a1;->o()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {p2, v0, v1, p1}, Li7/t0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Li7/a1;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/q;->j:Landroidx/lifecycle/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget-object v0, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-gtz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/lifecycle/q;->k:Lp6/h;

    .line 19
    .line 20
    sget-object p2, Li7/s;->k:Li7/s;

    .line 21
    .line 22
    invoke-interface {p1, p2}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Li7/s0;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    check-cast p1, Li7/a1;

    .line 31
    .line 32
    new-instance p2, Li7/t0;

    .line 33
    .line 34
    invoke-virtual {p1}, Li7/a1;->o()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {p2, v0, v1, p1}, Li7/t0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Li7/a1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final h()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/q;->k:Lp6/h;

    .line 2
    .line 3
    return-object v0
.end method
