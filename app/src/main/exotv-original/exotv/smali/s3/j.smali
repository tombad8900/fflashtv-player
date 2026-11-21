.class public final Ls3/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:Ls3/f;

.field public final synthetic k:Landroid/view/ViewTreeObserver;

.field public final synthetic l:Ls3/k;


# direct methods
.method public constructor <init>(Ls3/f;Landroid/view/ViewTreeObserver;Ls3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3/j;->j:Ls3/f;

    .line 5
    .line 6
    iput-object p2, p0, Ls3/j;->k:Landroid/view/ViewTreeObserver;

    .line 7
    .line 8
    iput-object p3, p0, Ls3/j;->l:Ls3/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, Ls3/j;->k:Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Ls3/j;->l:Ls3/k;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Ls3/j;->j:Ls3/f;

    .line 18
    .line 19
    iget-object p1, p1, Ls3/f;->a:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 29
    .line 30
    return-object p1
.end method
