.class public final La1/z;
.super Lcom/bumptech/glide/c;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/u0;
.implements Landroidx/lifecycle/v;
.implements La3/f;
.implements La1/r0;


# instance fields
.field public final p:Lh/i;

.field public final q:Lh/i;

.field public final r:Landroid/os/Handler;

.field public final s:La1/n0;

.field public final synthetic t:Lh/i;


# direct methods
.method public constructor <init>(Lh/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La1/z;->t:Lh/i;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, La1/n0;

    .line 12
    .line 13
    invoke-direct {v1}, La1/n0;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La1/z;->s:La1/n0;

    .line 17
    .line 18
    iput-object p1, p0, La1/z;->p:Lh/i;

    .line 19
    .line 20
    iput-object p1, p0, La1/z;->q:Lh/i;

    .line 21
    .line 22
    iput-object v0, p0, La1/z;->r:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final U(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, La1/z;->t:Lh/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final V()Z
    .locals 1

    .line 1
    iget-object v0, p0, La1/z;->t:Lh/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Landroidx/lifecycle/t0;
    .locals 1

    .line 1
    iget-object v0, p0, La1/z;->t:Lh/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/l;->b()Landroidx/lifecycle/t0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()La3/e;
    .locals 1

    .line 1
    iget-object v0, p0, La1/z;->t:Lh/i;

    .line 2
    .line 3
    iget-object v0, v0, Lb/l;->m:Ln4/p;

    .line 4
    .line 5
    iget-object v0, v0, Ln4/p;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La3/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    iget-object v0, p0, La1/z;->t:Lh/i;

    .line 2
    .line 3
    iget-object v0, v0, Lh/i;->C:Landroidx/lifecycle/x;

    .line 4
    .line 5
    return-object v0
.end method
