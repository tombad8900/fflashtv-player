.class public final synthetic Landroidx/media3/exoplayer/source/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le6/d;
.implements Lh1/f;
.implements Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor$Factory;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/source/j;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic a(Landroid/media/MediaParser$SeekPoint;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/media/MediaParser$SeekPoint;->position:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static bridge synthetic b(Ljava/lang/Object;)Landroid/media/MediaParser$SeekPoint;
    .locals 0

    .line 1
    check-cast p0, Landroid/media/MediaParser$SeekPoint;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/source/j;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SpannedData;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SampleQueue;->a(Landroidx/media3/exoplayer/source/SampleQueue$SharedSampleMetadata;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/source/j;->j:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/media3/common/q1;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/source/TrackGroupArray;->a(Landroidx/media3/common/q1;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :sswitch_0
    check-cast p1, Ln1/n;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/media3/exoplayer/source/BundledExtractorsAdapter;->a(Ln1/n;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :sswitch_1
    check-cast p1, Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 21
    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/source/MergingMediaPeriod;->a(Landroidx/media3/exoplayer/source/MediaPeriod;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public createProgressiveMediaExtractor(Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/source/MediaParserExtractorAdapter;->a(Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/ProgressiveMediaExtractor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
