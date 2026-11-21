.class public final synthetic Landroidx/media3/exoplayer/analytics/x;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/x;->j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/x;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/media3/exoplayer/analytics/x;->l:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/analytics/x;->l:J

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/x;->j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/media3/exoplayer/analytics/x;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->g0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/Object;JLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
