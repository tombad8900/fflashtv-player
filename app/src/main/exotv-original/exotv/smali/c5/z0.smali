.class public final Lc5/z0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:I

.field public final synthetic o:Lc5/a1;

.field public final synthetic p:Lx4/l;

.field public final synthetic q:Lx4/m;

.field public final synthetic r:Landroid/widget/LinearLayout;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lc5/a1;Lx4/l;Lx4/m;Landroid/widget/LinearLayout;Ljava/lang/String;Landroid/widget/ImageView;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/z0;->o:Lc5/a1;

    .line 2
    .line 3
    iput-object p2, p0, Lc5/z0;->p:Lx4/l;

    .line 4
    .line 5
    iput-object p3, p0, Lc5/z0;->q:Lx4/m;

    .line 6
    .line 7
    iput-object p4, p0, Lc5/z0;->r:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    iput-object p5, p0, Lc5/z0;->s:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lc5/z0;->t:Landroid/widget/ImageView;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lr6/h;-><init>(ILp6/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lc5/z0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc5/z0;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc5/z0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 8

    .line 1
    new-instance v0, Lc5/z0;

    .line 2
    .line 3
    iget-object v5, p0, Lc5/z0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v6, p0, Lc5/z0;->t:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object v1, p0, Lc5/z0;->o:Lc5/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lc5/z0;->p:Lx4/l;

    .line 10
    .line 11
    iget-object v3, p0, Lc5/z0;->q:Lx4/m;

    .line 12
    .line 13
    iget-object v4, p0, Lc5/z0;->r:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lc5/z0;-><init>(Lc5/a1;Lx4/l;Lx4/m;Landroid/widget/LinearLayout;Ljava/lang/String;Landroid/widget/ImageView;Lp6/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lc5/z0;->o:Lc5/a1;

    .line 2
    .line 3
    iget-object v0, v0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 4
    .line 5
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 6
    .line 7
    iget v2, p0, Lc5/z0;->n:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_2

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
    :try_start_1
    sget-object p1, Lc5/r0;->a:Lc5/r0;

    .line 32
    .line 33
    iget-object v2, p0, Lc5/z0;->p:Lx4/l;

    .line 34
    .line 35
    iget-object v4, p0, Lc5/z0;->q:Lx4/m;

    .line 36
    .line 37
    iput v3, p0, Lc5/z0;->n:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, v2, v4, p0}, Lc5/r0;->e(Landroid/content/Context;Lx4/l;Lx4/m;Lr6/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v1, :cond_2

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_1
    const/4 p1, 0x0

    .line 50
    :goto_1
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lc5/z0;->r:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v3, p0, Lc5/z0;->s:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-static {v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1, v0}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object v0, La4/n;->b:La4/n;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lq4/a;->d(La4/n;)Lq4/a;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lcom/bumptech/glide/j;

    .line 91
    .line 92
    iget-object v0, p0, Lc5/z0;->t:Landroid/widget/ImageView;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :cond_3
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 102
    .line 103
    return-object p1

    .line 104
    :goto_2
    throw p1
.end method
