.class public final synthetic Lw4/y0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/exotv/net/SeriesDetailActivity;

.field public final synthetic k:I

.field public final synthetic l:Landroid/view/View;

.field public final synthetic m:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/SeriesDetailActivity;ILandroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/y0;->j:Lcom/exotv/net/SeriesDetailActivity;

    .line 5
    .line 6
    iput p2, p0, Lw4/y0;->k:I

    .line 7
    .line 8
    iput-object p3, p0, Lw4/y0;->l:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Lw4/y0;->m:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lw4/y0;->j:Lcom/exotv/net/SeriesDetailActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "pageScroll"

    .line 7
    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    const/16 v1, 0x24

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-static {v5, v1, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    float-to-int v1, v1

    .line 35
    const/4 v4, 0x2

    .line 36
    iget v5, p0, Lw4/y0;->k:I

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-lt v5, v4, :cond_4

    .line 40
    .line 41
    iget-object v4, p0, Lw4/y0;->l:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    new-instance v5, Landroid/graphics/Rect;

    .line 50
    .line 51
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v5}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 55
    .line 56
    .line 57
    iget-object v7, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 58
    .line 59
    if-eqz v7, :cond_3

    .line 60
    .line 61
    invoke-virtual {v7, v4, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    iget-object v4, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/2addr v4, v1

    .line 73
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 74
    .line 75
    if-ge v5, v4, :cond_4

    .line 76
    .line 77
    iget-object v0, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    sub-int/2addr v5, v1

    .line 82
    invoke-virtual {v0, v6, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v2

    .line 90
    :cond_2
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v2

    .line 94
    :cond_3
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v2

    .line 98
    :cond_4
    iget-object v4, p0, Lw4/y0;->m:Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_9

    .line 105
    .line 106
    new-instance v5, Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v5}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 112
    .line 113
    .line 114
    iget-object v7, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 115
    .line 116
    if-eqz v7, :cond_8

    .line 117
    .line 118
    invoke-virtual {v7, v4, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 119
    .line 120
    .line 121
    iget-object v4, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    iget-object v7, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 130
    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    add-int/2addr v7, v4

    .line 138
    sub-int/2addr v7, v1

    .line 139
    iget v4, v5, Landroid/graphics/Rect;->bottom:I

    .line 140
    .line 141
    if-le v4, v7, :cond_9

    .line 142
    .line 143
    iget-object v0, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 144
    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    sub-int/2addr v4, v2

    .line 152
    add-int/2addr v4, v1

    .line 153
    invoke-virtual {v0, v6, v4}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_5
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v2

    .line 161
    :cond_6
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v2

    .line 165
    :cond_7
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :cond_8
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v2

    .line 173
    :cond_9
    :goto_0
    return-void

    .line 174
    :cond_a
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v2
.end method
