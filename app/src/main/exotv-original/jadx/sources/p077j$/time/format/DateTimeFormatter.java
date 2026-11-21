package p077j$.time.format;

import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1354c;
import p077j$.time.C1426l;
import p077j$.time.C1434t;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1362d;
import p077j$.time.chrono.InterfaceC1372i;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1444j;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1452r;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f */
    public static final DateTimeFormatter f5494f;

    /* renamed from: a */
    public final C1399d f5495a;

    /* renamed from: b */
    public final Locale f5496b;

    /* renamed from: c */
    public final C1416u f5497c;

    /* renamed from: d */
    public final EnumC1418w f5498d;

    /* renamed from: e */
    public final InterfaceC1377l f5499e;

    static {
        C1410o c1410o = new C1410o();
        EnumC1435a enumC1435a = EnumC1435a.YEAR;
        EnumC1419x enumC1419x = EnumC1419x.EXCEEDS_PAD;
        c1410o.m3031h(enumC1435a, 4, 10, enumC1419x);
        c1410o.m3026c('-');
        EnumC1435a enumC1435a2 = EnumC1435a.MONTH_OF_YEAR;
        c1410o.m3030g(enumC1435a2, 2);
        c1410o.m3026c('-');
        EnumC1435a enumC1435a3 = EnumC1435a.DAY_OF_MONTH;
        c1410o.m3030g(enumC1435a3, 2);
        EnumC1418w enumC1418w = EnumC1418w.STRICT;
        C1384s c1384s = C1384s.f5471c;
        DateTimeFormatter dateTimeFormatterM3034k = c1410o.m3034k(enumC1418w, c1384s);
        ISO_LOCAL_DATE = dateTimeFormatterM3034k;
        C1410o c1410o2 = new C1410o();
        EnumC1407l enumC1407l = EnumC1407l.INSENSITIVE;
        c1410o2.m3025b(enumC1407l);
        c1410o2.m3024a(dateTimeFormatterM3034k);
        C1404i c1404i = C1404i.f5517e;
        c1410o2.m3025b(c1404i);
        c1410o2.m3034k(enumC1418w, c1384s);
        C1410o c1410o3 = new C1410o();
        c1410o3.m3025b(enumC1407l);
        c1410o3.m3024a(dateTimeFormatterM3034k);
        c1410o3.m3033j();
        c1410o3.m3025b(c1404i);
        c1410o3.m3034k(enumC1418w, c1384s);
        C1410o c1410o4 = new C1410o();
        EnumC1435a enumC1435a4 = EnumC1435a.HOUR_OF_DAY;
        c1410o4.m3030g(enumC1435a4, 2);
        c1410o4.m3026c(':');
        EnumC1435a enumC1435a5 = EnumC1435a.MINUTE_OF_HOUR;
        c1410o4.m3030g(enumC1435a5, 2);
        c1410o4.m3033j();
        c1410o4.m3026c(':');
        EnumC1435a enumC1435a6 = EnumC1435a.SECOND_OF_MINUTE;
        c1410o4.m3030g(enumC1435a6, 2);
        c1410o4.m3033j();
        c1410o4.m3025b(new C1401f(EnumC1435a.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterM3034k2 = c1410o4.m3034k(enumC1418w, null);
        C1410o c1410o5 = new C1410o();
        c1410o5.m3025b(enumC1407l);
        c1410o5.m3024a(dateTimeFormatterM3034k2);
        c1410o5.m3025b(c1404i);
        c1410o5.m3034k(enumC1418w, null);
        C1410o c1410o6 = new C1410o();
        c1410o6.m3025b(enumC1407l);
        c1410o6.m3024a(dateTimeFormatterM3034k2);
        c1410o6.m3033j();
        c1410o6.m3025b(c1404i);
        c1410o6.m3034k(enumC1418w, null);
        C1410o c1410o7 = new C1410o();
        c1410o7.m3025b(enumC1407l);
        c1410o7.m3024a(dateTimeFormatterM3034k);
        c1410o7.m3026c('T');
        c1410o7.m3024a(dateTimeFormatterM3034k2);
        DateTimeFormatter dateTimeFormatterM3034k3 = c1410o7.m3034k(enumC1418w, c1384s);
        C1410o c1410o8 = new C1410o();
        c1410o8.m3025b(enumC1407l);
        c1410o8.m3024a(dateTimeFormatterM3034k3);
        EnumC1407l enumC1407l2 = EnumC1407l.LENIENT;
        c1410o8.m3025b(enumC1407l2);
        c1410o8.m3025b(c1404i);
        EnumC1407l enumC1407l3 = EnumC1407l.STRICT;
        c1410o8.m3025b(enumC1407l3);
        DateTimeFormatter dateTimeFormatterM3034k4 = c1410o8.m3034k(enumC1418w, c1384s);
        C1410o c1410o9 = new C1410o();
        c1410o9.m3024a(dateTimeFormatterM3034k4);
        c1410o9.m3033j();
        c1410o9.m3026c('[');
        EnumC1407l enumC1407l4 = EnumC1407l.SENSITIVE;
        c1410o9.m3025b(enumC1407l4);
        c1410o9.m3025b(new C1402g(1));
        c1410o9.m3026c(']');
        c1410o9.m3034k(enumC1418w, c1384s);
        C1410o c1410o10 = new C1410o();
        c1410o10.m3024a(dateTimeFormatterM3034k3);
        c1410o10.m3033j();
        c1410o10.m3025b(c1404i);
        c1410o10.m3033j();
        c1410o10.m3026c('[');
        c1410o10.m3025b(enumC1407l4);
        c1410o10.m3025b(new C1402g(1));
        c1410o10.m3026c(']');
        c1410o10.m3034k(enumC1418w, c1384s);
        C1410o c1410o11 = new C1410o();
        c1410o11.m3025b(enumC1407l);
        c1410o11.m3031h(enumC1435a, 4, 10, enumC1419x);
        c1410o11.m3026c('-');
        c1410o11.m3030g(EnumC1435a.DAY_OF_YEAR, 3);
        c1410o11.m3033j();
        c1410o11.m3025b(c1404i);
        c1410o11.m3034k(enumC1418w, c1384s);
        C1410o c1410o12 = new C1410o();
        c1410o12.m3025b(enumC1407l);
        c1410o12.m3031h(AbstractC1444j.f5612c, 4, 10, enumC1419x);
        c1410o12.m3027d("-W");
        c1410o12.m3030g(AbstractC1444j.f5611b, 2);
        c1410o12.m3026c('-');
        EnumC1435a enumC1435a7 = EnumC1435a.DAY_OF_WEEK;
        c1410o12.m3030g(enumC1435a7, 1);
        c1410o12.m3033j();
        c1410o12.m3025b(c1404i);
        c1410o12.m3034k(enumC1418w, c1384s);
        C1410o c1410o13 = new C1410o();
        c1410o13.m3025b(enumC1407l);
        c1410o13.m3025b(new C1402g(0));
        f5494f = c1410o13.m3034k(enumC1418w, null);
        C1410o c1410o14 = new C1410o();
        c1410o14.m3025b(enumC1407l);
        c1410o14.m3030g(enumC1435a, 4);
        c1410o14.m3030g(enumC1435a2, 2);
        c1410o14.m3030g(enumC1435a3, 2);
        c1410o14.m3033j();
        c1410o14.m3025b(enumC1407l2);
        c1410o14.m3025b(new C1404i("+HHMMss", "Z"));
        c1410o14.m3025b(enumC1407l3);
        c1410o14.m3034k(enumC1418w, c1384s);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C1410o c1410o15 = new C1410o();
        c1410o15.m3025b(enumC1407l);
        c1410o15.m3025b(enumC1407l2);
        c1410o15.m3033j();
        c1410o15.m3028e(enumC1435a7, map);
        c1410o15.m3027d(", ");
        c1410o15.m3032i();
        c1410o15.m3031h(enumC1435a3, 1, 2, EnumC1419x.NOT_NEGATIVE);
        c1410o15.m3026c(' ');
        c1410o15.m3028e(enumC1435a2, map2);
        c1410o15.m3026c(' ');
        c1410o15.m3030g(enumC1435a, 4);
        c1410o15.m3026c(' ');
        c1410o15.m3030g(enumC1435a4, 2);
        c1410o15.m3026c(':');
        c1410o15.m3030g(enumC1435a5, 2);
        c1410o15.m3033j();
        c1410o15.m3026c(':');
        c1410o15.m3030g(enumC1435a6, 2);
        c1410o15.m3032i();
        c1410o15.m3026c(' ');
        c1410o15.m3025b(new C1404i("+HHMM", "GMT"));
        c1410o15.m3034k(EnumC1418w.SMART, c1384s);
    }

    public DateTimeFormatter(C1399d c1399d, Locale locale, EnumC1418w enumC1418w, InterfaceC1377l interfaceC1377l) {
        C1416u c1416u = C1416u.f5552a;
        this.f5495a = c1399d;
        Objects.requireNonNull(locale, "locale");
        this.f5496b = locale;
        this.f5497c = c1416u;
        Objects.requireNonNull(enumC1418w, "resolverStyle");
        this.f5498d = enumC1418w;
        this.f5499e = interfaceC1377l;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1417v m3007a(CharSequence charSequence) {
        String string;
        long j;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C1411p c1411p = new C1411p(this);
        int iMo3008A = this.f5495a.mo3008A(c1411p, charSequence, parsePosition.getIndex());
        AbstractC1462z abstractC1462z = null;
        if (iMo3008A < 0) {
            parsePosition.setErrorIndex(~iMo3008A);
            c1411p = null;
        } else {
            parsePosition.setIndex(iMo3008A);
        }
        if (c1411p != null) {
            DateTimeFormatter dateTimeFormatter = c1411p.f5539a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C1417v c1417vM3038c = c1411p.m3038c();
                InterfaceC1377l interfaceC1377l = c1411p.m3038c().f5555c;
                if (interfaceC1377l == null && (interfaceC1377l = dateTimeFormatter.f5499e) == null) {
                    interfaceC1377l = C1384s.f5471c;
                }
                c1417vM3038c.f5555c = interfaceC1377l;
                AbstractC1462z abstractC1462z2 = c1417vM3038c.f5554b;
                if (abstractC1462z2 != null) {
                    abstractC1462z = abstractC1462z2;
                } else {
                    dateTimeFormatter.getClass();
                }
                c1417vM3038c.f5554b = abstractC1462z;
                c1417vM3038c.f5557e = this.f5498d;
                c1417vM3038c.m3046q();
                c1417vM3038c.m3051y(c1417vM3038c.f5555c.mo2930S(c1417vM3038c.f5553a, c1417vM3038c.f5557e));
                c1417vM3038c.m3049u();
                if (((HashMap) c1417vM3038c.f5553a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c1417vM3038c.f5553a).entrySet().iterator();
                        while (it.hasNext()) {
                            InterfaceC1452r interfaceC1452r = (InterfaceC1452r) ((Map.Entry) it.next()).getKey();
                            InterfaceC1448n interfaceC1448nMo3098F = interfaceC1452r.mo3098F(c1417vM3038c.f5553a, c1417vM3038c, c1417vM3038c.f5557e);
                            if (interfaceC1448nMo3098F != null) {
                                if (interfaceC1448nMo3098F instanceof InterfaceC1372i) {
                                    InterfaceC1372i interfaceC1372i = (InterfaceC1372i) interfaceC1448nMo3098F;
                                    AbstractC1462z abstractC1462z3 = c1417vM3038c.f5554b;
                                    if (abstractC1462z3 == null) {
                                        c1417vM3038c.f5554b = interfaceC1372i.mo2963J();
                                    } else if (!abstractC1462z3.equals(interfaceC1372i.mo2963J())) {
                                        throw new C1354c("ChronoZonedDateTime must use the effective parsed zone: " + c1417vM3038c.f5554b);
                                    }
                                    interfaceC1448nMo3098F = interfaceC1372i.mo2971x();
                                }
                                if (interfaceC1448nMo3098F instanceof InterfaceC1362d) {
                                    InterfaceC1362d interfaceC1362d = (InterfaceC1362d) interfaceC1448nMo3098F;
                                    c1417vM3038c.m3050w(interfaceC1362d.mo2954k(), C1434t.f5596d);
                                    c1417vM3038c.m3051y(interfaceC1362d.mo2955n());
                                } else if (interfaceC1448nMo3098F instanceof ChronoLocalDate) {
                                    c1417vM3038c.m3051y((ChronoLocalDate) interfaceC1448nMo3098F);
                                } else if (interfaceC1448nMo3098F instanceof C1426l) {
                                    c1417vM3038c.m3050w((C1426l) interfaceC1448nMo3098F, C1434t.f5596d);
                                } else {
                                    throw new C1354c("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                            } else if (!((HashMap) c1417vM3038c.f5553a).containsKey(interfaceC1452r)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (i == 50) {
                        throw new C1354c("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c1417vM3038c.m3046q();
                        c1417vM3038c.m3051y(c1417vM3038c.f5555c.mo2930S(c1417vM3038c.f5553a, c1417vM3038c.f5557e));
                        c1417vM3038c.m3049u();
                    }
                }
                if (c1417vM3038c.f5559g == null) {
                    Map map = c1417vM3038c.f5553a;
                    EnumC1435a enumC1435a = EnumC1435a.MILLI_OF_SECOND;
                    if (((HashMap) map).containsKey(enumC1435a)) {
                        long jLongValue = ((Long) ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a)).longValue();
                        Map map2 = c1417vM3038c.f5553a;
                        EnumC1435a enumC1435a2 = EnumC1435a.MICRO_OF_SECOND;
                        if (((HashMap) map2).containsKey(enumC1435a2)) {
                            long jLongValue2 = (((Long) ((HashMap) c1417vM3038c.f5553a).get(enumC1435a2)).longValue() % 1000) + (jLongValue * 1000);
                            c1417vM3038c.m3052z(enumC1435a, enumC1435a2, Long.valueOf(jLongValue2));
                            ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a2);
                            ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map3 = c1417vM3038c.f5553a;
                        EnumC1435a enumC1435a3 = EnumC1435a.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC1435a3)) {
                            ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a3)).longValue() * 1000));
                        }
                    }
                    Map map4 = c1417vM3038c.f5553a;
                    EnumC1435a enumC1435a4 = EnumC1435a.HOUR_OF_DAY;
                    Long l8 = (Long) ((HashMap) map4).get(enumC1435a4);
                    if (l8 != null) {
                        Map map5 = c1417vM3038c.f5553a;
                        EnumC1435a enumC1435a5 = EnumC1435a.MINUTE_OF_HOUR;
                        Long l9 = (Long) ((HashMap) map5).get(enumC1435a5);
                        Map map6 = c1417vM3038c.f5553a;
                        EnumC1435a enumC1435a6 = EnumC1435a.SECOND_OF_MINUTE;
                        Long l10 = (Long) ((HashMap) map6).get(enumC1435a6);
                        Map map7 = c1417vM3038c.f5553a;
                        EnumC1435a enumC1435a7 = EnumC1435a.NANO_OF_SECOND;
                        Long l11 = (Long) ((HashMap) map7).get(enumC1435a7);
                        if ((l9 != null || (l10 == null && l11 == null)) && (l9 == null || l10 != null || l11 == null)) {
                            long jLongValue3 = l9 != null ? l9.longValue() : 0L;
                            long jLongValue4 = l10 != null ? l10.longValue() : 0L;
                            long jLongValue5 = l11 != null ? l11.longValue() : 0L;
                            long j8 = jLongValue4;
                            j = 1000000;
                            c1417vM3038c.m3048t(l8.longValue(), jLongValue3, j8, jLongValue5);
                            ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a4);
                            ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a5);
                            ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a6);
                            ((HashMap) c1417vM3038c.f5553a).remove(enumC1435a7);
                        } else {
                            j = 1000000;
                        }
                    } else {
                        j = 1000000;
                    }
                    if (c1417vM3038c.f5557e != EnumC1418w.LENIENT && ((HashMap) c1417vM3038c.f5553a).size() > 0) {
                        for (Map.Entry entry : ((HashMap) c1417vM3038c.f5553a).entrySet()) {
                            InterfaceC1452r interfaceC1452r2 = (InterfaceC1452r) entry.getKey();
                            if (interfaceC1452r2 instanceof EnumC1435a) {
                                EnumC1435a enumC1435a8 = (EnumC1435a) interfaceC1452r2;
                                if (enumC1435a8.m3095Y()) {
                                    enumC1435a8.m3094X(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                }
                ChronoLocalDate chronoLocalDate = c1417vM3038c.f5558f;
                if (chronoLocalDate != null) {
                    c1417vM3038c.m3045p(chronoLocalDate);
                }
                C1426l c1426l = c1417vM3038c.f5559g;
                if (c1426l != null) {
                    c1417vM3038c.m3045p(c1426l);
                    if (c1417vM3038c.f5558f != null && ((HashMap) c1417vM3038c.f5553a).size() > 0) {
                        c1417vM3038c.m3045p(c1417vM3038c.f5558f.mo2892L(c1417vM3038c.f5559g));
                    }
                }
                if (c1417vM3038c.f5558f != null && c1417vM3038c.f5559g != null) {
                    C1434t c1434t = c1417vM3038c.f5560h;
                    c1434t.getClass();
                    C1434t c1434t2 = C1434t.f5596d;
                    if (c1434t != c1434t2) {
                        c1417vM3038c.f5558f = c1417vM3038c.f5558f.mo2895R(c1417vM3038c.f5560h);
                        c1417vM3038c.f5560h = c1434t2;
                    }
                }
                if (c1417vM3038c.f5559g == null) {
                    if (!((HashMap) c1417vM3038c.f5553a).containsKey(EnumC1435a.INSTANT_SECONDS)) {
                        if (!((HashMap) c1417vM3038c.f5553a).containsKey(EnumC1435a.SECOND_OF_DAY)) {
                            if (((HashMap) c1417vM3038c.f5553a).containsKey(EnumC1435a.SECOND_OF_MINUTE)) {
                                Map map8 = c1417vM3038c.f5553a;
                                EnumC1435a enumC1435a9 = EnumC1435a.NANO_OF_SECOND;
                                if (((HashMap) map8).containsKey(enumC1435a9)) {
                                    long jLongValue6 = ((Long) ((HashMap) c1417vM3038c.f5553a).get(enumC1435a9)).longValue();
                                    ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 / 1000));
                                    ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.MILLI_OF_SECOND, Long.valueOf(jLongValue6 / j));
                                } else {
                                    ((HashMap) c1417vM3038c.f5553a).put(enumC1435a9, 0L);
                                    ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.MICRO_OF_SECOND, 0L);
                                    ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.MILLI_OF_SECOND, 0L);
                                }
                            }
                        }
                    }
                }
                if (c1417vM3038c.f5558f != null && c1417vM3038c.f5559g != null) {
                    Long l12 = (Long) ((HashMap) c1417vM3038c.f5553a).get(EnumC1435a.OFFSET_SECONDS);
                    if (l12 != null) {
                        ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.INSTANT_SECONDS, Long.valueOf(c1417vM3038c.f5558f.mo2892L(c1417vM3038c.f5559g).mo2951E(C1351a0.m2915Y(l12.intValue())).m2964W()));
                        return c1417vM3038c;
                    }
                    if (c1417vM3038c.f5554b != null) {
                        ((HashMap) c1417vM3038c.f5553a).put(EnumC1435a.INSTANT_SECONDS, Long.valueOf(c1417vM3038c.f5558f.mo2892L(c1417vM3038c.f5559g).mo2951E(c1417vM3038c.f5554b).m2964W()));
                    }
                }
                return c1417vM3038c;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f5495a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
