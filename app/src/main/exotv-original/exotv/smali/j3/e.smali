.class public final Lj3/e;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lp6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lj3/e;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lj3/e;->o:Ljava/lang/Object;

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
    iget v0, p0, Lj3/e;->n:I

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
    invoke-virtual {p0, p1, p2}, Lj3/e;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lj3/e;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lj3/e;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj3/e;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lj3/e;

    .line 27
    .line 28
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lj3/e;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 2

    .line 1
    iget p1, p0, Lj3/e;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lj3/e;

    .line 7
    .line 8
    iget-object v0, p0, Lj3/e;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lr3/u;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, v0, p2, v1}, Lj3/e;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lj3/e;

    .line 18
    .line 19
    iget-object v0, p0, Lj3/e;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lj3/f;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, v0, p2, v1}, Lj3/e;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lj3/e;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lj3/e;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lr3/u;

    .line 14
    .line 15
    iget-object v0, p1, Lr3/u;->m:Lr3/t;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 20
    .line 21
    iget-object v2, v0, Lr3/t;->n:Li7/s0;

    .line 22
    .line 23
    invoke-static {v2}, Li7/x;->b(Li7/s0;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lr3/t;->l:Lt3/a;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    iput-object v0, p1, Lr3/u;->m:Lr3/t;

    .line 38
    .line 39
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lj3/e;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lj3/f;

    .line 50
    .line 51
    monitor-enter p1

    .line 52
    :try_start_0
    iget-boolean v0, p1, Lj3/f;->u:Z

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    iget-boolean v0, p1, Lj3/f;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_2
    const/4 v0, 0x1

    .line 62
    :try_start_1
    invoke-virtual {p1}, Lj3/f;->G()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto :goto_5

    .line 68
    :catch_0
    :try_start_2
    iput-boolean v0, p1, Lj3/f;->w:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    :goto_0
    :try_start_3
    iget v1, p1, Lj3/f;->r:I

    .line 71
    .line 72
    const/16 v2, 0x7d0

    .line 73
    .line 74
    if-lt v1, v2, :cond_3

    .line 75
    .line 76
    move v1, v0

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v1, 0x0

    .line 79
    :goto_1
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Lj3/f;->I()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catch_1
    :try_start_4
    iput-boolean v0, p1, Lj3/f;->x:Z

    .line 86
    .line 87
    new-instance v0, Lv7/g;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p1, Lj3/f;->s:Lv7/d0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    .line 98
    :cond_4
    :goto_2
    monitor-exit p1

    .line 99
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    :goto_3
    :try_start_5
    sget-object v0, Ll6/j;->a:Ll6/j;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 103
    .line 104
    monitor-exit p1

    .line 105
    move-object p1, v0

    .line 106
    :goto_4
    return-object p1

    .line 107
    :goto_5
    monitor-exit p1

    .line 108
    throw v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
