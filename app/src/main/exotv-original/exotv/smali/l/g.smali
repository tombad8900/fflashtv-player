.class public final Ll/g;
.super Ll/v;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Ll/y;

.field public H:Landroid/view/ViewTreeObserver;

.field public I:Landroid/widget/PopupWindow$OnDismissListener;

.field public J:Z

.field public final k:Landroid/content/Context;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:Z

.field public final p:Landroid/os/Handler;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ljava/util/ArrayList;

.field public final s:Ll/d;

.field public final t:La1/t0;

.field public final u:La1/o;

.field public v:I

.field public w:I

.field public x:Landroid/view/View;

.field public y:Landroid/view/View;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ll/g;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ll/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Ll/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll/g;->s:Ll/d;

    .line 25
    .line 26
    new-instance v0, La1/t0;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, v1, p0}, La1/t0;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ll/g;->t:La1/t0;

    .line 33
    .line 34
    new-instance v0, La1/o;

    .line 35
    .line 36
    const/16 v1, 0x1d

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ll/g;->u:La1/o;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Ll/g;->v:I

    .line 45
    .line 46
    iput v0, p0, Ll/g;->w:I

    .line 47
    .line 48
    iput-object p1, p0, Ll/g;->k:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Ll/g;->x:Landroid/view/View;

    .line 51
    .line 52
    iput p3, p0, Ll/g;->m:I

    .line 53
    .line 54
    iput p4, p0, Ll/g;->n:I

    .line 55
    .line 56
    iput-boolean p5, p0, Ll/g;->o:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Ll/g;->E:Z

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    const/4 p3, 0x1

    .line 65
    if-ne p2, p3, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v0, p3

    .line 69
    :goto_0
    iput v0, p0, Ll/g;->z:I

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 80
    .line 81
    div-int/lit8 p2, p2, 0x2

    .line 82
    .line 83
    const p3, 0x7f070017

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput p1, p0, Ll/g;->l:I

    .line 95
    .line 96
    new-instance p1, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Ll/g;->p:Landroid/os/Handler;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ll/f;

    .line 15
    .line 16
    iget-object v0, v0, Ll/f;->a:Lm/w1;

    .line 17
    .line 18
    iget-object v0, v0, Lm/t1;->I:Lm/a0;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final b(Ll/m;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ll/f;

    .line 16
    .line 17
    iget-object v4, v4, Ll/f;->b:Ll/m;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ll/f;

    .line 43
    .line 44
    iget-object v1, v1, Ll/f;->b:Ll/m;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ll/m;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ll/f;

    .line 54
    .line 55
    iget-object v3, v1, Ll/f;->b:Ll/m;

    .line 56
    .line 57
    iget-object v1, v1, Ll/f;->a:Lm/w1;

    .line 58
    .line 59
    iget-object v4, v1, Lm/t1;->I:Lm/a0;

    .line 60
    .line 61
    invoke-virtual {v3, p0}, Ll/m;->r(Ll/z;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v3, p0, Ll/g;->J:Z

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v1}, Lm/t1;->dismiss()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v3, 0x1

    .line 83
    if-lez v1, :cond_5

    .line 84
    .line 85
    add-int/lit8 v4, v1, -0x1

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Ll/f;

    .line 92
    .line 93
    iget v4, v4, Ll/f;->c:I

    .line 94
    .line 95
    iput v4, p0, Ll/g;->z:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object v4, p0, Ll/g;->x:Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-ne v4, v3, :cond_6

    .line 105
    .line 106
    move v4, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move v4, v3

    .line 109
    :goto_2
    iput v4, p0, Ll/g;->z:I

    .line 110
    .line 111
    :goto_3
    if-nez v1, :cond_a

    .line 112
    .line 113
    invoke-virtual {p0}, Ll/g;->dismiss()V

    .line 114
    .line 115
    .line 116
    iget-object p2, p0, Ll/g;->G:Ll/y;

    .line 117
    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    invoke-interface {p2, p1, v3}, Ll/y;->b(Ll/m;Z)V

    .line 121
    .line 122
    .line 123
    :cond_7
    iget-object p1, p0, Ll/g;->H:Landroid/view/ViewTreeObserver;

    .line 124
    .line 125
    if-eqz p1, :cond_9

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    iget-object p1, p0, Ll/g;->H:Landroid/view/ViewTreeObserver;

    .line 134
    .line 135
    iget-object p2, p0, Ll/g;->s:Ll/d;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    iput-object v5, p0, Ll/g;->H:Landroid/view/ViewTreeObserver;

    .line 141
    .line 142
    :cond_9
    iget-object p1, p0, Ll/g;->y:Landroid/view/View;

    .line 143
    .line 144
    iget-object p2, p0, Ll/g;->t:La1/t0;

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Ll/g;->I:Landroid/widget/PopupWindow$OnDismissListener;

    .line 150
    .line 151
    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_a
    if-eqz p2, :cond_b

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Ll/f;

    .line 162
    .line 163
    iget-object p1, p1, Ll/f;->b:Ll/m;

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Ll/m;->c(Z)V

    .line 166
    .line 167
    .line 168
    :cond_b
    :goto_4
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Ll/f;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Ll/f;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Ll/f;->a:Lm/w1;

    .line 24
    .line 25
    iget-object v3, v3, Lm/t1;->I:Lm/a0;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Ll/f;->a:Lm/w1;

    .line 34
    .line 35
    invoke-virtual {v2}, Lm/t1;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Ll/f;

    .line 17
    .line 18
    iget-object v3, v3, Ll/f;->a:Lm/w1;

    .line 19
    .line 20
    iget-object v3, v3, Lm/t1;->l:Lm/i1;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, Landroid/widget/HeaderViewListAdapter;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    check-cast v3, Landroid/widget/HeaderViewListAdapter;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ll/j;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v3, Ll/j;

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v3}, Ll/j;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ll/g;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ll/g;->q:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Ll/m;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Ll/g;->u(Ll/m;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ll/g;->x:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Ll/g;->y:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Ll/g;->H:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Ll/g;->H:Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Ll/g;->s:Ll/d;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Ll/g;->y:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, p0, Ll/g;->t:La1/t0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final g(Ll/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/g;->G:Ll/y;

    .line 2
    .line 3
    return-void
.end method

.method public final h()Lm/i1;
    .locals 2

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ll/f;

    .line 22
    .line 23
    iget-object v0, v0, Ll/f;->a:Lm/w1;

    .line 24
    .line 25
    iget-object v0, v0, Lm/t1;->l:Lm/i1;

    .line 26
    .line 27
    return-object v0
.end method

.method public final j(Ll/f0;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    check-cast v5, Ll/f;

    .line 19
    .line 20
    iget-object v6, v5, Ll/f;->b:Ll/m;

    .line 21
    .line 22
    if-ne p1, v6, :cond_0

    .line 23
    .line 24
    iget-object p1, v5, Ll/f;->a:Lm/w1;

    .line 25
    .line 26
    iget-object p1, p1, Lm/t1;->l:Lm/i1;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Ll/m;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ll/g;->l(Ll/m;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ll/g;->G:Ll/y;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Ll/y;->i(Ll/m;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v4

    .line 49
    :cond_3
    return v2
.end method

.method public final l(Ll/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/g;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Ll/m;->b(Ll/z;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll/g;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ll/g;->u(Ll/m;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Ll/g;->q:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/g;->x:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ll/g;->x:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Ll/g;->v:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ll/g;->w:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll/g;->E:Z

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ll/f;

    .line 16
    .line 17
    iget-object v5, v4, Ll/f;->a:Lm/w1;

    .line 18
    .line 19
    iget-object v5, v5, Lm/t1;->I:Lm/a0;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Ll/f;->b:Ll/m;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ll/m;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ll/g;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 1

    .line 1
    iget v0, p0, Ll/g;->v:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ll/g;->v:I

    .line 6
    .line 7
    iget-object v0, p0, Ll/g;->x:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ll/g;->w:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll/g;->A:Z

    .line 3
    .line 4
    iput p1, p0, Ll/g;->C:I

    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/g;->I:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll/g;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll/g;->B:Z

    .line 3
    .line 4
    iput p1, p0, Ll/g;->D:I

    .line 5
    .line 6
    return-void
.end method

.method public final u(Ll/m;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ll/g;->k:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ll/j;

    .line 12
    .line 13
    iget-boolean v5, v0, Ll/g;->o:Z

    .line 14
    .line 15
    const v6, 0x7f0d000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v4, v1, v3, v5, v6}, Ll/j;-><init>(Ll/m;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ll/g;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-boolean v5, v0, Ll/g;->E:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iput-boolean v6, v4, Ll/j;->c:Z

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-virtual {v0}, Ll/g;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    iget-object v5, v1, Ll/m;->o:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v8, 0x0

    .line 48
    :goto_0
    if-ge v8, v5, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1, v8}, Ll/m;->getItem(I)Landroid/view/MenuItem;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-interface {v9}, Landroid/view/MenuItem;->isVisible()Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    invoke-interface {v9}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    move v5, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v5, 0x0

    .line 72
    :goto_1
    iput-boolean v5, v4, Ll/j;->c:Z

    .line 73
    .line 74
    :cond_3
    :goto_2
    iget v5, v0, Ll/g;->l:I

    .line 75
    .line 76
    invoke-static {v4, v2, v5}, Ll/v;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    new-instance v8, Lm/w1;

    .line 81
    .line 82
    iget v9, v0, Ll/g;->m:I

    .line 83
    .line 84
    iget v10, v0, Ll/g;->n:I

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    invoke-direct {v8, v2, v11, v9, v10}, Lm/t1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 88
    .line 89
    .line 90
    iget-object v2, v0, Ll/g;->u:La1/o;

    .line 91
    .line 92
    iput-object v2, v8, Lm/w1;->L:La1/o;

    .line 93
    .line 94
    iput-object v0, v8, Lm/t1;->y:Landroid/widget/AdapterView$OnItemClickListener;

    .line 95
    .line 96
    iget-object v2, v8, Lm/t1;->I:Lm/a0;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, Ll/g;->x:Landroid/view/View;

    .line 102
    .line 103
    iput-object v2, v8, Lm/t1;->x:Landroid/view/View;

    .line 104
    .line 105
    iget v2, v0, Ll/g;->w:I

    .line 106
    .line 107
    iput v2, v8, Lm/t1;->u:I

    .line 108
    .line 109
    iput-boolean v6, v8, Lm/t1;->H:Z

    .line 110
    .line 111
    iget-object v2, v8, Lm/t1;->I:Lm/a0;

    .line 112
    .line 113
    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 114
    .line 115
    .line 116
    iget-object v2, v8, Lm/t1;->I:Lm/a0;

    .line 117
    .line 118
    const/4 v9, 0x2

    .line 119
    invoke-virtual {v2, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v4}, Lm/t1;->p(Landroid/widget/ListAdapter;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v5}, Lm/t1;->r(I)V

    .line 126
    .line 127
    .line 128
    iget v2, v0, Ll/g;->w:I

    .line 129
    .line 130
    iput v2, v8, Lm/t1;->u:I

    .line 131
    .line 132
    iget-object v2, v0, Ll/g;->r:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-lez v4, :cond_d

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    sub-int/2addr v4, v6

    .line 145
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Ll/f;

    .line 150
    .line 151
    iget-object v10, v4, Ll/f;->b:Ll/m;

    .line 152
    .line 153
    iget-object v12, v10, Ll/m;->o:Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    const/4 v13, 0x0

    .line 160
    :goto_3
    if-ge v13, v12, :cond_5

    .line 161
    .line 162
    invoke-virtual {v10, v13}, Ll/m;->getItem(I)Landroid/view/MenuItem;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-eqz v15, :cond_4

    .line 171
    .line 172
    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    if-ne v1, v15, :cond_4

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_5
    move-object v14, v11

    .line 183
    :goto_4
    if-nez v14, :cond_6

    .line 184
    .line 185
    move/from16 v17, v6

    .line 186
    .line 187
    move-object v6, v11

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_6
    iget-object v10, v4, Ll/f;->a:Lm/w1;

    .line 192
    .line 193
    iget-object v10, v10, Lm/t1;->l:Lm/i1;

    .line 194
    .line 195
    invoke-virtual {v10}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 200
    .line 201
    if-eqz v13, :cond_7

    .line 202
    .line 203
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 204
    .line 205
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    check-cast v12, Ll/j;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_7
    check-cast v12, Ll/j;

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    :goto_5
    invoke-virtual {v12}, Ll/j;->getCount()I

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    move/from16 v17, v6

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    :goto_6
    const/4 v6, -0x1

    .line 229
    if-ge v7, v15, :cond_9

    .line 230
    .line 231
    invoke-virtual {v12, v7}, Ll/j;->b(I)Ll/p;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    if-ne v14, v9, :cond_8

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 239
    .line 240
    const/4 v9, 0x2

    .line 241
    goto :goto_6

    .line 242
    :cond_9
    move v7, v6

    .line 243
    :goto_7
    if-ne v7, v6, :cond_b

    .line 244
    .line 245
    :cond_a
    :goto_8
    move-object v6, v11

    .line 246
    goto :goto_9

    .line 247
    :cond_b
    add-int/2addr v7, v13

    .line 248
    invoke-virtual {v10}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    sub-int/2addr v7, v6

    .line 253
    if-ltz v7, :cond_a

    .line 254
    .line 255
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-lt v7, v6, :cond_c

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_c
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    goto :goto_9

    .line 267
    :cond_d
    move/from16 v17, v6

    .line 268
    .line 269
    const/16 v16, 0x0

    .line 270
    .line 271
    move-object v4, v11

    .line 272
    move-object v6, v4

    .line 273
    :goto_9
    if-eqz v6, :cond_19

    .line 274
    .line 275
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 276
    .line 277
    const/16 v9, 0x1c

    .line 278
    .line 279
    iget-object v10, v8, Lm/t1;->I:Lm/a0;

    .line 280
    .line 281
    if-gt v7, v9, :cond_e

    .line 282
    .line 283
    sget-object v7, Lm/w1;->M:Ljava/lang/reflect/Method;

    .line 284
    .line 285
    if-eqz v7, :cond_f

    .line 286
    .line 287
    :try_start_0
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 288
    .line 289
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    invoke-virtual {v7, v10, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    .line 295
    .line 296
    goto :goto_a

    .line 297
    :catch_0
    const-string v7, "MenuPopupWindow"

    .line 298
    .line 299
    const-string v9, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 300
    .line 301
    invoke-static {v7, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_e
    invoke-static {v10}, Landroidx/media3/common/e;->g(Landroid/widget/PopupWindow;)V

    .line 306
    .line 307
    .line 308
    :cond_f
    :goto_a
    iget-object v7, v8, Lm/t1;->I:Lm/a0;

    .line 309
    .line 310
    invoke-virtual {v7, v11}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    add-int/lit8 v7, v7, -0x1

    .line 318
    .line 319
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    check-cast v7, Ll/f;

    .line 324
    .line 325
    iget-object v7, v7, Ll/f;->a:Lm/w1;

    .line 326
    .line 327
    iget-object v7, v7, Lm/t1;->l:Lm/i1;

    .line 328
    .line 329
    const/4 v9, 0x2

    .line 330
    new-array v10, v9, [I

    .line 331
    .line 332
    invoke-virtual {v7, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 333
    .line 334
    .line 335
    new-instance v9, Landroid/graphics/Rect;

    .line 336
    .line 337
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 338
    .line 339
    .line 340
    iget-object v12, v0, Ll/g;->y:Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {v12, v9}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 343
    .line 344
    .line 345
    iget v12, v0, Ll/g;->z:I

    .line 346
    .line 347
    move/from16 v13, v17

    .line 348
    .line 349
    if-ne v12, v13, :cond_12

    .line 350
    .line 351
    aget v10, v10, v16

    .line 352
    .line 353
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    add-int/2addr v7, v10

    .line 358
    add-int/2addr v7, v5

    .line 359
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 360
    .line 361
    if-le v7, v9, :cond_11

    .line 362
    .line 363
    :cond_10
    move/from16 v7, v16

    .line 364
    .line 365
    :goto_b
    const/4 v13, 0x1

    .line 366
    goto :goto_d

    .line 367
    :cond_11
    :goto_c
    const/4 v7, 0x1

    .line 368
    goto :goto_b

    .line 369
    :cond_12
    aget v7, v10, v16

    .line 370
    .line 371
    sub-int/2addr v7, v5

    .line 372
    if-gez v7, :cond_10

    .line 373
    .line 374
    goto :goto_c

    .line 375
    :goto_d
    if-ne v7, v13, :cond_13

    .line 376
    .line 377
    const/4 v13, 0x1

    .line 378
    goto :goto_e

    .line 379
    :cond_13
    move/from16 v13, v16

    .line 380
    .line 381
    :goto_e
    iput v7, v0, Ll/g;->z:I

    .line 382
    .line 383
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 384
    .line 385
    const/16 v9, 0x1a

    .line 386
    .line 387
    const/4 v10, 0x5

    .line 388
    if-lt v7, v9, :cond_14

    .line 389
    .line 390
    iput-object v6, v8, Lm/t1;->x:Landroid/view/View;

    .line 391
    .line 392
    move/from16 v9, v16

    .line 393
    .line 394
    move v12, v9

    .line 395
    goto :goto_f

    .line 396
    :cond_14
    const/4 v9, 0x2

    .line 397
    new-array v7, v9, [I

    .line 398
    .line 399
    iget-object v12, v0, Ll/g;->x:Landroid/view/View;

    .line 400
    .line 401
    invoke-virtual {v12, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 402
    .line 403
    .line 404
    new-array v9, v9, [I

    .line 405
    .line 406
    invoke-virtual {v6, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 407
    .line 408
    .line 409
    iget v12, v0, Ll/g;->w:I

    .line 410
    .line 411
    and-int/lit8 v12, v12, 0x7

    .line 412
    .line 413
    if-ne v12, v10, :cond_15

    .line 414
    .line 415
    aget v12, v7, v16

    .line 416
    .line 417
    iget-object v14, v0, Ll/g;->x:Landroid/view/View;

    .line 418
    .line 419
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 420
    .line 421
    .line 422
    move-result v14

    .line 423
    add-int/2addr v14, v12

    .line 424
    aput v14, v7, v16

    .line 425
    .line 426
    aget v12, v9, v16

    .line 427
    .line 428
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 429
    .line 430
    .line 431
    move-result v14

    .line 432
    add-int/2addr v14, v12

    .line 433
    aput v14, v9, v16

    .line 434
    .line 435
    :cond_15
    aget v12, v9, v16

    .line 436
    .line 437
    aget v14, v7, v16

    .line 438
    .line 439
    sub-int/2addr v12, v14

    .line 440
    const/16 v17, 0x1

    .line 441
    .line 442
    aget v9, v9, v17

    .line 443
    .line 444
    aget v7, v7, v17

    .line 445
    .line 446
    sub-int/2addr v9, v7

    .line 447
    :goto_f
    iget v7, v0, Ll/g;->w:I

    .line 448
    .line 449
    and-int/2addr v7, v10

    .line 450
    if-ne v7, v10, :cond_18

    .line 451
    .line 452
    if-eqz v13, :cond_16

    .line 453
    .line 454
    add-int/2addr v12, v5

    .line 455
    goto :goto_10

    .line 456
    :cond_16
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    :cond_17
    sub-int/2addr v12, v5

    .line 461
    goto :goto_10

    .line 462
    :cond_18
    if-eqz v13, :cond_17

    .line 463
    .line 464
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    add-int/2addr v12, v5

    .line 469
    :goto_10
    iput v12, v8, Lm/t1;->o:I

    .line 470
    .line 471
    const/4 v13, 0x1

    .line 472
    iput-boolean v13, v8, Lm/t1;->t:Z

    .line 473
    .line 474
    iput-boolean v13, v8, Lm/t1;->s:Z

    .line 475
    .line 476
    invoke-virtual {v8, v9}, Lm/t1;->k(I)V

    .line 477
    .line 478
    .line 479
    goto :goto_12

    .line 480
    :cond_19
    iget-boolean v5, v0, Ll/g;->A:Z

    .line 481
    .line 482
    if-eqz v5, :cond_1a

    .line 483
    .line 484
    iget v5, v0, Ll/g;->C:I

    .line 485
    .line 486
    iput v5, v8, Lm/t1;->o:I

    .line 487
    .line 488
    :cond_1a
    iget-boolean v5, v0, Ll/g;->B:Z

    .line 489
    .line 490
    if-eqz v5, :cond_1b

    .line 491
    .line 492
    iget v5, v0, Ll/g;->D:I

    .line 493
    .line 494
    invoke-virtual {v8, v5}, Lm/t1;->k(I)V

    .line 495
    .line 496
    .line 497
    :cond_1b
    iget-object v5, v0, Ll/v;->j:Landroid/graphics/Rect;

    .line 498
    .line 499
    if-eqz v5, :cond_1c

    .line 500
    .line 501
    new-instance v6, Landroid/graphics/Rect;

    .line 502
    .line 503
    invoke-direct {v6, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 504
    .line 505
    .line 506
    goto :goto_11

    .line 507
    :cond_1c
    move-object v6, v11

    .line 508
    :goto_11
    iput-object v6, v8, Lm/t1;->G:Landroid/graphics/Rect;

    .line 509
    .line 510
    :goto_12
    new-instance v5, Ll/f;

    .line 511
    .line 512
    iget v6, v0, Ll/g;->z:I

    .line 513
    .line 514
    invoke-direct {v5, v8, v1, v6}, Ll/f;-><init>(Lm/w1;Ll/m;I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    invoke-virtual {v8}, Lm/t1;->f()V

    .line 521
    .line 522
    .line 523
    iget-object v2, v8, Lm/t1;->l:Lm/i1;

    .line 524
    .line 525
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 526
    .line 527
    .line 528
    if-nez v4, :cond_1d

    .line 529
    .line 530
    iget-boolean v4, v0, Ll/g;->F:Z

    .line 531
    .line 532
    if-eqz v4, :cond_1d

    .line 533
    .line 534
    iget-object v4, v1, Ll/m;->v:Ljava/lang/CharSequence;

    .line 535
    .line 536
    if-eqz v4, :cond_1d

    .line 537
    .line 538
    const v4, 0x7f0d0012

    .line 539
    .line 540
    .line 541
    move/from16 v5, v16

    .line 542
    .line 543
    invoke-virtual {v3, v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    check-cast v3, Landroid/widget/FrameLayout;

    .line 548
    .line 549
    const v4, 0x1020016

    .line 550
    .line 551
    .line 552
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    check-cast v4, Landroid/widget/TextView;

    .line 557
    .line 558
    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 559
    .line 560
    .line 561
    iget-object v1, v1, Ll/m;->v:Ljava/lang/CharSequence;

    .line 562
    .line 563
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v3, v11, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v8}, Lm/t1;->f()V

    .line 570
    .line 571
    .line 572
    :cond_1d
    return-void
.end method
