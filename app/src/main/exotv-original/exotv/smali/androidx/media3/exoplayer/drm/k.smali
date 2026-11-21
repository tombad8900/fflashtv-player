.class public final synthetic Landroidx/media3/exoplayer/drm/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;

.field public final synthetic k:I

.field public final synthetic l:[B

.field public final synthetic m:Lj6/t;

.field public final synthetic n:Landroidx/media3/common/w;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;I[BLj6/t;Landroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/k;->j:Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/drm/k;->k:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/drm/k;->l:[B

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/drm/k;->m:Lj6/t;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/drm/k;->n:Landroidx/media3/common/w;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/k;->m:Lj6/t;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/k;->n:Landroidx/media3/common/w;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/k;->j:Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;

    .line 6
    .line 7
    iget v3, p0, Landroidx/media3/exoplayer/drm/k;->k:I

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/media3/exoplayer/drm/k;->l:[B

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;->d(Landroidx/media3/exoplayer/drm/OfflineLicenseHelper;I[BLj6/t;Landroidx/media3/common/w;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
