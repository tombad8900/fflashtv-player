.class public final Lm7/f;
.super Li7/d0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lr6/d;
.implements Lp6/c;


# static fields
.field public static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public final m:Li7/r;

.field public final n:Lr6/c;

.field public o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_reusableCancellableContinuation$volatile"

    .line 4
    .line 5
    const-class v2, Lm7/f;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lm7/f;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Li7/r;Lr6/c;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0}, Li7/d0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lm7/f;->m:Li7/r;

    .line 6
    .line 7
    iput-object p2, p0, Lm7/f;->n:Lr6/c;

    .line 8
    .line 9
    sget-object p1, Lm7/a;->b:Lm7/s;

    .line 10
    .line 11
    iput-object p1, p0, Lm7/f;->o:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p2, Lr6/c;->k:Lp6/h;

    .line 14
    .line 15
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    sget-object v0, Lm7/a;->e:Li7/p;

    .line 24
    .line 25
    invoke-interface {p1, p2, v0}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lm7/f;->p:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Lr6/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/f;->n:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-static {p1}, Ll6/f;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move-object v2, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v2, Li7/o;

    .line 11
    .line 12
    invoke-direct {v2, v0, v1}, Li7/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lm7/f;->n:Lr6/c;

    .line 16
    .line 17
    iget-object v3, v0, Lr6/c;->k:Lp6/h;

    .line 18
    .line 19
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lm7/f;->m:Li7/r;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Li7/r;->E(Lp6/h;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    iput-object v2, p0, Lm7/f;->o:Ljava/lang/Object;

    .line 31
    .line 32
    iput v1, p0, Li7/d0;->l:I

    .line 33
    .line 34
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3, p0}, Li7/r;->D(Lp6/h;Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-static {}, Li7/h1;->a()Li7/m0;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-wide v5, v4, Li7/m0;->l:J

    .line 46
    .line 47
    const-wide v7, 0x100000000L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v5, v5, v7

    .line 53
    .line 54
    if-ltz v5, :cond_3

    .line 55
    .line 56
    iput-object v2, p0, Lm7/f;->o:Ljava/lang/Object;

    .line 57
    .line 58
    iput v1, p0, Li7/d0;->l:I

    .line 59
    .line 60
    iget-object p1, v4, Li7/m0;->n:Lm6/f;

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    new-instance p1, Lm6/f;

    .line 65
    .line 66
    invoke-direct {p1}, Lm6/f;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, v4, Li7/m0;->n:Lm6/f;

    .line 70
    .line 71
    :cond_2
    invoke-virtual {p1, p0}, Lm6/f;->addLast(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    const/4 v1, 0x1

    .line 76
    invoke-virtual {v4, v1}, Li7/m0;->I(Z)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lm7/f;->p:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {v3, v1}, Lm7/a;->i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :try_start_1
    invoke-virtual {v0, p1}, Lr6/a;->d(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    :try_start_2
    invoke-static {v3, v1}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {v4}, Li7/m0;->J()Z

    .line 95
    .line 96
    .line 97
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    :goto_1
    invoke-virtual {v4}, Li7/m0;->G()V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto :goto_2

    .line 106
    :catchall_1
    move-exception p1

    .line 107
    :try_start_3
    invoke-static {v3, v1}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    :goto_2
    :try_start_4
    invoke-virtual {p0, p1}, Li7/d0;->l(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :goto_3
    return-void

    .line 116
    :catchall_2
    move-exception p1

    .line 117
    invoke-virtual {v4}, Li7/m0;->G()V

    .line 118
    .line 119
    .line 120
    throw p1
.end method

.method public final f()Lp6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/f;->n:Lr6/c;

    .line 2
    .line 3
    iget-object v0, v0, Lr6/c;->k:Lp6/h;

    .line 4
    .line 5
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g()Lp6/c;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final m()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/f;->o:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lm7/a;->b:Lm7/s;

    .line 4
    .line 5
    iput-object v1, p0, Lm7/f;->o:Ljava/lang/Object;

    .line 6
    .line 7
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DispatchedContinuation["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lm7/f;->m:Li7/r;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lm7/f;->n:Lr6/c;

    .line 19
    .line 20
    invoke-static {v1}, Li7/x;->o(Lp6/c;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x5d

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
