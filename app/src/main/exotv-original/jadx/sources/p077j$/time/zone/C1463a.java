package p077j$.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import p077j$.time.C1351a0;

/* renamed from: j$.time.zone.a */
/* loaded from: classes2.dex */
public final class C1463a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a */
    public byte f5643a;

    /* renamed from: b */
    public Object f5644b;

    public C1463a() {
    }

    public C1463a(byte b7, Object obj) {
        this.f5643a = b7;
        this.f5644b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5643a;
        Object obj = this.f5644b;
        objectOutput.writeByte(b7);
        if (b7 != 1) {
            if (b7 == 2) {
                C1464b c1464b = (C1464b) obj;
                m3126c(c1464b.f5646a, objectOutput);
                m3127d(c1464b.f5648c, objectOutput);
                m3127d(c1464b.f5649d, objectOutput);
                return;
            }
            if (b7 == 3) {
                ((C1467e) obj).m3130b(objectOutput);
                return;
            } else {
                if (b7 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C1468f) obj).f5671g.getID());
                return;
            }
        }
        C1468f c1468f = (C1468f) obj;
        objectOutput.writeInt(c1468f.f5665a.length);
        for (long j : c1468f.f5665a) {
            m3126c(j, objectOutput);
        }
        for (C1351a0 c1351a0 : c1468f.f5666b) {
            m3127d(c1351a0, objectOutput);
        }
        objectOutput.writeInt(c1468f.f5667c.length);
        for (long j8 : c1468f.f5667c) {
            m3126c(j8, objectOutput);
        }
        for (C1351a0 c1351a02 : c1468f.f5669e) {
            m3127d(c1351a02, objectOutput);
        }
        objectOutput.writeByte(c1468f.f5670f.length);
        for (C1467e c1467e : c1468f.f5670f) {
            c1467e.m3130b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c1468f;
        byte b7 = objectInput.readByte();
        this.f5643a = b7;
        if (b7 == 1) {
            long[] jArr = C1468f.f5661i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i4 = 0; i4 < i; i4++) {
                jArr2[i4] = m3124a(objectInput);
            }
            int i8 = i + 1;
            C1351a0[] c1351a0Arr = new C1351a0[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                c1351a0Arr[i9] = m3125b(objectInput);
            }
            int i10 = objectInput.readInt();
            if (i10 != 0) {
                jArr = new long[i10];
            }
            long[] jArr3 = jArr;
            for (int i11 = 0; i11 < i10; i11++) {
                jArr3[i11] = m3124a(objectInput);
            }
            int i12 = i10 + 1;
            C1351a0[] c1351a0Arr2 = new C1351a0[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                c1351a0Arr2[i13] = m3125b(objectInput);
            }
            int i14 = objectInput.readByte();
            C1467e[] c1467eArr = i14 == 0 ? C1468f.f5662j : new C1467e[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                c1467eArr[i15] = C1467e.m3129a(objectInput);
            }
            c1468f = new C1468f(jArr2, c1351a0Arr, jArr3, c1351a0Arr2, c1467eArr);
        } else if (b7 == 2) {
            int i16 = C1464b.f5645e;
            long jM3124a = m3124a(objectInput);
            C1351a0 c1351a0M3125b = m3125b(objectInput);
            C1351a0 c1351a0M3125b2 = m3125b(objectInput);
            if (c1351a0M3125b.equals(c1351a0M3125b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c1468f = new C1464b(jM3124a, c1351a0M3125b, c1351a0M3125b2);
        } else if (b7 == 3) {
            c1468f = C1467e.m3129a(objectInput);
        } else {
            if (b7 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c1468f = new C1468f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f5644b = c1468f;
    }

    private Object readResolve() {
        return this.f5644b;
    }

    /* renamed from: b */
    public static C1351a0 m3125b(DataInput dataInput) throws IOException {
        byte b7 = dataInput.readByte();
        return b7 == Byte.MAX_VALUE ? C1351a0.m2915Y(dataInput.readInt()) : C1351a0.m2915Y(b7 * 900);
    }

    /* renamed from: c */
    public static void m3126c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    /* renamed from: a */
    public static long m3124a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* renamed from: d */
    public static void m3127d(C1351a0 c1351a0, DataOutput dataOutput) throws IOException {
        int i = c1351a0.f5419b;
        int i4 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i4);
        if (i4 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
