.class public final Lz2/l0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lz2/k0;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lz2/l0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lz2/l0;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lz2/l0;->e:I

    .line 31
    .line 32
    iput p1, p0, Lz2/l0;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lz2/v0;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->l(Lz2/v0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lz2/v0;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->w0:Lz2/x0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Lz2/x0;->e:Lz2/w0;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lz2/w0;->e:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lm0/b;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Lm0/m0;->m(Landroid/view/View;Lm0/b;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_4

    .line 31
    .line 32
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->x:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-gtz v2, :cond_3

    .line 39
    .line 40
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->p:Ls/e;

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ls/e;->y(Lz2/v0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "dispatchViewRecycled: "

    .line 56
    .line 57
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const-string v1, "RecyclerView"

    .line 68
    .line 69
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 p1, 0x0

    .line 74
    invoke-static {p1, p2}, La1/a1;->f(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    throw p1

    .line 79
    :cond_4
    :goto_1
    iput-object v3, p1, Lz2/v0;->s:Lz2/x;

    .line 80
    .line 81
    iput-object v3, p1, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    invoke-virtual {p0}, Lz2/l0;->c()Lz2/k0;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget v1, p1, Lz2/v0;->f:I

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Lz2/k0;->a(I)Lz2/j0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object v2, v2, Lz2/j0;->a:Ljava/util/ArrayList;

    .line 97
    .line 98
    iget-object p2, p2, Lz2/k0;->a:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lz2/j0;

    .line 105
    .line 106
    iget p2, p2, Lz2/j0;->b:I

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-gt p2, v1, :cond_5

    .line 113
    .line 114
    invoke-static {v0}, Lcom/bumptech/glide/c;->i(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-nez p2, :cond_6

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    const-string p2, "this scrap item already exists"

    .line 132
    .line 133
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_7
    :goto_2
    invoke-virtual {p1}, Lz2/v0;->m()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz2/r0;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 14
    .line 15
    iget-boolean v1, v1, Lz2/r0;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->n:Li1/s;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Li1/s;->h(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "invalid position "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ". State item count is "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 46
    .line 47
    invoke-virtual {p1}, Lz2/r0;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1
.end method

.method public final c()Lz2/k0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/l0;->g:Lz2/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lz2/k0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lz2/k0;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lz2/k0;->b:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lz2/k0;->c:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Lz2/l0;->g:Lz2/k0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lz2/l0;->e()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lz2/l0;->g:Lz2/k0;

    .line 37
    .line 38
    return-object v0
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lz2/l0;->l(IJ)Lz2/v0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p1
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz2/l0;->g:Lz2/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView;->B:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lz2/k0;->c:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final f(Lz2/x;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz2/l0;->g:Lz2/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lz2/k0;->a:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object v0, v0, Lz2/k0;->c:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    move p2, p1

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ge p2, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lz2/j0;

    .line 37
    .line 38
    iget-object v0, v0, Lz2/j0;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    move v2, p1

    .line 41
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v2, v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lz2/v0;

    .line 52
    .line 53
    iget-object v3, v3, Lz2/v0;->a:Landroid/view/View;

    .line 54
    .line 55
    invoke-static {v3}, Lcom/bumptech/glide/c;->i(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lz2/l0;->h(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->O0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Lh1/v;

    .line 27
    .line 28
    iget-object v1, v0, Lh1/v;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, [I

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    iput v1, v0, Lh1/v;->e:I

    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final h(I)V
    .locals 5

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 2
    .line 3
    const-string v1, "RecyclerView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Recycling cached view at index "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lz2/v0;

    .line 31
    .line 32
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "CachedViewHolder to be recycled: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v2, v1}, Lz2/l0;->a(Lz2/v0;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lz2/v0;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lz2/v0;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lz2/v0;->n:Lz2/l0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lz2/l0;->m(Lz2/v0;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lz2/v0;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Lz2/v0;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Lz2/v0;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lz2/l0;->j(Lz2/v0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->U:Lz2/b0;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lz2/v0;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->U:Lz2/b0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lz2/b0;->d(Lz2/v0;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final j(Lz2/v0;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Lh1/v;

    .line 4
    .line 5
    invoke-virtual {p1}, Lz2/v0;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Lz2/v0;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_12

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_a

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lz2/v0;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_11

    .line 28
    .line 29
    invoke-virtual {p1}, Lz2/v0;->o()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_10

    .line 34
    .line 35
    iget v2, p1, Lz2/v0;->j:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 53
    .line 54
    iget-object v7, p0, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "cached view received recycle internal? "

    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v2}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lz2/v0;->g()Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_d

    .line 90
    .line 91
    iget v6, p0, Lz2/l0;->f:I

    .line 92
    .line 93
    if-lez v6, :cond_b

    .line 94
    .line 95
    iget v6, p1, Lz2/v0;->j:I

    .line 96
    .line 97
    and-int/lit16 v6, v6, 0x20e

    .line 98
    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iget v8, p0, Lz2/l0;->f:I

    .line 107
    .line 108
    if-lt v6, v8, :cond_5

    .line 109
    .line 110
    if-lez v6, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0, v4}, Lz2/l0;->h(I)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v6, v6, -0x1

    .line 116
    .line 117
    :cond_5
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->O0:Z

    .line 118
    .line 119
    if-eqz v8, :cond_a

    .line 120
    .line 121
    if-lez v6, :cond_a

    .line 122
    .line 123
    iget v8, p1, Lz2/v0;->c:I

    .line 124
    .line 125
    iget-object v9, v1, Lh1/v;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v9, [I

    .line 128
    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    iget v9, v1, Lh1/v;->e:I

    .line 132
    .line 133
    mul-int/lit8 v9, v9, 0x2

    .line 134
    .line 135
    move v10, v4

    .line 136
    :goto_2
    if-ge v10, v9, :cond_7

    .line 137
    .line 138
    iget-object v11, v1, Lh1/v;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v11, [I

    .line 141
    .line 142
    aget v11, v11, v10

    .line 143
    .line 144
    if-ne v11, v8, :cond_6

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_6
    add-int/lit8 v10, v10, 0x2

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    add-int/lit8 v6, v6, -0x1

    .line 151
    .line 152
    :goto_3
    if-ltz v6, :cond_9

    .line 153
    .line 154
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    check-cast v8, Lz2/v0;

    .line 159
    .line 160
    iget v8, v8, Lz2/v0;->c:I

    .line 161
    .line 162
    iget-object v9, v1, Lh1/v;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v9, [I

    .line 165
    .line 166
    if-eqz v9, :cond_9

    .line 167
    .line 168
    iget v9, v1, Lh1/v;->e:I

    .line 169
    .line 170
    mul-int/lit8 v9, v9, 0x2

    .line 171
    .line 172
    move v10, v4

    .line 173
    :goto_4
    if-ge v10, v9, :cond_9

    .line 174
    .line 175
    iget-object v11, v1, Lh1/v;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v11, [I

    .line 178
    .line 179
    aget v11, v11, v10

    .line 180
    .line 181
    if-ne v11, v8, :cond_8

    .line 182
    .line 183
    add-int/lit8 v6, v6, -0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    add-int/lit8 v10, v10, 0x2

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_9
    add-int/2addr v6, v5

    .line 190
    :cond_a
    :goto_5
    invoke-virtual {v7, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    move v1, v5

    .line 194
    goto :goto_7

    .line 195
    :cond_b
    :goto_6
    move v1, v4

    .line 196
    :goto_7
    if-nez v1, :cond_c

    .line 197
    .line 198
    invoke-virtual {p0, p1, v5}, Lz2/l0;->a(Lz2/v0;Z)V

    .line 199
    .line 200
    .line 201
    :goto_8
    move v4, v1

    .line 202
    goto :goto_9

    .line 203
    :cond_c
    move v5, v4

    .line 204
    goto :goto_8

    .line 205
    :cond_d
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 206
    .line 207
    if-eqz v1, :cond_e

    .line 208
    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v5, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 212
    .line 213
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const-string v5, "RecyclerView"

    .line 228
    .line 229
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    :cond_e
    move v5, v4

    .line 233
    :goto_9
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->p:Ls/e;

    .line 234
    .line 235
    invoke-virtual {v0, p1}, Ls/e;->y(Lz2/v0;)V

    .line 236
    .line 237
    .line 238
    if-nez v4, :cond_f

    .line 239
    .line 240
    if-nez v5, :cond_f

    .line 241
    .line 242
    if-eqz v2, :cond_f

    .line 243
    .line 244
    invoke-static {v3}, Lcom/bumptech/glide/c;->i(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    iput-object v0, p1, Lz2/v0;->s:Lz2/x;

    .line 249
    .line 250
    iput-object v0, p1, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    :cond_f
    return-void

    .line 253
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 254
    .line 255
    new-instance v1, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v2, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 258
    .line 259
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v1}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1

    .line 270
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 271
    .line 272
    new-instance v2, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v3, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 275
    .line 276
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-static {v0, v2}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1

    .line 290
    :cond_12
    :goto_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 291
    .line 292
    new-instance v2, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    .line 295
    .line 296
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Lz2/v0;->i()Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string p1, " isAttached:"

    .line 307
    .line 308
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    if-eqz p1, :cond_13

    .line 316
    .line 317
    move v4, v5

    .line 318
    :cond_13
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v1
.end method

.method public final k(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Lz2/v0;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lz2/v0;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->U:Lz2/b0;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Lz2/v0;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Lz2/h;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Lz2/h;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lz2/v0;->f()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Lz2/v0;->n:Lz2/l0;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p1, Lz2/v0;->o:Z

    .line 62
    .line 63
    iget-object v0, p0, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lz2/v0;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Lz2/v0;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 82
    .line 83
    iget-boolean v0, v0, Lz2/x;->b:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v0}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_5
    :goto_1
    iput-object p0, p1, Lz2/v0;->n:Lz2/l0;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    iput-boolean v0, p1, Lz2/v0;->o:Z

    .line 109
    .line 110
    iget-object v0, p0, Lz2/l0;->a:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final l(IJ)Lz2/v0;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 8
    .line 9
    if-ltz v0, :cond_5a

    .line 10
    .line 11
    invoke-virtual {v3}, Lz2/r0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v0, v4, :cond_5a

    .line 16
    .line 17
    iget-boolean v4, v3, Lz2/r0;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v4, :cond_6

    .line 23
    .line 24
    iget-object v4, v1, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    move v9, v8

    .line 36
    :goto_0
    if-ge v9, v4, :cond_2

    .line 37
    .line 38
    iget-object v10, v1, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    check-cast v10, Lz2/v0;

    .line 45
    .line 46
    invoke-virtual {v10}, Lz2/v0;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-nez v11, :cond_1

    .line 51
    .line 52
    invoke-virtual {v10}, Lz2/v0;->b()I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-ne v11, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v10, v5}, Lz2/v0;->a(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 66
    .line 67
    iget-boolean v9, v9, Lz2/x;->b:Z

    .line 68
    .line 69
    if-eqz v9, :cond_4

    .line 70
    .line 71
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->n:Li1/s;

    .line 72
    .line 73
    invoke-virtual {v9, v0, v8}, Li1/s;->h(II)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-lez v9, :cond_4

    .line 78
    .line 79
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 80
    .line 81
    invoke-virtual {v10}, Lz2/x;->a()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-ge v9, v10, :cond_4

    .line 86
    .line 87
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 88
    .line 89
    invoke-virtual {v10, v9}, Lz2/x;->b(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    move v11, v8

    .line 94
    :goto_1
    if-ge v11, v4, :cond_4

    .line 95
    .line 96
    iget-object v12, v1, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    check-cast v12, Lz2/v0;

    .line 103
    .line 104
    invoke-virtual {v12}, Lz2/v0;->p()Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-nez v13, :cond_3

    .line 109
    .line 110
    iget-wide v13, v12, Lz2/v0;->e:J

    .line 111
    .line 112
    cmp-long v13, v13, v9

    .line 113
    .line 114
    if-nez v13, :cond_3

    .line 115
    .line 116
    invoke-virtual {v12, v5}, Lz2/v0;->a(I)V

    .line 117
    .line 118
    .line 119
    move-object v10, v12

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :goto_2
    const/4 v10, 0x0

    .line 125
    :goto_3
    if-eqz v10, :cond_5

    .line 126
    .line 127
    const/4 v4, 0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move v4, v8

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    move v4, v8

    .line 132
    const/4 v10, 0x0

    .line 133
    :goto_4
    iget-object v9, v1, Lz2/l0;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object v11, v1, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 136
    .line 137
    const-string v12, "RecyclerView"

    .line 138
    .line 139
    if-nez v10, :cond_1f

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    move v13, v8

    .line 146
    :goto_5
    if-ge v13, v10, :cond_9

    .line 147
    .line 148
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    check-cast v14, Lz2/v0;

    .line 153
    .line 154
    invoke-virtual {v14}, Lz2/v0;->p()Z

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-nez v15, :cond_8

    .line 159
    .line 160
    invoke-virtual {v14}, Lz2/v0;->b()I

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-ne v15, v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {v14}, Lz2/v0;->f()Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-nez v15, :cond_8

    .line 171
    .line 172
    iget-boolean v15, v3, Lz2/r0;->g:Z

    .line 173
    .line 174
    if-nez v15, :cond_7

    .line 175
    .line 176
    invoke-virtual {v14}, Lz2/v0;->h()Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-nez v15, :cond_8

    .line 181
    .line 182
    :cond_7
    invoke-virtual {v14, v5}, Lz2/v0;->a(I)V

    .line 183
    .line 184
    .line 185
    move-object v10, v14

    .line 186
    const/16 v17, 0x1

    .line 187
    .line 188
    goto/16 :goto_b

    .line 189
    .line 190
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->o:Li2/j;

    .line 194
    .line 195
    iget-object v10, v10, Li2/j;->n:Ljava/lang/Cloneable;

    .line 196
    .line 197
    check-cast v10, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    move v14, v8

    .line 204
    :goto_6
    if-ge v14, v13, :cond_b

    .line 205
    .line 206
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    check-cast v15, Landroid/view/View;

    .line 211
    .line 212
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    const/16 v17, 0x1

    .line 217
    .line 218
    invoke-virtual/range {v16 .. v16}, Lz2/v0;->b()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-ne v7, v0, :cond_a

    .line 223
    .line 224
    invoke-virtual/range {v16 .. v16}, Lz2/v0;->f()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-nez v7, :cond_a

    .line 229
    .line 230
    invoke-virtual/range {v16 .. v16}, Lz2/v0;->h()Z

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    if-nez v7, :cond_a

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    const/16 v17, 0x1

    .line 241
    .line 242
    const/4 v15, 0x0

    .line 243
    :goto_7
    if-eqz v15, :cond_11

    .line 244
    .line 245
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->o:Li2/j;

    .line 250
    .line 251
    iget-object v13, v10, Li2/j;->m:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v13, Lv1/c;

    .line 254
    .line 255
    iget-object v14, v10, Li2/j;->l:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v14, Lz2/w;

    .line 258
    .line 259
    iget-object v14, v14, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    if-ltz v14, :cond_10

    .line 266
    .line 267
    invoke-virtual {v13, v14}, Lv1/c;->m(I)Z

    .line 268
    .line 269
    .line 270
    move-result v16

    .line 271
    if-eqz v16, :cond_f

    .line 272
    .line 273
    invoke-virtual {v13, v14}, Lv1/c;->j(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v15}, Li2/j;->l(Landroid/view/View;)V

    .line 277
    .line 278
    .line 279
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->o:Li2/j;

    .line 280
    .line 281
    iget-object v13, v10, Li2/j;->m:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v13, Lv1/c;

    .line 284
    .line 285
    iget-object v10, v10, Li2/j;->l:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v10, Lz2/w;

    .line 288
    .line 289
    iget-object v10, v10, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 290
    .line 291
    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    const/4 v14, -0x1

    .line 296
    if-ne v10, v14, :cond_c

    .line 297
    .line 298
    :goto_8
    move v10, v14

    .line 299
    goto :goto_9

    .line 300
    :cond_c
    invoke-virtual {v13, v10}, Lv1/c;->m(I)Z

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    if-eqz v16, :cond_d

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_d
    invoke-virtual {v13, v10}, Lv1/c;->k(I)I

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    sub-int/2addr v10, v13

    .line 312
    :goto_9
    if-eq v10, v14, :cond_e

    .line 313
    .line 314
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->o:Li2/j;

    .line 315
    .line 316
    invoke-virtual {v13, v10}, Li2/j;->e(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v15}, Lz2/l0;->k(Landroid/view/View;)V

    .line 320
    .line 321
    .line 322
    const/16 v10, 0x2020

    .line 323
    .line 324
    invoke-virtual {v7, v10}, Lz2/v0;->a(I)V

    .line 325
    .line 326
    .line 327
    move-object v10, v7

    .line 328
    goto/16 :goto_b

    .line 329
    .line 330
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 331
    .line 332
    new-instance v3, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v4, "layout index should not be -1 after unhiding a view:"

    .line 335
    .line 336
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-static {v2, v3}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    throw v0

    .line 350
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 351
    .line 352
    new-instance v2, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v3, "trying to unhide a view that was not hidden"

    .line 355
    .line 356
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v0

    .line 370
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 371
    .line 372
    new-instance v2, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v3, "view is not a child, cannot hide "

    .line 375
    .line 376
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0

    .line 390
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    move v10, v8

    .line 395
    :goto_a
    if-ge v10, v7, :cond_14

    .line 396
    .line 397
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    check-cast v13, Lz2/v0;

    .line 402
    .line 403
    invoke-virtual {v13}, Lz2/v0;->f()Z

    .line 404
    .line 405
    .line 406
    move-result v14

    .line 407
    if-nez v14, :cond_13

    .line 408
    .line 409
    invoke-virtual {v13}, Lz2/v0;->b()I

    .line 410
    .line 411
    .line 412
    move-result v14

    .line 413
    if-ne v14, v0, :cond_13

    .line 414
    .line 415
    invoke-virtual {v13}, Lz2/v0;->d()Z

    .line 416
    .line 417
    .line 418
    move-result v14

    .line 419
    if-nez v14, :cond_13

    .line 420
    .line 421
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 425
    .line 426
    if-eqz v7, :cond_12

    .line 427
    .line 428
    new-instance v7, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    const-string v10, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 431
    .line 432
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const-string v10, ") found match in cache: "

    .line 439
    .line 440
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    invoke-static {v12, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    :cond_12
    move-object v10, v13

    .line 454
    goto :goto_b

    .line 455
    :cond_13
    add-int/lit8 v10, v10, 0x1

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :cond_14
    const/4 v10, 0x0

    .line 459
    :goto_b
    if-eqz v10, :cond_20

    .line 460
    .line 461
    invoke-virtual {v10}, Lz2/v0;->h()Z

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    if-eqz v7, :cond_17

    .line 466
    .line 467
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 468
    .line 469
    if-eqz v7, :cond_16

    .line 470
    .line 471
    iget-boolean v7, v3, Lz2/r0;->g:Z

    .line 472
    .line 473
    if-eqz v7, :cond_15

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 477
    .line 478
    new-instance v3, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    const-string v4, "should not receive a removed view unless it is pre layout"

    .line 481
    .line 482
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v2, v3}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v0

    .line 493
    :cond_16
    :goto_c
    iget-boolean v7, v3, Lz2/r0;->g:Z

    .line 494
    .line 495
    goto :goto_d

    .line 496
    :cond_17
    iget v7, v10, Lz2/v0;->c:I

    .line 497
    .line 498
    if-ltz v7, :cond_1e

    .line 499
    .line 500
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 501
    .line 502
    invoke-virtual {v13}, Lz2/x;->a()I

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    if-ge v7, v13, :cond_1e

    .line 507
    .line 508
    iget-boolean v7, v3, Lz2/r0;->g:Z

    .line 509
    .line 510
    if-nez v7, :cond_19

    .line 511
    .line 512
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 513
    .line 514
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    iget v7, v10, Lz2/v0;->f:I

    .line 518
    .line 519
    if-eqz v7, :cond_19

    .line 520
    .line 521
    :cond_18
    move v7, v8

    .line 522
    goto :goto_d

    .line 523
    :cond_19
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 524
    .line 525
    iget-boolean v13, v7, Lz2/x;->b:Z

    .line 526
    .line 527
    if-eqz v13, :cond_1a

    .line 528
    .line 529
    iget-wide v13, v10, Lz2/v0;->e:J

    .line 530
    .line 531
    iget v15, v10, Lz2/v0;->c:I

    .line 532
    .line 533
    invoke-virtual {v7, v15}, Lz2/x;->b(I)J

    .line 534
    .line 535
    .line 536
    move-result-wide v15

    .line 537
    cmp-long v7, v13, v15

    .line 538
    .line 539
    if-nez v7, :cond_18

    .line 540
    .line 541
    :cond_1a
    move/from16 v7, v17

    .line 542
    .line 543
    :goto_d
    if-nez v7, :cond_1d

    .line 544
    .line 545
    const/4 v7, 0x4

    .line 546
    invoke-virtual {v10, v7}, Lz2/v0;->a(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v10}, Lz2/v0;->i()Z

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    if-eqz v7, :cond_1b

    .line 554
    .line 555
    iget-object v7, v10, Lz2/v0;->a:Landroid/view/View;

    .line 556
    .line 557
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 558
    .line 559
    .line 560
    iget-object v7, v10, Lz2/v0;->n:Lz2/l0;

    .line 561
    .line 562
    invoke-virtual {v7, v10}, Lz2/l0;->m(Lz2/v0;)V

    .line 563
    .line 564
    .line 565
    goto :goto_e

    .line 566
    :cond_1b
    invoke-virtual {v10}, Lz2/v0;->p()Z

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    if-eqz v7, :cond_1c

    .line 571
    .line 572
    iget v7, v10, Lz2/v0;->j:I

    .line 573
    .line 574
    and-int/lit8 v7, v7, -0x21

    .line 575
    .line 576
    iput v7, v10, Lz2/v0;->j:I

    .line 577
    .line 578
    :cond_1c
    :goto_e
    invoke-virtual {v1, v10}, Lz2/l0;->j(Lz2/v0;)V

    .line 579
    .line 580
    .line 581
    const/4 v10, 0x0

    .line 582
    goto :goto_f

    .line 583
    :cond_1d
    move/from16 v4, v17

    .line 584
    .line 585
    goto :goto_f

    .line 586
    :cond_1e
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 587
    .line 588
    new-instance v3, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    const-string v4, "Inconsistency detected. Invalid view holder adapter position"

    .line 591
    .line 592
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-static {v2, v3}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw v0

    .line 606
    :cond_1f
    const/16 v17, 0x1

    .line 607
    .line 608
    :cond_20
    :goto_f
    const-wide/16 v18, 0x0

    .line 609
    .line 610
    const-wide v20, 0x7fffffffffffffffL

    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    if-nez v10, :cond_36

    .line 616
    .line 617
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->n:Li1/s;

    .line 618
    .line 619
    invoke-virtual {v7, v0, v8}, Li1/s;->h(II)I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    if-ltz v7, :cond_35

    .line 624
    .line 625
    const-wide/16 v22, 0x3

    .line 626
    .line 627
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 628
    .line 629
    invoke-virtual {v13}, Lz2/x;->a()I

    .line 630
    .line 631
    .line 632
    move-result v13

    .line 633
    if-ge v7, v13, :cond_35

    .line 634
    .line 635
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 636
    .line 637
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 641
    .line 642
    iget-boolean v14, v13, Lz2/x;->b:Z

    .line 643
    .line 644
    if-eqz v14, :cond_28

    .line 645
    .line 646
    invoke-virtual {v13, v7}, Lz2/x;->b(I)J

    .line 647
    .line 648
    .line 649
    move-result-wide v13

    .line 650
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 651
    .line 652
    .line 653
    move-result v10

    .line 654
    add-int/lit8 v10, v10, -0x1

    .line 655
    .line 656
    :goto_10
    if-ltz v10, :cond_24

    .line 657
    .line 658
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v24

    .line 662
    const-wide/16 v25, 0x4

    .line 663
    .line 664
    move-object/from16 v15, v24

    .line 665
    .line 666
    check-cast v15, Lz2/v0;

    .line 667
    .line 668
    move/from16 v24, v7

    .line 669
    .line 670
    iget-wide v6, v15, Lz2/v0;->e:J

    .line 671
    .line 672
    iget-object v8, v15, Lz2/v0;->a:Landroid/view/View;

    .line 673
    .line 674
    cmp-long v6, v6, v13

    .line 675
    .line 676
    if-nez v6, :cond_23

    .line 677
    .line 678
    invoke-virtual {v15}, Lz2/v0;->p()Z

    .line 679
    .line 680
    .line 681
    move-result v6

    .line 682
    if-nez v6, :cond_23

    .line 683
    .line 684
    iget v6, v15, Lz2/v0;->f:I

    .line 685
    .line 686
    if-nez v6, :cond_22

    .line 687
    .line 688
    invoke-virtual {v15, v5}, Lz2/v0;->a(I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v15}, Lz2/v0;->h()Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-eqz v5, :cond_21

    .line 696
    .line 697
    iget-boolean v5, v3, Lz2/r0;->g:Z

    .line 698
    .line 699
    if-nez v5, :cond_21

    .line 700
    .line 701
    iget v5, v15, Lz2/v0;->j:I

    .line 702
    .line 703
    and-int/lit8 v5, v5, -0xf

    .line 704
    .line 705
    or-int/lit8 v5, v5, 0x2

    .line 706
    .line 707
    iput v5, v15, Lz2/v0;->j:I

    .line 708
    .line 709
    :cond_21
    move-object v10, v15

    .line 710
    goto :goto_12

    .line 711
    :cond_22
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    const/4 v6, 0x0

    .line 715
    invoke-virtual {v2, v8, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 716
    .line 717
    .line 718
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    const/4 v8, 0x0

    .line 723
    iput-object v8, v7, Lz2/v0;->n:Lz2/l0;

    .line 724
    .line 725
    iput-boolean v6, v7, Lz2/v0;->o:Z

    .line 726
    .line 727
    iget v6, v7, Lz2/v0;->j:I

    .line 728
    .line 729
    and-int/lit8 v6, v6, -0x21

    .line 730
    .line 731
    iput v6, v7, Lz2/v0;->j:I

    .line 732
    .line 733
    invoke-virtual {v1, v7}, Lz2/l0;->j(Lz2/v0;)V

    .line 734
    .line 735
    .line 736
    :cond_23
    add-int/lit8 v10, v10, -0x1

    .line 737
    .line 738
    move/from16 v7, v24

    .line 739
    .line 740
    const/4 v8, 0x0

    .line 741
    goto :goto_10

    .line 742
    :cond_24
    move/from16 v24, v7

    .line 743
    .line 744
    const-wide/16 v25, 0x4

    .line 745
    .line 746
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    add-int/lit8 v5, v5, -0x1

    .line 751
    .line 752
    :goto_11
    if-ltz v5, :cond_26

    .line 753
    .line 754
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    check-cast v6, Lz2/v0;

    .line 759
    .line 760
    iget-wide v7, v6, Lz2/v0;->e:J

    .line 761
    .line 762
    cmp-long v7, v7, v13

    .line 763
    .line 764
    if-nez v7, :cond_27

    .line 765
    .line 766
    invoke-virtual {v6}, Lz2/v0;->d()Z

    .line 767
    .line 768
    .line 769
    move-result v7

    .line 770
    if-nez v7, :cond_27

    .line 771
    .line 772
    iget v7, v6, Lz2/v0;->f:I

    .line 773
    .line 774
    if-nez v7, :cond_25

    .line 775
    .line 776
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-object v10, v6

    .line 780
    goto :goto_12

    .line 781
    :cond_25
    invoke-virtual {v1, v5}, Lz2/l0;->h(I)V

    .line 782
    .line 783
    .line 784
    :cond_26
    const/4 v10, 0x0

    .line 785
    goto :goto_12

    .line 786
    :cond_27
    add-int/lit8 v5, v5, -0x1

    .line 787
    .line 788
    goto :goto_11

    .line 789
    :goto_12
    if-eqz v10, :cond_29

    .line 790
    .line 791
    move/from16 v5, v24

    .line 792
    .line 793
    iput v5, v10, Lz2/v0;->c:I

    .line 794
    .line 795
    move/from16 v4, v17

    .line 796
    .line 797
    goto :goto_13

    .line 798
    :cond_28
    const-wide/16 v25, 0x4

    .line 799
    .line 800
    :cond_29
    :goto_13
    if-nez v10, :cond_2e

    .line 801
    .line 802
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 803
    .line 804
    if-eqz v5, :cond_2a

    .line 805
    .line 806
    new-instance v5, Ljava/lang/StringBuilder;

    .line 807
    .line 808
    const-string v6, "tryGetViewHolderForPositionByDeadline("

    .line 809
    .line 810
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    const-string v6, ") fetching from shared pool"

    .line 817
    .line 818
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 826
    .line 827
    .line 828
    :cond_2a
    invoke-virtual {v1}, Lz2/l0;->c()Lz2/k0;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    iget-object v5, v5, Lz2/k0;->a:Landroid/util/SparseArray;

    .line 833
    .line 834
    const/4 v6, 0x0

    .line 835
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    check-cast v5, Lz2/j0;

    .line 840
    .line 841
    if-eqz v5, :cond_2c

    .line 842
    .line 843
    iget-object v5, v5, Lz2/j0;->a:Ljava/util/ArrayList;

    .line 844
    .line 845
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    if-nez v6, :cond_2c

    .line 850
    .line 851
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    add-int/lit8 v6, v6, -0x1

    .line 856
    .line 857
    :goto_14
    if-ltz v6, :cond_2c

    .line 858
    .line 859
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    check-cast v7, Lz2/v0;

    .line 864
    .line 865
    invoke-virtual {v7}, Lz2/v0;->d()Z

    .line 866
    .line 867
    .line 868
    move-result v7

    .line 869
    if-nez v7, :cond_2b

    .line 870
    .line 871
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    check-cast v5, Lz2/v0;

    .line 876
    .line 877
    goto :goto_15

    .line 878
    :cond_2b
    add-int/lit8 v6, v6, -0x1

    .line 879
    .line 880
    goto :goto_14

    .line 881
    :cond_2c
    const/4 v5, 0x0

    .line 882
    :goto_15
    if-eqz v5, :cond_2d

    .line 883
    .line 884
    invoke-virtual {v5}, Lz2/v0;->m()V

    .line 885
    .line 886
    .line 887
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 888
    .line 889
    :cond_2d
    move-object v10, v5

    .line 890
    :cond_2e
    if-nez v10, :cond_37

    .line 891
    .line 892
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 893
    .line 894
    .line 895
    move-result-wide v5

    .line 896
    cmp-long v7, p2, v20

    .line 897
    .line 898
    if-eqz v7, :cond_31

    .line 899
    .line 900
    iget-object v7, v1, Lz2/l0;->g:Lz2/k0;

    .line 901
    .line 902
    const/4 v8, 0x0

    .line 903
    invoke-virtual {v7, v8}, Lz2/k0;->a(I)Lz2/j0;

    .line 904
    .line 905
    .line 906
    move-result-object v7

    .line 907
    iget-wide v7, v7, Lz2/j0;->c:J

    .line 908
    .line 909
    cmp-long v9, v7, v18

    .line 910
    .line 911
    if-eqz v9, :cond_30

    .line 912
    .line 913
    add-long/2addr v7, v5

    .line 914
    cmp-long v7, v7, p2

    .line 915
    .line 916
    if-gez v7, :cond_2f

    .line 917
    .line 918
    goto :goto_16

    .line 919
    :cond_2f
    const/4 v7, 0x0

    .line 920
    goto :goto_17

    .line 921
    :cond_30
    :goto_16
    move/from16 v7, v17

    .line 922
    .line 923
    :goto_17
    if-nez v7, :cond_31

    .line 924
    .line 925
    const/16 v16, 0x0

    .line 926
    .line 927
    return-object v16

    .line 928
    :cond_31
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 929
    .line 930
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    :try_start_0
    const-string v8, "RV CreateView"

    .line 934
    .line 935
    sget v9, Li0/f;->a:I

    .line 936
    .line 937
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v7, v2}, Lz2/x;->e(Landroid/view/ViewGroup;)Lz2/v0;

    .line 941
    .line 942
    .line 943
    move-result-object v10

    .line 944
    iget-object v7, v10, Lz2/v0;->a:Landroid/view/View;

    .line 945
    .line 946
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 947
    .line 948
    .line 949
    move-result-object v8

    .line 950
    if-nez v8, :cond_34

    .line 951
    .line 952
    const/4 v8, 0x0

    .line 953
    iput v8, v10, Lz2/v0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 954
    .line 955
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 956
    .line 957
    .line 958
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->O0:Z

    .line 959
    .line 960
    if-eqz v8, :cond_32

    .line 961
    .line 962
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->G(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    if-eqz v7, :cond_32

    .line 967
    .line 968
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 969
    .line 970
    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    iput-object v8, v10, Lz2/v0;->b:Ljava/lang/ref/WeakReference;

    .line 974
    .line 975
    :cond_32
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 976
    .line 977
    .line 978
    move-result-wide v7

    .line 979
    iget-object v9, v1, Lz2/l0;->g:Lz2/k0;

    .line 980
    .line 981
    sub-long/2addr v7, v5

    .line 982
    const/4 v6, 0x0

    .line 983
    invoke-virtual {v9, v6}, Lz2/k0;->a(I)Lz2/j0;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    iget-wide v13, v5, Lz2/j0;->c:J

    .line 988
    .line 989
    cmp-long v6, v13, v18

    .line 990
    .line 991
    if-nez v6, :cond_33

    .line 992
    .line 993
    goto :goto_18

    .line 994
    :cond_33
    div-long v13, v13, v25

    .line 995
    .line 996
    mul-long v13, v13, v22

    .line 997
    .line 998
    div-long v7, v7, v25

    .line 999
    .line 1000
    add-long/2addr v7, v13

    .line 1001
    :goto_18
    iput-wide v7, v5, Lz2/j0;->c:J

    .line 1002
    .line 1003
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 1004
    .line 1005
    if-eqz v5, :cond_37

    .line 1006
    .line 1007
    const-string v5, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 1008
    .line 1009
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1010
    .line 1011
    .line 1012
    goto :goto_1a

    .line 1013
    :catchall_0
    move-exception v0

    .line 1014
    goto :goto_19

    .line 1015
    :cond_34
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1016
    .line 1017
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 1018
    .line 1019
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1023
    :goto_19
    sget v2, Li0/f;->a:I

    .line 1024
    .line 1025
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1026
    .line 1027
    .line 1028
    throw v0

    .line 1029
    :cond_35
    move v5, v7

    .line 1030
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 1031
    .line 1032
    const-string v6, "(offset:"

    .line 1033
    .line 1034
    const-string v7, ").state:"

    .line 1035
    .line 1036
    const-string v8, "Inconsistency detected. Invalid item position "

    .line 1037
    .line 1038
    invoke-static {v0, v5, v8, v6, v7}, La1/a1;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    invoke-virtual {v3}, Lz2/r0;->b()I

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    throw v4

    .line 1064
    :cond_36
    const-wide/16 v22, 0x3

    .line 1065
    .line 1066
    const-wide/16 v25, 0x4

    .line 1067
    .line 1068
    :cond_37
    :goto_1a
    iget-object v5, v10, Lz2/v0;->a:Landroid/view/View;

    .line 1069
    .line 1070
    if-eqz v4, :cond_39

    .line 1071
    .line 1072
    iget-boolean v6, v3, Lz2/r0;->g:Z

    .line 1073
    .line 1074
    if-nez v6, :cond_39

    .line 1075
    .line 1076
    iget v6, v10, Lz2/v0;->j:I

    .line 1077
    .line 1078
    and-int/lit16 v7, v6, 0x2000

    .line 1079
    .line 1080
    if-eqz v7, :cond_38

    .line 1081
    .line 1082
    move/from16 v7, v17

    .line 1083
    .line 1084
    goto :goto_1b

    .line 1085
    :cond_38
    const/4 v7, 0x0

    .line 1086
    :goto_1b
    if-eqz v7, :cond_39

    .line 1087
    .line 1088
    and-int/lit16 v6, v6, -0x2001

    .line 1089
    .line 1090
    iput v6, v10, Lz2/v0;->j:I

    .line 1091
    .line 1092
    iget-boolean v6, v3, Lz2/r0;->j:Z

    .line 1093
    .line 1094
    if-eqz v6, :cond_39

    .line 1095
    .line 1096
    invoke-static {v10}, Lz2/b0;->b(Lz2/v0;)V

    .line 1097
    .line 1098
    .line 1099
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->U:Lz2/b0;

    .line 1100
    .line 1101
    invoke-virtual {v10}, Lz2/v0;->c()Ljava/util/List;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    new-instance v6, Landroidx/media3/common/p;

    .line 1108
    .line 1109
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v6, v10}, Landroidx/media3/common/p;->b(Lz2/v0;)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->Z(Lz2/v0;Landroidx/media3/common/p;)V

    .line 1116
    .line 1117
    .line 1118
    :cond_39
    iget-boolean v6, v3, Lz2/r0;->g:Z

    .line 1119
    .line 1120
    if-eqz v6, :cond_3a

    .line 1121
    .line 1122
    invoke-virtual {v10}, Lz2/v0;->e()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v6

    .line 1126
    if-eqz v6, :cond_3a

    .line 1127
    .line 1128
    iput v0, v10, Lz2/v0;->g:I

    .line 1129
    .line 1130
    goto :goto_1d

    .line 1131
    :cond_3a
    invoke-virtual {v10}, Lz2/v0;->e()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v6

    .line 1135
    if-eqz v6, :cond_3d

    .line 1136
    .line 1137
    iget v6, v10, Lz2/v0;->j:I

    .line 1138
    .line 1139
    and-int/lit8 v6, v6, 0x2

    .line 1140
    .line 1141
    if-eqz v6, :cond_3b

    .line 1142
    .line 1143
    move/from16 v6, v17

    .line 1144
    .line 1145
    goto :goto_1c

    .line 1146
    :cond_3b
    const/4 v6, 0x0

    .line 1147
    :goto_1c
    if-nez v6, :cond_3d

    .line 1148
    .line 1149
    invoke-virtual {v10}, Lz2/v0;->f()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v6

    .line 1153
    if-eqz v6, :cond_3c

    .line 1154
    .line 1155
    goto :goto_1e

    .line 1156
    :cond_3c
    :goto_1d
    move/from16 v7, v17

    .line 1157
    .line 1158
    const/4 v6, 0x0

    .line 1159
    goto/16 :goto_29

    .line 1160
    .line 1161
    :cond_3d
    :goto_1e
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 1162
    .line 1163
    if-eqz v6, :cond_3f

    .line 1164
    .line 1165
    invoke-virtual {v10}, Lz2/v0;->h()Z

    .line 1166
    .line 1167
    .line 1168
    move-result v6

    .line 1169
    if-nez v6, :cond_3e

    .line 1170
    .line 1171
    goto :goto_1f

    .line 1172
    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1173
    .line 1174
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1175
    .line 1176
    const-string v4, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1177
    .line 1178
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1182
    .line 1183
    .line 1184
    invoke-static {v2, v3}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1189
    .line 1190
    .line 1191
    throw v0

    .line 1192
    :cond_3f
    :goto_1f
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->n:Li1/s;

    .line 1193
    .line 1194
    const/4 v8, 0x0

    .line 1195
    invoke-virtual {v6, v0, v8}, Li1/s;->h(II)I

    .line 1196
    .line 1197
    .line 1198
    move-result v6

    .line 1199
    const/4 v7, 0x0

    .line 1200
    iput-object v7, v10, Lz2/v0;->s:Lz2/x;

    .line 1201
    .line 1202
    iput-object v2, v10, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1203
    .line 1204
    iget v9, v10, Lz2/v0;->f:I

    .line 1205
    .line 1206
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1207
    .line 1208
    .line 1209
    move-result-wide v11

    .line 1210
    cmp-long v13, p2, v20

    .line 1211
    .line 1212
    if-eqz v13, :cond_41

    .line 1213
    .line 1214
    iget-object v13, v1, Lz2/l0;->g:Lz2/k0;

    .line 1215
    .line 1216
    invoke-virtual {v13, v9}, Lz2/k0;->a(I)Lz2/j0;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v9

    .line 1220
    iget-wide v13, v9, Lz2/j0;->d:J

    .line 1221
    .line 1222
    cmp-long v9, v13, v18

    .line 1223
    .line 1224
    if-eqz v9, :cond_41

    .line 1225
    .line 1226
    add-long/2addr v13, v11

    .line 1227
    cmp-long v9, v13, p2

    .line 1228
    .line 1229
    if-gez v9, :cond_40

    .line 1230
    .line 1231
    goto :goto_20

    .line 1232
    :cond_40
    move v6, v8

    .line 1233
    move/from16 v7, v17

    .line 1234
    .line 1235
    goto/16 :goto_29

    .line 1236
    .line 1237
    :cond_41
    :goto_20
    invoke-virtual {v10}, Lz2/v0;->j()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v9

    .line 1241
    if-eqz v9, :cond_42

    .line 1242
    .line 1243
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1244
    .line 1245
    .line 1246
    move-result v9

    .line 1247
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v13

    .line 1251
    invoke-static {v2, v5, v9, v13}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1252
    .line 1253
    .line 1254
    move/from16 v9, v17

    .line 1255
    .line 1256
    goto :goto_21

    .line 1257
    :cond_42
    move v9, v8

    .line 1258
    :goto_21
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 1259
    .line 1260
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1261
    .line 1262
    .line 1263
    iget-object v14, v10, Lz2/v0;->s:Lz2/x;

    .line 1264
    .line 1265
    if-nez v14, :cond_43

    .line 1266
    .line 1267
    move/from16 v14, v17

    .line 1268
    .line 1269
    goto :goto_22

    .line 1270
    :cond_43
    move v14, v8

    .line 1271
    :goto_22
    if-eqz v14, :cond_45

    .line 1272
    .line 1273
    iput v6, v10, Lz2/v0;->c:I

    .line 1274
    .line 1275
    iget-boolean v15, v13, Lz2/x;->b:Z

    .line 1276
    .line 1277
    if-eqz v15, :cond_44

    .line 1278
    .line 1279
    invoke-virtual {v13, v6}, Lz2/x;->b(I)J

    .line 1280
    .line 1281
    .line 1282
    move-result-wide v7

    .line 1283
    iput-wide v7, v10, Lz2/v0;->e:J

    .line 1284
    .line 1285
    :cond_44
    iget v7, v10, Lz2/v0;->j:I

    .line 1286
    .line 1287
    and-int/lit16 v7, v7, -0x208

    .line 1288
    .line 1289
    or-int/lit8 v7, v7, 0x1

    .line 1290
    .line 1291
    iput v7, v10, Lz2/v0;->j:I

    .line 1292
    .line 1293
    sget v7, Li0/f;->a:I

    .line 1294
    .line 1295
    const-string v7, "RV OnBindView"

    .line 1296
    .line 1297
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    :cond_45
    iput-object v13, v10, Lz2/v0;->s:Lz2/x;

    .line 1301
    .line 1302
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 1303
    .line 1304
    if-eqz v7, :cond_49

    .line 1305
    .line 1306
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v7

    .line 1310
    if-nez v7, :cond_47

    .line 1311
    .line 1312
    sget-object v7, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 1313
    .line 1314
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1315
    .line 1316
    .line 1317
    move-result v7

    .line 1318
    invoke-virtual {v10}, Lz2/v0;->j()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v8

    .line 1322
    if-ne v7, v8, :cond_46

    .line 1323
    .line 1324
    goto :goto_23

    .line 1325
    :cond_46
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1326
    .line 1327
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    const-string v3, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 1330
    .line 1331
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v10}, Lz2/v0;->j()Z

    .line 1335
    .line 1336
    .line 1337
    move-result v3

    .line 1338
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1339
    .line 1340
    .line 1341
    const-string v3, ", attached to window: "

    .line 1342
    .line 1343
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1347
    .line 1348
    .line 1349
    move-result v3

    .line 1350
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1351
    .line 1352
    .line 1353
    const-string v3, ", holder: "

    .line 1354
    .line 1355
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    throw v0

    .line 1369
    :cond_47
    :goto_23
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v7

    .line 1373
    if-nez v7, :cond_49

    .line 1374
    .line 1375
    sget-object v7, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 1376
    .line 1377
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    if-nez v7, :cond_48

    .line 1382
    .line 1383
    goto :goto_24

    .line 1384
    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1385
    .line 1386
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1387
    .line 1388
    const-string v3, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 1389
    .line 1390
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    throw v0

    .line 1404
    :cond_49
    :goto_24
    invoke-virtual {v10}, Lz2/v0;->c()Ljava/util/List;

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v13, v10, v6}, Lz2/x;->d(Lz2/v0;I)V

    .line 1408
    .line 1409
    .line 1410
    if-eqz v14, :cond_4c

    .line 1411
    .line 1412
    iget-object v6, v10, Lz2/v0;->k:Ljava/util/ArrayList;

    .line 1413
    .line 1414
    if-eqz v6, :cond_4a

    .line 1415
    .line 1416
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1417
    .line 1418
    .line 1419
    :cond_4a
    iget v6, v10, Lz2/v0;->j:I

    .line 1420
    .line 1421
    and-int/lit16 v6, v6, -0x401

    .line 1422
    .line 1423
    iput v6, v10, Lz2/v0;->j:I

    .line 1424
    .line 1425
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v6

    .line 1429
    instance-of v7, v6, Lz2/g0;

    .line 1430
    .line 1431
    if-eqz v7, :cond_4b

    .line 1432
    .line 1433
    check-cast v6, Lz2/g0;

    .line 1434
    .line 1435
    move/from16 v7, v17

    .line 1436
    .line 1437
    iput-boolean v7, v6, Lz2/g0;->c:Z

    .line 1438
    .line 1439
    :cond_4b
    sget v6, Li0/f;->a:I

    .line 1440
    .line 1441
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1442
    .line 1443
    .line 1444
    :cond_4c
    if-eqz v9, :cond_4d

    .line 1445
    .line 1446
    invoke-static {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 1447
    .line 1448
    .line 1449
    :cond_4d
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1450
    .line 1451
    .line 1452
    move-result-wide v6

    .line 1453
    iget-object v8, v1, Lz2/l0;->g:Lz2/k0;

    .line 1454
    .line 1455
    iget v9, v10, Lz2/v0;->f:I

    .line 1456
    .line 1457
    sub-long/2addr v6, v11

    .line 1458
    invoke-virtual {v8, v9}, Lz2/k0;->a(I)Lz2/j0;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v8

    .line 1462
    iget-wide v11, v8, Lz2/j0;->d:J

    .line 1463
    .line 1464
    cmp-long v9, v11, v18

    .line 1465
    .line 1466
    if-nez v9, :cond_4e

    .line 1467
    .line 1468
    goto :goto_25

    .line 1469
    :cond_4e
    div-long v11, v11, v25

    .line 1470
    .line 1471
    mul-long v11, v11, v22

    .line 1472
    .line 1473
    div-long v6, v6, v25

    .line 1474
    .line 1475
    add-long/2addr v6, v11

    .line 1476
    :goto_25
    iput-wide v6, v8, Lz2/j0;->d:J

    .line 1477
    .line 1478
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->K:Landroid/view/accessibility/AccessibilityManager;

    .line 1479
    .line 1480
    if-eqz v6, :cond_4f

    .line 1481
    .line 1482
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v6

    .line 1486
    if-eqz v6, :cond_4f

    .line 1487
    .line 1488
    const/4 v6, 0x1

    .line 1489
    goto :goto_26

    .line 1490
    :cond_4f
    const/4 v6, 0x0

    .line 1491
    :goto_26
    if-eqz v6, :cond_55

    .line 1492
    .line 1493
    sget-object v6, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 1494
    .line 1495
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1496
    .line 1497
    .line 1498
    move-result v6

    .line 1499
    const/4 v7, 0x1

    .line 1500
    if-nez v6, :cond_50

    .line 1501
    .line 1502
    invoke-virtual {v5, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1503
    .line 1504
    .line 1505
    :cond_50
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->w0:Lz2/x0;

    .line 1506
    .line 1507
    if-nez v6, :cond_51

    .line 1508
    .line 1509
    goto :goto_28

    .line 1510
    :cond_51
    iget-object v6, v6, Lz2/x0;->e:Lz2/w0;

    .line 1511
    .line 1512
    if-eqz v6, :cond_54

    .line 1513
    .line 1514
    invoke-static {v5}, Lm0/m0;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v8

    .line 1518
    if-nez v8, :cond_52

    .line 1519
    .line 1520
    const/4 v8, 0x0

    .line 1521
    goto :goto_27

    .line 1522
    :cond_52
    instance-of v9, v8, Lm0/a;

    .line 1523
    .line 1524
    if-eqz v9, :cond_53

    .line 1525
    .line 1526
    check-cast v8, Lm0/a;

    .line 1527
    .line 1528
    iget-object v8, v8, Lm0/a;->a:Lm0/b;

    .line 1529
    .line 1530
    goto :goto_27

    .line 1531
    :cond_53
    new-instance v9, Lm0/b;

    .line 1532
    .line 1533
    invoke-direct {v9, v8}, Lm0/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1534
    .line 1535
    .line 1536
    move-object v8, v9

    .line 1537
    :goto_27
    if-eqz v8, :cond_54

    .line 1538
    .line 1539
    if-eq v8, v6, :cond_54

    .line 1540
    .line 1541
    iget-object v9, v6, Lz2/w0;->e:Ljava/util/WeakHashMap;

    .line 1542
    .line 1543
    invoke-virtual {v9, v5, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    :cond_54
    invoke-static {v5, v6}, Lm0/m0;->m(Landroid/view/View;Lm0/b;)V

    .line 1547
    .line 1548
    .line 1549
    goto :goto_28

    .line 1550
    :cond_55
    const/4 v7, 0x1

    .line 1551
    :goto_28
    iget-boolean v3, v3, Lz2/r0;->g:Z

    .line 1552
    .line 1553
    if-eqz v3, :cond_56

    .line 1554
    .line 1555
    iput v0, v10, Lz2/v0;->g:I

    .line 1556
    .line 1557
    :cond_56
    move v6, v7

    .line 1558
    :goto_29
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    if-nez v0, :cond_57

    .line 1563
    .line 1564
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0

    .line 1568
    check-cast v0, Lz2/g0;

    .line 1569
    .line 1570
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1571
    .line 1572
    .line 1573
    goto :goto_2a

    .line 1574
    :cond_57
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1575
    .line 1576
    .line 1577
    move-result v3

    .line 1578
    if-nez v3, :cond_58

    .line 1579
    .line 1580
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    check-cast v0, Lz2/g0;

    .line 1585
    .line 1586
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1587
    .line 1588
    .line 1589
    goto :goto_2a

    .line 1590
    :cond_58
    check-cast v0, Lz2/g0;

    .line 1591
    .line 1592
    :goto_2a
    iput-object v10, v0, Lz2/g0;->a:Lz2/v0;

    .line 1593
    .line 1594
    if-eqz v4, :cond_59

    .line 1595
    .line 1596
    if-eqz v6, :cond_59

    .line 1597
    .line 1598
    goto :goto_2b

    .line 1599
    :cond_59
    const/4 v7, 0x0

    .line 1600
    :goto_2b
    iput-boolean v7, v0, Lz2/g0;->d:Z

    .line 1601
    .line 1602
    return-object v10

    .line 1603
    :cond_5a
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 1604
    .line 1605
    const-string v5, "("

    .line 1606
    .line 1607
    const-string v6, "). Item count:"

    .line 1608
    .line 1609
    const-string v7, "Invalid item position "

    .line 1610
    .line 1611
    invoke-static {v0, v0, v7, v5, v6}, La1/a1;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v0

    .line 1615
    invoke-virtual {v3}, Lz2/r0;->b()I

    .line 1616
    .line 1617
    .line 1618
    move-result v3

    .line 1619
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v2

    .line 1626
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1634
    .line 1635
    .line 1636
    throw v4
.end method

.method public final m(Lz2/v0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lz2/v0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lz2/l0;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lz2/l0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lz2/v0;->n:Lz2/l0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lz2/v0;->o:Z

    .line 21
    .line 22
    iget v0, p1, Lz2/v0;->j:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x21

    .line 25
    .line 26
    iput v0, p1, Lz2/v0;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz2/l0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->w:Lz2/f0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lz2/f0;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lz2/l0;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lz2/l0;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Lz2/l0;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Lz2/l0;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lz2/l0;->h(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
