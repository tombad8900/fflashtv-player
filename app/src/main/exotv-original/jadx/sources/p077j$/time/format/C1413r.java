package p077j$.time.format;

import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1354c;
import p077j$.time.Instant;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.r */
/* loaded from: classes2.dex */
public final class C1413r {

    /* renamed from: a */
    public final InterfaceC1448n f5547a;

    /* renamed from: b */
    public final DateTimeFormatter f5548b;

    /* renamed from: c */
    public int f5549c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.time.format.q] */
    public C1413r(Instant instant, DateTimeFormatter dateTimeFormatter) {
        InterfaceC1377l interfaceC1377l = dateTimeFormatter.f5499e;
        if (interfaceC1377l != null) {
            InterfaceC1377l interfaceC1377l2 = (InterfaceC1377l) instant.mo2875b(AbstractC1453s.f5621b);
            AbstractC1462z abstractC1462z = (AbstractC1462z) instant.mo2875b(AbstractC1453s.f5620a);
            ChronoLocalDate chronoLocalDateMo2934G = null;
            interfaceC1377l = Objects.equals(interfaceC1377l, interfaceC1377l2) ? null : interfaceC1377l;
            if (interfaceC1377l != null) {
                InterfaceC1377l interfaceC1377l3 = interfaceC1377l != null ? interfaceC1377l : interfaceC1377l2;
                if (interfaceC1377l != null) {
                    if (instant.mo2881i(EnumC1435a.EPOCH_DAY)) {
                        chronoLocalDateMo2934G = interfaceC1377l3.mo2934G(instant);
                    } else if (interfaceC1377l != C1384s.f5471c || interfaceC1377l2 != null) {
                        for (EnumC1435a enumC1435a : EnumC1435a.values()) {
                            if (enumC1435a.isDateBased() && instant.mo2881i(enumC1435a)) {
                                throw new C1354c("Unable to apply override chronology '" + interfaceC1377l + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + instant);
                            }
                        }
                    }
                }
                instant = new C1412q(chronoLocalDateMo2934G, instant, interfaceC1377l3, abstractC1462z);
            }
        }
        this.f5547a = instant;
        this.f5548b = dateTimeFormatter;
    }

    /* renamed from: a */
    public final Long m3043a(InterfaceC1452r interfaceC1452r) {
        int i = this.f5549c;
        InterfaceC1448n interfaceC1448n = this.f5547a;
        if (i <= 0 || interfaceC1448n.mo2881i(interfaceC1452r)) {
            return Long.valueOf(interfaceC1448n.mo2882j(interfaceC1452r));
        }
        return null;
    }

    public final String toString() {
        return this.f5547a.toString();
    }
}
