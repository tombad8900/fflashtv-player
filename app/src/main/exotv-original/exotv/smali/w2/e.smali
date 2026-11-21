.class public final Lw2/e;
.super Lz2/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public d:Ljava/util/List;

.field public final synthetic e:Lw2/o;

.field public final synthetic f:I

.field public final synthetic g:Lw2/o;


# direct methods
.method public constructor <init>(Lw2/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw2/e;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lw2/e;->g:Lw2/o;

    .line 4
    .line 5
    iput-object p1, p0, Lw2/e;->e:Lw2/o;

    .line 6
    .line 7
    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lw2/e;->d:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method private final k(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/e;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lw2/e;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    return v0
.end method

.method public bridge synthetic d(Lz2/v0;I)V
    .locals 1

    .line 1
    iget v0, p0, Lw2/e;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw2/k;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lw2/e;->i(Lw2/k;I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, Lw2/k;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lw2/e;->i(Lw2/k;I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/ViewGroup;)Lz2/v0;
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/e;->e:Lw2/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0d0037

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lw2/k;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lw2/k;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public g(Landroidx/media3/common/v1;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lw2/e;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lw2/e;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lw2/l;

    .line 18
    .line 19
    iget-object v2, v2, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 20
    .line 21
    iget-object v2, v2, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 22
    .line 23
    iget-object v3, p1, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lf6/q0;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v0
.end method

.method public h(Ljava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lw2/e;->g:Lw2/o;

    .line 2
    .line 3
    iget-object v1, v0, Lw2/o;->F:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    move-object v4, p1

    .line 8
    check-cast v4, Lf6/l1;

    .line 9
    .line 10
    iget v4, v4, Lf6/l1;->m:I

    .line 11
    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Lf6/l1;

    .line 16
    .line 17
    invoke-virtual {v4, v3}, Lf6/l1;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lw2/l;

    .line 22
    .line 23
    iget-object v5, v4, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 24
    .line 25
    iget v4, v4, Lw2/l;->b:I

    .line 26
    .line 27
    iget-object v5, v5, Landroidx/media3/common/w1;->e:[Z

    .line 28
    .line 29
    aget-boolean v4, v5, v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    iget-object v3, v0, Lw2/o;->k0:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v3, v0, Lw2/o;->l0:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v0, v0, Lw2/o;->m0:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    iget-object v0, v0, Lw2/o;->n0:Ljava/lang/String;

    .line 56
    .line 57
    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    iput-object p1, p0, Lw2/e;->d:Ljava/util/List;

    .line 61
    .line 62
    return-void
.end method

.method public i(Lw2/k;I)V
    .locals 1

    .line 1
    iget v0, p0, Lw2/e;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lw2/e;->j(Lw2/k;I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw2/e;->j(Lw2/k;I)V

    .line 11
    .line 12
    .line 13
    if-lez p2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lw2/e;->d:Ljava/util/List;

    .line 16
    .line 17
    add-int/lit8 p2, p2, -0x1

    .line 18
    .line 19
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lw2/l;

    .line 24
    .line 25
    iget-object p1, p1, Lw2/k;->v:Landroid/view/View;

    .line 26
    .line 27
    iget-object v0, p2, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 28
    .line 29
    iget p2, p2, Lw2/l;->b:I

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/media3/common/w1;->e:[Z

    .line 32
    .line 33
    aget-boolean p2, v0, p2

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p2, 0x4

    .line 40
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lw2/k;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lw2/e;->e:Lw2/o;

    .line 2
    .line 3
    iget-object v3, v0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 4
    .line 5
    if-nez v3, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p2, :cond_5

    .line 9
    .line 10
    iget p2, p0, Lw2/e;->f:I

    .line 11
    .line 12
    packed-switch p2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p2, p1, Lw2/k;->u:Landroid/widget/TextView;

    .line 16
    .line 17
    const v0, 0x7f110076

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    move v0, p2

    .line 25
    :goto_0
    iget-object v1, p0, Lw2/e;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ge v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lw2/e;->d:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lw2/l;

    .line 40
    .line 41
    iget-object v2, v1, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 42
    .line 43
    iget v1, v1, Lw2/l;->b:I

    .line 44
    .line 45
    iget-object v2, v2, Landroidx/media3/common/w1;->e:[Z

    .line 46
    .line 47
    aget-boolean v1, v2, v1

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    move v0, p2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v0, 0x1

    .line 57
    :goto_1
    iget-object v1, p1, Lw2/k;->v:Landroid/view/View;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    const/4 p2, 0x4

    .line 63
    :goto_2
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 67
    .line 68
    new-instance p2, Lb6/a;

    .line 69
    .line 70
    const/16 v0, 0x8

    .line 71
    .line 72
    invoke-direct {p2, v0, p0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :pswitch_0
    iget-object p2, p1, Lw2/k;->u:Landroid/widget/TextView;

    .line 80
    .line 81
    const v0, 0x7f110075

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lw2/e;->g:Lw2/o;

    .line 88
    .line 89
    iget-object p2, p2, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-interface {p2}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p0, p2}, Lw2/e;->g(Landroidx/media3/common/v1;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iget-object v0, p1, Lw2/k;->v:Landroid/view/View;

    .line 103
    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    const/4 p2, 0x4

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    const/4 p2, 0x0

    .line 109
    :goto_3
    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 113
    .line 114
    new-instance p2, Lb6/a;

    .line 115
    .line 116
    const/4 v0, 0x6

    .line 117
    invoke-direct {p2, v0, p0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    .line 122
    .line 123
    :goto_4
    return-void

    .line 124
    :cond_5
    iget-object v0, p0, Lw2/e;->d:Ljava/util/List;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    sub-int/2addr p2, v1

    .line 128
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    move-object v5, p2

    .line 133
    check-cast v5, Lw2/l;

    .line 134
    .line 135
    iget-object p2, v5, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 136
    .line 137
    iget-object v4, p2, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 138
    .line 139
    invoke-interface {v3}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iget-object p2, p2, Landroidx/media3/common/v1;->overrides:Lf6/q0;

    .line 144
    .line 145
    invoke-virtual {p2, v4}, Lf6/q0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    const/4 v0, 0x0

    .line 150
    if-eqz p2, :cond_6

    .line 151
    .line 152
    iget-object p2, v5, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 153
    .line 154
    iget v2, v5, Lw2/l;->b:I

    .line 155
    .line 156
    iget-object p2, p2, Landroidx/media3/common/w1;->e:[Z

    .line 157
    .line 158
    aget-boolean p2, p2, v2

    .line 159
    .line 160
    if-eqz p2, :cond_6

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_6
    move v1, v0

    .line 164
    :goto_5
    iget-object p2, p1, Lw2/k;->u:Landroid/widget/TextView;

    .line 165
    .line 166
    iget-object v2, v5, Lw2/l;->c:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    iget-object p2, p1, Lw2/k;->v:Landroid/view/View;

    .line 172
    .line 173
    if-eqz v1, :cond_7

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_7
    const/4 v0, 0x4

    .line 177
    :goto_6
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 181
    .line 182
    new-instance v1, Lw2/m;

    .line 183
    .line 184
    const/4 v6, 0x0

    .line 185
    move-object v2, p0

    .line 186
    invoke-direct/range {v1 .. v6}, Lw2/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
