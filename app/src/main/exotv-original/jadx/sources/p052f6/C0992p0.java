package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.p0 */
/* loaded from: classes.dex */
public final class C0992p0 {

    /* renamed from: a */
    public Object[] f4233a;

    /* renamed from: b */
    public int f4234b = 0;

    /* renamed from: c */
    public C0989o0 f4235c;

    public C0992p0(int i) {
        this.f4233a = new Object[i * 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0996q1 m2179a() {
        int i;
        boolean z7;
        char c8;
        Object obj;
        char c9;
        short[] sArr;
        int i4;
        boolean z8;
        ?? r17;
        boolean z9;
        C0996q1 c0996q1;
        boolean z10;
        C0989o0 c0989o0 = this.f4235c;
        if (c0989o0 != null) {
            throw c0989o0.m2178a();
        }
        int i8 = this.f4234b;
        Object[] objArrCopyOf = this.f4233a;
        if (i8 == 0) {
            c0996q1 = C0996q1.f4246p;
        } else {
            int i9 = 1;
            Object c0989o02 = null;
            boolean z11 = false;
            if (i8 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                c0996q1 = new C0996q1(null, objArrCopyOf, 1);
            } else {
                AbstractC0714c.m1530p(i8, objArrCopyOf.length >> 1);
                int iM2208h = AbstractC1013w0.m2208h(i8);
                char c10 = 2;
                if (i8 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    i = 1;
                    z10 = false;
                } else {
                    int i10 = iM2208h - 1;
                    if (iM2208h <= 128) {
                        byte[] bArr = new byte[iM2208h];
                        Arrays.fill(bArr, (byte) -1);
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i8) {
                            int i13 = i11 * 2;
                            int i14 = i12 * 2;
                            Object obj2 = objArrCopyOf[i13];
                            Objects.requireNonNull(obj2);
                            Object obj3 = objArrCopyOf[i13 ^ i9];
                            Objects.requireNonNull(obj3);
                            int iM2202q = AbstractC1006u.m2202q(obj2.hashCode());
                            while (true) {
                                int i15 = iM2202q & i10;
                                i4 = i9;
                                z8 = z11;
                                int i16 = bArr[i15] & 255;
                                if (i16 == 255) {
                                    bArr[i15] = (byte) i14;
                                    if (i12 < i11) {
                                        objArrCopyOf[i14] = obj2;
                                        objArrCopyOf[i14 ^ 1] = obj3;
                                    }
                                    i12++;
                                } else {
                                    if (obj2.equals(objArrCopyOf[i16])) {
                                        int i17 = i16 ^ 1;
                                        Object obj4 = objArrCopyOf[i17];
                                        Objects.requireNonNull(obj4);
                                        c0989o02 = new C0989o0(obj2, obj3, obj4);
                                        objArrCopyOf[i17] = obj3;
                                        break;
                                    }
                                    iM2202q = i15 + 1;
                                    i9 = i4;
                                    z11 = z8;
                                }
                            }
                            i11++;
                            i9 = i4;
                            z11 = z8;
                        }
                        i = i9;
                        z7 = z11;
                        if (i12 == i8) {
                            c0989o02 = bArr;
                            z10 = z7;
                        } else {
                            sArr = new Object[3];
                            sArr[z7 ? 1 : 0] = bArr;
                            sArr[i] = Integer.valueOf(i12);
                            sArr[2] = c0989o02;
                            c0989o02 = sArr;
                            z10 = z7;
                        }
                    } else {
                        i = 1;
                        z7 = false;
                        if (iM2208h <= 32768) {
                            sArr = new short[iM2208h];
                            Arrays.fill(sArr, (short) -1);
                            int i18 = 0;
                            for (int i19 = 0; i19 < i8; i19++) {
                                int i20 = i19 * 2;
                                int i21 = i18 * 2;
                                Object obj5 = objArrCopyOf[i20];
                                Objects.requireNonNull(obj5);
                                Object obj6 = objArrCopyOf[i20 ^ 1];
                                Objects.requireNonNull(obj6);
                                int iM2202q2 = AbstractC1006u.m2202q(obj5.hashCode());
                                while (true) {
                                    int i22 = iM2202q2 & i10;
                                    int i23 = sArr[i22] & 65535;
                                    if (i23 == 65535) {
                                        sArr[i22] = (short) i21;
                                        if (i18 < i19) {
                                            objArrCopyOf[i21] = obj5;
                                            objArrCopyOf[i21 ^ 1] = obj6;
                                        }
                                        i18++;
                                    } else {
                                        if (obj5.equals(objArrCopyOf[i23])) {
                                            int i24 = i23 ^ 1;
                                            Object obj7 = objArrCopyOf[i24];
                                            Objects.requireNonNull(obj7);
                                            c0989o02 = new C0989o0(obj5, obj6, obj7);
                                            objArrCopyOf[i24] = obj6;
                                            break;
                                        }
                                        iM2202q2 = i22 + 1;
                                    }
                                }
                            }
                            if (i18 == i8) {
                                c0989o02 = sArr;
                                z10 = z7;
                            } else {
                                c0989o02 = new Object[]{sArr, Integer.valueOf(i18), c0989o02};
                                z10 = z7;
                            }
                        } else {
                            int[] iArr = new int[iM2208h];
                            Arrays.fill(iArr, -1);
                            int i25 = 0;
                            int i26 = 0;
                            while (i25 < i8) {
                                int i27 = i25 * 2;
                                int i28 = i26 * 2;
                                Object obj8 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj8);
                                Object obj9 = objArrCopyOf[i27 ^ 1];
                                Objects.requireNonNull(obj9);
                                int iM2202q3 = AbstractC1006u.m2202q(obj8.hashCode());
                                while (true) {
                                    int i29 = iM2202q3 & i10;
                                    int i30 = iArr[i29];
                                    if (i30 == -1) {
                                        iArr[i29] = i28;
                                        if (i26 < i25) {
                                            objArrCopyOf[i28] = obj8;
                                            objArrCopyOf[i28 ^ 1] = obj9;
                                        }
                                        i26++;
                                        c9 = c10;
                                    } else {
                                        c9 = c10;
                                        if (obj8.equals(objArrCopyOf[i30])) {
                                            int i31 = i30 ^ 1;
                                            Object obj10 = objArrCopyOf[i31];
                                            Objects.requireNonNull(obj10);
                                            c0989o02 = new C0989o0(obj8, obj9, obj10);
                                            objArrCopyOf[i31] = obj9;
                                            break;
                                        }
                                        iM2202q3 = i29 + 1;
                                        c10 = c9;
                                    }
                                }
                                i25++;
                                c10 = c9;
                            }
                            c8 = c10;
                            if (i26 == i8) {
                                obj = iArr;
                                r17 = z7;
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = iArr;
                                objArr[1] = Integer.valueOf(i26);
                                objArr[c8] = c0989o02;
                                obj = objArr;
                                r17 = z7;
                            }
                            z9 = obj instanceof Object[];
                            Object obj11 = obj;
                            if (z9) {
                                Object[] objArr2 = (Object[]) obj;
                                this.f4235c = (C0989o0) objArr2[c8];
                                Object obj12 = objArr2[r17];
                                int iIntValue = ((Integer) objArr2[i]).intValue();
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                                obj11 = obj12;
                                i8 = iIntValue;
                            }
                            c0996q1 = new C0996q1(obj11, objArrCopyOf, i8);
                        }
                    }
                }
                c8 = 2;
                obj = c0989o02;
                r17 = z10;
                z9 = obj instanceof Object[];
                Object obj112 = obj;
                if (z9) {
                }
                c0996q1 = new C0996q1(obj112, objArrCopyOf, i8);
            }
        }
        C0989o0 c0989o03 = this.f4235c;
        if (c0989o03 == null) {
            return c0996q1;
        }
        throw c0989o03.m2178a();
    }

    /* renamed from: b */
    public final void m2180b(Object obj, Object obj2) {
        int i = (this.f4234b + 1) * 2;
        Object[] objArr = this.f4233a;
        if (i > objArr.length) {
            this.f4233a = Arrays.copyOf(objArr, AbstractC0965g0.m2140e(objArr.length, i));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = this.f4233a;
        int i4 = this.f4234b;
        int i8 = i4 * 2;
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        this.f4234b = i4 + 1;
    }
}
