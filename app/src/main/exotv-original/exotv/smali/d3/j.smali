.class public final Ld3/j;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ld3/j;->a:I

    iput-object p1, p0, Ld3/j;->c:Ljava/lang/Object;

    iput-object p3, p0, Ld3/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    .line 2
    iput p3, p0, Ld3/j;->a:I

    iput-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    iput-object p2, p0, Ld3/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Ld3/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm0/s0;

    .line 13
    .line 14
    invoke-interface {p1}, Lm0/s0;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Ld3/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lm0/b1;

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object v1, p1, Lm0/b1;->a:Lm0/a1;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lm0/a1;->e(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ld3/j;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/view/View;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lm0/w0;->f(Landroid/view/View;Lm0/b1;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lm0/s0;

    .line 28
    .line 29
    invoke-interface {p1}, Lm0/s0;->c()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    iget-object v0, p0, Ld3/j;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iput-object v1, v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->k:Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    iget v0, v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->j:I

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    if-ne v0, v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const/4 v0, 0x4

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_2
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Landroid/view/View;

    .line 63
    .line 64
    iget-object v0, p0, Ld3/j;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iput-object v1, v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->k:Landroid/view/ViewPropertyAnimator;

    .line 70
    .line 71
    iget v0, v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->j:I

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    if-ne v0, v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    const/4 v0, 0x4

    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-void

    .line 87
    :pswitch_3
    iget-object v0, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lp/e;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Ld3/j;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ld3/n;

    .line 97
    .line 98
    iget-object v0, v0, Ld3/n;->w:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Ld3/j;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    iget-object p1, p0, Ld3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm0/s0;

    .line 13
    .line 14
    invoke-interface {p1}, Lm0/s0;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_1
    iget-object v0, p0, Ld3/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ld3/n;

    .line 21
    .line 22
    iget-object v0, v0, Ld3/n;->w:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method
