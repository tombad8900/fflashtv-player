package p077j$.time;

import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1421g implements InterfaceC1449o {

    /* renamed from: a */
    public final /* synthetic */ int f5564a;

    public /* synthetic */ C1421g(int i) {
        this.f5564a = i;
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        EnumC1435a enumC1435a = EnumC1435a.DAY_OF_MONTH;
        return interfaceC1447m.mo2877d(interfaceC1447m.mo2908l(enumC1435a).f5630d, enumC1435a);
    }

    /* renamed from: l */
    public Object m3053l(InterfaceC1448n interfaceC1448n) {
        switch (this.f5564a) {
            case 0:
                return LocalDate.m2884F(interfaceC1448n);
            case 1:
                AbstractC1462z abstractC1462z = (AbstractC1462z) interfaceC1448n.mo2875b(AbstractC1453s.f5620a);
                if (abstractC1462z == null || (abstractC1462z instanceof C1351a0)) {
                    return null;
                }
                return abstractC1462z;
            case 2:
            default:
                EnumC1435a enumC1435a = EnumC1435a.NANO_OF_DAY;
                if (interfaceC1448n.mo2881i(enumC1435a)) {
                    return C1426l.m3067V(interfaceC1448n.mo2882j(enumC1435a));
                }
                return null;
            case 3:
                return (AbstractC1462z) interfaceC1448n.mo2875b(AbstractC1453s.f5620a);
            case 4:
                return (InterfaceC1377l) interfaceC1448n.mo2875b(AbstractC1453s.f5621b);
            case 5:
                return (InterfaceC1454t) interfaceC1448n.mo2875b(AbstractC1453s.f5622c);
            case 6:
                EnumC1435a enumC1435a2 = EnumC1435a.OFFSET_SECONDS;
                if (interfaceC1448n.mo2881i(enumC1435a2)) {
                    return C1351a0.m2915Y(interfaceC1448n.mo2878f(enumC1435a2));
                }
                return null;
            case 7:
                AbstractC1462z abstractC1462z2 = (AbstractC1462z) interfaceC1448n.mo2875b(AbstractC1453s.f5620a);
                return abstractC1462z2 != null ? abstractC1462z2 : (AbstractC1462z) interfaceC1448n.mo2875b(AbstractC1453s.f5623d);
            case 8:
                EnumC1435a enumC1435a3 = EnumC1435a.EPOCH_DAY;
                if (interfaceC1448n.mo2881i(enumC1435a3)) {
                    return LocalDate.m2887c0(interfaceC1448n.mo2882j(enumC1435a3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5564a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
