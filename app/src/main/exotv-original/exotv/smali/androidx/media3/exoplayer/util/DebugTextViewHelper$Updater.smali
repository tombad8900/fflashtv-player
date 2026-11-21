.class final Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/b1;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/util/DebugTextViewHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Updater"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/util/DebugTextViewHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;->this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/util/DebugTextViewHelper;Landroidx/media3/exoplayer/util/DebugTextViewHelper$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;-><init>(Landroidx/media3/exoplayer/util/DebugTextViewHelper;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onAudioAttributesChanged(Landroidx/media3/common/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onAudioSessionIdChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onAvailableCommandsChanged(Landroidx/media3/common/z0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onCues(Lg1/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onCues(Ljava/util/List;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    return-void
.end method

.method public bridge synthetic onDeviceInfoChanged(Landroidx/media3/common/q;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onDeviceVolumeChanged(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onEvents(Landroidx/media3/common/d1;Landroidx/media3/common/a1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onIsLoadingChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onIsPlayingChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onLoadingChanged(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic onMaxSeekToPreviousPositionChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onMediaItemTransition(Landroidx/media3/common/o0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onMediaMetadataChanged(Landroidx/media3/common/r0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onMetadata(Landroidx/media3/common/t0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPlayWhenReadyChanged(ZI)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;->this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/util/DebugTextViewHelper;->updateAndPost()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onPlaybackParametersChanged(Landroidx/media3/common/y0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;->this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/util/DebugTextViewHelper;->updateAndPost()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPlayerError(Landroidx/media3/common/x0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPlayerErrorChanged(Landroidx/media3/common/x0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPlayerStateChanged(ZI)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic onPlaylistMetadataChanged(Landroidx/media3/common/r0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPositionDiscontinuity(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public onPositionDiscontinuity(Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;->this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;

    invoke-virtual {p1}, Landroidx/media3/exoplayer/util/DebugTextViewHelper;->updateAndPost()V

    return-void
.end method

.method public bridge synthetic onRenderedFirstFrame()V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onRepeatModeChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSeekBackIncrementChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSeekForwardIncrementChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSkipSilenceEnabledChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSurfaceSizeChanged(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onTimelineChanged(Landroidx/media3/common/p1;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onTrackSelectionParametersChanged(Landroidx/media3/common/v1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onTracksChanged(Landroidx/media3/common/x1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onVideoSizeChanged(Landroidx/media3/common/d2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onVolumeChanged(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/util/DebugTextViewHelper$Updater;->this$0:Landroidx/media3/exoplayer/util/DebugTextViewHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/util/DebugTextViewHelper;->updateAndPost()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
