.class public final Lb/x;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lm6/f;

.field public c:La1/f0;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/x;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lm6/f;

    .line 7
    .line 8
    invoke-direct {p1}, Lm6/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lb/x;->b:Lm6/f;

    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    if-lt p1, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Lb/o;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v0}, Lb/o;-><init>(Lb/x;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lb/o;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, v1}, Lb/o;-><init>(Lb/x;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lb/p;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, Lb/p;-><init>(Lb/x;I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lb/p;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, p0, v3}, Lb/p;-><init>(Lb/x;I)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lb/t;->a:Lb/t;

    .line 48
    .line 49
    invoke-virtual {v3, p1, v0, v1, v2}, Lb/t;->a(Ly6/l;Ly6/l;Ly6/a;Ly6/a;)Landroid/window/OnBackInvokedCallback;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Lb/p;

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    invoke-direct {p1, p0, v0}, Lb/p;-><init>(Lb/x;I)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lb/r;->a:Lb/r;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lb/r;->a(Ly6/a;)Landroid/window/OnBackInvokedCallback;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    iput-object p1, p0, Lb/x;->d:Landroid/window/OnBackInvokedCallback;

    .line 67
    .line 68
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/v;La1/f0;)V
    .locals 10

    .line 1
    const-string v0, "onBackPressedCallback"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lb/u;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1, p2}, Lb/u;-><init>(Lb/x;Landroidx/lifecycle/o;La1/f0;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p2, La1/f0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lb/x;->e()V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lb/w;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const-class v4, Lb/x;

    .line 38
    .line 39
    const-string v5, "updateEnabledCallbacks"

    .line 40
    .line 41
    const-string v6, "updateEnabledCallbacks()V"

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v3, p0

    .line 45
    invoke-direct/range {v1 .. v9}, Lb/w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p2, La1/f0;->c:Lz6/g;

    .line 49
    .line 50
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb/x;->c:La1/f0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lb/x;->b:Lm6/f;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, La1/f0;

    .line 28
    .line 29
    iget-boolean v3, v3, La1/f0;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v1

    .line 35
    :goto_0
    check-cast v2, La1/f0;

    .line 36
    .line 37
    :cond_2
    iput-object v1, p0, Lb/x;->c:La1/f0;

    .line 38
    .line 39
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb/x;->c:La1/f0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lb/x;->b:Lm6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lm6/f;->a()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, La1/f0;

    .line 28
    .line 29
    iget-boolean v3, v3, La1/f0;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v1

    .line 35
    :goto_0
    move-object v0, v2

    .line 36
    check-cast v0, La1/f0;

    .line 37
    .line 38
    :cond_2
    iput-object v1, p0, Lb/x;->c:La1/f0;

    .line 39
    .line 40
    if-eqz v0, :cond_f

    .line 41
    .line 42
    iget v1, v0, La1/f0;->d:I

    .line 43
    .line 44
    packed-switch v1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, La1/f0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/exotv/net/PlayerActivity;

    .line 50
    .line 51
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const-string v3, "b"

    .line 55
    .line 56
    if-eqz v1, :cond_a

    .line 57
    .line 58
    iget-object v1, v1, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->W()V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_3
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 72
    .line 73
    if-eqz v1, :cond_9

    .line 74
    .line 75
    iget-object v1, v1, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->U()V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :cond_4
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 89
    .line 90
    if-eqz v1, :cond_8

    .line 91
    .line 92
    iget-object v1, v1, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->V()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 105
    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    iget-object v1, v1, La5/b;->j:Landroid/widget/LinearLayout;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->D()V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v2

    .line 128
    :cond_8
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v2

    .line 132
    :cond_9
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v2

    .line 136
    :cond_a
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v2

    .line 140
    :pswitch_0
    iget-object v1, v0, La1/f0;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lcom/exotv/net/MainActivity;

    .line 143
    .line 144
    iget-object v2, v1, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 145
    .line 146
    sget-object v3, Lw4/q;->m:Lw4/q;

    .line 147
    .line 148
    if-ne v2, v3, :cond_b

    .line 149
    .line 150
    iget-object v0, v1, Lcom/exotv/net/MainActivity;->L:Lw4/q;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_b
    const/4 v2, 0x0

    .line 157
    iput-boolean v2, v0, La1/f0;->a:Z

    .line 158
    .line 159
    iget-object v2, v0, La1/f0;->c:Lz6/g;

    .line 160
    .line 161
    if-eqz v2, :cond_c

    .line 162
    .line 163
    invoke-interface {v2}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :cond_c
    invoke-virtual {v1}, Lb/l;->i()Lb/x;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Lb/x;->c()V

    .line 171
    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    iput-boolean v1, v0, La1/f0;->a:Z

    .line 175
    .line 176
    iget-object v0, v0, La1/f0;->c:Lz6/g;

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    invoke-interface {v0}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_1
    iget-object v0, v0, La1/f0;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, La1/n0;

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    invoke-virtual {v0, v1}, La1/n0;->y(Z)Z

    .line 190
    .line 191
    .line 192
    iget-object v1, v0, La1/n0;->h:La1/f0;

    .line 193
    .line 194
    iget-boolean v1, v1, La1/f0;->a:Z

    .line 195
    .line 196
    if-eqz v1, :cond_d

    .line 197
    .line 198
    invoke-virtual {v0}, La1/n0;->N()Z

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_d
    iget-object v0, v0, La1/n0;->g:Lb/x;

    .line 203
    .line 204
    invoke-virtual {v0}, Lb/x;->c()V

    .line 205
    .line 206
    .line 207
    :cond_e
    :goto_1
    return-void

    .line 208
    :cond_f
    iget-object v0, p0, Lb/x;->a:Ljava/lang/Runnable;

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb/x;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lb/x;->d:Landroid/window/OnBackInvokedCallback;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    sget-object v3, Lb/r;->a:Lb/r;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v4, p0, Lb/x;->f:Z

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v0, v2, v1}, Lb/r;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lb/x;->f:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-boolean p1, p0, Lb/x;->f:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v0, v1}, Lb/r;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, p0, Lb/x;->f:Z

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lb/x;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lb/x;->b:Lm6/f;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, Lm6/f;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, La1/f0;

    .line 30
    .line 31
    iget-boolean v3, v3, La1/f0;->a:Z

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :cond_2
    :goto_0
    iput-boolean v1, p0, Lb/x;->g:Z

    .line 37
    .line 38
    if-eq v1, v0, :cond_3

    .line 39
    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v2, 0x21

    .line 43
    .line 44
    if-lt v0, v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lb/x;->d(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method
