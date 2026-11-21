package p151r3;

import android.view.View;
import androidx.lifecycle.AbstractC0150o;
import androidx.media3.common.C0169a;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p076i7.EnumC1335v;
import p082j3.C1492e;
import p112m7.AbstractC1938n;
import p127o7.C2054e;
import p137p6.C2223d;
import p137p6.C2228i;
import p137p6.InterfaceC2227h;
import p169t3.C2433a;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.u */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2309u implements View.OnAttachStateChangeListener {

    /* renamed from: j */
    public final View f8086j;

    /* renamed from: k */
    public C0169a f8087k;

    /* renamed from: l */
    public C1278a0 f8088l;

    /* renamed from: m */
    public C2308t f8089m;

    /* renamed from: n */
    public boolean f8090n;

    public ViewOnAttachStateChangeListenerC2309u(View view) {
        this.f8086j = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized void m4098a() {
        try {
            C1278a0 c1278a0 = this.f8088l;
            if (c1278a0 != null) {
                AbstractC1339x.m2841b(c1278a0);
            }
            C2054e c2054e = AbstractC1290e0.f5316a;
            InterfaceC2227h interfaceC2227h = AbstractC1938n.f7227a.f5856n;
            char c8 = 1;
            char c9 = 1;
            InterfaceC2855p c1492e = new C1492e(this, null, 1);
            if ((2 & 1) != 0) {
                interfaceC2227h = C2228i.f7747j;
            }
            EnumC1335v enumC1335v = EnumC1335v.f5372j;
            InterfaceC2227h interfaceC2227hM2843d = AbstractC1339x.m2843d(C2228i.f7747j, interfaceC2227h, true);
            C2054e c2054e2 = AbstractC1290e0.f5316a;
            if (interfaceC2227hM2843d != c2054e2 && interfaceC2227hM2843d.mo2760b(C2223d.f7746j) == null) {
                interfaceC2227hM2843d = interfaceC2227hM2843d.mo2761c(c2054e2);
            }
            EnumC1335v enumC1335v2 = EnumC1335v.f5372j;
            C1278a0 c1278a02 = new C1278a0(interfaceC2227hM2843d, c9 == true ? 1 : 0, c8 == true ? 1 : 0);
            c1278a02.m2741T(enumC1335v, c1278a02, c1492e);
            this.f8088l = c1278a02;
            this.f8087k = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C2308t c2308t = this.f8089m;
        if (c2308t == null) {
            return;
        }
        this.f8090n = true;
        c2308t.f8081j.m2582b(c2308t.f8082k);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C2308t c2308t = this.f8089m;
        if (c2308t != null) {
            AbstractC0150o abstractC0150o = c2308t.f8084m;
            AbstractC1339x.m2841b(c2308t.f8085n);
            C2433a c2433a = c2308t.f8083l;
            if (c2433a != null) {
                abstractC0150o.mo575i(c2433a);
            }
            abstractC0150o.mo575i(c2308t);
        }
    }
}
