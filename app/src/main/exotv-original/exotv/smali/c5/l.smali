.class public final synthetic Lc5/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc5/l;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lc5/l;->k:Ljava/lang/Object;

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
    .locals 4

    .line 1
    iget p1, p0, Lc5/l;->j:I

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lc5/l;->k:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lcom/exotv/net/MovieDetailActivity;

    .line 13
    .line 14
    sget p1, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 15
    .line 16
    const/16 p1, 0x13

    .line 17
    .line 18
    if-ne p2, p1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    iget-object p1, v2, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 32
    .line 33
    .line 34
    iget-object p1, v2, Lcom/exotv/net/MovieDetailActivity;->K:Landroid/widget/ScrollView;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v3, v3}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p1, "pageScroll"

    .line 43
    .line 44
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2

    .line 48
    :cond_1
    const-string p1, "back"

    .line 49
    .line 50
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2

    .line 54
    :cond_2
    move v1, v3

    .line 55
    :goto_0
    return v1

    .line 56
    :pswitch_0
    check-cast v2, Lc5/y;

    .line 57
    .line 58
    if-ne p2, v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    iget-object p1, v2, Lc5/y;->b:Lw4/g;

    .line 67
    .line 68
    invoke-virtual {p1}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-ne p1, v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v1, v3

    .line 82
    :goto_1
    return v1

    .line 83
    :pswitch_1
    check-cast v2, Lc5/o;

    .line 84
    .line 85
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_6

    .line 90
    .line 91
    const/16 p1, 0x15

    .line 92
    .line 93
    if-eq p2, p1, :cond_5

    .line 94
    .line 95
    if-eq p2, v0, :cond_4

    .line 96
    .line 97
    move p1, v3

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    iget-object p1, v2, Lc5/o;->f:Lw4/g;

    .line 100
    .line 101
    invoke-virtual {p1}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    iget-object p1, v2, Lc5/o;->e:Lw4/g;

    .line 113
    .line 114
    invoke-virtual {p1}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    :goto_2
    if-eqz p1, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    move v1, v3

    .line 128
    :goto_3
    return v1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
