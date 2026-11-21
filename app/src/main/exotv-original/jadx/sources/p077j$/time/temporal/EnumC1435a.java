package p077j$.time.temporal;

/* renamed from: j$.time.temporal.a */
/* loaded from: classes2.dex */
public enum EnumC1435a implements InterfaceC1452r {
    NANO_OF_SECOND("NanoOfSecond", C1456v.m3103f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C1456v.m3103f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C1456v.m3103f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C1456v.m3103f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C1456v.m3103f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C1456v.m3103f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C1456v.m3103f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C1456v.m3103f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C1456v.m3103f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C1456v.m3103f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C1456v.m3103f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C1456v.m3103f(1, 12)),
    HOUR_OF_DAY("HourOfDay", C1456v.m3103f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C1456v.m3103f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C1456v.m3103f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C1456v.m3103f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C1456v.m3103f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C1456v.m3103f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C1456v.m3104g(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C1456v.m3104g(365, 366)),
    EPOCH_DAY("EpochDay", C1456v.m3103f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C1456v.m3104g(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C1456v.m3103f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C1456v.m3103f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", C1456v.m3103f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C1456v.m3104g(999999999, 1000000000)),
    YEAR("Year", C1456v.m3103f(-999999999, 999999999), 0),
    ERA("Era", C1456v.m3103f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C1456v.m3103f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C1456v.m3103f(-64800, 64800));


    /* renamed from: a */
    public final String f5601a;

    /* renamed from: b */
    public final C1456v f5602b;

    static {
        EnumC1436b enumC1436b = EnumC1436b.NANOS;
    }

    EnumC1435a(String str, C1456v c1456v) {
        this.f5601a = str;
        this.f5602b = c1456v;
    }

    EnumC1435a(String str, C1456v c1456v, int i) {
        this.f5601a = str;
        this.f5602b = c1456v;
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: I */
    public final C1456v mo3091I() {
        return this.f5602b;
    }

    /* renamed from: X */
    public final void m3094X(long j) {
        this.f5602b.m3106b(j, this);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: Y */
    public final boolean m3095Y() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: w */
    public final boolean mo3096w(InterfaceC1448n interfaceC1448n) {
        return interfaceC1448n.mo2881i(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: A */
    public final C1456v mo3090A(InterfaceC1448n interfaceC1448n) {
        return interfaceC1448n.mo2908l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: P */
    public final long mo3092P(InterfaceC1448n interfaceC1448n) {
        return interfaceC1448n.mo2882j(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1452r
    /* renamed from: V */
    public final InterfaceC1447m mo3093V(InterfaceC1447m interfaceC1447m, long j) {
        return interfaceC1447m.mo2877d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5601a;
    }
}
