package p189v7;

import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.C2181z;
import okhttp3.internal.connection.C2096f;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1199a;
import p111m6.AbstractC1912g;
import p198w7.AbstractC2705a;
import p198w7.AbstractC2706b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.j */
/* loaded from: classes.dex */
public final class C2573j implements InterfaceC2577l, InterfaceC2575k, Cloneable, ByteChannel {

    /* renamed from: j */
    public C2566f0 f9313j;

    /* renamed from: k */
    public long f9314k;

    @Override // p189v7.InterfaceC2577l
    /* renamed from: A */
    public final void mo4604A(C2573j c2573j, long j) throws EOFException {
        AbstractC2980h.m5136e("sink", c2573j);
        long j8 = this.f9314k;
        if (j8 >= j) {
            c2573j.write(this, j);
        } else {
            c2573j.write(this, j8);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // p189v7.InterfaceC2577l
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4605B() throws EOFException {
        int i;
        if (this.f9314k == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z7 = false;
        long j = 0;
        do {
            C2566f0 c2566f0 = this.f9313j;
            AbstractC2980h.m5133b(c2566f0);
            byte[] bArr = c2566f0.f9292a;
            int i8 = c2566f0.f9293b;
            int i9 = c2566f0.f9294c;
            while (i8 < i9) {
                byte b7 = bArr[i8];
                if (b7 >= 48 && b7 <= 57) {
                    i = b7 - 48;
                } else if (b7 >= 97 && b7 <= 102) {
                    i = b7 - 87;
                } else if (b7 < 65 || b7 > 70) {
                    z7 = true;
                    if (i4 == 0) {
                        char[] cArr = AbstractC2706b.f9823a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b7 >> 4) & 15], cArr[b7 & 15]})));
                    }
                    if (i8 != i9) {
                        this.f9313j = c2566f0.m4624a();
                        AbstractC2568g0.m4628a(c2566f0);
                    } else {
                        c2566f0.f9293b = i8;
                    }
                    if (!z7) {
                        break;
                    }
                } else {
                    i = b7 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C2573j c2573j = new C2573j();
                    c2573j.m4657M(j);
                    c2573j.m4655K(b7);
                    throw new NumberFormatException("Number too large: ".concat(c2573j.m4651G()));
                }
                j = (j << 4) | i;
                i8++;
                i4++;
            }
            if (i8 != i9) {
            }
            if (!z7) {
            }
        } while (this.f9313j != null);
        this.f9314k -= i4;
        return j;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: C */
    public final InputStream mo4606C() {
        return new C2571i(this, 0);
    }

    /* renamed from: D */
    public final byte[] m4648D(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount: ", j).toString());
        }
        if (this.f9314k < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* renamed from: E */
    public final short m4649E() throws EOFException {
        short s8 = readShort();
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    /* renamed from: F */
    public final String m4650F(long j, Charset charset) throws EOFException {
        AbstractC2980h.m5136e("charset", charset);
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount: ", j).toString());
        }
        if (this.f9314k < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        int i = c2566f0.f9293b;
        if (i + j > c2566f0.f9294c) {
            return new String(m4648D(j), charset);
        }
        int i4 = (int) j;
        String str = new String(c2566f0.f9292a, i, i4, charset);
        int i8 = c2566f0.f9293b + i4;
        c2566f0.f9293b = i8;
        this.f9314k -= j;
        if (i8 == c2566f0.f9294c) {
            this.f9313j = c2566f0.m4624a();
            AbstractC2568g0.m4628a(c2566f0);
        }
        return str;
    }

    /* renamed from: G */
    public final String m4651G() {
        return m4650F(this.f9314k, AbstractC1199a.f5077a);
    }

    /* renamed from: H */
    public final C2579m m4652H(int i) {
        if (i == 0) {
            return C2579m.f9316m;
        }
        AbstractC2557b.m4580e(this.f9314k, 0L, i);
        C2566f0 c2566f0 = this.f9313j;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            AbstractC2980h.m5133b(c2566f0);
            int i10 = c2566f0.f9294c;
            int i11 = c2566f0.f9293b;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i8 += i10 - i11;
            i9++;
            c2566f0 = c2566f0.f9297f;
        }
        byte[][] bArr = new byte[i9][];
        int[] iArr = new int[i9 * 2];
        C2566f0 c2566f02 = this.f9313j;
        int i12 = 0;
        while (i4 < i) {
            AbstractC2980h.m5133b(c2566f02);
            bArr[i12] = c2566f02.f9292a;
            i4 += c2566f02.f9294c - c2566f02.f9293b;
            iArr[i12] = Math.min(i4, i);
            iArr[i12 + i9] = c2566f02.f9293b;
            c2566f02.f9295d = true;
            i12++;
            c2566f02 = c2566f02.f9297f;
        }
        return new C2570h0(bArr, iArr);
    }

    /* renamed from: I */
    public final C2566f0 m4653I(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            C2566f0 c2566f0M4629b = AbstractC2568g0.m4629b();
            this.f9313j = c2566f0M4629b;
            c2566f0M4629b.f9298g = c2566f0M4629b;
            c2566f0M4629b.f9297f = c2566f0M4629b;
            return c2566f0M4629b;
        }
        C2566f0 c2566f02 = c2566f0.f9298g;
        AbstractC2980h.m5133b(c2566f02);
        if (c2566f02.f9294c + i <= 8192 && c2566f02.f9296e) {
            return c2566f02;
        }
        C2566f0 c2566f0M4629b2 = AbstractC2568g0.m4629b();
        c2566f02.m4625b(c2566f0M4629b2);
        return c2566f0M4629b2;
    }

    /* renamed from: J */
    public final void m4654J(C2579m c2579m) {
        AbstractC2980h.m5136e("byteString", c2579m);
        c2579m.mo4644r(c2579m.mo4634d(), this);
    }

    /* renamed from: K */
    public final void m4655K(int i) {
        C2566f0 c2566f0M4653I = m4653I(1);
        byte[] bArr = c2566f0M4653I.f9292a;
        int i4 = c2566f0M4653I.f9294c;
        c2566f0M4653I.f9294c = i4 + 1;
        bArr[i4] = (byte) i;
        this.f9314k++;
    }

    /* renamed from: L */
    public final void m4656L(long j) {
        boolean z7;
        if (j == 0) {
            m4655K(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m4661Q("-9223372036854775808");
                return;
            }
            z7 = true;
        } else {
            z7 = false;
        }
        if (j >= 100000000) {
            i = j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j < C2096f.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
            i = j < 1000000 ? j < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z7) {
            i++;
        }
        C2566f0 c2566f0M4653I = m4653I(i);
        byte[] bArr = c2566f0M4653I.f9292a;
        int i4 = c2566f0M4653I.f9294c + i;
        while (j != 0) {
            long j8 = 10;
            i4--;
            bArr[i4] = AbstractC2705a.f9822a[(int) (j % j8)];
            j /= j8;
        }
        if (z7) {
            bArr[i4 - 1] = 45;
        }
        c2566f0M4653I.f9294c += i;
        this.f9314k += i;
    }

    /* renamed from: M */
    public final void m4657M(long j) {
        if (j == 0) {
            m4655K(48);
            return;
        }
        long j8 = (j >>> 1) | j;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        C2566f0 c2566f0M4653I = m4653I(i);
        byte[] bArr = c2566f0M4653I.f9292a;
        int i4 = c2566f0M4653I.f9294c;
        for (int i8 = (i4 + i) - 1; i8 >= i4; i8--) {
            bArr[i8] = AbstractC2705a.f9822a[(int) (15 & j)];
            j >>>= 4;
        }
        c2566f0M4653I.f9294c += i;
        this.f9314k += i;
    }

    /* renamed from: N */
    public final void m4658N(int i) {
        C2566f0 c2566f0M4653I = m4653I(4);
        byte[] bArr = c2566f0M4653I.f9292a;
        int i4 = c2566f0M4653I.f9294c;
        bArr[i4] = (byte) ((i >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i & 255);
        c2566f0M4653I.f9294c = i4 + 4;
        this.f9314k += 4;
    }

    /* renamed from: O */
    public final void m4659O(int i) {
        C2566f0 c2566f0M4653I = m4653I(2);
        byte[] bArr = c2566f0M4653I.f9292a;
        int i4 = c2566f0M4653I.f9294c;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i & 255);
        c2566f0M4653I.f9294c = i4 + 2;
        this.f9314k += 2;
    }

    /* renamed from: P */
    public final void m4660P(String str, int i, int i4, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "beginIndex < 0: ").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(i4, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        if (charset.equals(AbstractC1199a.f5077a)) {
            m4662R(str, i, i4);
            return;
        }
        String strSubstring = str.substring(i, i4);
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        m5289write(bytes, 0, bytes.length);
    }

    /* renamed from: Q */
    public final void m4661Q(String str) {
        AbstractC2980h.m5136e("string", str);
        m4662R(str, 0, str.length());
    }

    /* renamed from: R */
    public final void m4662R(String str, int i, int i4) {
        char cCharAt;
        AbstractC2980h.m5136e("string", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "beginIndex < 0: ").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(i4, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        while (i < i4) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < '\u0080') {
                C2566f0 c2566f0M4653I = m4653I(1);
                byte[] bArr = c2566f0M4653I.f9292a;
                int i8 = c2566f0M4653I.f9294c - i;
                int iMin = Math.min(i4, 8192 - i8);
                int i9 = i + 1;
                bArr[i + i8] = (byte) cCharAt2;
                while (true) {
                    i = i9;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= '\u0080') {
                        break;
                    }
                    i9 = i + 1;
                    bArr[i + i8] = (byte) cCharAt;
                }
                int i10 = c2566f0M4653I.f9294c;
                int i11 = (i8 + i) - i10;
                c2566f0M4653I.f9294c = i10 + i11;
                this.f9314k += i11;
            } else {
                if (cCharAt2 < '\u0800') {
                    C2566f0 c2566f0M4653I2 = m4653I(2);
                    byte[] bArr2 = c2566f0M4653I2.f9292a;
                    int i12 = c2566f0M4653I2.f9294c;
                    bArr2[i12] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c2566f0M4653I2.f9294c = i12 + 2;
                    this.f9314k += 2;
                } else if (cCharAt2 < '\ud800' || cCharAt2 > '\udfff') {
                    C2566f0 c2566f0M4653I3 = m4653I(3);
                    byte[] bArr3 = c2566f0M4653I3.f9292a;
                    int i13 = c2566f0M4653I3.f9294c;
                    bArr3[i13] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c2566f0M4653I3.f9294c = i13 + 3;
                    this.f9314k += 3;
                } else {
                    int i14 = i + 1;
                    char cCharAt3 = i14 < i4 ? str.charAt(i14) : (char) 0;
                    if (cCharAt2 > '\udbff' || '\udc00' > cCharAt3 || cCharAt3 >= '\ue000') {
                        m4655K(63);
                        i = i14;
                    } else {
                        int i15 = (((cCharAt2 & '\u03ff') << 10) | (cCharAt3 & '\u03ff')) + 65536;
                        C2566f0 c2566f0M4653I4 = m4653I(4);
                        byte[] bArr4 = c2566f0M4653I4.f9292a;
                        int i16 = c2566f0M4653I4.f9294c;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                        c2566f0M4653I4.f9294c = i16 + 4;
                        this.f9314k += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: S */
    public final void m4663S(int i) {
        if (i < 128) {
            m4655K(i);
            return;
        }
        if (i < 2048) {
            C2566f0 c2566f0M4653I = m4653I(2);
            byte[] bArr = c2566f0M4653I.f9292a;
            int i4 = c2566f0M4653I.f9294c;
            bArr[i4] = (byte) ((i >> 6) | 192);
            bArr[i4 + 1] = (byte) ((i & 63) | 128);
            c2566f0M4653I.f9294c = i4 + 2;
            this.f9314k += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m4655K(63);
            return;
        }
        if (i < 65536) {
            C2566f0 c2566f0M4653I2 = m4653I(3);
            byte[] bArr2 = c2566f0M4653I2.f9292a;
            int i8 = c2566f0M4653I2.f9294c;
            bArr2[i8] = (byte) ((i >> 12) | 224);
            bArr2[i8 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i8 + 2] = (byte) ((i & 63) | 128);
            c2566f0M4653I2.f9294c = i8 + 3;
            this.f9314k += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC2557b.m4586k(i)));
        }
        C2566f0 c2566f0M4653I3 = m4653I(4);
        byte[] bArr3 = c2566f0M4653I3.f9292a;
        int i9 = c2566f0M4653I3.f9294c;
        bArr3[i9] = (byte) ((i >> 18) | 240);
        bArr3[i9 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i9 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i9 + 3] = (byte) ((i & 63) | 128);
        c2566f0M4653I3.f9294c = i9 + 4;
        this.f9314k += 4;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: a */
    public final C2573j mo4607a() {
        return this;
    }

    /* renamed from: b */
    public final long m4664b() {
        long j = this.f9314k;
        if (j == 0) {
            return 0L;
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        C2566f0 c2566f02 = c2566f0.f9298g;
        AbstractC2980h.m5133b(c2566f02);
        return (c2566f02.f9294c >= 8192 || !c2566f02.f9296e) ? j : j - (r3 - c2566f02.f9293b);
    }

    /* renamed from: c */
    public final void m4665c(C2573j c2573j, long j, long j8) {
        AbstractC2980h.m5136e("out", c2573j);
        long j9 = j;
        AbstractC2557b.m4580e(this.f9314k, j9, j8);
        if (j8 == 0) {
            return;
        }
        c2573j.f9314k += j8;
        C2566f0 c2566f0 = this.f9313j;
        while (true) {
            AbstractC2980h.m5133b(c2566f0);
            long j10 = c2566f0.f9294c - c2566f0.f9293b;
            if (j9 < j10) {
                break;
            }
            j9 -= j10;
            c2566f0 = c2566f0.f9297f;
        }
        C2566f0 c2566f02 = c2566f0;
        long j11 = j8;
        while (j11 > 0) {
            AbstractC2980h.m5133b(c2566f02);
            C2566f0 c2566f0M4626c = c2566f02.m4626c();
            int i = c2566f0M4626c.f9293b + ((int) j9);
            c2566f0M4626c.f9293b = i;
            c2566f0M4626c.f9294c = Math.min(i + ((int) j11), c2566f0M4626c.f9294c);
            C2566f0 c2566f03 = c2573j.f9313j;
            if (c2566f03 == null) {
                c2566f0M4626c.f9298g = c2566f0M4626c;
                c2566f0M4626c.f9297f = c2566f0M4626c;
                c2573j.f9313j = c2566f0M4626c;
            } else {
                C2566f0 c2566f04 = c2566f03.f9298g;
                AbstractC2980h.m5133b(c2566f04);
                c2566f04.m4625b(c2566f0M4626c);
            }
            j11 -= c2566f0M4626c.f9294c - c2566f0M4626c.f9293b;
            c2566f02 = c2566f02.f9297f;
            j9 = 0;
        }
    }

    public final Object clone() {
        C2573j c2573j = new C2573j();
        if (this.f9314k == 0) {
            return c2573j;
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        C2566f0 c2566f0M4626c = c2566f0.m4626c();
        c2573j.f9313j = c2566f0M4626c;
        c2566f0M4626c.f9298g = c2566f0M4626c;
        c2566f0M4626c.f9297f = c2566f0M4626c;
        for (C2566f0 c2566f02 = c2566f0.f9297f; c2566f02 != c2566f0; c2566f02 = c2566f02.f9297f) {
            C2566f0 c2566f03 = c2566f0M4626c.f9298g;
            AbstractC2980h.m5133b(c2566f03);
            AbstractC2980h.m5133b(c2566f02);
            c2566f03.m4625b(c2566f02.m4626c());
        }
        c2573j.f9314k = this.f9314k;
        return c2573j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p189v7.InterfaceC2572i0
    public final void close() {
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: d */
    public final C2579m mo4610d(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount: ", j).toString());
        }
        if (this.f9314k < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C2579m(m4648D(j));
        }
        C2579m c2579mM4652H = m4652H((int) j);
        skip(j);
        return c2579mM4652H;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: e */
    public final InterfaceC2575k mo4597e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2573j)) {
            return false;
        }
        long j = this.f9314k;
        C2573j c2573j = (C2573j) obj;
        if (j != c2573j.f9314k) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        C2566f0 c2566f02 = c2573j.f9313j;
        AbstractC2980h.m5133b(c2566f02);
        int i = c2566f0.f9293b;
        int i4 = c2566f02.f9293b;
        long j8 = 0;
        while (j8 < this.f9314k) {
            long jMin = Math.min(c2566f0.f9294c - i, c2566f02.f9294c - i4);
            long j9 = 0;
            while (j9 < jMin) {
                int i8 = i + 1;
                int i9 = i4 + 1;
                if (c2566f0.f9292a[i] != c2566f02.f9292a[i4]) {
                    return false;
                }
                j9++;
                i = i8;
                i4 = i9;
            }
            if (i == c2566f0.f9294c) {
                c2566f0 = c2566f0.f9297f;
                AbstractC2980h.m5133b(c2566f0);
                i = c2566f0.f9293b;
            }
            if (i4 == c2566f02.f9294c) {
                c2566f02 = c2566f02.f9297f;
                AbstractC2980h.m5133b(c2566f02);
                i4 = c2566f02.f9293b;
            }
            j8 += jMin;
        }
        return true;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: f */
    public final long mo4598f(InterfaceC2576k0 interfaceC2576k0) {
        AbstractC2980h.m5136e("source", interfaceC2576k0);
        long j = 0;
        while (true) {
            long j8 = interfaceC2576k0.read(this, 8192L);
            if (j8 == -1) {
                return j;
            }
            j += j8;
        }
    }

    @Override // p189v7.InterfaceC2575k, p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() {
    }

    /* renamed from: g */
    public final byte m4666g(long j) {
        AbstractC2557b.m4580e(this.f9314k, j, 1L);
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            AbstractC2980h.m5133b(null);
            throw null;
        }
        long j8 = this.f9314k;
        if (j8 - j < j) {
            while (j8 > j) {
                c2566f0 = c2566f0.f9298g;
                AbstractC2980h.m5133b(c2566f0);
                j8 -= c2566f0.f9294c - c2566f0.f9293b;
            }
            return c2566f0.f9292a[(int) ((c2566f0.f9293b + j) - j8)];
        }
        long j9 = 0;
        while (true) {
            int i = c2566f0.f9294c;
            int i4 = c2566f0.f9293b;
            long j10 = (i - i4) + j9;
            if (j10 > j) {
                return c2566f0.f9292a[(int) ((i4 + j) - j9)];
            }
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j9 = j10;
        }
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: h */
    public final int mo4612h(C2595z c2595z) throws EOFException {
        AbstractC2980h.m5136e("options", c2595z);
        int iM4760b = AbstractC2705a.m4760b(this, c2595z, false);
        if (iM4760b == -1) {
            return -1;
        }
        skip(c2595z.f9346j[iM4760b].mo4634d());
        return iM4760b;
    }

    public final int hashCode() {
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = c2566f0.f9294c;
            for (int i8 = c2566f0.f9293b; i8 < i4; i8++) {
                i = (i * 31) + c2566f0.f9292a[i8];
            }
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
        } while (c2566f0 != this.f9313j);
        return i;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: i */
    public final byte[] mo4613i() {
        return m4648D(this.f9314k);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: j */
    public final boolean mo4614j() {
        return this.f9314k == 0;
    }

    /* renamed from: k */
    public final long m4667k(byte b7, long j, long j8) {
        C2566f0 c2566f0;
        long j9 = 0;
        if (0 > j || j > j8) {
            throw new IllegalArgumentException(("size=" + this.f9314k + " fromIndex=" + j + " toIndex=" + j8).toString());
        }
        long j10 = this.f9314k;
        if (j8 > j10) {
            j8 = j10;
        }
        if (j == j8 || (c2566f0 = this.f9313j) == null) {
            return -1L;
        }
        if (j10 - j < j) {
            while (j10 > j) {
                c2566f0 = c2566f0.f9298g;
                AbstractC2980h.m5133b(c2566f0);
                j10 -= c2566f0.f9294c - c2566f0.f9293b;
            }
            while (j10 < j8) {
                byte[] bArr = c2566f0.f9292a;
                int iMin = (int) Math.min(c2566f0.f9294c, (c2566f0.f9293b + j8) - j10);
                for (int i = (int) ((c2566f0.f9293b + j) - j10); i < iMin; i++) {
                    if (bArr[i] == b7) {
                        return (i - c2566f0.f9293b) + j10;
                    }
                }
                j10 += c2566f0.f9294c - c2566f0.f9293b;
                c2566f0 = c2566f0.f9297f;
                AbstractC2980h.m5133b(c2566f0);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (c2566f0.f9294c - c2566f0.f9293b) + j9;
            if (j11 > j) {
                break;
            }
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j9 = j11;
        }
        while (j9 < j8) {
            byte[] bArr2 = c2566f0.f9292a;
            int iMin2 = (int) Math.min(c2566f0.f9294c, (c2566f0.f9293b + j8) - j9);
            for (int i4 = (int) ((c2566f0.f9293b + j) - j9); i4 < iMin2; i4++) {
                if (bArr2[i4] == b7) {
                    return (i4 - c2566f0.f9293b) + j9;
                }
            }
            j9 += c2566f0.f9294c - c2566f0.f9293b;
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j = j9;
        }
        return -1L;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: l */
    public final InterfaceC2575k mo4599l() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r2 = new p189v7.C2573j();
        r2.m4656L(r7);
        r2.m4655K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r9 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r2.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r2.m4651G()));
     */
    @Override // p189v7.InterfaceC2577l
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4616m() throws EOFException {
        long j;
        char c8;
        int i;
        long j8 = 0;
        if (this.f9314k == 0) {
            throw new EOFException();
        }
        long j9 = -7;
        long j10 = 0;
        int i4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        loop0: while (true) {
            C2566f0 c2566f0 = this.f9313j;
            AbstractC2980h.m5133b(c2566f0);
            byte[] bArr = c2566f0.f9292a;
            int i8 = c2566f0.f9293b;
            int i9 = c2566f0.f9294c;
            while (i8 < i9) {
                c8 = 0;
                byte b7 = bArr[i8];
                i = 1;
                if (b7 >= 48 && b7 <= 57) {
                    int i10 = 48 - b7;
                    if (j10 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j8;
                    if (j10 == -922337203685477580L && i10 < j9) {
                        break loop0;
                    }
                    j10 = (j10 * 10) + i10;
                } else {
                    j = j8;
                    if (b7 != 45 || i4 != 0) {
                        z8 = true;
                        break;
                    }
                    j9--;
                    z7 = true;
                }
                i8++;
                i4++;
                j8 = j;
            }
            j = j8;
            c8 = 0;
            i = 1;
            if (i8 == i9) {
                this.f9313j = c2566f0.m4624a();
                AbstractC2568g0.m4628a(c2566f0);
            } else {
                c2566f0.f9293b = i8;
            }
            if (z8 || this.f9313j == null) {
                break;
            }
            j8 = j;
        }
        long j11 = this.f9314k - i4;
        this.f9314k = j11;
        if (i4 >= (z7 ? 2 : i)) {
            return z7 ? j10 : -j10;
        }
        if (j11 == j) {
            throw new EOFException();
        }
        String str = z7 ? "Expected a digit" : "Expected a digit or '-'";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" but was 0x");
        byte bM4666g = m4666g(j);
        char[] cArr = AbstractC2706b.f9823a;
        char c9 = cArr[(bM4666g >> 4) & 15];
        char c10 = cArr[bM4666g & 15];
        char[] cArr2 = new char[2];
        cArr2[c8] = c9;
        cArr2[i] = c10;
        sb.append(new String(cArr2));
        throw new NumberFormatException(sb.toString());
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: n */
    public final String mo4617n(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("limit < 0: ", j).toString());
        }
        long j8 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM4667k = m4667k((byte) 10, 0L, j8);
        if (jM4667k != -1) {
            return AbstractC2705a.m4759a(this, jM4667k);
        }
        if (j8 < this.f9314k && m4666g(j8 - 1) == 13 && m4666g(j8) == 10) {
            return AbstractC2705a.m4759a(this, j8);
        }
        C2573j c2573j = new C2573j();
        m4665c(c2573j, 0L, Math.min(32, this.f9314k));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f9314k, j) + " content=" + c2573j.mo4610d(c2573j.f9314k).mo4635e() + '\u2026');
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ InterfaceC2575k mo4600o(String str) {
        m4661Q(str);
        return this;
    }

    /* renamed from: p */
    public final long m4668p(C2579m c2579m) {
        int i;
        int i4;
        AbstractC2980h.m5136e("targetBytes", c2579m);
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            return -1L;
        }
        long j = this.f9314k;
        long j8 = 0;
        if (j < 0) {
            while (j > 0) {
                c2566f0 = c2566f0.f9298g;
                AbstractC2980h.m5133b(c2566f0);
                j -= c2566f0.f9294c - c2566f0.f9293b;
            }
            if (c2579m.mo4634d() == 2) {
                byte bMo4638i = c2579m.mo4638i(0);
                byte bMo4638i2 = c2579m.mo4638i(1);
                while (j < this.f9314k) {
                    byte[] bArr = c2566f0.f9292a;
                    i = (int) ((c2566f0.f9293b + j8) - j);
                    int i8 = c2566f0.f9294c;
                    while (i < i8) {
                        byte b7 = bArr[i];
                        if (b7 == bMo4638i || b7 == bMo4638i2) {
                            i4 = c2566f0.f9293b;
                        } else {
                            i++;
                        }
                    }
                    j8 = (c2566f0.f9294c - c2566f0.f9293b) + j;
                    c2566f0 = c2566f0.f9297f;
                    AbstractC2980h.m5133b(c2566f0);
                    j = j8;
                }
                return -1L;
            }
            byte[] bArrMo4637h = c2579m.mo4637h();
            while (j < this.f9314k) {
                byte[] bArr2 = c2566f0.f9292a;
                i = (int) ((c2566f0.f9293b + j8) - j);
                int i9 = c2566f0.f9294c;
                while (i < i9) {
                    byte b8 = bArr2[i];
                    for (byte b9 : bArrMo4637h) {
                        if (b8 == b9) {
                            i4 = c2566f0.f9293b;
                        }
                    }
                    i++;
                }
                j8 = (c2566f0.f9294c - c2566f0.f9293b) + j;
                c2566f0 = c2566f0.f9297f;
                AbstractC2980h.m5133b(c2566f0);
                j = j8;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j9 = (c2566f0.f9294c - c2566f0.f9293b) + j;
            if (j9 > 0) {
                break;
            }
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j = j9;
        }
        if (c2579m.mo4634d() == 2) {
            byte bMo4638i3 = c2579m.mo4638i(0);
            byte bMo4638i4 = c2579m.mo4638i(1);
            while (j < this.f9314k) {
                byte[] bArr3 = c2566f0.f9292a;
                i = (int) ((c2566f0.f9293b + j8) - j);
                int i10 = c2566f0.f9294c;
                while (i < i10) {
                    byte b10 = bArr3[i];
                    if (b10 == bMo4638i3 || b10 == bMo4638i4) {
                        i4 = c2566f0.f9293b;
                    } else {
                        i++;
                    }
                }
                j8 = (c2566f0.f9294c - c2566f0.f9293b) + j;
                c2566f0 = c2566f0.f9297f;
                AbstractC2980h.m5133b(c2566f0);
                j = j8;
            }
            return -1L;
        }
        byte[] bArrMo4637h2 = c2579m.mo4637h();
        while (j < this.f9314k) {
            byte[] bArr4 = c2566f0.f9292a;
            i = (int) ((c2566f0.f9293b + j8) - j);
            int i11 = c2566f0.f9294c;
            while (i < i11) {
                byte b11 = bArr4[i];
                for (byte b12 : bArrMo4637h2) {
                    if (b11 == b12) {
                        i4 = c2566f0.f9293b;
                    }
                }
                i++;
            }
            j8 = (c2566f0.f9294c - c2566f0.f9293b) + j;
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j = j8;
        }
        return -1L;
        return (i - i4) + j;
    }

    @Override // p189v7.InterfaceC2577l
    public final C2564e0 peek() {
        return AbstractC2557b.m4578c(new C2560c0(this));
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: q */
    public final String mo4619q(Charset charset) {
        AbstractC2980h.m5136e("charset", charset);
        return m4650F(this.f9314k, charset);
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2575k mo4601r(long j) {
        m4657M(j);
        return this;
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) {
        AbstractC2980h.m5136e("sink", c2573j);
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        long j8 = this.f9314k;
        if (j8 == 0) {
            return -1L;
        }
        if (j > j8) {
            j = j8;
        }
        c2573j.write(this, j);
        return j;
    }

    @Override // p189v7.InterfaceC2577l
    public final byte readByte() throws EOFException {
        if (this.f9314k == 0) {
            throw new EOFException();
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        int i = c2566f0.f9293b;
        int i4 = c2566f0.f9294c;
        int i8 = i + 1;
        byte b7 = c2566f0.f9292a[i];
        this.f9314k--;
        if (i8 != i4) {
            c2566f0.f9293b = i8;
            return b7;
        }
        this.f9313j = c2566f0.m4624a();
        AbstractC2568g0.m4628a(c2566f0);
        return b7;
    }

    @Override // p189v7.InterfaceC2577l
    public final void readFully(byte[] bArr) throws EOFException {
        AbstractC2980h.m5136e("sink", bArr);
        int i = 0;
        while (i < bArr.length) {
            int i4 = read(bArr, i, bArr.length - i);
            if (i4 == -1) {
                throw new EOFException();
            }
            i += i4;
        }
    }

    @Override // p189v7.InterfaceC2577l
    public final int readInt() throws EOFException {
        if (this.f9314k < 4) {
            throw new EOFException();
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        int i = c2566f0.f9293b;
        int i4 = c2566f0.f9294c;
        if (i4 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c2566f0.f9292a;
        int i8 = i + 3;
        int i9 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i10 = i + 4;
        int i11 = (bArr[i8] & 255) | i9;
        this.f9314k -= 4;
        if (i10 != i4) {
            c2566f0.f9293b = i10;
            return i11;
        }
        this.f9313j = c2566f0.m4624a();
        AbstractC2568g0.m4628a(c2566f0);
        return i11;
    }

    @Override // p189v7.InterfaceC2577l
    public final long readLong() throws EOFException {
        if (this.f9314k < 8) {
            throw new EOFException();
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        int i = c2566f0.f9293b;
        int i4 = c2566f0.f9294c;
        if (i4 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c2566f0.f9292a;
        int i8 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i9 = i + 8;
        long j8 = j | (bArr[i8] & 255);
        this.f9314k -= 8;
        if (i9 != i4) {
            c2566f0.f9293b = i9;
            return j8;
        }
        this.f9313j = c2566f0.m4624a();
        AbstractC2568g0.m4628a(c2566f0);
        return j8;
    }

    @Override // p189v7.InterfaceC2577l
    public final short readShort() throws EOFException {
        if (this.f9314k < 2) {
            throw new EOFException();
        }
        C2566f0 c2566f0 = this.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        int i = c2566f0.f9293b;
        int i4 = c2566f0.f9294c;
        if (i4 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c2566f0.f9292a;
        int i8 = i + 1;
        int i9 = (bArr[i] & 255) << 8;
        int i10 = i + 2;
        int i11 = (bArr[i8] & 255) | i9;
        this.f9314k -= 2;
        if (i10 == i4) {
            this.f9313j = c2566f0.m4624a();
            AbstractC2568g0.m4628a(c2566f0);
        } else {
            c2566f0.f9293b = i10;
        }
        return (short) i11;
    }

    @Override // p189v7.InterfaceC2577l
    public final boolean request(long j) {
        return this.f9314k >= j;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: s */
    public final C2579m mo4620s() {
        return mo4610d(this.f9314k);
    }

    @Override // p189v7.InterfaceC2577l
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C2566f0 c2566f0 = this.f9313j;
            if (c2566f0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c2566f0.f9294c - c2566f0.f9293b);
            long j8 = iMin;
            this.f9314k -= j8;
            j -= j8;
            int i = c2566f0.f9293b + iMin;
            c2566f0.f9293b = i;
            if (i == c2566f0.f9294c) {
                this.f9313j = c2566f0.m4624a();
                AbstractC2568g0.m4628a(c2566f0);
            }
        }
    }

    /* renamed from: t */
    public final boolean m4669t(long j, C2579m c2579m) {
        AbstractC2980h.m5136e("bytes", c2579m);
        int iMo4634d = c2579m.mo4634d();
        if (j >= 0 && iMo4634d >= 0 && this.f9314k - j >= iMo4634d && c2579m.mo4634d() >= iMo4634d) {
            for (int i = 0; i < iMo4634d; i++) {
                if (m4666g(i + j) == c2579m.mo4638i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return C2582n0.NONE;
    }

    public final String toString() {
        long j = this.f9314k;
        if (j <= 2147483647L) {
            return m4652H((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f9314k).toString());
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: u */
    public final long mo4621u(C2562d0 c2562d0) {
        long j = this.f9314k;
        if (j > 0) {
            c2562d0.write(this, j);
        }
        return j;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: v */
    public final String mo4622v() {
        return mo4617n(Long.MAX_VALUE);
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: w */
    public final /* bridge */ /* synthetic */ InterfaceC2575k mo4602w(C2579m c2579m) {
        m4654J(c2579m);
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final /* bridge */ /* synthetic */ InterfaceC2575k write(byte[] bArr) {
        m5288write(bArr);
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final /* bridge */ /* synthetic */ InterfaceC2575k writeByte(int i) {
        m4655K(i);
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final /* bridge */ /* synthetic */ InterfaceC2575k writeInt(int i) {
        m4658N(i);
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final /* bridge */ /* synthetic */ InterfaceC2575k writeShort(int i) {
        m4659O(i);
        return this;
    }

    /* renamed from: x */
    public final C2569h m4670x(C2569h c2569h) {
        AbstractC2980h.m5136e("unsafeCursor", c2569h);
        byte[] bArr = AbstractC2705a.f9822a;
        if (c2569h == AbstractC2557b.f9271a) {
            c2569h = new C2569h();
        }
        if (c2569h.f9302j != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c2569h.f9302j = this;
        c2569h.f9303k = true;
        return c2569h;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: y */
    public final void mo4623y(long j) throws EOFException {
        if (this.f9314k < j) {
            throw new EOFException();
        }
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ InterfaceC2575k mo4603z(long j) {
        m4656L(j);
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final /* bridge */ /* synthetic */ InterfaceC2575k write(byte[] bArr, int i, int i4) {
        m5289write(bArr, i, i4);
        return this;
    }

    @Override // p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) {
        C2566f0 c2566f0M4629b;
        AbstractC2980h.m5136e("source", c2573j);
        if (c2573j != this) {
            AbstractC2557b.m4580e(c2573j.f9314k, 0L, j);
            while (j > 0) {
                C2566f0 c2566f0 = c2573j.f9313j;
                AbstractC2980h.m5133b(c2566f0);
                int i = c2566f0.f9294c;
                C2566f0 c2566f02 = c2573j.f9313j;
                AbstractC2980h.m5133b(c2566f02);
                long j8 = i - c2566f02.f9293b;
                int i4 = 0;
                if (j < j8) {
                    C2566f0 c2566f03 = this.f9313j;
                    C2566f0 c2566f04 = c2566f03 != null ? c2566f03.f9298g : null;
                    if (c2566f04 != null && c2566f04.f9296e) {
                        if ((c2566f04.f9294c + j) - (c2566f04.f9295d ? 0 : c2566f04.f9293b) <= 8192) {
                            C2566f0 c2566f05 = c2573j.f9313j;
                            AbstractC2980h.m5133b(c2566f05);
                            c2566f05.m4627d(c2566f04, (int) j);
                            c2573j.f9314k -= j;
                            this.f9314k += j;
                            return;
                        }
                    }
                    C2566f0 c2566f06 = c2573j.f9313j;
                    AbstractC2980h.m5133b(c2566f06);
                    int i8 = (int) j;
                    if (i8 > 0 && i8 <= c2566f06.f9294c - c2566f06.f9293b) {
                        if (i8 >= 1024) {
                            c2566f0M4629b = c2566f06.m4626c();
                        } else {
                            c2566f0M4629b = AbstractC2568g0.m4629b();
                            byte[] bArr = c2566f06.f9292a;
                            byte[] bArr2 = c2566f0M4629b.f9292a;
                            int i9 = c2566f06.f9293b;
                            AbstractC1912g.m3726j0(0, i9, i9 + i8, bArr, bArr2);
                        }
                        c2566f0M4629b.f9294c = c2566f0M4629b.f9293b + i8;
                        c2566f06.f9293b += i8;
                        C2566f0 c2566f07 = c2566f06.f9298g;
                        AbstractC2980h.m5133b(c2566f07);
                        c2566f07.m4625b(c2566f0M4629b);
                        c2573j.f9313j = c2566f0M4629b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C2566f0 c2566f08 = c2573j.f9313j;
                AbstractC2980h.m5133b(c2566f08);
                long j9 = c2566f08.f9294c - c2566f08.f9293b;
                c2573j.f9313j = c2566f08.m4624a();
                C2566f0 c2566f09 = this.f9313j;
                if (c2566f09 == null) {
                    this.f9313j = c2566f08;
                    c2566f08.f9298g = c2566f08;
                    c2566f08.f9297f = c2566f08;
                } else {
                    C2566f0 c2566f010 = c2566f09.f9298g;
                    AbstractC2980h.m5133b(c2566f010);
                    c2566f010.m4625b(c2566f08);
                    C2566f0 c2566f011 = c2566f08.f9298g;
                    if (c2566f011 != c2566f08) {
                        AbstractC2980h.m5133b(c2566f011);
                        if (c2566f011.f9296e) {
                            int i10 = c2566f08.f9294c - c2566f08.f9293b;
                            C2566f0 c2566f012 = c2566f08.f9298g;
                            AbstractC2980h.m5133b(c2566f012);
                            int i11 = 8192 - c2566f012.f9294c;
                            C2566f0 c2566f013 = c2566f08.f9298g;
                            AbstractC2980h.m5133b(c2566f013);
                            if (!c2566f013.f9295d) {
                                C2566f0 c2566f014 = c2566f08.f9298g;
                                AbstractC2980h.m5133b(c2566f014);
                                i4 = c2566f014.f9293b;
                            }
                            if (i10 <= i11 + i4) {
                                C2566f0 c2566f015 = c2566f08.f9298g;
                                AbstractC2980h.m5133b(c2566f015);
                                c2566f08.m4627d(c2566f015, i10);
                                c2566f08.m4624a();
                                AbstractC2568g0.m4628a(c2566f08);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                c2573j.f9314k -= j9;
                this.f9314k += j9;
                j -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC2980h.m5136e("sink", byteBuffer);
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c2566f0.f9294c - c2566f0.f9293b);
        byteBuffer.put(c2566f0.f9292a, c2566f0.f9293b, iMin);
        int i = c2566f0.f9293b + iMin;
        c2566f0.f9293b = i;
        this.f9314k -= iMin;
        if (i == c2566f0.f9294c) {
            this.f9313j = c2566f0.m4624a();
            AbstractC2568g0.m4628a(c2566f0);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i4) {
        AbstractC2980h.m5136e("sink", bArr);
        AbstractC2557b.m4580e(bArr.length, i, i4);
        C2566f0 c2566f0 = this.f9313j;
        if (c2566f0 == null) {
            return -1;
        }
        int iMin = Math.min(i4, c2566f0.f9294c - c2566f0.f9293b);
        byte[] bArr2 = c2566f0.f9292a;
        int i8 = c2566f0.f9293b;
        AbstractC1912g.m3726j0(i, i8, i8 + iMin, bArr2, bArr);
        int i9 = c2566f0.f9293b + iMin;
        c2566f0.f9293b = i9;
        this.f9314k -= iMin;
        if (i9 == c2566f0.f9294c) {
            this.f9313j = c2566f0.m4624a();
            AbstractC2568g0.m4628a(c2566f0);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC2980h.m5136e("source", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C2566f0 c2566f0M4653I = m4653I(1);
            int iMin = Math.min(i, 8192 - c2566f0M4653I.f9294c);
            byteBuffer.get(c2566f0M4653I.f9292a, c2566f0M4653I.f9294c, iMin);
            i -= iMin;
            c2566f0M4653I.f9294c += iMin;
        }
        this.f9314k += iRemaining;
        return iRemaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m5288write(byte[] bArr) {
        AbstractC2980h.m5136e("source", bArr);
        m5289write(bArr, 0, bArr.length);
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m5289write(byte[] bArr, int i, int i4) {
        AbstractC2980h.m5136e("source", bArr);
        long j = i4;
        AbstractC2557b.m4580e(bArr.length, i, j);
        int i8 = i4 + i;
        while (i < i8) {
            C2566f0 c2566f0M4653I = m4653I(1);
            int iMin = Math.min(i8 - i, 8192 - c2566f0M4653I.f9294c);
            int i9 = i + iMin;
            AbstractC1912g.m3726j0(c2566f0M4653I.f9294c, i, i9, bArr, c2566f0M4653I.f9292a);
            c2566f0M4653I.f9294c += iMin;
            i = i9;
        }
        this.f9314k += j;
    }
}
