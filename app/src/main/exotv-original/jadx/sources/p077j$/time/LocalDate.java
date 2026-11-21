package p077j$.time;

import androidx.media3.common.C0253x0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.EnumC1385t;
import p077j$.time.chrono.InterfaceC1362d;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.chrono.InterfaceC1378m;
import p077j$.time.format.DateTimeFormatter;
import p077j$.time.format.DateTimeParseException;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* loaded from: classes2.dex */
public final class LocalDate implements InterfaceC1447m, InterfaceC1449o, ChronoLocalDate, Serializable {

    /* renamed from: d */
    public static final LocalDate f5408d = m2886b0(-999999999, 1, 1);

    /* renamed from: e */
    public static final LocalDate f5409e = m2886b0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a */
    public final int f5410a;

    /* renamed from: b */
    public final short f5411b;

    /* renamed from: c */
    public final short f5412c;

    static {
        m2886b0(1970, 1, 1);
    }

    public static LocalDate now() {
        return m2885a0(AbstractC1352b.m2923b());
    }

    /* renamed from: b0 */
    public static LocalDate m2886b0(int i, int i4, int i8) {
        EnumC1435a.YEAR.m3094X(i);
        EnumC1435a.MONTH_OF_YEAR.m3094X(i4);
        EnumC1435a.DAY_OF_MONTH.m3094X(i8);
        return m2883A(i, i4, i8);
    }

