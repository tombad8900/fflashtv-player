.class public final synthetic Lc5/g1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Ly6/a;

.field public final synthetic f:Ly6/a;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/content/Context;IZLy6/a;Ly6/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/g1;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/g1;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput p3, p0, Lc5/g1;->c:I

    .line 9
    .line 10
    iput-boolean p4, p0, Lc5/g1;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, Lc5/g1;->e:Ly6/a;

    .line 13
    .line 14
    iput-object p6, p0, Lc5/g1;->f:Ly6/a;

    .line 15
    .line 16
    iput-boolean p7, p0, Lc5/g1;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc5/g1;->a:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lc5/g1;->e:Ly6/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    if-eqz p2, :cond_8

    .line 9
    .line 10
    const-string p2, "ctx"

    .line 11
    .line 12
    iget-object v4, p0, Lc5/g1;->b:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p2, v4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-virtual {p2, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 24
    .line 25
    .line 26
    iget v6, p0, Lc5/g1;->c:I

    .line 27
    .line 28
    add-int/lit8 v6, v6, -0x2

    .line 29
    .line 30
    if-gez v6, :cond_0

    .line 31
    .line 32
    move v6, v5

    .line 33
    :cond_0
    int-to-float v6, v6

    .line 34
    invoke-virtual {p2, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    int-to-float v6, v6

    .line 42
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const/4 v8, 0x1

    .line 51
    invoke-static {v8, v6, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    float-to-int v6, v6

    .line 56
    sget v7, Lc5/z;->f:I

    .line 57
    .line 58
    invoke-virtual {p2, v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p2}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    iget-boolean p2, p0, Lc5/g1;->d:Z

    .line 65
    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    const p2, 0x3f87ae14    # 1.06f

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 75
    .line 76
    .line 77
    :cond_1
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 80
    .line 81
    .line 82
    :cond_2
    const/16 p2, 0x8

    .line 83
    .line 84
    int-to-float p2, p2

    .line 85
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v8, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    float-to-int p2, p2

    .line 98
    int-to-float p2, p2

    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lc5/g1;->f:Ly6/a;

    .line 103
    .line 104
    if-eqz p2, :cond_3

    .line 105
    .line 106
    invoke-interface {p2}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 117
    .line 118
    .line 119
    :cond_3
    iget-boolean p2, p0, Lc5/g1;->g:Z

    .line 120
    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    :goto_0
    instance-of v0, p2, Landroid/view/View;

    .line 128
    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    instance-of v0, p2, Landroid/widget/HorizontalScrollView;

    .line 132
    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    move-object v0, p2

    .line 136
    check-cast v0, Landroid/widget/HorizontalScrollView;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    move-object v0, v2

    .line 140
    :goto_1
    if-eqz v0, :cond_6

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    int-to-float p2, p2

    .line 147
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    int-to-float p1, p1

    .line 152
    const/high16 v1, 0x40000000    # 2.0f

    .line 153
    .line 154
    div-float/2addr p1, v1

    .line 155
    add-float/2addr p1, p2

    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    int-to-float p2, p2

    .line 161
    div-float/2addr p2, v1

    .line 162
    sub-float/2addr p1, p2

    .line 163
    invoke-static {p1}, Lcom/bumptech/glide/d;->f0(F)I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-gez p1, :cond_5

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    move v5, p1

    .line 171
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    sub-int/2addr p1, v5

    .line 176
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-le p1, v8, :cond_7

    .line 181
    .line 182
    new-instance p1, Lc5/c0;

    .line 183
    .line 184
    const/4 p2, 0x1

    .line 185
    invoke-direct {p1, v5, p2, v0}, Lc5/c0;-><init>(IILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_6
    check-cast p2, Landroid/view/View;

    .line 193
    .line 194
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    goto :goto_0

    .line 199
    :cond_7
    return-void

    .line 200
    :cond_8
    invoke-virtual {v0, v2}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v3}, Landroid/view/View;->setScaleX(F)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v3}, Landroid/view/View;->setScaleY(F)V

    .line 207
    .line 208
    .line 209
    if-eqz v1, :cond_9

    .line 210
    .line 211
    invoke-interface {v1}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    check-cast p2, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 222
    .line 223
    .line 224
    :cond_9
    const/4 p2, 0x0

    .line 225
    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    .line 226
    .line 227
    .line 228
    return-void
.end method
