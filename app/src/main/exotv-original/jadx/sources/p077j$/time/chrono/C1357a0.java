package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
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

/* renamed from: j$.time.chrono.a0 */
/* loaded from: classes2.dex */
public final class C1357a0 extends AbstractC1356a implements Serializable {

    /* renamed from: c */
    public static final C1357a0 f5427c = new C1357a0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: q */
    public final String mo2939q() {
        return "Minguo";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: B */
    public final InterfaceC1378m mo2932B(int i) {
        if (i == 0) {
            return EnumC1363d0.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC1363d0.ROC;
        }
        throw new C1354c("Invalid era: " + i);
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: t */
    public final String mo2940t() {
        return "roc";
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: Q */
    public final ChronoLocalDate mo2936Q(int i, int i4, int i8) {
        return new C1361c0(LocalDate.m2886b0(i + 1911, i4, i8));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: u */
    public final ChronoLocalDate mo2941u(int i, int i4) {
        return new C1361c0(LocalDate.m2888d0(i + 1911, i4));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: p */
    public final ChronoLocalDate mo2938p(long j) {
        return new C1361c0(LocalDate.m2887c0(j));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: M */
    public final ChronoLocalDate mo2935M() {
        return new C1361c0(LocalDate.m2884F(LocalDate.m2885a0(AbstractC1352b.m2923b())));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: G */
    public final ChronoLocalDate mo2934G(InterfaceC1448n interfaceC1448n) {
        if (interfaceC1448n instanceof C1361c0) {
            return (C1361c0) interfaceC1448n;
        }
        return new C1361c0(LocalDate.m2884F(interfaceC1448n));
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: C */
    public final int mo2933C(InterfaceC1378m interfaceC1378m, int i) {
        if (interfaceC1378m instanceof EnumC1363d0) {
            return interfaceC1378m == EnumC1363d0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: z */
    public final List mo2943z() {
        return AbstractC1352b.m2922a(EnumC1363d0.values());
    }

    @Override // p077j$.time.chrono.InterfaceC1377l
    /* renamed from: y */
    public final C1456v mo2942y(EnumC1435a enumC1435a) {
        int i = AbstractC1391z.f5486a[enumC1435a.ordinal()];
        if (i == 1) {
            C1456v c1456v = EnumC1435a.PROLEPTIC_MONTH.f5602b;
            return C1456v.m3103f(c1456v.f5627a - 22932, c1456v.f5630d - 22932);
        }
        if (i == 2) {
            C1456v c1456v2 = EnumC1435a.YEAR.f5602b;
            return C1456v.m3104g(c1456v2.f5630d - 1911, (-c1456v2.f5627a) + 1912);
        }
        if (i != 3) {
            return enumC1435a.f5602b;
        }
        C1456v c1456v3 = EnumC1435a.YEAR.f5602b;
        return C1456v.m3103f(c1456v3.f5627a - 1911, c1456v3.f5630d - 1911);
    }

    @Override // p077j$.time.chrono.AbstractC1356a, p077j$.time.chrono.InterfaceC1377l
    /* renamed from: S */
    public final ChronoLocalDate mo2930S(Map map, EnumC1418w enumC1418w) {
        return (C1361c0) super.mo2930S(map, enumC1418w);
    }

    private C1357a0() {
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
