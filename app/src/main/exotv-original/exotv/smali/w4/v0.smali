.class public final synthetic Lw4/v0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/SeriesDetailActivity;


# direct methods
.method public synthetic constructor <init>(ILcom/exotv/net/SeriesDetailActivity;)V
    .locals 0

    .line 1
    iput p1, p0, Lw4/v0;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lw4/v0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 7

    .line 1
    iget v0, p0, Lw4/v0;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x14

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lw4/v0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 13
    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v3

    .line 31
    :goto_0
    return v1

    .line 32
    :pswitch_0
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 33
    .line 34
    if-ne p2, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->Q:Landroid/view/View;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v1, v3

    .line 51
    :goto_1
    return v1

    .line 52
    :pswitch_1
    iget-object v0, v4, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 53
    .line 54
    sget v5, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 55
    .line 56
    const/16 v5, 0x13

    .line 57
    .line 58
    if-ne p2, v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    invoke-static {v0}, Lm6/h;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-ne v6, p1, :cond_2

    .line 71
    .line 72
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    if-ne p2, v2, :cond_4

    .line 81
    .line 82
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_4

    .line 87
    .line 88
    invoke-static {v0}, Lm6/h;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-ne v6, p1, :cond_4

    .line 93
    .line 94
    iget-object v6, v4, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-gtz v6, :cond_3

    .line 101
    .line 102
    move v6, v3

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    add-int/2addr v6, v5

    .line 105
    div-int/2addr v6, v2

    .line 106
    :goto_2
    if-gt v6, v1, :cond_4

    .line 107
    .line 108
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->Q:Landroid/view/View;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    if-ne p2, v2, :cond_5

    .line 117
    .line 118
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-nez p2, :cond_5

    .line 123
    .line 124
    invoke-static {v0}, Lm6/h;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-ne p2, p1, :cond_5

    .line 129
    .line 130
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->P:Landroid/widget/TextView;

    .line 131
    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    move v1, v3

    .line 139
    :goto_3
    return v1

    .line 140
    :pswitch_2
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 141
    .line 142
    if-ne p2, v2, :cond_6

    .line 143
    .line 144
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_6

    .line 149
    .line 150
    iget-object p1, v4, Lcom/exotv/net/SeriesDetailActivity;->Q:Landroid/view/View;

    .line 151
    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    move v1, v3

    .line 159
    :goto_4
    return v1

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
