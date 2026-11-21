.class public abstract Landroidx/lifecycle/m0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/s0;


# static fields
.field public static final a:Ly5/f;

.field public static final b:Ly5/f;

.field public static final c:Ly5/f;

.field public static final d:Ly5/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly5/f;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Ly5/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/lifecycle/m0;->a:Ly5/f;

    .line 8
    .line 9
    new-instance v0, Ly5/f;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ly5/f;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Landroidx/lifecycle/m0;->b:Ly5/f;

    .line 17
    .line 18
    new-instance v0, Ly5/f;

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    invoke-direct {v0, v1}, Ly5/f;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Landroidx/lifecycle/m0;->c:Ly5/f;

    .line 25
    .line 26
    new-instance v0, Ly5/f;

    .line 27
    .line 28
    const/16 v1, 0x9

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ly5/f;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Landroidx/lifecycle/m0;->d:Ly5/f;

    .line 34
    .line 35
    return-void
.end method

.method public static final c(Landroidx/lifecycle/r0;La3/e;Landroidx/lifecycle/o;)V
    .locals 1

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "lifecycle"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "androidx.lifecycle.savedstate.vm.tag"

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/lifecycle/r0;->a:Le1/a;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Le1/a;->a:Le1/b;

    .line 18
    .line 19
    monitor-enter p2

    .line 20
    :try_start_0
    iget-object p0, p0, Le1/a;->b:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p2

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit p2

    .line 32
    throw p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    check-cast p0, Landroidx/lifecycle/k0;

    .line 35
    .line 36
    return-void
.end method

.method public static final d(La3/f;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/lifecycle/n;->k:Landroidx/lifecycle/n;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/n;->l:Landroidx/lifecycle/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Failed requirement."

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, La3/f;->c()La3/e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La3/e;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lo/f;

    .line 33
    .line 34
    invoke-virtual {v0}, Lo/f;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_2
    move-object v1, v0

    .line 39
    check-cast v1, Lo/b;

    .line 40
    .line 41
    invoke-virtual {v1}, Lo/b;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1}, Lo/b;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;

    .line 52
    .line 53
    const-string v2, "components"

    .line 54
    .line 55
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La3/d;

    .line 69
    .line 70
    const-string v3, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 71
    .line 72
    invoke-static {v2, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 v1, 0x0

    .line 80
    :goto_1
    if-nez v1, :cond_4

    .line 81
    .line 82
    new-instance v0, Landroidx/lifecycle/o0;

    .line 83
    .line 84
    invoke-interface {p0}, La3/f;->c()La3/e;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v2, p0

    .line 89
    check-cast v2, Landroidx/lifecycle/u0;

    .line 90
    .line 91
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/o0;-><init>(La3/e;Landroidx/lifecycle/u0;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0}, La3/f;->c()La3/e;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 99
    .line 100
    invoke-virtual {v1, v2, v0}, La3/e;->e(Ljava/lang/String;La3/d;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    new-instance v1, La3/b;

    .line 108
    .line 109
    const/4 v2, 0x3

    .line 110
    invoke-direct {v1, v2, v0}, La3/b;-><init>(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method public static final e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/lifecycle/q;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    new-instance v1, Landroidx/lifecycle/q;

    .line 27
    .line 28
    new-instance v2, Li7/f1;

    .line 29
    .line 30
    invoke-direct {v2}, Li7/u0;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v3, Li7/e0;->a:Lo7/e;

    .line 34
    .line 35
    sget-object v3, Lm7/n;->a:Lj7/d;

    .line 36
    .line 37
    iget-object v3, v3, Lj7/d;->n:Lj7/d;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->W(Lp6/f;Lp6/h;)Lp6/h;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, p0, v2}, Landroidx/lifecycle/q;-><init>(Landroidx/lifecycle/o;Lp6/h;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    sget-object p0, Li7/e0;->a:Lo7/e;

    .line 54
    .line 55
    sget-object p0, Lm7/n;->a:Lj7/d;

    .line 56
    .line 57
    iget-object p0, p0, Lj7/d;->n:Lj7/d;

    .line 58
    .line 59
    new-instance v0, Landroidx/lifecycle/p;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v0, v1, v2, v3}, Landroidx/lifecycle/p;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    invoke-static {v1, p0, v0, v2}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    goto :goto_0
.end method

.method public static final f(Landroidx/lifecycle/u0;)Landroidx/lifecycle/p0;
    .locals 3

    .line 1
    new-instance v0, Landroidx/lifecycle/l0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroidx/lifecycle/u0;->b()Landroidx/lifecycle/t0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, p0, Landroidx/lifecycle/i;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroidx/lifecycle/i;

    .line 15
    .line 16
    invoke-interface {p0}, Landroidx/lifecycle/i;->a()Ld1/b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p0, Ld1/a;->k:Ld1/a;

    .line 22
    .line 23
    :goto_0
    const-string v2, "store"

    .line 24
    .line 25
    invoke-static {v2, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "defaultCreationExtras"

    .line 29
    .line 30
    invoke-static {v2, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La4/c;

    .line 34
    .line 35
    invoke-direct {v2, v1, v0, p0}, La4/c;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;Landroidx/lifecycle/o;)V

    .line 36
    .line 37
    .line 38
    const-class p0, Landroidx/lifecycle/p0;

    .line 39
    .line 40
    invoke-static {p0}, Lz6/o;->a(Ljava/lang/Class;)Lz6/d;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 45
    .line 46
    invoke-virtual {v2, p0, v0}, La4/c;->B(Lz6/d;Ljava/lang/String;)Landroidx/lifecycle/r0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroidx/lifecycle/p0;

    .line 51
    .line 52
    return-object p0
.end method
