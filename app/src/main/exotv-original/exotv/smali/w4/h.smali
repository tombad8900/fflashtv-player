.class public final synthetic Lw4/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/h;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/h;->k:Lcom/exotv/net/MainActivity;

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
    .locals 1

    .line 1
    iget v0, p0, Lw4/h;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/h;->k:Lcom/exotv/net/MainActivity;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, La5/a;->m:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "b"

    .line 19
    .line 20
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lw4/h;->k:Lcom/exotv/net/MainActivity;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, La5/a;->j:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string v0, "b"

    .line 38
    .line 39
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    throw v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
