.class public final synthetic Lw4/i0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:Lcom/exotv/net/PlayerActivity;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/i0;->j:Lcom/exotv/net/PlayerActivity;

    .line 5
    .line 6
    iput p2, p0, Lw4/i0;->k:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lw4/i0;->j:Lcom/exotv/net/PlayerActivity;

    .line 2
    .line 3
    iget v1, v0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 4
    .line 5
    iget v2, p0, Lw4/i0;->k:I

    .line 6
    .line 7
    if-ne v2, v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "b"

    .line 25
    .line 26
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    throw v0

    .line 31
    :cond_1
    iput v2, v0, Lcom/exotv/net/PlayerActivity;->M:I

    .line 32
    .line 33
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput v3, v1, Lc5/b1;->d:I

    .line 37
    .line 38
    iput-boolean v3, v1, Lc5/b1;->b:Z

    .line 39
    .line 40
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 41
    .line 42
    iget-object v3, v0, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->L:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lcom/exotv/net/model/BackupSource;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1}, Lcom/exotv/net/model/BackupSource;->getHeaders()Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->M()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-virtual {v0, v2, v1, v3, v4}, Lcom/exotv/net/PlayerActivity;->T(Ljava/lang/String;Ljava/util/Map;J)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->K()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->A()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 80
    .line 81
    return-object v0
.end method
