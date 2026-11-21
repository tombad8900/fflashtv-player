.class public final Lw4/u;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:I

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(ZLp6/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw4/u;->o:Z

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/u;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw4/u;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw4/u;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw4/u;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 1

    .line 1
    new-instance p1, Lw4/u;

    .line 2
    .line 3
    iget-boolean v0, p0, Lw4/u;->o:Z

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lw4/u;-><init>(ZLp6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lw4/u;->n:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lw4/u;->o:Z

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    sget-object p1, Lb5/l;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget-boolean p1, p0, Lw4/u;->o:Z

    .line 36
    .line 37
    iput v2, p0, Lw4/u;->n:I

    .line 38
    .line 39
    sget-object v2, Lb5/h;->a:Lb5/i;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 47
    .line 48
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 49
    .line 50
    new-instance v2, Lb5/g;

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    invoke-direct {v2, v3, v1}, Lr6/h;-><init>(ILp6/c;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v2, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_0
    if-ne v2, v0, :cond_4

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_4
    return-object v2
.end method
