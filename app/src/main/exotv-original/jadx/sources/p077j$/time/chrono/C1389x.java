package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p077j$.time.AbstractC1392d;
import p077j$.time.C1354c;
import p077j$.time.C1421g;
import p077j$.time.C1426l;
import p077j$.time.LocalDate;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.x */
/* loaded from: classes2.dex */
public final class C1389x extends AbstractC1360c {

    /* renamed from: d */
    public static final LocalDate f5477d = LocalDate.m2886b0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a */
    public final transient LocalDate f5478a;

    /* renamed from: b */
    public final transient C1390y f5479b;

    /* renamed from: c */
    public final transient int f5480c;

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: L */
    public final InterfaceC1362d mo2892L(C1426l c1426l) {
        return new C1366f(this, c1426l);
    }

    public C1389x(LocalDate localDate) {
        if (localDate.m2898X(f5477d)) {
            throw new C1354c("JapaneseDate before Meiji 6 is not supported");
        }
        C1390y c1390yM2998p = C1390y.m2998p(localDate);
        this.f5479b = c1390yM2998p;
        this.f5480c = (localDate.f5410a - c1390yM2998p.f5484b.f5410a) + 1;
        this.f5478a = localDate;
    }

    public C1389x(C1390y c1390y, int i, LocalDate localDate) {
        if (localDate.m2898X(f5477d)) {
            throw new C1354c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f5479b = c1390y;
        this.f5480c = i;
        this.f5478a = localDate;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: e */
    public final InterfaceC1377l mo2901e() {
        return C1387v.f5475c;
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C1387v.f5475c.getClass();
        return this.f5478a.hashCode() ^ (-688086063);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: N */
    public final InterfaceC1378m mo2893N() {
        return this.f5479b;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC1452r == EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC1452r == EnumC1435a.ALIGNED_WEEK_OF_MONTH || interfaceC1452r == EnumC1435a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).isDateBased();
        }
        return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        int iM2897V;
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3090A(this);
        }
        if (!mo2881i(interfaceC1452r)) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        int i = AbstractC1388w.f5476a[enumC1435a.ordinal()];
        if (i == 1) {
            return C1456v.m3103f(1L, this.f5478a.m2900Z());
        }
        if (i != 2) {
            if (i != 3) {
                return C1387v.f5475c.mo2942y(enumC1435a);
            }
            C1390y c1390y = this.f5479b;
            int i4 = c1390y.f5484b.f5410a;
            return c1390y.m3000q() != null ? C1456v.m3103f(1L, (r6.f5484b.f5410a - i4) + 1) : C1456v.m3103f(1L, 999999999 - i4);
        }
        C1390y c1390yM3000q = this.f5479b.m3000q();
        if (c1390yM3000q != null) {
            LocalDate localDate = c1390yM3000q.f5484b;
            iM2897V = localDate.f5410a == this.f5478a.f5410a ? localDate.m2897V() - 1 : this.f5478a.m2899Y() ? 366 : 365;
        }
        if (this.f5480c == 1) {
            iM2897V -= this.f5479b.f5484b.m2897V() - 1;
        }
        return C1456v.m3103f(1L, iM2897V);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        switch (AbstractC1388w.f5476a[((EnumC1435a) interfaceC1452r).ordinal()]) {
            case 2:
                return this.f5480c == 1 ? (this.f5478a.m2897V() - this.f5479b.f5484b.m2897V()) + 1 : this.f5478a.m2897V();
            case 3:
                return this.f5480c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
            case 8:
                return this.f5479b.f5483a;
            default:
                return this.f5478a.mo2882j(interfaceC1452r);
        }
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C1389x mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
            if (mo2882j(enumC1435a) == j) {
                return this;
            }
            int[] iArr = AbstractC1388w.f5476a;
            int i = iArr[enumC1435a.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C1387v c1387v = C1387v.f5475c;
                int iM3105a = c1387v.mo2942y(enumC1435a).m3105a(j, enumC1435a);
                int i4 = iArr[enumC1435a.ordinal()];
                if (i4 == 3) {
                    return m2997Y(this.f5478a.m2911m0(c1387v.mo2933C(this.f5479b, iM3105a)));
                }
                if (i4 == 8) {
                    return m2997Y(this.f5478a.m2911m0(c1387v.mo2933C(C1390y.m2999r(iM3105a), this.f5480c)));
                }
                if (i4 == 9) {
                    return m2997Y(this.f5478a.m2911m0(iM3105a));
                }
            }
            return m2997Y(this.f5478a.mo2877d(j, interfaceC1452r));
        }
        return (C1389x) super.mo2877d(j, interfaceC1452r);
    }

    /* renamed from: X */
    public final C1389x m2996X(C1421g c1421g) {
        return (C1389x) super.mo2967m(c1421g);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1389x) super.mo2967m(localDate);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: m */
    public final ChronoLocalDate mo2967m(InterfaceC1449o interfaceC1449o) {
        return (C1389x) super.mo2967m(interfaceC1449o);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: R */
    public final ChronoLocalDate mo2895R(InterfaceC1451q interfaceC1451q) {
        return (C1389x) super.mo2895R(interfaceC1451q);
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: I */
    public final ChronoLocalDate mo2947I(long j) {
        return m2997Y(this.f5478a.m2906i0(j));
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: F */
    public final ChronoLocalDate mo2946F(long j) {
        return m2997Y(this.f5478a.m2904g0(j));
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: A */
    public final ChronoLocalDate mo2945A(long j) {
        return m2997Y(this.f5478a.m2903f0(j));
    }

    /* renamed from: P */
    public final C1389x m2994P(long j, EnumC1436b enumC1436b) {
        return (C1389x) super.mo2880h(j, (InterfaceC1454t) enumC1436b);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final ChronoLocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1389x) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final InterfaceC1447m mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1389x) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final ChronoLocalDate mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1389x) super.mo2874a(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1389x) super.mo2874a(j, interfaceC1454t);
    }

    /* renamed from: Y */
    public final C1389x m2997Y(LocalDate localDate) {
        return localDate.equals(this.f5478a) ? this : new C1389x(localDate);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: K */
    public final long mo2891K() {
        return this.f5478a.mo2891K();
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1389x) {
            return this.f5478a.equals(((C1389x) obj).f5478a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1365e0((byte) 4, this);
    }
}
