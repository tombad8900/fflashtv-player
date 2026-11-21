.class public final Landroidx/lifecycle/f0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/v;


# static fields
.field public static final r:Landroidx/lifecycle/f0;


# instance fields
.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Landroid/os/Handler;

.field public final o:Landroidx/lifecycle/x;

.field public final p:Landroidx/lifecycle/c0;

.field public final q:La1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/f0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/f0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/f0;->r:Landroidx/lifecycle/f0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/lifecycle/f0;->l:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/lifecycle/f0;->m:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/x;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/v;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/lifecycle/f0;->o:Landroidx/lifecycle/x;

    .line 15
    .line 16
    new-instance v0, Landroidx/lifecycle/c0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1, p0}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/lifecycle/f0;->p:Landroidx/lifecycle/c0;

    .line 23
    .line 24
    new-instance v0, La1/o;

    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    invoke-direct {v0, v1, p0}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/lifecycle/f0;->q:La1/o;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/f0;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/lifecycle/f0;->k:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/lifecycle/f0;->l:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/f0;->o:Landroidx/lifecycle/x;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/lifecycle/f0;->l:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/f0;->n:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/lifecycle/f0;->p:Landroidx/lifecycle/c0;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final e()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/f0;->o:Landroidx/lifecycle/x;

    .line 2
    .line 3
    return-object v0
.end method
