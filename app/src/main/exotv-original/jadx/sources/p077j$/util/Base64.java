package p077j$.util;

import java.util.Arrays;
import p077j$.sun.nio.p078cs.C1347c;

/* loaded from: classes2.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f5680c;
    }

    public static class Decoder {

        /* renamed from: a */
        public static final int[] f5678a;

        /* renamed from: b */
        public static final int[] f5679b;

        /* renamed from: c */
        public static final Decoder f5680c;

        static {
            int[] iArr = new int[256];
            f5678a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                f5678a[AbstractC1472a.f5681a[i]] = i;
            }
            f5678a[61] = -2;
            int[] iArr2 = new int[256];
            f5679b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i4 = 0; i4 < 64; i4++) {
                f5679b[AbstractC1472a.f5682b[i4]] = i4;
            }
            f5679b[61] = -2;
            f5680c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        
            if (r9 != 18) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r9 != 6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
        
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        
            if (r9 != 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        
            r0 = r10 + 1;
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 2;
            r5[r0] = (byte) (r11 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        
            if (r9 == 12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
        
            if (r8 < r6) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
        
            if (r10 == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
        
            return java.util.Arrays.copyOf(r5, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
        
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i4;
            int i8;
            char c8;
            byte[] bytes = str.getBytes(C1347c.f5398a);
            int length = bytes.length;
            char c9 = 2;
            if (length == 0) {
                i4 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i = 0;
                }
                if (i == 0 && (i8 = length & 3) != 0) {
                    i = 4 - i8;
                }
                i4 = (((length + 3) / 4) * 3) - i;
            }
            byte[] bArr = new byte[i4];
            int length2 = bytes.length;
            int i9 = 18;
            int i10 = 18;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                int[] iArr = f5678a;
                if (i10 == i9 && i11 + 4 < length2) {
                    int i14 = ((length2 - i11) & (-4)) + i11;
                    while (true) {
                        if (i11 >= i14) {
                            c8 = c9;
                            break;
                        }
                        int i15 = iArr[bytes[i11] & 255];
                        c8 = c9;
                        int i16 = iArr[bytes[i11 + 1] & 255];
                        int i17 = iArr[bytes[i11 + 2] & 255];
                        int i18 = i11 + 4;
                        int i19 = iArr[bytes[i11 + 3] & 255];
                        if ((i15 | i16 | i17 | i19) < 0) {
                            break;
                        }
                        int i20 = (i15 << 18) | (i16 << 12) | (i17 << 6) | i19;
                        bArr[i12] = (byte) (i20 >> 16);
                        int i21 = i12 + 2;
                        bArr[i12 + 1] = (byte) (i20 >> 8);
                        i12 += 3;
                        bArr[i21] = (byte) i20;
                        i11 = i18;
                        c9 = c8;
                    }
                    if (i11 < length2) {
                        break;
                        break;
                    }
                    break;
                }
                c8 = c9;
                int i22 = i11 + 1;
                int i23 = iArr[bytes[i11] & 255];
                if (i23 >= 0) {
                    i9 = 18;
                    int i24 = (i23 << i10) | i13;
                    i10 -= 6;
                    if (i10 < 0) {
                        bArr[i12] = (byte) (i24 >> 16);
                        int i25 = i12 + 2;
                        bArr[i12 + 1] = (byte) (i24 >> 8);
                        i12 += 3;
                        bArr[i25] = (byte) i24;
                        i10 = 18;
                        i13 = 0;
                    } else {
                        i13 = i24;
                    }
                    i11 = i22;
                    c9 = c8;
                } else {
                    if (i23 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i11], 16));
                    }
                    if (i10 == 6) {
                        if (i22 != length2) {
                            i11 += 2;
                            if (bytes[i22] == 61) {
                            }
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i11 = i22;
                }
            }
        }
    }
}
