package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.C2122f;
import p077j$.time.AbstractC1352b;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1354c;
import p077j$.time.C1421g;
import p077j$.time.Instant;
import p077j$.time.LocalDate;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1448n;

/* renamed from: j$.time.chrono.v */
/* loaded from: classes2.dex */
public final class C1387v extends AbstractC1356a implements Serializable {

    /* renamed from: c */
    public static final C1387v f5475c = new C1387v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: q */
    public final String mo2939q() {
        return "Japanese";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: t */
    public final String mo2940t() {
        return "japanese";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: Q */
    public final ChronoLocalDate mo2936Q(int i, int i4, int i8) {
        return new C1389x(LocalDate.m2886b0(i, i4, i8));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: u */
    public final ChronoLocalDate mo2941u(int i, int i4) {
        return new C1389x(LocalDate.m2888d0(i, i4));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: p */
    public final ChronoLocalDate mo2938p(long j) {
        return new C1389x(LocalDate.m2887c0(j));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: M */
    public final ChronoLocalDate mo2935M() {
        return new C1389x(LocalDate.m2884F(LocalDate.m2885a0(AbstractC1352b.m2923b())));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: G */
    public final ChronoLocalDate mo2934G(InterfaceC1448n interfaceC1448n) {
        if (interfaceC1448n instanceof C1389x) {
            return (C1389x) interfaceC1448n;
        }
        return new C1389x(LocalDate.m2884F(interfaceC1448n));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: z */
    public final List mo2943z() {
        C1390y[] c1390yArr = C1390y.f5482e;
        return AbstractC1352b.m2922a((C1390y[]) Arrays.copyOf(c1390yArr, c1390yArr.length));
    }

    private C1387v() {
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: C */
    public final int mo2933C(InterfaceC1378m interfaceC1378m, int i) {
        if (!(interfaceC1378m instanceof C1390y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i4 = ((C1390y) interfaceC1378m).f5484b.f5410a;
        int i8 = (i4 + i) - 1;
        if (i != 1 && (i8 < -999999999 || i8 > 999999999 || i8 < i4 || interfaceC1378m != C1390y.m2998p(LocalDate.m2886b0(i8, 1, 1)))) {
            throw new C1354c("Invalid yearOfEra value");
        }
        return i8;
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: B */
    public final InterfaceC1378m mo2932B(int i) {
        return C1390y.m2999r(i);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: y */
    public final C1456v mo2942y(EnumC1435a enumC1435a) {
        switch (AbstractC1386u.f5474a[enumC1435a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C1455u("Unsupported field: " + enumC1435a);
            case 5:
                C1390y[] c1390yArr = C1390y.f5482e;
                int i = c1390yArr[c1390yArr.length - 1].f5484b.f5410a;
                int iMin = C2122f.DEGRADED_PONG_TIMEOUT_NS - c1390yArr[c1390yArr.length - 1].f5484b.f5410a;
                int i4 = c1390yArr[0].f5484b.f5410a;
                int i8 = 1;
                while (true) {
                    C1390y[] c1390yArr2 = C1390y.f5482e;
                    if (i8 >= c1390yArr2.length) {
                        return C1456v.m3104g(iMin, 999999999 - i);
                    }
                    C1390y c1390y = c1390yArr2[i8];
                    iMin = Math.min(iMin, (c1390y.f5484b.f5410a - i4) + 1);
                    i4 = c1390y.f5484b.f5410a;
                    i8++;
                }
            case 6:
                C1390y c1390y2 = C1390y.f5481d;
                long jMin = EnumC1435a.DAY_OF_YEAR.f5602b.f5629c;
                for (C1390y c1390y3 : C1390y.f5482e) {
                    jMin = Math.min(jMin, ((c1390y3.f5484b.m2899Y() ? 366 : 365) - c1390y3.f5484b.m2897V()) + 1);
                    if (c1390y3.m3000q() != null) {
                        jMin = Math.min(jMin, c1390y3.m3000q().f5484b.m2897V() - 1);
                    }
                }
                return C1456v.m3104g(jMin, EnumC1435a.DAY_OF_YEAR.f5602b.f5630d);
            case 7:
                return C1456v.m3103f(C1389x.f5477d.f5410a, 999999999L);
            case 8:
                long j = C1390y.f5481d.f5483a;
                C1390y[] c1390yArr3 = C1390y.f5482e;
                return C1456v.m3103f(j, c1390yArr3[c1390yArr3.length - 1].f5483a);
            default:
                return enumC1435a.f5602b;
        }
    }

    @Override // p077j$.time.chrono.AbstractC1356a, p077j$.time.chrono.InterfaceC1377l
    /* renamed from: S */
    public final ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w) {
        return (C1389x) super.mo2930S(map, enumC1418w);
    }

    @Override // p077j$.time.chrono.AbstractC1356a
    /* renamed from: V */
    public final ChronoLocalDate mo2931V(Map map, EnumC1418w enumC1418w) {
        LocalDate localDateM2888d0;
        C1389x c1389xM2996X;
        EnumC1435a enumC1435a = EnumC1435a.ERA;
        Long l8 = (Long) map.get(enumC1435a);
        C1390y c1390yM2999r = l8 != null ? C1390y.m2999r(mo2942y(enumC1435a).m3105a(l8.longValue(), enumC1435a)) : null;
        EnumC1435a enumC1435a2 = EnumC1435a.YEAR_OF_ERA;
        Long l9 = (Long) map.get(enumC1435a2);
        int iM3105a = l9 != null ? mo2942y(enumC1435a2).m3105a(l9.longValue(), enumC1435a2) : 0;
        if (c1390yM2999r == null && l9 != null && !map.containsKey(EnumC1435a.YEAR) && enumC1418w != EnumC1418w.STRICT) {
            C1390y[] c1390yArr = C1390y.f5482e;
            c1390yM2999r = ((C1390y[]) Arrays.copyOf(c1390yArr, c1390yArr.length))[((C1390y[]) Arrays.copyOf(c1390yArr, c1390yArr.length)).length - 1];
        }
        if (l9 != null && c1390yM2999r != null) {
            EnumC1435a enumC1435a3 = EnumC1435a.MONTH_OF_YEAR;
            if (map.containsKey(enumC1435a3)) {
                EnumC1435a enumC1435a4 = EnumC1435a.DAY_OF_MONTH;
                if (map.containsKey(enumC1435a4)) {
                    map.remove(enumC1435a);
                    map.remove(enumC1435a2);
                    if (enumC1418w == EnumC1418w.LENIENT) {
                        return new C1389x(LocalDate.m2886b0((c1390yM2999r.f5484b.f5410a + iM3105a) - 1, 1, 1)).m2994P(Math.subtractExact(((Long) map.remove(enumC1435a3)).longValue(), 1L), EnumC1436b.MONTHS).m2994P(Math.subtractExact(((Long) map.remove(enumC1435a4)).longValue(), 1L), EnumC1436b.DAYS);
                    }
                    int iM3105a2 = mo2942y(enumC1435a3).m3105a(((Long) map.remove(enumC1435a3)).longValue(), enumC1435a3);
                    int iM3105a3 = mo2942y(enumC1435a4).m3105a(((Long) map.remove(enumC1435a4)).longValue(), enumC1435a4);
                    if (enumC1418w != EnumC1418w.SMART) {
                        LocalDate localDate = C1389x.f5477d;
                        LocalDate localDateM2886b0 = LocalDate.m2886b0((c1390yM2999r.f5484b.f5410a + iM3105a) - 1, iM3105a2, iM3105a3);
                        if (localDateM2886b0.m2898X(c1390yM2999r.f5484b) || c1390yM2999r != C1390y.m2998p(localDateM2886b0)) {
                            throw new C1354c("year, month, and day not valid for Era");
                        }
                        return new C1389x(c1390yM2999r, iM3105a, localDateM2886b0);
                    }
                    if (iM3105a < 1) {
                        throw new C1354c("Invalid YearOfEra: " + iM3105a);
                    }
                    int i = (c1390yM2999r.f5484b.f5410a + iM3105a) - 1;
                    try {
                        c1389xM2996X = new C1389x(LocalDate.m2886b0(i, iM3105a2, iM3105a3));
                    } catch (C1354c unused) {
                        c1389xM2996X = new C1389x(LocalDate.m2886b0(i, iM3105a2, 1)).m2996X(new C1421g(2));
                    }
                    if (c1389xM2996X.f5479b == c1390yM2999r || c1389xM2996X.mo2878f(EnumC1435a.YEAR_OF_ERA) <= 1 || iM3105a <= 1) {
                        return c1389xM2996X;
                    }
                    throw new C1354c("Invalid YearOfEra for Era: " + c1390yM2999r + " " + iM3105a);
                }
            }
            EnumC1435a enumC1435a5 = EnumC1435a.DAY_OF_YEAR;
            if (map.containsKey(enumC1435a5)) {
                map.remove(enumC1435a);
                map.remove(enumC1435a2);
                if (enumC1418w == EnumC1418w.LENIENT) {
                    return new C1389x(LocalDate.m2888d0((c1390yM2999r.f5484b.f5410a + iM3105a) - 1, 1)).m2994P(Math.subtractExact(((Long) map.remove(enumC1435a5)).longValue(), 1L), EnumC1436b.DAYS);
                }
                int iM3105a4 = mo2942y(enumC1435a5).m3105a(((Long) map.remove(enumC1435a5)).longValue(), enumC1435a5);
                LocalDate localDate2 = C1389x.f5477d;
                if (iM3105a == 1) {
                    LocalDate localDate3 = c1390yM2999r.f5484b;
                    localDateM2888d0 = LocalDate.m2888d0(localDate3.f5410a, (localDate3.m2897V() + iM3105a4) - 1);
                } else {
                    localDateM2888d0 = LocalDate.m2888d0((c1390yM2999r.f5484b.f5410a + iM3105a) - 1, iM3105a4);
                }
                if (localDateM2888d0.m2898X(c1390yM2999r.f5484b) || c1390yM2999r != C1390y.m2998p(localDateM2888d0)) {
                    throw new C1354c("Invalid parameters");
                }
                return new C1389x(c1390yM2999r, iM3105a, localDateM2888d0);
            }
        }
        return null;
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: T */
    public final InterfaceC1372i mo2937T(Instant instant, AbstractC1462z abstractC1462z) {
        return C1376k.m2976F(this, instant, abstractC1462z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C1365e0((byte) 1, this);
    }
}
