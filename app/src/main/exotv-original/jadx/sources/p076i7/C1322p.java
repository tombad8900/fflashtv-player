package p076i7;

import p002a1.AbstractC0008a1;
import p112m7.C1946v;
import p137p6.C2221b;
import p137p6.C2223d;
import p137p6.C2228i;
import p137p6.InterfaceC2224e;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2227h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C1322p implements InterfaceC2855p {

    /* renamed from: j */
    public final /* synthetic */ int f5361j;

    public /* synthetic */ C1322p(int i) {
        this.f5361j = i;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        C2221b c2221b;
        switch (this.f5361j) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            case 1:
                return ((InterfaceC2227h) obj).mo2761c((InterfaceC2225f) obj2);
            case 2:
                return ((InterfaceC2227h) obj).mo2761c((InterfaceC2225f) obj2);
            case 3:
                return obj;
            case 4:
                AbstractC0008a1.m22r(obj);
                return null;
            case 5:
                return (C1946v) obj;
            case 6:
                String str = (String) obj;
                InterfaceC2225f interfaceC2225f = (InterfaceC2225f) obj2;
                AbstractC2980h.m5136e("acc", str);
                if (str.length() == 0) {
                    return interfaceC2225f.toString();
                }
                return str + ", " + interfaceC2225f;
            default:
                InterfaceC2227h interfaceC2227h = (InterfaceC2227h) obj;
                InterfaceC2225f interfaceC2225f2 = (InterfaceC2225f) obj2;
                AbstractC2980h.m5136e("acc", interfaceC2227h);
                InterfaceC2227h interfaceC2227hMo2762g = interfaceC2227h.mo2762g(interfaceC2225f2.getKey());
                C2228i c2228i = C2228i.f7747j;
                if (interfaceC2227hMo2762g == c2228i) {
                    return interfaceC2225f2;
                }
                C2223d c2223d = C2223d.f7746j;
                InterfaceC2224e interfaceC2224e = (InterfaceC2224e) interfaceC2227hMo2762g.mo2760b(c2223d);
                if (interfaceC2224e == null) {
                    c2221b = new C2221b(interfaceC2225f2, interfaceC2227hMo2762g);
                } else {
                    InterfaceC2227h interfaceC2227hMo2762g2 = interfaceC2227hMo2762g.mo2762g(c2223d);
                    if (interfaceC2227hMo2762g2 == c2228i) {
                        return new C2221b(interfaceC2224e, interfaceC2225f2);
                    }
                    c2221b = new C2221b(interfaceC2224e, new C2221b(interfaceC2225f2, interfaceC2227hMo2762g2));
                }
                return c2221b;
        }
    }
}
