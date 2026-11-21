package p077j$.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.C1351a0;
import p077j$.time.C1426l;
import p077j$.time.EnumC1394e;
import p077j$.time.EnumC1428n;
import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.zone.e */
/* loaded from: classes2.dex */
public final class C1467e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a */
    public final EnumC1428n f5652a;

    /* renamed from: b */
    public final byte f5653b;

    /* renamed from: c */
    public final EnumC1394e f5654c;

    /* renamed from: d */
    public final C1426l f5655d;

    /* renamed from: e */
    public final boolean f5656e;

    /* renamed from: f */
    public final EnumC1466d f5657f;

    /* renamed from: g */
    public final C1351a0 f5658g;

    /* renamed from: h */
    public final C1351a0 f5659h;

    /* renamed from: i */
    public final C1351a0 f5660i;

    public C1467e(EnumC1428n enumC1428n, int i, EnumC1394e enumC1394e, C1426l c1426l, boolean z7, EnumC1466d enumC1466d, C1351a0 c1351a0, C1351a0 c1351a02, C1351a0 c1351a03) {
        this.f5652a = enumC1428n;
        this.f5653b = (byte) i;
        this.f5654c = enumC1394e;
        this.f5655d = c1426l;
        this.f5656e = z7;
        this.f5657f = enumC1466d;
        this.f5658g = c1351a0;
        this.f5659h = c1351a02;
        this.f5660i = c1351a03;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1463a((byte) 3, this);
    }

    /* renamed from: b */
    public final void m3130b(DataOutput dataOutput) {
        int iM3076e0 = this.f5656e ? 86400 : this.f5655d.m3076e0();
        int i = this.f5658g.f5419b;
        int i4 = this.f5659h.f5419b - i;
        int i8 = this.f5660i.f5419b - i;
        byte b7 = iM3076e0 % 3600 == 0 ? this.f5656e ? (byte) 24 : this.f5655d.f5578a : (byte) 31;
        int i9 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i10 = (i4 == 0 || i4 == 1800 || i4 == 3600) ? i4 / 1800 : 3;
        int i11 = (i8 == 0 || i8 == 1800 || i8 == 3600) ? i8 / 1800 : 3;
        EnumC1394e enumC1394e = this.f5654c;
        dataOutput.writeInt((this.f5652a.getValue() << 28) + ((this.f5653b + 32) << 22) + ((enumC1394e == null ? 0 : enumC1394e.getValue()) << 19) + (b7 << 14) + (this.f5657f.ordinal() << 12) + (i9 << 4) + (i10 << 2) + i11);
        if (b7 == 31) {
            dataOutput.writeInt(iM3076e0);
        }
        if (i9 == 255) {
            dataOutput.writeInt(i);
        }
        if (i10 == 3) {
            dataOutput.writeInt(this.f5659h.f5419b);
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.f5660i.f5419b);
        }
    }

    /* renamed from: a */
    public static C1467e m3129a(DataInput dataInput) {
        EnumC1466d enumC1466d;
        C1426l c1426lM3064A;
        int i;
        int i4;
        int i8 = dataInput.readInt();
        EnumC1428n enumC1428nM3081I = EnumC1428n.m3081I(i8 >>> 28);
        int i9 = ((264241152 & i8) >>> 22) - 32;
        int i10 = (3670016 & i8) >>> 19;
        EnumC1394e enumC1394eM3006w = i10 == 0 ? null : EnumC1394e.m3006w(i10);
        int i11 = (507904 & i8) >>> 14;
        EnumC1466d enumC1466d2 = EnumC1466d.values()[(i8 & 12288) >>> 12];
        int i12 = (i8 & 4080) >>> 4;
        int i13 = (i8 & 12) >>> 2;
        int i14 = i8 & 3;
        if (i11 == 31) {
            long j = dataInput.readInt();
            C1426l c1426l = C1426l.f5574e;
            EnumC1435a.SECOND_OF_DAY.m3094X(j);
            int i15 = (int) (j / 3600);
            long j8 = j - (i15 * 3600);
            enumC1466d = enumC1466d2;
            c1426lM3064A = C1426l.m3064A(i15, (int) (j8 / 60), (int) (j8 - (r14 * 60)), 0);
        } else {
            enumC1466d = enumC1466d2;
            int i16 = i11 % 24;
            C1426l c1426l2 = C1426l.f5574e;
            EnumC1435a.HOUR_OF_DAY.m3094X(i16);
            c1426lM3064A = C1426l.f5577h[i16];
        }
        C1351a0 c1351a0M2915Y = C1351a0.m2915Y(i12 == 255 ? dataInput.readInt() : (i12 - 128) * 900);
        if (i13 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i13 * 1800) + c1351a0M2915Y.f5419b;
        }
        C1351a0 c1351a0M2915Y2 = C1351a0.m2915Y(i);
        if (i14 == 3) {
            i4 = dataInput.readInt();
        } else {
            i4 = (i14 * 1800) + c1351a0M2915Y.f5419b;
        }
        C1351a0 c1351a0M2915Y3 = C1351a0.m2915Y(i4);
        boolean z7 = i11 == 24;
        Objects.requireNonNull(enumC1428nM3081I, "month");
        Objects.requireNonNull(c1426lM3064A, "time");
        EnumC1466d enumC1466d3 = enumC1466d;
        Objects.requireNonNull(enumC1466d3, "timeDefnition");
        if (i9 < -28 || i9 > 31 || i9 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z7 && !c1426lM3064A.equals(C1426l.f5576g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c1426lM3064A.f5581d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C1467e(enumC1428nM3081I, i9, enumC1394eM3006w, c1426lM3064A, z7, enumC1466d3, c1351a0M2915Y, c1351a0M2915Y2, c1351a0M2915Y3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1467e) {
            C1467e c1467e = (C1467e) obj;
            if (this.f5652a == c1467e.f5652a && this.f5653b == c1467e.f5653b && this.f5654c == c1467e.f5654c && this.f5657f == c1467e.f5657f && this.f5655d.equals(c1467e.f5655d) && this.f5656e == c1467e.f5656e && this.f5658g.equals(c1467e.f5658g) && this.f5659h.equals(c1467e.f5659h) && this.f5660i.equals(c1467e.f5660i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM3076e0 = ((this.f5655d.m3076e0() + (this.f5656e ? 1 : 0)) << 15) + (this.f5652a.ordinal() << 11) + ((this.f5653b + 32) << 5);
        EnumC1394e enumC1394e = this.f5654c;
        return ((this.f5658g.f5419b ^ (this.f5657f.ordinal() + (iM3076e0 + ((enumC1394e == null ? 7 : enumC1394e.ordinal()) << 2)))) ^ this.f5659h.f5419b) ^ this.f5660i.f5419b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.f5660i.f5419b - this.f5659h.f5419b > 0 ? "Gap " : "Overlap ");
        sb.append(this.f5659h);
        sb.append(" to ");
        sb.append(this.f5660i);
        sb.append(", ");
        EnumC1394e enumC1394e = this.f5654c;
        if (enumC1394e != null) {
            byte b7 = this.f5653b;
            if (b7 == -1) {
                sb.append(enumC1394e.name());
                sb.append(" on or before last day of ");
                sb.append(this.f5652a.name());
            } else if (b7 < 0) {
                sb.append(enumC1394e.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f5653b) - 1);
                sb.append(" of ");
                sb.append(this.f5652a.name());
            } else {
                sb.append(enumC1394e.name());
                sb.append(" on or after ");
                sb.append(this.f5652a.name());
                sb.append(' ');
                sb.append((int) this.f5653b);
            }
        } else {
            sb.append(this.f5652a.name());
            sb.append(' ');
            sb.append((int) this.f5653b);
        }
        sb.append(" at ");
        sb.append(this.f5656e ? "24:00" : this.f5655d.toString());
        sb.append(" ");
        sb.append(this.f5657f);
        sb.append(", standard offset ");
        sb.append(this.f5658g);
        sb.append(']');
        return sb.toString();
    }
}
