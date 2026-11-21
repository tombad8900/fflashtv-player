.class public final synthetic Lw4/j0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/PlayerActivity;

.field public final synthetic l:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw4/j0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/j0;->k:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lw4/j0;->l:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lw4/j0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/j0;->k:Lcom/exotv/net/PlayerActivity;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "b"

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget-object v1, v1, La5/b;->l:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v4, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-object v4, v4, La5/b;->n:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eq v1, v4, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v0, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    iget-object v0, v0, La5/b;->m:Landroid/widget/TextView;

    .line 56
    .line 57
    if-eq v1, v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lw4/j0;->l:Landroid/view/View;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v2

    .line 69
    :cond_1
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2

    .line 73
    :cond_2
    :goto_0
    return-void

    .line 74
    :cond_3
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v2

    .line 78
    :pswitch_0
    iget-object v0, p0, Lw4/j0;->k:Lcom/exotv/net/PlayerActivity;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    iget-object v0, v0, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    iget-object v0, p0, Lw4/j0;->l:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void

    .line 98
    :cond_5
    const-string v0, "b"

    .line 99
    .line 100
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    throw v0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
