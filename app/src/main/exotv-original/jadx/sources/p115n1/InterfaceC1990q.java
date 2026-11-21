package p115n1;

import android.net.Uri;
import java.util.Map;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.C1108d0;
import p064h2.C1146k;
import p072i2.C1244d;
import p079j0.C1481i;
import p090k2.InterfaceC1597o;
import p115n1.InterfaceC1987n;
import p122o1.C2041a;
import p158s1.C2340c;
import p167t1.C2394b;
import p168t2.C2398a;
import p168t2.C2401b0;
import p168t2.C2402c;
import p168t2.C2404d;
import p168t2.C2407e0;
import p176u2.C2458c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.q */
/* loaded from: classes.dex */
public interface InterfaceC1990q {

    /* renamed from: a */
    public static final C1146k f7373a = new InterfaceC1990q() { // from class: h2.k

        /* renamed from: b */
        public final /* synthetic */ int f4882b = 2;

        @Override // p115n1.InterfaceC1990q
        /* renamed from: a */
        public final InterfaceC1987n[] mo967a() {
            switch (this.f4882b) {
                case 0:
                    return new InterfaceC1987n[]{new C1148m(16, InterfaceC1597o.f6077g)};
                case 1:
                    return new InterfaceC1987n[]{new C1244d()};
                case 2:
                    return new InterfaceC1987n[0];
                case 3:
                    return new InterfaceC1987n[]{new C2041a()};
                case 4:
                    return new InterfaceC1987n[]{new C2340c()};
                case 5:
                    return new InterfaceC1987n[]{new C2394b()};
                case 6:
                    return new InterfaceC1987n[]{new C2398a()};
                case 7:
                    return new InterfaceC1987n[]{new C2402c()};
                case 8:
                    return new InterfaceC1987n[]{new C2404d(0)};
                case 9:
                    return new InterfaceC1987n[]{new C2401b0()};
                case 10:
                    C1108d0 c1108d0 = new C1108d0(0L);
                    C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                    return new InterfaceC1987n[]{new C2407e0(1, 1, InterfaceC1597o.f6077g, c1108d0, new C1481i(0, C0981l1.f4211n))};
                default:
                    return new InterfaceC1987n[]{new C2458c()};
            }
        }
    };

    /* renamed from: a */
    InterfaceC1987n[] mo967a();

    /* renamed from: b */
    default void mo3869b(boolean z7) {
    }

    /* renamed from: c */
    default InterfaceC1987n[] mo3870c(Uri uri, Map map) {
        return mo967a();
    }

    default void setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
    }
}
