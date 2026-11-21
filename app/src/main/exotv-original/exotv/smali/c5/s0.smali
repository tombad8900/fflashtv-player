.class public final Lc5/s0;
.super Landroidx/core/widget/NestedScrollView;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final O:I


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;I)V
    .locals 2

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, v0, v1}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    .line 13
    .line 14
    iput p2, p0, Lc5/s0;->O:I

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-virtual {p0, p2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rectangle"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lc5/s0;->O:I

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {v1, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    sub-int/2addr p2, v0

    .line 28
    iput p2, v1, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    invoke-super {p0, p1, v1, p3}, Landroidx/core/widget/NestedScrollView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method
