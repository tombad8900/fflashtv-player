.class public abstract Landroidx/media3/exoplayer/source/ForwardingTimeline;
.super Landroidx/media3/common/p1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field protected final timeline:Landroidx/media3/common/p1;


# direct methods
.method public constructor <init>(Landroidx/media3/common/p1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getFirstWindowIndex(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getIndexOfPeriod(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLastWindowIndex(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getNextWindowIndex(IIZ)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getPeriodCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getPreviousWindowIndex(IIZ)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/common/p1;->getPreviousWindowIndex(IIZ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getUidOfPeriod(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/p1;->getUidOfPeriod(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getWindowCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ForwardingTimeline;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
