.class public final synthetic Lw4/u0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/SeriesDetailActivity;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/SeriesDetailActivity;III)V
    .locals 0

    .line 1
    iput p4, p0, Lw4/u0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/u0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    iput p2, p0, Lw4/u0;->l:I

    .line 6
    .line 7
    iput p3, p0, Lw4/u0;->m:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lw4/u0;->j:I

    .line 2
    .line 3
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, Lw4/u0;->m:I

    .line 7
    .line 8
    iget v4, p0, Lw4/u0;->l:I

    .line 9
    .line 10
    iget-object v5, p0, Lw4/u0;->k:Lcom/exotv/net/SeriesDetailActivity;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 16
    .line 17
    add-int/2addr v4, v2

    .line 18
    invoke-static {v4, v2, v3}, Lcom/bumptech/glide/c;->t(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, v5, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 23
    .line 24
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->C()V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_0
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 29
    .line 30
    sub-int/2addr v4, v2

    .line 31
    invoke-static {v4, v2, v3}, Lcom/bumptech/glide/c;->t(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, v5, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 36
    .line 37
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->C()V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
