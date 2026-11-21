package p063h1;

import com.bumptech.glide.AbstractC0714c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2131o;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC1013w0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.w */
/* loaded from: classes.dex */
public final class C1132w {

    /* renamed from: d */
    public static final char[] f4796d = {'\r', '\n'};

    /* renamed from: e */
    public static final char[] f4797e = {'\n'};

    /* renamed from: f */
    public static final AbstractC1013w0 f4798f = AbstractC1013w0.m2209i(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a */
    public byte[] f4799a;

    /* renamed from: b */
    public int f4800b;

    /* renamed from: c */
    public int f4801c;

    public C1132w() {
        this.f4799a = AbstractC1118i0.f4755f;
    }

    /* renamed from: A */
    public final int m2507A() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = (bArr[i] & 255) << 8;
        this.f4800b = i + 2;
        return (bArr[i4] & 255) | i8;
    }

    /* renamed from: B */
    public final long m2508B() {
        int i;
        int i4;
        long j = this.f4799a[this.f4800b];
        int i8 = 7;
        while (true) {
            if (i8 < 0) {
                break;
            }
            if (((1 << i8) & j) != 0) {
                i8--;
            } else if (i8 < 6) {
                j &= r6 - 1;
                i4 = 7 - i8;
            } else if (i8 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 == 0) {
            throw new NumberFormatException(AbstractC0008a1.m15k("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i = 1; i < i4; i++) {
            if ((this.f4799a[this.f4800b + i] & 192) != 128) {
                throw new NumberFormatException(AbstractC0008a1.m15k("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f4800b += i4;
        return j;
    }

    /* renamed from: C */
    public final Charset m2509C() {
        if (m2515a() >= 3) {
            byte[] bArr = this.f4799a;
            int i = this.f4800b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f4800b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m2515a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f4799a;
        int i4 = this.f4800b;
        byte b7 = bArr2[i4];
        if (b7 == -2 && bArr2[i4 + 1] == -1) {
            this.f4800b = i4 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b7 != -1 || bArr2[i4 + 1] != -2) {
            return null;
        }
        this.f4800b = i4 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* renamed from: D */
    public final void m2510D(int i) {
        byte[] bArr = this.f4799a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m2511E(bArr, i);
    }

    /* renamed from: E */
    public final void m2511E(byte[] bArr, int i) {
        this.f4799a = bArr;
        this.f4801c = i;
        this.f4800b = 0;
    }

    /* renamed from: F */
    public final void m2512F(int i) {
        AbstractC1101a.m2353d(i >= 0 && i <= this.f4799a.length);
        this.f4801c = i;
    }

    /* renamed from: G */
    public final void m2513G(int i) {
        AbstractC1101a.m2353d(i >= 0 && i <= this.f4801c);
        this.f4800b = i;
    }

    /* renamed from: H */
    public final void m2514H(int i) {
        m2513G(this.f4800b + i);
    }

    /* renamed from: a */
    public final int m2515a() {
        return this.f4801c - this.f4800b;
    }

    /* renamed from: b */
    public final void m2516b(int i) {
        byte[] bArr = this.f4799a;
        if (i > bArr.length) {
            this.f4799a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: c */
    public final char m2517c(Charset charset) {
        AbstractC1101a.m2352c("Unsupported charset: " + charset, f4798f.contains(charset));
        return (char) (m2518d(charset) >> 16);
    }

    /* renamed from: d */
    public final int m2518d(Charset charset) {
        byte b7;
        int i;
        byte b8;
        byte b9;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m2515a() >= 1) {
            long j = this.f4799a[this.f4800b] & 255;
            char c8 = (char) j;
            AbstractC0714c.m1525k(((long) c8) == j, "Out of range: %s", j);
            b7 = (byte) c8;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && m2515a() >= 2) {
                byte[] bArr = this.f4799a;
                int i4 = this.f4800b;
                b8 = bArr[i4];
                b9 = bArr[i4 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || m2515a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f4799a;
                int i8 = this.f4800b;
                b8 = bArr2[i8 + 1];
                b9 = bArr2[i8];
            }
            b7 = (byte) ((char) ((b9 & 255) | (b8 << 8)));
        }
        long j8 = b7;
        char c9 = (char) j8;
        AbstractC0714c.m1525k(((long) c9) == j8, "Out of range: %s", j8);
        return (c9 << 16) + i;
    }

    /* renamed from: e */
    public final void m2519e(byte[] bArr, int i, int i4) {
        System.arraycopy(this.f4799a, this.f4800b, bArr, i, i4);
        this.f4800b += i4;
    }

    /* renamed from: f */
    public final char m2520f(Charset charset, char[] cArr) {
        int iM2518d = m2518d(charset);
        if (iM2518d != 0) {
            char c8 = (char) (iM2518d >> 16);
            for (char c9 : cArr) {
                if (c9 == c8) {
                    this.f4800b += iM2518d & C2131o.DEFAULT_INITIAL_WINDOW_SIZE;
                    return c8;
                }
            }
        }
        return (char) 0;
    }

    /* renamed from: g */
    public final int m2521g() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = (bArr[i] & 255) << 24;
        int i9 = i + 2;
        this.f4800b = i9;
        int i10 = ((bArr[i4] & 255) << 16) | i8;
        int i11 = i + 3;
        this.f4800b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 8);
        this.f4800b = i + 4;
        return (bArr[i11] & 255) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2522h(Charset charset) {
        int i;
        AbstractC1101a.m2352c("Unsupported charset: " + charset, f4798f.contains(charset));
        if (m2515a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m2509C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i4 = this.f4800b;
        while (true) {
            int i8 = this.f4801c;
            if (i4 >= i8 - (i - 1)) {
                i4 = i8;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC1118i0.m2425P(this.f4799a[i4])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f4799a;
                if (bArr[i4] == 0 && AbstractC1118i0.m2425P(bArr[i4 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f4799a;
                    if (bArr2[i4 + 1] == 0 && AbstractC1118i0.m2425P(bArr2[i4])) {
                        break;
                    }
                }
                i4 += i;
            }
        }
        String strM2533s = m2533s(i4 - this.f4800b, charset);
        if (this.f4800b != this.f4801c && m2520f(charset, f4796d) == '\r') {
            m2520f(charset, f4797e);
        }
        return strM2533s;
    }

    /* renamed from: i */
    public final int m2523i() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = bArr[i] & 255;
        int i9 = i + 2;
        this.f4800b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i8;
        int i11 = i + 3;
        this.f4800b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f4800b = i + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    /* renamed from: j */
    public final long m2524j() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        this.f4800b = i + 1;
        this.f4800b = i + 2;
        this.f4800b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f4800b = i + 4;
        long j8 = j | ((bArr[r8] & 255) << 24);
        this.f4800b = i + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 32);
        this.f4800b = i + 6;
        long j10 = j9 | ((bArr[r8] & 255) << 40);
        this.f4800b = i + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 48);
        this.f4800b = i + 8;
        return ((bArr[r8] & 255) << 56) | j11;
    }

    /* renamed from: k */
    public final short m2525k() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = bArr[i] & 255;
        this.f4800b = i + 2;
        return (short) (((bArr[i4] & 255) << 8) | i8);
    }

    /* renamed from: l */
    public final long m2526l() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        this.f4800b = i + 1;
        this.f4800b = i + 2;
        this.f4800b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f4800b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    /* renamed from: m */
    public final int m2527m() {
        int iM2523i = m2523i();
        if (iM2523i >= 0) {
            return iM2523i;
        }
        throw new IllegalStateException(AbstractC0008a1.m12h(iM2523i, "Top bit not zero: "));
    }

    /* renamed from: n */
    public final int m2528n() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = bArr[i] & 255;
        this.f4800b = i + 2;
        return ((bArr[i4] & 255) << 8) | i8;
    }

    /* renamed from: o */
    public final long m2529o() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        this.f4800b = i + 1;
        this.f4800b = i + 2;
        this.f4800b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f4800b = i + 4;
        long j8 = j | ((bArr[r4] & 255) << 32);
        this.f4800b = i + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 24);
        this.f4800b = i + 6;
        long j10 = j9 | ((bArr[r4] & 255) << 16);
        this.f4800b = i + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 8);
        this.f4800b = i + 8;
        return (bArr[r4] & 255) | j11;
    }

    /* renamed from: p */
    public final String m2530p() {
        if (m2515a() == 0) {
            return null;
        }
        int i = this.f4800b;
        while (i < this.f4801c && this.f4799a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f4799a;
        int i4 = this.f4800b;
        int i8 = AbstractC1118i0.f4750a;
        String str = new String(bArr, i4, i - i4, StandardCharsets.UTF_8);
        this.f4800b = i;
        if (i < this.f4801c) {
            this.f4800b = i + 1;
        }
        return str;
    }

    /* renamed from: q */
    public final String m2531q(int i) {
        if (i == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        int i4 = this.f4800b;
        int i8 = (i4 + i) - 1;
        int i9 = (i8 >= this.f4801c || this.f4799a[i8] != 0) ? i : i - 1;
        byte[] bArr = this.f4799a;
        int i10 = AbstractC1118i0.f4750a;
        String str = new String(bArr, i4, i9, StandardCharsets.UTF_8);
        this.f4800b += i;
        return str;
    }

    /* renamed from: r */
    public final short m2532r() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = (bArr[i] & 255) << 8;
        this.f4800b = i + 2;
        return (short) ((bArr[i4] & 255) | i8);
    }

    /* renamed from: s */
    public final String m2533s(int i, Charset charset) {
        String str = new String(this.f4799a, this.f4800b, i, charset);
        this.f4800b += i;
        return str;
    }

    /* renamed from: t */
    public final int m2534t() {
        return (m2535u() << 21) | (m2535u() << 14) | (m2535u() << 7) | m2535u();
    }

    /* renamed from: u */
    public final int m2535u() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        this.f4800b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: v */
    public final int m2536v() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = (bArr[i] & 255) << 8;
        this.f4800b = i + 2;
        int i9 = (bArr[i4] & 255) | i8;
        this.f4800b = i + 4;
        return i9;
    }

    /* renamed from: w */
    public final long m2537w() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        this.f4800b = i + 1;
        this.f4800b = i + 2;
        this.f4800b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f4800b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    /* renamed from: x */
    public final int m2538x() {
        byte[] bArr = this.f4799a;
        int i = this.f4800b;
        int i4 = i + 1;
        this.f4800b = i4;
        int i8 = (bArr[i] & 255) << 16;
        int i9 = i + 2;
        this.f4800b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i8;
        this.f4800b = i + 3;
        return (bArr[i9] & 255) | i10;
    }

    /* renamed from: y */
    public final int m2539y() {
        int iM2521g = m2521g();
        if (iM2521g >= 0) {
            return iM2521g;
        }
        throw new IllegalStateException(AbstractC0008a1.m12h(iM2521g, "Top bit not zero: "));
    }

    /* renamed from: z */
    public final long m2540z() {
        long jM2529o = m2529o();
        if (jM2529o >= 0) {
            return jM2529o;
        }
        throw new IllegalStateException(AbstractC0008a1.m15k("Top bit not zero: ", jM2529o));
    }

    public C1132w(int i) {
        this.f4799a = new byte[i];
        this.f4801c = i;
    }

    public C1132w(byte[] bArr) {
        this.f4799a = bArr;
        this.f4801c = bArr.length;
    }

    public C1132w(byte[] bArr, int i) {
        this.f4799a = bArr;
        this.f4801c = i;
    }
}
