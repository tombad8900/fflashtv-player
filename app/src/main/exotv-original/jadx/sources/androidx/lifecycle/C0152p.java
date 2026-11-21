package androidx.lifecycle;

import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p024c5.C0656d0;
import p076i7.AbstractC1339x;
import p076i7.C1279a1;
import p076i7.C1303i1;
import p076i7.C1329s;
import p076i7.C1332t0;
import p076i7.InterfaceC1330s0;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public final class C0152p extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f938n;

    /* renamed from: o */
    public /* synthetic */ Object f939o;

    /* renamed from: p */
    public final /* synthetic */ Object f940p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0152p(Object obj, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f938n = i;
        this.f940p = obj;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) throws Throwable {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f938n) {
            case 0:
                C0152p c0152p = (C0152p) mo577g(interfaceC1333u, interfaceC2222c);
                C1693j c1693j = C1693j.f6497a;
                c0152p.mo578h(c1693j);
                return c1693j;
            default:
                return ((C0152p) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f938n) {
            case 0:
                C0152p c0152p = new C0152p((C0154q) this.f940p, interfaceC2222c, 0);
                c0152p.f939o = obj;
                return c0152p;
            default:
                C0152p c0152p2 = new C0152p((C0656d0) this.f940p, interfaceC2222c, 1);
                c0152p2.f939o = obj;
                return c0152p2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return p073i3.C1256e.m2734a((p073i3.C1256e) r2.f2586k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r0.m2819l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        throw r6;
     */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        int i = this.f938n;
        Object obj2 = this.f940p;
        switch (i) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                InterfaceC1333u interfaceC1333u = (InterfaceC1333u) this.f939o;
                C0154q c0154q = (C0154q) obj2;
                AbstractC0150o abstractC0150o = c0154q.f942j;
                if (abstractC0150o.mo569b().compareTo(EnumC0148n.f926k) >= 0) {
                    abstractC0150o.mo568a(c0154q);
                } else {
                    InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) interfaceC1333u.mo579h().mo2760b(C1329s.f5369k);
                    if (interfaceC1330s0 != null) {
                        C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
                        c1279a1.m2765m(new C1332t0(c1279a1.mo2742o(), null, c1279a1));
                    }
                }
                return C1693j.f6497a;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                InterfaceC2227h interfaceC2227hMo579h = ((InterfaceC1333u) this.f939o).mo579h();
                C0656d0 c0656d0 = (C0656d0) obj2;
                try {
                    C1303i1 c1303i1 = new C1303i1();
                    c1303i1.f5334o = AbstractC1339x.m2849j(AbstractC1339x.m2846g(interfaceC2227hMo579h), true, c1303i1);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1303i1.f5332p;
                    while (true) {
                        int i4 = atomicIntegerFieldUpdater.get(c1303i1);
                        if (i4 != 0) {
                            if (i4 != 2 && i4 != 3) {
                                C1303i1.m2818m(i4);
                                throw null;
                            }
                        } else if (!atomicIntegerFieldUpdater.compareAndSet(c1303i1, i4, 0)) {
                        }
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
                break;
        }
    }
}
