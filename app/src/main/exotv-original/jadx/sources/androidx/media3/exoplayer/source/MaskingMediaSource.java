package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final C0221m1 period;
    private MaskingTimeline timeline;
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final C0227o1 window;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object MASKING_EXTERNAL_PERIOD_UID = new Object();
        private final Object replacedInternalPeriodUid;
        private final Object replacedInternalWindowUid;

        private MaskingTimeline(AbstractC0230p1 abstractC0230p1, Object obj, Object obj2) {
            super(abstractC0230p1);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public static MaskingTimeline createWithPlaceholderTimeline(C0226o0 c0226o0) {
            return new MaskingTimeline(new PlaceholderTimeline(c0226o0), C0227o1.f1250q, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static MaskingTimeline createWithRealTimeline(AbstractC0230p1 abstractC0230p1, Object obj, Object obj2) {
            return new MaskingTimeline(abstractC0230p1, obj, obj2);
        }

        public MaskingTimeline cloneWithUpdatedTimeline(AbstractC0230p1 abstractC0230p1) {
            return new MaskingTimeline(abstractC0230p1, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            AbstractC0230p1 abstractC0230p1 = this.timeline;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return abstractC0230p1.getIndexOfPeriod(obj);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            this.timeline.getPeriod(i, c0221m1, z7);
            Object obj = c0221m1.f1205b;
            Object obj2 = this.replacedInternalPeriodUid;
            int i4 = AbstractC1118i0.f4750a;
            if (Objects.equals(obj, obj2) && z7) {
                c0221m1.f1205b = MASKING_EXTERNAL_PERIOD_UID;
            }
            return c0221m1;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public Object getUidOfPeriod(int i) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i);
            Object obj = this.replacedInternalPeriodUid;
            int i4 = AbstractC1118i0.f4750a;
            return Objects.equals(uidOfPeriod, obj) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            this.timeline.getWindow(i, c0227o1, j);
            if (Objects.equals(c0227o1.f1260a, this.replacedInternalWindowUid)) {
                c0227o1.f1260a = C0227o1.f1250q;
            }
            return c0227o1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PlaceholderTimeline extends AbstractC0230p1 {
        private final C0226o0 mediaItem;

        public PlaceholderTimeline(C0226o0 c0226o0) {
            this.mediaItem = c0226o0;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getIndexOfPeriod(Object obj) {
            return obj == MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            c0221m1.m644i(z7 ? 0 : null, z7 ? MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID : null, 0, -9223372036854775807L, 0L, C0187c.f1044g, true);
            return c0221m1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public Object getUidOfPeriod(int i) {
            return MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            c0227o1.m655b(C0227o1.f1250q, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c0227o1.f1270k = true;
            return c0227o1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getWindowCount() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z7) {
        super(mediaSource);
        this.useLazyPreparation = z7 && mediaSource.isSingleWindow();
        this.window = new C0227o1();
        this.period = new C0221m1();
        AbstractC0230p1 initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline == null) {
            this.timeline = MaskingTimeline.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        } else {
            this.timeline = MaskingTimeline.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        }
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private boolean setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.f1806id.periodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j8 = this.timeline.getPeriod(indexOfPeriod, this.period).f1207d;
        if (j8 != -9223372036854775807L && j >= j8) {
            j = Math.max(0L, j8 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        return this.mediaSource.canUpdateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public AbstractC0230p1 getTimeline() {
        return this.timeline;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onChildSourceInfoRefreshed(AbstractC0230p1 abstractC0230p1) {
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid;
        if (this.isPrepared) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(abstractC0230p1);
            MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod != null) {
                setPreparePositionOverrideToUnpreparedMaskingPeriod(maskingMediaPeriod.getPreparePositionOverrideUs());
            }
        } else {
            if (!abstractC0230p1.isEmpty()) {
                abstractC0230p1.getWindow(0, this.window);
                C0227o1 c0227o1 = this.window;
                long j = c0227o1.f1271l;
                Object obj = c0227o1.f1260a;
                MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod2 != null) {
                    long preparePositionUs = maskingMediaPeriod2.getPreparePositionUs();
                    this.timeline.getPeriodByUid(this.unpreparedMaskingMediaPeriod.f1806id.periodUid, this.period);
                    long j8 = this.period.f1208e + preparePositionUs;
                    long j9 = j8 != this.timeline.getWindow(0, this.window).f1271l ? j8 : j;
                    Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(this.window, this.period, 0, j9);
                    Object obj2 = periodPositionUs.first;
                    long jLongValue = ((Long) periodPositionUs.second).longValue();
                    this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(abstractC0230p1) : MaskingTimeline.createWithRealTimeline(abstractC0230p1, obj, obj2);
                    MaskingMediaPeriod maskingMediaPeriod3 = this.unpreparedMaskingMediaPeriod;
                    if (maskingMediaPeriod3 != null && setPreparePositionOverrideToUnpreparedMaskingPeriod(jLongValue)) {
                        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.f1806id;
                        mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid));
                    }
                }
                this.hasRealTimeline = true;
                this.isPrepared = true;
                refreshSourceInfo(this.timeline);
                if (mediaPeriodIdCopyWithPeriodUid == null) {
                    MaskingMediaPeriod maskingMediaPeriod4 = this.unpreparedMaskingMediaPeriod;
                    maskingMediaPeriod4.getClass();
                    maskingMediaPeriod4.createPeriod(mediaPeriodIdCopyWithPeriodUid);
                    return;
                }
                return;
            }
            this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(abstractC0230p1) : MaskingTimeline.createWithRealTimeline(abstractC0230p1, C0227o1.f1250q, MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID);
        }
        mediaPeriodIdCopyWithPeriodUid = null;
        this.hasRealTimeline = true;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
        if (mediaPeriodIdCopyWithPeriodUid == null) {
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(C0226o0 c0226o0) {
        if (this.hasRealTimeline) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(new TimelineWithUpdatedMediaItem(this.timeline.timeline, c0226o0));
        } else {
            this.timeline = MaskingTimeline.createWithPlaceholderTimeline(c0226o0);
        }
        this.mediaSource.updateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
            return maskingMediaPeriod;
        }
        this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
        if (!this.hasStartedPreparing) {
            this.hasStartedPreparing = true;
            prepareChildSource();
        }
        return maskingMediaPeriod;
    }
}
