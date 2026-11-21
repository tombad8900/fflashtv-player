package p086j7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p002a1.AbstractC0008a1;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1327r;
import p076i7.C1279a1;
import p076i7.C1285c1;
import p076i7.C1295g;
import p076i7.C1329s;
import p076i7.InterfaceC1281b0;
import p076i7.InterfaceC1293f0;
import p076i7.InterfaceC1330s0;
import p076i7.RunnableC1309k1;
import p085j6.RunnableC1527q;
import p112m7.AbstractC1925a;
import p112m7.AbstractC1938n;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2227h;
import p195w4.C2685r;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j7.d */
/* loaded from: classes.dex */
public final class C1534d extends AbstractC1327r implements InterfaceC1281b0 {

    /* renamed from: l */
    public final Handler f5854l;

    /* renamed from: m */
    public final boolean f5855m;

    /* renamed from: n */
    public final C1534d f5856n;

    public C1534d(Handler handler, boolean z7) {
        this.f5854l = handler;
        this.f5855m = z7;
        this.f5856n = z7 ? this : new C1534d(handler, true);
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: D */
    public final void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        if (this.f5854l.post(runnable)) {
            return;
        }
        m3214G(interfaceC2227h, runnable);
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: E */
    public final boolean mo2838E(InterfaceC2227h interfaceC2227h) {
        return (this.f5855m && AbstractC2980h.m5132a(Looper.myLooper(), this.f5854l.getLooper())) ? false : true;
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: F */
    public AbstractC1327r mo2830F(int i) {
        AbstractC1925a.m3765a(1);
        return this;
    }

    /* renamed from: G */
    public final void m3214G(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k);
        if (interfaceC1330s0 != null) {
            ((C1279a1) interfaceC1330s0).m2765m(cancellationException);
        }
        C2054e c2054e = AbstractC1290e0.f5316a;
        ExecutorC2053d.f7598l.mo2822D(interfaceC2227h, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1534d)) {
            return false;
        }
        C1534d c1534d = (C1534d) obj;
        return c1534d.f5854l == this.f5854l && c1534d.f5855m == this.f5855m;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5854l) ^ (this.f5855m ? 1231 : 1237);
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: k */
    public final InterfaceC1293f0 mo2777k(long j, final RunnableC1309k1 runnableC1309k1, InterfaceC2227h interfaceC2227h) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5854l.postDelayed(runnableC1309k1, j)) {
            return new InterfaceC1293f0() { // from class: j7.c
                @Override // p076i7.InterfaceC1293f0
                /* renamed from: c */
                public final void mo2783c() {
                    this.f5852j.f5854l.removeCallbacks(runnableC1309k1);
                }
            };
        }
        m3214G(interfaceC2227h, runnableC1309k1);
        return C1285c1.f5312j;
    }

    @Override // p076i7.AbstractC1327r
    public final String toString() {
        C1534d c1534d;
        String str;
        C2054e c2054e = AbstractC1290e0.f5316a;
        C1534d c1534d2 = AbstractC1938n.f7227a;
        if (this == c1534d2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1534d = c1534d2.f5856n;
            } catch (UnsupportedOperationException unused) {
                c1534d = null;
            }
            str = this == c1534d ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f5854l.toString();
        return this.f5855m ? AbstractC0008a1.m16l(string, ".immediate") : string;
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: x */
    public final void mo2778x(C1295g c1295g) {
        RunnableC1527q runnableC1527q = new RunnableC1527q(c1295g, 9, this);
        if (this.f5854l.postDelayed(runnableC1527q, 400L)) {
            c1295g.m2812x(new C2685r(this, 4, runnableC1527q));
        } else {
            m3214G(c1295g.f5323n, runnableC1527q);
        }
    }
}
