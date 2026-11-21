package p189v7;

import java.io.IOException;
import java.nio.ByteBuffer;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.d0 */
/* loaded from: classes.dex */
public final class C2562d0 implements InterfaceC2575k {

    /* renamed from: j */
    public final InterfaceC2572i0 f9283j;

    /* renamed from: k */
    public final C2573j f9284k;

    /* renamed from: l */
    public boolean f9285l;

    public C2562d0(InterfaceC2572i0 interfaceC2572i0) {
        AbstractC2980h.m5136e("sink", interfaceC2572i0);
        this.f9283j = interfaceC2572i0;
        this.f9284k = new C2573j();
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: a */
    public final C2573j mo4596a() {
        return this.f9284k;
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC2572i0 interfaceC2572i0 = this.f9283j;
        if (this.f9285l) {
            return;
        }
        try {
            C2573j c2573j = this.f9284k;
            long j = c2573j.f9314k;
            if (j > 0) {
                interfaceC2572i0.write(c2573j, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC2572i0.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9285l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: e */
    public final InterfaceC2575k mo4597e() {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        C2573j c2573j = this.f9284k;
        long j = c2573j.f9314k;
        if (j > 0) {
            this.f9283j.write(c2573j, j);
        }
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: f */
    public final long mo4598f(InterfaceC2576k0 interfaceC2576k0) throws IOException {
        long j = 0;
        while (true) {
            long j8 = ((C2563e) interfaceC2576k0).read(this.f9284k, 8192L);
            if (j8 == -1) {
                return j;
            }
            j += j8;
            mo4599l();
        }
    }

    @Override // p189v7.InterfaceC2575k, p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        C2573j c2573j = this.f9284k;
        long j = c2573j.f9314k;
        InterfaceC2572i0 interfaceC2572i0 = this.f9283j;
        if (j > 0) {
            interfaceC2572i0.write(c2573j, j);
        }
        interfaceC2572i0.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9285l;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: l */
    public final InterfaceC2575k mo4599l() {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        C2573j c2573j = this.f9284k;
        long jM4664b = c2573j.m4664b();
        if (jM4664b > 0) {
            this.f9283j.write(c2573j, jM4664b);
        }
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: o */
    public final InterfaceC2575k mo4600o(String str) {
        AbstractC2980h.m5136e("string", str);
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4661Q(str);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: r */
    public final InterfaceC2575k mo4601r(long j) {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4657M(j);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2572i0
    public final C2582n0 timeout() {
        return this.f9283j.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f9283j + ')';
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: w */
    public final InterfaceC2575k mo4602w(C2579m c2579m) {
        AbstractC2980h.m5136e("byteString", c2579m);
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4654J(c2579m);
        mo4599l();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC2980h.m5136e("source", byteBuffer);
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f9284k.write(byteBuffer);
        mo4599l();
        return iWrite;
    }

    @Override // p189v7.InterfaceC2575k
    public final InterfaceC2575k writeByte(int i) {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4655K(i);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final InterfaceC2575k writeInt(int i) {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4658N(i);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    public final InterfaceC2575k writeShort(int i) {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4659O(i);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2575k
    /* renamed from: z */
    public final InterfaceC2575k mo4603z(long j) {
        if (this.f9285l) {
            throw new IllegalStateException("closed");
        }
        this.f9284k.m4656L(j);
        mo4599l();
        return this;
    }

    @Override // p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) {
        AbstractC2980h.m5136e("source", c2573j);
        if (!this.f9285l) {
            this.f9284k.write(c2573j, j);
            mo4599l();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p189v7.InterfaceC2575k
    public final InterfaceC2575k write(byte[] bArr) {
        if (!this.f9285l) {
            this.f9284k.m5288write(bArr);
            mo4599l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p189v7.InterfaceC2575k
    public final InterfaceC2575k write(byte[] bArr, int i, int i4) {
        AbstractC2980h.m5136e("source", bArr);
        if (!this.f9285l) {
            this.f9284k.m5289write(bArr, i, i4);
            mo4599l();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
