.class public final synthetic Lw4/a0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/MovieDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/MovieDetailActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/a0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/a0;->k:Lcom/exotv/net/MovieDetailActivity;

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
    iget v0, p0, Lw4/a0;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lw4/a0;->k:Lcom/exotv/net/MovieDetailActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {v1, v0}, Lcom/exotv/net/MovieDetailActivity;->v(Z)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget v0, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f050002

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
