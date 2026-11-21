.class final Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/SampleQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SharedSampleMetadata"
.end annotation


# instance fields
.field public final drmSessionReference:Landroidx/media3/exoplayer/drm/DrmSessionManager$DrmSessionReference;

.field public final format:Landroidx/media3/common/w;


# direct methods
.method private constructor <init>(Landroidx/media3/common/w;Landroidx/media3/exoplayer/drm/DrmSessionManager$DrmSessionReference;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;->format:Landroidx/media3/common/w;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;->drmSessionReference:Landroidx/media3/exoplayer/drm/DrmSessionManager$DrmSessionReference;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/common/w;Landroidx/media3/exoplayer/drm/DrmSessionManager$DrmSessionReference;Landroidx/media3/exoplayer/source/SampleQueue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;-><init>(Landroidx/media3/common/w;Landroidx/media3/exoplayer/drm/DrmSessionManager$DrmSessionReference;)V

    return-void
.end method
