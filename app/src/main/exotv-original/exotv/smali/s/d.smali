.class public final Ls/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls/d;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Ls/d;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lz2/k;

    .line 10
    .line 11
    check-cast p2, Lz2/k;

    .line 12
    .line 13
    iget-object v0, p1, Lz2/k;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    move v4, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v4, v2

    .line 20
    :goto_0
    iget-object v5, p2, Lz2/k;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    move v5, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v5, v2

    .line 27
    :goto_1
    if-eq v4, v5, :cond_2

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    iget-boolean v0, p1, Lz2/k;->a:Z

    .line 33
    .line 34
    iget-boolean v4, p2, Lz2/k;->a:Z

    .line 35
    .line 36
    if-eq v0, v4, :cond_4

    .line 37
    .line 38
    if-eqz v0, :cond_7

    .line 39
    .line 40
    :cond_3
    move v1, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_4
    iget v0, p2, Lz2/k;->b:I

    .line 43
    .line 44
    iget v1, p1, Lz2/k;->b:I

    .line 45
    .line 46
    sub-int v1, v0, v1

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_5
    iget p1, p1, Lz2/k;->c:I

    .line 52
    .line 53
    iget p2, p2, Lz2/k;->c:I

    .line 54
    .line 55
    sub-int v1, p1, p2

    .line 56
    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    move v1, v2

    .line 61
    :cond_7
    :goto_2
    return v1

    .line 62
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 63
    .line 64
    check-cast p2, Landroid/view/View;

    .line 65
    .line 66
    sget-object v0, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 67
    .line 68
    invoke-static {p1}, Lm0/e0;->f(Landroid/view/View;)F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-static {p2}, Lm0/e0;->f(Landroid/view/View;)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    cmpl-float v0, p1, p2

    .line 77
    .line 78
    if-lez v0, :cond_8

    .line 79
    .line 80
    move v1, v3

    .line 81
    goto :goto_3

    .line 82
    :cond_8
    cmpg-float p1, p1, p2

    .line 83
    .line 84
    if-gez p1, :cond_9

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_9
    move v1, v2

    .line 88
    :goto_3
    return v1

    .line 89
    :pswitch_1
    check-cast p1, Lw7/g;

    .line 90
    .line 91
    iget-object p1, p1, Lw7/g;->a:Lv7/b0;

    .line 92
    .line 93
    check-cast p2, Lw7/g;

    .line 94
    .line 95
    iget-object p2, p2, Lw7/g;->a:Lv7/b0;

    .line 96
    .line 97
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    return p1

    .line 102
    :pswitch_2
    check-cast p1, Lw4/a1;

    .line 103
    .line 104
    iget p1, p1, Lw4/a1;->a:I

    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p2, Lw4/a1;

    .line 111
    .line 112
    iget p2, p2, Lw4/a1;->a:I

    .line 113
    .line 114
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    return p1

    .line 123
    :pswitch_3
    check-cast p2, Lw4/l0;

    .line 124
    .line 125
    iget p2, p2, Lw4/l0;->a:I

    .line 126
    .line 127
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p1, Lw4/l0;

    .line 132
    .line 133
    iget p1, p1, Lw4/l0;->a:I

    .line 134
    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p2, p1}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    return p1

    .line 144
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 145
    .line 146
    check-cast p2, Landroid/view/View;

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    sub-int/2addr p1, p2

    .line 157
    return p1

    .line 158
    :pswitch_5
    check-cast p1, Ls/h;

    .line 159
    .line 160
    check-cast p2, Ls/h;

    .line 161
    .line 162
    iget p1, p1, Ls/h;->k:I

    .line 163
    .line 164
    iget p2, p2, Ls/h;->k:I

    .line 165
    .line 166
    sub-int/2addr p1, p2

    .line 167
    return p1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
