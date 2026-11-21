package p077j$.time.temporal;

import java.util.Objects;
import p077j$.time.AbstractC1392d;
import p077j$.time.C1354c;
import p077j$.time.C1421g;

/* renamed from: j$.time.temporal.n */
/* loaded from: classes2.dex */
public interface InterfaceC1448n {
    /* renamed from: i */
    boolean mo2881i(InterfaceC1452r interfaceC1452r);

    /* renamed from: j */
    long mo2882j(InterfaceC1452r interfaceC1452r);

    /* renamed from: l */
    default C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            Objects.requireNonNull(interfaceC1452r, "field");
            return interfaceC1452r.mo3090A(this);
        }
        if (mo2881i(interfaceC1452r)) {
            return ((EnumC1435a) interfaceC1452r).f5602b;
        }
        throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
    }

    /* renamed from: f */
    default int mo2878f(InterfaceC1452r interfaceC1452r) {
        C1456v c1456vMo2908l = mo2908l(interfaceC1452r);
        if (!c1456vMo2908l.m3108d()) {
            throw new C1455u("Invalid field " + interfaceC1452r + " for get() method, use getLong() instead");
        }
        long jMo2882j = mo2882j(interfaceC1452r);
        if (c1456vMo2908l.m3109e(jMo2882j)) {
            return (int) jMo2882j;
        }
        throw new C1354c("Invalid value for " + interfaceC1452r + " (valid values " + c1456vMo2908l + "): " + jMo2882j);
    }

    /* renamed from: b */
    default Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5620a || c1421g == AbstractC1453s.f5621b || c1421g == AbstractC1453s.f5622c) {
            return null;
        }
        return c1421g.m3053l(this);
    }
}
