.class public final synthetic Landroidx/media3/exoplayer/source/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/f;
.implements Lm0/o;


# instance fields
.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/source/i;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/source/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/source/i;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/source/i;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/media3/exoplayer/source/MediaLoadData;

    .line 12
    .line 13
    check-cast p1, Landroidx/media3/exoplayer/source/MediaSourceEventListener;

    .line 14
    .line 15
    invoke-static {v0, v1, v2, p1}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->c(Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/source/MediaLoadData;Landroidx/media3/exoplayer/source/MediaSourceEventListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 6

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/source/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/source/i;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/widget/LinearLayout;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/source/i;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/view/View;

    .line 12
    .line 13
    sget v2, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 14
    .line 15
    iget-object p2, p2, Lm0/r1;->a:Lm0/o1;

    .line 16
    .line 17
    const/16 v2, 0x287

    .line 18
    .line 19
    invoke-virtual {p2, v2}, Lm0/o1;->f(I)Le0/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p2, v2}, Lm0/o1;->f(I)Le0/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const v5, 0x7f050002

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    iget p2, v2, Le0/b;->b:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v2, 0x80

    .line 44
    .line 45
    invoke-virtual {p2, v2}, Lm0/o1;->f(I)Le0/b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget p2, p2, Le0/b;->b:I

    .line 50
    .line 51
    :goto_0
    iput p2, p1, Lcom/exotv/net/SeriesDetailActivity;->Z:I

    .line 52
    .line 53
    iget p2, v3, Le0/b;->a:I

    .line 54
    .line 55
    iget v2, v3, Le0/b;->d:I

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    iget v5, v3, Le0/b;->c:I

    .line 59
    .line 60
    invoke-virtual {v0, p2, v4, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 70
    .line 71
    iput v2, p2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 72
    .line 73
    invoke-virtual {v1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p1, Lcom/exotv/net/SeriesDetailActivity;->M:Landroid/widget/TextView;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    const-string v1, "back"

    .line 80
    .line 81
    if-eqz p2, :cond_2

    .line 82
    .line 83
    iget v2, v3, Le0/b;->a:I

    .line 84
    .line 85
    int-to-float v2, v2

    .line 86
    invoke-virtual {p2, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p1, Lcom/exotv/net/SeriesDetailActivity;->M:Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    iget p2, v3, Le0/b;->b:I

    .line 94
    .line 95
    int-to-float p2, p2

    .line 96
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lm0/r1;->b:Lm0/r1;

    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_1
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_2
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 111
    .line 112
    const-string p2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method
