package p077j$.time.temporal;

import p077j$.time.Duration;

/* renamed from: j$.time.temporal.i */
/* loaded from: classes2.dex */
public enum EnumC1443i implements InterfaceC1454t {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a */
    public final String f5609a;

    static {
        Duration.m2867A(31556952L, 0);
        Duration.m2867A(7889238L, 0);
    }

    EnumC1443i(String str) {
        this.f5609a = str;
    }

    @Override // p077j$.time.temporal.InterfaceC1454t
    /* renamed from: w */
    public final InterfaceC1447m mo3097w(InterfaceC1447m interfaceC1447m, long j) {
        int i = AbstractC1437c.f5605a[ordinal()];
        if (i == 1) {
            return interfaceC1447m.mo2877d(Math.addExact(interfaceC1447m.mo2878f(r0), j), AbstractC1444j.f5612c);
        }
        if (i == 2) {
            return interfaceC1447m.mo2880h(j / 4, EnumC1436b.YEARS).mo2880h((j % 4) * 3, EnumC1436b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5609a;
    }
}
