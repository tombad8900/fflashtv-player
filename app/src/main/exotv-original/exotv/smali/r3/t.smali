.class public final Lr3/t;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lr3/q;


# instance fields
.field public final j:Lh3/h;

.field public final k:Lr3/k;

.field public final l:Lt3/a;

.field public final m:Landroidx/lifecycle/o;

.field public final n:Li7/s0;


# direct methods
.method public constructor <init>(Lh3/h;Lr3/k;Lt3/a;Landroidx/lifecycle/o;Li7/s0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/t;->j:Lh3/h;

    .line 5
    .line 6
    iput-object p2, p0, Lr3/t;->k:Lr3/k;

    .line 7
    .line 8
    iput-object p3, p0, Lr3/t;->l:Lt3/a;

    .line 9
    .line 10
    iput-object p4, p0, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 11
    .line 12
    iput-object p5, p0, Lr3/t;->n:Li7/s0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr3/t;->l:Lt3/a;

    .line 2
    .line 3
    iget-object v1, v0, Lt3/a;->k:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, v0, Lt3/a;->k:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-static {v0}, Lv3/f;->c(Landroid/view/View;)Lr3/u;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, v0, Lr3/u;->m:Lr3/t;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v2, v1, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 23
    .line 24
    iget-object v3, v1, Lr3/t;->n:Li7/s0;

    .line 25
    .line 26
    invoke-static {v3}, Li7/x;->b(Li7/s0;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v1, Lr3/t;->l:Lt3/a;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2, v1}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object p0, v0, Lr3/u;->m:Lr3/t;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 42
    .line 43
    const-string v1, "\'ViewTarget.view\' must be attached to a window."

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr3/t;->l:Lt3/a;

    .line 2
    .line 3
    iget-object p1, p1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-static {p1}, Lv3/f;->c(Landroid/view/View;)Lr3/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lr3/u;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final start()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr3/t;->l:Lt3/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, v1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-static {v0}, Lv3/f;->c(Landroid/view/View;)Lr3/u;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, v0, Lr3/u;->m:Lr3/t;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v2, v1, Lr3/t;->m:Landroidx/lifecycle/o;

    .line 27
    .line 28
    iget-object v3, v1, Lr3/t;->n:Li7/s0;

    .line 29
    .line 30
    invoke-static {v3}, Li7/x;->b(Li7/s0;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, v1, Lr3/t;->l:Lt3/a;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v2, v1}, Landroidx/lifecycle/o;->i(Landroidx/lifecycle/u;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object p0, v0, Lr3/u;->m:Lr3/t;

    .line 44
    .line 45
    return-void
.end method
