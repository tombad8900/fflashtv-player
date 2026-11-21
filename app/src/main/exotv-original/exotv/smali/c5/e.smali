.class public final Lc5/e;
.super Landroid/os/CountDownTimer;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Lcom/exotv/net/ui/AdActivity;


# direct methods
.method public constructor <init>(JLcom/exotv/net/ui/AdActivity;)V
    .locals 2

    .line 1
    iput-object p3, p0, Lc5/e;->a:Lcom/exotv/net/ui/AdActivity;

    .line 2
    .line 3
    const-wide/16 v0, 0x1

    .line 4
    const-wide/16 p1, 0x1

    const-wide/16 p2, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc5/e;->a:Lcom/exotv/net/ui/AdActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "close"

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    const v4, 0x7f11001e

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v4, 0x7f050003

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    new-instance v2, Landroidx/lifecycle/c0;

    .line 46
    .line 47
    const/16 v3, 0xc

    .line 48
    .line 49
    invoke-direct {v2, v3, v0}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_1
    return-void

    .line 61
    :cond_2
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v2

    .line 65
    :cond_3
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v2
.end method

.method public final onTick(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc5/e;->a:Lcom/exotv/net/ui/AdActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-wide/16 v2, 0x3e7

    .line 8
    .line 9
    add-long/2addr p1, v2

    .line 10
    const-wide/16 v2, 0x3e8

    .line 11
    .line 12
    div-long/2addr p1, v2

    .line 13
    long-to-int p1, p1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const p2, 0x7f11001f

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p1, "close"

    .line 34
    .line 35
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1
.end method
