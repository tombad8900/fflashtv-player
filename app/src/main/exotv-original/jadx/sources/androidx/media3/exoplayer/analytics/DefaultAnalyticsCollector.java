package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0120b;
import android.util.SparseArray;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0171a1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0222n;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0243u;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C0992p0;
import p052f6.C0996q1;
import p056g1.C1029b;
import p056g1.C1030c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1104b0;
import p063h1.C1125p;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1120k;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final InterfaceC1103b clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private InterfaceC1120k handler;
    private boolean isSeeking;
    private C1125p listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final C0221m1 period;
    private InterfaceC0193d1 player;
    private final C0227o1 window;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private AbstractC0983m0 mediaPeriodQueue;
        private AbstractC0995q0 mediaPeriodTimelines;
        private final C0221m1 period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(C0221m1 c0221m1) {
            this.period = c0221m1;
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            this.mediaPeriodQueue = C0981l1.f4211n;
            this.mediaPeriodTimelines = C0996q1.f4246p;
        }

        private void addTimelineForMediaPeriodId(C0992p0 c0992p0, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1) {
            if (mediaPeriodId == null) {
                return;
            }
            if (abstractC0230p1.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                c0992p0.m2180b(mediaPeriodId, abstractC0230p1);
                return;
            }
            AbstractC0230p1 abstractC0230p12 = (AbstractC0230p1) this.mediaPeriodTimelines.get(mediaPeriodId);
            if (abstractC0230p12 != null) {
                c0992p0.m2180b(mediaPeriodId, abstractC0230p12);
            }
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(InterfaceC0193d1 interfaceC0193d1, AbstractC0983m0 abstractC0983m0, MediaSource.MediaPeriodId mediaPeriodId, C0221m1 c0221m1) {
            AbstractC0230p1 currentTimeline = interfaceC0193d1.getCurrentTimeline();
            int currentPeriodIndex = interfaceC0193d1.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int iM637b = (interfaceC0193d1.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, c0221m1).m637b(AbstractC1118i0.m2428S(interfaceC0193d1.getCurrentPosition()) - c0221m1.f1208e);
            for (int i = 0; i < abstractC0983m0.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) abstractC0983m0.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, interfaceC0193d1.isPlayingAd(), interfaceC0193d1.getCurrentAdGroupIndex(), interfaceC0193d1.getCurrentAdIndexInAdGroup(), iM637b)) {
                    return mediaPeriodId2;
                }
            }
            if (abstractC0983m0.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, interfaceC0193d1.isPlayingAd(), interfaceC0193d1.getCurrentAdGroupIndex(), interfaceC0193d1.getCurrentAdIndexInAdGroup(), iM637b)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z7, int i, int i4, int i8) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z7 && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i4) {
                return true;
            }
            return !z7 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i8;
        }

        private void updateMediaPeriodTimelines(AbstractC0230p1 abstractC0230p1) {
            C0992p0 c0992p0 = new C0992p0(4);
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(c0992p0, this.playingMediaPeriod, abstractC0230p1);
                if (!AbstractC0120b.m422r(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c0992p0, this.readingMediaPeriod, abstractC0230p1);
                }
                if (!AbstractC0120b.m422r(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !AbstractC0120b.m422r(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c0992p0, this.currentPlayerMediaPeriod, abstractC0230p1);
                }
            } else {
                for (int i = 0; i < this.mediaPeriodQueue.size(); i++) {
                    addTimelineForMediaPeriodId(c0992p0, (MediaSource.MediaPeriodId) this.mediaPeriodQueue.get(i), abstractC0230p1);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(c0992p0, this.currentPlayerMediaPeriod, abstractC0230p1);
                }
            }
            this.mediaPeriodTimelines = c0992p0.m2179a();
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) AbstractC1006u.m2194i(this.mediaPeriodQueue);
        }

        public AbstractC0230p1 getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return (AbstractC0230p1) this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(InterfaceC0193d1 interfaceC0193d1) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(interfaceC0193d1, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, InterfaceC0193d1 interfaceC0193d1) {
            this.mediaPeriodQueue = AbstractC0983m0.m2165j(list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                mediaPeriodId.getClass();
                this.readingMediaPeriod = mediaPeriodId;
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(interfaceC0193d1, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(interfaceC0193d1.getCurrentTimeline());
        }

        public void onTimelineChanged(InterfaceC0193d1 interfaceC0193d1) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(interfaceC0193d1, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(interfaceC0193d1.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(InterfaceC1103b interfaceC1103b) {
        interfaceC1103b.getClass();
        this.clock = interfaceC1103b;
        int i = AbstractC1118i0.f4750a;
        Looper looperMyLooper = Looper.myLooper();
        this.listeners = new C1125p(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC1103b, new C0222n(9));
        C0221m1 c0221m1 = new C0221m1();
        this.period = c0221m1;
        this.window = new C0227o1();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(c0221m1);
        this.eventTimes = new SparseArray<>();
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(AbstractC0230p1.EMPTY, i, mediaPeriodId);
        }
        AbstractC0230p1 currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = AbstractC0230p1.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(C0253x0 c0253x0) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(c0253x0 instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) c0253x0).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, C0243u c0243u) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$5(AnalyticsListener.EventTime eventTime, String str, long j, long j8, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j8, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$64(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$35(AnalyticsListener.EventTime eventTime, boolean z7, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z7);
        analyticsListener.onIsLoadingChanged(eventTime, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$46(AnalyticsListener.EventTime eventTime, int i, C0189c1 c0189c1, C0189c1 c0189c12, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, c0189c1, c0189c12, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$17(AnalyticsListener.EventTime eventTime, String str, long j, long j8, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j8, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$59(AnalyticsListener.EventTime eventTime, C0194d2 c0194d2, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, c0194d2);
        analyticsListener.onVideoSizeChanged(eventTime, c0194d2.f1086a, c0194d2.f1087b, 0, c0194d2.f1088c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener analyticsListener, C0243u c0243u) {
        analyticsListener.onEvents(interfaceC0193d1, new AnalyticsListener.Events(c0243u, this.eventTimes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_PLAYER_RELEASED, new C0280b(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0));
        this.listeners.m2472d();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void addListener(AnalyticsListener analyticsListener) {
        analyticsListener.getClass();
        this.listeners.m2469a(analyticsListener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(AbstractC0230p1 abstractC0230p1, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = abstractC0230p1.isEmpty() ? null : mediaPeriodId;
        ((C1135z) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z7 = abstractC0230p1.equals(this.player.getCurrentTimeline()) && i == this.player.getCurrentMediaItemIndex();
        long jM2447f0 = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z7) {
                jM2447f0 = this.player.getContentPosition();
            } else if (!abstractC0230p1.isEmpty()) {
                jM2447f0 = AbstractC1118i0.m2447f0(abstractC0230p1.getWindow(i, this.window).f1271l);
            }
        } else if (z7 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            jM2447f0 = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, abstractC0230p1, i, mediaPeriodId2, jM2447f0, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new C0280b(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onAudioAttributesChanged(C0201g c0201g) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new C0279a(eventTimeGenerateReadingMediaPeriodEventTime, 3, c0201g));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new C0290l(eventTimeGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j8) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new C0293o(eventTimeGenerateReadingMediaPeriodEventTime, str, j8, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new C0284f(eventTimeGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DISABLED, new C0281c(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_ENABLED, new C0281c(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new C0298t(eventTimeGenerateReadingMediaPeriodEventTime, c0249w, decoderReuseEvaluation, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long j) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new C0282d(eventTimeGenerateReadingMediaPeriodEventTime, 1, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onAudioSessionIdChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new C0286h(eventTimeGenerateReadingMediaPeriodEventTime, i, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new C0290l(eventTimeGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new C0299u(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new C0299u(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int i, long j, long j8) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new C0288j(eventTimeGenerateReadingMediaPeriodEventTime, i, j, j8, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onAvailableCommandsChanged(C0259z0 c0259z0) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, c0259z0));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i, long j, long j8) {
        AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new C0288j(eventTimeGenerateLoadingMediaPeriodEventTime, i, j, j8, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onCues(List<C1029b> list) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, list));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onDeviceInfoChanged(C0231q c0231q) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, c0231q));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onDeviceVolumeChanged(int i, boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new C0292n(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, z7));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new C0297s(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_LOADED, new C0280b(eventTimeGenerateMediaPeriodEventTime, 4));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new C0280b(eventTimeGenerateMediaPeriodEventTime, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_RESTORED, new C0280b(eventTimeGenerateMediaPeriodEventTime, 2));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i4) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new C0286h(eventTimeGenerateMediaPeriodEventTime, i4, 3));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new C0290l(eventTimeGenerateMediaPeriodEventTime, exc, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new C0280b(eventTimeGenerateMediaPeriodEventTime, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i, long j) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new C0294p(eventTimeGeneratePlayingMediaPeriodEventTime, i, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onEvents(InterfaceC0193d1 interfaceC0193d1, C0171a1 c0171a1) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onIsLoadingChanged(boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new C0283e(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, z7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onIsPlayingChanged(boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new C0283e(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, z7));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new C0285g(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new C0285g(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 2));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new C0291m(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z7));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new C0285g(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onLoadingChanged(boolean z7) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onMaxSeekToPreviousPositionChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new C0282d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onMediaItemTransition(C0226o0 c0226o0, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new C0287i(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, c0226o0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onMediaMetadataChanged(C0235r0 c0235r0) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new C0300v(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, c0235r0, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onMetadata(C0241t0 c0241t0) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, c0241t0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlayWhenReadyChanged(boolean z7, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new C0292n(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 2, z7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlaybackParametersChanged(C0256y0 c0256y0) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, c0256y0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new C0286h(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlaybackSuppressionReasonChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new C0286h(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlayerError(C0253x0 c0253x0) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(c0253x0);
        sendEvent(eventTimeForErrorEvent, 10, new C0295q(eventTimeForErrorEvent, c0253x0, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onPlayerErrorChanged(C0253x0 c0253x0) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(c0253x0);
        sendEvent(eventTimeForErrorEvent, 10, new C0295q(eventTimeForErrorEvent, c0253x0, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPlayerStateChanged(boolean z7, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new C0292n(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 0, z7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onPlaylistMetadataChanged(C0235r0 c0235r0) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new C0300v(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, c0235r0, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i, final int i4, final boolean z7) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.analytics.r
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(eventTimeGenerateReadingMediaPeriodEventTime, i, i4, z7);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new C0286h(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onSeekBackIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new C0282d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onSeekForwardIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new C0282d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onShuffleModeEnabledChanged(boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new C0283e(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, z7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onSkipSilenceEnabledChanged(boolean z7) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new C0283e(eventTimeGenerateReadingMediaPeriodEventTime, 1, z7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onSurfaceSizeChanged(final int i, final int i4) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.analytics.y
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i, i4);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onTimelineChanged(AbstractC0230p1 abstractC0230p1, int i) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        InterfaceC0193d1 interfaceC0193d1 = this.player;
        interfaceC0193d1.getClass();
        mediaPeriodQueueTracker.onTimelineChanged(interfaceC0193d1);
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new C0286h(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onTrackSelectionParametersChanged(C0248v1 c0248v1) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 10, c0248v1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onTracksChanged(C0254x1 c0254x1) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, c0254x1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1005, new C0297s(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new C0290l(eventTimeGenerateReadingMediaPeriodEventTime, exc, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j8) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new C0293o(eventTimeGenerateReadingMediaPeriodEventTime, str, j8, j, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, new C0284f(eventTimeGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DISABLED, new C0281c(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_ENABLED, new C0281c(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new C0294p(eventTimeGeneratePlayingMediaPeriodEventTime, i, 1, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new C0298t(eventTimeGenerateReadingMediaPeriodEventTime, c0249w, decoderReuseEvaluation, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onVideoSizeChanged(C0194d2 c0194d2) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new C0279a(eventTimeGenerateReadingMediaPeriodEventTime, 8, c0194d2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onVolumeChanged(final float f8) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.analytics.k
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f8);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void release() {
        InterfaceC1120k interfaceC1120k = this.handler;
        AbstractC1101a.m2360k(interfaceC1120k);
        ((C1104b0) interfaceC1120k).m2382e(new RunnableC0127c0(1, this));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.m2473e(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i, InterfaceC1122m interfaceC1122m) {
        this.eventTimes.put(i, eventTime);
        this.listeners.m2474f(i, interfaceC1122m);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void setPlayer(InterfaceC0193d1 interfaceC0193d1, Looper looper) {
        AbstractC1101a.m2359j(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        interfaceC0193d1.getClass();
        this.player = interfaceC0193d1;
        this.handler = ((C1135z) this.clock).m2541a(looper, null);
        C1125p c1125p = this.listeners;
        this.listeners = new C1125p(c1125p.f4774d, looper, c1125p.f4771a, new C0279a(this, 2, interfaceC0193d1), c1125p.f4779i);
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z7) {
        this.listeners.f4779i = z7;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        InterfaceC0193d1 interfaceC0193d1 = this.player;
        interfaceC0193d1.getClass();
        mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, interfaceC0193d1);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public final void onPositionDiscontinuity(final C0189c1 c0189c1, final C0189c1 c0189c12, final int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        InterfaceC0193d1 interfaceC0193d1 = this.player;
        interfaceC0193d1.getClass();
        mediaPeriodQueueTracker.onPositionDiscontinuity(interfaceC0193d1);
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.analytics.w
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, c0189c1, c0189c12, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.analytics.x
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(eventTimeGenerateReadingMediaPeriodEventTime, obj, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector, androidx.media3.common.InterfaceC0185b1
    public void onCues(C1030c c1030c) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new C0279a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, c1030c));
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        AbstractC0230p1 mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).f1206c, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        AbstractC0230p1 currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = AbstractC0230p1.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
