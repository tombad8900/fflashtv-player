.class public Lh/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lh/b;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lh/g;->g(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lh/f;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lh/b;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    invoke-static {p1, p2}, Lh/g;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lh/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Lh/f;->a:Lh/b;

    .line 5
    iput p2, p0, Lh/f;->b:I

    return-void
.end method


# virtual methods
.method public create()Lh/g;
    .locals 11

    .line 1
    new-instance v0, Lh/g;

    .line 2
    .line 3
    iget-object v1, p0, Lh/f;->a:Lh/b;

    .line 4
    .line 5
    iget-object v2, v1, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    iget v3, p0, Lh/f;->b:I

    .line 8
    .line 9
    invoke-direct {v0, v2, v3}, Lh/g;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Lh/b;->e:Landroid/view/View;

    .line 13
    .line 14
    iget-object v3, v0, Lh/g;->o:Lh/e;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iput-object v2, v3, Lh/e;->v:Landroid/view/View;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v2, v1, Lh/b;->d:Ljava/lang/CharSequence;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iput-object v2, v3, Lh/e;->d:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v5, v3, Lh/e;->t:Landroid/widget/TextView;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v5, v3, Lh/e;->c:Landroid/view/Window;

    .line 36
    .line 37
    invoke-virtual {v5, v2}, Landroid/view/Window;->setTitle(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v2, v1, Lh/b;->c:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    iput-object v2, v3, Lh/e;->r:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    iget-object v5, v3, Lh/e;->s:Landroid/widget/ImageView;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v5, v3, Lh/e;->s:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    iget-object v2, v1, Lh/b;->f:Ljava/lang/CharSequence;

    .line 59
    .line 60
    if-nez v2, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    const/4 v5, -0x1

    .line 64
    iget-object v6, v1, Lh/b;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 65
    .line 66
    invoke-virtual {v3, v5, v2, v6}, Lh/e;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object v2, v1, Lh/b;->h:Ljava/lang/CharSequence;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const/4 v5, -0x2

    .line 75
    iget-object v6, v1, Lh/b;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 76
    .line 77
    invoke-virtual {v3, v5, v2, v6}, Lh/e;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    iget-object v2, v1, Lh/b;->k:Ljava/lang/Object;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    const/4 v6, 0x0

    .line 84
    if-eqz v2, :cond_a

    .line 85
    .line 86
    iget-object v2, v1, Lh/b;->b:Landroid/view/LayoutInflater;

    .line 87
    .line 88
    iget v7, v3, Lh/e;->z:I

    .line 89
    .line 90
    invoke-virtual {v2, v7, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 95
    .line 96
    iget-boolean v7, v1, Lh/b;->n:Z

    .line 97
    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    iget v7, v3, Lh/e;->A:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    iget v7, v3, Lh/e;->B:I

    .line 104
    .line 105
    :goto_3
    iget-object v8, v1, Lh/b;->k:Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v8, :cond_7

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    new-instance v8, Lh/d;

    .line 111
    .line 112
    iget-object v9, v1, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 113
    .line 114
    const v10, 0x1020014

    .line 115
    .line 116
    .line 117
    invoke-direct {v8, v9, v7, v10, v6}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iput-object v8, v3, Lh/e;->w:Landroid/widget/ListAdapter;

    .line 121
    .line 122
    iget v7, v1, Lh/b;->o:I

    .line 123
    .line 124
    iput v7, v3, Lh/e;->x:I

    .line 125
    .line 126
    iget-object v7, v1, Lh/b;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 127
    .line 128
    if-eqz v7, :cond_8

    .line 129
    .line 130
    new-instance v7, Lh/a;

    .line 131
    .line 132
    invoke-direct {v7, v1, v3}, Lh/a;-><init>(Lh/b;Lh/e;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    iget-boolean v7, v1, Lh/b;->n:Z

    .line 139
    .line 140
    if-eqz v7, :cond_9

    .line 141
    .line 142
    invoke-virtual {v2, v5}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 143
    .line 144
    .line 145
    :cond_9
    iput-object v2, v3, Lh/e;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 146
    .line 147
    :cond_a
    iget-object v2, v1, Lh/b;->m:Landroid/view/View;

    .line 148
    .line 149
    if-eqz v2, :cond_b

    .line 150
    .line 151
    iput-object v2, v3, Lh/e;->f:Landroid/view/View;

    .line 152
    .line 153
    iput-boolean v4, v3, Lh/e;->g:Z

    .line 154
    .line 155
    :cond_b
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v1, Lh/b;->j:Ll/n;

    .line 168
    .line 169
    if-eqz v1, :cond_c

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 172
    .line 173
    .line 174
    :cond_c
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/f;->a:Lh/b;

    .line 2
    .line 3
    iget-object v0, v0, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    return-object v0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lh/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/f;->a:Lh/b;

    .line 2
    .line 3
    iget-object v1, v0, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lh/b;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, Lh/b;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lh/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/f;->a:Lh/b;

    .line 2
    .line 3
    iget-object v1, v0, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lh/b;->f:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, Lh/b;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lh/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/f;->a:Lh/b;

    .line 2
    .line 3
    iput-object p1, v0, Lh/b;->d:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public setView(Landroid/view/View;)Lh/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/f;->a:Lh/b;

    .line 2
    .line 3
    iput-object p1, v0, Lh/b;->m:Landroid/view/View;

    .line 4
    .line 5
    return-object p0
.end method
