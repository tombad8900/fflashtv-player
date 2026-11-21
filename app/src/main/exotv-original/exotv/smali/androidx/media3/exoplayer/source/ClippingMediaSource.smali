.class public final Landroidx/media3/exoplayer/source/ClippingMediaSource;
.super Landroidx/media3/exoplayer/source/WrappingMediaSource;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;,
        Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;
    }
.end annotation


# instance fields
.field private final allowDynamicClippingUpdates:Z

.field private clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

.field private clippingTimeline:Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;

.field private final enableInitialDiscontinuity:Z

.field private final endUs:J

.field private final mediaPeriods:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/source/ClippingMediaPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private periodEndUs:J

.field private periodStartUs:J

.field private final relativeToDefaultPosition:Z

.field private final startUs:J

.field private final window:Landroidx/media3/common/o1;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/source/MediaSource;J)V
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-wide/16 v2, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    .line 2
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/source/ClippingMediaSource;-><init>(Landroidx/media3/exoplayer/source/MediaSource;JJZZZ)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/source/MediaSource;JJ)V
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    .line 1
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/source/ClippingMediaSource;-><init>(Landroidx/media3/exoplayer/source/MediaSource;JJZZZ)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/source/MediaSource;JJZZZ)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/WrappingMediaSource;-><init>(Landroidx/media3/exoplayer/source/MediaSource;)V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    invoke-static {p1}, Lh1/a;->d(Z)V

    .line 6
    iput-wide p2, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->startUs:J

    .line 7
    iput-wide p4, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->endUs:J

    .line 8
    iput-boolean p6, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->enableInitialDiscontinuity:Z

    .line 9
    iput-boolean p7, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->allowDynamicClippingUpdates:Z

    .line 10
    iput-boolean p8, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->relativeToDefaultPosition:Z

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 12
    new-instance p1, Landroidx/media3/common/o1;

    invoke-direct {p1}, Landroidx/media3/common/o1;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->window:Landroidx/media3/common/o1;

    return-void
.end method

.method private refreshClippedTimeline(Landroidx/media3/common/p1;)V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->window:Landroidx/media3/common/o1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v3, p1

    .line 5
    invoke-virtual {p1, v1, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->window:Landroidx/media3/common/o1;

    .line 9
    .line 10
    iget-wide v4, v0, Landroidx/media3/common/o1;->p:J

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingTimeline:Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;

    .line 13
    .line 14
    const-wide/high16 v6, -0x8000000000000000L

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->allowDynamicClippingUpdates:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-wide v8, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodStartUs:J

    .line 32
    .line 33
    sub-long/2addr v8, v4

    .line 34
    iget-wide v10, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->endUs:J

    .line 35
    .line 36
    cmp-long v0, v10, v6

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-wide v6, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodEndUs:J

    .line 42
    .line 43
    sub-long/2addr v6, v4

    .line 44
    :goto_0
    move-wide v4, v8

    .line 45
    goto :goto_5

    .line 46
    :cond_2
    :goto_1
    iget-wide v8, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->startUs:J

    .line 47
    .line 48
    iget-wide v10, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->endUs:J

    .line 49
    .line 50
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->relativeToDefaultPosition:Z

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->window:Landroidx/media3/common/o1;

    .line 55
    .line 56
    iget-wide v12, v0, Landroidx/media3/common/o1;->l:J

    .line 57
    .line 58
    add-long/2addr v8, v12

    .line 59
    add-long/2addr v12, v10

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide v12, v10

    .line 62
    :goto_2
    add-long v1, v4, v8

    .line 63
    .line 64
    iput-wide v1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodStartUs:J

    .line 65
    .line 66
    cmp-long v0, v10, v6

    .line 67
    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    add-long v6, v4, v12

    .line 72
    .line 73
    :goto_3
    iput-wide v6, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodEndUs:J

    .line 74
    .line 75
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    :goto_4
    if-ge v1, v0, :cond_5

    .line 83
    .line 84
    iget-object v2, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 91
    .line 92
    iget-wide v4, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodStartUs:J

    .line 93
    .line 94
    iget-wide v6, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodEndUs:J

    .line 95
    .line 96
    invoke-virtual {v2, v4, v5, v6, v7}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->updateClipping(JJ)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    move-wide v6, v12

    .line 103
    goto :goto_0

    .line 104
    :goto_5
    :try_start_0
    new-instance v2, Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;

    .line 105
    .line 106
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;-><init>(Landroidx/media3/common/p1;JJ)V

    .line 107
    .line 108
    .line 109
    iput-object v2, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingTimeline:Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;
    :try_end_0
    .catch Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/source/BaseMediaSource;->refreshSourceInfo(Landroidx/media3/common/p1;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :catch_0
    move-exception v0

    .line 116
    iput-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    :goto_6
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-ge v1, v0, :cond_6

    .line 126
    .line 127
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 134
    .line 135
    iget-object v2, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->setClippingError(Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;)V

    .line 138
    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_6
    return-void
.end method


# virtual methods
.method public canUpdateMediaItem(Landroidx/media3/common/o0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/WrappingMediaSource;->getMediaItem()Landroidx/media3/common/o0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/media3/common/d0;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/source/WrappingMediaSource;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/source/MediaSource;->canUpdateMediaItem(Landroidx/media3/common/o0;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 7

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/WrappingMediaSource;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media3/exoplayer/source/MediaSource;->createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->enableInitialDiscontinuity:Z

    .line 10
    .line 11
    iget-wide v3, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodStartUs:J

    .line 12
    .line 13
    iget-wide v5, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->periodEndUs:J

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;-><init>(Landroidx/media3/exoplayer/source/MediaPeriod;ZJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public maybeThrowSourceInfoRefreshError()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroidx/media3/exoplayer/source/CompositeMediaSource;->maybeThrowSourceInfoRefreshError()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    throw v0
.end method

.method public onChildSourceInfoRefreshed(Landroidx/media3/common/p1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/ClippingMediaSource;->refreshClippedTimeline(Landroidx/media3/common/p1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/source/WrappingMediaSource;->mediaSource:Landroidx/media3/exoplayer/source/MediaSource;

    .line 11
    .line 12
    check-cast p1, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/source/MediaSource;->releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->mediaPeriods:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-boolean p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->allowDynamicClippingUpdates:Z

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingTimeline:Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/ClippingMediaSource;->refreshClippedTimeline(Landroidx/media3/common/p1;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public releaseSourceInternal()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/media3/exoplayer/source/CompositeMediaSource;->releaseSourceInternal()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingError:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaSource;->clippingTimeline:Landroidx/media3/exoplayer/source/ClippingMediaSource$ClippingTimeline;

    .line 8
    .line 9
    return-void
.end method
