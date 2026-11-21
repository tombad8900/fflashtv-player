.class public final Lc5/l0;
.super Landroid/widget/HorizontalScrollView;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lc5/l0;->j:I

    .line 5
    .line 6
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
    iget v0, p0, Lc5/l0;->j:I

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 18
    .line 19
    .line 20
    iget p2, v1, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    sub-int/2addr p2, v0

    .line 23
    iput p2, v1, Landroid/graphics/Rect;->left:I

    .line 24
    .line 25
    iget p2, v1, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    add-int/2addr p2, v0

    .line 28
    iput p2, v1, Landroid/graphics/Rect;->right:I

    .line 29
    .line 30
    invoke-super {p0, p1, v1, p3}, Landroid/widget/HorizontalScrollView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method
