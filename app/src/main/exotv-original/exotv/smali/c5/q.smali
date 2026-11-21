.class public final synthetic Lc5/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lc5/q;->j:I

    iput-object p3, p0, Lc5/q;->l:Ljava/lang/Object;

    iput p1, p0, Lc5/q;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILc5/t;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc5/q;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc5/q;->k:I

    iput-object p2, p0, Lc5/q;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 8

    .line 1
    iget v0, p0, Lc5/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget v5, p0, Lc5/q;->k:I

    .line 10
    .line 11
    iget-object v6, p0, Lc5/q;->l:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v6, Lcom/exotv/net/SeriesDetailActivity;

    .line 18
    .line 19
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    if-ne p2, v2, :cond_3

    .line 29
    .line 30
    iget-object p1, v6, Lcom/exotv/net/SeriesDetailActivity;->M:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 35
    .line 36
    .line 37
    iget-object p1, v6, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1, v3, v3}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 42
    .line 43
    .line 44
    :goto_0
    move v3, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p1, "pageScroll"

    .line 47
    .line 48
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v7

    .line 52
    :cond_2
    const-string p1, "back"

    .line 53
    .line 54
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v7

    .line 58
    :cond_3
    if-ne p2, v1, :cond_4

    .line 59
    .line 60
    iget-object p1, v6, Lcom/exotv/net/SeriesDetailActivity;->d0:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {p1}, Lm6/i;->s0(Ljava/util/List;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-ne v5, p1, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_1
    return v3

    .line 70
    :pswitch_0
    check-cast v6, Lc5/a1;

    .line 71
    .line 72
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    if-eq p2, v2, :cond_9

    .line 80
    .line 81
    const/16 p1, 0x14

    .line 82
    .line 83
    if-eq p2, p1, :cond_7

    .line 84
    .line 85
    if-eq p2, v1, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-static {}, Lc5/w0;->values()[Lc5/w0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string p2, "<this>"

    .line 93
    .line 94
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    array-length p1, p1

    .line 98
    sub-int/2addr p1, v4

    .line 99
    if-ne v5, p1, :cond_a

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    iget-object p1, v6, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 103
    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    goto :goto_3

    .line 111
    :cond_8
    :goto_2
    move v3, v4

    .line 112
    goto :goto_3

    .line 113
    :cond_9
    iget-object p1, v6, Lc5/a1;->g:Landroid/widget/EditText;

    .line 114
    .line 115
    if-eqz p1, :cond_b

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    :cond_a
    :goto_3
    return v3

    .line 122
    :cond_b
    const-string p1, "input"

    .line 123
    .line 124
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v7

    .line 128
    :pswitch_1
    check-cast v6, Lc5/t;

    .line 129
    .line 130
    const/16 v0, 0x15

    .line 131
    .line 132
    if-ne p2, v0, :cond_11

    .line 133
    .line 134
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_c

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    instance-of p2, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 146
    .line 147
    if-eqz p2, :cond_d

    .line 148
    .line 149
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_d
    move-object p1, v7

    .line 153
    :goto_4
    if-eqz p1, :cond_e

    .line 154
    .line 155
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    goto :goto_5

    .line 160
    :cond_e
    move-object p1, v7

    .line 161
    :goto_5
    instance-of p2, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 162
    .line 163
    if-eqz p2, :cond_f

    .line 164
    .line 165
    move-object v7, p1

    .line 166
    check-cast v7, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 167
    .line 168
    :cond_f
    if-eqz v7, :cond_10

    .line 169
    .line 170
    iget p1, v7, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 171
    .line 172
    rem-int/2addr v5, p1

    .line 173
    if-nez v5, :cond_11

    .line 174
    .line 175
    :cond_10
    iget-object p1, v6, Lc5/t;->f:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p1, Lw4/g;

    .line 178
    .line 179
    invoke-virtual {p1}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_11

    .line 190
    .line 191
    move v3, v4

    .line 192
    :cond_11
    :goto_6
    return v3

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
