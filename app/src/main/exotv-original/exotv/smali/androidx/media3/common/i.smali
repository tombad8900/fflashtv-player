.class public abstract Landroidx/media3/common/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/d1;


# instance fields
.field protected final window:Landroidx/media3/common/o1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/media3/common/o1;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/media3/common/o1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 6

    .line 1
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v1, -0x1

    .line 8
    move-object v0, p0

    .line 9
    move v4, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final addMediaItem(ILandroidx/media3/common/o0;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Landroidx/media3/common/d1;->addMediaItems(ILjava/util/List;)V

    return-void
.end method

.method public final addMediaItem(Landroidx/media3/common/o0;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/common/i;->addMediaItems(Ljava/util/List;)V

    return-void
.end method

.method public final addMediaItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Landroidx/media3/common/d1;->addMediaItems(ILjava/util/List;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getPreviousMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/media3/common/i;->a(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v1, v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    move-object v2, p0

    .line 29
    move v6, p1

    .line 30
    invoke-virtual/range {v2 .. v7}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    move v4, p1

    .line 35
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v0, p0

    .line 42
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final canAdvertiseSession()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final clearMediaItems()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Landroidx/media3/common/d1;->removeMediaItems(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getBufferedPercentage()I
    .locals 10

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getBufferedPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Landroidx/media3/common/d1;->getDuration()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v6, v0, v4

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    cmp-long v4, v2, v4

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v4, v2, v4

    .line 27
    .line 28
    const/16 v5, 0x64

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    return v5

    .line 33
    :cond_1
    const-wide/16 v8, 0x64

    .line 34
    .line 35
    mul-long/2addr v0, v8

    .line 36
    div-long/2addr v0, v2

    .line 37
    long-to-int v0, v0

    .line 38
    invoke-static {v0, v7, v5}, Lh1/i0;->j(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :cond_2
    :goto_0
    return v7
.end method

.method public final getContentDuration()J
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-wide v0, v0, Landroidx/media3/common/o1;->m:J

    .line 28
    .line 29
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0
.end method

.method public final getCurrentLiveOffset()J
    .locals 5

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-wide v2

    .line 17
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v4, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-wide v0, v0, Landroidx/media3/common/o1;->f:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return-wide v2

    .line 34
    :cond_1
    iget-object v0, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 35
    .line 36
    iget-wide v0, v0, Landroidx/media3/common/o1;->g:J

    .line 37
    .line 38
    invoke-static {v0, v1}, Lh1/i0;->C(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 43
    .line 44
    iget-wide v2, v2, Landroidx/media3/common/o1;->f:J

    .line 45
    .line 46
    sub-long/2addr v0, v2

    .line 47
    invoke-interface {p0}, Landroidx/media3/common/d1;->getContentPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    sub-long/2addr v0, v2

    .line 52
    return-wide v0
.end method

.method public final getCurrentManifest()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0
.end method

.method public final getCurrentMediaItem()Landroidx/media3/common/o0;
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 24
    .line 25
    return-object v0
.end method

.method public final getCurrentWindowIndex()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final getMediaItemAt(I)Landroidx/media3/common/o0;
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 12
    .line 13
    return-object p1
.end method

.method public final getMediaItemCount()I
    .locals 1

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final getNextMediaItemIndex()I
    .locals 4

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {p0}, Landroidx/media3/common/d1;->getRepeatMode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :cond_1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getShuffleModeEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public final getNextWindowIndex()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getNextMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final getPreviousMediaItemIndex()I
    .locals 4

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {p0}, Landroidx/media3/common/d1;->getRepeatMode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :cond_1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getShuffleModeEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/common/p1;->getPreviousWindowIndex(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public final getPreviousWindowIndex()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getPreviousMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final hasNext()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->hasNextMediaItem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final hasNextMediaItem()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getNextMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final hasNextWindow()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->hasNextMediaItem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final hasPreviousMediaItem()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getPreviousMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final isCommandAvailable(I)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getAvailableCommands()Landroidx/media3/common/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/media3/common/z0;->a:Landroidx/media3/common/u;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/common/u;->a:Landroid/util/SparseBooleanArray;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final isCurrentMediaItemDynamic()Z
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-boolean v0, v0, Landroidx/media3/common/o1;->i:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final isCurrentMediaItemLive()Z
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroidx/media3/common/o1;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public final isCurrentMediaItemSeekable()Z
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-boolean v0, v0, Landroidx/media3/common/o1;->h:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final isCurrentWindowDynamic()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemDynamic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isCurrentWindowLive()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemLive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isCurrentWindowSeekable()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemSeekable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isPlaying()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Landroidx/media3/common/d1;->getPlaybackSuppressionReason()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final moveMediaItem(II)V
    .locals 1

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    add-int/lit8 v0, p1, 0x1

    .line 4
    .line 5
    invoke-interface {p0, p1, v0, p2}, Landroidx/media3/common/d1;->moveMediaItems(III)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final next()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->seekToNextMediaItem()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Landroidx/media3/common/d1;->setPlayWhenReady(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final play()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Landroidx/media3/common/d1;->setPlayWhenReady(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final removeMediaItem(I)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-interface {p0, p1, v0}, Landroidx/media3/common/d1;->removeMediaItems(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final replaceMediaItem(ILandroidx/media3/common/o0;)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p1, v0, p2}, Landroidx/media3/common/d1;->replaceMediaItems(IILjava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final seekBack()V
    .locals 10

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getSeekBackIncrement()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    neg-long v0, v0

    .line 6
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPosition()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    add-long/2addr v2, v0

    .line 11
    invoke-interface {p0}, Landroidx/media3/common/d1;->getDuration()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, v4

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :cond_0
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v9, 0x0

    .line 39
    const/16 v8, 0xb

    .line 40
    .line 41
    move-object v4, p0

    .line 42
    invoke-virtual/range {v4 .. v9}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final seekForward()V
    .locals 10

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getSeekForwardIncrement()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    add-long/2addr v2, v0

    .line 10
    invoke-interface {p0}, Landroidx/media3/common/d1;->getDuration()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    :cond_0
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v9, 0x0

    .line 38
    const/16 v8, 0xc

    .line 39
    .line 40
    move-object v4, p0

    .line 41
    invoke-virtual/range {v4 .. v9}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final seekTo(IJ)V
    .locals 6

    const/16 v4, 0xa

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    .line 1
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    return-void
.end method

.method public abstract seekTo(IJIZ)V
.end method

.method public final seekTo(J)V
    .locals 6

    .line 2
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    move-result v1

    const/4 v5, 0x0

    const/4 v4, 0x5

    move-object v0, p0

    move-wide v2, p1

    .line 3
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    return-void
.end method

.method public final seekToDefaultPosition()V
    .locals 6

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    const/4 v4, 0x4

    move-object v0, p0

    .line 2
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    return-void
.end method

.method public final seekToDefaultPosition(I)V
    .locals 6

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    const/16 v4, 0xa

    move-object v0, p0

    move v1, p1

    .line 3
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    return-void
.end method

.method public final seekToNext()V
    .locals 7

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v5, 0x9

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Landroidx/media3/common/d1;->isPlayingAd()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v1, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/common/i;->hasNextMediaItem()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/media3/common/i;->getNextMediaItemIndex()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v0, -0x1

    .line 32
    if-ne v2, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->a(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v2, v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    move-object v1, p0

    .line 55
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    move-object v1, p0

    .line 66
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemLive()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemDynamic()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    move-object v1, p0

    .line 93
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    move-object v1, p0

    .line 98
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->a(I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :goto_0
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->a(I)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final seekToNextMediaItem()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->getNextMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v0, -0x1

    .line 6
    const/16 v4, 0x8

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v4}, Landroidx/media3/common/i;->a(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v1, v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    move v6, v4

    .line 25
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    move-object v2, p0

    .line 32
    invoke-virtual/range {v2 .. v7}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    move v6, v4

    .line 37
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v0, p0

    .line 44
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final seekToNextWindow()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->seekToNextMediaItem()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final seekToPrevious()V
    .locals 7

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v5, 0x7

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Landroidx/media3/common/d1;->isPlayingAd()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object v1, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/common/i;->hasPreviousMediaItem()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemLive()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/media3/common/i;->isCurrentMediaItemSeekable()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->b(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->a(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPosition()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-interface {p0}, Landroidx/media3/common/d1;->getMaxSeekToPreviousPosition()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long v0, v0, v2

    .line 57
    .line 58
    if-gtz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->b(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/4 v6, 0x0

    .line 69
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/common/i;->seekTo(IJIZ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_0
    invoke-virtual {p0, v5}, Landroidx/media3/common/i;->a(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final seekToPreviousMediaItem()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Landroidx/media3/common/i;->b(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final seekToPreviousWindow()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/i;->seekToPreviousMediaItem()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setMediaItem(Landroidx/media3/common/o0;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/common/i;->setMediaItems(Ljava/util/List;)V

    return-void
.end method

.method public final setMediaItem(Landroidx/media3/common/o0;J)V
    .locals 1

    .line 2
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2, p3}, Landroidx/media3/common/d1;->setMediaItems(Ljava/util/List;IJ)V

    return-void
.end method

.method public final setMediaItem(Landroidx/media3/common/o0;Z)V
    .locals 0

    .line 3
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Landroidx/media3/common/d1;->setMediaItems(Ljava/util/List;Z)V

    return-void
.end method

.method public final setMediaItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, p1, v0}, Landroidx/media3/common/d1;->setMediaItems(Ljava/util/List;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final setPlaybackSpeed(F)V
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/media3/common/y0;

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/common/y0;->b:F

    .line 8
    .line 9
    invoke-direct {v1, p1, v0}, Landroidx/media3/common/y0;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v1}, Landroidx/media3/common/d1;->setPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
