.class public final synthetic Lw4/z;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MovieDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MovieDetailActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/z;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/z;->k:Lcom/exotv/net/MovieDetailActivity;

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
    .locals 3

    .line 1
    iget v0, p0, Lw4/z;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/z;->k:Lcom/exotv/net/MovieDetailActivity;

    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string v0, "back"

    .line 22
    .line 23
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v2

    .line 27
    :cond_1
    iget-object v0, v0, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    return-void

    .line 33
    :cond_2
    const-string v0, "playAction"

    .line 34
    .line 35
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v2

    .line 39
    :pswitch_0
    iget-object v0, p0, Lw4/z;->k:Lcom/exotv/net/MovieDetailActivity;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    const-string v0, "back"

    .line 50
    .line 51
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    throw v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
