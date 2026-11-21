.class public final synthetic Lc5/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:Ly6/a;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ly6/a;Ljava/util/List;ZILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/b0;->j:Ly6/a;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/b0;->k:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lc5/b0;->l:Z

    .line 9
    .line 10
    iput p4, p0, Lc5/b0;->m:I

    .line 11
    .line 12
    iput-object p5, p0, Lc5/b0;->n:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 p1, 0x13

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lc5/b0;->j:Ly6/a;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/view/View;

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 26
    .line 27
    .line 28
    return p3

    .line 29
    :cond_1
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lc5/b0;->k:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {p1}, Lm6/h;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 46
    .line 47
    .line 48
    return p3

    .line 49
    :cond_2
    const/16 p1, 0x16

    .line 50
    .line 51
    if-ne p2, p1, :cond_3

    .line 52
    .line 53
    iget-boolean p1, p0, Lc5/b0;->l:Z

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lc5/b0;->n:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {p1}, Lm6/i;->s0(Ljava/util/List;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iget p2, p0, Lc5/b0;->m:I

    .line 64
    .line 65
    if-ne p2, p1, :cond_3

    .line 66
    .line 67
    return p3

    .line 68
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 69
    return p1
.end method
