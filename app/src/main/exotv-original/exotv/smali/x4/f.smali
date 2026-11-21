.class public final Lx4/f;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/q;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILp6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx4/f;->n:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lx4/f;->n:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    check-cast p2, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p3, Lp6/c;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, Lx4/f;

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, p2, p3, v0}, Lx4/f;-><init>(ILp6/c;I)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lx4/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-object p2

    .line 28
    :pswitch_0
    new-instance p1, Lx4/f;

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p2, p3, v0}, Lx4/f;-><init>(ILp6/c;I)V

    .line 33
    .line 34
    .line 35
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lx4/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lx4/f;->n:I

    .line 2
    .line 3
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
