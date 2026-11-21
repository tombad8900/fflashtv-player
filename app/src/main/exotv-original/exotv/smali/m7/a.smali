.class public abstract Lm7/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lm7/s;

.field public static final b:Lm7/s;

.field public static final c:Lm7/s;

.field public static final d:Lm7/s;

.field public static final e:Li7/p;

.field public static final f:Li7/p;

.field public static final g:Li7/p;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm7/s;

    .line 2
    .line 3
    const-string v1, "CLOSED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lm7/a;->a:Lm7/s;

    .line 10
    .line 11
    new-instance v0, Lm7/s;

    .line 12
    .line 13
    const-string v1, "UNDEFINED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lm7/a;->b:Lm7/s;

    .line 19
    .line 20
    new-instance v0, Lm7/s;

    .line 21
    .line 22
    const-string v1, "REUSABLE_CLAIMED"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lm7/a;->c:Lm7/s;

    .line 28
    .line 29
    new-instance v0, Lm7/s;

    .line 30
    .line 31
    const-string v1, "NO_THREAD_ELEMENTS"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lm7/a;->d:Lm7/s;

    .line 37
    .line 38
    new-instance v0, Li7/p;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    invoke-direct {v0, v1}, Li7/p;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lm7/a;->e:Li7/p;

    .line 45
    .line 46
    new-instance v0, Li7/p;

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    invoke-direct {v0, v1}, Li7/p;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lm7/a;->f:Li7/p;

    .line 53
    .line 54
    new-instance v0, Li7/p;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    invoke-direct {v0, v1}, Li7/p;-><init>(I)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lm7/a;->g:Li7/p;

    .line 61
    .line 62
    return-void
.end method

