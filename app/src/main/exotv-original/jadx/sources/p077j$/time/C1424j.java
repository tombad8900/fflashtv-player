package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1362d;
import p077j$.time.chrono.InterfaceC1372i;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.j */
/* loaded from: classes2.dex */
public final class C1424j implements InterfaceC1447m, InterfaceC1449o, InterfaceC1362d, Serializable {

    /* renamed from: c */
    public static final C1424j f5568c = m3055I(LocalDate.f5408d, C1426l.f5574e);

    /* renamed from: d */
    public static final C1424j f5569d = m3055I(LocalDate.f5409e, C1426l.f5575f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a */
    public final LocalDate f5570a;

    /* renamed from: b */
    public final C1426l f5571b;

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: E */
    public final InterfaceC1372i mo2951E(AbstractC1462z abstractC1462z) {
        return C1393d0.m3002A(this, abstractC1462z, null);
    }

    /* renamed from: I */
    public static C1424j m3055I(LocalDate localDate, C1426l c1426l) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(c1426l, "time");
        return new C1424j(localDate, c1426l);
    }

    /* renamed from: P */
    public static C1424j m3056P(long j, int i, C1351a0 c1351a0) {
        Objects.requireNonNull(c1351a0, "offset");
        long j8 = i;
        EnumC1435a.NANO_OF_SECOND.m3094X(j8);
        return new C1424j(LocalDate.m2887c0(Math.floorDiv(j + c1351a0.f5419b, 86400)), C1426l.m3067V((((int) Math.floorMod(r5, r7)) * 1000000000) + j8));
    }

    /* renamed from: A */
    public static C1424j m3054A(InterfaceC1448n interfaceC1448n) {
        if (interfaceC1448n instanceof C1424j) {
            return (C1424j) interfaceC1448n;
        }
        if (!(interfaceC1448n instanceof C1393d0)) {
            if (!(interfaceC1448n instanceof C1432r)) {
                try {
                    return new C1424j(LocalDate.m2884F(interfaceC1448n), C1426l.m3065F(interfaceC1448n));
                } catch (C1354c e) {
                    throw new C1354c("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC1448n + " of type " + interfaceC1448n.getClass().getName(), e);
                }
            }
            return ((C1432r) interfaceC1448n).f5591a;
        }
        return ((C1393d0) interfaceC1448n).f5487a;
    }

    public C1424j(LocalDate localDate, C1426l c1426l) {
        this.f5570a = localDate;
        this.f5571b = c1426l;
    }

    /* renamed from: a0 */
    public final C1424j m3062a0(LocalDate localDate, C1426l c1426l) {
        return (this.f5570a == localDate && this.f5571b == c1426l) ? this : new C1424j(localDate, c1426l);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        return enumC1435a.isDateBased() || enumC1435a.m3095Y();
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5571b.mo2908l(interfaceC1452r) : this.f5570a.mo2908l(interfaceC1452r);
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5571b.mo2878f(interfaceC1452r) : this.f5570a.mo2878f(interfaceC1452r);
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5571b.mo2882j(interfaceC1452r) : this.f5570a.mo2882j(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: n */
    public final ChronoLocalDate mo2955n() {
        return this.f5570a;
    }

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: k */
    public final C1426l mo2954k() {
        return this.f5571b;
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return m3062a0(localDate, this.f5571b);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final C1424j mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (((EnumC1435a) interfaceC1452r).m3095Y()) {
                return m3062a0(this.f5570a, this.f5571b.mo2877d(j, interfaceC1452r));
            }
            return m3062a0(this.f5570a.mo2877d(j, interfaceC1452r), this.f5571b);
        }
        return (C1424j) interfaceC1452r.mo3093V(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C1424j mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return (C1424j) interfaceC1454t.mo3097w(this, j);
        }
        switch (AbstractC1423i.f5567a[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return m3060Y(this.f5570a, 0L, 0L, 0L, j);
            case 2:
                C1424j c1424jM3062a0 = m3062a0(this.f5570a.m2903f0(j / 86400000000L), this.f5571b);
                return c1424jM3062a0.m3060Y(c1424jM3062a0.f5570a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1424j c1424jM3062a02 = m3062a0(this.f5570a.m2903f0(j / 86400000), this.f5571b);
                return c1424jM3062a02.m3060Y(c1424jM3062a02.f5570a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m3059X(j);
            case 5:
                return m3060Y(this.f5570a, 0L, j, 0L, 0L);
            case 6:
                return m3060Y(this.f5570a, j, 0L, 0L, 0L);
            case 7:
                C1424j c1424jM3062a03 = m3062a0(this.f5570a.m2903f0(j / 256), this.f5571b);
                return c1424jM3062a03.m3060Y(c1424jM3062a03.f5570a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m3062a0(this.f5570a.mo2880h(j, interfaceC1454t), this.f5571b);
        }
    }

    /* renamed from: X */
    public final C1424j m3059X(long j) {
        return m3060Y(this.f5570a, 0L, 0L, j, 0L);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1362d mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    /* renamed from: Y */
    public final C1424j m3060Y(LocalDate localDate, long j, long j8, long j9, long j10) {
        if ((j | j8 | j9 | j10) == 0) {
            return m3062a0(localDate, this.f5571b);
        }
        long j11 = 1;
        long jM3075d0 = this.f5571b.m3075d0();
        long j12 = ((((j % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L)) * j11) + jM3075d0;
        long jFloorDiv = Math.floorDiv(j12, 86400000000000L) + (((j / 24) + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L)) * j11);
        long jFloorMod = Math.floorMod(j12, 86400000000000L);
        return m3062a0(localDate.m2903f0(jFloorDiv), jFloorMod == jM3075d0 ? this.f5571b : C1426l.m3067V(jFloorMod));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5625f) {
            return this.f5570a;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.chrono.InterfaceC1362d, java.lang.Comparable
    /* renamed from: O */
    public final int compareTo(InterfaceC1362d interfaceC1362d) {
        if (interfaceC1362d instanceof C1424j) {
            return m3063w((C1424j) interfaceC1362d);
        }
        return super.compareTo(interfaceC1362d);
    }

    /* renamed from: w */
    public final int m3063w(C1424j c1424j) {
        int iM2912w = this.f5570a.m2912w(c1424j.f5570a);
        return iM2912w == 0 ? this.f5571b.compareTo(c1424j.f5571b) : iM2912w;
    }

    /* renamed from: F */
    public final boolean m3057F(InterfaceC1362d interfaceC1362d) {
        if (interfaceC1362d instanceof C1424j) {
            return m3063w((C1424j) interfaceC1362d) < 0;
        }
        long jMo2891K = this.f5570a.mo2891K();
        long jMo2891K2 = interfaceC1362d.mo2955n().mo2891K();
        if (jMo2891K >= jMo2891K2) {
            return jMo2891K == jMo2891K2 && this.f5571b.m3075d0() < interfaceC1362d.mo2954k().m3075d0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1424j) {
            C1424j c1424j = (C1424j) obj;
            if (this.f5570a.equals(c1424j.f5570a) && this.f5571b.equals(c1424j.f5571b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5570a.hashCode() ^ this.f5571b.hashCode();
    }

    public final String toString() {
        return this.f5570a.toString() + "T" + this.f5571b.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
