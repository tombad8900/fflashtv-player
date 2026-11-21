.class public final Ln4/o;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ln4/o;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ln4/o;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget v0, p0, Ln4/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln4/o;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La4/c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, p1, v1}, La4/c;->p(La4/c;Landroid/net/Network;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    new-instance p1, Ln4/n;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, v0}, Ln4/n;-><init>(Ln4/o;Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lu4/m;->f()Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget v0, p0, Ln4/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln4/o;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La4/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, p1, v1}, La4/c;->p(La4/c;Landroid/net/Network;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    new-instance p1, Ln4/n;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0}, Ln4/n;-><init>(Ln4/o;Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lu4/m;->f()Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
