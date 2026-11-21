package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0183b;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.ArrayList;
import java.util.List;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p063h1.AbstractC1101a;
import p063h1.C1104b0;
import p063h1.InterfaceC1120k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final AnalyticsCollector analyticsCollector;
    private final InterfaceC1120k analyticsCollectorHandler;
    private int length;
    private MediaPeriodHolder loading;
    private final MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private MediaPeriodHolder playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private MediaPeriodHolder preloading;
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final C0221m1 period = new C0221m1();
    private final C0227o1 window = new C0227o1();
    private List<MediaPeriodHolder> preloadPriorityList = new ArrayList();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, InterfaceC1120k interfaceC1120k, MediaPeriodHolder.Factory factory, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = interfaceC1120k;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
    }

    public static boolean areDurationsCompatible(long j, long j8) {
        return j == -9223372036854775807L || j == j8;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.f1558id.equals(mediaPeriodInfo2.f1558id);
    }

    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(AbstractC0230p1 abstractC0230p1, Object obj, long j) {
        int nextWindowIndex = abstractC0230p1.getNextWindowIndex(abstractC0230p1.getPeriodByUid(obj, this.period).f1206c, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return abstractC0230p1.getPeriodPositionUs(this.window, this.period, nextWindowIndex, -9223372036854775807L, j);
        }
        return null;
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    private MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(AbstractC0230p1 abstractC0230p1, MediaPeriodHolder mediaPeriodHolder, long j) {
        Object obj;
        long j8;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = abstractC0230p1.getNextPeriodIndex(abstractC0230p1.getIndexOfPeriod(mediaPeriodInfo.f1558id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i = abstractC0230p1.getPeriod(nextPeriodIndex, this.period, true).f1206c;
        Object obj2 = this.period.f1205b;
        obj2.getClass();
        long j9 = mediaPeriodInfo.f1558id.windowSequenceNumber;
        long j10 = 0;
        if (abstractC0230p1.getWindow(i, this.window).f1273n == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(this.window, this.period, i, -9223372036854775807L, Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj3 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj3)) {
                long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj3);
                if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
                j9 = jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            } else {
                j9 = next.info.f1558id.windowSequenceNumber;
            }
            obj = obj3;
            j8 = jLongValue;
            j10 = -9223372036854775807L;
        } else {
            obj = obj2;
            j8 = 0;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(abstractC0230p1, obj, j8, j9, this.window, this.period);
        if (j10 != -9223372036854775807L && mediaPeriodInfo.requestedContentPositionUs != -9223372036854775807L) {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.f1558id.periodUid, abstractC0230p1);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd() && zHasServerSideInsertedAds) {
                j10 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (zHasServerSideInsertedAds) {
                j8 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        return getMediaPeriodInfo(abstractC0230p1, mediaPeriodIdResolveMediaPeriodIdForAds, j10, j8);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfo(AbstractC0230p1 abstractC0230p1, MediaPeriodHolder mediaPeriodHolder, long j) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        return mediaPeriodInfo.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(abstractC0230p1, mediaPeriodHolder, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(abstractC0230p1, mediaPeriodHolder, rendererOffset);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(AbstractC0230p1 abstractC0230p1, MediaPeriodHolder mediaPeriodHolder, long j) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f1558id;
        abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int i = mediaPeriodId.nextAdGroupIndex;
            if (i != -1 && this.period.m642g(i)) {
                return getFirstMediaPeriodInfoOfNextPeriod(abstractC0230p1, mediaPeriodHolder, j);
            }
            int iM641f = this.period.m641f(mediaPeriodId.nextAdGroupIndex);
            boolean z7 = this.period.m643h(mediaPeriodId.nextAdGroupIndex) && this.period.m640e(mediaPeriodId.nextAdGroupIndex, iM641f) == 3;
            if (iM641f == this.period.f1210g.m609a(mediaPeriodId.nextAdGroupIndex).f1022b || z7) {
                return getMediaPeriodInfoForContent(abstractC0230p1, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(abstractC0230p1, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForAd(abstractC0230p1, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, iM641f, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        int i4 = mediaPeriodId.adGroupIndex;
        int i8 = this.period.f1210g.m609a(i4).f1022b;
        if (i8 == -1) {
            return null;
        }
        int iM605b = this.period.f1210g.m609a(i4).m605b(mediaPeriodId.adIndexInAdGroup);
        if (iM605b < i8) {
            return getMediaPeriodInfoForAd(abstractC0230p1, mediaPeriodId.periodUid, i4, iM605b, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long jLongValue = mediaPeriodInfo.requestedContentPositionUs;
        if (jLongValue == -9223372036854775807L) {
            C0227o1 c0227o1 = this.window;
            C0221m1 c0221m1 = this.period;
            Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(c0227o1, c0221m1, c0221m1.f1206c, -9223372036854775807L, Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        }
        return getMediaPeriodInfoForContent(abstractC0230p1, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(abstractC0230p1, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfo(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, long j, long j8) {
        abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(abstractC0230p1, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(abstractC0230p1, mediaPeriodId.periodUid, j8, j, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(AbstractC0230p1 abstractC0230p1, Object obj, int i, int i4, long j, long j8) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i, i4, j8);
        long jM636a = abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period).m636a(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long jMax = i4 == this.period.m641f(i) ? this.period.f1210g.f1052c : 0L;
        boolean zM643h = this.period.m643h(mediaPeriodId.adGroupIndex);
        if (jM636a != -9223372036854775807L && jMax >= jM636a) {
            jMax = Math.max(0L, jM636a - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j, -9223372036854775807L, jM636a, zM643h, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MediaPeriodInfo getMediaPeriodInfoForContent(AbstractC0230p1 abstractC0230p1, Object obj, long j, long j8, long j9) {
        boolean z7;
        boolean z8;
        long j10;
        long jM639d;
        long j11;
        long jMax = j;
        abstractC0230p1.getPeriodByUid(obj, this.period);
        int iM637b = this.period.m637b(jMax);
        boolean z9 = iM637b != -1 && this.period.m642g(iM637b);
        if (iM637b == -1) {
            C0221m1 c0221m1 = this.period;
            C0187c c0187c = c0221m1.f1210g;
            z8 = c0187c.f1051b > 0 && c0221m1.m643h(c0187c.f1054e);
        } else if (this.period.m643h(iM637b)) {
            long jM639d2 = this.period.m639d(iM637b);
            C0221m1 c0221m12 = this.period;
            if (jM639d2 == c0221m12.f1207d) {
                C0183b c0183bM609a = c0221m12.f1210g.m609a(iM637b);
                int i = c0183bM609a.f1022b;
                if (i == -1) {
                    z7 = true;
                    if (z7) {
                        z8 = true;
                        iM637b = -1;
                    }
                } else {
                    for (int i4 = 0; i4 < i; i4++) {
                        int i8 = c0183bM609a.f1026f[i4];
                        if (i8 == 0 || i8 == 1) {
                            z7 = true;
                            break;
                        }
                    }
                    z7 = false;
                    if (z7) {
                    }
                }
            }
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j9, iM637b);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(abstractC0230p1, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(abstractC0230p1, mediaPeriodId, zIsLastInPeriod);
        boolean z10 = (iM637b == -1 || !this.period.m643h(iM637b) || z9) ? false : true;
        if (iM637b == -1 || z9) {
            if (!z8) {
                j10 = -9223372036854775807L;
                j11 = (j10 != -9223372036854775807L || j10 == Long.MIN_VALUE) ? this.period.f1207d : j10;
                if (j11 != -9223372036854775807L && jMax >= j11) {
                    jMax = Math.max(0L, j11 - ((zIsLastInTimeline && z8) ? 0 : 1));
                }
                return new MediaPeriodInfo(mediaPeriodId, jMax, j8, j10, j11, z10, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
            }
            jM639d = this.period.f1207d;
        } else {
            jM639d = this.period.m639d(iM637b);
        }
        j10 = jM639d;
        if (j10 != -9223372036854775807L) {
        }
        if (j11 != -9223372036854775807L) {
            if (zIsLastInTimeline) {
                jMax = Math.max(0L, j11 - ((zIsLastInTimeline && z8) ? 0 : 1));
            }
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j8, j10, j11, z10, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(AbstractC0230p1 abstractC0230p1, Object obj, long j, long j8) {
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(abstractC0230p1, obj, j, j8, this.window, this.period);
        return mediaPeriodIdResolveMediaPeriodIdForAds.isAd() ? getMediaPeriodInfoForAd(abstractC0230p1, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds.adGroupIndex, mediaPeriodIdResolveMediaPeriodIdForAds.adIndexInAdGroup, j, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber) : getMediaPeriodInfoForContent(abstractC0230p1, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, j, -9223372036854775807L, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private long getMinStartPositionAfterAdGroupUs(AbstractC0230p1 abstractC0230p1, Object obj, int i) {
        abstractC0230p1.getPeriodByUid(obj, this.period);
        long jM639d = this.period.m639d(i);
        return jM639d == Long.MIN_VALUE ? this.period.f1207d : this.period.f1210g.m609a(i).f1028h + jM639d;
    }

    private boolean hasServerSideInsertedAds(Object obj, AbstractC0230p1 abstractC0230p1) {
        int i = abstractC0230p1.getPeriodByUid(obj, this.period).f1210g.f1051b;
        C0221m1 c0221m1 = this.period;
        int i4 = c0221m1.f1210g.f1054e;
        if (i <= 0 || !c0221m1.m643h(i4)) {
            return false;
        }
        return i > 1 || this.period.m639d(i4) != Long.MIN_VALUE;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, boolean z7) {
        int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !abstractC0230p1.getWindow(abstractC0230p1.getPeriod(indexOfPeriod, this.period).f1206c, this.window).f1268i && abstractC0230p1.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z7;
    }

    private boolean isLastInWindow(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period).f1206c, this.window).f1274o == abstractC0230p1.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private static boolean isSkippableAdPeriod(C0221m1 c0221m1) {
        int i = c0221m1.f1210g.f1051b;
        if (i != 0 && ((i != 1 || !c0221m1.m642g(0)) && c0221m1.m643h(c0221m1.f1210g.f1054e))) {
            long j = 0;
            if (c0221m1.m638c(0L) == -1) {
                if (c0221m1.f1207d != 0) {
                    int i4 = i - (c0221m1.m642g(i + (-1)) ? 2 : 1);
                    for (int i8 = 0; i8 <= i4; i8++) {
                        j += c0221m1.f1210g.m609a(i8).f1028h;
                    }
                    if (c0221m1.f1207d <= j) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyQueueUpdate$0(C0974j0 c0974j0, MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(c0974j0.m2159f(), mediaPeriodId);
    }

    private void notifyQueueUpdate() {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            c0974j0M2164i.m2141a(next.info.f1558id);
        }
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        ((C1104b0) this.analyticsCollectorHandler).m2382e(new RunnableC0509y(this, c0974j0M2164i, mediaPeriodHolder == null ? null : mediaPeriodHolder.info.f1558id, 0));
    }

    private void releaseAndResetPreloadPriorityList(List<MediaPeriodHolder> list) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            this.preloadPriorityList.get(i).release();
        }
        this.preloadPriorityList = list;
        this.preloading = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    private MediaPeriodHolder removePreloadedMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            if (this.preloadPriorityList.get(i).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i);
            }
        }
        return null;
    }

    private long resolvePeriodUidToWindowSequenceNumber(AbstractC0230p1 abstractC0230p1, Object obj) {
        int indexOfPeriod;
        int i = abstractC0230p1.getPeriodByUid(obj, this.period).f1206c;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = abstractC0230p1.getIndexOfPeriod(obj2)) != -1 && abstractC0230p1.getPeriod(indexOfPeriod, this.period).f1206c == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.f1558id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = abstractC0230p1.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && abstractC0230p1.getPeriod(indexOfPeriod2, this.period).f1206c == i) {
                return next2.info.f1558id.windowSequenceNumber;
            }
        }
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.f1558id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private boolean updateForPlaybackModeChange(AbstractC0230p1 abstractC0230p1) {
        AbstractC0230p1 abstractC0230p12;
        MediaPeriodHolder next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(next.uid);
        while (true) {
            abstractC0230p12 = abstractC0230p1;
            indexOfPeriod = abstractC0230p12.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                next.getClass();
                if (next.getNext() == null || next.info.isLastInTimelinePeriod) {
                    break;
                }
                next = next.getNext();
            }
            MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || abstractC0230p12.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
            abstractC0230p1 = abstractC0230p12;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(abstractC0230p12, next.info);
        return !zRemoveAfter;
    }

    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.f1558id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        AbstractC1101a.m2360k(mediaPeriodHolder);
        this.reading = mediaPeriodHolder.getNext();
        notifyQueueUpdate();
        MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        AbstractC1101a.m2360k(mediaPeriodHolder2);
        return mediaPeriodHolder2;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder next = this.playing;
        AbstractC1101a.m2360k(next);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.f1558id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? INITIAL_RENDERER_POSITION_OFFSET_US : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        } else {
            this.playing = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
            this.reading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
    }

    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public MediaPeriodInfo getNextMediaPeriodInfo(long j, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j);
    }

    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public MediaPeriodHolder getPreloadHolderByMediaPeriod(MediaPeriod mediaPeriod) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                return mediaPeriodHolder;
            }
        }
        return null;
    }

    public MediaPeriodHolder getPreloadingPeriod() {
        return this.preloading;
    }

    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaPeriodInfo getUpdatedMediaPeriodInfo(AbstractC0230p1 abstractC0230p1, MediaPeriodInfo mediaPeriodInfo) {
        long jM636a;
        long j;
        boolean zM643h;
        int i;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f1558id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(abstractC0230p1, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(abstractC0230p1, mediaPeriodId, zIsLastInPeriod);
        abstractC0230p1.getPeriodByUid(mediaPeriodInfo.f1558id.periodUid, this.period);
        long jM639d = (mediaPeriodId.isAd() || (i = mediaPeriodId.nextAdGroupIndex) == -1) ? -9223372036854775807L : this.period.m639d(i);
        if (mediaPeriodId.isAd()) {
            jM636a = this.period.m636a(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else {
            if (jM639d != -9223372036854775807L && jM639d != Long.MIN_VALUE) {
                j = jM639d;
                if (mediaPeriodId.isAd()) {
                    int i4 = mediaPeriodId.nextAdGroupIndex;
                    zM643h = i4 != -1 && this.period.m643h(i4);
                } else {
                    zM643h = this.period.m643h(mediaPeriodId.adGroupIndex);
                }
                return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, jM639d, j, zM643h, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
            }
            jM636a = this.period.f1207d;
        }
        j = jM636a;
        if (mediaPeriodId.isAd()) {
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, jM639d, j, zM643h, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    public void invalidatePreloadPool(AbstractC0230p1 abstractC0230p1) {
        MediaPeriodHolder mediaPeriodHolder;
        if (this.preloadConfiguration.targetPreloadDurationUs == -9223372036854775807L || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(abstractC0230p1, mediaPeriodHolder.info.f1558id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).f1206c, this.window).m654a()) {
            long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            MediaPeriodInfo mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(abstractC0230p1, defaultPeriodPositionOfNextWindow.first, ((Long) defaultPeriodPositionOfNextWindow.second).longValue(), jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
                mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public boolean isPreloading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i = 0; i < this.preloadPriorityList.size(); i++) {
                MediaPeriodHolder mediaPeriodHolder2 = this.preloadPriorityList.get(i);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public void reevaluateBuffer(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        AbstractC1101a.m2360k(mediaPeriodHolder);
        boolean z7 = false;
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            mediaPeriodHolder.getClass();
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z7 = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        mediaPeriodHolder2.getClass();
        mediaPeriodHolder2.setNext(null);
        notifyQueueUpdate();
        return z7;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(AbstractC0230p1 abstractC0230p1, Object obj, long j) {
        return resolveMediaPeriodIdForAds(abstractC0230p1, obj, j, resolvePeriodUidToWindowSequenceNumber(abstractC0230p1, obj), this.window, this.period);
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(AbstractC0230p1 abstractC0230p1, Object obj, long j) {
        long jResolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(abstractC0230p1, obj);
        abstractC0230p1.getPeriodByUid(obj, this.period);
        abstractC0230p1.getWindow(this.period.f1206c, this.window);
        boolean z7 = false;
        for (int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(obj); indexOfPeriod >= this.window.f1273n; indexOfPeriod--) {
            abstractC0230p1.getPeriod(indexOfPeriod, this.period, true);
            C0221m1 c0221m1 = this.period;
            boolean z8 = c0221m1.f1210g.f1051b > 0;
            z7 |= z8;
            if (c0221m1.m638c(c0221m1.f1207d) != -1) {
                obj = this.period.f1205b;
                obj.getClass();
            }
            if (z7 && (!z8 || this.period.f1207d != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(abstractC0230p1, obj, j, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != -9223372036854775807L && this.length < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(AbstractC0230p1 abstractC0230p1, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(abstractC0230p1);
    }

    public boolean updateQueuedPeriods(AbstractC0230p1 abstractC0230p1, long j, long j8) {
        boolean zRemoveAfter;
        MediaPeriodInfo updatedMediaPeriodInfo;
        MediaPeriodHolder next = this.playing;
        MediaPeriodHolder mediaPeriodHolder = null;
        while (next != null) {
            MediaPeriodInfo mediaPeriodInfo = next.info;
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(abstractC0230p1, mediaPeriodHolder, j);
                if (followingMediaPeriodInfo == null) {
                    zRemoveAfter = removeAfter(mediaPeriodHolder);
                } else if (canKeepMediaPeriodHolder(mediaPeriodInfo, followingMediaPeriodInfo)) {
                    updatedMediaPeriodInfo = followingMediaPeriodInfo;
                } else {
                    zRemoveAfter = removeAfter(mediaPeriodHolder);
                }
                return !zRemoveAfter;
            }
            updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(abstractC0230p1, mediaPeriodInfo);
            next.info = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo.durationUs, updatedMediaPeriodInfo.durationUs)) {
                next.updateClipping();
                long j9 = updatedMediaPeriodInfo.durationUs;
                return (removeAfter(next) || (next == this.reading && !next.info.isFollowedByTransitionToSameStream && ((j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j8 > ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j9)) ? 1 : (j8 == ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j9)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(AbstractC0230p1 abstractC0230p1, int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange(abstractC0230p1);
    }

    public boolean updateShuffleModeEnabled(AbstractC0230p1 abstractC0230p1, boolean z7) {
        this.shuffleModeEnabled = z7;
        return updateForPlaybackModeChange(abstractC0230p1);
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(AbstractC0230p1 abstractC0230p1, Object obj, long j, long j8, C0227o1 c0227o1, C0221m1 c0221m1) {
        abstractC0230p1.getPeriodByUid(obj, c0221m1);
        abstractC0230p1.getWindow(c0221m1.f1206c, c0227o1);
        for (int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(obj); isSkippableAdPeriod(c0221m1) && indexOfPeriod <= c0227o1.f1274o; indexOfPeriod++) {
            abstractC0230p1.getPeriod(indexOfPeriod, c0221m1, true);
            obj = c0221m1.f1205b;
            obj.getClass();
        }
        abstractC0230p1.getPeriodByUid(obj, c0221m1);
        int iM638c = c0221m1.m638c(j);
        if (iM638c == -1) {
            return new MediaSource.MediaPeriodId(obj, j8, c0221m1.m637b(j));
        }
        return new MediaSource.MediaPeriodId(obj, iM638c, c0221m1.m641f(iM638c), j8);
    }
}
