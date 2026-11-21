.class public Lcom/google/android/material/theme/MaterialComponentsViewInflater;
.super Lh/a0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/a0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Lm/o;
    .locals 1

    .line 1
    new-instance v0, Lb6/a0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lb6/a0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;)Lm/q;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/button/MaterialButton;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)Lm/r;
    .locals 1

    .line 1
    new-instance v0, Ll5/c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ll5/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;)Lm/c0;
    .locals 1

    .line 1
    new-instance v0, Lu5/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lu5/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)Lm/w0;
    .locals 8

    .line 1
    new-instance v0, Lc6/a;

    .line 2
    .line 3
    const v1, 0x1010084

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p1, p2, v1, v2}, Ld6/a;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1, p2, v1}, Lm/w0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const v4, 0x7f040527

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v3, v4, v5}, Lt5/a;->p(Landroid/content/res/Resources$Theme;IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget-object v4, Ld5/a;->w:[I

    .line 37
    .line 38
    invoke-virtual {v3, p2, v4, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x2

    .line 43
    filled-new-array {v5, v7}, [I

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {p1, v6, v5}, Lc6/a;->h(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    .line 53
    .line 54
    const/4 v5, -0x1

    .line 55
    if-eq p1, v5, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v3, p2, v4, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 67
    .line 68
    .line 69
    if-eq p2, v5, :cond_1

    .line 70
    .line 71
    sget-object p1, Ld5/a;->v:[I

    .line 72
    .line 73
    invoke-virtual {v3, p2, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 v1, 0x4

    .line 82
    filled-new-array {v7, v1}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {p2, p1, v1}, Lc6/a;->h(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 91
    .line 92
    .line 93
    if-ltz p2, :cond_1

    .line 94
    .line 95
    invoke-virtual {v0, p2}, Lm/w0;->setLineHeight(I)V

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_0
    return-object v0
.end method
