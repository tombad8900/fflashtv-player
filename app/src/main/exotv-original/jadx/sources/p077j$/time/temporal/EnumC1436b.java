package p077j$.time.temporal;

import p077j$.time.Duration;

/* renamed from: j$.time.temporal.b */
/* loaded from: classes2.dex */
public enum EnumC1436b implements InterfaceC1454t {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* renamed from: a */
    public final String f5604a;

    static {
        Duration.m2868F(1L);
        Duration.m2868F(1000L);
        Duration.m2868F(1000000L);
        Duration.m2867A(1L, 0);
        Duration.m2867A(60L, 0);
        Duration.m2867A(3600L, 0);
        Duration.m2867A(43200L, 0);
        Duration.m2867A(86400L, 0);
        Duration.m2867A(604800L, 0);
        Duration.m2867A(2629746L, 0);
        Duration.m2867A(31556952L, 0);
        Duration.m2867A(315569520L, 0);
        Duration.m2867A(3155695200L, 0);
        Duration.m2867A(31556952000L, 0);
        Duration.m2867A(31556952000000000L, 0);
        Duration.m2867A(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L));
    }

    EnumC1436b(String str) {
        this.f5604a = str;
    }

    @Override // p077j$.time.temporal.InterfaceC1454t
    /* renamed from: w */
    public final InterfaceC1447m mo3097w(InterfaceC1447m interfaceC1447m, long j) {
        return interfaceC1447m.mo2880h(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5604a;
    }
}
