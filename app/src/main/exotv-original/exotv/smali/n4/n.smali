.class public final Ln4/n;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public k:Z

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/AspectRatioFrameLayout;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ln4/n;->j:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/n;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln4/o;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln4/n;->j:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/n;->l:Ljava/lang/Object;

    iput-boolean p2, p0, Ln4/n;->k:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ln4/n;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Ln4/n;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Ln4/n;->k:Z

    .line 10
    .line 11
    check-cast v1, Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 12
    .line 13
    sget v0, Landroidx/media3/ui/AspectRatioFrameLayout;->m:I

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v1, Ln4/o;

    .line 20
    .line 21
    iget-boolean v0, p0, Ln4/n;->k:Z

    .line 22
    .line 23
    invoke-static {}, Lu4/m;->a()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Ln4/o;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lj3/a;

    .line 29
    .line 30
    iget-boolean v2, v1, Lj3/a;->a:Z

    .line 31
    .line 32
    iput-boolean v0, v1, Lj3/a;->a:Z

    .line 33
    .line 34
    if-eq v2, v0, :cond_0

    .line 35
    .line 36
    iget-object v1, v1, Lj3/a;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ln4/m;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ln4/m;->a(Z)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
