package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0235r0;
import java.util.Collections;
import java.util.List;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SinglePeriodTimeline extends AbstractC0230p1 {
    private static final C0226o0 MEDIA_ITEM;
    private static final Object UID = new Object();
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final C0208i0 liveConfiguration;
    private final Object manifest;
    private final C0226o0 mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    static {
        C0211j0 c0211j0;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        Uri uri = Uri.EMPTY;
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        C0202g0 c0202g0 = null;
        if (uri != null) {
            if (c0199f0.f1090a != null) {
                c0202g0 = new C0202g0(c0199f0);
            }
            c0211j0 = new C0211j0(uri, null, c0202g0, null, list, null, c0981l1, null, -9223372036854775807L);
        } else {
            c0211j0 = null;
        }
        MEDIA_ITEM = new C0226o0("SinglePeriodTimeline", new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, boolean z7, boolean z8, boolean z9, Object obj, Object obj2) {
        this(j, j, 0L, 0L, z7, z8, z9, obj, obj2);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
        AbstractC1101a.m2356g(i, 1);
        Object obj = z7 ? UID : null;
        long j = this.periodDurationUs;
        long j8 = -this.windowPositionInPeriodUs;
        c0221m1.getClass();
        c0221m1.m644i(null, obj, 0, j, j8, C0187c.f1044g, false);
        return c0221m1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public Object getUidOfPeriod(int i) {
        AbstractC1101a.m2356g(i, 1);
        return UID;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.AbstractC0230p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
        long j8;
        AbstractC1101a.m2356g(i, 1);
        long j9 = this.windowDefaultStartPositionUs;
        boolean z7 = this.isDynamic;
        if (!z7 || this.suppressPositionProjection || j == 0) {
            j8 = j9;
        } else {
            long j10 = this.windowDurationUs;
            if (j10 != -9223372036854775807L) {
                j9 += j;
                if (j9 > j10) {
                }
            }
            j8 = -9223372036854775807L;
        }
        c0227o1.m655b(C0227o1.f1250q, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z7, this.liveConfiguration, j8, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
        return c0227o1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j, boolean z7, boolean z8, boolean z9, Object obj, C0226o0 c0226o0) {
        this(j, j, 0L, 0L, z7, z8, z9, obj, c0226o0);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, Object obj, Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j8, j9, j10, z7, z8, z9, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, Object obj, C0226o0 c0226o0) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j8, j9, j10, z7, z8, false, obj, c0226o0, z9 ? c0226o0.f1240c : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, boolean z9, Object obj, Object obj2) {
        C0226o0 c0226o0 = MEDIA_ITEM;
        C0184b0 c0184b0M652a = c0226o0.m652a();
        c0184b0M652a.f1039j = obj2;
        this(j, j8, j9, j10, j11, j12, j13, z7, z8, false, obj, c0184b0M652a.m608a(), z9 ? c0226o0.f1240c : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, Object obj, C0226o0 c0226o0, C0208i0 c0208i0) {
        this(j, j8, j9, j10, j11, j12, j13, z7, z8, false, obj, c0226o0, c0208i0);
    }

    public SinglePeriodTimeline(long j, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, boolean z9, Object obj, C0226o0 c0226o0, C0208i0 c0208i0) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j8;
        this.elapsedRealtimeEpochOffsetMs = j9;
        this.periodDurationUs = j10;
        this.windowDurationUs = j11;
        this.windowPositionInPeriodUs = j12;
        this.windowDefaultStartPositionUs = j13;
        this.isSeekable = z7;
        this.isDynamic = z8;
        this.suppressPositionProjection = z9;
        this.manifest = obj;
        c0226o0.getClass();
        this.mediaItem = c0226o0;
        this.liveConfiguration = c0208i0;
    }
}
