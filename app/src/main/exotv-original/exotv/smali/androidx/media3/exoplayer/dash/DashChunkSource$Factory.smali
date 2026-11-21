.class public interface abstract Landroidx/media3/exoplayer/dash/DashChunkSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashChunkSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation


# virtual methods
.method public abstract createDashChunkSource(Landroidx/media3/exoplayer/upstream/LoaderErrorThrower;Landroidx/media3/exoplayer/dash/manifest/DashManifest;Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;I[ILandroidx/media3/exoplayer/trackselection/ExoTrackSelection;IJZLjava/util/List;Landroidx/media3/exoplayer/dash/PlayerEmsgHandler$PlayerTrackEmsgHandler;Lk1/c0;Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;)Landroidx/media3/exoplayer/dash/DashChunkSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/upstream/LoaderErrorThrower;",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
            "Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;",
            "I[I",
            "Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;",
            "IJZ",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Landroidx/media3/exoplayer/dash/PlayerEmsgHandler$PlayerTrackEmsgHandler;",
            "Lk1/c0;",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            "Landroidx/media3/exoplayer/upstream/CmcdConfiguration;",
            ")",
            "Landroidx/media3/exoplayer/dash/DashChunkSource;"
        }
    .end annotation
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/dash/DashChunkSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    return-object p1
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/dash/DashChunkSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method
