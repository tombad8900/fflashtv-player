.class public final synthetic Lc5/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/io/Serializable;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc5/b;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lc5/b;->k:Ljava/io/Serializable;

    .line 4
    .line 5
    iput-object p2, p0, Lc5/b;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lc5/b;->m:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lc5/b;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/b;->k:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Lz4/o;

    .line 9
    .line 10
    iget-object v1, p0, Lc5/b;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lc5/b;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, "target"

    .line 21
    .line 22
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    if-ne v0, p1, :cond_0

    .line 33
    .line 34
    move-object v1, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance p1, La1/u;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    const-string v0, "/embed/player/"

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-static {p1, v0, v2}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    if-nez v1, :cond_3

    .line 53
    .line 54
    :goto_0
    move-object v1, p1

    .line 55
    :cond_3
    :goto_1
    return-object v1

    .line 56
    :pswitch_0
    iget-object v0, p0, Lc5/b;->k:Ljava/io/Serializable;

    .line 57
    .line 58
    check-cast v0, Lz6/k;

    .line 59
    .line 60
    iget-object v1, p0, Lc5/b;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lcom/exotv/net/ui/AdActivity;

    .line 63
    .line 64
    iget-object v2, p0, Lc5/b;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Landroid/webkit/WebView;

    .line 67
    .line 68
    check-cast p1, Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v3, v0, Lz6/k;->j:Z

    .line 71
    .line 72
    if-nez v3, :cond_7

    .line 73
    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    invoke-static {p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 v3, 0x1

    .line 84
    iput-boolean v3, v0, Lz6/k;->j:Z

    .line 85
    .line 86
    iget-object v0, v1, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    const-string v4, "webView"

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-virtual {v1, v0, p1}, Lcom/exotv/net/ui/AdActivity;->v(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, v1, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 97
    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    new-instance v0, Landroidx/lifecycle/c0;

    .line 101
    .line 102
    const/16 v1, 0xb

    .line 103
    .line 104
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v3

    .line 115
    :cond_6
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v3

    .line 119
    :cond_7
    :goto_2
    sget-object p1, Ll6/j;->a:Ll6/j;

    .line 120
    .line 121
    return-object p1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
