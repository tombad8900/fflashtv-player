package p077j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okhttp3.C2181z;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.zone.C1468f;

/* renamed from: j$.time.a0 */
/* loaded from: classes2.dex */
public final class C1351a0 extends AbstractC1462z implements InterfaceC1448n, InterfaceC1449o, Comparable {

    /* renamed from: d */
    public static final ConcurrentMap f5414d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    public static final ConcurrentMap f5415e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f */
    public static final C1351a0 f5416f = m2915Y(0);

    /* renamed from: g */
    public static final C1351a0 f5417g = m2915Y(-64800);

    /* renamed from: h */
    public static final C1351a0 f5418h = m2915Y(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b */
    public final int f5419b;

    /* renamed from: c */
    public final transient String f5420c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C1351a0) obj).f5419b - this.f5419b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1351a0 m2913V(String str) {
        int iM2916Z;
        int iM2916Z2;
        int iM2916Z3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        C1351a0 c1351a0 = (C1351a0) ((ConcurrentHashMap) f5415e).get(str);
        if (c1351a0 != null) {
            return c1351a0;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iM2916Z = m2916Z(str, 1, false);
                    iM2916Z2 = m2916Z(str, 3, false);
                } else if (length == 6) {
                    iM2916Z = m2916Z(str, 1, false);
                    iM2916Z2 = m2916Z(str, 4, true);
                } else if (length == 7) {
                    iM2916Z = m2916Z(str, 1, false);
                    iM2916Z2 = m2916Z(str, 3, false);
                    iM2916Z3 = m2916Z(str, 5, false);
                } else if (length == 9) {
                    iM2916Z = m2916Z(str, 1, false);
                    iM2916Z2 = m2916Z(str, 4, true);
                    iM2916Z3 = m2916Z(str, 7, true);
                } else {
                    throw new C1354c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iM2916Z3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new C1354c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt != '-') {
                return m2914X(-iM2916Z, -iM2916Z2, -iM2916Z3);
            }
            return m2914X(iM2916Z, iM2916Z2, iM2916Z3);
        }
        iM2916Z = m2916Z(str, 1, false);
        iM2916Z2 = 0;
        iM2916Z3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt != '-') {
        }
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: w */
    public final C1468f mo2921w() {
        return new C1468f(this);
    }

    /* renamed from: Z */
    public static int m2916Z(CharSequence charSequence, int i, boolean z7) {
        if (z7) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C1354c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C1354c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    /* renamed from: X */
    public static C1351a0 m2914X(int i, int i4, int i8) {
        if (i < -18 || i > 18) {
            throw new C1354c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i4 < 0 || i8 < 0) {
                throw new C1354c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i4 > 0 || i8 > 0) {
                throw new C1354c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i4 > 0 && i8 < 0) || (i4 < 0 && i8 > 0)) {
            throw new C1354c("Zone offset minutes and seconds must have the same sign");
        }
        if (i4 < -59 || i4 > 59) {
            throw new C1354c("Zone offset minutes not in valid range: value " + i4 + " is not in the range -59 to 59");
        }
        if (i8 < -59 || i8 > 59) {
            throw new C1354c("Zone offset seconds not in valid range: value " + i8 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i4 | i8) != 0) {
            throw new C1354c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m2915Y((i4 * 60) + (i * 3600) + i8);
    }

    /* renamed from: Y */
    public static C1351a0 m2915Y(int i) {
        if (i < -64800 || i > 64800) {
            throw new C1354c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = f5414d;
            C1351a0 c1351a0 = (C1351a0) concurrentMap.get(numValueOf);
            if (c1351a0 != null) {
                return c1351a0;
            }
            concurrentMap.putIfAbsent(numValueOf, new C1351a0(i));
            C1351a0 c1351a02 = (C1351a0) concurrentMap.get(numValueOf);
            f5415e.putIfAbsent(c1351a02.f5420c, c1351a02);
            return c1351a02;
        }
        return new C1351a0(i);
    }

    public C1351a0(int i) {
        String string;
        this.f5419b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i4 = iAbs / 3600;
            int i8 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i4 < 10 ? "0" : C2181z.FRAGMENT_ENCODE_SET);
            sb.append(i4);
            sb.append(i8 < 10 ? ":0" : ":");
            sb.append(i8);
            int i9 = iAbs % 60;
            if (i9 != 0) {
                sb.append(i9 < 10 ? ":0" : ":");
                sb.append(i9);
            }
            string = sb.toString();
        }
        this.f5420c = string;
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: q */
    public final String mo2920q() {
        return this.f5420c;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.OFFSET_SECONDS : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.OFFSET_SECONDS) {
            return this.f5419b;
        }
        if (interfaceC1452r == null) {
            return super.mo2908l(interfaceC1452r).m3105a(mo2882j(interfaceC1452r), interfaceC1452r);
        }
        throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.OFFSET_SECONDS) {
            return this.f5419b;
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        return (c1421g == AbstractC1453s.f5623d || c1421g == AbstractC1453s.f5624e) ? this : super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(this.f5419b, EnumC1435a.OFFSET_SECONDS);
    }

    @Override // p077j$.time.AbstractC1462z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1351a0) && this.f5419b == ((C1351a0) obj).f5419b;
    }

    @Override // p077j$.time.AbstractC1462z
    public final int hashCode() {
        return this.f5419b;
    }

    @Override // p077j$.time.AbstractC1462z
    public final String toString() {
        return this.f5420c;
    }

    private Object writeReplace() {
        return new C1457u((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: P */
    public final void mo2918P(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        m2919b0(dataOutput);
    }

    /* renamed from: b0 */
    public final void m2919b0(DataOutput dataOutput) throws IOException {
        int i = this.f5419b;
        int i4 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i4);
        if (i4 == 127) {
            dataOutput.writeInt(i);
        }
    }

    /* renamed from: a0 */
    public static C1351a0 m2917a0(DataInput dataInput) throws IOException {
        byte b7 = dataInput.readByte();
        return b7 == Byte.MAX_VALUE ? m2915Y(dataInput.readInt()) : m2915Y(b7 * 900);
    }
}
