package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import p063h1.InterfaceC1111f;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0291m implements InterfaceC1122m, InterfaceC1111f {

    /* renamed from: j */
    public final /* synthetic */ LoadEventInfo f1603j;

    /* renamed from: k */
    public final /* synthetic */ MediaLoadData f1604k;

    /* renamed from: l */
    public final /* synthetic */ IOException f1605l;

    /* renamed from: m */
    public final /* synthetic */ boolean f1606m;

    /* renamed from: n */
    public final /* synthetic */ Object f1607n;

    public /* synthetic */ C0291m(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z7) {
        this.f1607n = obj;
        this.f1603j = loadEventInfo;
        this.f1604k = mediaLoadData;
        this.f1605l = iOException;
        this.f1606m = z7;
    }

    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f1607n).lambda$loadError$3(this.f1603j, this.f1604k, this.f1605l, this.f1606m, (MediaSourceEventListener) obj);
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f1607n, this.f1603j, this.f1604k, this.f1605l, this.f1606m);
    }
}
