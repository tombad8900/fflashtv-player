package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1454t;

/* loaded from: classes2.dex */
public final class Duration implements InterfaceC1451q, Comparable<Duration>, Serializable {

    /* renamed from: c */
    public static final Duration f5402c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a */
    public final long f5403a;

    /* renamed from: b */
    public final int f5404b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f5403a, duration2.f5403a);
        return iCompare != 0 ? iCompare : this.f5404b - duration2.f5404b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    /* renamed from: F */
    public static Duration m2868F(long j) {
        long j8 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j8--;
        }
        return m2867A(j8, i);
    }

    /* renamed from: A */
    public static Duration m2867A(long j, int i) {
        if ((i | j) == 0) {
            return f5402c;
        }
        return new Duration(j, i);
    }

    public Duration(long j, int i) {
        this.f5403a = j;
        this.f5404b = i;
    }

    @Override // p077j$.time.temporal.InterfaceC1451q
    /* renamed from: w */
    public final InterfaceC1447m mo2869w(ChronoLocalDate chronoLocalDate) {
        long j = this.f5403a;
        InterfaceC1447m interfaceC1447mMo2880h = chronoLocalDate;
        if (j != 0) {
            interfaceC1447mMo2880h = chronoLocalDate.mo2880h(j, (InterfaceC1454t) EnumC1436b.SECONDS);
        }
        int i = this.f5404b;
        return i != 0 ? interfaceC1447mMo2880h.mo2880h(i, EnumC1436b.NANOS) : interfaceC1447mMo2880h;
    }

    public long toMillis() {
        long j = this.f5403a;
        long j8 = this.f5404b;
        if (j < 0) {
            j++;
            j8 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000), j8 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f5403a == duration.f5403a && this.f5404b == duration.f5404b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5403a;
        return (this.f5404b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f5402c) {
            return "PT0S";
        }
        long j = this.f5403a;
        if (j < 0 && this.f5404b > 0) {
            j++;
        }
        long j8 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i4 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j8 != 0) {
            sb.append(j8);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i4 == 0 && this.f5404b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f5403a < 0 && this.f5404b > 0 && i4 == 0) {
            sb.append("-0");
        } else {
            sb.append(i4);
        }
        if (this.f5404b > 0) {
            int length = sb.length();
            if (this.f5403a < 0) {
                sb.append(2000000000 - this.f5404b);
            } else {
                sb.append(this.f5404b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
