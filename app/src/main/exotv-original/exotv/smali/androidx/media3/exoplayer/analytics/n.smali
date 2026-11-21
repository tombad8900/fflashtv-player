.class public final synthetic Landroidx/media3/exoplayer/analytics/n;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

.field public final synthetic l:I

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IIZ)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/media3/exoplayer/analytics/n;->j:I

    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/n;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    iput-boolean p4, p0, Landroidx/media3/exoplayer/analytics/n;->m:Z

    iput p2, p0, Landroidx/media3/exoplayer/analytics/n;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IZ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/media3/exoplayer/analytics/n;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/n;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    iput p2, p0, Landroidx/media3/exoplayer/analytics/n;->l:I

    iput-boolean p3, p0, Landroidx/media3/exoplayer/analytics/n;->m:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/n;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/media3/exoplayer/analytics/n;->l:I

    .line 7
    .line 8
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/n;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 11
    .line 12
    iget-boolean v2, p0, Landroidx/media3/exoplayer/analytics/n;->m:Z

    .line 13
    .line 14
    invoke-static {v1, v0, v2, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->G(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IZLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/analytics/n;->m:Z

    .line 19
    .line 20
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/n;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 23
    .line 24
    iget v2, p0, Landroidx/media3/exoplayer/analytics/n;->l:I

    .line 25
    .line 26
    invoke-static {v1, v2, v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->j0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IZLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/n;->l:I

    .line 31
    .line 32
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/n;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 35
    .line 36
    iget-boolean v2, p0, Landroidx/media3/exoplayer/analytics/n;->m:Z

    .line 37
    .line 38
    invoke-static {v1, v0, v2, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->n0(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IZLandroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
