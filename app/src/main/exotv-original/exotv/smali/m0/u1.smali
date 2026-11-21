.class public Lm0/u1;
.super Lcom/bumptech/glide/d;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final n:Landroid/view/WindowInsetsController;

.field public final o:Ll/o;

.field public final p:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;Ll/o;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 9
    .line 10
    iput-object p2, p0, Lm0/u1;->o:Ll/o;

    .line 11
    .line 12
    iput-object p1, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final L(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    and-int/lit8 p1, p1, -0x9

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->hide(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final h0(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lm0/u1;->s0(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 13
    .line 14
    invoke-interface {p1, v1, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lm0/u1;->t0(I)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object p1, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-interface {p1, v0, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final i0(Z)V
    .locals 3

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    iget-object v1, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lm0/u1;->s0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    invoke-interface {p1, v2, v2}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lm0/u1;->t0(I)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object p1, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-interface {p1, v0, v2}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public j0()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x1538b9a6

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x800

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lm0/u1;->t0(I)V

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x1000

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lm0/u1;->s0(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v1, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final n0(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/u1;->o:Ll/o;

    .line 6
    .line 7
    iget-object v0, v0, Ll/o;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/media3/common/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/common/a;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lm0/u1;->n:Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x9

    .line 17
    .line 18
    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->show(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final s0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    or-int/2addr p1, v1

    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final t0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/u1;->p:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
