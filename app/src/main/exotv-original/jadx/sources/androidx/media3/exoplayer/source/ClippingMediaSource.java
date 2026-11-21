package androidx.media3.exoplayer.source;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final C0227o1 window;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(AbstractC0230p1 abstractC0230p1, long j, long j8) throws IllegalClippingException {
            super(abstractC0230p1);
            boolean z7 = false;
            if (abstractC0230p1.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            C0227o1 window = abstractC0230p1.getWindow(0, new C0227o1());
            long jMax = Math.max(0L, j);
            if (!window.f1270k && jMax != 0 && !window.f1267h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j8 == Long.MIN_VALUE ? window.f1272m : Math.max(0L, j8);
            long j9 = window.f1272m;
            if (j9 != -9223372036854775807L) {
                long j10 = jMax2 > j9 ? j9 : jMax2;
                if (jMax > j10) {
                    throw new IllegalClippingException(2, jMax, j10);
                }
                jMax2 = j10;
            }
            this.startUs = jMax;
            this.endUs = jMax2;
            this.durationUs = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (window.f1268i && (jMax2 == -9223372036854775807L || (j9 != -9223372036854775807L && jMax2 == j9))) {
                z7 = true;
            }
            this.isDynamic = z7;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            this.timeline.getPeriod(0, c0221m1, z7);
            long j = c0221m1.f1208e - this.startUs;
            long j8 = this.durationUs;
            c0221m1.m644i(c0221m1.f1204a, c0221m1.f1205b, 0, j8 != -9223372036854775807L ? j8 - j : -9223372036854775807L, j, C0187c.f1044g, false);
            return c0221m1;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            this.timeline.getWindow(0, c0227o1, 0L);
            long j8 = c0227o1.f1275p;
            long j9 = this.startUs;
            c0227o1.f1275p = j8 + j9;
            c0227o1.f1272m = this.durationUs;
            c0227o1.f1268i = this.isDynamic;
            long j10 = c0227o1.f1271l;
            if (j10 != -9223372036854775807L) {
                long jMax = Math.max(j10, j9);
                c0227o1.f1271l = jMax;
                long j11 = this.endUs;
                if (j11 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j11);
                }
                c0227o1.f1271l = jMax - this.startUs;
            }
            long jM2447f0 = AbstractC1118i0.m2447f0(this.startUs);
            long j12 = c0227o1.f1264e;
            if (j12 != -9223372036854775807L) {
                c0227o1.f1264e = j12 + jM2447f0;
            }
            long j13 = c0227o1.f1265f;
            if (j13 != -9223372036854775807L) {
                c0227o1.f1265f = j13 + jM2447f0;
            }
            return c0227o1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }

        private static String getReasonDescription(int i, long j, long j8) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i != 2) {
                return "unknown";
            }
            AbstractC1101a.m2359j((j == -9223372036854775807L || j8 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j + ", End time: " + j8;
        }

        public IllegalClippingException(int i, long j, long j8) {
            super("Illegal clipping: " + getReasonDescription(i, j, j8));
            this.reason = i;
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j, long j8) {
        this(mediaSource, j, j8, true, false, false);
    }

    private void refreshClippedTimeline(AbstractC0230p1 abstractC0230p1) {
        long j;
        long j8;
        abstractC0230p1.getWindow(0, this.window);
        long j9 = this.window.f1275p;
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            j = this.startUs;
            long j10 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long j11 = this.window.f1271l;
                j += j11;
                j8 = j11 + j10;
            } else {
                j8 = j10;
            }
            this.periodStartUs = j9 + j;
            this.periodEndUs = j10 != Long.MIN_VALUE ? j9 + j8 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i = 0; i < size; i++) {
                this.mediaPeriods.get(i).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j = j8;
        } else {
            j = this.periodStartUs - j9;
            if (this.endUs != Long.MIN_VALUE) {
                j = this.periodEndUs - j9;
            }
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(abstractC0230p1, j, j);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e) {
            this.clippingError = e;
            for (int i4 = 0; i4 < this.mediaPeriods.size(); i4++) {
                this.mediaPeriods.get(i4).setClippingError(this.clippingError);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        return getMediaItem().f1242e.equals(c0226o0.f1242e) && this.mediaSource.canUpdateMediaItem(c0226o0);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(AbstractC0230p1 abstractC0230p1) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(abstractC0230p1);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        AbstractC1101a.m2359j(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        ClippingTimeline clippingTimeline = this.clippingTimeline;
        clippingTimeline.getClass();
        refreshClippedTimeline(clippingTimeline.timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long j) {
        this(mediaSource, 0L, j, true, false, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(MediaSource mediaSource, long j, long j8, boolean z7, boolean z8, boolean z9) {
        super(mediaSource);
        mediaSource.getClass();
        AbstractC1101a.m2353d(j >= 0);
        this.startUs = j;
        this.endUs = j8;
        this.enableInitialDiscontinuity = z7;
        this.allowDynamicClippingUpdates = z8;
        this.relativeToDefaultPosition = z9;
        this.mediaPeriods = new ArrayList<>();
        this.window = new C0227o1();
    }
}
