package androidx.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.analytics.PlaybackStats;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private C0249w audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final Callback callback;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private final C0221m1 period;
    private final Map<String, PlaybackStatsTracker> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;
    private C0249w videoFormat;
    private C0194d2 videoSize;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private C0249w currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private C0249w currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean z7, AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z7;
            this.playbackStateHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.mediaTimeHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.videoFormatHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.audioFormatHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.fatalErrorHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.nonFatalErrorHistory = z7 ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z8 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = -9223372036854775807L;
            this.maxRebufferTimeMs = -9223372036854775807L;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z8 = true;
            }
            this.isAd = z8;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j) {
            List<long[]> list = this.mediaTimeHistory;
            return new long[]{j, list.get(list.size() - 1)[1] + ((long) ((j - r0[0]) * this.currentPlaybackSpeed))};
        }

        private static boolean isInvalidJoinTransition(int i, int i4) {
            return ((i != 1 && i != 2 && i != 14) || i4 == 1 || i4 == 2 || i4 == 14 || i4 == 3 || i4 == 4 || i4 == 9 || i4 == 11) ? false : true;
        }

        private static boolean isPausedState(int i) {
            return i == 4 || i == 7;
        }

        private static boolean isReadyState(int i) {
            return i == 3 || i == 4 || i == 9;
        }

        private static boolean isRebufferingState(int i) {
            return i == 6 || i == 7 || i == 10;
        }

        private void maybeRecordAudioFormatTime(long j) {
            C0249w c0249w;
            int i;
            if (this.currentPlaybackState == 3 && (c0249w = this.currentAudioFormat) != null && (i = c0249w.f1518j) != -1) {
                long j8 = (long) ((j - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j8;
                this.audioFormatBitrateTimeProduct = (j8 * i) + this.audioFormatBitrateTimeProduct;
            }
            this.lastAudioFormatStartTimeMs = j;
        }

        private void maybeRecordVideoFormatTime(long j) {
            C0249w c0249w;
            if (this.currentPlaybackState == 3 && (c0249w = this.currentVideoFormat) != null) {
                long j8 = (long) ((j - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                int i = c0249w.f1530v;
                if (i != -1) {
                    this.videoFormatHeightTimeMs += j8;
                    this.videoFormatHeightTimeProduct = (i * j8) + this.videoFormatHeightTimeProduct;
                }
                int i4 = c0249w.f1518j;
                if (i4 != -1) {
                    this.videoFormatBitrateTimeMs += j8;
                    this.videoFormatBitrateTimeProduct = (j8 * i4) + this.videoFormatBitrateTimeProduct;
                }
            }
            this.lastVideoFormatStartTimeMs = j;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, C0249w c0249w) {
            int i;
            C0249w c0249w2 = this.currentAudioFormat;
            int i4 = AbstractC1118i0.f4750a;
            if (Objects.equals(c0249w2, c0249w)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (c0249w != null && this.initialAudioFormatBitrate == -1 && (i = c0249w.f1518j) != -1) {
                this.initialAudioFormatBitrate = i;
            }
            this.currentAudioFormat = c0249w;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, c0249w));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j8 = j - this.lastRebufferStartTimeMs;
                long j9 = this.maxRebufferTimeMs;
                if (j9 == -9223372036854775807L || j8 > j9) {
                    this.maxRebufferTimeMs = j8;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j, long j8) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j8 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        List<long[]> list = this.mediaTimeHistory;
                        long j9 = list.get(list.size() - 1)[1];
                        if (j9 != j8) {
                            this.mediaTimeHistory.add(new long[]{j, j9});
                        }
                    }
                }
                if (j8 != -9223372036854775807L) {
                    this.mediaTimeHistory.add(new long[]{j, j8});
                } else {
                    if (this.mediaTimeHistory.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j));
                }
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, C0249w c0249w) {
            int i;
            int i4;
            C0249w c0249w2 = this.currentVideoFormat;
            int i8 = AbstractC1118i0.f4750a;
            if (Objects.equals(c0249w2, c0249w)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (c0249w != null) {
                if (this.initialVideoFormatHeight == -1 && (i4 = c0249w.f1530v) != -1) {
                    this.initialVideoFormatHeight = i4;
                }
                if (this.initialVideoFormatBitrate == -1 && (i = c0249w.f1518j) != -1) {
                    this.initialVideoFormatBitrate = i;
                }
            }
            this.currentVideoFormat = c0249w;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, c0249w));
            }
        }

        private int resolveNewPlaybackState(InterfaceC0193d1 interfaceC0193d1) {
            int playbackState = interfaceC0193d1.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (interfaceC0193d1.getPlayWhenReady()) {
                        return interfaceC0193d1.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i = this.currentPlaybackState;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (interfaceC0193d1.getPlayWhenReady()) {
                return interfaceC0193d1.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i, AnalyticsListener.EventTime eventTime) {
            AbstractC1101a.m2353d(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j = eventTime.realtimeMs;
            long j8 = j - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i4 = this.currentPlaybackState;
            jArr[i4] = jArr[i4] + j8;
            if (this.firstReportedTimeMs == -9223372036854775807L) {
                this.firstReportedTimeMs = j;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i4, i);
            this.hasBeenReady |= isReadyState(i);
            this.hasEnded |= i == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i)) {
                this.pauseCount++;
            }
            if (i == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i));
            }
        }

        public PlaybackStats build(boolean z7) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list2 = this.mediaTimeHistory;
            if (z7) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i = this.currentPlaybackState;
                jArrCopyOf[i] = jArrCopyOf[i] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i4 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j = i4 != 0 ? -9223372036854775807L : jArr[2];
            int i8 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z7 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList3 = z7 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList4 = z7 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j8 = this.firstReportedTimeMs;
            boolean z8 = this.isForeground;
            int i9 = !this.hasBeenReady ? 1 : 0;
            boolean z9 = this.hasEnded;
            int i10 = i4 ^ 1;
            int i11 = this.pauseCount;
            int i12 = this.pauseBufferCount;
            int i13 = this.seekCount;
            int i14 = this.rebufferCount;
            long j9 = this.maxRebufferTimeMs;
            boolean z10 = this.isAd;
            long j10 = this.videoFormatHeightTimeMs;
            long j11 = this.videoFormatHeightTimeProduct;
            long j12 = this.videoFormatBitrateTimeMs;
            long j13 = this.videoFormatBitrateTimeProduct;
            long j14 = this.audioFormatTimeMs;
            long j15 = this.audioFormatBitrateTimeProduct;
            int i15 = this.initialVideoFormatHeight;
            int i16 = i15 == -1 ? 0 : 1;
            long j16 = this.initialVideoFormatBitrate;
            int i17 = j16 == -1 ? 0 : 1;
            long j17 = this.initialAudioFormatBitrate;
            int i18 = j17 == -1 ? 0 : 1;
            long j18 = this.bandwidthTimeMs;
            long j19 = this.bandwidthBytes;
            long j20 = this.droppedFrames;
            long j21 = this.audioUnderruns;
            int i19 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr, arrayList4, list, j8, z8 ? 1 : 0, i9, z9 ? 1 : 0, i8, j, i10, i11, i12, i13, i14, j9, z10 ? 1 : 0, arrayList2, arrayList3, j10, j11, j12, j13, j14, j15, i16, i17, i15, j16, i18, j17, j18, j19, j20, j21, i19 > 0 ? 1 : 0, i19, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.EventTime eventTime, boolean z7, long j, boolean z8, int i, boolean z9, boolean z10, C0253x0 c0253x0, Exception exc, long j8, long j9, C0249w c0249w, C0249w c0249w2, C0194d2 c0194d2) {
            if (j != -9223372036854775807L) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j);
                this.isSeeking = true;
            }
            if (interfaceC0193d1.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = interfaceC0193d1.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z8) {
                this.isInterruptedByAd = false;
            }
            if (c0253x0 != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, c0253x0));
                }
            } else if (interfaceC0193d1.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                C0254x1 currentTracks = interfaceC0193d1.getCurrentTracks();
                if (!currentTracks.m698a(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracks.m698a(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (c0249w != null) {
                maybeUpdateVideoFormat(eventTime, c0249w);
            }
            if (c0249w2 != null) {
                maybeUpdateAudioFormat(eventTime, c0249w2);
            }
            C0249w c0249w3 = this.currentVideoFormat;
            if (c0249w3 != null && c0249w3.f1530v == -1 && c0194d2 != null) {
                C0246v c0246vM692a = c0249w3.m692a();
                c0246vM692a.f1454t = c0194d2.f1086a;
                c0246vM692a.f1455u = c0194d2.f1087b;
                maybeUpdateVideoFormat(eventTime, new C0249w(c0246vM692a));
            }
            if (z10) {
                this.startedLoading = true;
            }
            if (z9) {
                this.audioUnderruns++;
            }
            this.droppedFrames += i;
            this.bandwidthTimeMs += j8;
            this.bandwidthBytes += j9;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(interfaceC0193d1);
            float f8 = interfaceC0193d1.getPlaybackParameters().f1549a;
            if (this.currentPlaybackState != iResolveNewPlaybackState || this.currentPlaybackSpeed != f8) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, z7 ? eventTime.eventPlaybackPositionMs : -9223372036854775807L);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f8;
            if (this.currentPlaybackState != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, eventTime);
            }
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z7, long j) {
            int i = 11;
            if (this.currentPlaybackState != 11 && !z7) {
                i = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i, eventTime);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public PlaybackStatsListener(boolean z7, Callback callback) {
        this.callback = callback;
        this.keepHistory = z7;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new C0221m1();
        this.videoSize = C0194d2.f1085d;
        defaultPlaybackSessionManager.setListener(this);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i = 0; i < events.size(); i++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i));
            boolean zBelongsToSession2 = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        eventTime.getClass();
        if (!zBelongsToSession && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long jM639d = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).m639d(eventTime.mediaPeriodId.adGroupIndex);
            if (jM639d == Long.MIN_VALUE) {
                jM639d = this.period.f1207d;
            }
            long j = jM639d + this.period.f1208e;
            long j8 = eventTime.realtimeMs;
            AbstractC0230p1 abstractC0230p1 = eventTime.timeline;
            int i4 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j8, abstractC0230p1, i4, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), AbstractC1118i0.m2447f0(j), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(zBelongsToSession));
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i) {
        return events.contains(i) && this.sessionManager.belongsToSession(events.getEventTime(i), str);
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i4 = events.get(i);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i4);
            if (i4 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i4 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<PlaybackStatsTracker> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i] = it.next().build(false);
            i++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        PlaybackStatsTracker playbackStatsTracker = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
        playbackStatsTracker.getClass();
        playbackStatsTracker.onInterruptedByAd();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j8) {
        this.bandwidthTimeMs = i;
        this.bandwidthBytes = j;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i = mediaLoadData.trackType;
        if (i == 2 || i == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.droppedFrames = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        Iterator<String> it = this.playbackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<AnalyticsListener.EventTime, Boolean> pairFindBestEventTime = findBestEventTime(events, next);
            PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(next);
            boolean zHasEvent = hasEvent(events, next, 11);
            boolean zHasEvent2 = hasEvent(events, next, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES);
            boolean zHasEvent3 = hasEvent(events, next, AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            boolean zHasEvent4 = hasEvent(events, next, 1000);
            boolean zHasEvent5 = hasEvent(events, next, 10);
            boolean z7 = hasEvent(events, next, 1003) || hasEvent(events, next, 1024);
            boolean zHasEvent6 = hasEvent(events, next, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            boolean zHasEvent7 = hasEvent(events, next, 1004);
            boolean zHasEvent8 = hasEvent(events, next, 25);
            Iterator<String> it2 = it;
            playbackStatsTracker.onEvents(interfaceC0193d1, (AnalyticsListener.EventTime) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L, zHasEvent, zHasEvent2 ? this.droppedFrames : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? interfaceC0193d1.getPlayerError() : null, z7 ? this.nonFatalException : null, zHasEvent6 ? this.bandwidthTimeMs : 0L, zHasEvent6 ? this.bandwidthBytes : 0L, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, zHasEvent8 ? this.videoSize : null);
            it = it2;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
            this.sessionManager.finishAllSessions(events.getEventTime(AnalyticsListener.EVENT_PLAYER_RELEASED));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z7) {
        this.nonFatalException = iOException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, C0189c1 c0189c1, C0189c1 c0189c12, int i) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = c0189c1.f1066f;
        }
        this.discontinuityReason = i;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
        playbackStatsTracker.getClass();
        playbackStatsTracker.onForeground();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z7) {
        PlaybackStatsTracker playbackStatsTrackerRemove = this.playbackStatsTrackers.remove(str);
        playbackStatsTrackerRemove.getClass();
        AnalyticsListener.EventTime eventTimeRemove = this.sessionStartEventTimes.remove(str);
        eventTimeRemove.getClass();
        playbackStatsTrackerRemove.onFinished(eventTime, z7, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L);
        PlaybackStats playbackStatsBuild = playbackStatsTrackerRemove.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsBuild);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTimeRemove, playbackStatsBuild);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, C0194d2 c0194d2) {
        this.videoSize = c0194d2;
    }
}
