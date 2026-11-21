.class public final Lw4/o0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:Lx4/v;

.field public o:I

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:I

.field public final synthetic r:Lcom/exotv/net/PlayerActivity;

.field public final synthetic s:Z


# direct methods
.method public constructor <init>(Ljava/util/List;ILcom/exotv/net/PlayerActivity;ZLp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw4/o0;->p:Ljava/util/List;

    .line 2
    .line 3
    iput p2, p0, Lw4/o0;->q:I

    .line 4
    .line 5
    iput-object p3, p0, Lw4/o0;->r:Lcom/exotv/net/PlayerActivity;

    .line 6
    .line 7
    iput-boolean p4, p0, Lw4/o0;->s:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/u;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw4/o0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw4/o0;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw4/o0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 6

    .line 1
    new-instance v0, Lw4/o0;

    .line 2
    .line 3
    iget-object v3, p0, Lw4/o0;->r:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    iget-boolean v4, p0, Lw4/o0;->s:Z

    .line 6
    .line 7
    iget-object v1, p0, Lw4/o0;->p:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lw4/o0;->q:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lw4/o0;-><init>(Ljava/util/List;ILcom/exotv/net/PlayerActivity;ZLp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lw4/o0;->o:I

    .line 4
    .line 5
    const-string v2, "getString(...)"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, Lw4/o0;->r:Lcom/exotv/net/PlayerActivity;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lw4/o0;->n:Lx4/v;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_1
    iget-object p1, p0, Lw4/o0;->p:Ljava/util/List;

    .line 34
    .line 35
    iget v1, p0, Lw4/o0;->q:I

    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lx4/t;

    .line 42
    .line 43
    iget-object v1, p1, Lx4/t;->j:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    sget-object v1, Lx4/v;->a:Lx4/v;

    .line 52
    .line 53
    iput-object v1, p0, Lw4/o0;->n:Lx4/v;

    .line 54
    .line 55
    iput v3, p0, Lw4/o0;->o:I

    .line 56
    .line 57
    sget-object v3, Li7/e0;->a:Lo7/e;

    .line 58
    .line 59
    sget-object v3, Lo7/d;->l:Lo7/d;

    .line 60
    .line 61
    new-instance v5, Lb5/k;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-direct {v5, p1, v6}, Lb5/k;-><init>(Lx4/t;Lp6/c;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v5, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_2

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_2
    move-object v0, v1

    .line 75
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lx4/v;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object v0, v4, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v0, v4, Lcom/exotv/net/PlayerActivity;->Z:Ljava/lang/String;

    .line 87
    .line 88
    iget-boolean v0, p0, Lw4/o0;->s:Z

    .line 89
    .line 90
    invoke-static {v4, p1, v0}, Lcom/exotv/net/PlayerActivity;->r(Lcom/exotv/net/PlayerActivity;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const p1, 0x7f110131

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v2, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 114
    :catch_1
    const p1, 0x7f110130

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {v2, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, p1}, Lcom/exotv/net/PlayerActivity;->S(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 128
    .line 129
    .line 130
    :goto_1
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 131
    .line 132
    return-object p1

    .line 133
    :goto_2
    throw p1
.end method
