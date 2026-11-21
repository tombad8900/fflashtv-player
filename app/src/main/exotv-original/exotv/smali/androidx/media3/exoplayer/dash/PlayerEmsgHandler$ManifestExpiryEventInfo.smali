.class final Landroidx/media3/exoplayer/dash/PlayerEmsgHandler$ManifestExpiryEventInfo;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/PlayerEmsgHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ManifestExpiryEventInfo"
.end annotation


# instance fields
.field public final eventTimeUs:J

.field public final manifestPublishTimeMsInEmsg:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/PlayerEmsgHandler$ManifestExpiryEventInfo;->eventTimeUs:J

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/media3/exoplayer/dash/PlayerEmsgHandler$ManifestExpiryEventInfo;->manifestPublishTimeMsInEmsg:J

    .line 7
    .line 8
    return-void
.end method
