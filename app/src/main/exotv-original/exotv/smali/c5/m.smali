.class public final synthetic Lc5/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lc5/n;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lc5/n;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/m;->a:Lc5/n;

    .line 5
    .line 6
    iput-boolean p2, p0, Lc5/m;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lc5/m;->a:Lc5/n;

    .line 5
    .line 6
    iget-object v0, v0, Lc5/n;->u:La1/e;

    .line 7
    .line 8
    iget-object v0, v0, La1/e;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iget-boolean v2, p0, Lc5/m;->b:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const v2, 0x7f0603cd

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const v2, 0x106000b

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const p2, 0x3f8ccccd    # 1.1f

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-wide/16 v0, 0x8c

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 69
    .line 70
    .line 71
    const/high16 p2, 0x3f800000    # 1.0f

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
