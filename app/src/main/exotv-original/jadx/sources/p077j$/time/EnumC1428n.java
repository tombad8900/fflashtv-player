package p077j$.time;

import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.n */
/* loaded from: classes2.dex */
public final class EnumC1428n implements InterfaceC1448n, InterfaceC1449o {
    public static final EnumC1428n APRIL;
    public static final EnumC1428n AUGUST;
    public static final EnumC1428n DECEMBER;
    public static final EnumC1428n FEBRUARY;
    public static final EnumC1428n JANUARY;
    public static final EnumC1428n JULY;
    public static final EnumC1428n JUNE;
    public static final EnumC1428n MARCH;
    public static final EnumC1428n MAY;
    public static final EnumC1428n NOVEMBER;
    public static final EnumC1428n OCTOBER;
    public static final EnumC1428n SEPTEMBER;

    /* renamed from: a */
    public static final EnumC1428n[] f5583a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1428n[] f5584b;

    public static EnumC1428n valueOf(String str) {
        return (EnumC1428n) Enum.valueOf(EnumC1428n.class, str);
    }

    public static EnumC1428n[] values() {
        return (EnumC1428n[]) f5584b.clone();
    }

    static {
        EnumC1428n enumC1428n = new EnumC1428n("JANUARY", 0);
        JANUARY = enumC1428n;
        EnumC1428n enumC1428n2 = new EnumC1428n("FEBRUARY", 1);
        FEBRUARY = enumC1428n2;
        EnumC1428n enumC1428n3 = new EnumC1428n("MARCH", 2);
        MARCH = enumC1428n3;
        EnumC1428n enumC1428n4 = new EnumC1428n("APRIL", 3);
        APRIL = enumC1428n4;
        EnumC1428n enumC1428n5 = new EnumC1428n("MAY", 4);
        MAY = enumC1428n5;
        EnumC1428n enumC1428n6 = new EnumC1428n("JUNE", 5);
        JUNE = enumC1428n6;
        EnumC1428n enumC1428n7 = new EnumC1428n("JULY", 6);
        JULY = enumC1428n7;
        EnumC1428n enumC1428n8 = new EnumC1428n("AUGUST", 7);
        AUGUST = enumC1428n8;
        EnumC1428n enumC1428n9 = new EnumC1428n("SEPTEMBER", 8);
        SEPTEMBER = enumC1428n9;
        EnumC1428n enumC1428n10 = new EnumC1428n("OCTOBER", 9);
        OCTOBER = enumC1428n10;
        EnumC1428n enumC1428n11 = new EnumC1428n("NOVEMBER", 10);
        NOVEMBER = enumC1428n11;
        EnumC1428n enumC1428n12 = new EnumC1428n("DECEMBER", 11);
        DECEMBER = enumC1428n12;
        f5584b = new EnumC1428n[]{enumC1428n, enumC1428n2, enumC1428n3, enumC1428n4, enumC1428n5, enumC1428n6, enumC1428n7, enumC1428n8, enumC1428n9, enumC1428n10, enumC1428n11, enumC1428n12};
        f5583a = values();
    }

    /* renamed from: I */
    public static EnumC1428n m3081I(int i) {
        if (i < 1 || i > 12) {
            throw new C1354c("Invalid value for MonthOfYear: " + i);
        }
        return f5583a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.MONTH_OF_YEAR : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.MONTH_OF_YEAR) {
            return interfaceC1452r.mo3091I();
        }
        return super.mo2908l(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return interfaceC1452r.mo3092P(this);
    }

    /* renamed from: A */
    public final int m3082A(boolean z7) {
        int i = AbstractC1427m.f5582a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z7 ? 29 : 28;
    }

    /* renamed from: F */
    public final int m3083F() {
        int i = AbstractC1427m.f5582a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    /* renamed from: w */
    public final int m3084w(boolean z7) {
        switch (AbstractC1427m.f5582a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z7 ? 1 : 0) + 91;
            case 3:
                return (z7 ? 1 : 0) + 152;
            case 4:
                return (z7 ? 1 : 0) + 244;
            case 5:
                return (z7 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z7 ? 1 : 0) + 60;
            case 8:
                return (z7 ? 1 : 0) + 121;
            case 9:
                return (z7 ? 1 : 0) + 182;
            case 10:
                return (z7 ? 1 : 0) + 213;
            case 11:
                return (z7 ? 1 : 0) + 274;
            default:
                return (z7 ? 1 : 0) + 335;
        }
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5621b) {
            return C1384s.f5471c;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.MONTHS;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        if (!InterfaceC1377l.m2980r(interfaceC1447m).equals(C1384s.f5471c)) {
            throw new C1354c("Adjustment only supported on ISO date-time");
        }
        return interfaceC1447m.mo2877d(getValue(), EnumC1435a.MONTH_OF_YEAR);
    }
}
