package p077j$.time;

import androidx.media3.common.C0253x0;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2122f;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.l */
/* loaded from: classes2.dex */
public final class C1426l implements InterfaceC1447m, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: e */
    public static final C1426l f5574e;

    /* renamed from: f */
    public static final C1426l f5575f;

    /* renamed from: g */
    public static final C1426l f5576g;

    /* renamed from: h */
    public static final C1426l[] f5577h = new C1426l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a */
    public final byte f5578a;

    /* renamed from: b */
    public final byte f5579b;

    /* renamed from: c */
    public final byte f5580c;

    /* renamed from: d */
    public final int f5581d;

    static {
        int i = 0;
        while (true) {
            C1426l[] c1426lArr = f5577h;
            if (i < c1426lArr.length) {
                c1426lArr[i] = new C1426l(i, 0, 0, 0);
                i++;
            } else {
                C1426l c1426l = c1426lArr[0];
                f5576g = c1426l;
                C1426l c1426l2 = c1426lArr[12];
                f5574e = c1426l;
                f5575f = new C1426l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    /* renamed from: P */
    public static C1426l m3066P(int i, int i4, int i8, int i9) {
        EnumC1435a.HOUR_OF_DAY.m3094X(i);
        EnumC1435a.MINUTE_OF_HOUR.m3094X(i4);
        EnumC1435a.SECOND_OF_MINUTE.m3094X(i8);
        EnumC1435a.NANO_OF_SECOND.m3094X(i9);
        return m3064A(i, i4, i8, i9);
    }

    /* renamed from: V */
    public static C1426l m3067V(long j) {
        EnumC1435a.NANO_OF_DAY.m3094X(j);
        int i = (int) (j / 3600000000000L);
        long j8 = j - (i * 3600000000000L);
        int i4 = (int) (j8 / 60000000000L);
        long j9 = j8 - (i4 * 60000000000L);
        int i8 = (int) (j9 / 1000000000);
        return m3064A(i, i4, i8, (int) (j9 - (i8 * 1000000000)));
    }

    /* renamed from: F */
    public static C1426l m3065F(InterfaceC1448n interfaceC1448n) {
        Objects.requireNonNull(interfaceC1448n, "temporal");
        C1426l c1426l = (C1426l) interfaceC1448n.mo2875b(AbstractC1453s.f5626g);
        if (c1426l != null) {
            return c1426l;
        }
        throw new C1354c("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC1448n + " of type " + interfaceC1448n.getClass().getName());
    }

    /* renamed from: A */
    public static C1426l m3064A(int i, int i4, int i8, int i9) {
        if ((i4 | i8 | i9) == 0) {
            return f5577h[i];
        }
        return new C1426l(i, i4, i8, i9);
    }

    public C1426l(int i, int i4, int i8, int i9) {
        this.f5578a = (byte) i;
        this.f5579b = (byte) i4;
        this.f5580c = (byte) i8;
        this.f5581d = i9;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return ((EnumC1435a) interfaceC1452r).m3095Y();
        }
        return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return m3069I(interfaceC1452r);
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r == EnumC1435a.NANO_OF_DAY) {
                return m3075d0();
            }
            if (interfaceC1452r == EnumC1435a.MICRO_OF_DAY) {
                return m3075d0() / 1000;
            }
            return m3069I(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    /* renamed from: I */
    public final int m3069I(InterfaceC1452r interfaceC1452r) {
        switch (AbstractC1425k.f5572a[((EnumC1435a) interfaceC1452r).ordinal()]) {
            case 1:
                return this.f5581d;
            case 2:
                throw new C1455u("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f5581d / 1000;
            case 4:
                throw new C1455u("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f5581d / C0253x0.CUSTOM_ERROR_CODE_BASE;
            case 6:
                return (int) (m3075d0() / 1000000);
            case 7:
                return this.f5580c;
            case 8:
                return m3076e0();
            case 9:
                return this.f5579b;
            case 10:
                return (this.f5578a * 60) + this.f5579b;
            case 11:
                return this.f5578a % 12;
            case 12:
                int i = this.f5578a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f5578a;
            case 14:
                byte b7 = this.f5578a;
                if (b7 == 0) {
                    return 24;
                }
                return b7;
            case 15:
                return this.f5578a / 12;
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1426l) localDate.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final C1426l mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (C1426l) interfaceC1452r.mo3093V(this, j);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        enumC1435a.m3094X(j);
        switch (AbstractC1425k.f5572a[enumC1435a.ordinal()]) {
            case 1:
                return m3078g0((int) j);
            case 2:
                return m3067V(j);
            case 3:
                return m3078g0(((int) j) * 1000);
            case 4:
                return m3067V(j * 1000);
            case 5:
                return m3078g0(((int) j) * C0253x0.CUSTOM_ERROR_CODE_BASE);
            case 6:
                return m3067V(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f5580c != i) {
                    EnumC1435a.SECOND_OF_MINUTE.m3094X(i);
                    return m3064A(this.f5578a, this.f5579b, i, this.f5581d);
                }
                return this;
            case 8:
                return m3074b0(j - m3076e0());
            case 9:
                int i4 = (int) j;
                if (this.f5579b != i4) {
                    EnumC1435a.MINUTE_OF_HOUR.m3094X(i4);
                    return m3064A(this.f5578a, i4, this.f5580c, this.f5581d);
                }
                return this;
            case 10:
                return m3072Z(j - ((this.f5578a * 60) + this.f5579b));
            case 11:
                return m3071Y(j - (this.f5578a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m3071Y(j - (this.f5578a % 12));
            case 13:
                int i8 = (int) j;
                if (this.f5578a != i8) {
                    EnumC1435a.HOUR_OF_DAY.m3094X(i8);
                    return m3064A(i8, this.f5579b, this.f5580c, this.f5581d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i9 = (int) j;
                if (this.f5578a != i9) {
                    EnumC1435a.HOUR_OF_DAY.m3094X(i9);
                    return m3064A(i9, this.f5579b, this.f5580c, this.f5581d);
                }
                return this;
            case 15:
                return m3071Y((j - (this.f5578a / 12)) * 12);
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    /* renamed from: g0 */
    public final C1426l m3078g0(int i) {
        if (this.f5581d == i) {
            return this;
        }
        EnumC1435a.NANO_OF_SECOND.m3094X(i);
        return m3064A(this.f5578a, this.f5579b, this.f5580c, i);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C1426l mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            switch (AbstractC1425k.f5573b[((EnumC1436b) interfaceC1454t).ordinal()]) {
                case 1:
                    return m3073a0(j);
                case 2:
                    return m3073a0((j % 86400000000L) * 1000);
                case 3:
                    return m3073a0((j % 86400000) * 1000000);
                case 4:
                    return m3074b0(j);
                case 5:
                    return m3072Z(j);
                case 6:
                    return m3071Y(j);
                case 7:
                    return m3071Y((j % 2) * 12);
                default:
                    throw new C1455u("Unsupported unit: " + interfaceC1454t);
            }
        }
        return (C1426l) interfaceC1454t.mo3097w(this, j);
    }

    /* renamed from: Y */
    public final C1426l m3071Y(long j) {
        return j == 0 ? this : m3064A(((((int) (j % 24)) + this.f5578a) + 24) % 24, this.f5579b, this.f5580c, this.f5581d);
    }

    /* renamed from: Z */
    public final C1426l m3072Z(long j) {
        if (j != 0) {
            int i = (this.f5578a * 60) + this.f5579b;
            int i4 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i4) {
                return m3064A(i4 / 60, i4 % 60, this.f5580c, this.f5581d);
            }
        }
        return this;
    }

    /* renamed from: b0 */
    public final C1426l m3074b0(long j) {
        if (j != 0) {
            int i = (this.f5579b * 60) + (this.f5578a * 3600) + this.f5580c;
            int i4 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i4) {
                return m3064A(i4 / 3600, (i4 / 60) % 60, i4 % 60, this.f5581d);
            }
        }
        return this;
    }

    /* renamed from: a0 */
    public final C1426l m3073a0(long j) {
        if (j != 0) {
            long jM3075d0 = m3075d0();
            long j8 = (((j % 86400000000000L) + jM3075d0) + 86400000000000L) % 86400000000000L;
            if (jM3075d0 != j8) {
                return m3064A((int) (j8 / 3600000000000L), (int) ((j8 / 60000000000L) % 60), (int) ((j8 / 1000000000) % 60), (int) (j8 % 1000000000));
            }
        }
        return this;
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5621b || c1421g == AbstractC1453s.f5620a || c1421g == AbstractC1453s.f5624e || c1421g == AbstractC1453s.f5623d) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return this;
        }
        if (c1421g == AbstractC1453s.f5625f) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(m3075d0(), EnumC1435a.NANO_OF_DAY);
    }

    /* renamed from: e0 */
    public final int m3076e0() {
        return (this.f5579b * 60) + (this.f5578a * 3600) + this.f5580c;
    }

    /* renamed from: d0 */
    public final long m3075d0() {
        return (this.f5580c * 1000000000) + (this.f5579b * 60000000000L) + (this.f5578a * 3600000000000L) + this.f5581d;
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1426l c1426l) {
        int iCompare = Integer.compare(this.f5578a, c1426l.f5578a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f5579b, c1426l.f5579b)) == 0 && (iCompare = Integer.compare(this.f5580c, c1426l.f5580c)) == 0) ? Integer.compare(this.f5581d, c1426l.f5581d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1426l) {
            C1426l c1426l = (C1426l) obj;
            if (this.f5578a == c1426l.f5578a && this.f5579b == c1426l.f5579b && this.f5580c == c1426l.f5580c && this.f5581d == c1426l.f5581d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jM3075d0 = m3075d0();
        return (int) (jM3075d0 ^ (jM3075d0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b7 = this.f5578a;
        byte b8 = this.f5579b;
        byte b9 = this.f5580c;
        int i = this.f5581d;
        sb.append(b7 < 10 ? "0" : C2181z.FRAGMENT_ENCODE_SET);
        sb.append((int) b7);
        sb.append(b8 < 10 ? ":0" : ":");
        sb.append((int) b8);
        if (b9 > 0 || i > 0) {
            sb.append(b9 < 10 ? ":0" : ":");
            sb.append((int) b9);
            if (i > 0) {
                sb.append('.');
                if (i % C0253x0.CUSTOM_ERROR_CODE_BASE == 0) {
                    sb.append(Integer.toString((i / C0253x0.CUSTOM_ERROR_CODE_BASE) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + C0253x0.CUSTOM_ERROR_CODE_BASE).substring(1));
                } else {
                    sb.append(Integer.toString(i + C2122f.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: h0 */
    public final void m3079h0(DataOutput dataOutput) {
        if (this.f5581d == 0) {
            if (this.f5580c == 0) {
                if (this.f5579b == 0) {
                    dataOutput.writeByte(~this.f5578a);
                    return;
                } else {
                    dataOutput.writeByte(this.f5578a);
                    dataOutput.writeByte(~this.f5579b);
                    return;
                }
            }
            dataOutput.writeByte(this.f5578a);
            dataOutput.writeByte(this.f5579b);
            dataOutput.writeByte(~this.f5580c);
            return;
        }
        dataOutput.writeByte(this.f5578a);
        dataOutput.writeByte(this.f5579b);
        dataOutput.writeByte(this.f5580c);
        dataOutput.writeInt(this.f5581d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* renamed from: c0 */
    public static C1426l m3068c0(DataInput dataInput) throws IOException {
        int i;
        int i4;
        int i8 = dataInput.readByte();
        byte b7 = 0;
        if (i8 < 0) {
            i8 = ~i8;
            i4 = 0;
            i = 0;
        } else {
            byte b8 = dataInput.readByte();
            if (b8 < 0) {
                ?? r52 = ~b8;
                i = 0;
                b7 = r52;
                i4 = 0;
            } else {
                byte b9 = dataInput.readByte();
                if (b9 < 0) {
                    i4 = ~b9;
                    i = 0;
                    b7 = b8;
                } else {
                    i = dataInput.readInt();
                    b7 = b8;
                    i4 = b9;
                }
            }
        }
        return m3066P(i8, b7, i4, i);
    }
}
