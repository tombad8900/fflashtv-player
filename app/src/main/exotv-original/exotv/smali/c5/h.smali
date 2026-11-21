.class public final Lc5/h;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb/l;Ljava/lang/String;IILp6/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc5/h;->n:I

    .line 1
    iput-object p1, p0, Lc5/h;->s:Ljava/lang/Object;

    iput-object p2, p0, Lc5/h;->p:Ljava/lang/String;

    iput p3, p0, Lc5/h;->q:I

    iput p4, p0, Lc5/h;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc5/h;->n:I

    .line 2
    iput-object p1, p0, Lc5/h;->p:Ljava/lang/String;

    iput p2, p0, Lc5/h;->q:I

    iput p3, p0, Lc5/h;->r:I

    iput-object p4, p0, Lc5/h;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc5/h;->n:I

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
    invoke-virtual {p0, p1, p2}, Lc5/h;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc5/h;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc5/h;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc5/h;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lc5/h;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lc5/h;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 7

    .line 1
    iget p1, p0, Lc5/h;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc5/h;

    .line 7
    .line 8
    iget-object p1, p0, Lc5/h;->s:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, p1

    .line 11
    check-cast v4, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lc5/h;->p:Ljava/lang/String;

    .line 14
    .line 15
    iget v2, p0, Lc5/h;->q:I

    .line 16
    .line 17
    iget v3, p0, Lc5/h;->r:I

    .line 18
    .line 19
    move-object v5, p2

    .line 20
    invoke-direct/range {v0 .. v5}, Lc5/h;-><init>(Ljava/lang/String;IILjava/lang/String;Lp6/c;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object v5, p2

    .line 25
    new-instance v1, Lc5/h;

    .line 26
    .line 27
    iget-object p1, p0, Lc5/h;->s:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Lb/l;

    .line 31
    .line 32
    iget v4, p0, Lc5/h;->q:I

    .line 33
    .line 34
    move-object v6, v5

    .line 35
    iget v5, p0, Lc5/h;->r:I

    .line 36
    .line 37
    iget-object v3, p0, Lc5/h;->p:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct/range {v1 .. v6}, Lc5/h;-><init>(Lb/l;Ljava/lang/String;IILp6/c;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lc5/h;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 7
    .line 8
    iget v1, p0, Lc5/h;->o:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object v6, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Lx4/k;->a:Lx4/k;

    .line 32
    .line 33
    iget-object p1, p0, Lc5/h;->s:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v5, p1

    .line 36
    check-cast v5, Ljava/lang/String;

    .line 37
    .line 38
    iput v2, p0, Lc5/h;->o:I

    .line 39
    .line 40
    iget v2, p0, Lc5/h;->q:I

    .line 41
    .line 42
    iget v3, p0, Lc5/h;->r:I

    .line 43
    .line 44
    iget-object v4, p0, Lc5/h;->p:Ljava/lang/String;

    .line 45
    .line 46
    move-object v6, p0

    .line 47
    invoke-virtual/range {v1 .. v6}, Lx4/k;->g(IILjava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    move-object p1, v0

    .line 54
    :cond_2
    :goto_0
    return-object p1

    .line 55
    :pswitch_0
    move-object v6, p0

    .line 56
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 57
    .line 58
    iget v1, v6, Lc5/h;->o:I

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    if-ne v1, v2, :cond_3

    .line 64
    .line 65
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, Lz4/g0;->a:Lz4/g0;

    .line 81
    .line 82
    iget-object p1, v6, Lc5/h;->s:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Lb/l;

    .line 85
    .line 86
    iput v2, v6, Lc5/h;->o:I

    .line 87
    .line 88
    iget-object v3, v6, Lc5/h;->p:Ljava/lang/String;

    .line 89
    .line 90
    iget v4, v6, Lc5/h;->q:I

    .line 91
    .line 92
    iget v5, v6, Lc5/h;->r:I

    .line 93
    .line 94
    move-object v2, p1

    .line 95
    invoke-virtual/range {v1 .. v6}, Lz4/g0;->k(Landroid/app/Activity;Ljava/lang/String;IILr6/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v0, :cond_5

    .line 100
    .line 101
    move-object p1, v0

    .line 102
    :cond_5
    :goto_1
    return-object p1

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
