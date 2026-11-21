package p077j$.time.temporal;

import java.util.Map;
import p077j$.time.C1354c;
import p077j$.time.EnumC1394e;
import p077j$.time.LocalDate;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.format.C1417v;
import p077j$.time.format.EnumC1418w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.temporal.h */
/* loaded from: classes2.dex */
public abstract class EnumC1442h implements InterfaceC1452r {
    public static final EnumC1442h DAY_OF_QUARTER;
    public static final EnumC1442h QUARTER_OF_YEAR;
    public static final EnumC1442h WEEK_BASED_YEAR;
    public static final EnumC1442h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    public static final int[] f5606a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1442h[] f5607b;

    @Override // p077j$.time.temporal.InterfaceC1452r
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC1442h valueOf(String str) {
        return (EnumC1442h) Enum.valueOf(EnumC1442h.class, str);
    }

    public static EnumC1442h[] values() {
        return (EnumC1442h[]) f5607b.clone();
    }

    static {
        EnumC1442h enumC1442h = new EnumC1442h() { // from class: j$.time.temporal.d
            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: I */
            public final C1456v mo3091I() {
                return C1456v.m3104g(90L, 92L);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: w */
            public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
                if (!interfaceC1448n.mo2881i(EnumC1435a.DAY_OF_YEAR) || !interfaceC1448n.mo2881i(EnumC1435a.MONTH_OF_YEAR) || !interfaceC1448n.mo2881i(EnumC1435a.YEAR)) {
                    return false;
                }
                EnumC1442h enumC1442h2 = AbstractC1444j.f5610a;
                return InterfaceC1377l.m2980r(interfaceC1448n).equals(C1384s.f5471c);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: A */
            public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: DayOfQuarter");
                }
                long jMo2882j = interfaceC1448n.mo2882j(EnumC1442h.QUARTER_OF_YEAR);
                if (jMo2882j == 1) {
                    long jMo2882j2 = interfaceC1448n.mo2882j(EnumC1435a.YEAR);
                    C1384s.f5471c.getClass();
                    return C1384s.m2993X(jMo2882j2) ? C1456v.m3103f(1L, 91L) : C1456v.m3103f(1L, 90L);
                }
                if (jMo2882j == 2) {
                    return C1456v.m3103f(1L, 91L);
                }
                if (jMo2882j == 3 || jMo2882j == 4) {
                    return C1456v.m3103f(1L, 92L);
                }
                return mo3091I();
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: P */
            public final long mo3092P(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: DayOfQuarter");
                }
                int iMo2878f = interfaceC1448n.mo2878f(EnumC1435a.DAY_OF_YEAR);
                int iMo2878f2 = interfaceC1448n.mo2878f(EnumC1435a.MONTH_OF_YEAR);
                long jMo2882j = interfaceC1448n.mo2882j(EnumC1435a.YEAR);
                int i = (iMo2878f2 - 1) / 3;
                C1384s.f5471c.getClass();
                return iMo2878f - EnumC1442h.f5606a[i + (C1384s.m2993X(jMo2882j) ? 4 : 0)];
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: V */
            public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
                long jMo3092P = mo3092P(interfaceC1447m);
                mo3091I().m3106b(j, this);
                EnumC1435a enumC1435a = EnumC1435a.DAY_OF_YEAR;
                return interfaceC1447m.mo2877d((j - jMo3092P) + interfaceC1447m.mo2882j(enumC1435a), enumC1435a);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: F */
            public final InterfaceC1448n mo3098F(Map map, C1417v c1417v, EnumC1418w enumC1418w) {
                long jSubtractExact;
                LocalDate localDateM2904g0;
                EnumC1435a enumC1435a = EnumC1435a.YEAR;
                Long l8 = (Long) map.get(enumC1435a);
                InterfaceC1452r interfaceC1452r = EnumC1442h.QUARTER_OF_YEAR;
                Long l9 = (Long) map.get(interfaceC1452r);
                if (l8 == null || l9 == null) {
                    return null;
                }
                int iM3105a = enumC1435a.f5602b.m3105a(l8.longValue(), enumC1435a);
                long jLongValue = ((Long) map.get(EnumC1442h.DAY_OF_QUARTER)).longValue();
                EnumC1442h enumC1442h2 = AbstractC1444j.f5610a;
                if (!InterfaceC1377l.m2980r(c1417v).equals(C1384s.f5471c)) {
                    throw new C1354c("Resolve requires IsoChronology");
                }
                if (enumC1418w == EnumC1418w.LENIENT) {
                    localDateM2904g0 = LocalDate.m2886b0(iM3105a, 1, 1).m2904g0(Math.multiplyExact(Math.subtractExact(l9.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateM2886b0 = LocalDate.m2886b0(iM3105a, ((interfaceC1452r.mo3091I().m3105a(l9.longValue(), interfaceC1452r) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC1418w == EnumC1418w.STRICT) {
                            mo3090A(localDateM2886b0).m3106b(jLongValue, this);
                        } else {
                            mo3091I().m3106b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDateM2904g0 = localDateM2886b0;
                }
                map.remove(this);
                map.remove(enumC1435a);
                map.remove(interfaceC1452r);
                return localDateM2904g0.m2903f0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC1442h;
        EnumC1442h enumC1442h2 = new EnumC1442h() { // from class: j$.time.temporal.e
            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: I */
            public final C1456v mo3091I() {
                return C1456v.m3103f(1L, 4L);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: w */
            public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
                if (!interfaceC1448n.mo2881i(EnumC1435a.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC1442h enumC1442h3 = AbstractC1444j.f5610a;
                return InterfaceC1377l.m2980r(interfaceC1448n).equals(C1384s.f5471c);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: P */
            public final long mo3092P(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: QuarterOfYear");
                }
                return (interfaceC1448n.mo2882j(EnumC1435a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: A */
            public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: QuarterOfYear");
                }
                return mo3091I();
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: V */
            public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
                long jMo3092P = mo3092P(interfaceC1447m);
                mo3091I().m3106b(j, this);
                EnumC1435a enumC1435a = EnumC1435a.MONTH_OF_YEAR;
                return interfaceC1447m.mo2877d(((j - jMo3092P) * 3) + interfaceC1447m.mo2882j(enumC1435a), enumC1435a);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC1442h2;
        EnumC1442h enumC1442h3 = new EnumC1442h() { // from class: j$.time.temporal.f
            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: I */
            public final C1456v mo3091I() {
                return C1456v.m3104g(52L, 53L);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: w */
            public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
                if (!interfaceC1448n.mo2881i(EnumC1435a.EPOCH_DAY)) {
                    return false;
                }
                EnumC1442h enumC1442h4 = AbstractC1444j.f5610a;
                return InterfaceC1377l.m2980r(interfaceC1448n).equals(C1384s.f5471c);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: A */
            public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
                if (mo3096w(interfaceC1448n)) {
                    return EnumC1442h.m3102a0(LocalDate.m2884F(interfaceC1448n));
                }
                throw new C1455u("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: P */
            public final long mo3092P(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC1442h.m3099X(LocalDate.m2884F(interfaceC1448n));
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: V */
            public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
                mo3091I().m3106b(j, this);
                return interfaceC1447m.mo2880h(Math.subtractExact(j, mo3092P(interfaceC1447m)), EnumC1436b.WEEKS);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: F */
            public final InterfaceC1448n mo3098F(Map map, C1417v c1417v, EnumC1418w enumC1418w) {
                LocalDate localDateMo2877d;
                long j;
                long j8;
                InterfaceC1452r interfaceC1452r = EnumC1442h.WEEK_BASED_YEAR;
                Long l8 = (Long) map.get(interfaceC1452r);
                EnumC1435a enumC1435a = EnumC1435a.DAY_OF_WEEK;
                Long l9 = (Long) map.get(enumC1435a);
                if (l8 == null || l9 == null) {
                    return null;
                }
                int iM3105a = interfaceC1452r.mo3091I().m3105a(l8.longValue(), interfaceC1452r);
                long jLongValue = ((Long) map.get(EnumC1442h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC1442h enumC1442h4 = AbstractC1444j.f5610a;
                if (!InterfaceC1377l.m2980r(c1417v).equals(C1384s.f5471c)) {
                    throw new C1354c("Resolve requires IsoChronology");
                }
                LocalDate localDateM2886b0 = LocalDate.m2886b0(iM3105a, 1, 4);
                if (enumC1418w == EnumC1418w.LENIENT) {
                    long jLongValue2 = l9.longValue();
                    if (jLongValue2 > 7) {
                        long j9 = jLongValue2 - 1;
                        j = 1;
                        localDateM2886b0 = localDateM2886b0.m2905h0(j9 / 7);
                        j8 = j9 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateM2886b0 = localDateM2886b0.m2905h0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j8 = (jLongValue2 + 6) % 7;
                        }
                        localDateMo2877d = localDateM2886b0.m2905h0(Math.subtractExact(jLongValue, j)).mo2877d(jLongValue2, enumC1435a);
                    }
                    jLongValue2 = j8 + j;
                    localDateMo2877d = localDateM2886b0.m2905h0(Math.subtractExact(jLongValue, j)).mo2877d(jLongValue2, enumC1435a);
                } else {
                    int iM3105a2 = enumC1435a.f5602b.m3105a(l9.longValue(), enumC1435a);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (enumC1418w == EnumC1418w.STRICT) {
                            EnumC1442h.m3102a0(localDateM2886b0).m3106b(jLongValue, this);
                        } else {
                            mo3091I().m3106b(jLongValue, this);
                        }
                    }
                    localDateMo2877d = localDateM2886b0.m2905h0(jLongValue - 1).mo2877d(iM3105a2, enumC1435a);
                }
                map.remove(this);
                map.remove(interfaceC1452r);
                map.remove(enumC1435a);
                return localDateMo2877d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC1442h3;
        EnumC1442h enumC1442h4 = new EnumC1442h() { // from class: j$.time.temporal.g
            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: I */
            public final C1456v mo3091I() {
                return EnumC1435a.YEAR.f5602b;
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: w */
            public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
                if (!interfaceC1448n.mo2881i(EnumC1435a.EPOCH_DAY)) {
                    return false;
                }
                EnumC1442h enumC1442h5 = AbstractC1444j.f5610a;
                return InterfaceC1377l.m2980r(interfaceC1448n).equals(C1384s.f5471c);
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: P */
            public final long mo3092P(InterfaceC1448n interfaceC1448n) {
                if (mo3096w(interfaceC1448n)) {
                    return EnumC1442h.m3100Y(LocalDate.m2884F(interfaceC1448n));
                }
                throw new C1455u("Unsupported field: WeekBasedYear");
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: A */
            public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
                if (!mo3096w(interfaceC1448n)) {
                    throw new C1455u("Unsupported field: WeekBasedYear");
                }
                return mo3091I();
            }

            @Override // p077j$.time.temporal.InterfaceC1452r
            /* renamed from: V */
            public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
                if (!mo3096w(interfaceC1447m)) {
                    throw new C1455u("Unsupported field: WeekBasedYear");
                }
                int iM3105a = EnumC1435a.YEAR.f5602b.m3105a(j, EnumC1442h.WEEK_BASED_YEAR);
                LocalDate localDateM2884F = LocalDate.m2884F(interfaceC1447m);
                int iMo2878f = localDateM2884F.mo2878f(EnumC1435a.DAY_OF_WEEK);
                int iM3099X = EnumC1442h.m3099X(localDateM2884F);
                if (iM3099X == 53 && EnumC1442h.m3101Z(iM3105a) == 52) {
                    iM3099X = 52;
                }
                return interfaceC1447m.mo2910m(LocalDate.m2886b0(iM3105a, 1, 4).m2903f0(((iM3099X - 1) * 7) + (iMo2878f - r6.mo2878f(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC1442h4;
        f5607b = new EnumC1442h[]{enumC1442h, enumC1442h2, enumC1442h3, enumC1442h4};
        f5606a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* renamed from: a0 */
    public static C1456v m3102a0(LocalDate localDate) {
        return C1456v.m3103f(1L, m3101Z(m3100Y(localDate)));
    }

    /* renamed from: Z */
    public static int m3101Z(int i) {
        LocalDate localDateM2886b0 = LocalDate.m2886b0(i, 1, 1);
        if (localDateM2886b0.m2894P() != EnumC1394e.THURSDAY) {
            return (localDateM2886b0.m2894P() == EnumC1394e.WEDNESDAY && localDateM2886b0.m2899Y()) ? 53 : 52;
        }
        return 53;
    }

    /* renamed from: X */
    public static int m3099X(LocalDate localDate) {
        int iOrdinal = localDate.m2894P().ordinal();
        int iM2897V = localDate.m2897V() - 1;
        int i = (3 - iOrdinal) + iM2897V;
        int i4 = i - ((i / 7) * 7);
        int i8 = i4 - 3;
        if (i8 < -3) {
            i8 = i4 + 4;
        }
        if (iM2897V >= i8) {
            int i9 = ((iM2897V - i8) / 7) + 1;
            if (i9 != 53 || i8 == -3 || (i8 == -2 && localDate.m2899Y())) {
                return i9;
            }
            return 1;
        }
        if (localDate.m2897V() != 180) {
            localDate = LocalDate.m2888d0(localDate.f5410a, 180);
        }
        return (int) m3102a0(localDate.m2906i0(-1L)).f5630d;
    }

    /* renamed from: Y */
    public static int m3100Y(LocalDate localDate) {
        int i = localDate.f5410a;
        int iM2897V = localDate.m2897V();
        if (iM2897V <= 3) {
            return iM2897V - localDate.m2894P().ordinal() < -2 ? i - 1 : i;
        }
        if (iM2897V >= 363) {
            return ((iM2897V - 363) - (localDate.m2899Y() ? 1 : 0)) - localDate.m2894P().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
