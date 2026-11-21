.class public final synthetic Landroidx/media3/exoplayer/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Landroidx/media3/exoplayer/text/TextOutput;
.implements Landroidx/media3/exoplayer/metadata/MetadataOutput;
.implements Le6/d;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/q;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic a()Landroid/media/metrics/LogSessionId;
    .locals 1

    .line 1
    sget-object v0, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln1/n;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->a(Ln1/n;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    new-instance v0, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;

    .line 14
    .line 15
    check-cast p1, Lh1/b;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;-><init>(Lh1/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/q;->j:I

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/common/b1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/media3/common/b1;->onRenderedFirstFrame()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->C(Landroidx/media3/common/b1;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCues(Lg1/c;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/DefaultRendererCapabilitiesList$Factory;->b(Lg1/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMetadata(Landroidx/media3/common/t0;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/DefaultRendererCapabilitiesList$Factory;->a(Landroidx/media3/common/t0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
