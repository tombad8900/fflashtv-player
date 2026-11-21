package p077j$.time.chrono;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1354c;
import p077j$.time.C1424j;
import p077j$.time.C1426l;
import p077j$.time.Instant;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;

/* renamed from: j$.time.chrono.l */
/* loaded from: classes2.dex */
public interface InterfaceC1377l extends Comparable {
    /* renamed from: B */
    InterfaceC1378m mo2932B(int i);

    /* renamed from: C */
    int mo2933C(InterfaceC1378m interfaceC1378m, int i);

    /* renamed from: G */
    ChronoLocalDate mo2934G(InterfaceC1448n interfaceC1448n);

    /* renamed from: M */
    ChronoLocalDate mo2935M();

    /* renamed from: Q */
    ChronoLocalDate mo2936Q(int i, int i4, int i8);

    /* renamed from: S */
    ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w);

    /* renamed from: T */
    InterfaceC1372i mo2937T(Instant instant, AbstractC1462z abstractC1462z);

    boolean equals(Object obj);

    int hashCode();

    /* renamed from: p */
    ChronoLocalDate mo2938p(long j);

    /* renamed from: q */
    String mo2939q();

    /* renamed from: t */
    String mo2940t();

    String toString();

    /* renamed from: u */
    ChronoLocalDate mo2941u(int i, int i4);

    /* renamed from: y */
    C1456v mo2942y(EnumC1435a enumC1435a);

    /* renamed from: z */
    List mo2943z();

    /* renamed from: r */
    static InterfaceC1377l m2980r(InterfaceC1448n interfaceC1448n) {
        Objects.requireNonNull(interfaceC1448n, "temporal");
        InterfaceC1377l interfaceC1377l = (InterfaceC1377l) interfaceC1448n.mo2875b(AbstractC1453s.f5621b);
        C1384s c1384s = C1384s.f5471c;
        if (interfaceC1377l != null) {
            return interfaceC1377l;
        }
        Objects.requireNonNull(c1384s, "defaultObj");
        return c1384s;
    }

    /* renamed from: of */
    static InterfaceC1377l m2979of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC1356a.f5425a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC1356a.f5425a;
            InterfaceC1377l interfaceC1377l = (InterfaceC1377l) concurrentHashMap2.get(str);
            if (interfaceC1377l == null) {
                interfaceC1377l = (InterfaceC1377l) AbstractC1356a.f5426b.get(str);
            }
            if (interfaceC1377l != null) {
                return interfaceC1377l;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(InterfaceC1377l.class).iterator();
                while (it.hasNext()) {
                    InterfaceC1377l interfaceC1377l2 = (InterfaceC1377l) it.next();
                    if (str.equals(interfaceC1377l2.mo2939q()) || str.equals(interfaceC1377l2.mo2940t())) {
                        return interfaceC1377l2;
                    }
                }
                throw new C1354c("Unknown chronology: ".concat(str));
            }
            C1380o c1380o = C1380o.f5454l;
            c1380o.getClass();
            AbstractC1356a.m2925A(c1380o, "Hijrah-umalqura");
            C1387v c1387v = C1387v.f5475c;
            c1387v.getClass();
            AbstractC1356a.m2925A(c1387v, "Japanese");
            C1357a0 c1357a0 = C1357a0.f5427c;
            c1357a0.getClass();
            AbstractC1356a.m2925A(c1357a0, "Minguo");
            C1369g0 c1369g0 = C1369g0.f5443c;
            c1369g0.getClass();
            AbstractC1356a.m2925A(c1369g0, "ThaiBuddhist");
            try {
                for (AbstractC1356a abstractC1356a : Arrays.asList(new AbstractC1356a[0])) {
                    if (!abstractC1356a.mo2939q().equals("ISO")) {
                        AbstractC1356a.m2925A(abstractC1356a, abstractC1356a.mo2939q());
                    }
                }
                C1384s c1384s = C1384s.f5471c;
                c1384s.getClass();
                AbstractC1356a.m2925A(c1384s, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* renamed from: H */
    default InterfaceC1362d mo2981H(C1424j c1424j) {
        try {
            return mo2934G(c1424j).mo2892L(C1426l.m3065F(c1424j));
        } catch (C1354c e) {
            throw new C1354c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + C1424j.class, e);
        }
    }
}
