package p077j$.time.chrono;

import p077j$.time.AbstractC1392d;
import p077j$.time.C1421g;
import p077j$.time.C1426l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* loaded from: classes2.dex */
public interface ChronoLocalDate extends InterfaceC1447m, InterfaceC1449o, Comparable<ChronoLocalDate> {
    /* renamed from: e */
    InterfaceC1377l mo2901e();

    boolean equals(Object obj);

    int hashCode();

    String toString();

    /* renamed from: L */
    default InterfaceC1362d mo2892L(C1426l c1426l) {
        return new C1366f(this, c1426l);
    }

    /* renamed from: N */
    default InterfaceC1378m mo2893N() {
        return mo2901e().mo2932B(mo2878f(EnumC1435a.ERA));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    default boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).isDateBased();
        }
        return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: m */
    default ChronoLocalDate mo2910m(InterfaceC1449o interfaceC1449o) {
        return AbstractC1360c.m2944w(mo2901e(), interfaceC1449o.mo2876c(this));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    default ChronoLocalDate mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return AbstractC1360c.m2944w(mo2901e(), interfaceC1452r.mo3093V(this, j));
    }

    /* renamed from: R */
    default ChronoLocalDate mo2895R(InterfaceC1451q interfaceC1451q) {
        return AbstractC1360c.m2944w(mo2901e(), interfaceC1451q.mo2869w(this));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    default ChronoLocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            throw new C1455u("Unsupported unit: " + interfaceC1454t);
        }
        return AbstractC1360c.m2944w(mo2901e(), interfaceC1454t.mo3097w(this, j));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    default ChronoLocalDate mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return AbstractC1360c.m2944w(mo2901e(), super.mo2874a(j, interfaceC1454t));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    default Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5620a || c1421g == AbstractC1453s.f5624e || c1421g == AbstractC1453s.f5623d || c1421g == AbstractC1453s.f5626g) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5621b) {
            return mo2901e();
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.DAYS;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    default InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(mo2891K(), EnumC1435a.EPOCH_DAY);
    }

    /* renamed from: K */
    default long mo2891K() {
        return mo2882j(EnumC1435a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: U */
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(mo2891K(), chronoLocalDate.mo2891K());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1356a) mo2901e()).mo2939q().compareTo(chronoLocalDate.mo2901e().mo2939q());
    }
}
