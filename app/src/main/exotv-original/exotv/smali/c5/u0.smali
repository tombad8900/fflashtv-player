.class public final synthetic Lc5/u0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lc5/a1;

.field public final synthetic l:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Lc5/a1;Landroid/widget/LinearLayout;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc5/u0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/u0;->k:Lc5/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lc5/u0;->l:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lc5/u0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/u0;->l:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lez v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-gtz v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-int/2addr v2, v3

    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-int/2addr v2, v3

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    div-int/2addr v2, v3

    .line 55
    const/4 v3, 0x1

    .line 56
    if-ge v2, v3, :cond_3

    .line 57
    .line 58
    move v2, v3

    .line 59
    :cond_3
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    rem-int/2addr v0, v2

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    :goto_1
    iget-object v0, p0, Lc5/u0;->k:Lc5/a1;

    .line 67
    .line 68
    iget-object v0, v0, Lc5/a1;->c:Lw4/g;

    .line 69
    .line 70
    invoke-virtual {v0}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    const/4 v0, -0x1

    .line 82
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_0
    iget-object v0, p0, Lc5/u0;->k:Lc5/a1;

    .line 88
    .line 89
    iget-object v1, v0, Lc5/a1;->g:Landroid/widget/EditText;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    const-string v3, "input"

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    invoke-virtual {v1, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 98
    .line 99
    .line 100
    sget-object v5, Lc5/j;->a:Lc5/j;

    .line 101
    .line 102
    iget-object v6, v0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 103
    .line 104
    iget-object v7, v0, Lc5/a1;->g:Landroid/widget/EditText;

    .line 105
    .line 106
    if-eqz v7, :cond_5

    .line 107
    .line 108
    iget-object v10, v0, Lc5/a1;->c:Lw4/g;

    .line 109
    .line 110
    const/4 v11, 0x0

    .line 111
    const/16 v12, 0x1a0

    .line 112
    .line 113
    const/16 v8, 0x10

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    invoke-static/range {v5 .. v12}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x20000

    .line 120
    .line 121
    iget-object v1, p0, Lc5/u0;->l:Landroid/widget/LinearLayout;

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_5
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v2

    .line 133
    :cond_6
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v2

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
