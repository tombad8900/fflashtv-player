package p207y0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C2786c {

    /* renamed from: a */
    public final int f10352a;

    /* renamed from: b */
    public final int f10353b;

    /* renamed from: c */
    public final long f10354c;

    /* renamed from: d */
    public final byte[] f10355d;

    public C2786c(byte[] bArr, int i, int i4) {
        this(-1L, bArr, i, i4);
    }

    /* renamed from: a */
    public static C2786c m4868a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2790g.f10364C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C2786c(byteBufferWrap.array(), 4, 1);
    }

    /* renamed from: b */
    public static C2786c m4869b(C2788e c2788e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2790g.f10364C[5]]);
        byteBufferWrap.order(byteOrder);
        C2788e c2788e2 = new C2788e[]{c2788e}[0];
        byteBufferWrap.putInt((int) c2788e2.f10360a);
        byteBufferWrap.putInt((int) c2788e2.f10361b);
        return new C2786c(byteBufferWrap.array(), 5, 1);
    }

    /* renamed from: c */
    public static C2786c m4870c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2790g.f10364C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C2786c(byteBufferWrap.array(), 3, 1);
    }

    /* renamed from: d */
    public final double m4871d(ByteOrder byteOrder) throws Throwable {
        Object objM4874g = m4874g(byteOrder);
        if (objM4874g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM4874g instanceof String) {
            return Double.parseDouble((String) objM4874g);
        }
        if (objM4874g instanceof long[]) {
            if (((long[]) objM4874g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4874g instanceof int[]) {
            if (((int[]) objM4874g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4874g instanceof double[]) {
            double[] dArr = (double[]) objM4874g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4874g instanceof C2788e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C2788e[] c2788eArr = (C2788e[]) objM4874g;
        if (c2788eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C2788e c2788e = c2788eArr[0];
        return c2788e.f10360a / c2788e.f10361b;
    }

    /* renamed from: e */
    public final int m4872e(ByteOrder byteOrder) throws Throwable {
        Object objM4874g = m4874g(byteOrder);
        if (objM4874g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM4874g instanceof String) {
            return Integer.parseInt((String) objM4874g);
        }
        if (objM4874g instanceof long[]) {
            long[] jArr = (long[]) objM4874g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4874g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM4874g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* renamed from: f */
    public final String m4873f(ByteOrder byteOrder) throws Throwable {
        Object objM4874g = m4874g(byteOrder);
        if (objM4874g == null) {
            return null;
        }
        if (objM4874g instanceof String) {
            return (String) objM4874g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM4874g instanceof long[]) {
            long[] jArr = (long[]) objM4874g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4874g instanceof int[]) {
            int[] iArr = (int[]) objM4874g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4874g instanceof double[]) {
            double[] dArr = (double[]) objM4874g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM4874g instanceof C2788e[])) {
            return null;
        }
        C2788e[] c2788eArr = (C2788e[]) objM4874g;
        while (i < c2788eArr.length) {
            sb.append(c2788eArr[i].f10360a);
            sb.append('/');
            sb.append(c2788eArr[i].f10361b);
            i++;
            if (i != c2788eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [y0.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [y0.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m4874g(ByteOrder byteOrder) throws Throwable {
        C2785b c2785b;
        InputStream inputStream;
        ?? str;
        byte b7;
        byte[] bArr = this.f10355d;
        InputStream inputStream2 = null;
        try {
            try {
                c2785b = new C2785b(bArr);
                try {
                    c2785b.f10349l = byteOrder;
                    int i = this.f10352a;
                    int length = 0;
                    int i4 = this.f10353b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b7 = bArr[0]) >= 0 && b7 <= 1) {
                                String str2 = new String(new char[]{(char) (b7 + 48)});
                                try {
                                    c2785b.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C2790g.f10373L);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i4 >= C2790g.f10365D.length) {
                                int i8 = 0;
                                while (true) {
                                    byte[] bArr2 = C2790g.f10365D;
                                    if (i8 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i8] == bArr2[i8]) {
                                        i8++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i4) {
                                byte b8 = bArr[length];
                                if (b8 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b8 >= 32) {
                                        sb.append((char) b8);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i4];
                            while (length < i4) {
                                str[length] = c2785b.readUnsignedShort();
                                length++;
                            }
                        case 4:
                            str = new long[i4];
                            while (length < i4) {
                                str[length] = c2785b.readInt() & 4294967295L;
                                length++;
                            }
                        case 5:
                            str = new C2788e[i4];
                            while (length < i4) {
                                str[length] = new C2788e(c2785b.readInt() & 4294967295L, c2785b.readInt() & 4294967295L);
                                length++;
                            }
                        case 8:
                            str = new int[i4];
                            while (length < i4) {
                                str[length] = c2785b.readShort();
                                length++;
                            }
                        case 9:
                            str = new int[i4];
                            while (length < i4) {
                                str[length] = c2785b.readInt();
                                length++;
                            }
                        case 10:
                            str = new C2788e[i4];
                            while (length < i4) {
                                str[length] = new C2788e(c2785b.readInt(), c2785b.readInt());
                                length++;
                            }
                        case 11:
                            str = new double[i4];
                            while (length < i4) {
                                str[length] = c2785b.readFloat();
                                length++;
                            }
                        case 12:
                            str = new double[i4];
                            while (length < i4) {
                                str[length] = c2785b.readDouble();
                                length++;
                            }
                        default:
                            try {
                                c2785b.close();
                                return null;
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                return null;
                            }
                    }
                    try {
                        c2785b.close();
                        return str;
                    } catch (IOException e9) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        return str;
                    }
                } catch (IOException e10) {
                    e = e10;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c2785b != null) {
                        try {
                            c2785b.close();
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e12) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            c2785b = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + C2790g.f10363B[this.f10352a] + ", data length:" + this.f10355d.length + ")";
    }

    public C2786c(long j, byte[] bArr, int i, int i4) {
        this.f10352a = i;
        this.f10353b = i4;
        this.f10354c = j;
        this.f10355d = bArr;
    }
}
