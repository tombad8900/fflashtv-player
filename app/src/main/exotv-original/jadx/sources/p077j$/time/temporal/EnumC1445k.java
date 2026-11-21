package p077j$.time.temporal;

import java.util.Map;
import p077j$.time.C1354c;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.format.C1417v;
import p077j$.time.format.EnumC1418w;

/* renamed from: j$.time.temporal.k */
/* loaded from: classes2.dex */
public enum EnumC1445k implements InterfaceC1452r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a */
    public final transient String f5614a;

    /* renamed from: b */
    public final transient C1456v f5615b;

    /* renamed from: c */
    public final transient long f5616c;

    @Override // p077j$.time.temporal.InterfaceC1452r
    public final boolean isDateBased() {
        return true;
    }

    static {
        EnumC1436b enumC1436b = EnumC1436b.NANOS;
    }

    EnumC1445k(String str, long j) {
        this.f5614a = str;
        this.f5615b = C1456v.m3103f((-365243219162L) + j, 365241780471L + j);
        this.f5616c = j;
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: I */
    public final C1456v mo3091I() {
        return this.f5615b;
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: V */
    public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
        if (!this.f5615b.m3109e(j)) {
            throw new C1354c("Invalid value: " + this.f5614a + " " + j);
        }
        return interfaceC1447m.mo2877d(Math.subtractExact(j, this.f5616c), EnumC1435a.EPOCH_DAY);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: A */
    public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
        if (interfaceC1448n.mo2881i(EnumC1435a.EPOCH_DAY)) {
            return this.f5615b;
        }
        throw new C1354c("Unsupported field: " + this);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: w */
    public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
        return interfaceC1448n.mo2881i(EnumC1435a.EPOCH_DAY);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: P */
    public final long mo3092P(InterfaceC1448n interfaceC1448n) {
        return interfaceC1448n.mo2882j(EnumC1435a.EPOCH_DAY) + this.f5616c;
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: F */
    public final InterfaceC1448n mo3098F(Map map, C1417v c1417v, EnumC1418w enumC1418w) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC1377l interfaceC1377lM2980r = InterfaceC1377l.m2980r(c1417v);
        EnumC1418w enumC1418w2 = EnumC1418w.LENIENT;
        long j = this.f5616c;
        if (enumC1418w == enumC1418w2) {
            return interfaceC1377lM2980r.mo2938p(Math.subtractExact(jLongValue, j));
        }
        this.f5615b.m3106b(jLongValue, this);
        return interfaceC1377lM2980r.mo2938p(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5614a;
    }
}
