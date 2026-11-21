.class public La1/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li0/a;
.implements Lcom/bumptech/glide/load/data/d;
.implements Ly3/k;
.implements Lh4/n;
.implements Lk1/g;
.implements Lp3/g;


# static fields
.field public static m:Z


# instance fields
.field public final synthetic j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, La1/e;->j:I

    sparse-switch p1, :sswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Lb4/c;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, v0}, Lb4/c;-><init>(Lb4/h;)V

    .line 7
    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    .line 9
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    .line 12
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 14
    new-instance p1, Lp/e;

    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, v0}, Lp/k;-><init>(I)V

    .line 16
    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    .line 17
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    return-void

    .line 19
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Lu4/i;

    const-wide/16 v0, 0x3e8

    invoke-direct {p1, v0, v1}, Lu4/i;-><init>(J)V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 21
    new-instance p1, Ly5/f;

    const/16 v0, 0xd

    .line 22
    invoke-direct {p1, v0}, Ly5/f;-><init>(I)V

    const/16 v0, 0xa

    .line 23
    invoke-static {v0, p1}, Lv4/c;->a(ILv4/a;)La4/c;

    move-result-object p1

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 26
    new-instance p1, Lc4/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lc4/c;-><init>(I)V

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_4
        0x8 -> :sswitch_3
        0x14 -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, La1/e;->j:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 119
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, La1/e;->j:I

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 125
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(ILa4/j;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, La1/e;->j:I

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p2, p0, La1/e;->k:Ljava/lang/Object;

    .line 97
    new-instance p2, Lp3/e;

    invoke-direct {p2, p1, p0}, Lp3/e;-><init>(ILa1/e;)V

    iput-object p2, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, La1/e;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La1/n0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La1/e;->j:I

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 94
    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La1/e;->j:I

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 109
    iput-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 110
    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x13

    iput v0, p0, La1/e;->j:I

    .line 98
    new-instance v0, Li2/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li2/e;-><init>(I)V

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 101
    iput-object v0, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, La1/e;->j:I

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 104
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, La1/e;->j:I

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    invoke-static {p1}, Lm0/z0;->g(Landroid/view/WindowInsetsAnimation$Bounds;)Le0/b;

    move-result-object v0

    iput-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 122
    invoke-static {p1}, Lm0/z0;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Le0/b;

    move-result-object p1

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La1/e;->j:I

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/exotv/net/MainActivity;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x9

    iput v2, v0, La1/e;->j:I

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La1/e;->k:Ljava/lang/Object;

    .line 31
    new-instance v2, Lc5/c1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lc5/c1;-><init>(ILjava/lang/Object;)V

    .line 32
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    .line 33
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 34
    sget v5, Lc5/z;->b:I

    .line 35
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 v5, 0xa

    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v5}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v7, 0x6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v2, v5}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v8, 0x4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v6, v7, v5, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    .line 38
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v7, 0x10

    .line 39
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v7, 0xc

    .line 40
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    const/16 v9, 0x9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v2, v9}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    const/16 v11, 0x8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v2, v11}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    invoke-virtual {v2, v9}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v5, v8, v10, v12, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 41
    sget v8, Lc5/z;->h:I

    .line 42
    sget v9, Lc5/z;->i:I

    const/16 v10, 0xe

    .line 43
    invoke-static {v8, v10, v4, v9}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    invoke-virtual {v5, v4}, Landroid/view/View;->setClickable(Z)V

    .line 45
    invoke-virtual {v5, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 46
    new-instance v8, Lc5/d1;

    const/4 v10, 0x0

    invoke-direct {v8, v10, v0}, Lc5/d1;-><init>(ILa1/e;)V

    invoke-virtual {v5, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    new-instance v8, Landroid/widget/ImageView;

    invoke-direct {v8, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v10, 0x7f08010c

    .line 48
    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 49
    sget-object v10, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v12, -0x1

    const/16 v13, 0x3e7

    .line 50
    invoke-static {v12, v13, v6, v6}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v14

    .line 51
    invoke-virtual {v8, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v14, 0x7f11013c

    .line 52
    invoke-virtual {v1, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v14}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v15, 0x1e

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v2, v15}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Number;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v13

    invoke-virtual {v2, v15}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    invoke-direct {v14, v13, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 54
    invoke-virtual {v5, v8, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 56
    invoke-virtual {v8, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 57
    invoke-virtual {v2, v7}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v2, v11}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-virtual {v8, v7, v6, v11, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v11, 0x7f11013e

    .line 59
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(I)V

    .line 60
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v11, 0x41600000    # 14.0f

    .line 61
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 62
    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 63
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 64
    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 65
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 66
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 67
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v11, 0x7f11013b

    .line 68
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(I)V

    .line 69
    sget v11, Lc5/z;->c:I

    .line 70
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v13, 0x41400000    # 12.0f

    .line 71
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 72
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 73
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 74
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    invoke-direct {v13, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v15, 0x2

    .line 75
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v2, v15}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    iput v15, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 76
    invoke-virtual {v8, v7, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v7, v6, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v8, 0x7f0800f5

    .line 79
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 80
    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/16 v8, 0x3e7

    .line 81
    invoke-static {v9, v8, v6, v6}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    .line 82
    invoke-virtual {v7, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v6, 0x7

    .line 83
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v6}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v2, v6}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v2, v6}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v2, v6}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v7, v8, v9, v10, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 84
    invoke-virtual {v7, v11}, Landroid/widget/ImageView;->setColorFilter(I)V

    const v6, 0x7f11013a

    .line 85
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 86
    invoke-virtual {v7, v4}, Landroid/view/View;->setClickable(Z)V

    .line 87
    new-instance v1, Lc5/d1;

    invoke-direct {v1, v4, v0}, Lc5/d1;-><init>(ILa1/e;)V

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v2, v4}, Lc5/c1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v1, v6, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 89
    invoke-virtual {v5, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v12, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    iput-object v3, v0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, La1/e;->j:I

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    iput-object p3, p0, La1/e;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p3, p0, La1/e;->j:I

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    iput-object p2, p0, La1/e;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v0, 0xb

    iput v0, p0, La1/e;->j:I

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 113
    new-array v1, v0, [I

    iput-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 114
    new-array v1, v0, [F

    iput-object v1, p0, La1/e;->l:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 115
    iget-object v2, p0, La1/e;->k:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 116
    iget-object v2, p0, La1/e;->l:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, La1/e;->j:I

    const-string v0, "input"

    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk2/b;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, La1/e;->j:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 29
    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln0/b;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, La1/e;->j:I

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 129
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La1/e;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh7/e;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lh7/e;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lh7/e;-><init>(La1/e;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lh7/e;

    .line 17
    .line 18
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public declared-synchronized B(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_1
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public C(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/o;La1/n0;Z)Lcom/bumptech/glide/m;
    .locals 4

    .line 1
    invoke-static {}, Lu4/m;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lu4/m;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/bumptech/glide/m;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Ln4/h;

    .line 20
    .line 21
    invoke-direct {v1, p3}, Ln4/h;-><init>(Landroidx/lifecycle/o;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, La1/e;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lk2/b;

    .line 27
    .line 28
    new-instance v3, Lk2/b;

    .line 29
    .line 30
    invoke-direct {v3, p0, p4}, Lk2/b;-><init>(La1/e;La1/n0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p4, Lcom/bumptech/glide/m;

    .line 37
    .line 38
    invoke-direct {p4, p2, v1, v3, p1}, Lcom/bumptech/glide/m;-><init>(Lcom/bumptech/glide/b;Ln4/g;Lk2/b;Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    new-instance p1, Ln4/j;

    .line 45
    .line 46
    invoke-direct {p1, p0, p3}, Ln4/j;-><init>(La1/e;Landroidx/lifecycle/o;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ln4/h;->a(Ln4/i;)V

    .line 50
    .line 51
    .line 52
    if-eqz p5, :cond_0

    .line 53
    .line 54
    invoke-virtual {p4}, Lcom/bumptech/glide/m;->k()V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-object p4

    .line 58
    :cond_1
    return-object v1
.end method

.method public declared-synchronized D(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_4

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    check-cast v5, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, p0, La1/e;->l:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/util/List;

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lp4/c;

    .line 55
    .line 56
    iget-object v7, v6, Lp4/c;->a:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    iget-object v7, v6, Lp4/c;->b:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    const/4 v7, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v7, v3

    .line 75
    :goto_2
    if-eqz v7, :cond_2

    .line 76
    .line 77
    iget-object v7, v6, Lp4/c;->b:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_2

    .line 84
    .line 85
    iget-object v6, v6, Lp4/c;->b:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    throw p1
.end method

.method public E(Ly3/e;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu4/i;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lu4/i;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lu4/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La4/c;

    .line 22
    .line 23
    invoke-virtual {v0}, La4/c;->acquire()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lc4/i;

    .line 28
    .line 29
    :try_start_1
    iget-object v1, v0, Lc4/i;->j:Ljava/security/MessageDigest;

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ly3/e;->a(Ljava/security/MessageDigest;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lc4/i;->j:Ljava/security/MessageDigest;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Lu4/m;->b:[C

    .line 41
    .line 42
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    :try_start_2
    array-length v4, v1

    .line 45
    if-ge v3, v4, :cond_0

    .line 46
    .line 47
    aget-byte v4, v1, v3

    .line 48
    .line 49
    and-int/lit16 v5, v4, 0xff

    .line 50
    .line 51
    mul-int/lit8 v6, v3, 0x2

    .line 52
    .line 53
    sget-object v7, Lu4/m;->a:[C

    .line 54
    .line 55
    ushr-int/lit8 v5, v5, 0x4

    .line 56
    .line 57
    aget-char v5, v7, v5

    .line 58
    .line 59
    aput-char v5, v2, v6

    .line 60
    .line 61
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    and-int/lit8 v4, v4, 0xf

    .line 64
    .line 65
    aget-char v4, v7, v4

    .line 66
    .line 67
    aput-char v4, v2, v6

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 75
    .line 76
    .line 77
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    iget-object v2, p0, La1/e;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, La4/c;

    .line 81
    .line 82
    invoke-virtual {v2, v0}, La4/c;->g(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, La4/c;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, La4/c;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_1
    :goto_1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v2, v0

    .line 101
    check-cast v2, Lu4/i;

    .line 102
    .line 103
    monitor-enter v2

    .line 104
    :try_start_5
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lu4/i;

    .line 107
    .line 108
    invoke-virtual {v0, p1, v1}, Lu4/i;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    monitor-exit v2

    .line 112
    return-object v1

    .line 113
    :catchall_2
    move-exception p1

    .line 114
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 115
    throw p1

    .line 116
    :catchall_3
    move-exception p1

    .line 117
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 118
    throw p1
.end method

.method public declared-synchronized F()Ljava/util/Map;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public G(Lk/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/h;

    .line 4
    .line 5
    iget-object v1, v0, La1/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/ActionMode$Callback;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, La1/h;->g(Lk/a;)Lk/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v1, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La1/e;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lh/x;

    .line 19
    .line 20
    iget-object v0, p1, Lh/x;->F:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, Lh/x;->u:Landroid/view/Window;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Lh/x;->G:Lh/p;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p1, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lh/x;->H:Lm0/r0;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lm0/r0;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Lh/x;->E:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-static {v0}, Lm0/m0;->a(Landroid/view/View;)Lm0/r0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lm0/r0;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Lh/x;->H:Lm0/r0;

    .line 57
    .line 58
    new-instance v1, Lh/r;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, v2, p0}, Lh/r;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lm0/r0;->d(Lm0/s0;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    iput-object v0, p1, Lh/x;->D:Lk/a;

    .line 69
    .line 70
    iget-object v0, p1, Lh/x;->J:Landroid/view/ViewGroup;

    .line 71
    .line 72
    sget-object v1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-static {v0}, Lm0/c0;->c(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lh/x;->H()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public H(Lk/a;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/x;

    .line 4
    .line 5
    iget-object v0, v0, Lh/x;->J:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-static {v0}, Lm0/c0;->c(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La1/h;

    .line 15
    .line 16
    iget-object v1, v0, La1/h;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/view/ActionMode$Callback;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La1/h;->g(Lk/a;)Lk/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v2, v0, La1/h;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lp/k;

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/view/Menu;

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    new-instance v3, Ll/c0;

    .line 37
    .line 38
    iget-object v0, v0, La1/h;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    move-object v4, p2

    .line 43
    check-cast v4, Ll/m;

    .line 44
    .line 45
    invoke-direct {v3, v0, v4}, Ll/c0;-><init>(Landroid/content/Context;Ll/m;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p2, v3}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {v1, p1, v3}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1
.end method

.method public I(Lj0/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj0/l;

    .line 4
    .line 5
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La1/o;

    .line 8
    .line 9
    iget v2, p1, Lj0/g;->b:I

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lj0/g;->a:Landroid/graphics/Typeface;

    .line 14
    .line 15
    new-instance v2, Lj6/q;

    .line 16
    .line 17
    const/4 v3, 0x7

    .line 18
    invoke-direct {v2, v1, v3, p1}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lj0/l;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/f;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-direct {p1, v2, v3, v1}, Lcom/google/android/material/datepicker/f;-><init>(IILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lj0/l;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public J(Lb4/h;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lb4/c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lb4/c;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lb4/c;-><init>(Lb4/h;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v1, Lb4/c;->d:Lb4/c;

    .line 19
    .line 20
    iget-object v2, p0, La1/e;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lb4/c;

    .line 23
    .line 24
    iget-object v3, v2, Lb4/c;->d:Lb4/c;

    .line 25
    .line 26
    iput-object v3, v1, Lb4/c;->d:Lb4/c;

    .line 27
    .line 28
    iput-object v2, v1, Lb4/c;->c:Lb4/c;

    .line 29
    .line 30
    iput-object v1, v2, Lb4/c;->d:Lb4/c;

    .line 31
    .line 32
    iget-object v2, v1, Lb4/c;->d:Lb4/c;

    .line 33
    .line 34
    iput-object v1, v2, Lb4/c;->c:Lb4/c;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p1}, Lb4/h;->a()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p1, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    :cond_1
    iget-object p1, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Removed the wrong lock, expected to remove: "

    .line 2
    .line 3
    const-string v1, "Cannot release a lock that is not held, safeKey: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, La1/e;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {v3, v2}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast v2, Lc4/b;

    .line 20
    .line 21
    iget v3, v2, Lc4/b;->b:I

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-lt v3, v4, :cond_3

    .line 25
    .line 26
    sub-int/2addr v3, v4

    .line 27
    iput v3, v2, Lc4/b;->b:I

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lc4/b;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, La1/e;->l:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lc4/c;

    .line 50
    .line 51
    iget-object v0, p1, Lc4/c;->a:Ljava/util/ArrayDeque;

    .line 52
    .line 53
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    :try_start_1
    iget-object v3, p1, Lc4/c;->a:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/16 v4, 0xa

    .line 61
    .line 62
    if-ge v3, v4, :cond_0

    .line 63
    .line 64
    iget-object p1, p1, Lc4/c;->a:Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    monitor-exit v0

    .line 73
    goto :goto_2

    .line 74
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :try_start_2
    throw p1

    .line 76
    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ", but actually removed: "

    .line 87
    .line 88
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ", safeKey: "

    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v3

    .line 110
    :catchall_1
    move-exception p1

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 113
    iget-object p1, v2, Lc4/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    new-instance v3, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, ", interestedThreads: "

    .line 130
    .line 131
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget p1, v2, Lc4/b;->b:I

    .line 135
    .line 136
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 148
    throw p1
.end method

.method public L()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb4/c;

    .line 4
    .line 5
    iget-object v1, v0, Lb4/c;->d:Lb4/c;

    .line 6
    .line 7
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v1, Lb4/c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_1
    if-lez v2, :cond_1

    .line 27
    .line 28
    iget-object v4, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    if-eqz v4, :cond_2

    .line 37
    .line 38
    return-object v4

    .line 39
    :cond_2
    iget-object v2, v1, Lb4/c;->d:Lb4/c;

    .line 40
    .line 41
    iget-object v4, v1, Lb4/c;->c:Lb4/c;

    .line 42
    .line 43
    iput-object v4, v2, Lb4/c;->c:Lb4/c;

    .line 44
    .line 45
    iget-object v4, v1, Lb4/c;->c:Lb4/c;

    .line 46
    .line 47
    iput-object v2, v4, Lb4/c;->d:Lb4/c;

    .line 48
    .line 49
    iget-object v2, p0, La1/e;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    check-cast v3, Lb4/h;

    .line 57
    .line 58
    invoke-interface {v3}, Lb4/h;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Lb4/c;->d:Lb4/c;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object v4
.end method

.method public M()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb/j;

    .line 4
    .line 5
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lb/j;->g:Landroid/os/Bundle;

    .line 10
    .line 11
    iget-object v3, v0, Lb/j;->f:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    const-string v4, "key"

    .line 14
    .line 15
    invoke-static {v4, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, v0, Lb/j;->d:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget-object v4, v0, Lb/j;->b:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object v5, v0, Lb/j;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-interface {v5, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v4, v0, Lb/j;->e:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const-string v5, ": "

    .line 51
    .line 52
    const-string v6, "Dropping pending result for request "

    .line 53
    .line 54
    const-string v7, "ActivityResultRegistry"

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    new-instance v4, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    const/16 v4, 0x22

    .line 95
    .line 96
    if-lt v3, v4, :cond_2

    .line 97
    .line 98
    invoke-static {v1, v2}, Lh/l;->c(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-class v4, Ld/a;

    .line 108
    .line 109
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_3

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    const/4 v3, 0x0

    .line 117
    :goto_0
    check-cast v3, Ld/a;

    .line 118
    .line 119
    new-instance v4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v7, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    iget-object v0, v0, Lb/j;->c:Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-nez v0, :cond_5

    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 155
    .line 156
    .line 157
    throw v0
.end method

.method public a(I)V
    .locals 2

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La1/e;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lp3/e;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    invoke-virtual {p1, v0}, Lp/j;->n(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/16 v0, 0xa

    .line 15
    .line 16
    if-gt v0, p1, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x14

    .line 19
    .line 20
    if-ge p1, v0, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, La1/e;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lp3/e;

    .line 25
    .line 26
    iget-object v0, p1, Lp/j;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lk2/b;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget v1, p1, Lp/j;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    div-int/lit8 v1, v1, 0x2

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Lp/j;->n(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0

    .line 42
    throw p1

    .line 43
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->b(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;Lb4/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu4/d;

    .line 4
    .line 5
    iget-object v0, v0, Lu4/d;->k:Ljava/io/IOException;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lb4/a;->e(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    throw v0

    .line 15
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/k0;

    .line 4
    .line 5
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Le4/q;

    .line 8
    .line 9
    iget-object v0, v0, La4/k0;->o:Le4/q;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La4/k0;

    .line 18
    .line 19
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Le4/q;

    .line 22
    .line 23
    iget-object v2, v0, La4/k0;->k:La4/l;

    .line 24
    .line 25
    iget-object v0, v0, La4/k0;->p:La4/f;

    .line 26
    .line 27
    iget-object v1, v1, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 28
    .line 29
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {v2, v0, p1, v1, v3}, La4/l;->c(Ly3/e;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/e;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public e(Lp3/a;)Lp3/b;
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp3/e;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lp/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lp3/d;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lp3/b;

    .line 14
    .line 15
    iget-object v1, p1, Lp3/d;->a:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    iget-object p1, p1, Lp3/d;->b:Ljava/util/Map;

    .line 18
    .line 19
    invoke-direct {v0, v1, p1}, Lp3/b;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/k0;

    .line 4
    .line 5
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Le4/q;

    .line 8
    .line 9
    iget-object v0, v0, La4/k0;->o:Le4/q;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La4/k0;

    .line 18
    .line 19
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Le4/q;

    .line 22
    .line 23
    iget-object v2, v0, La4/k0;->j:La4/i;

    .line 24
    .line 25
    iget-object v2, v2, La4/i;->p:La4/n;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v3, v1, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 30
    .line 31
    invoke-interface {v3}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2, v3}, La4/n;->a(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    iput-object p1, v0, La4/k0;->n:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p1, v0, La4/k0;->k:La4/l;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-virtual {p1, v0}, La4/l;->l(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    move-object v2, v1

    .line 51
    iget-object v1, v0, La4/k0;->k:La4/l;

    .line 52
    .line 53
    move-object v3, v2

    .line 54
    iget-object v2, v3, Le4/q;->a:Ly3/e;

    .line 55
    .line 56
    iget-object v4, v3, Le4/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 57
    .line 58
    invoke-interface {v4}, Lcom/bumptech/glide/load/data/e;->c()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    iget-object v6, v0, La4/k0;->p:La4/f;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    invoke-virtual/range {v1 .. v6}, La4/l;->b(Ly3/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;ILy3/e;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void
.end method

.method public g(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 6

    .line 1
    invoke-static {p2}, Lb6/v;->d(Landroid/graphics/Bitmap;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lp3/e;

    .line 8
    .line 9
    iget-object v2, v1, Lp/j;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lk2/b;

    .line 12
    .line 13
    monitor-enter v2

    .line 14
    :try_start_0
    iget v1, v1, Lp/j;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    monitor-exit v2

    .line 17
    if-gt v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lp3/e;

    .line 22
    .line 23
    new-instance v2, Lp3/d;

    .line 24
    .line 25
    invoke-direct {v2, p2, p3, v0}, Lp3/d;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, v2}, Lp/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lp3/e;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, v1, Lp/j;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lk2/b;

    .line 42
    .line 43
    monitor-enter v2

    .line 44
    :try_start_1
    iget-object v3, v1, Lp/j;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lq/b;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v3, v3, Lq/b;->a:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    iget v4, v1, Lp/j;->c:I

    .line 60
    .line 61
    invoke-virtual {v1, p1, v3}, Lp/j;->l(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    sub-int/2addr v4, v5

    .line 66
    iput v4, v1, Lp/j;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    monitor-exit v2

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v1, p1, v3, v2}, Lp3/e;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La4/j;

    .line 81
    .line 82
    invoke-virtual {v1, p1, p2, p3, v0}, La4/j;->h(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :goto_1
    monitor-exit v2

    .line 87
    throw p1

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    monitor-exit v2

    .line 90
    throw p1
.end method

.method public h(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v1, v0, La1/n0;->t:La1/z;

    .line 6
    .line 7
    iget-object v1, v1, La1/z;->q:Lh/i;

    .line 8
    .line 9
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, La1/e;->h(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    throw v0

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh4/w;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Lh4/w;->j:[B

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    iput v1, v0, Lh4/w;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public j(Ly3/h;)I
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    return p1
.end method

.method public k(Ljava/lang/Object;Ljava/io/File;Ly3/h;)Z
    .locals 3

    .line 1
    check-cast p1, La4/f0;

    .line 2
    .line 3
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lh4/b;

    .line 6
    .line 7
    new-instance v1, Lh4/c;

    .line 8
    .line 9
    invoke-interface {p1}, La4/f0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v2, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lb4/a;

    .line 22
    .line 23
    invoke-direct {v1, p1, v2}, Lh4/c;-><init>(Landroid/graphics/Bitmap;Lb4/a;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, p2, p3}, Lh4/b;->k(Ljava/lang/Object;Ljava/io/File;Ly3/h;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public l()Lk1/h;
    .locals 3

    .line 1
    new-instance v0, Lk1/m;

    .line 2
    .line 3
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, La1/e;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Li2/e;

    .line 10
    .line 11
    invoke-virtual {v2}, Li2/e;->l()Lk1/h;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lk1/m;-><init>(Landroid/content/Context;Lk1/h;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public m(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->m(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public n(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->n(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public o(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->o(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/animation/Animator;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, La1/n0;->G(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Animator from operation "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La1/z0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " has been canceled."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "FragmentManager"

    .line 39
    .line 40
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public p(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->p(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public q(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v1, v0, La1/n0;->t:La1/z;

    .line 6
    .line 7
    iget-object v1, v1, La1/z;->q:Lh/i;

    .line 8
    .line 9
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, La1/e;->q(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    throw v0

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    return-void
.end method

.method public r(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->r(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public s(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->s(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public t(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->t(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, La1/e;->j:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Bounds{lower="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Le0/b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Le0/b;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, "}"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "GroupedLinkedMap( "

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lb4/c;

    .line 57
    .line 58
    iget-object v2, v1, Lb4/c;->c:Lb4/c;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    move v4, v3

    .line 62
    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    const/16 v4, 0x7b

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v4, v2, Lb4/c;->a:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/16 v4, 0x3a

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v4, v2, Lb4/c;->b:Ljava/util/ArrayList;

    .line 84
    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    move v4, v3

    .line 93
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v4, "}, "

    .line 97
    .line 98
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v2, v2, Lb4/c;->c:Lb4/c;

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    if-eqz v4, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/lit8 v1, v1, -0x2

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :cond_2
    const-string v1, " )"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    nop

    .line 131
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->u(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public v(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->v(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public w(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->w(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public x(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La1/n0;

    .line 4
    .line 5
    iget-object v0, v0, La1/n0;->v:La1/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La1/v;->j()La1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La1/n0;->l:La1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, La1/e;->x(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La1/e;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public y(Lb4/h;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lb4/c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lb4/c;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lb4/c;-><init>(Lb4/h;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1}, Lb4/h;->a()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v1, Lb4/c;->d:Lb4/c;

    .line 26
    .line 27
    iget-object v0, v1, Lb4/c;->c:Lb4/c;

    .line 28
    .line 29
    iput-object v0, p1, Lb4/c;->c:Lb4/c;

    .line 30
    .line 31
    iget-object v0, v1, Lb4/c;->c:Lb4/c;

    .line 32
    .line 33
    iput-object p1, v0, Lb4/c;->d:Lb4/c;

    .line 34
    .line 35
    iget-object p1, p0, La1/e;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lb4/c;

    .line 38
    .line 39
    iput-object p1, v1, Lb4/c;->d:Lb4/c;

    .line 40
    .line 41
    iget-object p1, p1, Lb4/c;->c:Lb4/c;

    .line 42
    .line 43
    iput-object p1, v1, Lb4/c;->c:Lb4/c;

    .line 44
    .line 45
    iput-object v1, p1, Lb4/c;->d:Lb4/c;

    .line 46
    .line 47
    iget-object p1, v1, Lb4/c;->d:Lb4/c;

    .line 48
    .line 49
    iput-object v1, p1, Lb4/c;->c:Lb4/c;

    .line 50
    .line 51
    iget-object p1, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    :goto_1
    if-lez p1, :cond_2

    .line 62
    .line 63
    iget-object v0, v1, Lb4/c;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    add-int/lit8 p1, p1, -0x1

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public varargs z([Ljava/lang/Object;)Ln1/n;
    .locals 4

    .line 1
    iget-object v0, p0, La1/e;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :goto_0
    move-object v1, v2

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :try_start_1
    iget-object v1, p0, La1/e;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ln0/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Ln0/b;->a()Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    monitor-exit v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    new-instance v1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    const-string v2, "Error instantiating extension"

    .line 36
    .line 37
    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :catch_1
    iget-object v1, p0, La1/e;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    if-nez v1, :cond_1

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ln1/n;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 59
    .line 60
    return-object p1

    .line 61
    :catch_2
    move-exception p1

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "Unexpected error creating extractor"

    .line 65
    .line 66
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    throw p1
.end method
