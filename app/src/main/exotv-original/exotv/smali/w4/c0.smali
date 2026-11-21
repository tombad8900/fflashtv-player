.class public final synthetic Lw4/c0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MovieDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MovieDetailActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/c0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/c0;->k:Lcom/exotv/net/MovieDetailActivity;

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
    iget v0, p0, Lw4/c0;->j:I

    .line 2
    .line 3
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 4
    .line 5
    const-string v2, "it"

    .line 6
    .line 7
    iget-object v3, p0, Lw4/c0;->k:Lcom/exotv/net/MovieDetailActivity;

    .line 8
    .line 9
    check-cast p1, Lx4/l;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 15
    .line 16
    invoke-static {v2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-wide v4, p1, Lx4/l;->a:J

    .line 20
    .line 21
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/16 v4, 0x78

    .line 29
    .line 30
    invoke-static {v3, v0, p1, v2, v4}, Lc5/j;->l(Lb/l;Ljava/lang/String;Ljava/lang/String;Lw4/a0;I)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget v0, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 35
    .line 36
    invoke-static {v2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/content/Intent;

    .line 43
    .line 44
    const-class v2, Lcom/exotv/net/MovieDetailActivity;

    .line 45
    .line 46
    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    .line 48
    .line 49
    const/high16 v2, 0x24000000

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v2, "movie_id"

    .line 56
    .line 57
    iget-wide v4, p1, Lx4/l;->a:J

    .line 58
    .line 59
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v2, "movie_title"

    .line 64
    .line 65
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
