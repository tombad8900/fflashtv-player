.class public final synthetic Lw4/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm0/o;
.implements Ln0/n;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lw4/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iput p1, p0, Lw4/i;->j:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget-object p1, p0, Lw4/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, Lw4/i;->j:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_4

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v2, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroid/view/View;

    .line 32
    .line 33
    new-instance v3, Lc5/c0;

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    invoke-direct {v3, v0, v4, p1}, Lc5/c0;-><init>(IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, Landroid/view/ViewParent;->isLayoutRequested()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    return v1

    .line 61
    :cond_2
    invoke-virtual {v3}, Lc5/c0;->run()V

    .line 62
    .line 63
    .line 64
    return v1

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 66
    .line 67
    .line 68
    return v1

    .line 69
    :cond_4
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v3, "STATE_"

    .line 74
    .line 75
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-ne v0, v1, :cond_5

    .line 79
    .line 80
    const-string v0, "DRAGGING"

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    const-string v0, "SETTLING"

    .line 84
    .line 85
    :goto_2
    const-string v1, " should not be set externally."

    .line 86
    .line 87
    invoke-static {v2, v0, v1}, La1/a1;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 10

    .line 1
    iget-object p1, p0, Lw4/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/exotv/net/MainActivity;

    .line 4
    .line 5
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v0, p2, Lm0/r1;->a:Lm0/o1;

    .line 8
    .line 9
    const/16 v1, 0x287

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lm0/o1;->f(I)Le0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p1, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const-string v4, "nav"

    .line 19
    .line 20
    if-eqz v2, :cond_9

    .line 21
    .line 22
    iget-object v2, v2, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    iget-object v6, p1, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 29
    .line 30
    if-eqz v6, :cond_8

    .line 31
    .line 32
    iget-object v6, v6, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    iget-object v7, p1, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 39
    .line 40
    if-eqz v7, :cond_7

    .line 41
    .line 42
    iget-object v7, v7, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->I()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    iget v9, p0, Lw4/i;->j:I

    .line 53
    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v8, 0x2

    .line 58
    invoke-virtual {v0, v8}, Lm0/o1;->f(I)Le0/b;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iget v8, v8, Le0/b;->d:I

    .line 63
    .line 64
    add-int/2addr v9, v8

    .line 65
    :goto_0
    invoke-virtual {v2, v5, v6, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 66
    .line 67
    .line 68
    iget v1, v1, Le0/b;->b:I

    .line 69
    .line 70
    iput v1, p1, Lcom/exotv/net/MainActivity;->i0:I

    .line 71
    .line 72
    iget-object v2, p1, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v5, "<get-values>(...)"

    .line 79
    .line 80
    invoke-static {v5, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lw4/l;

    .line 98
    .line 99
    iget-object v5, v5, Lw4/l;->b:Landroid/widget/LinearLayout;

    .line 100
    .line 101
    iget v6, p1, Lcom/exotv/net/MainActivity;->g0:I

    .line 102
    .line 103
    iget v7, p1, Lcom/exotv/net/MainActivity;->i0:I

    .line 104
    .line 105
    iget v8, p1, Lcom/exotv/net/MainActivity;->h0:I

    .line 106
    .line 107
    invoke-virtual {v5, v6, v7, v6, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    iput v1, p1, Lcom/exotv/net/MainActivity;->j0:I

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->t()V

    .line 114
    .line 115
    .line 116
    const/16 v2, 0x8

    .line 117
    .line 118
    invoke-virtual {v0, v2}, Lm0/o1;->f(I)Le0/b;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget v0, v0, Le0/b;->d:I

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    if-lez v0, :cond_2

    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move v5, v2

    .line 130
    :goto_2
    iput-boolean v5, p1, Lcom/exotv/net/MainActivity;->O:Z

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->Z()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/exotv/net/MainActivity;->I()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    iget-object v5, p1, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 143
    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    iget-object v3, v5, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 147
    .line 148
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    sub-int/2addr v0, v3

    .line 153
    if-gez v0, :cond_4

    .line 154
    .line 155
    move v0, v2

    .line 156
    :cond_4
    :goto_3
    iget-object p1, p1, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 157
    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    iget-object p1, p1, Lc5/a1;->n:Landroid/widget/LinearLayout;

    .line 161
    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    invoke-virtual {p1, v2, v1, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    :cond_5
    return-object p2

    .line 168
    :cond_6
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v3

    .line 172
    :cond_7
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v3

    .line 176
    :cond_8
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v3

    .line 180
    :cond_9
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v3
.end method
