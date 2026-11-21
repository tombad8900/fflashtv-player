.class public abstract Li7/x;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lm7/s;

.field public static final b:Lm7/s;

.field public static final c:Lm7/s;

.field public static final d:Lm7/s;

.field public static final e:Lm7/s;

.field public static final f:Lm7/s;

.field public static final g:Lm7/s;

.field public static final h:Lm7/s;

.field public static final i:Li7/g0;

.field public static final j:Li7/g0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm7/s;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Li7/x;->a:Lm7/s;

    .line 10
    .line 11
    new-instance v0, Lm7/s;

    .line 12
    .line 13
    const-string v1, "REMOVED_TASK"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Li7/x;->b:Lm7/s;

    .line 19
    .line 20
    new-instance v0, Lm7/s;

    .line 21
    .line 22
    const-string v1, "CLOSED_EMPTY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Li7/x;->c:Lm7/s;

    .line 28
    .line 29
    new-instance v0, Lm7/s;

    .line 30
    .line 31
    const-string v1, "COMPLETING_ALREADY"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Li7/x;->d:Lm7/s;

    .line 37
    .line 38
    new-instance v0, Lm7/s;

    .line 39
    .line 40
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Li7/x;->e:Lm7/s;

    .line 46
    .line 47
    new-instance v0, Lm7/s;

    .line 48
    .line 49
    const-string v1, "COMPLETING_RETRY"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Li7/x;->f:Lm7/s;

    .line 55
    .line 56
    new-instance v0, Lm7/s;

    .line 57
    .line 58
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Li7/x;->g:Lm7/s;

    .line 64
    .line 65
    new-instance v0, Lm7/s;

    .line 66
    .line 67
    const-string v1, "SEALED"

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Lm7/s;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Li7/x;->h:Lm7/s;

    .line 73
    .line 74
    new-instance v0, Li7/g0;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {v0, v1}, Li7/g0;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Li7/x;->i:Li7/g0;

    .line 81
    .line 82
    new-instance v0, Li7/g0;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-direct {v0, v1}, Li7/g0;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Li7/x;->j:Li7/g0;

    .line 89
    .line 90
    return-void
.end method

