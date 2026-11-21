package androidx.media3.exoplayer.source;

import p063h1.InterfaceC1111f;
import p115n1.InterfaceC1968c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0450l implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1845j;

    /* renamed from: k */
    public final /* synthetic */ Object f1846k;

    /* renamed from: l */
    public final /* synthetic */ Object f1847l;

    public /* synthetic */ RunnableC0450l(Object obj, int i, Object obj2) {
        this.f1845j = i;
        this.f1846k = obj;
        this.f1847l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1845j) {
            case 0:
                ((ProgressiveMediaPeriod) this.f1846k).lambda$seekMap$1((InterfaceC1968c0) this.f1847l);
                break;
            default:
                ((InterfaceC1111f) this.f1846k).accept((MediaSourceEventListener) this.f1847l);
                break;
        }
    }
}
