.class public abstract Li7/a;
.super Li7/a1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lp6/c;
.implements Li7/u;


# instance fields
.field public final l:Lp6/h;


# direct methods
.method public constructor <init>(Lp6/h;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Li7/a1;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Li7/s;->k:Li7/s;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Li7/s0;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Li7/a1;->C(Li7/s0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Li7/a;->l:Lp6/h;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final B(La1/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li7/a;->l:Lp6/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, Li7/x;->i(Lp6/h;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final L(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Li7/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Li7/o;

    .line 6
    .line 7
    sget-object v0, Li7/o;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final T(Li7/v;Li7/a;Ly6/p;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 6
    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    :try_start_0
    iget-object p1, p0, Li7/a;->l:Lp6/h;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lm7/a;->i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    invoke-static {p3}, Lz6/q;->b(Ly6/p;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3, p2, p0}, Ly6/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    :try_start_2
    invoke-static {p1, v0}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    sget-object p1, Lq6/a;->j:Lq6/a;

    .line 36
    .line 37
    if-eq p2, p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Li7/a;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception p2

    .line 46
    :try_start_3
    invoke-static {p1, v0}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :goto_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Li7/a;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    new-instance p1, La1/u;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_1
    check-cast p3, Lr6/a;

    .line 65
    .line 66
    invoke-virtual {p3, p2, p0}, Lr6/a;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1, v0}, Lp6/c;->d(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    :cond_3
    :try_start_4
    check-cast p3, Lr6/a;

    .line 79
    .line 80
    invoke-virtual {p3, p2, p0}, Lr6/a;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v0, p1}, Lm7/a;->f(Ljava/lang/Object;Lp6/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_2
    move-exception p1

    .line 93
    invoke-static {p1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p0, p2}, Li7/a;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ll6/f;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Li7/o;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Li7/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Li7/a1;->H(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Li7/x;->e:Lm7/s;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Li7/a;->l(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final f()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Li7/a;->l:Lp6/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Li7/a;->l:Lp6/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
