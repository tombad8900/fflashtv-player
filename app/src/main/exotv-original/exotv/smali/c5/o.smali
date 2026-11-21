.class public final Lc5/o;
.super Lz2/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final d:Lw4/e;

.field public final e:Lw4/g;

.field public final f:Lw4/g;

.field public g:Ljava/util/List;

.field public h:I


# direct methods
.method public constructor <init>(Lw4/e;Lw4/g;Lw4/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/o;->d:Lw4/e;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/o;->e:Lw4/g;

    .line 7
    .line 8
    iput-object p3, p0, Lc5/o;->f:Lw4/g;

    .line 9
    .line 10
    sget-object p1, Lm6/p;->j:Lm6/p;

    .line 11
    .line 12
    iput-object p1, p0, Lc5/o;->g:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc5/o;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d(Lz2/v0;I)V
    .locals 6

    .line 1
    check-cast p1, Lc5/n;

    .line 2
    .line 3
    iget-object v0, p1, Lc5/n;->u:La1/e;

    .line 4
    .line 5
    iget-object v1, p0, Lc5/o;->g:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/exotv/net/model/ChannelCategory;

    .line 12
    .line 13
    iget v2, p0, Lc5/o;->h:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne p2, v2, :cond_0

    .line 17
    .line 18
    move v2, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    iget-object v4, v0, La1/e;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v0, v0, La1/e;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/exotv/net/model/ChannelCategory;->getDisplayTitle()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setActivated(Z)V

    .line 37
    .line 38
    .line 39
    const v1, 0x7f08007d

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    const v5, 0x106000b

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const v5, 0x7f0603cd

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 66
    .line 67
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lc5/k;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-direct {v1, p0, p2, v3}, Lc5/k;-><init>(Lz2/x;II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    new-instance p2, Lc5/l;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {p2, v1, p0}, Lc5/l;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 93
    .line 94
    .line 95
    new-instance p2, Lc5/m;

    .line 96
    .line 97
    invoke-direct {p2, p1, v2}, Lc5/m;-><init>(Lc5/n;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;)Lz2/v0;
    .locals 4

    .line 1
    new-instance v0, Lc5/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const v2, 0x7f0d003b

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    check-cast p1, Landroid/widget/TextView;

    .line 22
    .line 23
    new-instance v1, La1/e;

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    invoke-direct {v1, p1, v2, p1}, La1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lc5/n;-><init>(La1/e;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    const-string v0, "rootView"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final g(I)V
    .locals 1

    .line 1
    iget v0, p0, Lc5/o;->h:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lc5/o;->h:I

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lc5/o;->g:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ge v0, p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lz2/x;->c(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object p1, p0, Lc5/o;->g:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget v0, p0, Lc5/o;->h:I

    .line 28
    .line 29
    if-ltz v0, :cond_2

    .line 30
    .line 31
    if-ge v0, p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lz2/x;->c(I)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method
