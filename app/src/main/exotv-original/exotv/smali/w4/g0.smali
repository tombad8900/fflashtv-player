.class public final synthetic Lw4/g0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/g0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/g0;->k:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lw4/g0;->j:I

    .line 2
    .line 3
    const-string v1, "b"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lw4/g0;->k:Lcom/exotv/net/PlayerActivity;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget-object v0, v0, La5/b;->l:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->t0:Landroid/view/View;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, La5/b;->n:Landroid/widget/TextView;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void

    .line 42
    :cond_3
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :pswitch_0
    const/4 v0, 0x0

    .line 47
    iput-boolean v0, v3, Lcom/exotv/net/PlayerActivity;->l0:Z

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->x0:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    iget-object v1, v3, Lcom/exotv/net/PlayerActivity;->y0:Ljava/util/Map;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->M()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    invoke-virtual {v3, v0, v1, v4, v5}, Lcom/exotv/net/PlayerActivity;->T(Ljava/lang/String;Ljava/util/Map;J)V

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :pswitch_2
    iget-boolean v0, v3, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    const-string v0, "buffer"

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Lcom/exotv/net/PlayerActivity;->N(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    return-void

    .line 74
    :pswitch_3
    iget-boolean v0, v3, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 75
    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    const-string v0, "startup"

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Lcom/exotv/net/PlayerActivity;->N(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    return-void

    .line 84
    :pswitch_4
    sget v0, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->D()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_5
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    iget-object v0, v0, La5/b;->b:Landroid/widget/ImageView;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_7
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v2

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
