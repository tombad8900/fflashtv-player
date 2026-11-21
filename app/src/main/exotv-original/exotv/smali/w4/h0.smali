.class public final synthetic Lw4/h0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:Lcom/exotv/net/PlayerActivity;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/h0;->j:Lcom/exotv/net/PlayerActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lw4/h0;->k:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lw4/h0;->l:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Lw4/h0;->j:Lcom/exotv/net/PlayerActivity;

    .line 5
    .line 6
    iget v2, p0, Lw4/h0;->l:I

    .line 7
    .line 8
    iget-object v3, p0, Lw4/h0;->k:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3, v0}, Lcom/exotv/net/PlayerActivity;->F(ILjava/util/List;Z)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 14
    .line 15
    return-object v0
.end method
