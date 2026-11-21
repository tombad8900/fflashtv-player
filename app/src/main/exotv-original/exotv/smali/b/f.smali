.class public final synthetic Lb/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/lifecycle/t;


# instance fields
.field public final synthetic j:Lb/x;

.field public final synthetic k:Lh/i;


# direct methods
.method public synthetic constructor <init>(Lb/x;Lh/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/f;->j:Lb/x;

    .line 5
    .line 6
    iput-object p2, p0, Lb/f;->k:Lh/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lb/g;->a:Lb/g;

    .line 6
    .line 7
    iget-object p2, p0, Lb/f;->k:Lh/i;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lb/g;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "invoker"

    .line 14
    .line 15
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lb/f;->j:Lb/x;

    .line 19
    .line 20
    iput-object p1, p2, Lb/x;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 21
    .line 22
    iget-boolean p1, p2, Lb/x;->g:Z

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lb/x;->d(Z)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
