package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1426l;
import p077j$.time.LocalDate;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.f */
/* loaded from: classes2.dex */
public final class C1366f implements InterfaceC1362d, InterfaceC1447m, InterfaceC1449o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a */
    public final transient ChronoLocalDate f5435a;

    /* renamed from: b */
    public final transient C1426l f5436b;

    /* renamed from: w */
    public static C1366f m2957w(InterfaceC1377l interfaceC1377l, InterfaceC1447m interfaceC1447m) {
        C1366f c1366f = (C1366f) interfaceC1447m;
        if (interfaceC1377l.equals(c1366f.m2953e())) {
            return c1366f;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC1377l.mo2939q() + ", actual: " + c1366f.m2953e().mo2939q());
    }

    public C1366f(ChronoLocalDate chronoLocalDate, C1426l c1426l) {
        Objects.requireNonNull(c1426l, "time");
        this.f5435a = chronoLocalDate;
        this.f5436b = c1426l;
    }

    /* renamed from: P */
    public final C1366f m2961P(InterfaceC1447m interfaceC1447m, C1426l c1426l) {
        ChronoLocalDate chronoLocalDate = this.f5435a;
        return (chronoLocalDate == interfaceC1447m && this.f5436b == c1426l) ? this : new C1366f(AbstractC1360c.m2944w(chronoLocalDate.mo2901e(), interfaceC1447m), c1426l);
    }

    public final int hashCode() {
        return this.f5435a.hashCode() ^ this.f5436b.hashCode();
    }

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: n */
    public final ChronoLocalDate mo2955n() {
        return this.f5435a;
    }

    public final String toString() {
        return this.f5435a.toString() + "T" + this.f5436b.toString();
    }

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: k */
    public final C1426l mo2954k() {
        return this.f5436b;
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
            return (((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5436b : this.f5435a).mo2908l(interfaceC1452r);
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5436b.mo2878f(interfaceC1452r) : this.f5435a.mo2878f(interfaceC1452r);
        }
        return mo2908l(interfaceC1452r).m3105a(mo2882j(interfaceC1452r), interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y() ? this.f5436b.mo2882j(interfaceC1452r) : this.f5435a.mo2882j(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return m2961P(localDate, this.f5436b);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C1366f mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (((EnumC1435a) interfaceC1452r).m3095Y()) {
                return m2961P(this.f5435a, this.f5436b.mo2877d(j, interfaceC1452r));
            }
            return m2961P(this.f5435a.mo2877d(j, interfaceC1452r), this.f5436b);
        }
        return m2957w(this.f5435a.mo2901e(), interfaceC1452r.mo3093V(this, j));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C1366f mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return m2957w(this.f5435a.mo2901e(), interfaceC1454t.mo3097w(this, j));
        }
        switch (AbstractC1364e.f5432a[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return m2959F(this.f5435a, 0L, 0L, 0L, j);
            case 2:
                C1366f c1366fM2961P = m2961P(this.f5435a.mo2880h(j / 86400000000L, (InterfaceC1454t) EnumC1436b.DAYS), this.f5436b);
                return c1366fM2961P.m2959F(c1366fM2961P.f5435a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1366f c1366fM2961P2 = m2961P(this.f5435a.mo2880h(j / 86400000, (InterfaceC1454t) EnumC1436b.DAYS), this.f5436b);
                return c1366fM2961P2.m2959F(c1366fM2961P2.f5435a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m2959F(this.f5435a, 0L, 0L, j, 0L);
            case 5:
                return m2959F(this.f5435a, 0L, j, 0L, 0L);
            case 6:
                return m2959F(this.f5435a, j, 0L, 0L, 0L);
            case 7:
                C1366f c1366fM2961P3 = m2961P(this.f5435a.mo2880h(j / 256, (InterfaceC1454t) EnumC1436b.DAYS), this.f5436b);
                return c1366fM2961P3.m2959F(c1366fM2961P3.f5435a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m2961P(this.f5435a.mo2880h(j, interfaceC1454t), this.f5436b);
        }
    }

    /* renamed from: F */
    public final C1366f m2959F(ChronoLocalDate chronoLocalDate, long j, long j8, long j9, long j10) {
        if ((j | j8 | j9 | j10) == 0) {
            return m2961P(chronoLocalDate, this.f5436b);
        }
        long j11 = j / 24;
        long j12 = ((j % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long jM3075d0 = this.f5436b.m3075d0();
        long j13 = j12 + jM3075d0;
        long jFloorDiv = Math.floorDiv(j13, 86400000000000L) + j11 + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L);
        long jFloorMod = Math.floorMod(j13, 86400000000000L);
        return m2961P(chronoLocalDate.mo2880h(jFloorDiv, (InterfaceC1454t) EnumC1436b.DAYS), jFloorMod == jM3075d0 ? this.f5436b : C1426l.m3067V(jFloorMod));
    }

    @Override // p077j$.time.chrono.InterfaceC1362d
    /* renamed from: E */
    public final InterfaceC1372i mo2951E(AbstractC1462z abstractC1462z) {
        return C1376k.m2975A(abstractC1462z, null, this);
    }

    private Object writeReplace() {
        return new C1365e0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1362d) && compareTo((InterfaceC1362d) obj) == 0;
    }
}
