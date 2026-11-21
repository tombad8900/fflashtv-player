package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p077j$.time.AbstractC1352b;
import p077j$.time.C1354c;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.g */
/* loaded from: classes2.dex */
public final class C1368g implements InterfaceC1451q, Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f5438e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a */
    public final InterfaceC1377l f5439a;

    /* renamed from: b */
    public final int f5440b;

    /* renamed from: c */
    public final int f5441c;

    /* renamed from: d */
    public final int f5442d;

    static {
        AbstractC1352b.m2922a(new Object[]{EnumC1436b.YEARS, EnumC1436b.MONTHS, EnumC1436b.DAYS});
    }

    public C1368g(InterfaceC1377l interfaceC1377l, int i, int i4, int i8) {
        this.f5439a = interfaceC1377l;
        this.f5440b = i;
        this.f5441c = i4;
        this.f5442d = i8;
    }

    public final String toString() {
        if (this.f5440b == 0 && this.f5441c == 0 && this.f5442d == 0) {
            return this.f5439a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5439a.toString());
        sb.append(" P");
        int i = this.f5440b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i4 = this.f5441c;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        int i8 = this.f5442d;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // p077j$.time.temporal.InterfaceC1451q
    /* renamed from: w */
    public final InterfaceC1447m mo2869w(ChronoLocalDate chronoLocalDate) {
        InterfaceC1447m interfaceC1447mMo2880h;
        InterfaceC1377l interfaceC1377l = (InterfaceC1377l) chronoLocalDate.mo2875b(AbstractC1453s.f5621b);
        if (interfaceC1377l == null || this.f5439a.equals(interfaceC1377l)) {
            if (this.f5441c != 0) {
                C1456v c1456vMo2942y = this.f5439a.mo2942y(EnumC1435a.MONTH_OF_YEAR);
                long j = (c1456vMo2942y.f5627a == c1456vMo2942y.f5628b && c1456vMo2942y.f5629c == c1456vMo2942y.f5630d && c1456vMo2942y.m3108d()) ? (c1456vMo2942y.f5630d - c1456vMo2942y.f5627a) + 1 : -1L;
                if (j > 0) {
                    interfaceC1447mMo2880h = chronoLocalDate.mo2880h((this.f5440b * j) + this.f5441c, (InterfaceC1454t) EnumC1436b.MONTHS);
                } else {
                    int i = this.f5440b;
                    InterfaceC1447m interfaceC1447mMo2880h2 = chronoLocalDate;
                    if (i != 0) {
                        interfaceC1447mMo2880h2 = chronoLocalDate.mo2880h(i, (InterfaceC1454t) EnumC1436b.YEARS);
                    }
                    interfaceC1447mMo2880h = interfaceC1447mMo2880h2.mo2880h(this.f5441c, EnumC1436b.MONTHS);
                }
            } else {
                int i4 = this.f5440b;
                interfaceC1447mMo2880h = chronoLocalDate;
                if (i4 != 0) {
                    interfaceC1447mMo2880h = chronoLocalDate.mo2880h(i4, (InterfaceC1454t) EnumC1436b.YEARS);
                }
            }
            int i8 = this.f5442d;
            return i8 != 0 ? interfaceC1447mMo2880h.mo2880h(i8, EnumC1436b.DAYS) : interfaceC1447mMo2880h;
        }
        throw new C1354c("Chronology mismatch, expected: " + this.f5439a.mo2939q() + ", actual: " + interfaceC1377l.mo2939q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1368g) {
            C1368g c1368g = (C1368g) obj;
            if (this.f5440b == c1368g.f5440b && this.f5441c == c1368g.f5441c && this.f5442d == c1368g.f5442d && this.f5439a.equals(c1368g.f5439a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f5442d, 16) + (Integer.rotateLeft(this.f5441c, 8) + this.f5440b)) ^ this.f5439a.hashCode();
    }

    public Object writeReplace() {
        return new C1365e0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
