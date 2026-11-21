package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p077j$.time.AbstractC1352b;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1354c;
import p077j$.time.C1393d0;
import p077j$.time.C1424j;
import p077j$.time.C1459w;
import p077j$.time.EnumC1428n;
import p077j$.time.Instant;
import p077j$.time.LocalDate;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;

/* renamed from: j$.time.chrono.s */
/* loaded from: classes2.dex */
public final class C1384s extends AbstractC1356a implements Serializable {

    /* renamed from: c */
    public static final C1384s f5471c = new C1384s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: B */
    public final InterfaceC1378m mo2932B(int i) {
        if (i == 0) {
            return EnumC1385t.BCE;
        }
        if (i == 1) {
            return EnumC1385t.f5472CE;
        }
        throw new C1354c("Invalid era: " + i);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: q */
    public final String mo2939q() {
        return "ISO";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: t */
    public final String mo2940t() {
        return "iso8601";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: Q */
    public final ChronoLocalDate mo2936Q(int i, int i4, int i8) {
        return LocalDate.m2886b0(i, i4, i8);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: u */
    public final ChronoLocalDate mo2941u(int i, int i4) {
        return LocalDate.m2888d0(i, i4);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: p */
    public final ChronoLocalDate mo2938p(long j) {
        return LocalDate.m2887c0(j);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: G */
    public final ChronoLocalDate mo2934G(InterfaceC1448n interfaceC1448n) {
        return LocalDate.m2884F(interfaceC1448n);
    }

    private C1384s() {
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: H */
    public final InterfaceC1362d mo2981H(C1424j c1424j) {
        return C1424j.m3054A(c1424j);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: T */
    public final InterfaceC1372i mo2937T(Instant instant, AbstractC1462z abstractC1462z) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(abstractC1462z, "zone");
        return C1393d0.m3003w(instant.f5406a, instant.f5407b, abstractC1462z);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: M */
    public final ChronoLocalDate mo2935M() {
        return LocalDate.m2884F(LocalDate.m2885a0(AbstractC1352b.m2923b()));
    }

    /* renamed from: X */
    public static boolean m2993X(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: C */
    public final int mo2933C(InterfaceC1378m interfaceC1378m, int i) {
        if (interfaceC1378m instanceof EnumC1385t) {
            return interfaceC1378m == EnumC1385t.f5472CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: z */
    public final List mo2943z() {
        return AbstractC1352b.m2922a(EnumC1385t.values());
    }

    @Override // p077j$.time.chrono.AbstractC1356a, p077j$.time.chrono.InterfaceC1377l
    /* renamed from: S */
    public final ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w) {
        return (LocalDate) super.mo2930S(map, enumC1418w);
    }

    @Override // p077j$.time.chrono.AbstractC1356a
    /* renamed from: I */
    public final void mo2928I(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.PROLEPTIC_MONTH;
        Long l8 = (Long) map.remove(enumC1435a);
        if (l8 != null) {
            if (enumC1418w != EnumC1418w.LENIENT) {
                enumC1435a.m3094X(l8.longValue());
            }
            AbstractC1356a.m2927w(map, EnumC1435a.MONTH_OF_YEAR, ((int) Math.floorMod(l8.longValue(), r4)) + 1);
            AbstractC1356a.m2927w(map, EnumC1435a.YEAR, Math.floorDiv(l8.longValue(), 12));
        }
    }

    @Override // p077j$.time.chrono.AbstractC1356a
    /* renamed from: V */
    public final ChronoLocalDate mo2931V(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.YEAR_OF_ERA;
        Long l8 = (Long) map.remove(enumC1435a);
        if (l8 != null) {
            if (enumC1418w != EnumC1418w.LENIENT) {
                enumC1435a.m3094X(l8.longValue());
            }
            Long l9 = (Long) map.remove(EnumC1435a.ERA);
            if (l9 != null) {
                if (l9.longValue() == 1) {
                    AbstractC1356a.m2927w(map, EnumC1435a.YEAR, l8.longValue());
                    return null;
                }
                if (l9.longValue() == 0) {
                    AbstractC1356a.m2927w(map, EnumC1435a.YEAR, Math.subtractExact(1L, l8.longValue()));
                    return null;
                }
                throw new C1354c("Invalid value for era: " + l9);
            }
            EnumC1435a enumC1435a2 = EnumC1435a.YEAR;
            Long l10 = (Long) map.get(enumC1435a2);
            if (enumC1418w != EnumC1418w.STRICT) {
                AbstractC1356a.m2927w(map, enumC1435a2, (l10 == null || l10.longValue() > 0) ? l8.longValue() : Math.subtractExact(1L, l8.longValue()));
                return null;
            }
            if (l10 != null) {
                long jLongValue = l10.longValue();
                long jLongValue2 = l8.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC1356a.m2927w(map, enumC1435a2, jLongValue2);
                return null;
            }
            map.put(enumC1435a, l8);
            return null;
        }
        EnumC1435a enumC1435a3 = EnumC1435a.ERA;
        if (!map.containsKey(enumC1435a3)) {
            return null;
        }
        enumC1435a3.m3094X(((Long) map.get(enumC1435a3)).longValue());
        return null;
    }

    @Override // p077j$.time.chrono.AbstractC1356a
    /* renamed from: P */
    public final ChronoLocalDate mo2929P(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        int iM3105a = enumC1435a.f5602b.m3105a(((Long) map.remove(enumC1435a)).longValue(), enumC1435a);
        boolean z7 = true;
        if (enumC1418w == EnumC1418w.LENIENT) {
            return LocalDate.m2886b0(iM3105a, 1, 1).m2904g0(Math.subtractExact(((Long) map.remove(EnumC1435a.MONTH_OF_YEAR)).longValue(), 1L)).m2903f0(Math.subtractExact(((Long) map.remove(EnumC1435a.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC1435a enumC1435a2 = EnumC1435a.MONTH_OF_YEAR;
        int iM3105a2 = enumC1435a2.f5602b.m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
        EnumC1435a enumC1435a3 = EnumC1435a.DAY_OF_MONTH;
        int iM3105a3 = enumC1435a3.f5602b.m3105a(((Long) map.remove(enumC1435a3)).longValue(), enumC1435a3);
        if (enumC1418w == EnumC1418w.SMART) {
            if (iM3105a2 == 4 || iM3105a2 == 6 || iM3105a2 == 9 || iM3105a2 == 11) {
                iM3105a3 = Math.min(iM3105a3, 30);
            } else if (iM3105a2 == 2) {
                EnumC1428n enumC1428n = EnumC1428n.FEBRUARY;
                long j = iM3105a;
                int i = C1459w.f5635b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z7 = false;
                }
                iM3105a3 = Math.min(iM3105a3, enumC1428n.m3082A(z7));
            }
        }
        return LocalDate.m2886b0(iM3105a, iM3105a2, iM3105a3);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: y */
    public final C1456v mo2942y(EnumC1435a enumC1435a) {
        return enumC1435a.f5602b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C1365e0((byte) 1, this);
    }
}
