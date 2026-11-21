package p189v7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1214p;
import p111m6.AbstractC1912g;
import p198w7.AbstractC2706b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.m */
/* loaded from: classes.dex */
public class C2579m implements Serializable, Comparable {

    /* renamed from: m */
    public static final C2579m f9316m = new C2579m(new byte[0]);

    /* renamed from: j */
    public final byte[] f9317j;

    /* renamed from: k */
    public transient int f9318k;

    /* renamed from: l */
    public transient String f9319l;

    public C2579m(byte[] bArr) {
        AbstractC2980h.m5136e("data", bArr);
        this.f9317j = bArr;
    }

    /* renamed from: g */
    public static int m4671g(C2579m c2579m, C2579m c2579m2) {
        c2579m.getClass();
        AbstractC2980h.m5136e("other", c2579m2);
        return c2579m.mo4636f(c2579m2.mo4637h(), 0);
    }

    /* renamed from: k */
    public static int m4672k(C2579m c2579m, C2579m c2579m2) {
        c2579m.getClass();
        AbstractC2980h.m5136e("other", c2579m2);
        return c2579m.mo4639j(c2579m2.mo4637h());
    }

    /* renamed from: o */
    public static /* synthetic */ C2579m m4673o(C2579m c2579m, int i, int i4, int i8) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i4 = -1234567890;
        }
        return c2579m.mo4642n(i, i4);
    }

    /* renamed from: a */
    public String mo4632a() {
        byte[] bArr = AbstractC2555a.f9268a;
        byte[] bArr2 = this.f9317j;
        AbstractC2980h.m5136e("<this>", bArr2);
        AbstractC2980h.m5136e("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i4 = 0;
        while (i < length) {
            byte b7 = bArr2[i];
            int i8 = i + 2;
            byte b8 = bArr2[i + 1];
            i += 3;
            byte b9 = bArr2[i8];
            bArr3[i4] = bArr[(b7 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i9 = i4 + 3;
            bArr3[i4 + 2] = bArr[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i4 += 4;
            bArr3[i9] = bArr[b9 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b10 = bArr2[i];
            bArr3[i4] = bArr[(b10 & 255) >> 2];
            bArr3[i4 + 1] = bArr[(b10 & 3) << 4];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i10 = i + 1;
            byte b11 = bArr2[i];
            byte b12 = bArr2[i10];
            bArr3[i4] = bArr[(b11 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[(b12 & 15) << 2];
            bArr3[i4 + 3] = 61;
        }
        return new String(bArr3, AbstractC1199a.f5077a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2579m c2579m) {
        AbstractC2980h.m5136e("other", c2579m);
        int iMo4634d = mo4634d();
        int iMo4634d2 = c2579m.mo4634d();
        int iMin = Math.min(iMo4634d, iMo4634d2);
        for (int i = 0; i < iMin; i++) {
            int iMo4638i = mo4638i(i) & 255;
            int iMo4638i2 = c2579m.mo4638i(i) & 255;
            if (iMo4638i != iMo4638i2) {
                return iMo4638i < iMo4638i2 ? -1 : 1;
            }
        }
        if (iMo4634d == iMo4634d2) {
            return 0;
        }
        return iMo4634d < iMo4634d2 ? -1 : 1;
    }

    /* renamed from: c */
    public C2579m mo4633c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f9317j, 0, mo4634d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2980h.m5133b(bArrDigest);
        return new C2579m(bArrDigest);
    }

    /* renamed from: d */
    public int mo4634d() {
        return this.f9317j.length;
    }

    /* renamed from: e */
    public String mo4635e() {
        byte[] bArr = this.f9317j;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b7 : bArr) {
            int i4 = i + 1;
            char[] cArr2 = AbstractC2706b.f9823a;
            cArr[i] = cArr2[(b7 >> 4) & 15];
            i += 2;
            cArr[i4] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2579m) {
            C2579m c2579m = (C2579m) obj;
            int iMo4634d = c2579m.mo4634d();
            byte[] bArr = this.f9317j;
            if (iMo4634d == bArr.length && c2579m.mo4640l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo4636f(byte[] bArr, int i) {
        AbstractC2980h.m5136e("other", bArr);
        byte[] bArr2 = this.f9317j;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC2557b.m4576a(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* renamed from: h */
    public byte[] mo4637h() {
        return this.f9317j;
    }

    public int hashCode() {
        int i = this.f9318k;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f9317j);
        this.f9318k = iHashCode;
        return iHashCode;
    }

    /* renamed from: i */
    public byte mo4638i(int i) {
        return this.f9317j[i];
    }

    /* renamed from: j */
    public int mo4639j(byte[] bArr) {
        AbstractC2980h.m5136e("other", bArr);
        int iMo4634d = mo4634d();
        byte[] bArr2 = this.f9317j;
        for (int iMin = Math.min(iMo4634d, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC2557b.m4576a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public boolean mo4640l(int i, int i4, int i8, byte[] bArr) {
        AbstractC2980h.m5136e("other", bArr);
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f9317j;
        return i <= bArr2.length - i8 && i4 >= 0 && i4 <= bArr.length - i8 && AbstractC2557b.m4576a(i, i4, i8, bArr2, bArr);
    }

    /* renamed from: m */
    public boolean mo4641m(int i, C2579m c2579m, int i4) {
        AbstractC2980h.m5136e("other", c2579m);
        return c2579m.mo4640l(0, i, i4, this.f9317j);
    }

    /* renamed from: n */
    public C2579m mo4642n(int i, int i4) {
        if (i4 == -1234567890) {
            i4 = mo4634d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f9317j;
        if (i4 <= bArr.length) {
            if (i4 - i >= 0) {
                return (i == 0 && i4 == bArr.length) ? this : new C2579m(AbstractC1912g.m3730n0(bArr, i, i4));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    /* renamed from: p */
    public C2579m mo4643p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f9317j;
            if (i >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC2980h.m5135d("copyOf(...)", bArrCopyOf);
                bArrCopyOf[i] = (byte) (b7 + 32);
                for (int i4 = i + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b8 = bArrCopyOf[i4];
                    if (b8 >= 65 && b8 <= 90) {
                        bArrCopyOf[i4] = (byte) (b8 + 32);
                    }
                }
                return new C2579m(bArrCopyOf);
            }
            i++;
        }
    }

    /* renamed from: q */
    public final String m4675q() {
        String str = this.f9319l;
        if (str != null) {
            return str;
        }
        byte[] bArrMo4637h = mo4637h();
        AbstractC2980h.m5136e("<this>", bArrMo4637h);
        String str2 = new String(bArrMo4637h, AbstractC1199a.f5077a);
        this.f9319l = str2;
        return str2;
    }

    /* renamed from: r */
    public void mo4644r(int i, C2573j c2573j) {
        c2573j.m5289write(this.f9317j, 0, i);
    }

    public String toString() {
        byte b7;
        int i;
        byte[] bArr = this.f9317j;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b8 = bArr[i4];
            if (b8 >= 0) {
                int i10 = i9 + 1;
                if (i9 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (Byte.MAX_VALUE <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i8 += b8 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i9 = i10;
                    if (i4 < length && (b7 = bArr[i4]) >= 0) {
                        i4++;
                        i10 = i9 + 1;
                        if (i9 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i8 += b7 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i11 = i4 + 1;
                if (length > i11) {
                    byte b9 = bArr[i11];
                    if ((b9 & 192) == 128) {
                        int i12 = (b9 ^ 3968) ^ (b8 << 6);
                        if (i12 >= 128) {
                            i = i9 + 1;
                            if (i9 == 64) {
                                break;
                            }
                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                break;
                            }
                            i8 += i12 < 65536 ? 1 : 2;
                            i4 += 2;
                            i9 = i;
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b8 >> 4) == -2) {
                int i13 = i4 + 2;
                if (length > i13) {
                    byte b10 = bArr[i4 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i13];
                        if ((b11 & 192) == 128) {
                            int i14 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                            if (i14 < 2048) {
                                if (i9 != 64) {
                                    break;
                                }
                            } else if (55296 > i14 || i14 >= 57344) {
                                i = i9 + 1;
                                if (i9 == 64) {
                                    break;
                                }
                                if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                    break;
                                }
                                i8 += i14 < 65536 ? 1 : 2;
                                i4 += 3;
                                i9 = i;
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b8 >> 3) == -2) {
                int i15 = i4 + 3;
                if (length > i15) {
                    byte b12 = bArr[i4 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i4 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & 192) == 128) {
                                int i16 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                                if (i16 > 1114111) {
                                    if (i9 != 64) {
                                        break;
                                    }
                                } else if (55296 > i16 || i16 >= 57344) {
                                    if (i16 >= 65536) {
                                        i = i9 + 1;
                                        if (i9 == 64) {
                                            break;
                                        }
                                        if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                            break;
                                        }
                                        i8 += i16 < 65536 ? 1 : 2;
                                        i4 += 4;
                                        i9 = i;
                                    } else if (i9 != 64) {
                                        break;
                                    }
                                } else if (i9 != 64) {
                                    break;
                                }
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if (i9 != 64) {
                break;
            }
        }
        i8 = -1;
        if (i8 != -1) {
            String strM4675q = m4675q();
            String strSubstring = strM4675q.substring(0, i8);
            AbstractC2980h.m5135d("substring(...)", strSubstring);
            String strM2665r0 = AbstractC1214p.m2665r0(AbstractC1214p.m2665r0(AbstractC1214p.m2665r0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i8 >= strM4675q.length()) {
                return "[text=" + strM2665r0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strM2665r0 + "\u2026]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo4635e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new C2579m(AbstractC1912g.m3730n0(bArr, 0, 64))).mo4635e());
            sb.append("\u2026]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
