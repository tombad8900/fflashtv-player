package p137p6;

import java.io.Serializable;
import okhttp3.C2181z;
import p076i7.C1322p;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p6.b */
/* loaded from: classes.dex */
public final class C2221b implements InterfaceC2227h, Serializable {

    /* renamed from: j */
    public final InterfaceC2227h f7744j;

    /* renamed from: k */
    public final InterfaceC2225f f7745k;

    public C2221b(InterfaceC2225f interfaceC2225f, InterfaceC2227h interfaceC2227h) {
        AbstractC2980h.m5136e("left", interfaceC2227h);
        this.f7744j = interfaceC2227h;
        this.f7745k = interfaceC2225f;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: b */
    public final InterfaceC2225f mo2760b(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        C2221b c2221b = this;
        while (true) {
            InterfaceC2225f interfaceC2225fMo2760b = c2221b.f7745k.mo2760b(interfaceC2226g);
            if (interfaceC2225fMo2760b != null) {
                return interfaceC2225fMo2760b;
            }
            InterfaceC2227h interfaceC2227h = c2221b.f7744j;
            if (!(interfaceC2227h instanceof C2221b)) {
                return interfaceC2227h.mo2760b(interfaceC2226g);
            }
            c2221b = (C2221b) interfaceC2227h;
        }
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: c */
    public final InterfaceC2227h mo2761c(InterfaceC2227h interfaceC2227h) {
        AbstractC2980h.m5136e("context", interfaceC2227h);
        return interfaceC2227h == C2228i.f7747j ? this : (InterfaceC2227h) interfaceC2227h.mo2770t(this, new C1322p(7));
    }

    public final boolean equals(Object obj) {
        boolean zM5132a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2221b) {
            C2221b c2221b = (C2221b) obj;
            int i = 2;
            C2221b c2221b2 = c2221b;
            int i4 = 2;
            while (true) {
                InterfaceC2227h interfaceC2227h = c2221b2.f7744j;
                c2221b2 = interfaceC2227h instanceof C2221b ? (C2221b) interfaceC2227h : null;
                if (c2221b2 == null) {
                    break;
                }
                i4++;
            }
            C2221b c2221b3 = this;
            while (true) {
                InterfaceC2227h interfaceC2227h2 = c2221b3.f7744j;
                c2221b3 = interfaceC2227h2 instanceof C2221b ? (C2221b) interfaceC2227h2 : null;
                if (c2221b3 == null) {
                    break;
                }
                i++;
            }
            if (i4 == i) {
                C2221b c2221b4 = this;
                while (true) {
                    InterfaceC2225f interfaceC2225f = c2221b4.f7745k;
                    if (!AbstractC2980h.m5132a(c2221b.mo2760b(interfaceC2225f.getKey()), interfaceC2225f)) {
                        zM5132a = false;
                        break;
                    }
                    InterfaceC2227h interfaceC2227h3 = c2221b4.f7744j;
                    if (!(interfaceC2227h3 instanceof C2221b)) {
                        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", interfaceC2227h3);
                        InterfaceC2225f interfaceC2225f2 = (InterfaceC2225f) interfaceC2227h3;
                        zM5132a = AbstractC2980h.m5132a(c2221b.mo2760b(interfaceC2225f2.getKey()), interfaceC2225f2);
                        break;
                    }
                    c2221b4 = (C2221b) interfaceC2227h3;
                }
                if (zM5132a) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: g */
    public final InterfaceC2227h mo2762g(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        InterfaceC2225f interfaceC2225f = this.f7745k;
        InterfaceC2225f interfaceC2225fMo2760b = interfaceC2225f.mo2760b(interfaceC2226g);
        InterfaceC2227h interfaceC2227h = this.f7744j;
        if (interfaceC2225fMo2760b != null) {
            return interfaceC2227h;
        }
        InterfaceC2227h interfaceC2227hMo2762g = interfaceC2227h.mo2762g(interfaceC2226g);
        return interfaceC2227hMo2762g == interfaceC2227h ? this : interfaceC2227hMo2762g == C2228i.f7747j ? interfaceC2225f : new C2221b(interfaceC2225f, interfaceC2227hMo2762g);
    }

    public final int hashCode() {
        return this.f7745k.hashCode() + this.f7744j.hashCode();
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: t */
    public final Object mo2770t(Object obj, InterfaceC2855p interfaceC2855p) {
        return interfaceC2855p.mo576c(this.f7744j.mo2770t(obj, interfaceC2855p), this.f7745k);
    }

    public final String toString() {
        return "[" + ((String) mo2770t(C2181z.FRAGMENT_ENCODE_SET, new C1322p(6))) + ']';
    }
}
