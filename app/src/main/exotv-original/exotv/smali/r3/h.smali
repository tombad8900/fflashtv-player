.class public final Lr3/h;
.super Landroidx/lifecycle/o;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final k:Lr3/h;

.field public static final l:Lr3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/lifecycle/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr3/h;->k:Lr3/h;

    .line 8
    .line 9
    new-instance v0, Lr3/g;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lr3/h;->l:Lr3/g;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/u;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/lifecycle/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/lifecycle/d;

    .line 6
    .line 7
    const-string v0, "owner"

    .line 8
    .line 9
    sget-object v1, Lr3/h;->l:Lr3/g;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v1}, Landroidx/lifecycle/d;->onStart(Landroidx/lifecycle/v;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Landroidx/lifecycle/d;->b(Landroidx/lifecycle/v;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must implement androidx.lifecycle.DefaultLifecycleObserver."

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final b()Landroidx/lifecycle/n;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/n;->n:Landroidx/lifecycle/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Landroidx/lifecycle/u;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "coil.request.GlobalLifecycle"

    .line 2
    .line 3
    return-object v0
.end method
