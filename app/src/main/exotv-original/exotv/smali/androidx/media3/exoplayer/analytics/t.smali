.class public final synthetic Landroidx/media3/exoplayer/analytics/t;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

.field public final synthetic l:Landroidx/media3/common/w;

.field public final synthetic m:Landroidx/media3/exoplayer/DecoderReuseEvaluation;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/media3/exoplayer/analytics/t;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/t;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/t;->l:Landroidx/media3/common/w;

    .line 6
    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/t;->m:Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/analytics/t;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/t;->m:Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 7
    .line 8
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/t;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/t;->l:Landroidx/media3/common/w;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->w(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/t;->m:Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 19
    .line 20
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/t;->k:Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/t;->l:Landroidx/media3/common/w;

    .line 25
    .line 26
    invoke-static {v1, v2, v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->V(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
