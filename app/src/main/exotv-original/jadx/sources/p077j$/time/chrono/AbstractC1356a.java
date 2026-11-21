package p077j$.time.chrono;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p077j$.time.C1354c;
import p077j$.time.C1421g;
import p077j$.time.EnumC1394e;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.C1450p;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1356a implements InterfaceC1377l {

    /* renamed from: a */
    public static final ConcurrentHashMap f5425a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final ConcurrentHashMap f5426b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return mo2939q().compareTo(((InterfaceC1377l) obj).mo2939q());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* renamed from: A */
    public static InterfaceC1377l m2925A(InterfaceC1377l interfaceC1377l, String str) {
        String strMo2940t;
        InterfaceC1377l interfaceC1377l2 = (InterfaceC1377l) f5425a.putIfAbsent(str, interfaceC1377l);
        if (interfaceC1377l2 == null && (strMo2940t = interfaceC1377l.mo2940t()) != null) {
            f5426b.putIfAbsent(strMo2940t, interfaceC1377l);
        }
        return interfaceC1377l2;
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: S */
    public ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.EPOCH_DAY;
        if (map.containsKey(enumC1435a)) {
            return mo2938p(((Long) map.remove(enumC1435a)).longValue());
        }
        mo2928I(map, enumC1418w);
        ChronoLocalDate chronoLocalDateMo2931V = mo2931V(map, enumC1418w);
        if (chronoLocalDateMo2931V != null) {
            return chronoLocalDateMo2931V;
        }
        EnumC1435a enumC1435a2 = EnumC1435a.YEAR;
        if (!map.containsKey(enumC1435a2)) {
            return null;
        }
        EnumC1435a enumC1435a3 = EnumC1435a.MONTH_OF_YEAR;
        if (map.containsKey(enumC1435a3)) {
            if (map.containsKey(EnumC1435a.DAY_OF_MONTH)) {
                return mo2929P(map, enumC1418w);
            }
            EnumC1435a enumC1435a4 = EnumC1435a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC1435a4)) {
                EnumC1435a enumC1435a5 = EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(enumC1435a5)) {
                    int iM3105a = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
                    if (enumC1418w == EnumC1418w.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(enumC1435a3)).longValue(), 1L);
                        return mo2936Q(iM3105a, 1, 1).mo2880h(jSubtractExact, (InterfaceC1454t) EnumC1436b.MONTHS).mo2880h(Math.subtractExact(((Long) map.remove(enumC1435a4)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.WEEKS).mo2880h(Math.subtractExact(((Long) map.remove(enumC1435a5)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.DAYS);
                    }
                    int iM3105a2 = mo2942y(enumC1435a3).m3105a(((Long) map.remove(enumC1435a3)).longValue(), enumC1435a3);
                    int iM3105a3 = mo2942y(enumC1435a4).m3105a(((Long) map.remove(enumC1435a4)).longValue(), enumC1435a4);
                    ChronoLocalDate chronoLocalDateMo2880h = mo2936Q(iM3105a, iM3105a2, 1).mo2880h((mo2942y(enumC1435a5).m3105a(((Long) map.remove(enumC1435a5)).longValue(), enumC1435a5) - 1) + ((iM3105a3 - 1) * 7), (InterfaceC1454t) EnumC1436b.DAYS);
                    if (enumC1418w != EnumC1418w.STRICT || chronoLocalDateMo2880h.mo2878f(enumC1435a3) == iM3105a2) {
                        return chronoLocalDateMo2880h;
                    }
                    throw new C1354c("Strict mode rejected resolved date as it is in a different month");
                }
                EnumC1435a enumC1435a6 = EnumC1435a.DAY_OF_WEEK;
                if (map.containsKey(enumC1435a6)) {
                    int iM3105a4 = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
                    if (enumC1418w == EnumC1418w.LENIENT) {
                        return m2926F(mo2936Q(iM3105a4, 1, 1), Math.subtractExact(((Long) map.remove(enumC1435a3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1435a4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1435a6)).longValue(), 1L));
                    }
                    int iM3105a5 = mo2942y(enumC1435a3).m3105a(((Long) map.remove(enumC1435a3)).longValue(), enumC1435a3);
                    ChronoLocalDate chronoLocalDateMo2910m = mo2936Q(iM3105a4, iM3105a5, 1).mo2880h((mo2942y(enumC1435a4).m3105a(((Long) map.remove(enumC1435a4)).longValue(), enumC1435a4) - 1) * 7, (InterfaceC1454t) EnumC1436b.DAYS).mo2910m(new C1450p(EnumC1394e.m3006w(mo2942y(enumC1435a6).m3105a(((Long) map.remove(enumC1435a6)).longValue(), enumC1435a6)).getValue(), 0));
                    if (enumC1418w != EnumC1418w.STRICT || chronoLocalDateMo2910m.mo2878f(enumC1435a3) == iM3105a5) {
                        return chronoLocalDateMo2910m;
                    }
                    throw new C1354c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC1435a enumC1435a7 = EnumC1435a.DAY_OF_YEAR;
        if (map.containsKey(enumC1435a7)) {
            int iM3105a6 = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
            if (enumC1418w != EnumC1418w.LENIENT) {
                return mo2941u(iM3105a6, mo2942y(enumC1435a7).m3105a(((Long) map.remove(enumC1435a7)).longValue(), enumC1435a7));
            }
            return mo2941u(iM3105a6, 1).mo2880h(Math.subtractExact(((Long) map.remove(enumC1435a7)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.DAYS);
        }
        EnumC1435a enumC1435a8 = EnumC1435a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(enumC1435a8)) {
            return null;
        }
        EnumC1435a enumC1435a9 = EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(enumC1435a9)) {
            int iM3105a7 = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
            if (enumC1418w == EnumC1418w.LENIENT) {
                return mo2941u(iM3105a7, 1).mo2880h(Math.subtractExact(((Long) map.remove(enumC1435a8)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.WEEKS).mo2880h(Math.subtractExact(((Long) map.remove(enumC1435a9)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.DAYS);
            }
            int iM3105a8 = mo2942y(enumC1435a8).m3105a(((Long) map.remove(enumC1435a8)).longValue(), enumC1435a8);
            ChronoLocalDate chronoLocalDateMo2880h2 = mo2941u(iM3105a7, 1).mo2880h((mo2942y(enumC1435a9).m3105a(((Long) map.remove(enumC1435a9)).longValue(), enumC1435a9) - 1) + ((iM3105a8 - 1) * 7), (InterfaceC1454t) EnumC1436b.DAYS);
            if (enumC1418w != EnumC1418w.STRICT || chronoLocalDateMo2880h2.mo2878f(enumC1435a2) == iM3105a7) {
                return chronoLocalDateMo2880h2;
            }
            throw new C1354c("Strict mode rejected resolved date as it is in a different year");
        }
        EnumC1435a enumC1435a10 = EnumC1435a.DAY_OF_WEEK;
        if (!map.containsKey(enumC1435a10)) {
            return null;
        }
        int iM3105a9 = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
        if (enumC1418w == EnumC1418w.LENIENT) {
            return m2926F(mo2941u(iM3105a9, 1), 0L, Math.subtractExact(((Long) map.remove(enumC1435a8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1435a10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateMo2910m2 = mo2941u(iM3105a9, 1).mo2880h((mo2942y(enumC1435a8).m3105a(((Long) map.remove(enumC1435a8)).longValue(), enumC1435a8) - 1) * 7, (InterfaceC1454t) EnumC1436b.DAYS).mo2910m(new C1450p(EnumC1394e.m3006w(mo2942y(enumC1435a10).m3105a(((Long) map.remove(enumC1435a10)).longValue(), enumC1435a10)).getValue(), 0));
        if (enumC1418w != EnumC1418w.STRICT || chronoLocalDateMo2910m2.mo2878f(enumC1435a2) == iM3105a9) {
            return chronoLocalDateMo2910m2;
        }
        throw new C1354c("Strict mode rejected resolved date as it is in a different year");
    }

    /* renamed from: I */
    public void mo2928I(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.PROLEPTIC_MONTH;
        Long l8 = (Long) map.remove(enumC1435a);
        if (l8 != null) {
            if (enumC1418w != EnumC1418w.LENIENT) {
                enumC1435a.m3094X(l8.longValue());
            }
            ChronoLocalDate chronoLocalDateMo2877d = mo2935M().mo2877d(1L, (InterfaceC1452r) EnumC1435a.DAY_OF_MONTH).mo2877d(l8.longValue(), (InterfaceC1452r) enumC1435a);
            m2927w(map, EnumC1435a.MONTH_OF_YEAR, chronoLocalDateMo2877d.mo2878f(r0));
            m2927w(map, EnumC1435a.YEAR, chronoLocalDateMo2877d.mo2878f(r0));
        }
    }

    /* renamed from: V */
    public ChronoLocalDate mo2931V(Map map, EnumC1418w enumC1418w) {
        int intExact;
        EnumC1435a enumC1435a = EnumC1435a.YEAR_OF_ERA;
        Long l8 = (Long) map.remove(enumC1435a);
        if (l8 != null) {
            Long l9 = (Long) map.remove(EnumC1435a.ERA);
            if (enumC1418w != EnumC1418w.LENIENT) {
                intExact = mo2942y(enumC1435a).m3105a(l8.longValue(), enumC1435a);
            } else {
                intExact = Math.toIntExact(l8.longValue());
            }
            if (l9 != null) {
                m2927w(map, EnumC1435a.YEAR, mo2933C(mo2932B(mo2942y(r2).m3105a(l9.longValue(), r2)), intExact));
                return null;
            }
            EnumC1435a enumC1435a2 = EnumC1435a.YEAR;
            if (map.containsKey(enumC1435a2)) {
                m2927w(map, enumC1435a2, mo2933C(mo2941u(mo2942y(enumC1435a2).m3105a(((Long) map.get(enumC1435a2)).longValue(), enumC1435a2), 1).mo2893N(), intExact));
                return null;
            }
            if (enumC1418w == EnumC1418w.STRICT) {
                map.put(enumC1435a, l8);
                return null;
            }
            if (mo2943z().isEmpty()) {
                m2927w(map, enumC1435a2, intExact);
                return null;
            }
            m2927w(map, enumC1435a2, mo2933C((InterfaceC1378m) r9.get(r9.size() - 1), intExact));
            return null;
        }
        EnumC1435a enumC1435a3 = EnumC1435a.ERA;
        if (!map.containsKey(enumC1435a3)) {
            return null;
        }
        mo2942y(enumC1435a3).m3106b(((Long) map.get(enumC1435a3)).longValue(), enumC1435a3);
        return null;
    }

    /* renamed from: P */
    public ChronoLocalDate mo2929P(Map map, EnumC1418w enumC1418w) {
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        int iM3105a = mo2942y(enumC1435a).m3105a(((Long) map.remove(enumC1435a)).longValue(), enumC1435a);
        if (enumC1418w == EnumC1418w.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(EnumC1435a.MONTH_OF_YEAR)).longValue(), 1L);
            return mo2936Q(iM3105a, 1, 1).mo2880h(jSubtractExact, (InterfaceC1454t) EnumC1436b.MONTHS).mo2880h(Math.subtractExact(((Long) map.remove(EnumC1435a.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC1454t) EnumC1436b.DAYS);
        }
        EnumC1435a enumC1435a2 = EnumC1435a.MONTH_OF_YEAR;
        int iM3105a2 = mo2942y(enumC1435a2).m3105a(((Long) map.remove(enumC1435a2)).longValue(), enumC1435a2);
        EnumC1435a enumC1435a3 = EnumC1435a.DAY_OF_MONTH;
        int iM3105a3 = mo2942y(enumC1435a3).m3105a(((Long) map.remove(enumC1435a3)).longValue(), enumC1435a3);
        if (enumC1418w != EnumC1418w.SMART) {
            return mo2936Q(iM3105a, iM3105a2, iM3105a3);
        }
        try {
            return mo2936Q(iM3105a, iM3105a2, iM3105a3);
        } catch (C1354c unused) {
            return mo2936Q(iM3105a, iM3105a2, 1).mo2910m(new C1421g(2));
        }
    }

    /* renamed from: F */
    public static ChronoLocalDate m2926F(ChronoLocalDate chronoLocalDate, long j, long j8, long j9) {
        long j10;
        ChronoLocalDate chronoLocalDateMo2880h = chronoLocalDate.mo2880h(j, (InterfaceC1454t) EnumC1436b.MONTHS);
        EnumC1436b enumC1436b = EnumC1436b.WEEKS;
        ChronoLocalDate chronoLocalDateMo2880h2 = chronoLocalDateMo2880h.mo2880h(j8, (InterfaceC1454t) enumC1436b);
        if (j9 > 7) {
            long j11 = j9 - 1;
            chronoLocalDateMo2880h2 = chronoLocalDateMo2880h2.mo2880h(j11 / 7, (InterfaceC1454t) enumC1436b);
            j10 = j11 % 7;
        } else {
            if (j9 < 1) {
                chronoLocalDateMo2880h2 = chronoLocalDateMo2880h2.mo2880h(Math.subtractExact(j9, 7L) / 7, (InterfaceC1454t) enumC1436b);
                j10 = (j9 + 6) % 7;
            }
            return chronoLocalDateMo2880h2.mo2910m(new C1450p(EnumC1394e.m3006w((int) j9).getValue(), 0));
        }
        j9 = j10 + 1;
        return chronoLocalDateMo2880h2.mo2910m(new C1450p(EnumC1394e.m3006w((int) j9).getValue(), 0));
    }

    /* renamed from: w */
    public static void m2927w(Map map, EnumC1435a enumC1435a, long j) {
        Long l8 = (Long) map.get(enumC1435a);
        if (l8 != null && l8.longValue() != j) {
            throw new C1354c("Conflict found: " + enumC1435a + " " + l8 + " differs from " + enumC1435a + " " + j);
        }
        map.put(enumC1435a, Long.valueOf(j));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1356a) && mo2939q().compareTo(((AbstractC1356a) obj).mo2939q()) == 0;
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    public final int hashCode() {
        return getClass().hashCode() ^ mo2939q().hashCode();
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    public final String toString() {
        return mo2939q();
    }
}
