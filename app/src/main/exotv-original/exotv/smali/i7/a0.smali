.class public Li7/a0;
.super Li7/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lp6/h;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Li7/a0;->m:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Li7/a;-><init>(Lp6/h;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget v0, p0, Li7/a0;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Li7/a1;->A(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Li7/a;->l:Lp6/h;

    .line 12
    .line 13
    invoke-static {v0, p1}, Li7/x;->i(Lp6/h;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
