.class public final synthetic Lc5/v0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:Lc5/a1;

.field public final synthetic k:Lc5/h1;


# direct methods
.method public synthetic constructor <init>(Lc5/a1;Lc5/h1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/v0;->j:Lc5/a1;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/v0;->k:Lc5/h1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p3, 0x13

    .line 10
    .line 11
    iget-object v1, p0, Lc5/v0;->k:Lc5/h1;

    .line 12
    .line 13
    if-ne p2, p3, :cond_2

    .line 14
    .line 15
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr p3, v2

    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int/2addr p3, v2

    .line 32
    if-gez p3, :cond_1

    .line 33
    .line 34
    move p3, v0

    .line 35
    :cond_1
    invoke-virtual {v1, p3}, Lc5/h1;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-ltz v2, :cond_2

    .line 44
    .line 45
    if-ge v2, p3, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Lc5/v0;->j:Lc5/a1;

    .line 48
    .line 49
    iget-object p2, p1, Lc5/a1;->k:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object p1, p1, Lc5/a1;->f:Lc5/w0;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_2
    const/16 p3, 0x16

    .line 69
    .line 70
    if-ne p2, p3, :cond_6

    .line 71
    .line 72
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-gez p1, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    sub-int/2addr p2, p3

    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    sub-int/2addr p2, p3

    .line 96
    if-gez p2, :cond_4

    .line 97
    .line 98
    move p2, v0

    .line 99
    :cond_4
    invoke-virtual {v1, p2}, Lc5/h1;->a(I)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    rem-int p3, p1, p2

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    sub-int/2addr p2, v2

    .line 107
    if-eq p3, p2, :cond_5

    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    sub-int/2addr p2, v2

    .line 114
    if-ne p1, p2, :cond_6

    .line 115
    .line 116
    :cond_5
    return v2

    .line 117
    :cond_6
    :goto_0
    return v0
.end method
