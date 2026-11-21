.class public final synthetic Lc5/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lc5/s;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lc5/s;Landroid/content/Context;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/r;->a:Lc5/s;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/r;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-boolean p3, p0, Lc5/r;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lc5/r;->a:Lc5/s;

    .line 2
    .line 3
    iget-object v1, p0, Lc5/r;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, p0, Lc5/r;->c:Z

    .line 6
    .line 7
    const v3, 0x7f0603d7

    .line 8
    .line 9
    .line 10
    const-wide/16 v4, 0x78

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const v6, 0x3f8147ae    # 1.01f

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v6}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 45
    .line 46
    const/high16 v4, 0x41200000    # 10.0f

    .line 47
    .line 48
    mul-float/2addr p2, v4

    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    .line 50
    .line 51
    .line 52
    iget-object p1, v0, Lc5/s;->u:La5/c;

    .line 53
    .line 54
    iget-object p1, p1, La5/c;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const v3, 0x106000b

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const/high16 v6, 0x3f800000    # 1.0f

    .line 77
    .line 78
    invoke-virtual {p2, v6}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p2, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 91
    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v0, Lc5/s;->u:La5/c;

    .line 98
    .line 99
    iget-object p1, p1, La5/c;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Landroid/widget/TextView;

    .line 102
    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const v3, 0x7f060070

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