.method public static final a(Lp6/h;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lm7/c;

    .line 2
    .line 3
    sget-object v1, Li7/s;->k:Li7/s;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Li7/u0;

    .line 13
    .line 14
    invoke-direct {v1}, Li7/u0;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v1}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-direct {v0, p0}, Lm7/c;-><init>(Lp6/h;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static b(Li7/s0;)V
    .locals 3

    .line 1
    check-cast p0, Li7/a1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Li7/t0;

    .line 7
    .line 8
    invoke-virtual {p0}, Li7/a1;->o()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2, p0}, Li7/t0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Li7/a1;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static c(Lm7/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm7/c;->j:Lp6/h;

    .line 2
    .line 3
    sget-object v1, Li7/s;->k:Li7/s;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Li7/s0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast v0, Li7/a1;

    .line 14
    .line 15
    new-instance p0, Li7/t0;

    .line 16
    .line 17
    invoke-virtual {v0}, Li7/a1;->o()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {p0, v1, v2, v0}, Li7/t0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Li7/a1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Scope cannot be cancelled because it does not have a job: "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static final d(Lp6/h;Lp6/h;Z)Lp6/h;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Li7/p;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Li7/p;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, Li7/p;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v2}, Li7/p;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2, v1}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, p1}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, Li7/p;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, v1}, Li7/p;-><init>(I)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lp6/i;->j:Lp6/i;

    .line 51
    .line 52
    invoke-interface {p0, v1, v0}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lp6/h;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    check-cast p1, Lp6/h;

    .line 61
    .line 62
    new-instance p2, Li7/p;

    .line 63
    .line 64
    const/4 v0, 0x2

    .line 65
    invoke-direct {p2, v0}, Li7/p;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v1, p2}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_1
    check-cast p1, Lp6/h;

    .line 73
    .line 74
    invoke-interface {p0, p1}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final e(Lp6/h;)Li7/b0;
    .locals 1

    .line 1
    sget-object v0, Lp6/d;->j:Lp6/d;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Li7/b0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Li7/b0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Li7/z;->a:Li7/b0;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final g(Lp6/h;)Li7/s0;
    .locals 3

    .line 1
    sget-object v0, Li7/s;->k:Li7/s;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li7/s0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Current context doesn\'t contain Job in it: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static final h(Lp6/c;)Li7/g;
    .locals 6

    .line 1
    instance-of v0, p0, Lm7/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li7/g;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Li7/g;-><init>(ILp6/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Lm7/f;

    .line 14
    .line 15
    sget-object v1, Lm7/a;->c:Lm7/s;

    .line 16
    .line 17
    sget-object v2, Lm7/f;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v3, Li7/g;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v3, Li7/g;

    .line 42
    .line 43
    :goto_1
    if-eqz v3, :cond_6

    .line 44
    .line 45
    sget-object v0, Li7/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, Li7/n;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    check-cast v1, Li7/n;

    .line 56
    .line 57
    iget-object v1, v1, Li7/n;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v3}, Li7/g;->r()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, Li7/g;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v2, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Li7/b;->a:Li7/b;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, Li7/g;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, Li7/g;-><init>(ILp6/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v3, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v3, v1, :cond_1

    .line 98
    .line 99
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final i(Lp6/h;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Li7/s;->j:Li7/s;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li7/t;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Li7/t;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Lm7/a;->d(Lp6/h;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Lm7/a;->d(Lp6/h;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final j(Li7/s0;ZLi7/w0;)Li7/f0;
    .locals 9

    .line 1
    instance-of v0, p0, Li7/a1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li7/a1;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Li7/a1;->D(ZLi7/w0;)Li7/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Li7/w0;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, Li7/v0;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, Li7/w0;

    .line 22
    .line 23
    const-string v5, "invoke"

    .line 24
    .line 25
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, Lz6/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    check-cast p0, Li7/a1;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance p2, Li7/r0;

    .line 36
    .line 37
    invoke-direct {p2, v1}, Li7/r0;-><init>(Li7/v0;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p2, Li7/i;

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    invoke-direct {p2, v0, v1}, Li7/i;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p0, p1, p2}, Li7/a1;->D(ZLi7/w0;)Li7/f0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lp6/i;->j:Lp6/i;

    .line 6
    .line 7
    :cond_0
    sget-object p3, Li7/v;->j:Li7/v;

    .line 8
    .line 9
    invoke-interface {p0}, Li7/u;->h()Lp6/h;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1, v0}, Li7/x;->d(Lp6/h;Lp6/h;Z)Lp6/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 18
    .line 19
    if-eq p0, p1, :cond_1

    .line 20
    .line 21
    sget-object v1, Lp6/d;->j:Lp6/d;

    .line 22
    .line 23
    invoke-interface {p0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0, p1}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_1
    sget-object p1, Li7/v;->j:Li7/v;

    .line 34
    .line 35
    new-instance p1, Li7/a0;

    .line 36
    .line 37
    invoke-direct {p1, p0, v0, v0}, Li7/a0;-><init>(Lp6/h;ZI)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p3, p1, p2}, Li7/a;->T(Li7/v;Li7/a;Ly6/p;)V

    .line 41
    .line 42
    .line 43
    return-object p1
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Li7/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li7/o;

    .line 6
    .line 7
    iget-object p0, p0, Li7/o;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final m(Li7/g;Lp6/c;Z)V
    .locals 2

    .line 1
    sget-object v0, Li7/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Li7/g;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Li7/g;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_6

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p2, p1}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Lm7/f;

    .line 30
    .line 31
    iget-object p2, p1, Lm7/f;->n:Lr6/c;

    .line 32
    .line 33
    iget-object p1, p1, Lm7/f;->p:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v0, p2, Lr6/c;->k:Lp6/h;

    .line 36
    .line 37
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lm7/a;->i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v1, Lm7/a;->d:Lm7/s;

    .line 45
    .line 46
    if-eq p1, v1, :cond_1

    .line 47
    .line 48
    invoke-static {p2, v0, p1}, Li7/x;->q(Lp6/c;Lp6/h;Ljava/lang/Object;)Li7/n1;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v1, 0x0

    .line 54
    :goto_1
    :try_start_0
    invoke-virtual {p2, p0}, Lr6/a;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1}, Li7/n1;->U()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    return-void

    .line 67
    :cond_3
    :goto_2
    invoke-static {v0, p1}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1}, Li7/n1;->U()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_5

    .line 79
    .line 80
    :cond_4
    invoke-static {v0, p1}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_5
    throw p0

    .line 84
    :cond_6
    invoke-interface {p1, p0}, Lp6/c;->d(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public static final n(Li7/k1;Ly6/p;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lm7/q;->m:Lp6/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp6/c;->f()Lp6/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li7/x;->e(Lp6/h;)Li7/b0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, Li7/k1;->n:J

    .line 12
    .line 13
    iget-object v3, p0, Li7/a;->l:Lp6/h;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p0, v3}, Li7/b0;->k(JLi7/k1;Lp6/h;)Li7/f0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Li7/i;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, v2, v0}, Li7/i;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-static {p0, v0, v1}, Li7/x;->j(Li7/s0;ZLi7/w0;)Li7/f0;

    .line 27
    .line 28
    .line 29
    :try_start_0
    instance-of v0, p1, Lr6/a;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "<this>"

    .line 34
    .line 35
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Li7/a;->l:Lp6/h;

    .line 39
    .line 40
    sget-object v1, Lp6/i;->j:Lp6/i;

    .line 41
    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    new-instance v0, Lq6/b;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lr6/g;-><init>(Lp6/c;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v1, Lq6/c;

    .line 51
    .line 52
    invoke-direct {v1, p0, v0}, Lr6/c;-><init>(Lp6/c;Lp6/h;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :goto_0
    invoke-static {p1}, Lz6/q;->b(Ly6/p;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p0, v0}, Ly6/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {p1}, Lz6/q;->b(Ly6/p;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p0, p0}, Ly6/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    new-instance v0, Li7/o;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {v0, p1, v1}, Li7/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 77
    .line 78
    .line 79
    move-object p1, v0

    .line 80
    :goto_1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 81
    .line 82
    if-ne p1, v0, :cond_2

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    invoke-virtual {p0, p1}, Li7/a1;->H(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget-object v2, Li7/x;->e:Lm7/s;

    .line 90
    .line 91
    if-ne v1, v2, :cond_3

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    instance-of v0, v1, Li7/o;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    check-cast v1, Li7/o;

    .line 99
    .line 100
    iget-object v0, v1, Li7/o;->a:Ljava/lang/Throwable;

    .line 101
    .line 102
    instance-of v1, v0, Li7/j1;

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    move-object v1, v0

    .line 107
    check-cast v1, Li7/j1;

    .line 108
    .line 109
    iget-object v1, v1, Li7/j1;->j:Li7/s0;

    .line 110
    .line 111
    if-ne v1, p0, :cond_5

    .line 112
    .line 113
    instance-of p0, p1, Li7/o;

    .line 114
    .line 115
    if-nez p0, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    check-cast p1, Li7/o;

    .line 119
    .line 120
    iget-object p0, p1, Li7/o;->a:Ljava/lang/Throwable;

    .line 121
    .line 122
    throw p0

    .line 123
    :cond_5
    throw v0

    .line 124
    :cond_6
    invoke-static {v1}, Li7/x;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_2
    move-object v0, p1

    .line 129
    :goto_3
    return-object v0
.end method

.method public static final o(Lp6/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Lm7/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lm7/f;

    .line 6
    .line 7
    invoke-virtual {p0}, Lm7/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Li7/x;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v1}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1}, Ll6/f;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Li7/x;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
.end method

.method public static final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Li7/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Li7/q0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Li7/q0;->a:Li7/p0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final q(Lp6/c;Lp6/h;Ljava/lang/Object;)Li7/n1;
    .locals 2

    .line 1
    instance-of v0, p0, Lr6/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Li7/o1;->j:Li7/o1;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, Lr6/d;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, Li7/c0;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, Lr6/d;->a()Lr6/d;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, Li7/n1;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, Li7/n1;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Li7/n1;->V(Lp6/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Lp6/c;->f()Lp6/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    new-instance v2, Li7/p;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v3}, Li7/p;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v1, v2}, Lp6/h;->t(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p0}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0, p0, v3}, Li7/x;->d(Lp6/h;Lp6/h;Z)Lp6/h;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    sget-object v1, Li7/s;->k:Li7/s;

    .line 35
    .line 36
    invoke-interface {p0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Li7/s0;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Li7/s0;->isActive()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    check-cast v1, Li7/a1;

    .line 52
    .line 53
    invoke-virtual {v1}, Li7/a1;->v()Ljava/util/concurrent/CancellationException;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    throw p0

    .line 58
    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    .line 59
    .line 60
    new-instance v0, Lm7/q;

    .line 61
    .line 62
    invoke-direct {v0, p2, p0}, Lm7/q;-><init>(Lp6/c;Lp6/h;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v0, p1}, Landroid/support/v4/media/session/b;->M(Lm7/q;Lm7/q;Ly6/p;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    sget-object v1, Lp6/d;->j:Lp6/d;

    .line 71
    .line 72
    invoke-interface {p0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v2, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    new-instance v0, Li7/n1;

    .line 87
    .line 88
    invoke-direct {v0, p2, p0}, Li7/n1;-><init>(Lp6/c;Lp6/h;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    iget-object p2, v0, Li7/a;->l:Lp6/h;

    .line 93
    .line 94
    invoke-static {p2, p0}, Lm7/a;->i(Lp6/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :try_start_0
    invoke-static {v0, v0, p1}, Landroid/support/v4/media/session/b;->M(Lm7/q;Lm7/q;Ly6/p;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    invoke-static {p2, p0}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object p0, p1

    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    invoke-static {p2, p0}, Lm7/a;->e(Lp6/h;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    new-instance v0, Li7/c0;

    .line 113
    .line 114
    invoke-direct {v0, p2, p0}, Lm7/q;-><init>(Lp6/c;Lp6/h;)V

    .line 115
    .line 116
    .line 117
    :try_start_1
    check-cast p1, Lr6/a;

    .line 118
    .line 119
    invoke-virtual {p1, v0, v0}, Lr6/a;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 128
    .line 129
    invoke-static {p1, p0}, Lm7/a;->f(Ljava/lang/Object;Lp6/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 130
    .line 131
    .line 132
    sget-object p0, Li7/c0;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 133
    .line 134
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    const/4 p0, 0x2

    .line 141
    if-ne p1, p0, :cond_7

    .line 142
    .line 143
    sget-object p0, Li7/a1;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Li7/x;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    instance-of p1, p0, Li7/o;

    .line 154
    .line 155
    if-nez p1, :cond_6

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    check-cast p0, Li7/o;

    .line 159
    .line 160
    iget-object p0, p0, Li7/o;->a:Ljava/lang/Throwable;

    .line 161
    .line 162
    throw p0

    .line 163
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    const-string p1, "Already suspended"

    .line 166
    .line 167
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p0

    .line 171
    :cond_8
    const/4 p1, 0x1

    .line 172
    invoke-virtual {p0, v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_5

    .line 177
    .line 178
    sget-object p0, Lq6/a;->j:Lq6/a;

    .line 179
    .line 180
    :goto_2
    sget-object p1, Lq6/a;->j:Lq6/a;

    .line 181
    .line 182
    return-object p0

    .line 183
    :catchall_1
    move-exception p0

    .line 184
    invoke-static {p0}, Lcom/bumptech/glide/c;->y(Ljava/lang/Throwable;)Ll6/e;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v0, p1}, Li7/a;->d(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    throw p0
.end method

.method public static final s(JLy6/p;Lr6/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Li7/l1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Li7/l1;

    .line 7
    .line 8
    iget v1, v0, Li7/l1;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Li7/l1;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Li7/l1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lr6/c;-><init>(Lp6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Li7/l1;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Li7/l1;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Li7/l1;->m:Lz6/n;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Li7/j1; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p3

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long p3, p0, v4

    .line 58
    .line 59
    if-gtz p3, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    new-instance p3, Lz6/n;

    .line 63
    .line 64
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iput-object p3, v0, Li7/l1;->m:Lz6/n;

    .line 68
    .line 69
    iput v3, v0, Li7/l1;->o:I

    .line 70
    .line 71
    new-instance v2, Li7/k1;

    .line 72
    .line 73
    invoke-direct {v2, p0, p1, v0}, Li7/k1;-><init>(JLi7/l1;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p3, Lz6/n;->j:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v2, p2}, Li7/x;->n(Li7/k1;Ly6/p;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catch Li7/j1; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    if-ne p0, v1, :cond_4

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_4
    return-object p0

    .line 86
    :catch_1
    move-exception p1

    .line 87
    move-object p0, p3

    .line 88
    :goto_1
    iget-object p2, p1, Li7/j1;->j:Li7/s0;

    .line 89
    .line 90
    iget-object p0, p0, Lz6/n;->j:Ljava/lang/Object;

    .line 91
    .line 92
    if-ne p2, p0, :cond_5

    .line 93
    .line 94
    :goto_2
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :cond_5
    throw p1
.end method
