.class public final Li7/m;
.super Li7/a1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li7/l;


# virtual methods
.method public final T(Lr6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    sget-object v0, Li7/a1;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Li7/p0;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    instance-of p1, v0, Li7/o;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Li7/x;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    check-cast v0, Li7/o;

    .line 21
    .line 22
    iget-object p1, v0, Li7/o;->a:Ljava/lang/Throwable;

    .line 23
    .line 24
    throw p1

    .line 25
    :cond_2
    invoke-virtual {p0, v0}, Li7/a1;->P(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Li7/x0;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1, p0}, Li7/x0;-><init>(Lp6/c;Li7/m;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Li7/g;->v()V

    .line 41
    .line 42
    .line 43
    new-instance p1, Li7/i;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-direct {p1, v1, v0}, Li7/i;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-static {p0, v1, p1}, Li7/x;->j(Li7/s0;ZLi7/w0;)Li7/f0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v2, Li7/d;

    .line 55
    .line 56
    invoke-direct {v2, v1, p1}, Li7/d;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Li7/g;->y(Li7/d1;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Li7/g;->u()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 67
    .line 68
    :goto_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 69
    .line 70
    return-object p1
.end method
