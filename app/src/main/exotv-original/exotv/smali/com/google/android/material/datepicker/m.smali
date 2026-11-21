.class public final Lcom/google/android/material/datepicker/m;
.super Lcom/google/android/material/datepicker/y;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/y;"
    }
.end annotation


# instance fields
.field public d0:I

.field public e0:Lcom/google/android/material/datepicker/b;

.field public f0:Lcom/google/android/material/datepicker/s;

.field public g0:I

.field public h0:La4/c;

.field public i0:Landroidx/recyclerview/widget/RecyclerView;

.field public j0:Landroidx/recyclerview/widget/RecyclerView;

.field public k0:Landroid/view/View;

.field public l0:Landroid/view/View;

.field public m0:Landroid/view/View;

.field public n0:Landroid/view/View;

.field public o0:Lcom/google/android/material/button/MaterialButton;

.field public p0:Landroid/view/accessibility/AccessibilityManager;

.field public q0:Lz2/u;

.field public r0:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static I(Lcom/google/android/material/datepicker/m;Z)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/m;->r0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    move v3, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 v3, -0x1

    .line 40
    :goto_0
    add-int/2addr v2, v3

    .line 41
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v3, v0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/b;

    .line 44
    .line 45
    iget v3, v3, Lcom/google/android/material/datepicker/b;->p:I

    .line 46
    .line 47
    if-ge v2, v3, :cond_5

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move p1, v1

    .line 54
    :goto_1
    iput p1, v0, Lcom/google/android/material/datepicker/x;->i:I

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/s;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/m;->J(Lcom/google/android/material/datepicker/s;)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 65
    return p0
.end method


