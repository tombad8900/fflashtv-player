.class public final synthetic Landroidx/media3/exoplayer/o;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/media3/exoplayer/o;->j:I

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/o;->k:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/o;->k:I

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/common/b1;

    .line 4
    .line 5
    iget v1, p0, Landroidx/media3/exoplayer/o;->j:I

    .line 6
    .line 7
    invoke-static {v1, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->q(IILandroidx/media3/common/b1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
