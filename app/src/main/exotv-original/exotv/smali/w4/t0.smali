.class public final synthetic Lw4/t0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/SeriesDetailActivity;


# direct methods
.method public synthetic constructor <init>(ILcom/exotv/net/SeriesDetailActivity;)V
    .locals 0

    .line 1
    iput p1, p0, Lw4/t0;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lw4/t0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lw4/t0;->j:I

    .line 2
    .line 3
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 4
    .line 5
    const-string v2, "it"

    .line 6
    .line 7
    iget-object v3, p0, Lw4/t0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lx4/l;

    .line 13
    .line 14
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 15
    .line 16
    invoke-static {v2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroid/content/Intent;

    .line 23
    .line 24
    const-class v2, Lcom/exotv/net/SeriesDetailActivity;

    .line 25
    .line 26
    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    const/high16 v2, 0x24000000

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, "series_id"

    .line 36
    .line 37
    iget-wide v4, p1, Lx4/l;->a:J

    .line 38
    .line 39
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "series_title"

    .line 44
    .line 45
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 56
    .line 57
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 58
    .line 59
    invoke-static {v2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, v3, Lcom/exotv/net/SeriesDetailActivity;->Q:Landroid/view/View;

    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
