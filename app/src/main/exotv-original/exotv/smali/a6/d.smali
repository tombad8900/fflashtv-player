.class public final La6/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La6/d;->j:I

    .line 2
    .line 3
    iput-object p2, p0, La6/d;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget v0, p0, La6/d;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La6/d;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ll4/f;

    .line 9
    .line 10
    iget v1, p1, Landroid/os/Message;->what:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ll4/d;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ll4/f;->b(Ll4/d;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ll4/d;

    .line 29
    .line 30
    iget-object v0, v0, Ll4/f;->d:Lcom/bumptech/glide/m;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/m;->l(Lr4/e;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v2, 0x0

    .line 36
    :goto_0
    return v2

    .line 37
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_2
    iget-object v0, p0, La6/d;->k:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La1/o;

    .line 46
    .line 47
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    iget-object p1, v0, La1/o;->k:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter p1

    .line 54
    const/4 v0, 0x0

    .line 55
    :try_start_0
    throw v0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw v0

    .line 59
    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
