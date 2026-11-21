.class public final Lr3/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final j:Landroid/view/View;

.field public k:Landroidx/media3/common/a;

.field public l:Li7/a0;

.field public m:Lr3/t;

.field public n:Z


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/u;->j:Landroid/view/View;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr3/u;->l:Li7/a0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 13
    .line 14
    sget-object v0, Lm7/n;->a:Lj7/d;

    .line 15
    .line 16
    iget-object v0, v0, Lj7/d;->n:Lj7/d;

    .line 17
    .line 18
    new-instance v1, Lj3/e;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, p0, v3, v2}, Lj3/e;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    and-int/2addr v4, v2

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    sget-object v0, Lp6/i;->j:Lp6/i;

    .line 30
    .line 31
    :cond_1
    sget-object v4, Li7/v;->j:Li7/v;

    .line 32
    .line 33
    sget-object v5, Lp6/i;->j:Lp6/i;

    .line 34
    .line 35
    invoke-static {v5, v0, v2}, Li7/x;->d(Lp6/h;Lp6/h;Z)Lp6/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v5, Li7/e0;->a:Lo7/e;

    .line 40
    .line 41
    if-eq v0, v5, :cond_2

    .line 42
    .line 43
    sget-object v6, Lp6/d;->j:Lp6/d;

    .line 44
    .line 45
    invoke-interface {v0, v6}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    invoke-interface {v0, v5}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_2
    sget-object v5, Li7/v;->j:Li7/v;

    .line 56
    .line 57
    new-instance v5, Li7/a0;

    .line 58
    .line 59
    invoke-direct {v5, v0, v2, v2}, Li7/a0;-><init>(Lp6/h;ZI)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4, v5, v1}, Li7/a;->T(Li7/v;Li7/a;Ly6/p;)V

    .line 63
    .line 64
    .line 65
    iput-object v5, p0, Lr3/u;->l:Li7/a0;

    .line 66
    .line 67
    iput-object v3, p0, Lr3/u;->k:Landroidx/media3/common/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lr3/u;->m:Lr3/t;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lr3/u;->n:Z

    .line 8
    .line 9
    iget-object v0, p1, Lr3/t;->j:Lh3/h;

    .line 10
    .line 11
    iget-object p1, p1, Lr3/t;->k:Lr3/k;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lh3/h;->b(Lr3/k;)Lr3/e;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lr3/u;->m:Lr3/t;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p1, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 6
    .line 7
    iget-object v1, p1, Lr3/t;->n:Li7/s0;

    .line 8
    .line 9
    invoke-static {v1}, Li7/x;->b(Li7/s0;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Lr3/t;->l:Lt3/a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
