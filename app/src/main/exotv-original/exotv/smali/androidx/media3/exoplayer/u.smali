.class public final synthetic Landroidx/media3/exoplayer/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/media3/common/c1;

.field public final synthetic l:Landroidx/media3/common/c1;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Landroidx/media3/exoplayer/u;->j:I

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/u;->k:Landroidx/media3/common/c1;

    .line 7
    .line 8
    iput-object p2, p0, Landroidx/media3/exoplayer/u;->l:Landroidx/media3/common/c1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/u;->l:Landroidx/media3/common/c1;

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/common/b1;

    .line 4
    .line 5
    iget v1, p0, Landroidx/media3/exoplayer/u;->j:I

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/u;->k:Landroidx/media3/common/c1;

    .line 8
    .line 9
    invoke-static {v1, v2, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->i(ILandroidx/media3/common/c1;Landroidx/media3/common/c1;Landroidx/media3/common/b1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
