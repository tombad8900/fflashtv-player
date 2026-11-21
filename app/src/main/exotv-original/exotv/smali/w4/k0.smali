.class public final synthetic Lw4/k0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lh/i;


# direct methods
.method public synthetic constructor <init>(Lh/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/k0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/k0;->k:Lh/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Lw4/k0;->j:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lw4/k0;->k:Lh/i;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v1, Lcom/exotv/net/SeriesDetailActivity;

    .line 10
    .line 11
    iget-object p1, v1, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p2, v0

    .line 23
    :goto_0
    if-eqz p2, :cond_5

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-gez p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v2, p2, 0x2

    .line 33
    .line 34
    invoke-static {p1}, Lm6/i;->s0(Ljava/util/List;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-le v2, v3, :cond_2

    .line 39
    .line 40
    move v2, v3

    .line 41
    :cond_2
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "get(...)"

    .line 46
    .line 47
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    check-cast v2, Landroid/view/View;

    .line 51
    .line 52
    add-int/lit8 v4, p2, -0x2

    .line 53
    .line 54
    if-gez v4, :cond_3

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    :cond_3
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v3, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Landroid/view/View;

    .line 65
    .line 66
    iget-object v3, v1, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    new-instance v0, Lw4/y0;

    .line 71
    .line 72
    invoke-direct {v0, v1, p2, p1, v2}, Lw4/y0;-><init>(Lcom/exotv/net/SeriesDetailActivity;ILandroid/view/View;Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const-string p1, "pageScroll"

    .line 80
    .line 81
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_5
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 86
    .line 87
    :goto_1
    return-void

    .line 88
    :pswitch_0
    check-cast v1, Lcom/exotv/net/PlayerActivity;

    .line 89
    .line 90
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 91
    .line 92
    const-string v2, "b"

    .line 93
    .line 94
    if-eqz p1, :cond_d

    .line 95
    .line 96
    iget-object p1, p1, La5/b;->l:Landroid/widget/LinearLayout;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_c

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 119
    .line 120
    if-eqz p1, :cond_b

    .line 121
    .line 122
    iget-object v0, p1, La5/b;->n:Landroid/widget/TextView;

    .line 123
    .line 124
    if-eq p2, v0, :cond_a

    .line 125
    .line 126
    iget-object p1, p1, La5/b;->m:Landroid/widget/TextView;

    .line 127
    .line 128
    if-ne p2, p1, :cond_8

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iget-object p1, v1, Lcom/exotv/net/PlayerActivity;->t0:Landroid/view/View;

    .line 132
    .line 133
    if-nez p1, :cond_9

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_9
    move-object v0, p1

    .line 137
    :goto_2
    new-instance p1, Lw4/j0;

    .line 138
    .line 139
    const/4 p2, 0x1

    .line 140
    invoke-direct {p1, v1, v0, p2}, Lw4/j0;-><init>(Lcom/exotv/net/PlayerActivity;Landroid/view/View;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    :goto_3
    iput-object p2, v1, Lcom/exotv/net/PlayerActivity;->t0:Landroid/view/View;

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_b
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_c
    :goto_4
    return-void

    .line 155
    :cond_d
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
