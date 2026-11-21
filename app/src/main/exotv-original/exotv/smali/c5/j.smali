.class public final Lc5/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lc5/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc5/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc5/j;->a:Lc5/j;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lh/i;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x7f050002

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x1a

    .line 17
    .line 18
    const/16 v3, 0x1e

    .line 19
    .line 20
    const/16 v4, 0x23

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-static {v0, v6}, Landroid/support/v4/media/session/b;->G(Landroid/view/Window;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, Ll/o;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Ll/o;-><init>(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt p0, v4, :cond_0

    .line 41
    .line 42
    new-instance p0, Lm0/w1;

    .line 43
    .line 44
    invoke-direct {p0, v0, v1}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    if-lt p0, v3, :cond_1

    .line 49
    .line 50
    new-instance p0, Lm0/u1;

    .line 51
    .line 52
    invoke-direct {p0, v0, v1}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    if-lt p0, v2, :cond_2

    .line 57
    .line 58
    new-instance p0, Lm0/t1;

    .line 59
    .line 60
    invoke-direct {p0, v0, v1}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance p0, Lm0/s1;

    .line 65
    .line 66
    invoke-direct {p0, v0, v1}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {p0, v5}, Lcom/bumptech/glide/d;->L(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/bumptech/glide/d;->j0()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    invoke-static {v0, v6}, Landroid/support/v4/media/session/b;->G(Landroid/view/Window;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v7, Ll/o;

    .line 84
    .line 85
    invoke-direct {v7, v1}, Ll/o;-><init>(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    if-lt v1, v4, :cond_4

    .line 91
    .line 92
    new-instance v1, Lm0/w1;

    .line 93
    .line 94
    invoke-direct {v1, v0, v7}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-lt v1, v3, :cond_5

    .line 99
    .line 100
    new-instance v1, Lm0/u1;

    .line 101
    .line 102
    invoke-direct {v1, v0, v7}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    if-lt v1, v2, :cond_6

    .line 107
    .line 108
    new-instance v1, Lm0/t1;

    .line 109
    .line 110
    invoke-direct {v1, v0, v7}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    new-instance v1, Lm0/s1;

    .line 115
    .line 116
    invoke-direct {v1, v0, v7}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual {v1, v6}, Lcom/bumptech/glide/d;->i0(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v5}, Lcom/bumptech/glide/d;->n0(I)V

    .line 123
    .line 124
    .line 125
    const v0, 0x1020002

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lh/i;->findViewById(I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Landroid/view/ViewGroup;

    .line 133
    .line 134
    if-nez v0, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    const-string v1, "exoStatusBarScrim"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_8

    .line 144
    .line 145
    :goto_2
    return-void

    .line 146
    :cond_8
    new-instance v2, Landroid/view/View;

    .line 147
    .line 148
    invoke-direct {v2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const/high16 p0, 0x33000000

    .line 155
    .line 156
    invoke-virtual {v2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v6}, Landroid/view/View;->setClickable(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 163
    .line 164
    .line 165
    const/4 p0, 0x2

    .line 166
    invoke-virtual {v2, p0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 167
    .line 168
    .line 169
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 170
    .line 171
    const/4 v1, -0x1

    .line 172
    invoke-direct {p0, v1, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    new-instance p0, Landroidx/media3/common/n;

    .line 179
    .line 180
    const/16 v0, 0x14

    .line 181
    .line 182
    invoke-direct {p0, v0}, Landroidx/media3/common/n;-><init>(I)V

    .line 183
    .line 184
    .line 185
    sget-object v0, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 186
    .line 187
    invoke-static {v2, p0}, Lm0/e0;->j(Landroid/view/View;Lm0/o;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;
    .locals 2

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    .line 17
    .line 18
    const/high16 p1, 0x41400000    # 12.0f

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x11

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {p0, p3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {v0, p1, v1, p3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x6

    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-static {p2, p0, p1, p1}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public static c()Landroid/graphics/drawable/GradientDrawable;
    .locals 7

    .line 1
    sget v0, Lc5/z;->b:I

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 4
    .line 5
    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/16 v6, 0xcc

    .line 20
    .line 21
    invoke-static {v6, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    filled-new-array {v4, v3, v0}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static d(Landroid/content/Context;I)I
    .locals 1

    .line 1
    const-string v0, "ctx"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    float-to-int p0, p0

    .line 21
    return p0
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-le v0, p0, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p1}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "..."

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    return-object p1
.end method

.method public static f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V
    .locals 11

    .line 1
    move/from16 p0, p7

    .line 2
    .line 3
    and-int/lit8 v0, p0, 0x10

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v7, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v7, v1

    .line 12
    :goto_0
    and-int/lit8 v0, p0, 0x20

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v8, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v8, p4

    .line 20
    :goto_1
    and-int/lit8 v0, p0, 0x40

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    move-object v9, v3

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move-object/from16 v9, p5

    .line 27
    .line 28
    :goto_2
    and-int/lit16 v0, p0, 0x80

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_3
    move-object/from16 v3, p6

    .line 34
    .line 35
    :goto_3
    and-int/lit16 p0, p0, 0x100

    .line 36
    .line 37
    if-eqz p0, :cond_4

    .line 38
    .line 39
    move v10, v1

    .line 40
    goto :goto_4

    .line 41
    :cond_4
    move v10, v2

    .line 42
    :goto_4
    const-string p0, "ctx"

    .line 43
    .line 44
    invoke-static {p0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string p0, "view"

    .line 48
    .line 49
    invoke-static {p0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const v0, 0x7f050002

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    invoke-virtual {p2, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 66
    .line 67
    .line 68
    if-nez v3, :cond_5

    .line 69
    .line 70
    move-object v4, p2

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move-object v4, v3

    .line 73
    :goto_5
    new-instance v3, Lc5/g1;

    .line 74
    .line 75
    move-object v5, p1

    .line 76
    move v6, p3

    .line 77
    invoke-direct/range {v3 .. v10}, Lc5/g1;-><init>(Landroid/view/View;Landroid/content/Context;IZLy6/a;Ly6/a;Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v3}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    return-void
.end method

.method public static g(Lh/i;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f050002

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static i(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    int-to-float p1, p1

    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 15
    .line 16
    .line 17
    if-lez p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p2, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/Double;ILjava/lang/String;)Landroid/widget/LinearLayout;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v2, -0x2

    .line 24
    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    invoke-static {p0, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 51
    .line 52
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v5, "%.1f"

    .line 65
    .line 66
    invoke-static {p1, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p0, p1, p2, v4, v1}, Lc5/j;->b(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    if-eqz p3, :cond_2

    .line 78
    .line 79
    sget p1, Lc5/z;->g:I

    .line 80
    .line 81
    invoke-static {p0, p3, p1, v4, v1}, Lc5/j;->b(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 86
    .line 87
    invoke-direct {p2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 88
    .line 89
    .line 90
    const/16 p3, 0x8

    .line 91
    .line 92
    invoke-static {p0, p3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-virtual {p2, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-object v0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;FIIII)Landroid/widget/LinearLayout;
    .locals 3

    .line 1
    and-int/lit8 v0, p6, 0x20

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x14

    .line 9
    .line 10
    :goto_0
    and-int/lit8 p6, p6, 0x40

    .line 11
    .line 12
    if-eqz p6, :cond_1

    .line 13
    .line 14
    move p5, v1

    .line 15
    :cond_1
    const-string p6, "ctx"

    .line 16
    .line 17
    invoke-static {p6, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p6, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-direct {p6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p6, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 26
    .line 27
    .line 28
    const/16 v2, 0x10

    .line 29
    .line 30
    invoke-virtual {p6, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {p0, v0}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    invoke-static {p0, p5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    invoke-virtual {p6, v2, v0, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    .line 50
    .line 51
    .line 52
    const p4, 0x3f4ccccd    # 0.8f

    .line 53
    .line 54
    .line 55
    mul-float/2addr p4, p2

    .line 56
    float-to-int p4, p4

    .line 57
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    new-instance p5, Landroid/view/View;

    .line 62
    .line 63
    invoke-direct {p5, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    sget v0, Lc5/z;->f:I

    .line 67
    .line 68
    const/4 v2, 0x2

    .line 69
    invoke-static {v0, v2, v1, v1}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 77
    .line 78
    const/4 v2, 0x4

    .line 79
    invoke-static {p0, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-direct {v0, v2, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 84
    .line 85
    .line 86
    const/16 p4, 0x8

    .line 87
    .line 88
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    iput p4, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 93
    .line 94
    invoke-virtual {p5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p6, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    new-instance p4, Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-direct {p4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 115
    .line 116
    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p4, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p6, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    return-object p6
.end method

.method public static l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V
    .locals 9

    .line 1
    and-int/lit8 p4, p4, 0x20

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    new-instance p3, Lc5/f;

    .line 6
    .line 7
    const/4 p4, 0x0

    .line 8
    invoke-direct {p3, p4}, Lc5/f;-><init>(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    move-object v1, p3

    .line 12
    const-string p3, "activity"

    .line 13
    .line 14
    invoke-static {p3, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string p3, "id"

    .line 18
    .line 19
    invoke-static {p3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    new-instance v0, Lc5/i;

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v3, -0x1

    .line 30
    const/4 v4, -0x1

    .line 31
    const/4 v7, -0x1

    .line 32
    move-object v5, p0

    .line 33
    move-object v2, p1

    .line 34
    move-object v6, p2

    .line 35
    invoke-direct/range {v0 .. v8}, Lc5/i;-><init>(Ly6/a;Ljava/lang/String;IILb/l;Ljava/lang/String;ILp6/c;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-static {p3, p1, v0, p0}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public h(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/FrameLayout;
    .locals 10

    .line 1
    new-instance v8, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v8, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {v8, v0}, Landroid/view/View;->setId(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v8, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    sget v0, Lc5/z;->c:I

    .line 17
    .line 18
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    .line 20
    .line 21
    const/high16 v0, 0x41600000    # 14.0f

    .line 22
    .line 23
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {p1, v0}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    const/high16 v3, 0x3f800000    # 1.0f

    .line 33
    .line 34
    invoke-virtual {v8, v2, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 35
    .line 36
    .line 37
    const v2, 0x3ca3d70a    # 0.02f

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 41
    .line 42
    .line 43
    const/16 v9, 0x10

    .line 44
    .line 45
    invoke-static {p1, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/16 v3, 0x14

    .line 50
    .line 51
    invoke-static {p1, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {p1, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-virtual {v8, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 67
    .line 68
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    const v0, 0x7f11011e

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    sget v0, Lc5/z;->f:I

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 89
    .line 90
    .line 91
    const/high16 v0, 0x41500000    # 13.0f

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaintFlags()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    or-int/lit8 v0, v0, 0x8

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x6

    .line 114
    invoke-static {p1, v0}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v3, 0x1

    .line 119
    invoke-static {p1, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-static {p1, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v2, v0, v4, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 128
    .line 129
    .line 130
    sget v0, Lc5/z;->b:I

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 139
    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    const/16 v7, 0x1e4

    .line 143
    .line 144
    const/16 v3, 0x8

    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x0

    .line 148
    move-object v0, p0

    .line 149
    move-object v1, p1

    .line 150
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Landroid/widget/FrameLayout;

    .line 154
    .line 155
    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 159
    .line 160
    const/4 v4, -0x1

    .line 161
    const/4 v5, -0x2

    .line 162
    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 169
    .line 170
    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 171
    .line 172
    .line 173
    const v4, 0x800035

    .line 174
    .line 175
    .line 176
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 177
    .line 178
    invoke-static {p1, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 183
    .line 184
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    new-instance v3, Lc5/e1;

    .line 188
    .line 189
    invoke-direct {v3, v8, v2, v0}, Lc5/e1;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 193
    .line 194
    .line 195
    new-instance v3, Lc5/f1;

    .line 196
    .line 197
    const/4 v4, 0x0

    .line 198
    invoke-direct {v3, v8, v2, p1, v4}, Lc5/f1;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    return-object v0
.end method
