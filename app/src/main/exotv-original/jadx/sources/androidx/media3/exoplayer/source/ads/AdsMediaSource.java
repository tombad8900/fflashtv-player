package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0170a0;
import androidx.media3.common.C0183b;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.InterfaceC0191d;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1568l;
import p089k1.InterfaceC1557c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    private C0187c adPlaybackState;
    private final C1568l adTagDataSpec;
    private final InterfaceC0191d adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    final C0202g0 contentDrmConfiguration;
    private final MaskingMediaSource contentMediaSource;
    private AbstractC0230p1 contentTimeline;
    private final Handler mainHandler;
    private final C0221m1 period;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException(AbstractC0008a1.m12h(i, "Failed to load ad group "), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            AbstractC1101a.m2359j(this.type == 3);
            Throwable cause = getCause();
            cause.getClass();
            return (RuntimeException) cause;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class AdMediaSourceHolder {
        private final List<MaskingMediaPeriod> activeMediaPeriods = new ArrayList();
        private C0226o0 adMediaItem;
        private MediaSource adMediaSource;

        /* renamed from: id */
        private final MediaSource.MediaPeriodId f1810id;
        private AbstractC0230p1 timeline;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f1810id = mediaPeriodId;
        }

        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            this.activeMediaPeriods.add(maskingMediaPeriod);
            MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                C0226o0 c0226o0 = this.adMediaItem;
                c0226o0.getClass();
                maskingMediaPeriod.setPrepareListener(adsMediaSource.new AdPrepareListener(c0226o0));
            }
            AbstractC0230p1 abstractC0230p1 = this.timeline;
            if (abstractC0230p1 != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(abstractC0230p1.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public long getDurationUs() {
            AbstractC0230p1 abstractC0230p1 = this.timeline;
            if (abstractC0230p1 == null) {
                return -9223372036854775807L;
            }
            return abstractC0230p1.getPeriod(0, AdsMediaSource.this.period).f1207d;
        }

        public void handleSourceInfoRefresh(AbstractC0230p1 abstractC0230p1) {
            AbstractC1101a.m2353d(abstractC0230p1.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = abstractC0230p1.getUidOfPeriod(0);
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.f1806id.windowSequenceNumber));
                }
            }
            this.timeline = abstractC0230p1;
        }

        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        public void initializeWithMediaSource(MediaSource mediaSource, C0226o0 c0226o0) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = c0226o0;
            for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new AdPrepareListener(c0226o0));
            }
            AdsMediaSource.this.prepareChildSource(this.f1810id, mediaSource);
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                AdsMediaSource.this.releaseChildSource(this.f1810id);
            }
        }

        public void releaseMediaPeriod(MaskingMediaPeriod maskingMediaPeriod) {
            this.activeMediaPeriods.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final C0226o0 adMediaItem;

        public AdPrepareListener(C0226o0 c0226o0) {
            this.adMediaItem = c0226o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.adsLoader.handlePrepareComplete(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource.this.adsLoader.handlePrepareError(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.mainHandler.post(new RunnableC0437c(this, 0, mediaPeriodId));
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = AdsMediaSource.this.createEventDispatcher(mediaPeriodId);
            long newId = LoadEventInfo.getNewId();
            C0211j0 c0211j0 = this.adMediaItem.f1239b;
            c0211j0.getClass();
            eventDispatcherCreateEventDispatcher.loadError(new LoadEventInfo(newId, new C1568l(c0211j0.f1147a), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new RunnableC0436b(this, mediaPeriodId, iOException, 0));
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = AbstractC1118i0.m2457p(null);
        private volatile boolean stopped;

        public ComponentListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(C0187c c0187c) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(c0187c);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, C1568l c1568l) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), c1568l, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(C0187c c0187c) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new RunnableC0437c(this, 1, c0187c));
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, C1568l c1568l, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, InterfaceC0191d interfaceC0191d) {
        this.contentMediaSource = new MaskingMediaSource(mediaSource, true);
        C0211j0 c0211j0 = mediaSource.getMediaItem().f1239b;
        c0211j0.getClass();
        this.contentDrmConfiguration = c0211j0.f1149c;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = interfaceC0191d;
        this.adTagDataSpec = c1568l;
        this.adsId = obj;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new C0221m1();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i >= adMediaSourceHolderArr.length) {
                return jArr;
            }
            jArr[i] = new long[adMediaSourceHolderArr[i].length];
            int i4 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i];
                if (i4 < adMediaSourceHolderArr2.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i4];
                    jArr[i][i4] = adMediaSourceHolder == null ? -9223372036854775807L : adMediaSourceHolder.getDurationUs();
                    i4++;
                }
            }
            i++;
        }
    }

    private static C0170a0 getAdsConfiguration(C0226o0 c0226o0) {
        C0211j0 c0211j0 = c0226o0.f1239b;
        if (c0211j0 == null) {
            return null;
        }
        return c0211j0.f1150d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    private void maybeUpdateAdMediaSources() {
        C0226o0 c0226o0M608a;
        C0187c c0187c = this.adPlaybackState;
        if (c0187c == null) {
            return;
        }
        for (int i = 0; i < this.adMediaSourceHolders.length; i++) {
            int i4 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i];
                if (i4 < adMediaSourceHolderArr.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i4];
                    C0183b c0183bM609a = c0187c.m609a(i);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                        C0226o0[] c0226o0Arr = c0183bM609a.f1025e;
                        if (i4 < c0226o0Arr.length && (c0226o0M608a = c0226o0Arr[i4]) != null) {
                            if (this.contentDrmConfiguration != null) {
                                C0184b0 c0184b0M652a = c0226o0M608a.m652a();
                                C0202g0 c0202g0 = this.contentDrmConfiguration;
                                c0184b0M652a.f1034e = c0202g0 != null ? c0202g0.m620a() : new C0199f0();
                                c0226o0M608a = c0184b0M652a.m608a();
                            }
                            adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(c0226o0M608a), c0226o0M608a);
                        }
                    }
                    i4++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        AbstractC0230p1 abstractC0230p1 = this.contentTimeline;
        C0187c c0187c = this.adPlaybackState;
        if (c0187c == null || abstractC0230p1 == null) {
            return;
        }
        if (c0187c.f1051b == 0) {
            refreshSourceInfo(abstractC0230p1);
            return;
        }
        long[][] adDurationsUs = getAdDurationsUs();
        AbstractC1101a.m2359j(c0187c.f1054e == 0);
        C0183b[] c0183bArr = c0187c.f1055f;
        C0183b[] c0183bArr2 = (C0183b[]) AbstractC1118i0.m2430U(c0183bArr.length, c0183bArr);
        for (int i = 0; i < c0187c.f1051b; i++) {
            c0183bArr2[i] = c0183bArr2[i].m607d(adDurationsUs[i]);
        }
        this.adPlaybackState = new C0187c(c0187c.f1050a, c0183bArr2, c0187c.f1052c, c0187c.f1053d, c0187c.f1054e);
        refreshSourceInfo(new SinglePeriodAdTimeline(abstractC0230p1, this.adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(C0187c c0187c) {
        C0187c c0187c2 = this.adPlaybackState;
        if (c0187c2 == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[c0187c.f1051b][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        } else {
            AbstractC1101a.m2359j(c0187c.f1051b == c0187c2.f1051b);
        }
        this.adPlaybackState = c0187c;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        C0170a0 adsConfiguration = getAdsConfiguration(getMediaItem());
        C0170a0 adsConfiguration2 = getAdsConfiguration(c0226o0);
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(adsConfiguration, adsConfiguration2) && this.contentMediaSource.canUpdateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        C0187c c0187c = this.adPlaybackState;
        c0187c.getClass();
        if (c0187c.f1051b <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i = mediaPeriodId.adGroupIndex;
        int i4 = mediaPeriodId.adIndexInAdGroup;
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i];
        if (adMediaSourceHolderArr2.length <= i4) {
            adMediaSourceHolderArr[i] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr2, i4 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[i][i4];
        if (adMediaSourceHolder == null) {
            adMediaSourceHolder = new AdMediaSourceHolder(mediaPeriodId);
            this.adMediaSourceHolders[i][i4] = adMediaSourceHolder;
            maybeUpdateAdMediaSources();
        }
        return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public C0226o0 getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        super.prepareSourceInternal(interfaceC1557c0);
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new RunnableC0435a(this, componentListener, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.f1806id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
        adMediaSourceHolder.getClass();
        adMediaSourceHolder.releaseMediaPeriod(maskingMediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        ComponentListener componentListener = this.componentListener;
        componentListener.getClass();
        this.componentListener = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.mainHandler.post(new RunnableC0435a(this, componentListener, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(C0226o0 c0226o0) {
        this.contentMediaSource.updateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, AbstractC0230p1 abstractC0230p1) {
        if (mediaPeriodId.isAd()) {
            AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
            adMediaSourceHolder.getClass();
            adMediaSourceHolder.handleSourceInfoRefresh(abstractC0230p1);
        } else {
            AbstractC1101a.m2353d(abstractC0230p1.getPeriodCount() == 1);
            this.contentTimeline = abstractC0230p1;
        }
        maybeUpdateSourceInfo();
    }
}
