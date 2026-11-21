package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.format.C1410o;
import p077j$.time.format.EnumC1418w;
import p077j$.time.format.EnumC1419x;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.w */
/* loaded from: classes2.dex */
public final class C1459w implements InterfaceC1447m, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: b */
    public static final /* synthetic */ int f5635b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a */
    public final int f5636a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5636a - ((C1459w) obj).f5636a;
    }

    static {
        C1410o c1410o = new C1410o();
        c1410o.m3031h(EnumC1435a.YEAR, 4, 10, EnumC1419x.EXCEEDS_PAD);
        c1410o.m3035l(Locale.getDefault(), EnumC1418w.SMART, null);
    }

    /* renamed from: w */
    public static C1459w m3111w(int i) {
        EnumC1435a.YEAR.m3094X(i);
        return new C1459w(i);
    }

    public C1459w(int i) {
        this.f5636a = i;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.YEAR || interfaceC1452r == EnumC1435a.YEAR_OF_ERA || interfaceC1452r == EnumC1435a.ERA : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.YEAR_OF_ERA) {
            return C1456v.m3103f(1L, this.f5636a <= 0 ? 1000000000L : 999999999L);
        }
        return super.mo2908l(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        return mo2908l(interfaceC1452r).m3105a(mo2882j(interfaceC1452r), interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        int i = AbstractC1458v.f5633a[((EnumC1435a) interfaceC1452r).ordinal()];
        if (i == 1) {
            int i4 = this.f5636a;
            if (i4 < 1) {
                i4 = 1 - i4;
            }
            return i4;
        }
        if (i == 2) {
            return this.f5636a;
        }
        if (i == 3) {
            return this.f5636a < 1 ? 0 : 1;
        }
        throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1459w) localDate.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C1459w mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (C1459w) interfaceC1452r.mo3093V(this, j);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        enumC1435a.m3094X(j);
        int i = AbstractC1458v.f5633a[enumC1435a.ordinal()];
        if (i == 1) {
            if (this.f5636a < 1) {
                j = 1 - j;
            }
            return m3111w((int) j);
        }
        if (i == 2) {
            return m3111w((int) j);
        }
        if (i == 3) {
            return mo2882j(EnumC1435a.ERA) == j ? this : m3111w(1 - this.f5636a);
        }
        throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C1459w mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return (C1459w) interfaceC1454t.mo3097w(this, j);
        }
        int i = AbstractC1458v.f5634b[((EnumC1436b) interfaceC1454t).ordinal()];
        if (i == 1) {
            return m3113F(j);
        }
        if (i == 2) {
            return m3113F(Math.multiplyExact(j, 10));
        }
        if (i == 3) {
            return m3113F(Math.multiplyExact(j, 100));
        }
        if (i == 4) {
            return m3113F(Math.multiplyExact(j, 1000));
        }
        if (i == 5) {
            EnumC1435a enumC1435a = EnumC1435a.ERA;
            return mo2877d(Math.addExact(mo2882j(enumC1435a), j), enumC1435a);
        }
        throw new C1455u("Unsupported unit: " + interfaceC1454t);
    }

    /* renamed from: F */
    public final C1459w m3113F(long j) {
        if (j == 0) {
            return this;
        }
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        return m3111w(enumC1435a.f5602b.m3105a(this.f5636a + j, enumC1435a));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5621b) {
            return C1384s.f5471c;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.YEARS;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        if (!InterfaceC1377l.m2980r(interfaceC1447m).equals(C1384s.f5471c)) {
            throw new C1354c("Adjustment only supported on ISO date-time");
        }
        return interfaceC1447m.mo2877d(this.f5636a, EnumC1435a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1459w) && this.f5636a == ((C1459w) obj).f5636a;
    }

    public final int hashCode() {
        return this.f5636a;
    }

    public final String toString() {
        return Integer.toString(this.f5636a);
    }

    private Object writeReplace() {
        return new C1457u((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
