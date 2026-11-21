package p077j$.time.chrono;

import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1421g;
import p077j$.time.C1426l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.i */
/* loaded from: classes2.dex */
public interface InterfaceC1372i extends InterfaceC1447m, Comparable {
    /* renamed from: D */
    InterfaceC1372i mo2962D(AbstractC1462z abstractC1462z);

    /* renamed from: J */
    AbstractC1462z mo2963J();

    /* renamed from: o */
    C1351a0 mo2969o();

    /* renamed from: x */
    InterfaceC1362d mo2971x();

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    default C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r != EnumC1435a.INSTANT_SECONDS && interfaceC1452r != EnumC1435a.OFFSET_SECONDS) {
                return mo2971x().mo2908l(interfaceC1452r);
            }
            return ((EnumC1435a) interfaceC1452r).f5602b;
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    default int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1370h.f5444a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                throw new C1455u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return mo2971x().mo2878f(interfaceC1452r);
            }
            return mo2969o().f5419b;
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    default long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1370h.f5444a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                return m2964W();
            }
            if (i != 2) {
                return mo2971x().mo2882j(interfaceC1452r);
            }
            return mo2969o().f5419b;
        }
        return interfaceC1452r.mo3092P(this);
    }

    /* renamed from: n */
    default ChronoLocalDate mo2968n() {
        return mo2971x().mo2955n();
    }

    /* renamed from: k */
    default C1426l mo2966k() {
        return mo2971x().mo2954k();
    }

    /* renamed from: e */
    default InterfaceC1377l m2965e() {
        return mo2968n().mo2901e();
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: m */
    default InterfaceC1372i mo2967m(InterfaceC1449o interfaceC1449o) {
        return C1376k.m2977w(m2965e(), interfaceC1449o.mo2876c(this));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    default InterfaceC1372i mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return C1376k.m2977w(m2965e(), super.mo2874a(j, interfaceC1454t));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    default Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5624e || c1421g == AbstractC1453s.f5620a) {
            return mo2963J();
        }
        if (c1421g == AbstractC1453s.f5623d) {
            return mo2969o();
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return mo2966k();
        }
        if (c1421g == AbstractC1453s.f5621b) {
            return m2965e();
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        return c1421g.m3053l(this);
    }

    /* renamed from: W */
    default long m2964W() {
        return ((mo2968n().mo2891K() * 86400) + mo2966k().m3076e0()) - mo2969o().f5419b;
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC1372i interfaceC1372i) {
        int iCompare = Long.compare(m2964W(), interfaceC1372i.m2964W());
        return (iCompare == 0 && (iCompare = mo2966k().f5581d - interfaceC1372i.mo2966k().f5581d) == 0 && (iCompare = mo2971x().compareTo(interfaceC1372i.mo2971x())) == 0 && (iCompare = mo2963J().mo2920q().compareTo(interfaceC1372i.mo2963J().mo2920q())) == 0) ? ((AbstractC1356a) m2965e()).mo2939q().compareTo(interfaceC1372i.m2965e().mo2939q()) : iCompare;
    }
}
