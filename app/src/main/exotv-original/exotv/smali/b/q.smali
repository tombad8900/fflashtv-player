.class public final synthetic Lb/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb/q;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lb/q;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 2

    .line 1
    iget v0, p0, Lb/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/q;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm/e2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lm/e2;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lb/q;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lh/x;

    .line 17
    .line 18
    invoke-virtual {v0}, Lh/x;->C()Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lb/q;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ly6/a;

    .line 25
    .line 26
    const-string v1, "$onBackInvoked"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
