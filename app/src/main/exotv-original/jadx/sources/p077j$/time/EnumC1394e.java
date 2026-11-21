package p077j$.time;

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
/* renamed from: j$.time.e */
/* loaded from: classes2.dex */
public final class EnumC1394e implements InterfaceC1448n, InterfaceC1449o {
    public static final EnumC1394e FRIDAY;
    public static final EnumC1394e MONDAY;
    public static final EnumC1394e SATURDAY;
    public static final EnumC1394e SUNDAY;
    public static final EnumC1394e THURSDAY;
    public static final EnumC1394e TUESDAY;
    public static final EnumC1394e WEDNESDAY;

    /* renamed from: a */
    public static final EnumC1394e[] f5490a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1394e[] f5491b;

    public static EnumC1394e valueOf(String str) {
        return (EnumC1394e) Enum.valueOf(EnumC1394e.class, str);
    }

    public static EnumC1394e[] values() {
        return (EnumC1394e[]) f5491b.clone();
    }

    static {
        EnumC1394e enumC1394e = new EnumC1394e("MONDAY", 0);
        MONDAY = enumC1394e;
        EnumC1394e enumC1394e2 = new EnumC1394e("TUESDAY", 1);
        TUESDAY = enumC1394e2;
        EnumC1394e enumC1394e3 = new EnumC1394e("WEDNESDAY", 2);
        WEDNESDAY = enumC1394e3;
        EnumC1394e enumC1394e4 = new EnumC1394e("THURSDAY", 3);
        THURSDAY = enumC1394e4;
        EnumC1394e enumC1394e5 = new EnumC1394e("FRIDAY", 4);
        FRIDAY = enumC1394e5;
        EnumC1394e enumC1394e6 = new EnumC1394e("SATURDAY", 5);
        SATURDAY = enumC1394e6;
        EnumC1394e enumC1394e7 = new EnumC1394e("SUNDAY", 6);
        SUNDAY = enumC1394e7;
        f5491b = new EnumC1394e[]{enumC1394e, enumC1394e2, enumC1394e3, enumC1394e4, enumC1394e5, enumC1394e6, enumC1394e7};
        f5490a = values();
    }

    /* renamed from: w */
    public static EnumC1394e m3006w(int i) {
        if (i < 1 || i > 7) {
            throw new C1354c("Invalid value for DayOfWeek: " + i);
        }
        return f5490a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.DAY_OF_WEEK : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.DAY_OF_WEEK) {
            return interfaceC1452r.mo3091I();
        }
        return super.mo2908l(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.DAY_OF_WEEK) {
            return getValue();
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.DAYS;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(getValue(), EnumC1435a.DAY_OF_WEEK);
    }
}
