.class public final synthetic Landroidx/media3/exoplayer/analytics/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Lm0/o;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/i;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/analytics/i;->j:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/media3/common/o0;

    .line 8
    .line 9
    iget v2, p0, Landroidx/media3/exoplayer/analytics/i;->j:I

    .line 10
    .line 11
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 12
    .line 13
    invoke-static {v0, v1, v2, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->m0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/o0;ILandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/exotv/net/ui/AdActivity;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/View;

    .line 8
    .line 9
    sget-object v2, Lcom/exotv/net/ui/AdActivity;->P:Ljava/util/Set;

    .line 10
    .line 11
    const/16 v2, 0x287

    .line 12
    .line 13
    iget-object p2, p2, Lm0/r1;->a:Lm0/o1;

    .line 14
    .line 15
    invoke-virtual {p2, v2}, Lm0/o1;->f(I)Le0/b;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget v2, p2, Le0/b;->a:I

    .line 20
    .line 21
    iget v3, p2, Le0/b;->d:I

    .line 22
    .line 23
    iget v4, p2, Le0/b;->b:I

    .line 24
    .line 25
    iget p2, p2, Le0/b;->c:I

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-virtual {p1, v2, v4, p2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 42
    .line 43
    iget v0, p0, Landroidx/media3/exoplayer/analytics/i;->j:I

    .line 44
    .line 45
    add-int/2addr v0, v3

    .line 46
    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    iput v3, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lm0/r1;->b:Lm0/r1;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 66
    .line 67
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 74
    .line 75
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_2
    const-string p1, "close"

    .line 82
    .line 83
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    throw p1
.end method
