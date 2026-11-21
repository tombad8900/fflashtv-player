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

/* renamed from: j$.time.y */
/* loaded from: classes2.dex */
public final class C1461y implements InterfaceC1447m, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f5639c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a */
    public final int f5640a;

    /* renamed from: b */
    public final int f5641b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1461y c1461y = (C1461y) obj;
        int i = this.f5640a - c1461y.f5640a;
        return i == 0 ? this.f5641b - c1461y.f5641b : i;
    }

    static {
        C1410o c1410o = new C1410o();
        c1410o.m3031h(EnumC1435a.YEAR, 4, 10, EnumC1419x.EXCEEDS_PAD);
        c1410o.m3026c('-');
        c1410o.m3030g(EnumC1435a.MONTH_OF_YEAR, 2);
        c1410o.m3035l(Locale.getDefault(), EnumC1418w.SMART, null);
    }

    public C1461y(int i, int i4) {
        this.f5640a = i;
        this.f5641b = i4;
    }

    /* renamed from: P */
    public final C1461y m3118P(int i, int i4) {
        return (this.f5640a == i && this.f5641b == i4) ? this : new C1461y(i, i4);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.YEAR || interfaceC1452r == EnumC1435a.MONTH_OF_YEAR || interfaceC1452r == EnumC1435a.PROLEPTIC_MONTH || interfaceC1452r == EnumC1435a.YEAR_OF_ERA || interfaceC1452r == EnumC1435a.ERA : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.YEAR_OF_ERA) {
            return C1456v.m3103f(1L, this.f5640a <= 0 ? 1000000000L : 999999999L);
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
        int i;
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        int i4 = AbstractC1460x.f5637a[((EnumC1435a) interfaceC1452r).ordinal()];
        if (i4 == 1) {
            i = this.f5641b;
        } else {
            if (i4 == 2) {
                return m3120w();
            }
            if (i4 == 3) {
                int i8 = this.f5640a;
                if (i8 < 1) {
                    i8 = 1 - i8;
                }
                return i8;
            }
            if (i4 != 4) {
                if (i4 == 5) {
                    return this.f5640a < 1 ? 0 : 1;
                }
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
            }
            i = this.f5640a;
        }
        return i;
    }

    /* renamed from: w */
    public final long m3120w() {
        return ((this.f5640a * 12) + this.f5641b) - 1;
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1461y) localDate.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C1461y mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (C1461y) interfaceC1452r.mo3093V(this, j);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        enumC1435a.m3094X(j);
        int i = AbstractC1460x.f5637a[enumC1435a.ordinal()];
        if (i == 1) {
            int i4 = (int) j;
            EnumC1435a.MONTH_OF_YEAR.m3094X(i4);
            return m3118P(this.f5640a, i4);
        }
        if (i == 2) {
            return m3116F(j - m3120w());
        }
        if (i == 3) {
            if (this.f5640a < 1) {
                j = 1 - j;
            }
            int i8 = (int) j;
            EnumC1435a.YEAR.m3094X(i8);
            return m3118P(i8, this.f5641b);
        }
        if (i == 4) {
            int i9 = (int) j;
            EnumC1435a.YEAR.m3094X(i9);
            return m3118P(i9, this.f5641b);
        }
        if (i != 5) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        if (mo2882j(EnumC1435a.ERA) == j) {
            return this;
        }
        int i10 = 1 - this.f5640a;
        EnumC1435a.YEAR.m3094X(i10);
        return m3118P(i10, this.f5641b);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C1461y mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return (C1461y) interfaceC1454t.mo3097w(this, j);
        }
        switch (AbstractC1460x.f5638b[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return m3116F(j);
            case 2:
                return m3117I(j);
            case 3:
                return m3117I(Math.multiplyExact(j, 10));
            case 4:
                return m3117I(Math.multiplyExact(j, 100));
            case 5:
                return m3117I(Math.multiplyExact(j, 1000));
            case 6:
                EnumC1435a enumC1435a = EnumC1435a.ERA;
                return mo2877d(Math.addExact(mo2882j(enumC1435a), j), enumC1435a);
            default:
                throw new C1455u("Unsupported unit: " + interfaceC1454t);
        }
    }

    /* renamed from: I */
    public final C1461y m3117I(long j) {
        if (j == 0) {
            return this;
        }
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        return m3118P(enumC1435a.f5602b.m3105a(this.f5640a + j, enumC1435a), this.f5641b);
    }

    /* renamed from: F */
    public final C1461y m3116F(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f5640a * 12) + (this.f5641b - 1) + j;
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        long j9 = 12;
        return m3118P(enumC1435a.f5602b.m3105a(Math.floorDiv(j8, j9), enumC1435a), ((int) Math.floorMod(j8, j9)) + 1);
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
            return EnumC1436b.MONTHS;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        if (!InterfaceC1377l.m2980r(interfaceC1447m).equals(C1384s.f5471c)) {
            throw new C1354c("Adjustment only supported on ISO date-time");
        }
        return interfaceC1447m.mo2877d(m3120w(), EnumC1435a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1461y) {
            C1461y c1461y = (C1461y) obj;
            if (this.f5640a == c1461y.f5640a && this.f5641b == c1461y.f5641b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5640a ^ (this.f5641b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f5640a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.f5640a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f5640a);
        }
        sb.append(this.f5641b < 10 ? "-0" : "-");
        sb.append(this.f5641b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