    /* renamed from: d0 */
    public static LocalDate m2888d0(int i, int i4) {
        long j = i;
        EnumC1435a.YEAR.m3094X(j);
        EnumC1435a.DAY_OF_YEAR.m3094X(i4);
        C1384s.f5471c.getClass();
        boolean zM2993X = C1384s.m2993X(j);
        if (i4 == 366 && !zM2993X) {
            throw new C1354c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC1428n enumC1428nM3081I = EnumC1428n.m3081I(((i4 - 1) / 31) + 1);
        if (i4 > (enumC1428nM3081I.m3082A(zM2993X) + enumC1428nM3081I.m3084w(zM2993X)) - 1) {
            enumC1428nM3081I = EnumC1428n.f5583a[((((int) 1) + 12) + enumC1428nM3081I.ordinal()) % 12];
        }
        return new LocalDate(i, enumC1428nM3081I.getValue(), (i4 - enumC1428nM3081I.m3084w(zM2993X)) + 1);
    }

    /* renamed from: c0 */
    public static LocalDate m2887c0(long j) {
        long j8;
        EnumC1435a.EPOCH_DAY.m3094X(j);
        long j9 = 719468 + j;
        if (j9 < 0) {
            long j10 = ((j + 719469) / 146097) - 1;
            j8 = j10 * 400;
            j9 += (-j10) * 146097;
        } else {
            j8 = 0;
        }
        long j11 = ((j9 * 400) + 591) / 146097;
        long j12 = j9 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j9 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i = (int) j12;
        int i4 = ((i * 5) + 2) / 153;
        int i8 = ((i4 + 2) % 12) + 1;
        int i9 = (i - (((i4 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j8 + (i4 / 10);
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        return new LocalDate(enumC1435a.f5602b.m3105a(j13, enumC1435a), i8, i9);
    }

    /* renamed from: F */
    public static LocalDate m2884F(InterfaceC1448n interfaceC1448n) {
        Objects.requireNonNull(interfaceC1448n, "temporal");
        LocalDate localDate = (LocalDate) interfaceC1448n.mo2875b(AbstractC1453s.f5625f);
        if (localDate != null) {
            return localDate;
        }
        throw new C1354c("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC1448n + " of type " + interfaceC1448n.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C1421g c1421g = new C1421g(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (LocalDate) dateTimeFormatter.m3007a(charSequence).mo2875b(c1421g);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e8) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e8.getMessage(), e8);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* renamed from: A */
    public static LocalDate m2883A(int i, int i4, int i8) {
        int i9 = 28;
        if (i8 > 28) {
            if (i4 != 2) {
                i9 = (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) ? 30 : 31;
            } else {
                C1384s.f5471c.getClass();
                if (C1384s.m2993X(i)) {
                    i9 = 29;
                }
            }
            if (i8 > i9) {
                if (i8 == 29) {
                    throw new C1354c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C1354c("Invalid date '" + EnumC1428n.m3081I(i4).name() + " " + i8 + "'");
            }
        }
        return new LocalDate(i, i4, i8);
    }

    /* renamed from: j0 */
    public static LocalDate m2889j0(int i, int i4, int i8) {
        if (i4 == 2) {
            C1384s.f5471c.getClass();
            i8 = Math.min(i8, C1384s.m2993X((long) i) ? 29 : 28);
        } else if (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) {
            i8 = Math.min(i8, 30);
        }
        return new LocalDate(i, i4, i8);
    }

    public LocalDate(int i, int i4, int i8) {
        this.f5410a = i;
        this.f5411b = (short) i4;
        this.f5412c = (short) i8;
    }

    /* renamed from: a0 */
    public static LocalDate m2885a0(C1350a c1350a) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.f5405c;
        long j = 1000;
        Instant instantM2871w = Instant.m2871w(Math.floorDiv(jCurrentTimeMillis, j), ((int) Math.floorMod(jCurrentTimeMillis, j)) * C0253x0.CUSTOM_ERROR_CODE_BASE);
        AbstractC1462z abstractC1462z = c1350a.f5413a;
        Objects.requireNonNull(instantM2871w, "instant");
        Objects.requireNonNull(abstractC1462z, "zone");
        return m2887c0(Math.floorDiv(instantM2871w.f5406a + abstractC1462z.mo2921w().m3135d(instantM2871w).f5419b, 86400));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3090A(this);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        if (!enumC1435a.isDateBased()) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        int i = AbstractC1422h.f5565a[enumC1435a.ordinal()];
        if (i == 1) {
            return C1456v.m3103f(1L, m2900Z());
        }
        if (i == 2) {
            return C1456v.m3103f(1L, m2899Y() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? enumC1435a.f5602b : this.f5410a <= 0 ? C1456v.m3103f(1L, 1000000000L) : C1456v.m3103f(1L, 999999999L);
        }
        return C1456v.m3103f(1L, (EnumC1428n.m3081I(this.f5411b) != EnumC1428n.FEBRUARY || m2899Y()) ? 5L : 4L);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return m2890I(interfaceC1452r);
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r == EnumC1435a.EPOCH_DAY) {
                return mo2891K();
            }
            if (interfaceC1452r != EnumC1435a.PROLEPTIC_MONTH) {
                return m2890I(interfaceC1452r);
            }
            return ((this.f5410a * 12) + this.f5411b) - 1;
        }
        return interfaceC1452r.mo3092P(this);
    }

    /* renamed from: I */
    public final int m2890I(InterfaceC1452r interfaceC1452r) {
        switch (AbstractC1422h.f5565a[((EnumC1435a) interfaceC1452r).ordinal()]) {
            case 1:
                return this.f5412c;
            case 2:
                return m2897V();
            case 3:
                return ((this.f5412c - 1) / 7) + 1;
            case 4:
                int i = this.f5410a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return m2894P().getValue();
            case 6:
                return ((this.f5412c - 1) % 7) + 1;
            case 7:
                return ((m2897V() - 1) % 7) + 1;
            case 8:
                throw new C1455u("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m2897V() - 1) / 7) + 1;
            case 10:
                return this.f5411b;
            case 11:
                throw new C1455u("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f5410a;
            case 13:
                return this.f5410a >= 1 ? 1 : 0;
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: e */
    public final InterfaceC1377l mo2901e() {
        return C1384s.f5471c;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: N */
    public final InterfaceC1378m mo2893N() {
        return this.f5410a >= 1 ? EnumC1385t.f5472CE : EnumC1385t.BCE;
    }

    /* renamed from: V */
    public final int m2897V() {
        return (EnumC1428n.m3081I(this.f5411b).m3084w(m2899Y()) + this.f5412c) - 1;
    }

    /* renamed from: P */
    public final EnumC1394e m2894P() {
        return EnumC1394e.m3006w(((int) Math.floorMod(mo2891K() + 3, 7)) + 1);
    }

    /* renamed from: Y */
    public final boolean m2899Y() {
        C1384s c1384s = C1384s.f5471c;
        long j = this.f5410a;
        c1384s.getClass();
        return C1384s.m2993X(j);
    }

    /* renamed from: Z */
    public final int m2900Z() {
        short s8 = this.f5411b;
        return s8 != 2 ? (s8 == 4 || s8 == 6 || s8 == 9 || s8 == 11) ? 30 : 31 : m2899Y() ? 29 : 28;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate mo2910m(InterfaceC1449o interfaceC1449o) {
        if (interfaceC1449o instanceof LocalDate) {
            return (LocalDate) interfaceC1449o;
        }
        return (LocalDate) interfaceC1449o.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (LocalDate) interfaceC1452r.mo3093V(this, j);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        enumC1435a.m3094X(j);
        switch (AbstractC1422h.f5565a[enumC1435a.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.f5412c != i) {
                    return m2886b0(this.f5410a, this.f5411b, i);
                }
                return this;
            case 2:
                int i4 = (int) j;
                if (m2897V() != i4) {
                    return m2888d0(this.f5410a, i4);
                }
                return this;
            case 3:
                return m2905h0(j - mo2882j(EnumC1435a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f5410a < 1) {
                    j = 1 - j;
                }
                return m2911m0((int) j);
            case 5:
                return m2903f0(j - m2894P().getValue());
            case 6:
                return m2903f0(j - mo2882j(EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m2903f0(j - mo2882j(EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m2887c0(j);
            case 9:
                return m2905h0(j - mo2882j(EnumC1435a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i8 = (int) j;
                if (this.f5411b != i8) {
                    EnumC1435a.MONTH_OF_YEAR.m3094X(i8);
                    return m2889j0(this.f5410a, i8, this.f5412c);
                }
                return this;
            case 11:
                return m2904g0(j - (((this.f5410a * 12) + this.f5411b) - 1));
            case 12:
                return m2911m0((int) j);
            case 13:
                if (mo2882j(EnumC1435a.ERA) != j) {
                    return m2911m0(1 - this.f5410a);
                }
                return this;
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    /* renamed from: m0 */
    public final LocalDate m2911m0(int i) {
        if (this.f5410a == i) {
            return this;
        }
        EnumC1435a.YEAR.m3094X(i);
        return m2889j0(i, this.f5411b, this.f5412c);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: R */
    public final ChronoLocalDate mo2895R(InterfaceC1451q interfaceC1451q) {
        if (interfaceC1451q != null) {
            C1434t c1434t = (C1434t) interfaceC1451q;
            return m2904g0((c1434t.f5597a * 12) + c1434t.f5598b).m2903f0(c1434t.f5599c);
        }
        Objects.requireNonNull(interfaceC1451q, "amountToAdd");
        return (LocalDate) ((C1434t) interfaceC1451q).mo2869w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return (LocalDate) interfaceC1454t.mo3097w(this, j);
        }
        switch (AbstractC1422h.f5566b[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return m2903f0(j);
            case 2:
                return m2905h0(j);
            case 3:
                return m2904g0(j);
            case 4:
                return m2906i0(j);
            case 5:
                return m2906i0(Math.multiplyExact(j, 10));
            case 6:
                return m2906i0(Math.multiplyExact(j, 100));
            case 7:
                return m2906i0(Math.multiplyExact(j, 1000));
            case 8:
                EnumC1435a enumC1435a = EnumC1435a.ERA;
                return mo2877d(Math.addExact(mo2882j(enumC1435a), j), enumC1435a);
            default:
                throw new C1455u("Unsupported unit: " + interfaceC1454t);
        }
    }

    /* renamed from: i0 */
    public final LocalDate m2906i0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        return m2889j0(enumC1435a.f5602b.m3105a(this.f5410a + j, enumC1435a), this.f5411b, this.f5412c);
    }

    /* renamed from: g0 */
    public final LocalDate m2904g0(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f5410a * 12) + (this.f5411b - 1) + j;
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        long j9 = 12;
        return m2889j0(enumC1435a.f5602b.m3105a(Math.floorDiv(j8, j9), enumC1435a), ((int) Math.floorMod(j8, j9)) + 1, this.f5412c);
    }

    /* renamed from: h0 */
    public final LocalDate m2905h0(long j) {
        return m2903f0(Math.multiplyExact(j, 7));
    }

    /* renamed from: f0 */
    public final LocalDate m2903f0(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = this.f5412c + j;
        if (j8 > 0) {
            if (j8 <= 28) {
                return new LocalDate(this.f5410a, this.f5411b, (int) j8);
            }
            if (j8 <= 59) {
                long jM2900Z = m2900Z();
                if (j8 <= jM2900Z) {
                    return new LocalDate(this.f5410a, this.f5411b, (int) j8);
                }
                short s8 = this.f5411b;
                if (s8 < 12) {
                    return new LocalDate(this.f5410a, s8 + 1, (int) (j8 - jM2900Z));
                }
                EnumC1435a.YEAR.m3094X(this.f5410a + 1);
                return new LocalDate(this.f5410a + 1, 1, (int) (j8 - jM2900Z));
            }
        }
        return m2887c0(Math.addExact(mo2891K(), j));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final ChronoLocalDate mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? m2903f0(Long.MAX_VALUE).m2903f0(1L) : m2903f0(-j);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        return c1421g == AbstractC1453s.f5625f ? this : super.mo2875b(c1421g);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: L */
    public final InterfaceC1362d mo2892L(C1426l c1426l) {
        return C1424j.m3055I(this, c1426l);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: K */
    public final long mo2891K() {
        long j = this.f5410a;
        long j8 = this.f5411b;
        long j9 = 365 * j;
        long j10 = (((367 * j8) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j9 : j9 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.f5412c - 1);
        if (j8 > 2) {
            j10 = !m2899Y() ? j10 - 2 : j10 - 1;
        }
        return j10 - 719528;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m2912w((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    /* renamed from: w */
    public final int m2912w(LocalDate localDate) {
        int i = this.f5410a - localDate.f5410a;
        if (i != 0) {
            return i;
        }
        int i4 = this.f5411b - localDate.f5411b;
        return i4 == 0 ? this.f5412c - localDate.f5412c : i4;
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m2912w((LocalDate) chronoLocalDate) > 0 : mo2891K() > chronoLocalDate.mo2891K();
    }

    /* renamed from: X */
    public final boolean m2898X(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m2912w((LocalDate) chronoLocalDate) < 0 : mo2891K() < chronoLocalDate.mo2891K();
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && m2912w((LocalDate) obj) == 0;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.f5410a;
        return (((i << 11) + (this.f5411b << 6)) + this.f5412c) ^ (i & (-2048));
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public final String toString() {
        int i = this.f5410a;
        short s8 = this.f5411b;
        short s9 = this.f5412c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s8 < 10 ? "-0" : "-");
        sb.append((int) s8);
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append((int) s9);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
