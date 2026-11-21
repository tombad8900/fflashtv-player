.class final Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/MediaPeriod;
.implements Landroidx/media3/exoplayer/upstream/Loader$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;,
        Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media3/exoplayer/source/MediaPeriod;",
        "Landroidx/media3/exoplayer/upstream/Loader$Callback<",
        "Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;",
        ">;"
    }
.end annotation


# static fields
.field private static final INITIAL_SAMPLE_SIZE:I = 0x400

.field private static final TAG:Ljava/lang/String; = "SingleSampleMediaPeriod"


# instance fields
.field private final dataSourceFactory:Lk1/g;

.field private final dataSpec:Lk1/l;

.field private final durationUs:J

.field private final eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

.field final format:Landroidx/media3/common/w;

.field private final loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field final loader:Landroidx/media3/exoplayer/upstream/Loader;

.field loadingFinished:Z

.field sampleData:[B

.field sampleSize:I

.field private final sampleStreams:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final tracks:Landroidx/media3/exoplayer/source/TrackGroupArray;

.field private final transferListener:Lk1/c0;

.field final treatLoadErrorsAsEndOfStream:Z


# direct methods
.method public constructor <init>(Lk1/l;Lk1/g;Lk1/c0;Landroidx/media3/common/w;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->dataSpec:Lk1/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->dataSourceFactory:Lk1/g;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->transferListener:Lk1/c0;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->format:Landroidx/media3/common/w;

    .line 11
    .line 12
    iput-wide p5, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    .line 13
    .line 14
    iput-object p7, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 15
    .line 16
    iput-object p8, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 17
    .line 18
    iput-boolean p9, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->treatLoadErrorsAsEndOfStream:Z

    .line 19
    .line 20
    new-instance p1, Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 21
    .line 22
    new-instance p2, Landroidx/media3/common/q1;

    .line 23
    .line 24
    filled-new-array {p4}, [Landroidx/media3/common/w;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const-string p4, ""

    .line 29
    .line 30
    invoke-direct {p2, p4, p3}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {p2}, [Landroidx/media3/common/q1;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/source/TrackGroupArray;-><init>([Landroidx/media3/common/q1;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->tracks:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleStreams:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance p1, Landroidx/media3/exoplayer/upstream/Loader;

    .line 50
    .line 51
    const-string p2, "SingleSampleMediaPeriod"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/upstream/Loader;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 57
    .line 58
    return-void
.end method

.method public static synthetic access$300(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;)Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadingFinished:Z

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/upstream/Loader;->isLoading()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/media3/exoplayer/upstream/Loader;->hasFatalError()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->dataSourceFactory:Lk1/g;

    .line 25
    .line 26
    invoke-interface {v1}, Lk1/g;->l()Lk1/h;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->transferListener:Lk1/c0;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1, v2}, Lk1/h;->addTransferListener(Lk1/c0;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance v2, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;

    .line 38
    .line 39
    iget-object v3, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->dataSpec:Lk1/l;

    .line 40
    .line 41
    invoke-direct {v2, v3, v1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;-><init>(Lk1/l;Lk1/h;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 45
    .line 46
    iget-object v3, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    invoke-interface {v3, v4}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->getMinimumLoadableRetryCount(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v1, v2, v0, v3}, Landroidx/media3/exoplayer/upstream/Loader;->startLoading(Landroidx/media3/exoplayer/upstream/Loader$Loadable;Landroidx/media3/exoplayer/upstream/Loader$Callback;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    iget-object v11, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 58
    .line 59
    new-instance v5, Landroidx/media3/exoplayer/source/LoadEventInfo;

    .line 60
    .line 61
    iget-wide v6, v2, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    .line 62
    .line 63
    iget-object v8, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->dataSpec:Lk1/l;

    .line 64
    .line 65
    invoke-direct/range {v5 .. v10}, Landroidx/media3/exoplayer/source/LoadEventInfo;-><init>(JLk1/l;J)V

    .line 66
    .line 67
    .line 68
    iget-object v15, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->format:Landroidx/media3/common/w;

    .line 69
    .line 70
    const-wide/16 v18, 0x0

    .line 71
    .line 72
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    .line 73
    .line 74
    const/4 v13, 0x1

    .line 75
    const/4 v14, -0x1

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    move-wide/from16 v20, v1

    .line 81
    .line 82
    move-object v12, v5

    .line 83
    invoke-virtual/range {v11 .. v21}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->loadStarted(Landroidx/media3/exoplayer/source/LoadEventInfo;IILandroidx/media3/common/w;ILjava/lang/Object;JJ)V

    .line 84
    .line 85
    .line 86
    return v4

    .line 87
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 88
    return v1
.end method

.method public discardBuffer(JZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public getAdjustedSeekPositionUs(JLandroidx/media3/exoplayer/SeekParameters;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public getBufferedPositionUs()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadingFinished:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    return-wide v0
.end method

.method public getNextLoadPositionUs()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadingFinished:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/upstream/Loader;->isLoading()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 18
    .line 19
    return-wide v0
.end method

.method public getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->tracks:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/upstream/Loader;->isLoading()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public maybeThrowPrepareError()V
    .locals 0

    .line 1
    return-void
.end method

.method public onLoadCanceled(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJZ)V
    .locals 13

    .line 2
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->access$100(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)Lk1/b0;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/media3/exoplayer/source/LoadEventInfo;

    iget-wide v2, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    iget-object v4, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lk1/l;

    .line 4
    iget-object v5, v0, Lk1/b0;->l:Landroid/net/Uri;

    .line 5
    iget-object v6, v0, Lk1/b0;->m:Ljava/util/Map;

    .line 6
    iget-wide v11, v0, Lk1/b0;->k:J

    move-wide v7, p2

    move-wide/from16 v9, p4

    .line 7
    invoke-direct/range {v1 .. v12}, Landroidx/media3/exoplayer/source/LoadEventInfo;-><init>(JLk1/l;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    iget-wide v2, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    invoke-interface {v0, v2, v3}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->onLoadTaskConcluded(J)V

    move-object v2, v1

    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    const-wide/16 v8, 0x0

    iget-wide v10, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->loadCanceled(Landroidx/media3/exoplayer/source/LoadEventInfo;IILandroidx/media3/common/w;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public bridge synthetic onLoadCanceled(Landroidx/media3/exoplayer/upstream/Loader$Loadable;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;

    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->onLoadCanceled(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJZ)V

    return-void
.end method

.method public onLoadCompleted(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJ)V
    .locals 13

    .line 2
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->access$100(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)Lk1/b0;

    move-result-object v0

    .line 3
    iget-wide v0, v0, Lk1/b0;->k:J

    long-to-int v0, v0

    .line 4
    iput v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleSize:I

    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->access$200(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)[B

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleData:[B

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadingFinished:Z

    .line 9
    invoke-static {p1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->access$100(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)Lk1/b0;

    move-result-object v0

    .line 10
    new-instance v1, Landroidx/media3/exoplayer/source/LoadEventInfo;

    iget-wide v2, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    iget-object v4, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lk1/l;

    .line 11
    iget-object v5, v0, Lk1/b0;->l:Landroid/net/Uri;

    .line 12
    iget-object v6, v0, Lk1/b0;->m:Ljava/util/Map;

    .line 13
    iget v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleSize:I

    int-to-long v11, v0

    move-wide v7, p2

    move-wide/from16 v9, p4

    invoke-direct/range {v1 .. v12}, Landroidx/media3/exoplayer/source/LoadEventInfo;-><init>(JLk1/l;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    iget-wide v2, p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    invoke-interface {v0, v2, v3}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->onLoadTaskConcluded(J)V

    move-object v2, v1

    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    iget-object v5, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->format:Landroidx/media3/common/w;

    const-wide/16 v8, 0x0

    iget-wide v10, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->loadCompleted(Landroidx/media3/exoplayer/source/LoadEventInfo;IILandroidx/media3/common/w;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public bridge synthetic onLoadCompleted(Landroidx/media3/exoplayer/upstream/Loader$Loadable;JJ)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;

    invoke-virtual/range {p0 .. p5}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->onLoadCompleted(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJ)V

    return-void
.end method

.method public onLoadError(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJLjava/io/IOException;I)Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    move/from16 v2, p7

    .line 2
    invoke-static {v1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->access$100(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)Lk1/b0;

    move-result-object v3

    .line 3
    new-instance v14, Landroidx/media3/exoplayer/source/LoadEventInfo;

    iget-wide v4, v1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    iget-object v6, v1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lk1/l;

    .line 4
    iget-object v7, v3, Lk1/b0;->l:Landroid/net/Uri;

    .line 5
    iget-object v8, v3, Lk1/b0;->m:Ljava/util/Map;

    .line 6
    iget-wide v9, v3, Lk1/b0;->k:J

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide v15, v4

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move-wide/from16 v24, v9

    .line 7
    invoke-direct/range {v14 .. v25}, Landroidx/media3/exoplayer/source/LoadEventInfo;-><init>(JLk1/l;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 8
    new-instance v3, Landroidx/media3/exoplayer/source/MediaLoadData;

    iget-object v6, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->format:Landroidx/media3/common/w;

    iget-wide v4, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    .line 9
    invoke-static {v4, v5}, Lh1/i0;->f0(J)J

    move-result-wide v11

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v3 .. v12}, Landroidx/media3/exoplayer/source/MediaLoadData;-><init>(IILandroidx/media3/common/w;ILjava/lang/Object;JJ)V

    .line 10
    iget-object v4, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    new-instance v5, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;

    invoke-direct {v5, v14, v3, v13, v2}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;-><init>(Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;Ljava/io/IOException;I)V

    .line 11
    invoke-interface {v4, v5}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->getRetryDelayMsFor(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    .line 12
    iget-object v8, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 13
    invoke-interface {v8, v7}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->getMinimumLoadableRetryCount(I)I

    move-result v8

    if-lt v2, v8, :cond_0

    goto :goto_0

    :cond_0
    move v2, v6

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v7

    .line 14
    :goto_1
    iget-boolean v8, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->treatLoadErrorsAsEndOfStream:Z

    if-eqz v8, :cond_2

    if-eqz v2, :cond_2

    .line 15
    const-string v2, "SingleSampleMediaPeriod"

    const-string v3, "Loading failed, treating as end-of-stream."

    invoke-static {v2, v3, v13}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    iput-boolean v7, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadingFinished:Z

    .line 17
    sget-object v2, Landroidx/media3/exoplayer/upstream/Loader;->DONT_RETRY:Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;

    :goto_2
    move-object v15, v2

    goto :goto_3

    :cond_2
    if-eqz v5, :cond_3

    .line 18
    invoke-static {v6, v3, v4}, Landroidx/media3/exoplayer/upstream/Loader;->createRetryAction(ZJ)Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;

    move-result-object v2

    goto :goto_2

    .line 19
    :cond_3
    sget-object v2, Landroidx/media3/exoplayer/upstream/Loader;->DONT_RETRY_FATAL:Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;

    goto :goto_2

    .line 20
    :goto_3
    invoke-virtual {v15}, Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;->isRetry()Z

    move-result v16

    move-object v3, v14

    xor-int/lit8 v14, v16, 0x1

    .line 21
    iget-object v2, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    iget-object v6, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->format:Landroidx/media3/common/w;

    const-wide/16 v9, 0x0

    iget-wide v11, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->durationUs:J

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v14}, Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;->loadError(Landroidx/media3/exoplayer/source/LoadEventInfo;IILandroidx/media3/common/w;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_4

    .line 22
    iget-object v2, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    iget-wide v3, v1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    invoke-interface {v2, v3, v4}, Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;->onLoadTaskConcluded(J)V

    :cond_4
    return-object v15
.end method

.method public bridge synthetic onLoadError(Landroidx/media3/exoplayer/upstream/Loader$Loadable;JJLjava/io/IOException;I)Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;

    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->onLoadError(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;JJLjava/io/IOException;I)Landroidx/media3/exoplayer/upstream/Loader$LoadErrorAction;

    move-result-object p1

    return-object p1
.end method

.method public prepare(Landroidx/media3/exoplayer/source/MediaPeriod$Callback;J)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/source/MediaPeriod$Callback;->onPrepared(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public readDiscontinuity()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public reevaluateBuffer(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->loader:Landroidx/media3/exoplayer/upstream/Loader;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/upstream/Loader;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public seekToUs(J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleStreams:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleStreams:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;->reset()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide p1
.end method

.method public selectTracks([Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;[Z[Landroidx/media3/exoplayer/source/SampleStream;[ZJ)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_3

    .line 4
    .line 5
    aget-object v1, p3, v0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p1, v0

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    aget-boolean v3, p2, v0

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object v3, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleStreams:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    aput-object v2, p3, v0

    .line 24
    .line 25
    :cond_1
    aget-object v1, p3, v0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    aget-object v1, p1, v0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance v1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;

    .line 34
    .line 35
    invoke-direct {v1, p0, v2}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SampleStreamImpl;-><init>(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$1;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->sampleStreams:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    aput-object v1, p3, v0

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    aput-boolean v1, p4, v0

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-wide p5
.end method
