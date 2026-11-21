.class public final synthetic Lc5/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq p2, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return v0
.end method
