package p077j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p077j$.time.AbstractC1392d;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1354c;
import p077j$.time.C1421g;
import p077j$.time.C1426l;
import p077j$.time.C1434t;
import p077j$.time.Instant;
import p077j$.time.LocalDate;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.v */
/* loaded from: classes2.dex */
public final class C1417v implements InterfaceC1448n {

    /* renamed from: b */
    public AbstractC1462z f5554b;

    /* renamed from: c */
    public InterfaceC1377l f5555c;

    /* renamed from: d */
    public boolean f5556d;

    /* renamed from: e */
    public EnumC1418w f5557e;

    /* renamed from: f */
    public ChronoLocalDate f5558f;

    /* renamed from: g */
    public C1426l f5559g;

    /* renamed from: a */
    public final Map f5553a = new HashMap();

    /* renamed from: h */
    public C1434t f5560h = C1434t.f5596d;

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (((HashMap) this.f5553a).containsKey(interfaceC1452r)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f5558f;
        if (chronoLocalDate != null && chronoLocalDate.mo2881i(interfaceC1452r)) {
            return true;
        }
        C1426l c1426l = this.f5559g;
        if (c1426l == null || !c1426l.mo2881i(interfaceC1452r)) {
            return (interfaceC1452r == null || (interfaceC1452r instanceof EnumC1435a) || !interfaceC1452r.mo3096w(this)) ? false : true;
        }
        return true;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        Objects.requireNonNull(interfaceC1452r, "field");
        Long l8 = (Long) ((HashMap) this.f5553a).get(interfaceC1452r);
        if (l8 != null) {
            return l8.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f5558f;
        if (chronoLocalDate != null && chronoLocalDate.mo2881i(interfaceC1452r)) {
            return this.f5558f.mo2882j(interfaceC1452r);
        }
        C1426l c1426l = this.f5559g;
        if (c1426l != null && c1426l.mo2881i(interfaceC1452r)) {
            return this.f5559g.mo2882j(interfaceC1452r);
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5620a) {
            return this.f5554b;
        }
        if (c1421g == AbstractC1453s.f5621b) {
            return this.f5555c;
        }
        if (c1421g == AbstractC1453s.f5625f) {
            ChronoLocalDate chronoLocalDate = this.f5558f;
            if (chronoLocalDate != null) {
                return LocalDate.m2884F(chronoLocalDate);
            }
            return null;
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return this.f5559g;
        }
        if (c1421g == AbstractC1453s.f5623d) {
            Long l8 = (Long) ((HashMap) this.f5553a).get(EnumC1435a.OFFSET_SECONDS);
            if (l8 != null) {
                return C1351a0.m2915Y(l8.intValue());
            }
            AbstractC1462z abstractC1462z = this.f5554b;
            return abstractC1462z instanceof C1351a0 ? abstractC1462z : c1421g.m3053l(this);
        }
        if (c1421g == AbstractC1453s.f5624e) {
            return c1421g.m3053l(this);
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return null;
        }
        return c1421g.m3053l(this);
    }

    /* renamed from: z */
    public final void m3052z(InterfaceC1452r interfaceC1452r, EnumC1435a enumC1435a, Long l8) {
        Long l9 = (Long) ((HashMap) this.f5553a).put(enumC1435a, l8);
        if (l9 == null || l9.longValue() == l8.longValue()) {
            return;
        }
        throw new C1354c("Conflict found: " + enumC1435a + " " + l9 + " differs from " + enumC1435a + " " + l8 + " while resolving  " + interfaceC1452r);
    }

    /* renamed from: q */
    public final void m3046q() {
        if (((HashMap) this.f5553a).containsKey(EnumC1435a.INSTANT_SECONDS)) {
            AbstractC1462z abstractC1462z = this.f5554b;
            if (abstractC1462z != null) {
                m3047r(abstractC1462z);
                return;
            }
            Long l8 = (Long) ((HashMap) this.f5553a).get(EnumC1435a.OFFSET_SECONDS);
            if (l8 != null) {
                m3047r(C1351a0.m2915Y(l8.intValue()));
            }
        }
    }

    /* renamed from: r */
    public final void m3047r(AbstractC1462z abstractC1462z) {
        Map map = this.f5553a;
        EnumC1435a enumC1435a = EnumC1435a.INSTANT_SECONDS;
        m3051y(this.f5555c.mo2937T(Instant.m2871w(((Long) ((HashMap) map).remove(enumC1435a)).longValue(), 0), abstractC1462z).mo2968n());
        m3052z(enumC1435a, EnumC1435a.SECOND_OF_DAY, Long.valueOf(r5.mo2966k().m3076e0()));
    }

    /* renamed from: y */
    public final void m3051y(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f5558f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new C1354c("Conflict found: Fields resolved to two different dates: " + this.f5558f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f5555c.equals(chronoLocalDate.mo2901e())) {
                throw new C1354c("ChronoLocalDate must use the effective parsed chronology: " + this.f5555c);
            }
            this.f5558f = chronoLocalDate;
        }
    }

