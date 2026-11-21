package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.t */
/* loaded from: classes2.dex */
public final class C1434t implements InterfaceC1451q, Serializable {

    /* renamed from: d */
    public static final C1434t f5596d = new C1434t(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a */
    public final int f5597a;

    /* renamed from: b */
    public final int f5598b;

    /* renamed from: c */
    public final int f5599c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC1352b.m2922a(new Object[]{EnumC1436b.YEARS, EnumC1436b.MONTHS, EnumC1436b.DAYS});
    }

    /* renamed from: a */
    public static C1434t m3089a(int i, int i4, int i8) {
        if ((i | i4 | i8) == 0) {
            return f5596d;
        }
        return new C1434t(i, i4, i8);
    }

    public C1434t(int i, int i4, int i8) {
        this.f5597a = i;
        this.f5598b = i4;
        this.f5599c = i8;
    }

    @Override // p077j$.time.temporal.InterfaceC1451q
    /* renamed from: w */
    public final InterfaceC1447m mo2869w(ChronoLocalDate chronoLocalDate) {
        InterfaceC1447m interfaceC1447mMo2880h;
        InterfaceC1377l interfaceC1377l = (InterfaceC1377l) chronoLocalDate.mo2875b(AbstractC1453s.f5621b);
        if (interfaceC1377l == null || C1384s.f5471c.equals(interfaceC1377l)) {
            int i = this.f5598b;
            if (i != 0) {
                long j = (this.f5597a * 12) + i;
                interfaceC1447mMo2880h = chronoLocalDate;
                if (j != 0) {
                    interfaceC1447mMo2880h = chronoLocalDate.mo2880h(j, (InterfaceC1454t) EnumC1436b.MONTHS);
                }
            } else {
                int i4 = this.f5597a;
                interfaceC1447mMo2880h = chronoLocalDate;
                if (i4 != 0) {
                    interfaceC1447mMo2880h = chronoLocalDate.mo2880h(i4, (InterfaceC1454t) EnumC1436b.YEARS);
                }
            }
            int i8 = this.f5599c;
            return i8 != 0 ? interfaceC1447mMo2880h.mo2880h(i8, EnumC1436b.DAYS) : interfaceC1447mMo2880h;
        }
        throw new C1354c("Chronology mismatch, expected: ISO, actual: " + interfaceC1377l.mo2939q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1434t) {
            C1434t c1434t = (C1434t) obj;
            if (this.f5597a == c1434t.f5597a && this.f5598b == c1434t.f5598b && this.f5599c == c1434t.f5599c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f5599c, 16) + Integer.rotateLeft(this.f5598b, 8) + this.f5597a;
    }

    public final String toString() {
        if (this == f5596d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f5597a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i4 = this.f5598b;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        int i8 = this.f5599c;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
