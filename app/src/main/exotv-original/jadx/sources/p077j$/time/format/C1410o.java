package p077j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p077j$.time.C1421g;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1444j;
import p077j$.time.temporal.AbstractC1446l;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1442h;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.o */
/* loaded from: classes2.dex */
public final class C1410o {

    /* renamed from: f */
    public static final C1421g f5533f = new C1421g(1);

    /* renamed from: a */
    public C1410o f5534a;

    /* renamed from: b */
    public final C1410o f5535b;

    /* renamed from: c */
    public final List f5536c;

    /* renamed from: d */
    public final boolean f5537d;

    /* renamed from: e */
    public int f5538e;

    static {
        HashMap map = new HashMap();
        map.put('G', EnumC1435a.ERA);
        map.put('y', EnumC1435a.YEAR_OF_ERA);
        map.put('u', EnumC1435a.YEAR);
        EnumC1442h enumC1442h = AbstractC1444j.f5610a;
        map.put('Q', enumC1442h);
        map.put('q', enumC1442h);
        EnumC1435a enumC1435a = EnumC1435a.MONTH_OF_YEAR;
        map.put('M', enumC1435a);
        map.put('L', enumC1435a);
        map.put('D', EnumC1435a.DAY_OF_YEAR);
        map.put('d', EnumC1435a.DAY_OF_MONTH);
        map.put('F', EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC1435a enumC1435a2 = EnumC1435a.DAY_OF_WEEK;
        map.put('E', enumC1435a2);
        map.put('c', enumC1435a2);
        map.put('e', enumC1435a2);
        map.put('a', EnumC1435a.AMPM_OF_DAY);
        map.put('H', EnumC1435a.HOUR_OF_DAY);
        map.put('k', EnumC1435a.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC1435a.HOUR_OF_AMPM);
        map.put('h', EnumC1435a.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC1435a.MINUTE_OF_HOUR);
        map.put('s', EnumC1435a.SECOND_OF_MINUTE);
        EnumC1435a enumC1435a3 = EnumC1435a.NANO_OF_SECOND;
        map.put('S', enumC1435a3);
        map.put('A', EnumC1435a.MILLI_OF_DAY);
        map.put('n', enumC1435a3);
        map.put('N', EnumC1435a.NANO_OF_DAY);
        map.put('g', AbstractC1446l.f5617a);
    }

    public C1410o() {
        this.f5534a = this;
        this.f5536c = new ArrayList();
        this.f5538e = -1;
        this.f5535b = null;
        this.f5537d = false;
    }

    public C1410o(C1410o c1410o) {
        this.f5534a = this;
        this.f5536c = new ArrayList();
        this.f5538e = -1;
        this.f5535b = c1410o;
        this.f5537d = true;
    }

    /* renamed from: g */
    public final void m3030g(InterfaceC1452r interfaceC1452r, int i) {
        Objects.requireNonNull(interfaceC1452r, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m3029f(new C1403h(interfaceC1452r, i, i, EnumC1419x.NOT_NEGATIVE));
    }

    /* renamed from: h */
    public final void m3031h(InterfaceC1452r interfaceC1452r, int i, int i4, EnumC1419x enumC1419x) {
        if (i == i4 && enumC1419x == EnumC1419x.NOT_NEGATIVE) {
            m3030g(interfaceC1452r, i4);
            return;
        }
        Objects.requireNonNull(interfaceC1452r, "field");
        Objects.requireNonNull(enumC1419x, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i4);
        }
        if (i4 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i4 + " < " + i);
        }
        m3029f(new C1403h(interfaceC1452r, i, i4, enumC1419x));
    }

    /* renamed from: f */
    public final void m3029f(C1403h c1403h) {
        C1403h c1403hMo3011b;
        C1410o c1410o = this.f5534a;
        int i = c1410o.f5538e;
        if (i < 0) {
            c1410o.f5538e = m3025b(c1403h);
            return;
        }
        C1403h c1403h2 = (C1403h) ((ArrayList) c1410o.f5536c).get(i);
        int i4 = c1403h.f5512b;
        int i8 = c1403h.f5513c;
        if (i4 == i8 && c1403h.f5514d == EnumC1419x.NOT_NEGATIVE) {
            c1403hMo3011b = c1403h2.mo3012c(i8);
            m3025b(c1403h.mo3011b());
            this.f5534a.f5538e = i;
        } else {
            c1403hMo3011b = c1403h2.mo3011b();
            this.f5534a.f5538e = m3025b(c1403h);
        }
        ((ArrayList) this.f5534a.f5536c).set(i, c1403hMo3011b);
    }

    /* renamed from: e */
    public final void m3028e(EnumC1435a enumC1435a, Map map) {
        Objects.requireNonNull(enumC1435a, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC1420y enumC1420y = EnumC1420y.FULL;
        m3025b(new C1409n(enumC1435a, enumC1420y, new C1396a(new C1415t(Collections.singletonMap(enumC1420y, linkedHashMap)))));
    }

    /* renamed from: c */
    public final void m3026c(char c8) {
        m3025b(new C1398c(c8));
    }

    /* renamed from: d */
    public final void m3027d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m3025b(new C1398c(str.charAt(0)));
        } else {
            m3025b(new C1408m(str));
        }
    }

    /* renamed from: a */
    public final void m3024a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C1399d c1399d = dateTimeFormatter.f5495a;
        if (c1399d.f5505b) {
            c1399d = new C1399d(c1399d.f5504a, false);
        }
        m3025b(c1399d);
    }

    /* renamed from: j */
    public final void m3033j() {
        C1410o c1410o = this.f5534a;
        c1410o.f5538e = -1;
        this.f5534a = new C1410o(c1410o);
    }

    /* renamed from: i */
    public final void m3032i() {
        C1410o c1410o = this.f5534a;
        if (c1410o.f5535b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c1410o.f5536c).size() > 0) {
            C1410o c1410o2 = this.f5534a;
            C1399d c1399d = new C1399d(c1410o2.f5536c, c1410o2.f5537d);
            this.f5534a = this.f5534a.f5535b;
            m3025b(c1399d);
            return;
        }
        this.f5534a = this.f5534a.f5535b;
    }

    /* renamed from: b */
    public final int m3025b(InterfaceC1400e interfaceC1400e) {
        Objects.requireNonNull(interfaceC1400e, "pp");
        C1410o c1410o = this.f5534a;
        c1410o.getClass();
        ((ArrayList) c1410o.f5536c).add(interfaceC1400e);
        this.f5534a.f5538e = -1;
        return ((ArrayList) r2.f5536c).size() - 1;
    }

    /* renamed from: k */
    public final DateTimeFormatter m3034k(EnumC1418w enumC1418w, InterfaceC1377l interfaceC1377l) {
        return m3035l(Locale.getDefault(), enumC1418w, interfaceC1377l);
    }

    /* renamed from: l */
    public final DateTimeFormatter m3035l(Locale locale, EnumC1418w enumC1418w, InterfaceC1377l interfaceC1377l) {
        Objects.requireNonNull(locale, "locale");
        while (this.f5534a.f5535b != null) {
            m3032i();
        }
        C1399d c1399d = new C1399d(this.f5536c, false);
        C1416u c1416u = C1416u.f5552a;
        return new DateTimeFormatter(c1399d, locale, enumC1418w, interfaceC1377l);
    }
}
