.class public final synthetic Lc5/e1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/e1;->a:Landroid/widget/TextView;

    .line 5
    .line 6
    iput-object p2, p0, Lc5/e1;->b:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lc5/e1;->c:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc5/e1;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, Landroid/widget/TextView;->getMaxLines()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const p4, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 p5, 0x0

    .line 15
    const/4 p6, 0x1

    .line 16
    if-ne p3, p4, :cond_0

    .line 17
    .line 18
    move p3, p6

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p3, p5

    .line 21
    :goto_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/text/Layout;->getLineCount()I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    if-lez p4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/text/Layout;->getLineCount()I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    sub-int/2addr p4, p6

    .line 34
    invoke-virtual {p2, p4}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-lez p2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move p6, p5

    .line 42
    :goto_1
    if-nez p3, :cond_3

    .line 43
    .line 44
    if-eqz p6, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p5, 0x8

    .line 48
    .line 49
    :cond_3
    :goto_2
    iget-object p2, p0, Lc5/e1;->b:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p2, p5}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    new-instance p3, Landroidx/media3/exoplayer/audio/i;

    .line 55
    .line 56
    const/4 p4, 0x5

    .line 57
    invoke-direct {p3, p1, p4, p2}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lc5/e1;->c:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method
