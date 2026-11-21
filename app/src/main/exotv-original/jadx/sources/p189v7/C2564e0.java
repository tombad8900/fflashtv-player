package p189v7;

import android.support.v4.media.session.AbstractC0120b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1199a;
import p198w7.AbstractC2705a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.e0 */
/* loaded from: classes.dex */
public final class C2564e0 implements InterfaceC2577l {

    /* renamed from: j */
    public final InterfaceC2576k0 f9289j;

    /* renamed from: k */
    public final C2573j f9290k;

    /* renamed from: l */
    public boolean f9291l;

    public C2564e0(InterfaceC2576k0 interfaceC2576k0) {
        AbstractC2980h.m5136e("source", interfaceC2576k0);
        this.f9289j = interfaceC2576k0;
        this.f9290k = new C2573j();
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: A */
    public final void mo4604A(C2573j c2573j, long j) throws EOFException {
        C2573j c2573j2 = this.f9290k;
        AbstractC2980h.m5136e("sink", c2573j);
        try {
            mo4623y(j);
            c2573j2.mo4604A(c2573j, j);
        } catch (EOFException e) {
            c2573j.mo4598f(c2573j2);
            throw e;
        }
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: B */
    public final long mo4605B() {
        C2573j c2573j;
        byte bM4666g;
        mo4623y(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            boolean zRequest = request(i4);
            c2573j = this.f9290k;
            if (!zRequest) {
                break;
            }
            bM4666g = c2573j.m4666g(i);
            if ((bM4666g < 48 || bM4666g > 57) && ((bM4666g < 97 || bM4666g > 102) && (bM4666g < 65 || bM4666g > 70))) {
                break;
            }
            i = i4;
        }
        if (i == 0) {
            AbstractC0120b.m411g(16);
            String string = Integer.toString(bM4666g, 16);
            AbstractC2980h.m5135d("toString(...)", string);
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c2573j.mo4605B();
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: C */
    public final InputStream mo4606C() {
        return new C2571i(this, 1);
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: a */
    public final C2573j mo4607a() {
        return this.f9290k;
    }

    /* renamed from: b */
    public final long m4608b(byte b7, long j, long j8) {
        if (this.f9291l) {
            throw new IllegalStateException("closed");
        }
        if (0 > j8) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("fromIndex=0 toIndex=", j8).toString());
        }
        long jMax = 0;
        while (jMax < j8) {
            C2573j c2573j = this.f9290k;
            byte b8 = b7;
            long j9 = j8;
            long jM4667k = c2573j.m4667k(b8, jMax, j9);
            if (jM4667k != -1) {
                return jM4667k;
            }
            long j10 = c2573j.f9314k;
            if (j10 >= j9 || this.f9289j.read(c2573j, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j10);
            b7 = b8;
            j8 = j9;
        }
        return -1L;
    }

    /* renamed from: c */
    public final int m4609c() {
        mo4623y(4L);
        int i = this.f9290k.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f9291l) {
            return;
        }
        this.f9291l = true;
        this.f9289j.close();
        C2573j c2573j = this.f9290k;
        c2573j.skip(c2573j.f9314k);
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: d */
    public final C2579m mo4610d(long j) {
        mo4623y(j);
        return this.f9290k.mo4610d(j);
    }

    /* renamed from: g */
    public final long m4611g() throws EOFException {
        mo4623y(8L);
        long j = this.f9290k.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: h */
    public final int mo4612h(C2595z c2595z) throws EOFException {
        AbstractC2980h.m5136e("options", c2595z);
        if (this.f9291l) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C2573j c2573j = this.f9290k;
            int iM4760b = AbstractC2705a.m4760b(c2573j, c2595z, true);
            if (iM4760b != -2) {
                if (iM4760b != -1) {
                    c2573j.skip(c2595z.f9346j[iM4760b].mo4634d());
                    return iM4760b;
                }
            } else if (this.f9289j.read(c2573j, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: i */
    public final byte[] mo4613i() {
        InterfaceC2576k0 interfaceC2576k0 = this.f9289j;
        C2573j c2573j = this.f9290k;
        c2573j.mo4598f(interfaceC2576k0);
        return c2573j.m4648D(c2573j.f9314k);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9291l;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: j */
    public final boolean mo4614j() {
        if (this.f9291l) {
            throw new IllegalStateException("closed");
        }
        C2573j c2573j = this.f9290k;
        return c2573j.mo4614j() && this.f9289j.read(c2573j, 8192L) == -1;
    }

    /* renamed from: k */
    public final short m4615k() {
        mo4623y(2L);
        return this.f9290k.m4649E();
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: m */
    public final long mo4616m() {
        C2573j c2573j;
        byte bM4666g;
        mo4623y(1L);
        long j = 0;
        while (true) {
            long j8 = j + 1;
            boolean zRequest = request(j8);
            c2573j = this.f9290k;
            if (!zRequest) {
                break;
            }
            bM4666g = c2573j.m4666g(j);
            if ((bM4666g < 48 || bM4666g > 57) && !(j == 0 && bM4666g == 45)) {
                break;
            }
            j = j8;
        }
        if (j == 0) {
            AbstractC0120b.m411g(16);
            String string = Integer.toString(bM4666g, 16);
            AbstractC2980h.m5135d("toString(...)", string);
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return c2573j.mo4616m();
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: n */
    public final String mo4617n(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("limit < 0: ", j).toString());
        }
        long j8 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM4608b = m4608b((byte) 10, 0L, j8);
        C2573j c2573j = this.f9290k;
        if (jM4608b != -1) {
            return AbstractC2705a.m4759a(c2573j, jM4608b);
        }
        if (j8 < Long.MAX_VALUE && request(j8) && c2573j.m4666g(j8 - 1) == 13 && request(j8 + 1) && c2573j.m4666g(j8) == 10) {
            return AbstractC2705a.m4759a(c2573j, j8);
        }
        C2573j c2573j2 = new C2573j();
        c2573j.m4665c(c2573j2, 0L, Math.min(32, c2573j.f9314k));
        throw new EOFException("\\n not found: limit=" + Math.min(c2573j.f9314k, j) + " content=" + c2573j2.mo4610d(c2573j2.f9314k).mo4635e() + '\u2026');
    }

    /* renamed from: p */
    public final String m4618p(long j) {
        mo4623y(j);
        C2573j c2573j = this.f9290k;
        c2573j.getClass();
        return c2573j.m4650F(j, AbstractC1199a.f5077a);
    }

    @Override // p189v7.InterfaceC2577l
    public final C2564e0 peek() {
        return AbstractC2557b.m4578c(new C2560c0(this));
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: q */
    public final String mo4619q(Charset charset) {
        AbstractC2980h.m5136e("charset", charset);
        InterfaceC2576k0 interfaceC2576k0 = this.f9289j;
        C2573j c2573j = this.f9290k;
        c2573j.mo4598f(interfaceC2576k0);
        return c2573j.mo4619q(charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC2980h.m5136e("sink", byteBuffer);
        C2573j c2573j = this.f9290k;
        if (c2573j.f9314k == 0 && this.f9289j.read(c2573j, 8192L) == -1) {
            return -1;
        }
        return c2573j.read(byteBuffer);
    }

    @Override // p189v7.InterfaceC2577l
    public final byte readByte() {
        mo4623y(1L);
        return this.f9290k.readByte();
    }

    @Override // p189v7.InterfaceC2577l
    public final void readFully(byte[] bArr) throws EOFException {
        C2573j c2573j = this.f9290k;
        AbstractC2980h.m5136e("sink", bArr);
        try {
            mo4623y(bArr.length);
            c2573j.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c2573j.f9314k;
                if (j <= 0) {
                    throw e;
                }
                int i4 = c2573j.read(bArr, i, (int) j);
                if (i4 == -1) {
                    throw new AssertionError();
                }
                i += i4;
            }
        }
    }

    @Override // p189v7.InterfaceC2577l
    public final int readInt() {
        mo4623y(4L);
        return this.f9290k.readInt();
    }

    @Override // p189v7.InterfaceC2577l
    public final long readLong() {
        mo4623y(8L);
        return this.f9290k.readLong();
    }

    @Override // p189v7.InterfaceC2577l
    public final short readShort() {
        mo4623y(2L);
        return this.f9290k.readShort();
    }

    @Override // p189v7.InterfaceC2577l
    public final boolean request(long j) {
        C2573j c2573j;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        if (this.f9291l) {
            throw new IllegalStateException("closed");
        }
        do {
            c2573j = this.f9290k;
            if (c2573j.f9314k >= j) {
                return true;
            }
        } while (this.f9289j.read(c2573j, 8192L) != -1);
        return false;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: s */
    public final C2579m mo4620s() {
        InterfaceC2576k0 interfaceC2576k0 = this.f9289j;
        C2573j c2573j = this.f9290k;
        c2573j.mo4598f(interfaceC2576k0);
        return c2573j.mo4610d(c2573j.f9314k);
    }

    @Override // p189v7.InterfaceC2577l
    public final void skip(long j) {
        if (this.f9291l) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C2573j c2573j = this.f9290k;
            if (c2573j.f9314k == 0 && this.f9289j.read(c2573j, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c2573j.f9314k);
            c2573j.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return this.f9289j.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f9289j + ')';
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: u */
    public final long mo4621u(C2562d0 c2562d0) {
        C2573j c2573j;
        long j = 0;
        while (true) {
            InterfaceC2576k0 interfaceC2576k0 = this.f9289j;
            c2573j = this.f9290k;
            if (interfaceC2576k0.read(c2573j, 8192L) == -1) {
                break;
            }
            long jM4664b = c2573j.m4664b();
            if (jM4664b > 0) {
                j += jM4664b;
                c2562d0.write(c2573j, jM4664b);
            }
        }
        long j8 = c2573j.f9314k;
        if (j8 <= 0) {
            return j;
        }
        long j9 = j + j8;
        c2562d0.write(c2573j, j8);
        return j9;
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: v */
    public final String mo4622v() {
        return mo4617n(Long.MAX_VALUE);
    }

    @Override // p189v7.InterfaceC2577l
    /* renamed from: y */
    public final void mo4623y(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) {
        AbstractC2980h.m5136e("sink", c2573j);
        if (j >= 0) {
            if (!this.f9291l) {
                C2573j c2573j2 = this.f9290k;
                if (c2573j2.f9314k == 0 && this.f9289j.read(c2573j2, 8192L) == -1) {
                    return -1L;
                }
                return c2573j2.read(c2573j, Math.min(j, c2573j2.f9314k));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
    }
}