    /* renamed from: u */
    public final void m3049u() {
        Map map = this.f5553a;
        EnumC1435a enumC1435a = EnumC1435a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC1435a)) {
            long jLongValue = ((Long) ((HashMap) this.f5553a).remove(enumC1435a)).longValue();
            EnumC1418w enumC1418w = this.f5557e;
            if (enumC1418w == EnumC1418w.STRICT || (enumC1418w == EnumC1418w.SMART && jLongValue != 0)) {
                enumC1435a.m3094X(jLongValue);
            }
            EnumC1435a enumC1435a2 = EnumC1435a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m3052z(enumC1435a, enumC1435a2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f5553a;
        EnumC1435a enumC1435a3 = EnumC1435a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC1435a3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a3)).longValue();
            EnumC1418w enumC1418w2 = this.f5557e;
            if (enumC1418w2 == EnumC1418w.STRICT || (enumC1418w2 == EnumC1418w.SMART && jLongValue2 != 0)) {
                enumC1435a3.m3094X(jLongValue2);
            }
            m3052z(enumC1435a3, EnumC1435a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f5553a;
        EnumC1435a enumC1435a4 = EnumC1435a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC1435a4)) {
            Map map4 = this.f5553a;
            EnumC1435a enumC1435a5 = EnumC1435a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC1435a5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a5)).longValue();
                if (this.f5557e == EnumC1418w.LENIENT) {
                    m3052z(enumC1435a4, EnumC1435a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC1435a4.m3094X(jLongValue3);
                    enumC1435a5.m3094X(jLongValue3);
                    m3052z(enumC1435a4, EnumC1435a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f5553a;
        EnumC1435a enumC1435a6 = EnumC1435a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC1435a6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a6)).longValue();
            if (this.f5557e != EnumC1418w.LENIENT) {
                enumC1435a6.m3094X(jLongValue5);
            }
            m3052z(enumC1435a6, EnumC1435a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m3052z(enumC1435a6, EnumC1435a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m3052z(enumC1435a6, EnumC1435a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            m3052z(enumC1435a6, EnumC1435a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f5553a;
        EnumC1435a enumC1435a7 = EnumC1435a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC1435a7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a7)).longValue();
            if (this.f5557e != EnumC1418w.LENIENT) {
                enumC1435a7.m3094X(jLongValue6);
            }
            m3052z(enumC1435a7, EnumC1435a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m3052z(enumC1435a7, EnumC1435a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f5553a;
        EnumC1435a enumC1435a8 = EnumC1435a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC1435a8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a8)).longValue();
            if (this.f5557e != EnumC1418w.LENIENT) {
                enumC1435a8.m3094X(jLongValue7);
            }
            m3052z(enumC1435a8, EnumC1435a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m3052z(enumC1435a8, EnumC1435a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f5553a;
        EnumC1435a enumC1435a9 = EnumC1435a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC1435a9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a9)).longValue();
            if (this.f5557e != EnumC1418w.LENIENT) {
                enumC1435a9.m3094X(jLongValue8);
            }
            m3052z(enumC1435a9, EnumC1435a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m3052z(enumC1435a9, EnumC1435a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m3052z(enumC1435a9, EnumC1435a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f5553a;
        EnumC1435a enumC1435a10 = EnumC1435a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC1435a10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a10)).longValue();
            if (this.f5557e != EnumC1418w.LENIENT) {
                enumC1435a10.m3094X(jLongValue9);
            }
            m3052z(enumC1435a10, EnumC1435a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m3052z(enumC1435a10, EnumC1435a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f5553a;
        EnumC1435a enumC1435a11 = EnumC1435a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC1435a11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f5553a).get(enumC1435a11)).longValue();
            EnumC1418w enumC1418w3 = this.f5557e;
            EnumC1418w enumC1418w4 = EnumC1418w.LENIENT;
            if (enumC1418w3 != enumC1418w4) {
                enumC1435a11.m3094X(jLongValue10);
            }
            Map map11 = this.f5553a;
            EnumC1435a enumC1435a12 = EnumC1435a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC1435a12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a12)).longValue();
                if (this.f5557e != enumC1418w4) {
                    enumC1435a12.m3094X(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m3052z(enumC1435a12, enumC1435a11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f5553a;
            EnumC1435a enumC1435a13 = EnumC1435a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC1435a13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f5553a).remove(enumC1435a13)).longValue();
                if (this.f5557e != enumC1418w4) {
                    enumC1435a13.m3094X(jLongValue12);
                }
                m3052z(enumC1435a13, enumC1435a11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f5553a;
        EnumC1435a enumC1435a14 = EnumC1435a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC1435a14)) {
            Map map14 = this.f5553a;
            EnumC1435a enumC1435a15 = EnumC1435a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC1435a15)) {
                Map map15 = this.f5553a;
                EnumC1435a enumC1435a16 = EnumC1435a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC1435a16) && ((HashMap) this.f5553a).containsKey(enumC1435a11)) {
                    m3048t(((Long) ((HashMap) this.f5553a).remove(enumC1435a14)).longValue(), ((Long) ((HashMap) this.f5553a).remove(enumC1435a15)).longValue(), ((Long) ((HashMap) this.f5553a).remove(enumC1435a16)).longValue(), ((Long) ((HashMap) this.f5553a).remove(enumC1435a11)).longValue());
                }
            }
        }
    }

    /* renamed from: t */
    public final void m3048t(long j, long j8, long j9, long j10) {
        if (this.f5557e == EnumC1418w.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j8, 60000000000L)), Math.multiplyExact(j9, 1000000000L)), j10);
            m3050w(C1426l.m3067V(Math.floorMod(jAddExact, 86400000000000L)), C1434t.m3089a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        EnumC1435a enumC1435a = EnumC1435a.MINUTE_OF_HOUR;
        int iM3105a = enumC1435a.f5602b.m3105a(j8, enumC1435a);
        EnumC1435a enumC1435a2 = EnumC1435a.NANO_OF_SECOND;
        int iM3105a2 = enumC1435a2.f5602b.m3105a(j10, enumC1435a2);
        if (this.f5557e == EnumC1418w.SMART && j == 24 && iM3105a == 0 && j9 == 0 && iM3105a2 == 0) {
            m3050w(C1426l.f5576g, C1434t.m3089a(0, 0, 1));
            return;
        }
        EnumC1435a enumC1435a3 = EnumC1435a.HOUR_OF_DAY;
        int iM3105a3 = enumC1435a3.f5602b.m3105a(j, enumC1435a3);
        EnumC1435a enumC1435a4 = EnumC1435a.SECOND_OF_MINUTE;
        m3050w(C1426l.m3066P(iM3105a3, iM3105a, enumC1435a4.f5602b.m3105a(j9, enumC1435a4), iM3105a2), C1434t.f5596d);
    }

    /* renamed from: w */
    public final void m3050w(C1426l c1426l, C1434t c1434t) {
        C1426l c1426l2 = this.f5559g;
        if (c1426l2 != null) {
            if (!c1426l2.equals(c1426l)) {
                throw new C1354c("Conflict found: Fields resolved to different times: " + this.f5559g + " " + c1426l);
            }
            C1434t c1434t2 = this.f5560h;
            c1434t2.getClass();
            C1434t c1434t3 = C1434t.f5596d;
            if (c1434t2 != c1434t3 && c1434t != c1434t3 && !this.f5560h.equals(c1434t)) {
                throw new C1354c("Conflict found: Fields resolved to different excess periods: " + this.f5560h + " " + c1434t);
            }
            this.f5560h = c1434t;
            return;
        }
        this.f5559g = c1426l;
        this.f5560h = c1434t;
    }

    /* renamed from: p */
    public final void m3045p(InterfaceC1448n interfaceC1448n) {
        Iterator it = ((HashMap) this.f5553a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC1452r interfaceC1452r = (InterfaceC1452r) entry.getKey();
            if (interfaceC1448n.mo2881i(interfaceC1452r)) {
                try {
                    long jMo2882j = interfaceC1448n.mo2882j(interfaceC1452r);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jMo2882j != jLongValue) {
                        throw new C1354c("Conflict found: Field " + interfaceC1452r + " " + jMo2882j + " differs from " + interfaceC1452r + " " + jLongValue + " derived from " + interfaceC1448n);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f5553a);
        sb.append(',');
        sb.append(this.f5555c);
        if (this.f5554b != null) {
            sb.append(',');
            sb.append(this.f5554b);
        }
        if (this.f5558f != null || this.f5559g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f5558f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f5559g != null) {
                    sb.append('T');
                    sb.append(this.f5559g);
                }
            } else {
                sb.append(this.f5559g);
            }
        }
        return sb.toString();
    }
}
