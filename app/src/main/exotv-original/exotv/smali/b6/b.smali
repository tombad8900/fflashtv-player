.class public final synthetic Lb6/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/b;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lb6/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 4

    .line 1
    iget v0, p0, Lb6/b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lb6/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/exotv/net/PlayerActivity;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iput-object p1, v1, Lcom/exotv/net/PlayerActivity;->t0:Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget v0, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    const v2, 0x3f8a3d71    # 1.08f

    .line 24
    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    move v3, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    move v1, v2

    .line 38
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-wide/16 v1, 0x78

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 49
    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    const/high16 p2, 0x41400000    # 12.0f

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const/4 p2, 0x0

    .line 57
    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationZ(F)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    check-cast v1, Lb6/o;

    .line 62
    .line 63
    iput-boolean p2, v1, Lb6/o;->l:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Lb6/u;->p()V

    .line 66
    .line 67
    .line 68
    if-nez p2, :cond_4

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-virtual {v1, p1}, Lb6/o;->s(Z)V

    .line 72
    .line 73
    .line 74
    iput-boolean p1, v1, Lb6/o;->m:Z

    .line 75
    .line 76
    :cond_4
    return-void

    .line 77
    :pswitch_1
    check-cast v1, Lb6/e;

    .line 78
    .line 79
    invoke-virtual {v1}, Lb6/e;->t()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {v1, p1}, Lb6/e;->s(Z)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
