package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0223n0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.bumptech.glide.AbstractC0715d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p052f6.AbstractC0983m0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p089k1.C1568l;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1563g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@Deprecated
/* loaded from: classes.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final InterfaceC1563g dataSourceFactory;
    private final C1568l dataSpec;
    private final long durationUs;
    private final C0249w format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final C0226o0 mediaItem;
    private final AbstractC0230p1 timeline;
    private InterfaceC1557c0 transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory {
        private final InterfaceC1563g dataSourceFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private Object tag;
        private String trackId;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(InterfaceC1563g interfaceC1563g) {
            interfaceC1563g.getClass();
            this.dataSourceFactory = interfaceC1563g;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.treatLoadErrorsAsEndOfStream = true;
        }

        public SingleSampleMediaSource createMediaSource(C0223n0 c0223n0, long j) {
            return new SingleSampleMediaSource(this.trackId, c0223n0, this.dataSourceFactory, j, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag);
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        public Factory setTrackId(String str) {
            this.trackId = str;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z7) {
            this.treatLoadErrorsAsEndOfStream = z7;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, this.transferListener, this.format, this.durationUs, this.loadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public C0226o0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        this.transferListener = interfaceC1557c0;
        refreshSourceInfo(this.timeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    private SingleSampleMediaSource(String str, C0223n0 c0223n0, InterfaceC1563g interfaceC1563g, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z7, Object obj) {
        C0205h0 c0205h0;
        C0211j0 c0211j0;
        this.dataSourceFactory = interfaceC1563g;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z7;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h02 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        Uri uri = Uri.EMPTY;
        String string = c0223n0.f1219a.toString();
        string.getClass();
        AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(AbstractC0983m0.m2168n(c0223n0));
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        if (uri != null) {
            C0202g0 c0202g0 = c0199f0.f1090a != null ? new C0202g0(c0199f0) : null;
            c0205h0 = c0205h02;
            c0211j0 = new C0211j0(uri, null, c0202g0, null, list, null, abstractC0983m0M2165j, obj, -9223372036854775807L);
        } else {
            c0205h0 = c0205h02;
            c0211j0 = null;
        }
        C0226o0 c0226o0 = new C0226o0(string, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
        this.mediaItem = c0226o0;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p((String) AbstractC0715d.m1573y(c0223n0.f1220b, "text/x-unknown"));
        c0246v.f1438d = c0223n0.f1221c;
        c0246v.f1439e = c0223n0.f1222d;
        c0246v.f1440f = c0223n0.f1223e;
        c0246v.f1436b = c0223n0.f1224f;
        String str2 = c0223n0.f1225g;
        c0246v.f1435a = str2 == null ? str : str2;
        this.format = new C0249w(c0246v);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = c0223n0.f1219a;
        AbstractC1101a.m2361l("The uri must be set.", uri2);
        this.dataSpec = new C1568l(uri2, 1, null, map, 0L, -1L, null, 1);
        this.timeline = new SinglePeriodTimeline(j, true, false, false, (Object) null, c0226o0);
    }
}