# virtual methods
.method public final H(Ly5/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/y;->c0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final J(Lcom/google/android/material/datepicker/s;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->p0:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->g0(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int v0, v1, v0

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x3

    .line 46
    if-le v2, v5, :cond_1

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v3

    .line 51
    :goto_0
    if-lez v0, :cond_2

    .line 52
    .line 53
    move v3, v4

    .line 54
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    add-int/lit8 v0, v1, -0x3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->g0(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    new-instance v0, Lcom/google/android/material/datepicker/f;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v0, v1, v2, p0}, Lcom/google/android/material/datepicker/f;-><init>(IILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    if-eqz v2, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    add-int/lit8 v0, v1, 0x3

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->g0(I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    new-instance v0, Lcom/google/android/material/datepicker/f;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v0, v1, v2, p0}, Lcom/google/android/material/datepicker/f;-><init>(IILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    new-instance v0, Lcom/google/android/material/datepicker/f;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-direct {v0, v1, v2, p0}, Lcom/google/android/material/datepicker/f;-><init>(IILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->M()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/m;->N(I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final K(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/m;->g0:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/material/datepicker/d0;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 24
    .line 25
    iget v3, v3, Lcom/google/android/material/datepicker/s;->l:I

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/material/datepicker/d0;->d:Lcom/google/android/material/datepicker/m;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 32
    .line 33
    iget v0, v0, Lcom/google/android/material/datepicker/s;->l:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lz2/f0;->p0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->m0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->n0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->m0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->n0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/m;->J(Lcom/google/android/material/datepicker/s;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final L(Landroid/view/View;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Lcom/google/android/material/datepicker/m;->g0:I

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    const v0, 0x7f1100dc

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, La1/v;->k(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lm0/m0;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const/4 v1, 0x1

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    const v0, 0x7f1100db

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, La1/v;->k(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Lm0/m0;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method

.method public final M()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/m;->r0:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/s;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/material/datepicker/s;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v2, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/s;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput-object v1, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/s;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v2}, Lz2/x;->c(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lz2/x;->c(I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final N(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 v3, p1, 0x1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Lz2/x;->a()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v1

    .line 24
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    sub-int/2addr p1, v2

    .line 32
    if-ltz p1, :cond_2

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La1/v;->t(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, La1/v;->o:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/m;->d0:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/android/material/datepicker/b;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "CURRENT_MONTH_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/google/android/material/datepicker/s;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, La1/v;->h()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/google/android/material/datepicker/m;->d0:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, La4/c;

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    invoke-direct {v1, v0, v2}, La4/c;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/google/android/material/datepicker/m;->h0:La4/c;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, La1/v;->D()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "accessibility"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/android/material/datepicker/m;->p0:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->j:Lcom/google/android/material/datepicker/s;

    .line 41
    .line 42
    const v2, 0x101020d

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2}, Lcom/google/android/material/datepicker/q;->K(Landroid/content/Context;I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iput-boolean v2, p0, Lcom/google/android/material/datepicker/m;->r0:Z

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x1

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    const v2, 0x7f0d0065

    .line 56
    .line 57
    .line 58
    move v5, v4

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const v2, 0x7f0d0060

    .line 61
    .line 62
    .line 63
    move v5, v3

    .line 64
    :goto_0
    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, La1/v;->D()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const v2, 0x7f070413

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const v6, 0x7f070414

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    add-int/2addr v6, v2

    .line 91
    const v2, 0x7f070412

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-int/2addr v2, v6

    .line 99
    const v6, 0x7f070403

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    sget v7, Lcom/google/android/material/datepicker/t;->d:I

    .line 107
    .line 108
    const v8, 0x7f0703fe

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    mul-int/2addr v8, v7

    .line 116
    sub-int/2addr v7, v4

    .line 117
    const v9, 0x7f070411

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    mul-int/2addr v9, v7

    .line 125
    add-int/2addr v9, v8

    .line 126
    const v7, 0x7f0703fb

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    add-int/2addr v2, v6

    .line 134
    add-int/2addr v2, v9

    .line 135
    add-int/2addr v2, p2

    .line 136
    invoke-virtual {p1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 137
    .line 138
    .line 139
    const p2, 0x7f0a0180

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Landroid/widget/GridView;

    .line 147
    .line 148
    new-instance v2, Lb6/e0;

    .line 149
    .line 150
    const/4 v6, 0x1

    .line 151
    invoke-direct {v2, v6}, Lb6/e0;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-static {p2, v2}, Lm0/m0;->m(Landroid/view/View;Lm0/b;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 158
    .line 159
    iget v2, v2, Lcom/google/android/material/datepicker/b;->n:I

    .line 160
    .line 161
    new-instance v6, Lcom/google/android/material/datepicker/d;

    .line 162
    .line 163
    if-lez v2, :cond_1

    .line 164
    .line 165
    invoke-direct {v6, v2}, Lcom/google/android/material/datepicker/d;-><init>(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    invoke-direct {v6}, Lcom/google/android/material/datepicker/d;-><init>()V

    .line 170
    .line 171
    .line 172
    :goto_1
    invoke-virtual {p2, v6}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 173
    .line 174
    .line 175
    iget v1, v1, Lcom/google/android/material/datepicker/s;->m:I

    .line 176
    .line 177
    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 181
    .line 182
    .line 183
    const p2, 0x7f0a0183

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    .line 192
    iput-object p2, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 193
    .line 194
    new-instance p2, Lcom/google/android/material/datepicker/g;

    .line 195
    .line 196
    invoke-direct {p2, p0, v5, v5}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/m;II)V

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 200
    .line 201
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 202
    .line 203
    .line 204
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 205
    .line 206
    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    .line 207
    .line 208
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    new-instance p2, Lcom/google/android/material/datepicker/x;

    .line 212
    .line 213
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 214
    .line 215
    new-instance v2, Lcom/google/android/material/datepicker/h;

    .line 216
    .line 217
    invoke-direct {v2, p0}, Lcom/google/android/material/datepicker/h;-><init>(Lcom/google/android/material/datepicker/m;)V

    .line 218
    .line 219
    .line 220
    new-instance v5, Lcom/google/android/material/datepicker/h;

    .line 221
    .line 222
    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/h;-><init>(Lcom/google/android/material/datepicker/m;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {p2, v0, v1, v2, v5}, Lcom/google/android/material/datepicker/x;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/b;Lcom/google/android/material/datepicker/h;Lcom/google/android/material/datepicker/h;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 229
    .line 230
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const v1, 0x7f0b0039

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    const v1, 0x7f0a0186

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 252
    .line 253
    iput-object v2, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 254
    .line 255
    if-eqz v2, :cond_2

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 258
    .line 259
    .line 260
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 263
    .line 264
    invoke-direct {v5, v0, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 271
    .line 272
    new-instance v2, Lcom/google/android/material/datepicker/d0;

    .line 273
    .line 274
    invoke-direct {v2, p0}, Lcom/google/android/material/datepicker/d0;-><init>(Lcom/google/android/material/datepicker/m;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 281
    .line 282
    new-instance v2, Lcom/google/android/material/datepicker/i;

    .line 283
    .line 284
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 285
    .line 286
    .line 287
    const/4 v3, 0x0

    .line 288
    invoke-static {v3}, Lcom/google/android/material/datepicker/b0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 289
    .line 290
    .line 291
    invoke-static {v3}, Lcom/google/android/material/datepicker/b0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i(Lz2/c0;)V

    .line 295
    .line 296
    .line 297
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/m;->r0:Z

    .line 298
    .line 299
    if-nez v0, :cond_3

    .line 300
    .line 301
    new-instance v0, Lz2/u;

    .line 302
    .line 303
    invoke-direct {v0}, Lz2/z0;-><init>()V

    .line 304
    .line 305
    .line 306
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->q0:Lz2/u;

    .line 307
    .line 308
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 309
    .line 310
    invoke-virtual {v0, v2}, Lz2/z0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 311
    .line 312
    .line 313
    :cond_3
    const v0, 0x7f0a017a

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    if-eqz v2, :cond_4

    .line 321
    .line 322
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 327
    .line 328
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 329
    .line 330
    const-string v2, "SELECTOR_TOGGLE_TAG"

    .line 331
    .line 332
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 336
    .line 337
    new-instance v2, Lcom/google/android/material/datepicker/j;

    .line 338
    .line 339
    const/4 v3, 0x0

    .line 340
    invoke-direct {v2, v3, p0}, Lcom/google/android/material/datepicker/j;-><init>(ILjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v0, v2}, Lm0/m0;->m(Landroid/view/View;Lm0/b;)V

    .line 344
    .line 345
    .line 346
    const v0, 0x7f0a017c

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 354
    .line 355
    const-string v2, "NAVIGATION_PREV_TAG"

    .line 356
    .line 357
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 361
    .line 362
    const v2, 0x7f1100dd

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0, v2}, La1/v;->k(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-static {v0, v2}, Landroid/support/v4/media/session/b;->K(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    const v0, 0x7f0a017b

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 380
    .line 381
    const-string v2, "NAVIGATION_NEXT_TAG"

    .line 382
    .line 383
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 387
    .line 388
    const v2, 0x7f1100d9

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0, v2}, La1/v;->k(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-static {v0, v2}, Landroid/support/v4/media/session/b;->K(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->m0:Landroid/view/View;

    .line 403
    .line 404
    const v0, 0x7f0a017f

    .line 405
    .line 406
    .line 407
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->n0:Landroid/view/View;

    .line 412
    .line 413
    invoke-virtual {p0, v4}, Lcom/google/android/material/datepicker/m;->K(I)V

    .line 414
    .line 415
    .line 416
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 417
    .line 418
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 419
    .line 420
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/s;->c()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 425
    .line 426
    .line 427
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 428
    .line 429
    new-instance v1, Lcom/google/android/material/datepicker/k;

    .line 430
    .line 431
    invoke-direct {v1, p0, p2}, Lcom/google/android/material/datepicker/k;-><init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/x;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lz2/i0;)V

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->o0:Lcom/google/android/material/button/MaterialButton;

    .line 438
    .line 439
    new-instance v1, Lcom/google/android/material/datepicker/l;

    .line 440
    .line 441
    const/4 v2, 0x0

    .line 442
    invoke-direct {v1, v2, p0}, Lcom/google/android/material/datepicker/l;-><init>(ILjava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    .line 447
    .line 448
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->l0:Landroid/view/View;

    .line 449
    .line 450
    new-instance v1, Lcom/google/android/material/datepicker/e;

    .line 451
    .line 452
    invoke-direct {v1, p0, p2, v2}, Lcom/google/android/material/datepicker/e;-><init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/x;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 456
    .line 457
    .line 458
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->k0:Landroid/view/View;

    .line 459
    .line 460
    new-instance v1, Lcom/google/android/material/datepicker/e;

    .line 461
    .line 462
    const/4 v2, 0x1

    .line 463
    invoke-direct {v1, p0, p2, v2}, Lcom/google/android/material/datepicker/e;-><init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/x;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    .line 468
    .line 469
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 470
    .line 471
    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/m;->N(I)V

    .line 476
    .line 477
    .line 478
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 479
    .line 480
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 481
    .line 482
    invoke-virtual {p2, v1}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/s;)I

    .line 483
    .line 484
    .line 485
    move-result p2

    .line 486
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->g0(I)V

    .line 487
    .line 488
    .line 489
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->j0:Landroidx/recyclerview/widget/RecyclerView;

    .line 490
    .line 491
    new-instance v0, Lb6/e0;

    .line 492
    .line 493
    const/4 v1, 0x2

    .line 494
    invoke-direct {v0, v1}, Lb6/e0;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-static {p2, v0}, Lm0/m0;->m(Landroid/view/View;Lm0/b;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/m;->L(Landroid/view/View;)V

    .line 501
    .line 502
    .line 503
    return-object p1
.end method

.method public final y(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/datepicker/m;->d0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->e0:Lcom/google/android/material/datepicker/b;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->f0:Lcom/google/android/material/datepicker/s;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
