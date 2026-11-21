.class public final synthetic Lw4/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic j:Lcom/exotv/net/MovieDetailActivity;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MovieDetailActivity;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/b0;->j:Lcom/exotv/net/MovieDetailActivity;

    .line 5
    .line 6
    iput p2, p0, Lw4/b0;->k:I

    .line 7
    .line 8
    iput-object p3, p0, Lw4/b0;->l:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget p1, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x13

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p2, p1, :cond_3

    .line 15
    .line 16
    const/16 p1, 0x16

    .line 17
    .line 18
    if-eq p2, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Lw4/b0;->l:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1}, Lm6/i;->s0(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget p2, p0, Lw4/b0;->k:I

    .line 28
    .line 29
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    return v0

    .line 32
    :cond_2
    :goto_0
    return p3

    .line 33
    :cond_3
    iget-object p1, p0, Lw4/b0;->j:Lcom/exotv/net/MovieDetailActivity;

    .line 34
    .line 35
    iget-boolean p2, p1, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz p2, :cond_6

    .line 39
    .line 40
    iget-object p2, p1, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz p2, :cond_5

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Lcom/exotv/net/MovieDetailActivity;->K:Landroid/widget/ScrollView;

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p1, p3, p3}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 52
    .line 53
    .line 54
    return v0

    .line 55
    :cond_4
    const-string p1, "pageScroll"

    .line 56
    .line 57
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_5
    const-string p1, "back"

    .line 62
    .line 63
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_6
    iget-object p1, p1, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 68
    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 72
    .line 73
    .line 74
    return v0

    .line 75
    :cond_7
    const-string p1, "playAction"

    .line 76
    .line 77
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1
.end method
