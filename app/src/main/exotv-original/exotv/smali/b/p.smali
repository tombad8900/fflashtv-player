.class public final Lb/p;
.super Lz6/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lb/x;


# direct methods
.method public synthetic constructor <init>(Lb/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/p;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lb/p;->k:Lb/x;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lz6/i;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb/p;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/p;->k:Lb/x;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb/x;->c()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lb/p;->k:Lb/x;

    .line 15
    .line 16
    invoke-virtual {v0}, Lb/x;->b()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lb/p;->k:Lb/x;

    .line 23
    .line 24
    invoke-virtual {v0}, Lb/x;->c()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