.method public static final a(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    .line 6
    .line 7
    invoke-static {p0, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static final b(Lp7/j;JLy6/p;)Ljava/lang/Object;
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p0, Lm7/r;->c:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lm7/r;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    :goto_1
    sget-object v0, Lm7/b;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lm7/a;->a:Lm7/s;

    .line 22
    .line 23
    if-ne v1, v2, :cond_2

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_2
    check-cast v1, Lm7/b;

    .line 27
    .line 28
    check-cast v1, Lm7/r;

    .line 29
    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    :cond_3
    :goto_2
    move-object p0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-wide v1, p0, Lm7/r;->c:J

    .line 35
    .line 36
    const-wide/16 v3, 0x1

    .line 37
    .line 38
    add-long/2addr v1, v3

    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p3, v1, p0}, Ly6/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lm7/r;

    .line 48
    .line 49
    :cond_5
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_6

    .line 55
    .line 56
    invoke-virtual {p0}, Lm7/r;->a()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Lm7/b;->b()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    goto :goto_0
.end method

.method public static final c(Ljava/lang/Object;)Lm7/r;
    .locals 1

    .line 1
    sget-object v0, Lm7/a;->a:Lm7/s;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lm7/r;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Does not contain segment"

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public static final d(Lp6/h;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Lm7/d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Li7/t;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p1}, Li7/t;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    new-instance v0, Lm7/e;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lm7/e;-><init>(Lp6/h;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static final e(Lp6/h;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lm7/a;->d:Lm7/s;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Lm7/v;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    check-cast p1, Lm7/v;

    .line 12
    .line 13
    iget-object p0, p1, Lm7/v;->b:[Li7/g1;

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    if-gez v0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    aget-object p0, p0, v0

    .line 22
    .line 23
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p1, Lm7/v;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object p0, p0, v0

    .line 29
    .line 30
    throw v1

    .line 31
    :cond_2
    sget-object p1, Lm7/a;->f:Li7/p;

    .line 32
    .line 33
    invoke-interface {p0, v1, p1}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 38
    .line 39
    invoke-static {p1, p0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, La1/a1;->r(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public static final f(Ljava/lang/Object;Lp6/c;)V
    .locals 10

    .line 1
    instance-of v0, p1, Lm7/f;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    check-cast p1, Lm7/f;

    .line 6
    .line 7
    iget-object v0, p1, Lm7/f;->m:Li7/r;

    .line 8
    .line 9
    iget-object v1, p1, Lm7/f;->n:Lr6/c;

    .line 10
    .line 11
    iget-object v2, v1, Lr6/c;->k:Lp6/h;

    .line 12
    .line 13
    invoke-static {p0}, Ll6/f;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    move-object v4, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v4, Li7/o;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v4, v3, v5}, Li7/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Li7/r;->E(Lp6/h;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    iput-object v4, p1, Lm7/f;->o:Ljava/lang/Object;

    .line 38
    .line 39
    iput v5, p1, Li7/d0;->l:I

    .line 40
    .line 41
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, p1}, Li7/r;->D(Lp6/h;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {}, Li7/h1;->a()Li7/m0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v6, v0, Li7/m0;->l:J

    .line 53
    .line 54
    const-wide v8, 0x100000000L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v3, v6, v8

    .line 60
    .line 61
    if-ltz v3, :cond_3

    .line 62
    .line 63
    iput-object v4, p1, Lm7/f;->o:Ljava/lang/Object;

    .line 64
    .line 65
    iput v5, p1, Li7/d0;->l:I

    .line 66
    .line 67
    iget-object p0, v0, Li7/m0;->n:Lm6/f;

    .line 68
    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    new-instance p0, Lm6/f;

    .line 72
    .line 73
    invoke-direct {p0}, Lm6/f;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p0, v0, Li7/m0;->n:Lm6/f;

    .line 77
    .line 78
    :cond_2
    invoke-virtual {p0, p1}, Lm6/f;->addLast(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_3
    invoke-virtual {v0, v5}, Li7/m0;->I(Z)V

    .line 83
    .line 84
    .line 85
    :try_start_0
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v3, Li7/s;->k:Li7/s;

    .line 89
    .line 90
    invoke-interface {v2, v3}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Li7/s0;

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    invoke-interface {v3}, Li7/s0;->isActive()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    check-cast v3, Li7/a1;

    .line 105
    .line 106
    invoke-virtual {v3}, Li7/a1;->v()Ljava/util/concurrent/CancellationException;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p1, p0}, Lm7/f;->d(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception p0

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    iget-object v3, p1, Lm7/f;->p:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v3}, Lm7/a;->i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    sget-object v4, Lm7/a;->d:Lm7/s;

    .line 130
    .line 131
    if-eq v3, v4, :cond_5

    .line 132
    .line 133
    invoke-static {v1, v2, v3}, Li7/x;->q(Lp6/c;Lp6/h;Ljava/lang/Object;)Li7/n1;

    .line 134
    .line 135
    .line 136
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    const/4 v4, 0x0

    .line 139
    :goto_1
    :try_start_1
    invoke-virtual {v1, p0}, Lr6/a;->d(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    :try_start_2
    invoke-virtual {v4}, Li7/n1;->U()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_7

    .line 149
    .line 150
    :cond_6
    invoke-static {v2, v3}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    :goto_2
    invoke-virtual {v0}, Li7/m0;->J()Z

    .line 154
    .line 155
    .line 156
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    if-nez p0, :cond_7

    .line 158
    .line 159
    :goto_3
    invoke-virtual {v0}, Li7/m0;->G()V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :catchall_1
    move-exception p0

    .line 164
    if-eqz v4, :cond_8

    .line 165
    .line 166
    :try_start_3
    invoke-virtual {v4}, Li7/n1;->U()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    :cond_8
    invoke-static {v2, v3}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    :goto_4
    :try_start_4
    invoke-virtual {p1, p0}, Li7/d0;->l(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :goto_5
    return-void

    .line 181
    :catchall_2
    move-exception p0

    .line 182
    invoke-virtual {v0}, Li7/m0;->G()V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :cond_a
    invoke-interface {p1, p0}, Lp6/c;->d(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public static final g(Ljava/lang/String;JJJ)J
    .locals 4

    .line 1
    sget v0, Lm7/t;->a:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide p1

    .line 12
    :cond_0
    invoke-static {v0}, Lh7/o;->l0(Ljava/lang/String;)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0x27

    .line 17
    .line 18
    const-string v1, "System property \'"

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long p1, p3, v2

    .line 27
    .line 28
    if-gtz p1, :cond_1

    .line 29
    .line 30
    cmp-long p1, v2, p5

    .line 31
    .line 32
    if-gtz p1, :cond_1

    .line 33
    .line 34
    return-wide v2

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, "\' should be in range "

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ".."

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ", but is \'"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance p3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p0, "\' has unrecognized value \'"

    .line 95
    .line 96
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method

.method public static h(Ljava/lang/String;II)I
    .locals 7

    .line 1
    and-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const p2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p2, 0x1ffffe

    .line 10
    .line 11
    .line 12
    :goto_0
    int-to-long v1, p1

    .line 13
    const/4 p1, 0x1

    .line 14
    int-to-long v3, p1

    .line 15
    int-to-long v5, p2

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v6}, Lm7/a;->g(Ljava/lang/String;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-int p0, p0

    .line 22
    return p0
.end method

.method public static final i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lm7/a;->e:Li7/p;

    .line 9
    .line 10
    invoke-interface {p0, v0, p1}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    sget-object p0, Lm7/a;->d:Lm7/s;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v0, Lm7/v;

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-direct {v0, p0, p1}, Lm7/v;-><init>(Lp6/h;I)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lm7/a;->g:Li7/p;

    .line 38
    .line 39
    invoke-interface {p0, v0, p1}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-static {p1}, La1/a1;->r(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0
.end method
