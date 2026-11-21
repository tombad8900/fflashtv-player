.class public final Lc5/j0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V
    .locals 0

    .line 1
    iput p7, p0, Lc5/j0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/j0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lc5/j0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lc5/j0;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lc5/j0;->s:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lc5/j0;->t:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p6}, Lr6/h;-><init>(ILp6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc5/j0;->n:I

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
    invoke-virtual {p0, p1, p2}, Lc5/j0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc5/j0;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc5/j0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc5/j0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lc5/j0;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lc5/j0;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget p1, p0, Lc5/j0;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc5/j0;

    .line 7
    .line 8
    iget-object p1, p0, Lc5/j0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lr3/k;

    .line 12
    .line 13
    iget-object p1, p0, Lc5/j0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, Lh3/h;

    .line 17
    .line 18
    iget-object p1, p0, Lc5/j0;->r:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    check-cast v3, Ls3/h;

    .line 22
    .line 23
    iget-object p1, p0, Lc5/j0;->s:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    check-cast v4, Lh3/d;

    .line 27
    .line 28
    iget-object p1, p0, Lc5/j0;->t:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, p1

    .line 31
    check-cast v5, Landroid/graphics/Bitmap;

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    move-object v6, p2

    .line 35
    invoke-direct/range {v0 .. v7}, Lc5/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    move-object v6, p2

    .line 40
    new-instance v1, Lc5/j0;

    .line 41
    .line 42
    iget-object p1, p0, Lc5/j0;->p:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v2, p1

    .line 45
    check-cast v2, Landroid/content/Context;

    .line 46
    .line 47
    iget-object p1, p0, Lc5/j0;->q:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v3, p1

    .line 50
    check-cast v3, Lx4/l;

    .line 51
    .line 52
    iget-object p1, p0, Lc5/j0;->r:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v4, p1

    .line 55
    check-cast v4, Lc5/k0;

    .line 56
    .line 57
    iget-object p1, p0, Lc5/j0;->s:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v5, p1

    .line 60
    check-cast v5, Lc5/i0;

    .line 61
    .line 62
    iget-object p1, p0, Lc5/j0;->t:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    move-object v7, v6

    .line 68
    move-object v6, p1

    .line 69
    invoke-direct/range {v1 .. v8}, Lc5/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lc5/j0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 7
    .line 8
    iget v1, p0, Lc5/j0;->o:I

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
    goto :goto_1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lm3/j;

    .line 31
    .line 32
    iget-object p1, p0, Lc5/j0;->p:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, p1

    .line 35
    check-cast v4, Lr3/k;

    .line 36
    .line 37
    iget-object p1, p0, Lc5/j0;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lh3/h;

    .line 40
    .line 41
    iget-object v5, p1, Lh3/h;->h:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object p1, p0, Lc5/j0;->r:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v8, p1

    .line 46
    check-cast v8, Ls3/h;

    .line 47
    .line 48
    iget-object p1, p0, Lc5/j0;->s:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v9, p1

    .line 51
    check-cast v9, Lh3/d;

    .line 52
    .line 53
    iget-object p1, p0, Lc5/j0;->t:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroid/graphics/Bitmap;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    move v10, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    move v10, p1

    .line 63
    :goto_0
    const/4 v6, 0x0

    .line 64
    move-object v7, v4

    .line 65
    invoke-direct/range {v3 .. v10}, Lm3/j;-><init>(Lr3/k;Ljava/util/List;ILr3/k;Ls3/h;Lh3/d;Z)V

    .line 66
    .line 67
    .line 68
    iput v2, p0, Lc5/j0;->o:I

    .line 69
    .line 70
    invoke-virtual {v3, v4, p0}, Lm3/j;->b(Lr3/k;Lr6/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    move-object p1, v0

    .line 77
    :cond_3
    :goto_1
    return-object p1

    .line 78
    :pswitch_0
    iget-object v0, p0, Lc5/j0;->r:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lc5/k0;

    .line 81
    .line 82
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 83
    .line 84
    iget v2, p0, Lc5/j0;->o:I

    .line 85
    .line 86
    sget-object v3, Ll6/j;->a:Ll6/j;

    .line 87
    .line 88
    const/4 v4, 0x1

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    if-ne v2, v4, :cond_4

    .line 92
    .line 93
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception v0

    .line 98
    move-object p1, v0

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_5
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :try_start_1
    sget-object p1, Lc5/r0;->a:Lc5/r0;

    .line 112
    .line 113
    iget-object v2, p0, Lc5/j0;->p:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Landroid/content/Context;

    .line 116
    .line 117
    iget-object v5, p0, Lc5/j0;->q:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v5, Lx4/l;

    .line 120
    .line 121
    iget-object v0, v0, Lc5/k0;->h:Lx4/m;

    .line 122
    .line 123
    iput v4, p0, Lc5/j0;->o:I

    .line 124
    .line 125
    invoke-virtual {p1, v2, v5, v0, p0}, Lc5/r0;->e(Landroid/content/Context;Lx4/l;Lx4/m;Lr6/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_6

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 133
    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    iget-object v0, p0, Lc5/j0;->s:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lc5/i0;

    .line 139
    .line 140
    iget-object v1, p0, Lc5/j0;->t:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v0, v1, p1}, Lc5/k0;->g(Lc5/i0;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :catch_1
    :cond_7
    move-object v1, v3

    .line 148
    :goto_3
    return-object v1

    .line 149
    :goto_4
    throw p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
