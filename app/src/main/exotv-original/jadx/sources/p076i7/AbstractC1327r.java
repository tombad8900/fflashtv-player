package p076i7;

import p061g7.C1065l;
import p112m7.AbstractC1925a;
import p112m7.C1931g;
import p137p6.AbstractC2220a;
import p137p6.C2223d;
import p137p6.InterfaceC2224e;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2226g;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.r */
/* loaded from: classes.dex */
public abstract class AbstractC1327r extends AbstractC2220a implements InterfaceC2224e {

    /* renamed from: k */
    public static final C1325q f5365k = new C1325q(C2223d.f7746j, new C1065l(2));

    public AbstractC1327r() {
        super(C2223d.f7746j);
    }

    /* renamed from: D */
    public abstract void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable);

    /* renamed from: E */
    public boolean mo2838E(InterfaceC2227h interfaceC2227h) {
        return !(this instanceof AbstractC1315m1);
    }

    /* renamed from: F */
    public AbstractC1327r mo2830F(int i) {
        AbstractC1925a.m3765a(i);
        return new C1931g(this, i);
    }

    @Override // p137p6.AbstractC2220a, p137p6.InterfaceC2227h
    /* renamed from: b */
    public final InterfaceC2225f mo2760b(InterfaceC2226g interfaceC2226g) {
        InterfaceC2225f interfaceC2225f;
        AbstractC2980h.m5136e("key", interfaceC2226g);
        if (interfaceC2226g instanceof C1325q) {
            C1325q c1325q = (C1325q) interfaceC2226g;
            InterfaceC2226g interfaceC2226g2 = this.f7743j;
            if ((interfaceC2226g2 == c1325q || c1325q.f5363k == interfaceC2226g2) && (interfaceC2225f = (InterfaceC2225f) c1325q.f5362j.invoke(this)) != null) {
                return interfaceC2225f;
            }
        } else if (C2223d.f7746j == interfaceC2226g) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((p137p6.InterfaceC2225f) r3.f5362j.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (p137p6.C2223d.f7746j == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return p137p6.C2228i.f7747j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // p137p6.AbstractC2220a, p137p6.InterfaceC2227h
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2227h mo2762g(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        if (interfaceC2226g instanceof C1325q) {
            C1325q c1325q = (C1325q) interfaceC2226g;
            InterfaceC2226g interfaceC2226g2 = this.f7743j;
            if (interfaceC2226g2 != c1325q) {
                if (c1325q.f5363k != interfaceC2226g2) {
                    return this;
                }
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1339x.m2845f(this);
    }
}
