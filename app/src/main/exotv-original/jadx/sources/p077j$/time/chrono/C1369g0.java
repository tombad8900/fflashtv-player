package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p077j$.time.AbstractC1352b;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1354c;
import p077j$.time.Instant;
import p077j$.time.LocalDate;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;

/* renamed from: j$.time.chrono.g0 */
/* loaded from: classes2.dex */
public final class C1369g0 extends AbstractC1356a implements Serializable {

    /* renamed from: c */
    public static final C1369g0 f5443c = new C1369g0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"\u0e1e.\u0e28.", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: B */
    public final InterfaceC1378m mo2932B(int i) {
        if (i == 0) {
            return EnumC1375j0.BEFORE_BE;
        }
        if (i == 1) {
            return EnumC1375j0.f5448BE;
        }
        throw new C1354c("Invalid era: " + i);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: q */
    public final String mo2939q() {
        return "ThaiBuddhist";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: t */
    public final String mo2940t() {
        return "buddhist";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: Q */
    public final ChronoLocalDate mo2936Q(int i, int i4, int i8) {
        return new C1373i0(LocalDate.m2886b0(i - 543, i4, i8));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: u */
    public final ChronoLocalDate mo2941u(int i, int i4) {
        return new C1373i0(LocalDate.m2888d0(i - 543, i4));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: p */
    public final ChronoLocalDate mo2938p(long j) {
        return new C1373i0(LocalDate.m2887c0(j));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: M */
    public final ChronoLocalDate mo2935M() {
        return new C1373i0(LocalDate.m2884F(LocalDate.m2885a0(AbstractC1352b.m2923b())));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: G */
    public final ChronoLocalDate mo2934G(InterfaceC1448n interfaceC1448n) {
        if (interfaceC1448n instanceof C1373i0) {
            return (C1373i0) interfaceC1448n;
        }
        return new C1373i0(LocalDate.m2884F(interfaceC1448n));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: C */
    public final int mo2933C(InterfaceC1378m interfaceC1378m, int i) {
        if (interfaceC1378m instanceof EnumC1375j0) {
            return interfaceC1378m == EnumC1375j0.f5448BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private C1369g0() {
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: z */
    public final List mo2943z() {
        return AbstractC1352b.m2922a(EnumC1375j0.values());
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: y */
    public final C1456v mo2942y(EnumC1435a enumC1435a) {
        int i = AbstractC1367f0.f5437a[enumC1435a.ordinal()];
        if (i == 1) {
            C1456v c1456v = EnumC1435a.PROLEPTIC_MONTH.f5602b;
            return C1456v.m3103f(c1456v.f5627a + 6516, c1456v.f5630d + 6516);
        }
        if (i == 2) {
            C1456v c1456v2 = EnumC1435a.YEAR.f5602b;
            return C1456v.m3104g((-(c1456v2.f5627a + 543)) + 1, c1456v2.f5630d + 543);
        }
        if (i != 3) {
            return enumC1435a.f5602b;
        }
        C1456v c1456v3 = EnumC1435a.YEAR.f5602b;
        return C1456v.m3103f(c1456v3.f5627a + 543, c1456v3.f5630d + 543);
    }

    @Override // p077j$.time.chrono.AbstractC1356a, p077j$.time.chrono.InterfaceC1377l
    /* renamed from: S */
    public final ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w) {
        return (C1373i0) super.mo2930S(map, enumC1418w);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: T */
    public final InterfaceC1372i mo2937T(Instant instant, AbstractC1462z abstractC1462z) {
        return C1376k.m2976F(this, instant, abstractC1462z);
    }

    public Object writeReplace() {
        return new C1365e0((byte) 1, this);
    }
}
