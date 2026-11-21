.class public final Landroidx/lifecycle/p;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lp6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/lifecycle/p;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/lifecycle/p;->p:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/lifecycle/p;->n:I

    .line 2
    .line 3
    check-cast p1, Li7/u;

    .line 4
    .line 5
    check-cast p2, Lp6/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/p;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/lifecycle/p;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/lifecycle/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/p;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroidx/lifecycle/p;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroidx/lifecycle/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/lifecycle/p;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/lifecycle/p;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/lifecycle/p;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lc5/d0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, p2, v2}, Landroidx/lifecycle/p;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Landroidx/lifecycle/p;->o:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Landroidx/lifecycle/p;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/lifecycle/p;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/lifecycle/q;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, v1, p2, v2}, Landroidx/lifecycle/p;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Landroidx/lifecycle/p;->o:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/lifecycle/p;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Landroidx/lifecycle/p;->p:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/lifecycle/p;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Li7/u;

    .line 17
    .line 18
    invoke-interface {p1}, Li7/u;->h()Lp6/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast v2, Lc5/d0;

    .line 23
    .line 24
    :try_start_0
    new-instance v0, Li7/i1;

    .line 25
    .line 26
    invoke-direct {v0}, Li7/i1;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Li7/x;->g(Lp6/h;)Li7/s0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-static {p1, v3, v0}, Li7/x;->j(Li7/s0;ZLi7/w0;)Li7/f0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, v0, Li7/i1;->o:Li7/f0;

    .line 39
    .line 40
    sget-object p1, Li7/i1;->p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x2

    .line 49
    if-eq v3, p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x3

    .line 52
    if-ne v3, p1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v3}, Li7/i1;->m(I)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_2
    const/4 v4, 0x0

    .line 60
    invoke-virtual {p1, v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 61
    .line 62
    .line 63
    move-result v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    :cond_3
    :goto_0
    :try_start_1
    iget-object p1, v2, Lc5/d0;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Li3/e;

    .line 69
    .line 70
    invoke-static {p1}, Li3/e;->a(Li3/e;)Li3/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :try_start_2
    invoke-virtual {v0}, Li7/i1;->l()V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :catch_0
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    invoke-virtual {v0}, Li7/i1;->l()V

    .line 82
    .line 83
    .line 84
    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    :goto_1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 86
    .line 87
    const-string v1, "Blocking call was interrupted due to parent cancellation"

    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    throw p1

    .line 97
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 98
    .line 99
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Landroidx/lifecycle/p;->o:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Li7/u;

    .line 105
    .line 106
    check-cast v2, Landroidx/lifecycle/q;

    .line 107
    .line 108
    iget-object v0, v2, Landroidx/lifecycle/q;->j:Landroidx/lifecycle/o;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    sget-object v4, Landroidx/lifecycle/n;->k:Landroidx/lifecycle/n;

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-ltz v3, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-interface {p1}, Li7/u;->h()Lp6/h;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    sget-object v0, Li7/s;->k:Li7/s;

    .line 131
    .line 132
    invoke-interface {p1, v0}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Li7/s0;

    .line 137
    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    check-cast p1, Li7/a1;

    .line 141
    .line 142
    new-instance v0, Li7/t0;

    .line 143
    .line 144
    invoke-virtual {p1}, Li7/a1;->o()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-direct {v0, v2, v1, p1}, Li7/t0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Li7/a1;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    :cond_5
    :goto_2
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 155
    .line 156
    return-object p1

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
