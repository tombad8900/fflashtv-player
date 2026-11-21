package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0256y0;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.DefaultMediaClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p043e6.InterfaceC0921i;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1102a0;
import p063h1.C1104b0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1120k;
import p089k1.C1565i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = AbstractC1118i0.m2447f0(Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final AnalyticsCollector analyticsCollector;
    private final InterfaceC1120k applicationLooperHandler;
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final InterfaceC1103b clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final InterfaceC1120k handler;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final C0221m1 period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final PlaybackLooperProvider playbackLooperProvider;
    private final PlayerId playerId;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final Renderer[] renderers;
    private final Set<Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final C0227o1 window;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private long lastRebufferRealtimeMs = -9223372036854775807L;
    private AbstractC0230p1 lastPreloadPoolInvalidationTimeline = AbstractC0230p1.EMPTY;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i4, int i8, ShuffleOrder shuffleOrder) {
            this.fromIndex = i;
            this.toIndex = i4;
            this.newFromIndex = i8;
            this.shuffleOrder = shuffleOrder;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : AbstractC1118i0.m2449h(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                AbstractC1101a.m2353d(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j8, boolean z7, boolean z8, boolean z9) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j8;
            this.forceBufferingState = z7;
            this.endPlayback = z8;
            this.setTargetLiveOffset = z9;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SeekPosition {
        public final AbstractC0230p1 timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(AbstractC0230p1 abstractC0230p1, int i, long j) {
            this.timeline = abstractC0230p1;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z7, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z8, boolean z9, Looper looper, InterfaceC1103b interfaceC1103b, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, PlaybackLooperProvider playbackLooperProvider, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i;
        this.shuffleModeEnabled = z7;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z8;
        this.dynamicSchedulingEnabled = z9;
        this.clock = interfaceC1103b;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        PlaybackInfo playbackInfoCreateDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = playbackInfoCreateDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(playbackInfoCreateDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        for (int i4 = 0; i4 < rendererArr.length; i4++) {
            rendererArr[i4].init(i4, playerId, interfaceC1103b);
            this.rendererCapabilities[i4] = rendererArr[i4].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i4].setListener(rendererCapabilitiesListener);
            }
        }
        this.mediaClock = new DefaultMediaClock(this, interfaceC1103b);
        this.pendingMessages = new ArrayList<>();
        this.renderersToReset = Collections.newSetFromMap(new IdentityHashMap());
        this.window = new C0227o1();
        this.period = new C0221m1();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        C1135z c1135z = (C1135z) interfaceC1103b;
        C1104b0 c1104b0M2541a = c1135z.m2541a(looper, null);
        this.applicationLooperHandler = c1104b0M2541a;
        this.queue = new MediaPeriodQueue(analyticsCollector, c1104b0M2541a, new C0380k(9, this), preloadConfiguration);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, c1104b0M2541a, playerId);
        PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        Looper looperObtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = looperObtainLooper;
        this.handler = c1135z.m2541a(looperObtainLooper, this);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].enableMayRenderStartOfStream();
            }
        }
    }

    private void attemptRendererErrorRecovery() {
        reselectTracksInternalAndSeek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPeriodHolder createMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, long j) {
        return new MediaPeriodHolder(this.rendererCapabilities, j, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs);
    }

    private void deliverMessage(PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableRenderer(int i) {
        Renderer renderer = this.renderers[i];
        if (isRendererEnabled(renderer)) {
            maybeTriggerOnRendererReadyChanged(i, false);
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSomeWork() {
        boolean z7;
        boolean z8;
        long j;
        boolean z9;
        boolean z10;
        PlaybackInfo playbackInfo;
        int i;
        ((C1135z) this.clock).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        ((C1104b0) this.handler).m2383f(2);
        updatePeriods();
        int i4 = this.playbackInfo.playbackState;
        if (i4 == 1 || i4 == 4) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            ((C1135z) this.clock).getClass();
            this.rendererPositionElapsedRealtimeUs = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime());
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z7 = true;
            z8 = true;
            int i8 = 0;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i8 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i8];
                if (isRendererEnabled(renderer)) {
                    renderer.render(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs);
                    z7 = z7 && renderer.isEnded();
                    boolean z11 = playingPeriod.sampleStreams[i8] != renderer.getStream();
                    boolean z12 = z11 || (!z11 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    maybeTriggerOnRendererReadyChanged(i8, z12);
                    z8 = z8 && z12;
                    if (!z12) {
                        maybeThrowRendererStreamError(i8);
                    }
                } else {
                    maybeTriggerOnRendererReadyChanged(i8, false);
                }
                i8++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z7 = true;
            z8 = true;
        }
        long j8 = playingPeriod.info.durationUs;
        if (z7 && playingPeriod.prepared) {
            if (j8 != -9223372036854775807L) {
                j = -9223372036854775807L;
                if (j8 <= this.playbackInfo.positionUs) {
                }
                if (z9 && this.pendingPauseAtEndOfPeriod) {
                    this.pendingPauseAtEndOfPeriod = false;
                    setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
                }
                if (z9 && playingPeriod.info.isFinal) {
                    setState(4);
                    stopRenderers();
                } else if (this.playbackInfo.playbackState != 2 && shouldTransitionToReadyState(z8)) {
                    setState(3);
                    this.pendingRecoverableRendererError = null;
                    if (shouldPlayWhenReady()) {
                        updateRebufferingState(false, false);
                        this.mediaClock.start();
                        startRenderers();
                    }
                } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z8 : !isTimelineReady())) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
                if (this.playbackInfo.playbackState == 2) {
                    int i9 = 0;
                    while (true) {
                        Renderer[] rendererArr2 = this.renderers;
                        if (i9 >= rendererArr2.length) {
                            break;
                        }
                        if (isRendererEnabled(rendererArr2[i9]) && this.renderers[i9].getStream() == playingPeriod.sampleStreams[i9]) {
                            maybeThrowRendererStreamError(i9);
                        }
                        i9++;
                    }
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    if (playbackInfo2.isLoading || playbackInfo2.totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US || !isLoadingPossible(this.queue.getLoadingPeriod())) {
                        this.playbackMaybeBecameStuckAtMs = j;
                    } else if (this.playbackMaybeBecameStuckAtMs == j) {
                        ((C1135z) this.clock).getClass();
                        this.playbackMaybeBecameStuckAtMs = SystemClock.elapsedRealtime();
                    } else {
                        ((C1135z) this.clock).getClass();
                        if (SystemClock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= PLAYBACK_STUCK_AFTER_MS) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                    }
                }
                boolean z13 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
                z10 = this.offloadSchedulingEnabled && this.requestForRendererSleep && z13;
                playbackInfo = this.playbackInfo;
                if (playbackInfo.sleepingForOffload != z10) {
                    this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z10);
                }
                this.requestForRendererSleep = false;
                if (!z10 && (i = this.playbackInfo.playbackState) != 4 && (z13 || i == 2 || (i == 3 && this.enabledRendererCount != 0))) {
                    scheduleNextWork(jUptimeMillis);
                }
                Trace.endSection();
            }
            j = -9223372036854775807L;
            z9 = true;
            if (z9) {
                this.pendingPauseAtEndOfPeriod = false;
                setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
            }
            if (z9) {
                if (this.playbackInfo.playbackState != 2) {
                    if (this.playbackInfo.playbackState == 3) {
                        updateRebufferingState(shouldPlayWhenReady(), false);
                        setState(2);
                        if (this.isRebuffering) {
                        }
                        stopRenderers();
                    }
                }
            }
            if (this.playbackInfo.playbackState == 2) {
            }
            if (shouldPlayWhenReady()) {
            }
            if (this.offloadSchedulingEnabled) {
            }
            playbackInfo = this.playbackInfo;
            if (playbackInfo.sleepingForOffload != z10) {
            }
            this.requestForRendererSleep = false;
            if (!z10) {
                scheduleNextWork(jUptimeMillis);
            }
            Trace.endSection();
        }
        j = -9223372036854775807L;
        z9 = false;
        if (z9) {
        }
        if (z9) {
        }
        if (this.playbackInfo.playbackState == 2) {
        }
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload != z10) {
        }
        this.requestForRendererSleep = false;
        if (!z10) {
        }
        Trace.endSection();
    }

    private void enableRenderer(int i, boolean z7, long j) {
        Renderer renderer = this.renderers[i];
        if (isRendererEnabled(renderer)) {
            return;
        }
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z8 = readingPeriod == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        C0249w[] formats = getFormats(trackSelectorResult.selections[i]);
        boolean z9 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z10 = !z7 && z9;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i], this.rendererPositionUs, z10, z8, j, readingPeriod.getRendererOffset(), readingPeriod.info.f1558id);
        renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (ExoPlayerImplInternal.this.dynamicSchedulingEnabled || ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    ((C1104b0) ExoPlayerImplInternal.this.handler).m2384g(2);
                }
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z9 && z8) {
            renderer.start();
        }
    }

    private void enableRenderers() {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private AbstractC0983m0 extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        C0974j0 c0974j0 = new C0974j0(4);
        boolean z7 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                C0241t0 c0241t0 = exoTrackSelection.getFormat(0).f1520l;
                if (c0241t0 == null) {
                    c0974j0.m2141a(new C0241t0(new InterfaceC0238s0[0]));
                } else {
                    c0974j0.m2141a(c0241t0);
                    z7 = true;
                }
            }
        }
        if (z7) {
            return c0974j0.m2159f();
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private static C0249w[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        C0249w[] c0249wArr = new C0249w[length];
        for (int i = 0; i < length; i++) {
            c0249wArr[i] = exoTrackSelection.getFormat(i);
        }
        return c0249wArr;
    }

    private long getLiveOffsetUs(AbstractC0230p1 abstractC0230p1, Object obj, long j) {
        abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(obj, this.period).f1206c, this.window);
        C0227o1 c0227o1 = this.window;
        if (c0227o1.f1265f != -9223372036854775807L && c0227o1.m654a()) {
            C0227o1 c0227o12 = this.window;
            if (c0227o12.f1268i) {
                return AbstractC1118i0.m2428S(AbstractC1118i0.m2412C(c0227o12.f1266g) - this.window.f1265f) - (j + this.period.f1208e);
            }
        }
        return -9223372036854775807L;
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i]) && this.renderers[i].getStream() == readingPeriod.sampleStreams[i]) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(AbstractC0230p1 abstractC0230p1) {
        if (abstractC0230p1.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(this.window, this.period, abstractC0230p1.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(abstractC0230p1, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            abstractC0230p1.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            jLongValue = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.m641f(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.f1210g.f1052c : 0L;
        }
        return Pair.create(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (this.queue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handleIoException(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(playingPeriod.info.f1558id);
        }
        AbstractC1101a.m2365p(TAG, "Playback error", exoPlaybackExceptionCreateForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z7) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f1558id;
        boolean zEquals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!zEquals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!zEquals || z7) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.f1558id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleLoadingPeriodPrepared(MediaPeriodHolder mediaPeriodHolder) {
        if (!mediaPeriodHolder.prepared) {
            float f8 = this.mediaClock.getPlaybackParameters().f1549a;
            PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f8, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.f1558id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs);
            enableRenderers();
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j = mediaPeriodHolder.info.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, playbackInfo2.requestedContentPositionUs, j, false, 5);
        }
        maybeContinueLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleMediaSourceListInfoRefreshed(AbstractC0230p1 abstractC0230p1, boolean z7) throws Throwable {
        int i;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j;
        AbstractC0230p1 abstractC0230p12;
        long j8;
        boolean z8;
        long j9;
        int i4;
        AbstractC0230p1 abstractC0230p13;
        AbstractC0230p1 abstractC0230p14 = abstractC0230p1;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChangeResolvePositionForPlaylistChange = resolvePositionForPlaylistChange(abstractC0230p14, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        MediaSource.MediaPeriodId mediaPeriodId2 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodId;
        long j10 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z9 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.forceBufferingState;
        long jSeekToPeriodPosition = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionUs;
        int i8 = 1;
        boolean z10 = (this.playbackInfo.periodId.equals(mediaPeriodId2) && jSeekToPeriodPosition == this.playbackInfo.positionUs) ? false : true;
        try {
            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            for (Renderer renderer : this.renderers) {
                renderer.setTimeline(abstractC0230p14);
            }
            try {
                if (z10) {
                    i = 4;
                    i8 = -1;
                    if (!abstractC0230p14.isEmpty()) {
                        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.f1558id.equals(mediaPeriodId2)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(abstractC0230p14, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId2, jSeekToPeriodPosition, z9);
                    }
                } else {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        abstractC0230p14 = abstractC0230p1;
                        i = 4;
                    }
                    try {
                        i = 4;
                        i8 = -1;
                        try {
                            abstractC0230p14 = abstractC0230p1;
                            if (!this.queue.updateQueuedPeriods(abstractC0230p1, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                                seekToCurrentPosition(false);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC0230p14 = abstractC0230p1;
                            mediaPeriodId = mediaPeriodId2;
                            j = j10;
                            abstractC0230p12 = abstractC0230p14;
                            PlaybackInfo playbackInfo = this.playbackInfo;
                            updatePlaybackSpeedSettingsForNewPeriod(abstractC0230p12, mediaPeriodId, playbackInfo.timeline, playbackInfo.periodId, !positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L, false);
                            if (!z10 || j != this.playbackInfo.requestedContentPositionUs) {
                                PlaybackInfo playbackInfo2 = this.playbackInfo;
                                Object obj = playbackInfo2.periodId.periodUid;
                                AbstractC0230p1 abstractC0230p15 = playbackInfo2.timeline;
                                if (z10 || !z7 || abstractC0230p15.isEmpty() || abstractC0230p15.getPeriodByUid(obj, this.period).f1209f) {
                                    j8 = j;
                                    z8 = false;
                                } else {
                                    j8 = j;
                                    z8 = true;
                                }
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j8, this.playbackInfo.discontinuityStartPositionUs, z8, abstractC0230p12.getIndexOfPeriod(obj) != i8 ? i : 3);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(abstractC0230p12, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(abstractC0230p12);
                            if (!abstractC0230p12.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(false);
                            ((C1104b0) this.handler).m2384g(2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC0230p14 = abstractC0230p1;
                        i = 4;
                        i8 = -1;
                        mediaPeriodId = mediaPeriodId2;
                        j = j10;
                        abstractC0230p12 = abstractC0230p14;
                        PlaybackInfo playbackInfo3 = this.playbackInfo;
                        updatePlaybackSpeedSettingsForNewPeriod(abstractC0230p12, mediaPeriodId, playbackInfo3.timeline, playbackInfo3.periodId, !positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L, false);
                        if (!z10) {
                            PlaybackInfo playbackInfo22 = this.playbackInfo;
                            Object obj2 = playbackInfo22.periodId.periodUid;
                            AbstractC0230p1 abstractC0230p152 = playbackInfo22.timeline;
                            if (z10) {
                                j8 = j;
                                z8 = false;
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j8, this.playbackInfo.discontinuityStartPositionUs, z8, abstractC0230p12.getIndexOfPeriod(obj2) != i8 ? i : 3);
                            }
                        }
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(abstractC0230p12, this.playbackInfo.timeline);
                        this.playbackInfo = this.playbackInfo.copyWithTimeline(abstractC0230p12);
                        if (!abstractC0230p12.isEmpty()) {
                        }
                        handleLoadingMediaPeriodChanged(false);
                        ((C1104b0) this.handler).m2384g(2);
                        throw th;
                    }
                }
                PlaybackInfo playbackInfo4 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(abstractC0230p14, mediaPeriodId2, playbackInfo4.timeline, playbackInfo4.periodId, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L, false);
                if (z10 || j10 != this.playbackInfo.requestedContentPositionUs) {
                    PlaybackInfo playbackInfo5 = this.playbackInfo;
                    Object obj3 = playbackInfo5.periodId.periodUid;
                    AbstractC0230p1 abstractC0230p16 = playbackInfo5.timeline;
                    boolean z11 = z10 && z7 && !abstractC0230p16.isEmpty() && !abstractC0230p16.getPeriodByUid(obj3, this.period).f1209f;
                    long j11 = this.playbackInfo.discontinuityStartPositionUs;
                    if (abstractC0230p14.getIndexOfPeriod(obj3) == i8) {
                        j9 = j10;
                        i4 = i;
                    } else {
                        j9 = j10;
                        i4 = 3;
                    }
                    abstractC0230p13 = abstractC0230p14;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, jSeekToPeriodPosition, j9, j11, z11, i4);
                } else {
                    abstractC0230p13 = abstractC0230p14;
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(abstractC0230p13, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(abstractC0230p13);
                if (!abstractC0230p13.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(false);
                ((C1104b0) this.handler).m2384g(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            i = 4;
            mediaPeriodId = mediaPeriodId2;
            j = j10;
            i8 = -1;
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.getClass();
            handleLoadingPeriodPrepared(loadingPeriod);
            return;
        }
        MediaPeriodHolder preloadHolderByMediaPeriod = this.queue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            AbstractC1101a.m2359j(!preloadHolderByMediaPeriod.prepared);
            float f8 = this.mediaClock.getPlaybackParameters().f1549a;
            PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f8, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handlePlaybackParameters(C0256y0 c0256y0, boolean z7) {
        handlePlaybackParameters(c0256y0, c0256y0.f1549a, true, z7);
    }

    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j8, long j9, boolean z7, int i) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            TrackGroupArray trackGroups = playingPeriod == null ? TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            List listExtractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j8) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j8);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = listExtractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                list2 = C0981l1.f4211n;
            }
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z7) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j8, j9, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared) {
            return (renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                break;
            }
            i++;
        }
        return false;
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z7, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSource.MediaPeriodId mediaPeriodId2, C0221m1 c0221m1, long j8) {
        if (!z7 && j == j8 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && c0221m1.m643h(mediaPeriodId.adGroupIndex)) {
                return (c0221m1.m640e(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || c0221m1.m640e(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && c0221m1.m643h(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLoadingPossible(MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, C0221m1 c0221m1) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        AbstractC0230p1 abstractC0230p1 = playbackInfo.timeline;
        return abstractC0230p1.isEmpty() || abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, c0221m1).f1209f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeTriggerOnRendererReadyChanged$1(int i, boolean z7) {
        this.analyticsCollector.onRendererReadyChanged(i, this.renderers[i].getTrackType(), z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$2(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            AbstractC1101a.m2365p(TAG, "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.getClass();
            loadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(loadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().f1549a).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playbackInfo.timeline, preloadingPeriod.info.f1558id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.prepareCalled) {
                        preloadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().f1549a).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    }
                }
            }
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void maybeThrowRendererStreamError(int i) {
        Renderer renderer = this.renderers[i];
        try {
            renderer.maybeThrowStreamError();
        } catch (IOException | RuntimeException e) {
            int trackType = renderer.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e;
            }
            TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
            AbstractC1101a.m2365p(TAG, "Disabling track due to error: " + C0249w.m691e(trackSelectorResult.selections[i].getSelectedFormat()), e);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i] = null;
            trackSelectorResult2.selections[i] = null;
            disableRenderer(i);
            this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i, final boolean z7) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i] != z7) {
            zArr[i] = z7;
            ((C1104b0) this.applicationLooperHandler).m2382e(new Runnable() { // from class: androidx.media3.exoplayer.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1915j.lambda$maybeTriggerOnRendererReadyChanged$1(i, z7);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j8) {
        PendingMessageInfo pendingMessageInfo;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int iMin = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        PendingMessageInfo pendingMessageInfo2 = iMin > 0 ? this.pendingMessages.get(iMin - 1) : null;
        while (pendingMessageInfo2 != null) {
            int i = pendingMessageInfo2.resolvedPeriodIndex;
            if (i <= indexOfPeriod && (i != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs <= j)) {
                break;
            }
            int i4 = iMin - 1;
            pendingMessageInfo2 = i4 > 0 ? this.pendingMessages.get(iMin - 2) : null;
            iMin = i4;
        }
        if (iMin < this.pendingMessages.size()) {
            pendingMessageInfo = this.pendingMessages.get(iMin);
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null) {
                int i8 = pendingMessageInfo.resolvedPeriodIndex;
                if (i8 >= indexOfPeriod && (i8 != indexOfPeriod || pendingMessageInfo.resolvedPeriodTimeUs > j)) {
                    break;
                }
                iMin++;
                if (iMin < this.pendingMessages.size()) {
                    pendingMessageInfo = this.pendingMessages.get(iMin);
                }
            }
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null && pendingMessageInfo.resolvedPeriodIndex == indexOfPeriod) {
                long j9 = pendingMessageInfo.resolvedPeriodTimeUs;
                if (j9 <= j || j9 > j8) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo.message);
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    } else {
                        iMin++;
                    }
                    pendingMessageInfo = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
                } catch (Throwable th) {
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    }
                    throw th;
                }
            }
            this.nextPendingMessageIndexHint = iMin;
            return;
        }
        pendingMessageInfo = null;
    }

    private boolean maybeUpdateLoadingPeriod() {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z7 = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder mediaPeriodHolderEnqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepareCalled) {
                mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepared) {
                ((C1104b0) this.handler).m2381c(8, mediaPeriodHolderEnqueueNextMediaPeriodHolder.mediaPeriod).m2377b();
            }
            if (this.queue.getPlayingPeriod() == mediaPeriodHolderEnqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
            z7 = true;
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z7;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
        updateIsLoading();
        return z7;
    }

    private void maybeUpdateOffloadScheduling() {
        boolean z7;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z8 = false;
            int i = 0;
            boolean z9 = false;
            while (true) {
                if (i >= this.renderers.length) {
                    z7 = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i)) {
                    if (this.renderers[i].getTrackType() != 1) {
                        z7 = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i].offloadModePreferred != 0) {
                        z9 = true;
                    }
                }
                i++;
            }
            if (z9 && z7) {
                z8 = true;
            }
            setOffloadSchedulingEnabled(z8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeUpdatePlayingPeriod() {
        boolean z7;
        boolean z8 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z8) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder mediaPeriodHolderAdvancePlayingPeriod = this.queue.advancePlayingPeriod();
            mediaPeriodHolderAdvancePlayingPeriod.getClass();
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolderAdvancePlayingPeriod.info.f1558id.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolderAdvancePlayingPeriod.info.f1558id;
                    z7 = mediaPeriodId2.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex != mediaPeriodId2.nextAdGroupIndex;
                }
            }
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolderAdvancePlayingPeriod.info;
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.f1558id;
            long j = mediaPeriodInfo.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j, mediaPeriodInfo.requestedContentPositionUs, j, !z7, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (this.playbackInfo.playbackState == 3) {
                startRenderers();
            }
            allowRenderersToRenderStartOfStreams();
            z8 = true;
        }
    }

    private void maybeUpdatePreloadPeriods(boolean z7) {
        if (this.preloadConfiguration.targetPreloadDurationUs == -9223372036854775807L) {
            return;
        }
        if (z7 || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            AbstractC0230p1 abstractC0230p1 = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = abstractC0230p1;
            this.queue.invalidatePreloadPool(abstractC0230p1);
        }
        maybeContinuePreloading();
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() != null && !this.pendingPauseAtEndOfPeriod) {
            if (hasReadingPeriodFinishedReading()) {
                if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    MediaPeriodHolder mediaPeriodHolderAdvanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = mediaPeriodHolderAdvanceReadingPeriod.getTrackSelectorResult();
                    AbstractC0230p1 abstractC0230p1 = this.playbackInfo.timeline;
                    updatePlaybackSpeedSettingsForNewPeriod(abstractC0230p1, mediaPeriodHolderAdvanceReadingPeriod.info.f1558id, abstractC0230p1, readingPeriod.info.f1558id, -9223372036854775807L, false);
                    if (mediaPeriodHolderAdvanceReadingPeriod.prepared && mediaPeriodHolderAdvanceReadingPeriod.mediaPeriod.readDiscontinuity() != -9223372036854775807L) {
                        setAllRendererStreamsFinal(mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                        if (mediaPeriodHolderAdvanceReadingPeriod.isFullyBuffered()) {
                            return;
                        }
                        this.queue.removeAfter(mediaPeriodHolderAdvanceReadingPeriod);
                        handleLoadingMediaPeriodChanged(false);
                        maybeContinueLoading();
                        return;
                    }
                    for (int i4 = 0; i4 < this.renderers.length; i4++) {
                        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i4);
                        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i4);
                        if (zIsRendererEnabled && !this.renderers[i4].isCurrentStreamFinal()) {
                            boolean z7 = this.rendererCapabilities[i4].getTrackType() == -2;
                            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i4];
                            RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i4];
                            if (!zIsRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z7) {
                                setCurrentStreamFinal(this.renderers[i4], mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
            return;
        }
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                long j = readingPeriod.info.durationUs;
                setCurrentStreamFinal(renderer, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
            }
            i++;
        }
    }

    private void maybeUpdateReadingRenderers() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void mediaSourceListUpdateRequestedInternal() throws Throwable {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z7) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z7);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        ((C1104b0) this.handler).m2384g(2);
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            setState(1);
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th;
            }
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            this.renderers[i].release();
        }
    }

    private void removeMediaItemsInternal(int i, int i4, ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i4, shuffleOrder), false);
    }

    private boolean replaceStreamsOrDisableRendererForTransition() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z7 = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return !z7;
            }
            Renderer renderer = rendererArr[i];
            if (isRendererEnabled(renderer)) {
                boolean z8 = renderer.getStream() != readingPeriod.sampleStreams[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z8) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i]), readingPeriod.sampleStreams[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset(), readingPeriod.info.f1558id);
                        if (this.offloadSchedulingEnabled) {
                            setOffloadSchedulingEnabled(false);
                        }
                    } else if (renderer.isEnded()) {
                        disableRenderer(i);
                    } else {
                        z7 = true;
                    }
                }
            }
            i++;
        }
    }

    private void reselectTracksInternal() {
        int i;
        float f8 = this.mediaClock.getPlaybackParameters().f1549a;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = null;
        boolean z7 = true;
        while (playingPeriod != null && playingPeriod.prepared) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult trackSelectorResultSelectTracks = playingPeriod.selectTracks(f8, playbackInfo.timeline, playbackInfo.playWhenReady);
            TrackSelectorResult trackSelectorResult2 = playingPeriod == this.queue.getPlayingPeriod() ? trackSelectorResultSelectTracks : trackSelectorResult;
            if (!trackSelectorResultSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z7) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean zRemoveAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    trackSelectorResult2.getClass();
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, zRemoveAfter, zArr);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z8 = (playbackInfo2.playbackState == 4 || jApplyTrackSelection == playbackInfo2.positionUs) ? false : true;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    i = 4;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, jApplyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z8, 5);
                    if (z8) {
                        resetRendererPosition(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i4 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i4 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i4];
                        boolean zIsRendererEnabled = isRendererEnabled(renderer);
                        zArr2[i4] = zIsRendererEnabled;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i4];
                        if (zIsRendererEnabled) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(i4);
                            } else if (zArr[i4]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i4++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                } else {
                    i = 4;
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(trackSelectorResultSelectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != i) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    ((C1104b0) this.handler).m2384g(2);
                    return;
                }
                return;
            }
            trackSelectorResult = trackSelectorResult2;
            if (playingPeriod == readingPeriod) {
                z7 = false;
            }
            playingPeriod = playingPeriod.getNext();
        }
    }

    private void reselectTracksInternalAndSeek() {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[PHI: r5 r6 r8
      0x00a2: PHI (r5v4 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId) = 
      (r5v3 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
      (r5v7 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
     binds: [B:29:0x0078, B:31:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:29:0x0078, B:31:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:29:0x0078, B:31:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[PHI: r0
      0x00e9: PHI (r0v12 androidx.media3.common.p1) = 
      (r0v11 androidx.media3.common.p1)
      (r0v11 androidx.media3.common.p1)
      (r0v18 androidx.media3.common.p1)
      (r0v18 androidx.media3.common.p1)
     binds: [B:35:0x00af, B:37:0x00b3, B:39:0x00c4, B:41:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void resetInternal(boolean z7, boolean z8, boolean z9, boolean z10) {
        Renderer[] rendererArr;
        boolean z11;
        AbstractC0230p1 abstractC0230p1;
        MediaSource.MediaPeriodId mediaPeriodId;
        List list;
        ((C1104b0) this.handler).m2383f(2);
        this.pendingRecoverableRendererError = null;
        updateRebufferingState(false, true);
        this.mediaClock.stop();
        this.rendererPositionUs = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        int i = 0;
        while (true) {
            rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                break;
            }
            try {
                disableRenderer(i);
            } catch (ExoPlaybackException | RuntimeException e) {
                AbstractC1101a.m2365p(TAG, "Disable failed.", e);
            }
            i++;
        }
        if (z7) {
            for (Renderer renderer : rendererArr) {
                if (this.renderersToReset.remove(renderer)) {
                    try {
                        renderer.reset();
                    } catch (RuntimeException e8) {
                        AbstractC1101a.m2365p(TAG, "Reset failed.", e8);
                    }
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        long jLongValue = playbackInfo.positionUs;
        long j = (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) ? this.playbackInfo.requestedContentPositionUs : this.playbackInfo.positionUs;
        if (z8) {
            this.pendingInitialSeekPosition = null;
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            mediaPeriodId2 = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            j = -9223372036854775807L;
            z11 = mediaPeriodId2.equals(this.playbackInfo.periodId) ? false : true;
        }
        long j8 = jLongValue;
        long j9 = j;
        this.queue.clear();
        this.shouldContinueLoading = false;
        AbstractC0230p1 abstractC0230p1CopyWithPlaceholderTimeline = this.playbackInfo.timeline;
        if (z9 && (abstractC0230p1CopyWithPlaceholderTimeline instanceof PlaylistTimeline)) {
            abstractC0230p1CopyWithPlaceholderTimeline = ((PlaylistTimeline) abstractC0230p1CopyWithPlaceholderTimeline).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
            if (mediaPeriodId2.adGroupIndex != -1) {
                abstractC0230p1CopyWithPlaceholderTimeline.getPeriodByUid(mediaPeriodId2.periodUid, this.period);
                if (abstractC0230p1CopyWithPlaceholderTimeline.getWindow(this.period.f1206c, this.window).m654a()) {
                    abstractC0230p1 = abstractC0230p1CopyWithPlaceholderTimeline;
                    mediaPeriodId = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber);
                }
            }
        } else {
            abstractC0230p1 = abstractC0230p1CopyWithPlaceholderTimeline;
            mediaPeriodId = mediaPeriodId2;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        int i4 = playbackInfo2.playbackState;
        ExoPlaybackException exoPlaybackException = z10 ? null : playbackInfo2.playbackError;
        TrackGroupArray trackGroupArray = z11 ? TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
        TrackSelectorResult trackSelectorResult = z11 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
        if (z11) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            list = C0981l1.f4211n;
        } else {
            list = playbackInfo2.staticMetadata;
        }
        this.playbackInfo = new PlaybackInfo(abstractC0230p1, mediaPeriodId, j9, j8, i4, exoPlaybackException, false, trackGroupArray, trackSelectorResult, list, mediaPeriodId, playbackInfo2.playWhenReady, playbackInfo2.playWhenReadyChangeReason, playbackInfo2.playbackSuppressionReason, playbackInfo2.playbackParameters, j8, 0L, j8, 0L, false);
        if (z9) {
            this.queue.releasePreloadPool();
            this.mediaSourceList.release();
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j) {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(AbstractC0230p1 abstractC0230p1, PendingMessageInfo pendingMessageInfo, C0227o1 c0227o1, C0221m1 c0221m1) {
        int i = abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, c0221m1).f1206c, c0227o1).f1274o;
        Object obj = abstractC0230p1.getPeriod(i, c0221m1, true).f1205b;
        long j = c0221m1.f1207d;
        pendingMessageInfo.setResolvedPosition(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, AbstractC0230p1 abstractC0230p1, AbstractC0230p1 abstractC0230p12, int i, boolean z7, C0227o1 c0227o1, C0221m1 c0221m1) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(abstractC0230p1, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : AbstractC1118i0.m2428S(pendingMessageInfo.message.getPositionMs())), false, i, z7, c0227o1, c0221m1);
            if (pairResolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(abstractC0230p1.getIndexOfPeriod(pairResolveSeekPositionUs.first), ((Long) pairResolveSeekPositionUs.second).longValue(), pairResolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(abstractC0230p1, pendingMessageInfo, c0227o1, c0221m1);
            }
            return true;
        }
        int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(abstractC0230p1, pendingMessageInfo, c0227o1, c0221m1);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        abstractC0230p12.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, c0221m1);
        if (c0221m1.f1209f && abstractC0230p12.getWindow(c0221m1.f1206c, c0227o1).f1273n == abstractC0230p12.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m1, abstractC0230p1.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, c0221m1).f1206c, pendingMessageInfo.resolvedPeriodTimeUs + c0221m1.f1208e);
            pendingMessageInfo.setResolvedPosition(abstractC0230p1.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(AbstractC0230p1 abstractC0230p1, AbstractC0230p1 abstractC0230p12) {
        if (abstractC0230p1.isEmpty() && abstractC0230p12.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (size >= 0) {
            AbstractC0230p1 abstractC0230p13 = abstractC0230p1;
            AbstractC0230p1 abstractC0230p14 = abstractC0230p12;
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), abstractC0230p13, abstractC0230p14, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            abstractC0230p1 = abstractC0230p13;
            abstractC0230p12 = abstractC0230p14;
        }
        Collections.sort(this.pendingMessages);
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(AbstractC0230p1 abstractC0230p1, PlaybackInfo playbackInfo, SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i, boolean z7, C0227o1 c0227o1, C0221m1 c0221m1) {
        int i4;
        long j;
        long jLongValue;
        int firstWindowIndex;
        long jLongValue2;
        boolean z8;
        boolean z9;
        boolean z10;
        int firstWindowIndex2;
        boolean z11;
        AbstractC0230p1 abstractC0230p12;
        C0221m1 c0221m12;
        long j8;
        int i8;
        long jLongValue3;
        int firstWindowIndex3;
        boolean z12;
        boolean z13;
        boolean z14;
        if (abstractC0230p1.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, -9223372036854775807L, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Object obj = mediaPeriodId.periodUid;
        boolean zIsUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, c0221m1);
        long j9 = (playbackInfo.periodId.isAd() || zIsUsingPlaceholderPeriod) ? playbackInfo.requestedContentPositionUs : playbackInfo.positionUs;
        if (seekPosition != null) {
            i4 = -1;
            j = -9223372036854775807L;
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(abstractC0230p1, seekPosition, true, i, z7, c0227o1, c0221m1);
            if (pairResolveSeekPositionUs == null) {
                firstWindowIndex3 = abstractC0230p1.getFirstWindowIndex(z7);
                jLongValue3 = j9;
                z12 = false;
                z13 = false;
                z14 = true;
            } else {
                if (seekPosition.windowPositionUs == -9223372036854775807L) {
                    firstWindowIndex3 = abstractC0230p1.getPeriodByUid(pairResolveSeekPositionUs.first, c0221m1).f1206c;
                    jLongValue3 = j9;
                    z12 = false;
                } else {
                    obj = pairResolveSeekPositionUs.first;
                    jLongValue3 = ((Long) pairResolveSeekPositionUs.second).longValue();
                    firstWindowIndex3 = -1;
                    z12 = true;
                }
                z13 = playbackInfo.playbackState == 4;
                z14 = false;
            }
            firstWindowIndex = firstWindowIndex3;
            jLongValue = jLongValue3;
            z10 = z12;
            z8 = z13;
            z9 = z14;
        } else {
            i4 = -1;
            j = -9223372036854775807L;
            if (playbackInfo.timeline.isEmpty()) {
                firstWindowIndex = abstractC0230p1.getFirstWindowIndex(z7);
            } else if (abstractC0230p1.getIndexOfPeriod(obj) == -1) {
                int iResolveSubsequentPeriod = resolveSubsequentPeriod(c0227o1, c0221m1, i, z7, obj, playbackInfo.timeline, abstractC0230p1);
                if (iResolveSubsequentPeriod == -1) {
                    firstWindowIndex2 = abstractC0230p1.getFirstWindowIndex(z7);
                    z11 = true;
                } else {
                    firstWindowIndex2 = iResolveSubsequentPeriod;
                    z11 = false;
                }
                firstWindowIndex = firstWindowIndex2;
                obj = obj;
                jLongValue = j9;
                z9 = z11;
                z8 = false;
                z10 = false;
            } else if (j9 == -9223372036854775807L) {
                firstWindowIndex = abstractC0230p1.getPeriodByUid(obj, c0221m1).f1206c;
                obj = obj;
            } else if (zIsUsingPlaceholderPeriod) {
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, c0221m1);
                if (playbackInfo.timeline.getWindow(c0221m1.f1206c, c0227o1).f1273n == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m1, abstractC0230p1.getPeriodByUid(obj, c0221m1).f1206c, c0221m1.f1208e + j9);
                    obj = periodPositionUs.first;
                    jLongValue2 = ((Long) periodPositionUs.second).longValue();
                } else {
                    obj = obj;
                    jLongValue2 = j9;
                }
                jLongValue = jLongValue2;
                firstWindowIndex = -1;
                z8 = false;
                z9 = false;
                z10 = true;
            } else {
                obj = obj;
                jLongValue = j9;
                firstWindowIndex = -1;
                z8 = false;
                z9 = false;
                z10 = false;
            }
            jLongValue = j9;
            z8 = false;
            z9 = false;
            z10 = false;
        }
        if (firstWindowIndex != i4) {
            c0221m12 = c0221m1;
            Pair<Object, Long> periodPositionUs2 = abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m12, firstWindowIndex, -9223372036854775807L);
            abstractC0230p12 = abstractC0230p1;
            obj = periodPositionUs2.first;
            jLongValue = ((Long) periodPositionUs2.second).longValue();
            j8 = j;
        } else {
            abstractC0230p12 = abstractC0230p1;
            c0221m12 = c0221m1;
            j8 = jLongValue;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(abstractC0230p12, obj, jLongValue);
        int i9 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z15 = mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && (i9 == i4 || ((i8 = mediaPeriodId.nextAdGroupIndex) != i4 && i9 >= i8));
        long j10 = j8;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        boolean zIsIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(zIsUsingPlaceholderPeriod, mediaPeriodId, j9, mediaPeriodId2, abstractC0230p12.getPeriodByUid(obj, c0221m12), j10);
        if (z15 || zIsIgnorableServerSideAdInsertionPeriodChange) {
            mediaPeriodId2 = mediaPeriodId;
        }
        if (mediaPeriodId2.isAd()) {
            if (mediaPeriodId2.equals(mediaPeriodId)) {
                jLongValue = playbackInfo.positionUs;
            } else {
                abstractC0230p12.getPeriodByUid(mediaPeriodId2.periodUid, c0221m12);
                jLongValue = mediaPeriodId2.adIndexInAdGroup == c0221m12.m641f(mediaPeriodId2.adGroupIndex) ? c0221m12.f1210g.f1052c : 0L;
            }
        }
        return new PositionUpdateForPlaylistChange(mediaPeriodId2, jLongValue, j10, z8, z9, z10);
    }

    private static Pair<Object, Long> resolveSeekPositionUs(AbstractC0230p1 abstractC0230p1, SeekPosition seekPosition, boolean z7, int i, boolean z8, C0227o1 c0227o1, C0221m1 c0221m1) {
        Pair<Object, Long> periodPositionUs;
        AbstractC0230p1 abstractC0230p12;
        int iResolveSubsequentPeriod;
        AbstractC0230p1 abstractC0230p13 = seekPosition.timeline;
        if (abstractC0230p1.isEmpty()) {
            return null;
        }
        if (abstractC0230p13.isEmpty()) {
            abstractC0230p13 = abstractC0230p1;
        }
        try {
            periodPositionUs = abstractC0230p13.getPeriodPositionUs(c0227o1, c0221m1, seekPosition.windowIndex, seekPosition.windowPositionUs);
            abstractC0230p12 = abstractC0230p13;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC0230p1.equals(abstractC0230p12)) {
            return periodPositionUs;
        }
        if (abstractC0230p1.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (abstractC0230p12.getPeriodByUid(periodPositionUs.first, c0221m1).f1209f && abstractC0230p12.getWindow(c0221m1.f1206c, c0227o1).f1273n == abstractC0230p12.getIndexOfPeriod(periodPositionUs.first)) ? abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m1, abstractC0230p1.getPeriodByUid(periodPositionUs.first, c0221m1).f1206c, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z7 && (iResolveSubsequentPeriod = resolveSubsequentPeriod(c0227o1, c0221m1, i, z8, periodPositionUs.first, abstractC0230p12, abstractC0230p1)) != -1) {
            return abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m1, iResolveSubsequentPeriod, -9223372036854775807L);
        }
        return null;
    }

    public static int resolveSubsequentPeriod(C0227o1 c0227o1, C0221m1 c0221m1, int i, boolean z7, Object obj, AbstractC0230p1 abstractC0230p1, AbstractC0230p1 abstractC0230p12) {
        C0221m1 c0221m12;
        Object obj2 = abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(obj, c0221m1).f1206c, c0227o1).f1260a;
        int i4 = 0;
        for (int i8 = 0; i8 < abstractC0230p12.getWindowCount(); i8++) {
            if (abstractC0230p12.getWindow(i8, c0227o1).f1260a.equals(obj2)) {
                return i8;
            }
        }
        int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(obj);
        int periodCount = abstractC0230p1.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i4 < periodCount && indexOfPeriod2 == -1) {
            C0227o1 c0227o12 = c0227o1;
            c0221m12 = c0221m1;
            int i9 = i;
            boolean z8 = z7;
            AbstractC0230p1 abstractC0230p13 = abstractC0230p1;
            nextPeriodIndex = abstractC0230p13.getNextPeriodIndex(nextPeriodIndex, c0221m12, c0227o12, i9, z8);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = abstractC0230p12.getIndexOfPeriod(abstractC0230p13.getUidOfPeriod(nextPeriodIndex));
            i4++;
            abstractC0230p1 = abstractC0230p13;
            c0221m1 = c0221m12;
            c0227o1 = c0227o12;
            i = i9;
            z7 = z8;
        }
        c0221m12 = c0221m1;
        if (indexOfPeriod2 == -1) {
            return -1;
        }
        return abstractC0230p12.getPeriod(indexOfPeriod2, c0221m12).f1206c;
    }

    private void scheduleNextWork(long j) {
        long jMin = (this.playbackInfo.playbackState != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (Renderer renderer : this.renderers) {
                if (isRendererEnabled(renderer)) {
                    jMin = Math.min(jMin, AbstractC1118i0.m2447f0(renderer.getDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
                }
            }
        }
        ((C1104b0) this.handler).f4715a.sendEmptyMessageAtTime(2, j + jMin);
    }

    private void seekToCurrentPosition(boolean z7) {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f1558id;
        long jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (jSeekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z7, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        long j;
        boolean z7;
        long j8;
        boolean z8;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j9;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long adjustedSeekPositionUs;
        PlaybackInfo playbackInfo;
        int i;
        int i4;
        long j10;
        MediaSource.MediaPeriodId mediaPeriodId3;
        long j11;
        long jSeekToPeriodPosition;
        PlaybackInfo playbackInfo2;
        AbstractC0230p1 abstractC0230p1;
        MediaSource.MediaPeriodId mediaPeriodId4;
        long j12;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        try {
            if (pairResolveSeekPositionUs == null) {
                Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
                mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                z7 = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
                j8 = -9223372036854775807L;
            } else {
                Object obj = pairResolveSeekPositionUs.first;
                jLongValue = ((Long) pairResolveSeekPositionUs.second).longValue();
                long j13 = seekPosition.windowPositionUs == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = exoPlayerImplInternal.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(exoPlayerImplInternal.playbackInfo.timeline, obj, jLongValue);
                if (!mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                    j = 0;
                    z7 = seekPosition.windowPositionUs == -9223372036854775807L;
                    j8 = j13;
                    if (!exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                        exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
                    } else if (pairResolveSeekPositionUs == null) {
                        if (exoPlayerImplInternal.playbackInfo.playbackState != 1) {
                            exoPlayerImplInternal.setState(4);
                        }
                        exoPlayerImplInternal.resetInternal(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(exoPlayerImplInternal.playbackInfo.periodId)) {
                                        try {
                                            MediaPeriodHolder playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                                            adjustedSeekPositionUs = (playingPeriod == null || !playingPeriod.prepared || jLongValue == j) ? jLongValue : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(jLongValue, exoPlayerImplInternal.seekParameters);
                                            mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                            try {
                                                if (AbstractC1118i0.m2447f0(adjustedSeekPositionUs) != AbstractC1118i0.m2447f0(exoPlayerImplInternal.playbackInfo.positionUs) || ((i = (playbackInfo = exoPlayerImplInternal.playbackInfo).playbackState) != 2 && i != 3)) {
                                                    z8 = z7;
                                                }
                                                long j14 = playbackInfo.positionUs;
                                                i4 = 2;
                                                z8 = z7;
                                                j10 = j14;
                                                mediaPeriodId3 = mediaPeriodId2;
                                                j11 = j14;
                                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, j8, j10, z8, i4);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                z8 = z7;
                                                mediaPeriodId = mediaPeriodId2;
                                                j9 = jLongValue;
                                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, j8, j9, z8, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z8 = z7;
                                            mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                        }
                                    } else {
                                        z8 = z7;
                                        mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                        adjustedSeekPositionUs = jLongValue;
                                    }
                                    exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(abstractC0230p1, mediaPeriodId4, abstractC0230p1, playbackInfo2.periodId, j12, true);
                                    mediaPeriodId3 = mediaPeriodId4;
                                    j8 = j12;
                                    j11 = jSeekToPeriodPosition;
                                    i4 = 2;
                                    j10 = j11;
                                    exoPlayerImplInternal = this;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, j8, j10, z8, i4);
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mediaPeriodId = mediaPeriodId4;
                                    j8 = j12;
                                    j9 = jSeekToPeriodPosition;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, j8, j9, z8, 2);
                                    throw th;
                                }
                                playbackInfo2 = exoPlayerImplInternal.playbackInfo;
                                abstractC0230p1 = playbackInfo2.timeline;
                                mediaPeriodId4 = mediaPeriodId2;
                                j12 = j8;
                            } catch (Throwable th4) {
                                th = th4;
                                mediaPeriodId = mediaPeriodId2;
                            }
                            jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodId2, adjustedSeekPositionUs, exoPlayerImplInternal.playbackInfo.playbackState == 4);
                            z8 |= jLongValue != jSeekToPeriodPosition;
                        } catch (Throwable th5) {
                            th = th5;
                            mediaPeriodId = mediaPeriodId2;
                            j9 = jLongValue;
                            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, j8, j9, z8, 2);
                            throw th;
                        }
                    }
                    z8 = z7;
                    mediaPeriodId3 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                    j11 = jLongValue;
                    i4 = 2;
                    j10 = j11;
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, j8, j10, z8, i4);
                    return;
                }
                exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                jLongValue = exoPlayerImplInternal.period.m641f(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? exoPlayerImplInternal.period.f1210g.f1052c : 0L;
                z7 = true;
                j8 = j13;
            }
            if (!exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
            }
            z8 = z7;
            mediaPeriodId3 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
            j11 = jLongValue;
            i4 = 2;
            j10 = j11;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, j8, j10, z8, i4);
            return;
        } catch (Throwable th6) {
            th = th6;
            z8 = z7;
            mediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        }
        j = 0;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z7) {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z7);
    }

    private void sendMessageInternal(PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        AbstractC0230p1 abstractC0230p1 = this.playbackInfo.timeline;
        if (!resolvePendingMessagePosition(pendingMessageInfo, abstractC0230p1, abstractC0230p1, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) {
        if (playerMessage.getLooper() != this.playbackLooper) {
            ((C1104b0) this.handler).m2381c(15, playerMessage).m2377b();
            return;
        }
        deliverMessage(playerMessage);
        int i = this.playbackInfo.playbackState;
        if (i == 3 || i == 2) {
            ((C1104b0) this.handler).m2384g(2);
        }
    }

    private void sendMessageToTargetThread(PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (looper.getThread().isAlive()) {
            ((C1135z) this.clock).m2541a(looper, null).m2382e(new RunnableC0414s(this, 1, playerMessage));
        } else {
            AbstractC1101a.m2348F("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void setAllRendererStreamsFinal(long j) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j);
            }
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void setForegroundModeInternal(boolean z7, AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z7) {
            this.foregroundMode = z7;
            if (!z7) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer) && this.renderersToReset.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaClockPlaybackParameters(C0256y0 c0256y0) {
        ((C1104b0) this.handler).m2383f(16);
        this.mediaClock.setPlaybackParameters(c0256y0);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabled(boolean z7) {
        if (z7 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z7;
        if (z7 || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        ((C1104b0) this.handler).m2384g(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z7) {
        this.pauseAtEndOfWindow = z7;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z7, int i, boolean z8, int i4) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z8 ? 1 : 0);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z7, i4, i);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z7);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i8 = this.playbackInfo.playbackState;
        if (i8 == 3) {
            this.mediaClock.start();
            startRenderers();
            ((C1104b0) this.handler).m2384g(2);
        } else if (i8 == 2) {
            ((C1104b0) this.handler).m2384g(2);
        }
    }

    private void setPlaybackParametersInternal(C0256y0 c0256y0) {
        setMediaClockPlaybackParameters(c0256y0);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void setRepeatModeInternal(int i) {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z7) {
        this.shuffleModeEnabled = z7;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z7)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        LoadControl.Parameters parameters = new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.f1558id, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().f1549a, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.f1558id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L);
        boolean zShouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (zShouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return zShouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return zShouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z7) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z8 = false;
        if (!z7) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.f1558id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z9 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.f1558id.isAd() && !loadingPeriod.prepared) {
            z8 = true;
        }
        if (z9 || z8) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.f1558id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().f1549a, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs));
    }

    private boolean shouldUseLivePlaybackSpeedControl(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !abstractC0230p1.isEmpty()) {
            abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period).f1206c, this.window);
            if (this.window.m654a()) {
                C0227o1 c0227o1 = this.window;
                if (c0227o1.f1268i && c0227o1.f1265f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i) && this.renderers[i].getState() == 1) {
                this.renderers[i].start();
            }
        }
    }

    private void stopInternal(boolean z7, boolean z8) {
        resetInternal(z7 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z8 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        setState(1);
    }

    private void stopRenderers() {
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z7 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z7 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z7);
        }
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        loadingPeriod.getClass();
        this.loadControl.onTracksSelected(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().f1549a, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.f1558id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L), trackGroupArray, trackSelectorResult.selections);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i4, List<C0226o0> list) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i, i4, list), false);
    }

    private void updatePeriods() {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean zMaybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(zMaybeUpdateLoadingPeriod);
    }

    private void updatePlaybackPositions() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(discontinuity);
            if (discontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                long j = discontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j, playbackInfo.requestedContentPositionUs, j, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z7 = !this.playbackInfoUpdate.positionDiscontinuity;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z7, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.f1549a == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().f1549a != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(new C0256y0(adjustedPlaybackSpeed, this.playbackInfo.playbackParameters.f1550b));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().f1549a, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p12, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z7) {
        if (!shouldUseLivePlaybackSpeedControl(abstractC0230p1, mediaPeriodId)) {
            C0256y0 c0256y0 = mediaPeriodId.isAd() ? C0256y0.f1548d : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(c0256y0)) {
                return;
            }
            setMediaClockPlaybackParameters(c0256y0);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, c0256y0.f1549a, false, false);
            return;
        }
        abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period).f1206c, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration(this.window.f1269j);
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(abstractC0230p1, mediaPeriodId.periodUid, j));
            return;
        }
        if (!Objects.equals(!abstractC0230p12.isEmpty() ? abstractC0230p12.getWindow(abstractC0230p12.getPeriodByUid(mediaPeriodId2.periodUid, this.period).f1206c, this.window).f1260a : null, this.window.f1260a) || z7) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private void updateRebufferingState(boolean z7, boolean z8) {
        long jElapsedRealtime;
        this.isRebuffering = z7;
        if (!z7 || z8) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            ((C1135z) this.clock).getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.lastRebufferRealtimeMs = jElapsedRealtime;
    }

    private void updateTrackSelectionPlaybackSpeed(float f8) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f8);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(InterfaceC0921i interfaceC0921i, long j) {
        ((C1135z) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z7 = false;
        while (!((Boolean) interfaceC0921i.get()).booleanValue() && j > 0) {
            try {
                this.clock.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            ((C1135z) this.clock).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        InterfaceC1120k interfaceC1120k = this.handler;
        MediaSourceListUpdateMessage mediaSourceListUpdateMessage = new MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L);
        C1104b0 c1104b0 = (C1104b0) interfaceC1120k;
        c1104b0.getClass();
        C1102a0 c1102a0M2378d = C1104b0.m2378d();
        c1102a0M2378d.f4712a = c1104b0.f4715a.obtainMessage(18, i, 0, mediaSourceListUpdateMessage);
        c1102a0M2378d.m2377b();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        MediaPeriodHolder readingPeriod;
        int i4;
        try {
            switch (message.what) {
                case 1:
                    boolean z7 = message.arg1 != 0;
                    int i8 = message.arg2;
                    setPlayWhenReadyInternal(z7, i8 >> 4, true, i8 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((C0256y0) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((C0256y0) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
            }
        } catch (C0247v0 e) {
            int i9 = e.dataType;
            if (i9 == 1) {
                i4 = e.contentIsMalformed ? C0253x0.ERROR_CODE_PARSING_CONTAINER_MALFORMED : C0253x0.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED;
            } else {
                if (i9 == 4) {
                    i4 = e.contentIsMalformed ? C0253x0.ERROR_CODE_PARSING_MANIFEST_MALFORMED : C0253x0.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;
                }
                handleIoException(e, i);
            }
            i = i4;
            handleIoException(e, i);
        } catch (ExoPlaybackException e8) {
            e = e8;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.f1558id);
            }
            if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i = e.errorCode) == 5004 || i == 5003)) {
                AbstractC1101a.m2349G(TAG, "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                } else {
                    this.pendingRecoverableRendererError = e;
                }
                C1104b0 c1104b0 = (C1104b0) this.handler;
                C1102a0 c1102a0M2381c = c1104b0.m2381c(25, e);
                Handler handler = c1104b0.f4715a;
                Message message2 = c1102a0M2381c.f4712a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                c1102a0M2381c.m2376a();
            } else {
                ExoPlaybackException exoPlaybackException2 = this.pendingRecoverableRendererError;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                AbstractC1101a.m2365p(TAG, "Playback error", e);
                if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                        this.queue.advancePlayingPeriod();
                    }
                    MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                    playingPeriod.getClass();
                    maybeNotifyPlaybackInfoChanged();
                    MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                    MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f1558id;
                    long j = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
                }
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (DrmSession.DrmSessionException e9) {
            handleIoException(e9, e9.errorCode);
        } catch (BehindLiveWindowException e10) {
            handleIoException(e10, 1002);
        } catch (C1565i e11) {
            handleIoException(e11, e11.f5981j);
        } catch (IOException e12) {
            handleIoException(e12, 2000);
        } catch (RuntimeException e13) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1101a.m2365p(TAG, "Playback error", exoPlaybackExceptionCreateForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i, int i4, int i8, ShuffleOrder shuffleOrder) {
        ((C1104b0) this.handler).m2381c(19, new MoveMediaItemsMessage(i, i4, i8, shuffleOrder)).m2377b();
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(C0256y0 c0256y0) {
        ((C1104b0) this.handler).m2381c(16, c0256y0).m2377b();
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        ((C1104b0) this.handler).m2383f(2);
        ((C1104b0) this.handler).m2384g(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((C1104b0) this.handler).m2381c(8, mediaPeriod).m2377b();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        ((C1104b0) this.handler).m2384g(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        ((C1104b0) this.handler).m2384g(10);
    }

    public void prepare() {
        ((C1104b0) this.handler).m2379a(29).m2377b();
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            ((C1104b0) this.handler).m2384g(7);
            waitUninterruptibly(new C0507w(0, this), this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    public void removeMediaSources(int i, int i4, ShuffleOrder shuffleOrder) {
        C1104b0 c1104b0 = (C1104b0) this.handler;
        c1104b0.getClass();
        C1102a0 c1102a0M2378d = C1104b0.m2378d();
        c1102a0M2378d.f4712a = c1104b0.f4715a.obtainMessage(20, i, i4, shuffleOrder);
        c1102a0M2378d.m2377b();
    }

    public void seekTo(AbstractC0230p1 abstractC0230p1, int i, long j) {
        ((C1104b0) this.handler).m2381c(3, new SeekPosition(abstractC0230p1, i, j)).m2377b();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            ((C1104b0) this.handler).m2381c(14, playerMessage).m2377b();
            return;
        }
        AbstractC1101a.m2348F(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z7) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z7) {
                ((C1104b0) this.handler).m2380b(13, 1, 0).m2377b();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            C1104b0 c1104b0 = (C1104b0) this.handler;
            c1104b0.getClass();
            C1102a0 c1102a0M2378d = C1104b0.m2378d();
            c1102a0M2378d.f4712a = c1104b0.f4715a.obtainMessage(13, 0, 0, atomicBoolean);
            c1102a0M2378d.m2377b();
            waitUninterruptibly(new C0507w(1, atomicBoolean), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
        ((C1104b0) this.handler).m2381c(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).m2377b();
    }

    public void setPauseAtEndOfWindow(boolean z7) {
        ((C1104b0) this.handler).m2380b(23, z7 ? 1 : 0, 0).m2377b();
    }

    public void setPlayWhenReady(boolean z7, int i, int i4) {
        ((C1104b0) this.handler).m2380b(1, z7 ? 1 : 0, i | (i4 << 4)).m2377b();
    }

    public void setPlaybackParameters(C0256y0 c0256y0) {
        ((C1104b0) this.handler).m2381c(4, c0256y0).m2377b();
    }

    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        ((C1104b0) this.handler).m2381c(28, preloadConfiguration).m2377b();
    }

    public void setRepeatMode(int i) {
        ((C1104b0) this.handler).m2380b(11, i, 0).m2377b();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        ((C1104b0) this.handler).m2381c(5, seekParameters).m2377b();
    }

    public void setShuffleModeEnabled(boolean z7) {
        ((C1104b0) this.handler).m2380b(12, z7 ? 1 : 0, 0).m2377b();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        ((C1104b0) this.handler).m2381c(21, shuffleOrder).m2377b();
    }

    public void stop() {
        ((C1104b0) this.handler).m2379a(6).m2377b();
    }

    public void updateMediaSourcesWithMediaItems(int i, int i4, List<C0226o0> list) {
        C1104b0 c1104b0 = (C1104b0) this.handler;
        c1104b0.getClass();
        C1102a0 c1102a0M2378d = C1104b0.m2378d();
        c1102a0M2378d.f4712a = c1104b0.f4715a.obtainMessage(27, i, i4, list);
        c1102a0M2378d.m2377b();
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handlePlaybackParameters(C0256y0 c0256y0, float f8, boolean z7, boolean z8) {
        if (z7) {
            if (z8) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(c0256y0);
        }
        updateTrackSelectionPlaybackSpeed(c0256y0.f1549a);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f8, c0256y0.f1549a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((C1104b0) this.handler).m2381c(9, mediaPeriod).m2377b();
    }

    private void enableRenderers(boolean[] zArr, long j) {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i) && this.renderersToReset.remove(this.renderers[i])) {
                this.renderers[i].reset();
            }
        }
        for (int i4 = 0; i4 < this.renderers.length; i4++) {
            if (trackSelectorResult.isRendererEnabled(i4)) {
                enableRenderer(i4, zArr[i4], j);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z7, boolean z8) {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z8 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder next = playingPeriod;
        while (next != null && !mediaPeriodId.equals(next.info.f1558id)) {
            next = next.getNext();
        }
        if (z7 || playingPeriod != next || (next != null && next.toRendererTime(j) < 0)) {
            for (int i = 0; i < this.renderers.length; i++) {
                disableRenderer(i);
            }
            if (next != null) {
                while (this.queue.getPlayingPeriod() != next) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(next);
                next.setRendererOffset(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                enableRenderers();
            }
        }
        if (next != null) {
            this.queue.removeAfter(next);
            if (!next.prepared) {
                next.info = next.info.copyWithStartPositionUs(j);
            } else if (next.hasEnabledTracks) {
                j = next.mediaPeriod.seekToUs(j);
                next.mediaPeriod.discardBuffer(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        ((C1104b0) this.handler).m2384g(2);
        return j;
    }
}
