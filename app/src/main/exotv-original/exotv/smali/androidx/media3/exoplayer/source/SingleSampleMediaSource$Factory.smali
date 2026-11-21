.class public final Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/SingleSampleMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final dataSourceFactory:Lk1/g;

.field private loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private tag:Ljava/lang/Object;

.field private trackId:Ljava/lang/String;

.field private treatLoadErrorsAsEndOfStream:Z


# direct methods
.method public constructor <init>(Lk1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->dataSourceFactory:Lk1/g;

    .line 8
    .line 9
    new-instance p1, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;

    .line 10
    .line 11
    invoke-direct {p1}, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->treatLoadErrorsAsEndOfStream:Z

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public createMediaSource(Landroidx/media3/common/n0;J)Landroidx/media3/exoplayer/source/SingleSampleMediaSource;
    .locals 10

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->trackId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->dataSourceFactory:Lk1/g;

    .line 6
    .line 7
    iget-object v6, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 8
    .line 9
    iget-boolean v7, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->treatLoadErrorsAsEndOfStream:Z

    .line 10
    .line 11
    iget-object v8, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->tag:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    move-object v2, p1

    .line 15
    move-wide v4, p2

    .line 16
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;-><init>(Ljava/lang/String;Landroidx/media3/common/n0;Lk1/g;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;ZLjava/lang/Object;Landroidx/media3/exoplayer/source/SingleSampleMediaSource$1;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;

    .line 5
    .line 6
    invoke-direct {p1}, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 10
    .line 11
    return-object p0
.end method

.method public setTag(Ljava/lang/Object;)Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->tag:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public setTrackId(Ljava/lang/String;)Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->trackId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setTreatLoadErrorsAsEndOfStream(Z)Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;->treatLoadErrorsAsEndOfStream:Z

    .line 2
    .line 3
    return-object p0
.end method
