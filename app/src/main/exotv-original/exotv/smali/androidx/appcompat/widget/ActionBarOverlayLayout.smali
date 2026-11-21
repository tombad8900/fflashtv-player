.class public Landroidx/appcompat/widget/ActionBarOverlayLayout;
.super Landroid/view/ViewGroup;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm/c1;
.implements Lm0/m;
.implements Lm0/n;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UnknownNullness"
    }
.end annotation


# static fields
.field public static final O:[I

.field public static final P:Lm0/r1;

.field public static final Q:Landroid/graphics/Rect;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lm0/r1;

.field public D:Lm0/r1;

.field public E:Lm0/r1;

.field public F:Lm0/r1;

.field public G:Lm/d;

.field public H:Landroid/widget/OverScroller;

.field public I:Landroid/view/ViewPropertyAnimator;

.field public final J:Lb6/n;

.field public final K:Lm/c;

.field public final L:Lm/c;

.field public final M:Landroidx/media3/common/p;

.field public final N:Lm/f;

.field public j:I

.field public k:I

.field public l:Landroidx/appcompat/widget/ContentFrameLayout;

.field public m:Landroidx/appcompat/widget/ActionBarContainer;

.field public n:Lm/d1;

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:I

.field public final v:Landroid/graphics/Rect;

.field public final w:Landroid/graphics/Rect;

.field public final x:Landroid/graphics/Rect;

.field public final y:Landroid/graphics/Rect;

.field public final z:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const v0, 0x7f040005

    .line 2
    .line 3
    .line 4
    const v1, 0x1010059

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->O:[I

    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x22

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Lm0/g1;

    .line 20
    .line 21
    invoke-direct {v0}, Lm0/g1;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v1, 0x1e

    .line 26
    .line 27
    if-lt v0, v1, :cond_1

    .line 28
    .line 29
    new-instance v0, Lm0/f1;

    .line 30
    .line 31
    invoke-direct {v0}, Lm0/f1;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/16 v1, 0x1d

    .line 36
    .line 37
    if-lt v0, v1, :cond_2

    .line 38
    .line 39
    new-instance v0, Lm0/e1;

    .line 40
    .line 41
    invoke-direct {v0}, Lm0/e1;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v0, Lm0/c1;

    .line 46
    .line 47
    invoke-direct {v0}, Lm0/c1;-><init>()V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 v1, 0x0

    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-static {v1, v2, v1, v2}, Le0/b;->c(IIII)Le0/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Lm0/h1;->g(Le0/b;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lm0/h1;->b()Lm0/r1;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->P:Lm0/r1;

    .line 64
    .line 65
    new-instance v0, Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->Q:Landroid/graphics/Rect;

    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:I

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->v:Landroid/graphics/Rect;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->x:Landroid/graphics/Rect;

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->y:Landroid/graphics/Rect;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->z:Landroid/graphics/Rect;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Z

    .line 44
    .line 45
    iput-boolean p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 46
    .line 47
    sget-object p2, Lm0/r1;->b:Lm0/r1;

    .line 48
    .line 49
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->C:Lm0/r1;

    .line 50
    .line 51
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->D:Lm0/r1;

    .line 52
    .line 53
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 54
    .line 55
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->F:Lm0/r1;

    .line 56
    .line 57
    new-instance p2, Lb6/n;

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    invoke-direct {p2, v1, p0}, Lb6/n;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->J:Lb6/n;

    .line 64
    .line 65
    new-instance p2, Lm/c;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {p2, p0, v1}, Lm/c;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;I)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->K:Lm/c;

    .line 72
    .line 73
    new-instance p2, Lm/c;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-direct {p2, p0, v1}, Lm/c;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;I)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->L:Lm/c;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    new-instance p2, Landroidx/media3/common/p;

    .line 85
    .line 86
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->M:Landroidx/media3/common/p;

    .line 90
    .line 91
    new-instance p2, Lm/f;

    .line 92
    .line 93
    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->N:Lm/f;

    .line 100
    .line 101
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public static k(Landroid/view/View;IIII)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lm/e;

    .line 6
    .line 7
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 13
    .line 14
    move p1, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 18
    .line 19
    if-eq v0, p2, :cond_1

    .line 20
    .line 21
    iput p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 22
    .line 23
    move p1, v1

    .line 24
    :cond_1
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 25
    .line 26
    if-eq p2, p3, :cond_2

    .line 27
    .line 28
    iput p3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 29
    .line 30
    move p1, v1

    .line 31
    :cond_2
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 32
    .line 33
    if-eq p2, p4, :cond_3

    .line 34
    .line 35
    iput p4, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    return p1
.end method


# virtual methods
.method public final a(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->b(Landroid/view/View;IIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroid/view/View;IIIII)V
    .locals 0

    .line 1
    if-nez p6, :cond_0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lm/e;

    .line 2
    .line 3
    return p1
.end method

.method public final d(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-float v0, v0

    .line 24
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-float/2addr v2, v0

    .line 31
    const/high16 v0, 0x3f000000    # 0.5f

    .line 32
    .line 33
    add-float/2addr v2, v0

    .line 34
    float-to-int v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v0, v1

    .line 37
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    add-int/2addr v4, v0

    .line 50
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final e(Landroid/view/View;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStopNestedScroll(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final f(Landroid/view/View;II[II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->K:Lm/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->L:Lm/c;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->I:Landroid/view/ViewPropertyAnimator;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lm/e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lm/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 3
    new-instance v0, Lm/e;

    .line 4
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getActionBarHideOffset()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    float-to-int v0, v0

    .line 10
    neg-int v0, v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->M:Landroidx/media3/common/p;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/common/p;->a:I

    .line 4
    .line 5
    iget v0, v0, Landroidx/media3/common/p;->b:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 5
    .line 6
    check-cast v0, Lm/l2;

    .line 7
    .line 8
    iget-object v0, v0, Lm/l2;->a:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final h(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->O:[I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iput v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    move v1, v2

    .line 32
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/widget/OverScroller;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->H:Landroid/widget/OverScroller;

    .line 44
    .line 45
    return-void
.end method

.method public final i(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    const-string v1, "Progress display unsupported"

    .line 6
    .line 7
    const-string v2, "ToolbarWidgetWrapper"

    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x6d

    .line 15
    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 25
    .line 26
    check-cast p1, Lm/l2;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 36
    .line 37
    check-cast p1, Lm/l2;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const v0, 0x7f0a0036

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 13
    .line 14
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 15
    .line 16
    const v0, 0x7f0a0037

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroidx/appcompat/widget/ActionBarContainer;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 26
    .line 27
    const v0, 0x7f0a0035

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    instance-of v1, v0, Lm/d1;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Lm/d1;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lm/d1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "Can\'t make a decor toolbar out of "

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_2
    return-void
.end method

.method public final l(Landroid/view/Menu;Ll/y;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 5
    .line 6
    check-cast v0, Lm/l2;

    .line 7
    .line 8
    iget-object v1, v0, Lm/l2;->a:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object v2, v0, Lm/l2;->m:Lm/k;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lm/k;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v2, v3}, Lm/k;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object v2, v0, Lm/l2;->m:Lm/k;

    .line 24
    .line 25
    :cond_0
    iget-object v0, v0, Lm/l2;->m:Lm/k;

    .line 26
    .line 27
    iput-object p2, v0, Lm/k;->n:Ll/y;

    .line 28
    .line 29
    check-cast p1, Ll/m;

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    iget-object p2, v1, Landroidx/appcompat/widget/Toolbar;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 34
    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->f()V

    .line 39
    .line 40
    .line 41
    iget-object p2, v1, Landroidx/appcompat/widget/Toolbar;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 42
    .line 43
    iget-object p2, p2, Landroidx/appcompat/widget/ActionMenuView;->y:Ll/m;

    .line 44
    .line 45
    if-ne p2, p1, :cond_2

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_2
    if-eqz p2, :cond_3

    .line 49
    .line 50
    iget-object v2, v1, Landroidx/appcompat/widget/Toolbar;->T:Lm/k;

    .line 51
    .line 52
    invoke-virtual {p2, v2}, Ll/m;->r(Ll/z;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ll/m;->r(Ll/z;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object p2, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 61
    .line 62
    if-nez p2, :cond_4

    .line 63
    .line 64
    new-instance p2, Lm/g2;

    .line 65
    .line 66
    invoke-direct {p2, v1}, Lm/g2;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 67
    .line 68
    .line 69
    iput-object p2, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 70
    .line 71
    :cond_4
    const/4 p2, 0x1

    .line 72
    iput-boolean p2, v0, Lm/k;->z:Z

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object p2, v1, Landroidx/appcompat/widget/Toolbar;->s:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {p1, v0, p2}, Ll/m;->b(Ll/z;Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 82
    .line 83
    iget-object v2, v1, Landroidx/appcompat/widget/Toolbar;->s:Landroid/content/Context;

    .line 84
    .line 85
    invoke-virtual {p1, p2, v2}, Ll/m;->b(Ll/z;Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->s:Landroid/content/Context;

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    invoke-virtual {v0, p1, p2}, Lm/k;->i(Landroid/content/Context;Ll/m;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 96
    .line 97
    iget-object v2, v1, Landroidx/appcompat/widget/Toolbar;->s:Landroid/content/Context;

    .line 98
    .line 99
    invoke-virtual {p1, v2, p2}, Lm/g2;->i(Landroid/content/Context;Ll/m;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lm/k;->e()V

    .line 103
    .line 104
    .line 105
    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->U:Lm/g2;

    .line 106
    .line 107
    invoke-virtual {p1}, Lm/g2;->e()V

    .line 108
    .line 109
    .line 110
    :goto_1
    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 111
    .line 112
    iget p2, v1, Landroidx/appcompat/widget/Toolbar;->t:I

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lm/k;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, v1, Landroidx/appcompat/widget/Toolbar;->T:Lm/k;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->t()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    and-int/lit16 v1, v0, 0x100

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v3

    .line 17
    :goto_0
    and-int/lit16 v0, v0, 0x600

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v3

    .line 24
    :goto_1
    sget-object v4, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->N:Lm/f;

    .line 27
    .line 28
    sget-object v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;->P:Lm0/r1;

    .line 29
    .line 30
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->z:Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-static {v4, v5, v6}, Lm0/e0;->b(Landroid/view/View;Lm0/r1;Landroid/graphics/Rect;)Lm0/r1;

    .line 33
    .line 34
    .line 35
    sget-object v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;->Q:Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    xor-int/lit8 v5, v4, 0x1

    .line 42
    .line 43
    iput-boolean v5, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Z

    .line 44
    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v0, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    :goto_2
    move v0, v2

    .line 55
    :goto_3
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 58
    .line 59
    if-eqz v4, :cond_5

    .line 60
    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    move v0, v2

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move v0, v3

    .line 68
    :goto_4
    check-cast v4, Lh/g0;

    .line 69
    .line 70
    iput-boolean v0, v4, Lh/g0;->D:Z

    .line 71
    .line 72
    :cond_5
    invoke-static {p0, p1}, Lm0/r1;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/r1;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v0, p1, Lm0/r1;->a:Lm0/o1;

    .line 77
    .line 78
    invoke-virtual {v0}, Lm0/o1;->k()Le0/b;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget v4, v1, Le0/b;->a:I

    .line 83
    .line 84
    iget v5, v1, Le0/b;->a:I

    .line 85
    .line 86
    iget v6, v1, Le0/b;->b:I

    .line 87
    .line 88
    iget v7, v1, Le0/b;->c:I

    .line 89
    .line 90
    iget v1, v1, Le0/b;->d:I

    .line 91
    .line 92
    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->y:Landroid/graphics/Rect;

    .line 93
    .line 94
    invoke-virtual {v8, v4, v6, v7, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    .line 96
    .line 97
    iget-boolean v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 98
    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    const/4 v1, 0x2

    .line 102
    invoke-virtual {v0, v1}, Lm0/o1;->f(I)Le0/b;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget v4, v1, Le0/b;->a:I

    .line 107
    .line 108
    iget v8, v1, Le0/b;->c:I

    .line 109
    .line 110
    sub-int/2addr v5, v4

    .line 111
    sub-int/2addr v7, v8

    .line 112
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 113
    .line 114
    invoke-virtual {v4, v5, v6, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 115
    .line 116
    .line 117
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 118
    .line 119
    iget v1, v1, Le0/b;->a:I

    .line 120
    .line 121
    invoke-static {v4, v1, v3, v8, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k(Landroid/view/View;IIII)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 127
    .line 128
    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 132
    .line 133
    invoke-static {v1, v5, v6, v7, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k(Landroid/view/View;IIII)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :goto_5
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->v:Landroid/graphics/Rect;

    .line 138
    .line 139
    invoke-static {p0, p1, v3}, Lm0/e0;->b(Landroid/view/View;Lm0/r1;Landroid/graphics/Rect;)Lm0/r1;

    .line 140
    .line 141
    .line 142
    iget p1, v3, Landroid/graphics/Rect;->left:I

    .line 143
    .line 144
    iget v4, v3, Landroid/graphics/Rect;->top:I

    .line 145
    .line 146
    iget v5, v3, Landroid/graphics/Rect;->right:I

    .line 147
    .line 148
    iget v6, v3, Landroid/graphics/Rect;->bottom:I

    .line 149
    .line 150
    invoke-virtual {v0, p1, v4, v5, v6}, Lm0/o1;->m(IIII)Lm0/r1;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->C:Lm0/r1;

    .line 155
    .line 156
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->D:Lm0/r1;

    .line 157
    .line 158
    invoke-virtual {v4, p1}, Lm0/r1;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_7

    .line 163
    .line 164
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->C:Lm0/r1;

    .line 165
    .line 166
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->D:Lm0/r1;

    .line 167
    .line 168
    move v1, v2

    .line 169
    :cond_7
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Landroid/graphics/Rect;

    .line 170
    .line 171
    invoke-virtual {p1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_8

    .line 176
    .line 177
    invoke-virtual {p1, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    move v2, v1

    .line 182
    :goto_6
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 185
    .line 186
    .line 187
    :cond_9
    invoke-virtual {v0}, Lm0/o1;->a()Lm0/r1;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p1, p1, Lm0/r1;->a:Lm0/o1;

    .line 192
    .line 193
    invoke-virtual {p1}, Lm0/o1;->c()Lm0/r1;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object p1, p1, Lm0/r1;->a:Lm0/o1;

    .line 198
    .line 199
    invoke-virtual {p1}, Lm0/o1;->b()Lm0/r1;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Lm0/r1;->f()Landroid/view/WindowInsets;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    return-object p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-static {p0}, Lm0/c0;->c(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 p4, 0x0

    .line 14
    :goto_0
    if-ge p4, p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lm/e;

    .line 33
    .line 34
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 43
    .line 44
    add-int/2addr v3, p2

    .line 45
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 46
    .line 47
    add-int/2addr v0, p3

    .line 48
    add-int/2addr v1, v3

    .line 49
    add-int/2addr v2, v0

    .line 50
    invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 p4, p4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move v2, p1

    .line 10
    move v4, p2

    .line 11
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lm/e;

    .line 21
    .line 22
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 29
    .line 30
    add-int/2addr p2, v1

    .line 31
    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 32
    .line 33
    add-int/2addr p2, v1

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget v5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 46
    .line 47
    add-int/2addr v3, v5

    .line 48
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 49
    .line 50
    add-int/2addr v3, p1

    .line 51
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v1, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    sget-object v5, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    and-int/lit16 v5, v5, 0x100

    .line 72
    .line 73
    if-eqz v5, :cond_0

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v5, v1

    .line 78
    :goto_0
    if-eqz v5, :cond_2

    .line 79
    .line 80
    iget v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:I

    .line 81
    .line 82
    iget-boolean v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 83
    .line 84
    if-eqz v7, :cond_1

    .line 85
    .line 86
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->y:Landroid/graphics/Rect;

    .line 87
    .line 88
    iget v7, v7, Landroid/graphics/Rect;->top:I

    .line 89
    .line 90
    add-int/2addr v6, v7

    .line 91
    :cond_1
    iget-boolean v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q:Z

    .line 92
    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 96
    .line 97
    invoke-virtual {v7}, Landroidx/appcompat/widget/ActionBarContainer;->getTabContainer()Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    if-eqz v7, :cond_4

    .line 102
    .line 103
    iget v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:I

    .line 104
    .line 105
    add-int/2addr v6, v7

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 108
    .line 109
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    const/16 v7, 0x8

    .line 114
    .line 115
    if-eq v6, v7, :cond_3

    .line 116
    .line 117
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 118
    .line 119
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    goto :goto_1

    .line 124
    :cond_3
    move v6, v1

    .line 125
    :cond_4
    :goto_1
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->v:Landroid/graphics/Rect;

    .line 126
    .line 127
    iget-object v8, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->x:Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-virtual {v8, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 130
    .line 131
    .line 132
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->C:Lm0/r1;

    .line 133
    .line 134
    iput-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 135
    .line 136
    iget-boolean v9, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->p:Z

    .line 137
    .line 138
    if-nez v9, :cond_6

    .line 139
    .line 140
    if-nez v5, :cond_6

    .line 141
    .line 142
    iget-boolean v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->A:Z

    .line 143
    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    iget-boolean v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 147
    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    iget v5, v8, Landroid/graphics/Rect;->top:I

    .line 151
    .line 152
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    iput v5, v8, Landroid/graphics/Rect;->top:I

    .line 157
    .line 158
    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 159
    .line 160
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    iput v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    iget v5, v8, Landroid/graphics/Rect;->top:I

    .line 168
    .line 169
    add-int/2addr v5, v6

    .line 170
    iput v5, v8, Landroid/graphics/Rect;->top:I

    .line 171
    .line 172
    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 173
    .line 174
    iput v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 175
    .line 176
    :goto_2
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 177
    .line 178
    iget-object v5, v5, Lm0/r1;->a:Lm0/o1;

    .line 179
    .line 180
    invoke-virtual {v5, v1, v6, v1, v1}, Lm0/o1;->m(IIII)Lm0/r1;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 185
    .line 186
    goto/16 :goto_5

    .line 187
    .line 188
    :cond_6
    iget-boolean v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 189
    .line 190
    if-eqz v5, :cond_7

    .line 191
    .line 192
    invoke-virtual {v7}, Lm0/r1;->b()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 197
    .line 198
    invoke-virtual {v7}, Lm0/r1;->d()I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 207
    .line 208
    invoke-virtual {v7}, Lm0/r1;->c()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    iget-object v9, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 213
    .line 214
    invoke-virtual {v9}, Lm0/r1;->a()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {v5, v6, v7, v1}, Le0/b;->c(IIII)Le0/b;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    goto :goto_3

    .line 227
    :cond_7
    invoke-virtual {v7}, Lm0/r1;->b()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 232
    .line 233
    invoke-virtual {v5}, Lm0/r1;->d()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    add-int/2addr v5, v6

    .line 238
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 239
    .line 240
    invoke-virtual {v6}, Lm0/r1;->c()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 245
    .line 246
    invoke-virtual {v7}, Lm0/r1;->a()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    invoke-static {v1, v5, v6, v7}, Le0/b;->c(IIII)Le0/b;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :goto_3
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 255
    .line 256
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 257
    .line 258
    const/16 v7, 0x22

    .line 259
    .line 260
    if-lt v6, v7, :cond_8

    .line 261
    .line 262
    new-instance v6, Lm0/g1;

    .line 263
    .line 264
    invoke-direct {v6, v5}, Lm0/g1;-><init>(Lm0/r1;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_8
    const/16 v7, 0x1e

    .line 269
    .line 270
    if-lt v6, v7, :cond_9

    .line 271
    .line 272
    new-instance v6, Lm0/f1;

    .line 273
    .line 274
    invoke-direct {v6, v5}, Lm0/f1;-><init>(Lm0/r1;)V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_9
    const/16 v7, 0x1d

    .line 279
    .line 280
    if-lt v6, v7, :cond_a

    .line 281
    .line 282
    new-instance v6, Lm0/e1;

    .line 283
    .line 284
    invoke-direct {v6, v5}, Lm0/e1;-><init>(Lm0/r1;)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_a
    new-instance v6, Lm0/c1;

    .line 289
    .line 290
    invoke-direct {v6, v5}, Lm0/c1;-><init>(Lm0/r1;)V

    .line 291
    .line 292
    .line 293
    :goto_4
    invoke-virtual {v6, v1}, Lm0/h1;->g(Le0/b;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Lm0/h1;->b()Lm0/r1;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 301
    .line 302
    :goto_5
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 303
    .line 304
    iget v5, v8, Landroid/graphics/Rect;->left:I

    .line 305
    .line 306
    iget v6, v8, Landroid/graphics/Rect;->top:I

    .line 307
    .line 308
    iget v7, v8, Landroid/graphics/Rect;->right:I

    .line 309
    .line 310
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 311
    .line 312
    invoke-static {v1, v5, v6, v7, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k(Landroid/view/View;IIII)Z

    .line 313
    .line 314
    .line 315
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->F:Lm0/r1;

    .line 316
    .line 317
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 318
    .line 319
    invoke-virtual {v1, v5}, Lm0/r1;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-nez v1, :cond_b

    .line 324
    .line 325
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->E:Lm0/r1;

    .line 326
    .line 327
    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->F:Lm0/r1;

    .line 328
    .line 329
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 330
    .line 331
    invoke-static {v5, v1}, Lm0/m0;->b(Landroid/view/View;Lm0/r1;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 335
    .line 336
    const/4 v9, 0x0

    .line 337
    const/4 v11, 0x0

    .line 338
    move-object v6, v0

    .line 339
    move v8, v2

    .line 340
    move v10, v4

    .line 341
    invoke-virtual/range {v6 .. v11}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 342
    .line 343
    .line 344
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 345
    .line 346
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Lm/e;

    .line 351
    .line 352
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 353
    .line 354
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 359
    .line 360
    add-int/2addr v5, v6

    .line 361
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 362
    .line 363
    add-int/2addr v5, v6

    .line 364
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 365
    .line 366
    .line 367
    move-result p2

    .line 368
    iget-object v5, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 369
    .line 370
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 375
    .line 376
    add-int/2addr v5, v6

    .line 377
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 378
    .line 379
    add-int/2addr v5, v1

    .line 380
    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 385
    .line 386
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-static {v3, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    add-int/2addr v5, v3

    .line 403
    add-int/2addr v5, p2

    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    add-int/2addr v3, p2

    .line 413
    add-int/2addr v3, p1

    .line 414
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    invoke-static {v5, p2}, Ljava/lang/Math;->max(II)I

    .line 427
    .line 428
    .line 429
    move-result p2

    .line 430
    invoke-static {p2, v2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 431
    .line 432
    .line 433
    move-result p2

    .line 434
    shl-int/lit8 v1, v1, 0x10

    .line 435
    .line 436
    invoke-static {p1, v4, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 441
    .line 442
    .line 443
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 9

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->H:Landroid/widget/OverScroller;

    .line 9
    .line 10
    float-to-int v4, p3

    .line 11
    const/high16 v7, -0x80000000

    .line 12
    .line 13
    const v8, 0x7fffffff

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->H:Landroid/widget/OverScroller;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-le p1, p2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->L:Lm/c;

    .line 42
    .line 43
    invoke-virtual {p1}, Lm/c;->run()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->K:Lm/c;

    .line 51
    .line 52
    invoke-virtual {p1}, Lm/c;->run()V

    .line 53
    .line 54
    .line 55
    :goto_0
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->s:Z

    .line 57
    .line 58
    return p1

    .line 59
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->t:I

    .line 2
    .line 3
    add-int/2addr p1, p3

    .line 4
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->t:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->M:Landroidx/media3/common/p;

    .line 2
    .line 3
    iput p3, p1, Landroidx/media3/common/p;->a:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->t:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    check-cast p1, Lh/g0;

    .line 19
    .line 20
    iget-object p2, p1, Lh/g0;->H:Lk/j;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p2}, Lk/j;->a()V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    iput-object p2, p1, Lh/g0;->H:Lk/j;

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 1
    and-int/lit8 p1, p3, 0x2

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r:Z

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->s:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->t:I

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-wide/16 v1, 0x258

    .line 18
    .line 19
    if-gt p1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->K:Lm/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->L:Lm/c;

    .line 34
    .line 35
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public final onWindowSystemUiVisibilityChanged(I)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowSystemUiVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->u:I

    .line 8
    .line 9
    xor-int/2addr v0, p1

    .line 10
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->u:I

    .line 11
    .line 12
    and-int/lit8 v1, p1, 0x4

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v1, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    :goto_0
    and-int/lit16 p1, p1, 0x100

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move p1, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p1, v2

    .line 28
    :goto_1
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 29
    .line 30
    if-eqz v4, :cond_5

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-boolean v5, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 35
    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    move v5, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v5, v2

    .line 41
    :goto_2
    check-cast v4, Lh/g0;

    .line 42
    .line 43
    iput-boolean v5, v4, Lh/g0;->D:Z

    .line 44
    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    iget-boolean p1, v4, Lh/g0;->E:Z

    .line 51
    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    iput-boolean v3, v4, Lh/g0;->E:Z

    .line 55
    .line 56
    invoke-virtual {v4, v3}, Lh/g0;->m0(Z)V

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    :goto_3
    iget-boolean p1, v4, Lh/g0;->E:Z

    .line 61
    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    iput-boolean v2, v4, Lh/g0;->E:Z

    .line 65
    .line 66
    invoke-virtual {v4, v3}, Lh/g0;->m0(Z)V

    .line 67
    .line 68
    .line 69
    :cond_5
    :goto_4
    and-int/lit16 p1, v0, 0x100

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 74
    .line 75
    if-eqz p1, :cond_6

    .line 76
    .line 77
    sget-object p1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 78
    .line 79
    invoke-static {p0}, Lm0/c0;->c(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:I

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast v0, Lh/g0;

    .line 11
    .line 12
    iput p1, v0, Lh/g0;->C:I

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setActionBarHideOffset(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:Landroidx/appcompat/widget/ActionBarContainer;

    .line 20
    .line 21
    neg-int p1, p1

    .line 22
    int-to-float p1, p1

    .line 23
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setActionBarVisibilityCallback(Lm/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->G:Lm/d;

    .line 10
    .line 11
    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:I

    .line 12
    .line 13
    check-cast p1, Lh/g0;

    .line 14
    .line 15
    iput v0, p1, Lh/g0;->C:I

    .line 16
    .line 17
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->u:I

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-static {p0}, Lm0/c0;->c(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public setHasNonEmbeddedTabs(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHideOnContentScrollEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->r:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setIcon(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    check-cast v0, Lm/l2;

    if-eqz p1, :cond_0

    .line 3
    iget-object v1, v0, Lm/l2;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 5
    invoke-static {v1, p1}, Lcom/bumptech/glide/d;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    iput-object p1, v0, Lm/l2;->d:Landroid/graphics/drawable/Drawable;

    .line 7
    invoke-virtual {v0}, Lm/l2;->c()V

    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    check-cast v0, Lm/l2;

    .line 10
    iput-object p1, v0, Lm/l2;->d:Landroid/graphics/drawable/Drawable;

    .line 11
    invoke-virtual {v0}, Lm/l2;->c()V

    return-void
.end method

.method public setLogo(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 5
    .line 6
    check-cast v0, Lm/l2;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v1, v0, Lm/l2;->a:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, p1}, Lcom/bumptech/glide/d;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-object p1, v0, Lm/l2;->e:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {v0}, Lm/l2;->c()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setOverlayMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public setShowingForActionMode(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setUiOptions(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 5
    .line 6
    check-cast v0, Lm/l2;

    .line 7
    .line 8
    iput-object p1, v0, Lm/l2;->k:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:Lm/d1;

    .line 5
    .line 6
    check-cast v0, Lm/l2;

    .line 7
    .line 8
    iget-boolean v1, v0, Lm/l2;->g:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Lm/l2;->a:Landroidx/appcompat/widget/Toolbar;

    .line 13
    .line 14
    iput-object p1, v0, Lm/l2;->h:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget v2, v0, Lm/l2;->b:I

    .line 17
    .line 18
    and-int/lit8 v2, v2, 0x8

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v0, v0, Lm/l2;->g:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, p1}, Lm0/m0;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
