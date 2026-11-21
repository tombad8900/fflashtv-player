.class public final Lh/u;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh/u;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lh/u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 1
    iget p2, p0, Lh/u;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lh/u;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lh1/t;

    .line 9
    .line 10
    const-string v0, "connectivity"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/16 v5, 0x9

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    const/4 v7, 0x4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    if-eq v4, v3, :cond_4

    .line 48
    .line 49
    if-eq v4, v7, :cond_3

    .line 50
    .line 51
    if-eq v4, v1, :cond_3

    .line 52
    .line 53
    if-eq v4, v6, :cond_5

    .line 54
    .line 55
    if-eq v4, v5, :cond_2

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v2, 0x7

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    packed-switch v0, :pswitch_data_1

    .line 67
    .line 68
    .line 69
    :pswitch_0
    move v2, v6

    .line 70
    goto :goto_1

    .line 71
    :pswitch_1
    sget v0, Lh1/i0;->a:I

    .line 72
    .line 73
    const/16 v3, 0x1d

    .line 74
    .line 75
    if-lt v0, v3, :cond_7

    .line 76
    .line 77
    move v2, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    :pswitch_2
    const/4 v2, 0x2

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    :pswitch_3
    move v2, v1

    .line 82
    goto :goto_1

    .line 83
    :pswitch_4
    move v2, v7

    .line 84
    goto :goto_1

    .line 85
    :pswitch_5
    const/4 v2, 0x3

    .line 86
    goto :goto_1

    .line 87
    :cond_6
    :goto_0
    move v2, v3

    .line 88
    :catch_0
    :cond_7
    :goto_1
    sget v0, Lh1/i0;->a:I

    .line 89
    .line 90
    const/16 v3, 0x1f

    .line 91
    .line 92
    if-lt v0, v3, :cond_8

    .line 93
    .line 94
    if-ne v2, v1, :cond_8

    .line 95
    .line 96
    invoke-static {p1, p2}, Lh1/s;->a(Landroid/content/Context;Lh1/t;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_8
    invoke-static {v2, p2}, Lh1/t;->a(ILh1/t;)V

    .line 101
    .line 102
    .line 103
    :goto_2
    return-void

    .line 104
    :pswitch_6
    iget-object p1, p0, Lh/u;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, La1/j;

    .line 107
    .line 108
    invoke-virtual {p1}, La1/j;->i()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
    .end packed-switch

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
