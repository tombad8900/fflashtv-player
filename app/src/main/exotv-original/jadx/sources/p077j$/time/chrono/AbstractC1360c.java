package p077j$.time.chrono;

import java.io.Serializable;
import p077j$.time.LocalDate;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1360c implements ChronoLocalDate, InterfaceC1447m, InterfaceC1449o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* renamed from: A */
    public abstract ChronoLocalDate mo2945A(long j);

    /* renamed from: F */
    public abstract ChronoLocalDate mo2946F(long j);

    /* renamed from: I */
    public abstract ChronoLocalDate mo2947I(long j);

    @Override // p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return mo2874a(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        return mo2877d(j, interfaceC1452r);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC1447m mo2967m(LocalDate localDate) {
        return mo2967m(localDate);
    }

    /* renamed from: w */
    public static ChronoLocalDate m2944w(InterfaceC1377l interfaceC1377l, InterfaceC1447m interfaceC1447m) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) interfaceC1447m;
        if (interfaceC1377l.equals(chronoLocalDate.mo2901e())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC1377l.mo2939q() + ", actual: " + chronoLocalDate.mo2901e().mo2939q());
    }

    @Override // p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public ChronoLocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return super.mo2880h(j, interfaceC1454t);
        }
        switch (AbstractC1358b.f5428a[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return mo2945A(j);
            case 2:
                return mo2945A(Math.multiplyExact(j, 7));
            case 3:
                return mo2946F(j);
            case 4:
                return mo2947I(j);
            case 5:
                return mo2947I(Math.multiplyExact(j, 10));
            case 6:
                return mo2947I(Math.multiplyExact(j, 100));
            case 7:
                return mo2947I(Math.multiplyExact(j, 1000));
            case 8:
                EnumC1435a enumC1435a = EnumC1435a.ERA;
                return mo2877d(Math.addExact(mo2882j(enumC1435a), j), (InterfaceC1452r) enumC1435a);
            default:
                throw new C1455u("Unsupported unit: " + interfaceC1454t);
        }
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jMo2891K = mo2891K();
        return ((int) (jMo2891K ^ (jMo2891K >>> 32))) ^ mo2901e().hashCode();
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jMo2882j = mo2882j(EnumC1435a.YEAR_OF_ERA);
        long jMo2882j2 = mo2882j(EnumC1435a.MONTH_OF_YEAR);
        long jMo2882j3 = mo2882j(EnumC1435a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo2901e().toString());
        sb.append(" ");
        sb.append(mo2893N());
        sb.append(" ");
        sb.append(jMo2882j);
        sb.append(jMo2882j2 < 10 ? "-0" : "-");
        sb.append(jMo2882j2);
        sb.append(jMo2882j3 < 10 ? "-0" : "-");
        sb.append(jMo2882j3);
        return sb.toString();
    }
}
