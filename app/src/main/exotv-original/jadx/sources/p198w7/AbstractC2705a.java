package p198w7;

import java.io.EOFException;
import p069h7.AbstractC1199a;
import p189v7.C2566f0;
import p189v7.C2573j;
import p189v7.C2595z;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.a */
/* loaded from: classes.dex */
public abstract class AbstractC2705a {

    /* renamed from: a */
    public static final byte[] f9822a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1199a.f5077a);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        f9822a = bytes;
    }

    /* renamed from: a */
    public static final String m4759a(C2573j c2573j, long j) throws EOFException {
        if (j > 0) {
            long j8 = j - 1;
            if (c2573j.m4666g(j8) == 13) {
                String strM4650F = c2573j.m4650F(j8, AbstractC1199a.f5077a);
                c2573j.skip(2L);
                return strM4650F;
            }
        }
        String strM4650F2 = c2573j.m4650F(j, AbstractC1199a.f5077a);
        c2573j.skip(1L);
        return strM4650F2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m4760b(C2573j c2573j, C2595z c2595z, boolean z7) {
        int i;
        int i4;
        int i8;
        C2566f0 c2566f0;
        int i9;
        AbstractC2980h.m5136e("options", c2595z);
        C2566f0 c2566f02 = c2573j.f9313j;
        if (c2566f02 != null) {
            byte[] bArr = c2566f02.f9292a;
            int i10 = c2566f02.f9293b;
            int i11 = c2566f02.f9294c;
            int[] iArr = c2595z.f9347k;
            C2566f0 c2566f03 = c2566f02;
            int i12 = -1;
            int i13 = 0;
            loop0: while (true) {
                int i14 = i13 + 1;
                int i15 = iArr[i13];
                int i16 = i13 + 2;
                int i17 = iArr[i14];
                if (i17 != -1) {
                    i12 = i17;
                }
                if (c2566f03 == null) {
                    break;
                }
                if (i15 >= 0) {
                    int i18 = i10 + 1;
                    int i19 = bArr[i10] & 255;
                    int i20 = i16 + i15;
                    while (i16 != i20) {
                        if (i19 == iArr[i16]) {
                            i = iArr[i16 + i15];
                            if (i18 == i11) {
                                c2566f03 = c2566f03.f9297f;
                                AbstractC2980h.m5133b(c2566f03);
                                int i21 = c2566f03.f9293b;
                                byte[] bArr2 = c2566f03.f9292a;
                                i4 = c2566f03.f9294c;
                                if (c2566f03 == c2566f02) {
                                    i8 = i21;
                                    bArr = bArr2;
                                    c2566f03 = null;
                                } else {
                                    i8 = i21;
                                    bArr = bArr2;
                                }
                            } else {
                                i4 = i11;
                                i8 = i18;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            int i22 = i4;
                            i13 = -i;
                            i10 = i8;
                            i11 = i22;
                        } else {
                            i16++;
                        }
                    }
                    break loop0;
                }
                int i23 = (i15 * (-1)) + i16;
                while (true) {
                    int i24 = i10 + 1;
                    int i25 = i16 + 1;
                    if ((bArr[i10] & 255) != iArr[i16]) {
                        break loop0;
                    }
                    boolean z8 = i25 == i23;
                    if (i24 == i11) {
                        AbstractC2980h.m5133b(c2566f03);
                        C2566f0 c2566f04 = c2566f03.f9297f;
                        AbstractC2980h.m5133b(c2566f04);
                        i8 = c2566f04.f9293b;
                        byte[] bArr3 = c2566f04.f9292a;
                        i9 = c2566f04.f9294c;
                        if (c2566f04 != c2566f02) {
                            c2566f0 = c2566f04;
                            bArr = bArr3;
                        } else {
                            if (!z8) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c2566f0 = null;
                        }
                    } else {
                        c2566f0 = c2566f03;
                        i9 = i11;
                        i8 = i24;
                    }
                    if (z8) {
                        i = iArr[i25];
                        int i26 = i9;
                        c2566f03 = c2566f0;
                        i4 = i26;
                        break;
                    }
                    i10 = i8;
                    i11 = i9;
                    c2566f03 = c2566f0;
                    i16 = i25;
                }
            }
        } else {
            return z7 ? -2 : -1;
        }
    }
}
