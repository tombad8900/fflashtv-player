package p076i7;

import p112m7.C1941q;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.k1 */
/* loaded from: classes.dex */
public final class RunnableC1309k1 extends C1941q implements Runnable {

    /* renamed from: n */
    public final long f5340n;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC1309k1(long j, C1312l1 c1312l1) {
        InterfaceC2227h interfaceC2227h = c1312l1.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        super(c1312l1, interfaceC2227h);
        this.f5340n = j;
    }

    @Override // p076i7.C1279a1
    /* renamed from: I */
    public final String mo2752I() {
        return super.mo2752I() + "(timeMillis=" + this.f5340n + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1339x.m2844e(this.f5305l);
        m2765m(new C1306j1("Timed out waiting for " + this.f5340n + " ms", this));
    }
}
