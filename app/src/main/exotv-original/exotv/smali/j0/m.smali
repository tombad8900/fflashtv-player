.class public final Lj0/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public j:Lj0/e;

.field public k:Lj0/f;

.field public l:Landroid/os/Handler;


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lj0/m;->j:Lj0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj0/e;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lj0/m;->k:Lj0/f;

    .line 10
    .line 11
    iget-object v2, p0, Lj0/m;->l:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v3, Lj6/q;

    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    invoke-direct {v3, v1, v4, v0}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
