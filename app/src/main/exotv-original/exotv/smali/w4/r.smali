.class public final synthetic Lw4/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/r;->j:I

    iput-object p1, p0, Lw4/r;->l:Ljava/lang/Object;

    iput-object p3, p0, Lw4/r;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx4/m;Lcom/exotv/net/MainActivity;I)V
    .locals 0

    .line 2
    iput p3, p0, Lw4/r;->j:I

    iput-object p1, p0, Lw4/r;->k:Ljava/lang/Object;

    iput-object p2, p0, Lw4/r;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lw4/r;->j:I

    .line 2
    .line 3
    const/16 v1, 0x78

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ll6/j;->a:Ll6/j;

    .line 7
    .line 8
    iget-object v4, p0, Lw4/r;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lw4/r;->l:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, Lj7/d;

    .line 16
    .line 17
    check-cast v4, Lj6/q;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Throwable;

    .line 20
    .line 21
    iget-object p1, v5, Lj7/d;->l:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :pswitch_0
    check-cast v4, Lx4/m;

    .line 28
    .line 29
    check-cast v5, Lcom/exotv/net/MainActivity;

    .line 30
    .line 31
    check-cast p1, Lx4/l;

    .line 32
    .line 33
    sget-object v0, Lx4/m;->j:Lx4/m;

    .line 34
    .line 35
    if-ne v4, v0, :cond_0

    .line 36
    .line 37
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 38
    .line 39
    iget-wide v6, p1, Lx4/l;->a:J

    .line 40
    .line 41
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v5, v0, p1, v2, v1}, Lc5/j;->l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-object v3

    .line 51
    :pswitch_1
    check-cast v5, Lcom/exotv/net/MainActivity;

    .line 52
    .line 53
    check-cast v4, Lx4/m;

    .line 54
    .line 55
    check-cast p1, Lx4/l;

    .line 56
    .line 57
    invoke-static {v5, p1, v4}, Lcom/exotv/net/MainActivity;->r(Lcom/exotv/net/MainActivity;Lx4/l;Lx4/m;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :pswitch_2
    check-cast v4, Lx4/m;

    .line 62
    .line 63
    check-cast v5, Lcom/exotv/net/MainActivity;

    .line 64
    .line 65
    check-cast p1, Lx4/l;

    .line 66
    .line 67
    sget-object v0, Lx4/m;->j:Lx4/m;

    .line 68
    .line 69
    if-ne v4, v0, :cond_1

    .line 70
    .line 71
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 72
    .line 73
    iget-wide v6, p1, Lx4/l;->a:J

    .line 74
    .line 75
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v5, v0, p1, v2, v1}, Lc5/j;->l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-object v3

    .line 85
    :pswitch_3
    check-cast v5, Lcom/exotv/net/MainActivity;

    .line 86
    .line 87
    check-cast v4, Lx4/m;

    .line 88
    .line 89
    check-cast p1, Lx4/l;

    .line 90
    .line 91
    invoke-static {v5, p1, v4}, Lcom/exotv/net/MainActivity;->r(Lcom/exotv/net/MainActivity;Lx4/l;Lx4/m;)V

    .line 92
    .line 93
    .line 94
    return-object v3

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
