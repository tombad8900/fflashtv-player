package androidx.lifecycle;

import com.bumptech.glide.AbstractC0714c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.C0064b;
import p004a3.C0067e;
import p004a3.InterfaceC0066d;
import p004a3.InterfaceC0068f;
import p005a4.C0073c;
import p030d1.C0797a;
import p038e1.C0860a;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1294f1;
import p112m7.AbstractC1938n;
import p120o.C2030b;
import p120o.C2034f;
import p127o7.C2054e;
import p137p6.InterfaceC2222c;
import p211y5.C2819f;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0147m0 implements InterfaceC0159s0 {

    /* renamed from: a */
    public static final C2819f f921a = new C2819f(7);

    /* renamed from: b */
    public static final C2819f f922b = new C2819f(8);

    /* renamed from: c */
    public static final C2819f f923c = new C2819f(6);

    /* renamed from: d */
    public static final C2819f f924d = new C2819f(9);

    /* renamed from: c */
    public static final void m564c(AbstractC0157r0 abstractC0157r0, C0067e c0067e, AbstractC0150o abstractC0150o) {
        AutoCloseable autoCloseable;
        AbstractC2980h.m5136e("registry", c0067e);
        AbstractC2980h.m5136e("lifecycle", abstractC0150o);
        C0860a c0860a = abstractC0157r0.f944a;
        if (c0860a != null) {
            synchronized (c0860a.f3794a) {
                autoCloseable = (AutoCloseable) c0860a.f3795b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    /* renamed from: d */
    public static final void m565d(InterfaceC0068f interfaceC0068f) {
        InterfaceC0066d interfaceC0066d;
        EnumC0148n enumC0148nMo569b = interfaceC0068f.mo224e().mo569b();
        if (enumC0148nMo569b != EnumC0148n.f926k && enumC0148nMo569b != EnumC0148n.f927l) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C2034f) interfaceC0068f.mo223c().f309d).iterator();
        while (true) {
            C2030b c2030b = (C2030b) it;
            if (!c2030b.hasNext()) {
                interfaceC0066d = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c2030b.next();
            AbstractC2980h.m5135d("components", entry);
            String str = (String) entry.getKey();
            interfaceC0066d = (InterfaceC0066d) entry.getValue();
            if (AbstractC2980h.m5132a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0066d == null) {
            C0151o0 c0151o0 = new C0151o0(interfaceC0068f.mo223c(), (InterfaceC0163u0) interfaceC0068f);
            interfaceC0068f.mo223c().m254e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0151o0);
            interfaceC0068f.mo224e().mo568a(new C0064b(3, c0151o0));
        }
    }

    /* renamed from: e */
    public static final C0154q m566e(InterfaceC0164v interfaceC0164v) {
        AbstractC2980h.m5136e("<this>", interfaceC0164v);
        AbstractC0150o abstractC0150oMo224e = interfaceC0164v.mo224e();
        AbstractC2980h.m5136e("<this>", abstractC0150oMo224e);
        AtomicReference atomicReference = (AtomicReference) abstractC0150oMo224e.f933j;
        while (true) {
            C0154q c0154q = (C0154q) atomicReference.get();
            if (c0154q != null) {
                return c0154q;
            }
            C1294f1 c1294f1 = new C1294f1();
            C2054e c2054e = AbstractC1290e0.f5316a;
            C0154q c0154q2 = new C0154q(abstractC0150oMo224e, AbstractC0714c.m1508W(c1294f1, AbstractC1938n.f7227a.f5856n));
            do {
                InterfaceC2222c interfaceC2222c = null;
                if (atomicReference.compareAndSet(null, c0154q2)) {
                    C2054e c2054e2 = AbstractC1290e0.f5316a;
                    AbstractC1339x.m2850k(c0154q2, AbstractC1938n.f7227a.f5856n, new C0152p(c0154q2, interfaceC2222c, 0), 2);
                    return c0154q2;
                }
            } while (atomicReference.get() == null);
        }
    }

    /* renamed from: f */
    public static final C0153p0 m567f(InterfaceC0163u0 interfaceC0163u0) {
        C0145l0 c0145l0 = new C0145l0();
        C0161t0 c0161t0Mo222b = interfaceC0163u0.mo222b();
        AbstractC0150o abstractC0150oMo221a = interfaceC0163u0 instanceof InterfaceC0138i ? ((InterfaceC0138i) interfaceC0163u0).mo221a() : C0797a.f3582k;
        AbstractC2980h.m5136e("store", c0161t0Mo222b);
        AbstractC2980h.m5136e("defaultCreationExtras", abstractC0150oMo221a);
        return (C0153p0) new C0073c(c0161t0Mo222b, c0145l0, abstractC0150oMo221a).m270B(AbstractC2987o.m5142a(C0153p0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
