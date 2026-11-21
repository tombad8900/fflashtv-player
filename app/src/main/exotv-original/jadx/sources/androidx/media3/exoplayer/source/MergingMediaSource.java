package androidx.media3.exoplayer.source;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0235r0;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0969h1;
import p052f6.C0972i1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C1021z;
import p052f6.InterfaceC0966g1;
import p089k1.InterfaceC1557c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final C0226o0 PLACEHOLDER_MEDIA_ITEM;
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final Map<Object, Long> clippedDurationsUs;
    private final InterfaceC0966g1 clippedMediaPeriods;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final List<List<MediaPeriodAndId>> mediaPeriods;
    private final MediaSource[] mediaSources;
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final AbstractC0230p1[] timelines;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ClippedTimeline extends ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(AbstractC0230p1 abstractC0230p1, Map<Object, Long> map) {
            super(abstractC0230p1);
            int windowCount = abstractC0230p1.getWindowCount();
            this.windowDurationsUs = new long[abstractC0230p1.getWindowCount()];
            C0227o1 c0227o1 = new C0227o1();
            for (int i = 0; i < windowCount; i++) {
                this.windowDurationsUs[i] = abstractC0230p1.getWindow(i, c0227o1).f1272m;
            }
            int periodCount = abstractC0230p1.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            C0221m1 c0221m1 = new C0221m1();
            for (int i4 = 0; i4 < periodCount; i4++) {
                abstractC0230p1.getPeriod(i4, c0221m1, true);
                Long l8 = map.get(c0221m1.f1205b);
                l8.getClass();
                long jLongValue = l8.longValue();
                long[] jArr = this.periodDurationsUs;
                jLongValue = jLongValue == Long.MIN_VALUE ? c0221m1.f1207d : jLongValue;
                jArr[i4] = jLongValue;
                long j = c0221m1.f1207d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i8 = c0221m1.f1206c;
                    jArr2[i8] = jArr2[i8] - (j - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            super.getPeriod(i, c0221m1, z7);
            c0221m1.f1207d = this.periodDurationsUs[i];
            return c0221m1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            long jMin;
            super.getWindow(i, c0227o1, j);
            long j8 = this.windowDurationsUs[i];
            c0227o1.f1272m = j8;
            if (j8 != -9223372036854775807L) {
                long j9 = c0227o1.f1271l;
                jMin = j9 == -9223372036854775807L ? c0227o1.f1271l : Math.min(j9, j8);
            }
            c0227o1.f1271l = jMin;
            return c0227o1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaPeriodAndId {
        private final MediaPeriod mediaPeriod;
        private final MediaSource.MediaPeriodId mediaPeriodId;

        private MediaPeriodAndId(MediaSource.MediaPeriodId mediaPeriodId, MediaPeriod mediaPeriod) {
            this.mediaPeriodId = mediaPeriodId;
            this.mediaPeriod = mediaPeriod;
        }
    }

    static {
        C0188c0 c0188c0 = new C0188c0();
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        C0981l1 c0981l1 = C0981l1.f4211n;
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l12 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        PLACEHOLDER_MEDIA_ITEM = new C0226o0("MergingMediaSource", new C0196e0(c0188c0), null, new C0208i0(c0205h0), C0235r0.f1329K, C0214k0.f1167d);
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    private void computePeriodTimeOffsets() {
        C0221m1 c0221m1 = new C0221m1();
        for (int i = 0; i < this.periodCount; i++) {
            long j = -this.timelines[0].getPeriod(i, c0221m1).f1208e;
            int i4 = 1;
            while (true) {
                AbstractC0230p1[] abstractC0230p1Arr = this.timelines;
                if (i4 < abstractC0230p1Arr.length) {
                    this.periodTimeOffsetsUs[i][i4] = j - (-abstractC0230p1Arr[i4].getPeriod(i, c0221m1).f1208e);
                    i4++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        AbstractC0230p1[] abstractC0230p1Arr;
        C0221m1 c0221m1 = new C0221m1();
        for (int i = 0; i < this.periodCount; i++) {
            int i4 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                abstractC0230p1Arr = this.timelines;
                if (i4 >= abstractC0230p1Arr.length) {
                    break;
                }
                long j8 = abstractC0230p1Arr[i4].getPeriod(i, c0221m1).f1207d;
                if (j8 != -9223372036854775807L) {
                    long j9 = j8 + this.periodTimeOffsetsUs[i][i4];
                    if (j == Long.MIN_VALUE || j9 < j) {
                        j = j9;
                    }
                }
                i4++;
            }
            Object uidOfPeriod = abstractC0230p1Arr[0].getUidOfPeriod(i);
            this.clippedDurationsUs.put(uidOfPeriod, Long.valueOf(j));
            Iterator it = this.clippedMediaPeriods.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                ((ClippingMediaPeriod) it.next()).updateClipping(0L, j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 && mediaSourceArr[0].canUpdateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i = 0; i < length; i++) {
            MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(this.timelines[i].getUidOfPeriod(indexOfPeriod));
            mediaPeriodArr[i] = this.mediaSources[i].createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j - this.periodTimeOffsetsUs[indexOfPeriod][i]);
            this.mediaPeriods.get(i).add(new MediaPeriodAndId(mediaPeriodIdCopyWithPeriodUid, mediaPeriodArr[i]));
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (!this.clipDurations) {
            return mergingMediaPeriod;
        }
        Long l8 = this.clippedDurationsUs.get(mediaPeriodId.periodUid);
        l8.getClass();
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, true, 0L, l8.longValue());
        this.clippedMediaPeriods.put(mediaPeriodId.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public C0226o0 getMediaItem() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        super.prepareSourceInternal(interfaceC1557c0);
        for (int i = 0; i < this.mediaSources.length; i++) {
            prepareChildSource(Integer.valueOf(i), this.mediaSources[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator it = this.clippedMediaPeriods.mo2125a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((ClippingMediaPeriod) entry.getValue()).equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        for (int i = 0; i < this.mediaSources.length; i++) {
            List<MediaPeriodAndId> list = this.mediaPeriods.get(i);
            int i4 = 0;
            while (true) {
                if (i4 >= list.size()) {
                    break;
                }
                if (list.get(i4).mediaPeriod.equals(mediaPeriod)) {
                    list.remove(i4);
                    break;
                }
                i4++;
            }
            this.mediaSources[i].releasePeriod(mergingMediaPeriod.getChildPeriod(i));
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(C0226o0 c0226o0) {
        this.mediaSources[0].updateMediaItem(c0226o0);
    }

    public MergingMediaSource(boolean z7, MediaSource... mediaSourceArr) {
        this(z7, false, mediaSourceArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        List<MediaPeriodAndId> list = this.mediaPeriods.get(num.intValue());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mediaPeriodId.equals(mediaPeriodId)) {
                return this.mediaPeriods.get(0).get(i).mediaPeriodId;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, AbstractC0230p1 abstractC0230p1) {
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            this.periodCount = abstractC0230p1.getPeriodCount();
        } else if (abstractC0230p1.getPeriodCount() != this.periodCount) {
            this.mergeError = new IllegalMergeException(0);
            return;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.periodCount, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = abstractC0230p1;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            AbstractC0230p1 clippedTimeline = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                clippedTimeline = new ClippedTimeline(clippedTimeline, this.clippedDurationsUs);
            }
            refreshSourceInfo(clippedTimeline);
        }
    }

    public MergingMediaSource(boolean z7, boolean z8, MediaSource... mediaSourceArr) {
        this(z7, z8, new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(boolean z7, boolean z8, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z7;
        this.clipDurations = z8;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.mediaPeriods = new ArrayList(mediaSourceArr.length);
        for (int i = 0; i < mediaSourceArr.length; i++) {
            this.mediaPeriods.add(new ArrayList());
        }
        this.timelines = new AbstractC0230p1[mediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0][];
        this.clippedDurationsUs = new HashMap();
        AbstractC1006u.m2188c(8, "expectedKeys");
        AbstractC1006u.m2188c(2, "expectedValuesPerKey");
        C1021z c1021zM2212a = C1021z.m2212a(8);
        C0969h1 c0969h1 = new C0969h1();
        C0972i1 c0972i1 = new C0972i1(c1021zM2212a);
        c0972i1.f4200p = c0969h1;
        this.clippedMediaPeriods = c0972i1;
    }
}
