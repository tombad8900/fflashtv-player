package p077j$.time.chrono;

import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1421g;
import p077j$.time.C1426l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.d */
/* loaded from: classes2.dex */
public interface InterfaceC1362d extends InterfaceC1447m, InterfaceC1449o, Comparable {
    /* renamed from: E */
    InterfaceC1372i mo2951E(AbstractC1462z abstractC1462z);

    /* renamed from: k */
    C1426l mo2954k();

    /* renamed from: n */
    ChronoLocalDate mo2955n();

    /* renamed from: e */
    default InterfaceC1377l m2953e() {
        return mo2955n().mo2901e();
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    default InterfaceC1362d mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return C1366f.m2957w(m2953e(), super.mo2874a(j, interfaceC1454t));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    default Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5620a || c1421g == AbstractC1453s.f5624e || c1421g == AbstractC1453s.f5623d) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return mo2954k();
        }
        if (c1421g == AbstractC1453s.f5621b) {
            return m2953e();
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    default InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(mo2955n().mo2891K(), EnumC1435a.EPOCH_DAY).mo2877d(mo2954k().m3075d0(), EnumC1435a.NANO_OF_DAY);
    }

    /* renamed from: v */
    default long m2956v(C1351a0 c1351a0) {
        Objects.requireNonNull(c1351a0, "offset");
        return ((mo2955n().mo2891K() * 86400) + mo2954k().m3076e0()) - c1351a0.f5419b;
    }

    @Override // java.lang.Comparable
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC1362d interfaceC1362d) {
        int iCompareTo = mo2955n().compareTo(interfaceC1362d.mo2955n());
        return (iCompareTo == 0 && (iCompareTo = mo2954k().compareTo(interfaceC1362d.mo2954k())) == 0) ? ((AbstractC1356a) m2953e()).mo2939q().compareTo(interfaceC1362d.m2953e().mo2939q()) : iCompareTo;
    }
}
