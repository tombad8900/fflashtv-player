.class public final synthetic Lw4/s0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/SeriesDetailActivity;


# direct methods
.method public synthetic constructor <init>(ILcom/exotv/net/SeriesDetailActivity;)V
    .locals 0

    .line 1
    iput p1, p0, Lw4/s0;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lw4/s0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lw4/s0;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lw4/s0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/exotv/net/SeriesDetailActivity;->s()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, v1, Lcom/exotv/net/SeriesDetailActivity;->P:Landroid/widget/TextView;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v0}, Lm6/h;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    :cond_0
    return-object v0

    .line 29
    :pswitch_1
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v1, 0x7f050002

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
