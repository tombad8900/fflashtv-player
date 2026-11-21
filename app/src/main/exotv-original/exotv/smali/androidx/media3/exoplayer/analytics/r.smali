.class public final synthetic Landroidx/media3/exoplayer/analytics/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/r;->j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/analytics/r;->k:I

    .line 7
    .line 8
    iput p3, p0, Landroidx/media3/exoplayer/analytics/r;->l:I

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/media3/exoplayer/analytics/r;->m:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/analytics/r;->m:Z

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/r;->j:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 6
    .line 7
    iget v2, p0, Landroidx/media3/exoplayer/analytics/r;->k:I

    .line 8
    .line 9
    iget v3, p0, Landroidx/media3/exoplayer/analytics/r;->l:I

    .line 10
    .line 11
    invoke-static {v1, v2, v3, v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->l(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IIZLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
