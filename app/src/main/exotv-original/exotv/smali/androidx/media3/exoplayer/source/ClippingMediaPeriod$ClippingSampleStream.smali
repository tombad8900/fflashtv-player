.class final Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/SampleStream;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/ClippingMediaPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ClippingSampleStream"
.end annotation


# instance fields
.field public final childStream:Landroidx/media3/exoplayer/source/SampleStream;

.field private sentEos:Z

.field final synthetic this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/source/ClippingMediaPeriod;Landroidx/media3/exoplayer/source/SampleStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->childStream:Landroidx/media3/exoplayer/source/SampleStream;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public clearSentEos()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->sentEos:Z

    .line 3
    .line 4
    return-void
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->isPendingInitialDiscontinuity()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->childStream:Landroidx/media3/exoplayer/source/SampleStream;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/SampleStream;->isReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public maybeThrowError()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->childStream:Landroidx/media3/exoplayer/source/SampleStream;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/SampleStream;->maybeThrowError()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public readData(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->isPendingInitialDiscontinuity()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x3

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->sentEos:Z

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, -0x4

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2, v2}, Lm1/a;->setFlags(I)V

    .line 18
    .line 19
    .line 20
    return v3

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->getBufferedPositionUs()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->childStream:Landroidx/media3/exoplayer/source/SampleStream;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2, p3}, Landroidx/media3/exoplayer/source/SampleStream;->readData(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/4 v0, -0x5

    .line 34
    const-wide/high16 v6, -0x8000000000000000L

    .line 35
    .line 36
    if-ne p3, v0, :cond_6

    .line 37
    .line 38
    iget-object p2, p1, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget p3, p2, Landroidx/media3/common/w;->G:I

    .line 44
    .line 45
    iget v1, p2, Landroidx/media3/common/w;->F:I

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return v0

    .line 53
    :cond_3
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 54
    .line 55
    iget-wide v3, v2, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->startUs:J

    .line 56
    .line 57
    const-wide/16 v8, 0x0

    .line 58
    .line 59
    cmp-long v3, v3, v8

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    move v1, v4

    .line 65
    :cond_4
    iget-wide v2, v2, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->endUs:J

    .line 66
    .line 67
    cmp-long v2, v2, v6

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    move p3, v4

    .line 72
    :cond_5
    invoke-virtual {p2}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iput v1, p2, Landroidx/media3/common/v;->E:I

    .line 77
    .line 78
    iput p3, p2, Landroidx/media3/common/v;->F:I

    .line 79
    .line 80
    new-instance p3, Landroidx/media3/common/w;

    .line 81
    .line 82
    invoke-direct {p3, p2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 83
    .line 84
    .line 85
    iput-object p3, p1, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 86
    .line 87
    return v0

    .line 88
    :cond_6
    iget-object p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 89
    .line 90
    iget-wide v8, p1, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->endUs:J

    .line 91
    .line 92
    cmp-long p1, v8, v6

    .line 93
    .line 94
    if-eqz p1, :cond_9

    .line 95
    .line 96
    if-ne p3, v3, :cond_7

    .line 97
    .line 98
    iget-wide v10, p2, Lm1/g;->timeUs:J

    .line 99
    .line 100
    cmp-long p1, v10, v8

    .line 101
    .line 102
    if-gez p1, :cond_8

    .line 103
    .line 104
    :cond_7
    if-ne p3, v1, :cond_9

    .line 105
    .line 106
    cmp-long p1, v4, v6

    .line 107
    .line 108
    if-nez p1, :cond_9

    .line 109
    .line 110
    iget-boolean p1, p2, Lm1/g;->waitingForKeys:Z

    .line 111
    .line 112
    if-nez p1, :cond_9

    .line 113
    .line 114
    :cond_8
    invoke-virtual {p2}, Lm1/g;->clear()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v2}, Lm1/a;->setFlags(I)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x1

    .line 121
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->sentEos:Z

    .line 122
    .line 123
    return v3

    .line 124
    :cond_9
    return p3
.end method

.method public skipData(J)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->this$0:Landroidx/media3/exoplayer/source/ClippingMediaPeriod;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/ClippingMediaPeriod;->isPendingInitialDiscontinuity()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x3

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ClippingMediaPeriod$ClippingSampleStream;->childStream:Landroidx/media3/exoplayer/source/SampleStream;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/source/SampleStream;->skipData(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
