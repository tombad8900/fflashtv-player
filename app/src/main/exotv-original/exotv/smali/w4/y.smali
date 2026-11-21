.class public final synthetic Lw4/y;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lh/i;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh/i;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw4/y;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/y;->k:Lh/i;

    .line 4
    .line 5
    iput-object p2, p0, Lw4/y;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lw4/y;->j:I

    .line 2
    .line 3
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 4
    .line 5
    iget-object v2, p0, Lw4/y;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lw4/y;->k:Lh/i;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Lcom/exotv/net/PlayerActivity;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    iput-object v2, v3, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->u()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->J()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->z()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    check-cast v3, Lcom/exotv/net/MovieDetailActivity;

    .line 32
    .line 33
    check-cast v2, Lx4/n;

    .line 34
    .line 35
    sget v0, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 36
    .line 37
    iget-wide v4, v2, Lx4/n;->a:J

    .line 38
    .line 39
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v2, v2, Lx4/n;->b:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v4, Lw4/a0;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    invoke-direct {v4, v3, v5}, Lw4/a0;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 49
    .line 50
    .line 51
    const/16 v5, 0x58

    .line 52
    .line 53
    invoke-static {v3, v0, v2, v4, v5}, Lc5/j;->l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
