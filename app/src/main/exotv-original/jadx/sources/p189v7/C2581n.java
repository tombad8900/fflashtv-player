package p189v7;

import java.io.IOException;
import java.util.zip.Deflater;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.n */
/* loaded from: classes.dex */
public final class C2581n implements InterfaceC2572i0 {

    /* renamed from: j */
    public final C2562d0 f9320j;

    /* renamed from: k */
    public final Deflater f9321k;

    /* renamed from: l */
    public boolean f9322l;

    public C2581n(C2573j c2573j, Deflater deflater) {
        this.f9320j = AbstractC2557b.m4577b(c2573j);
        this.f9321k = deflater;
    }

    /* renamed from: b */
    public final void m4676b(boolean z7) throws IOException {
        C2566f0 c2566f0M4653I;
        int iDeflate;
        C2562d0 c2562d0 = this.f9320j;
        C2573j c2573j = c2562d0.f9284k;
        while (true) {
            c2566f0M4653I = c2573j.m4653I(1);
            byte[] bArr = c2566f0M4653I.f9292a;
            Deflater deflater = this.f9321k;
            if (z7) {
                try {
                    int i = c2566f0M4653I.f9294c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i4 = c2566f0M4653I.f9294c;
                iDeflate = deflater.deflate(bArr, i4, 8192 - i4);
            }
            if (iDeflate > 0) {
                c2566f0M4653I.f9294c += iDeflate;
                c2573j.f9314k += iDeflate;
                c2562d0.mo4599l();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c2566f0M4653I.f9293b == c2566f0M4653I.f9294c) {
            c2573j.f9313j = c2566f0M4653I.m4624a();
            AbstractC2568g0.m4628a(c2566f0M4653I);
        }
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f9321k;
        if (this.f9322l) {
            return;
        }
        try {
            deflater.finish();
            m4676b(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f9320j.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f9322l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() throws IOException {
        m4676b(true);
        this.f9320j.flush();
    }

    @Override // p189v7.InterfaceC2572i0
    public final C2582n0 timeout() {
        return this.f9320j.f9283j.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f9320j + ')';
    }

    @Override // p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) throws IOException {
        AbstractC2980h.m5136e("source", c2573j);
        AbstractC2557b.m4580e(c2573j.f9314k, 0L, j);
        while (j > 0) {
            C2566f0 c2566f0 = c2573j.f9313j;
            AbstractC2980h.m5133b(c2566f0);
            int iMin = (int) Math.min(j, c2566f0.f9294c - c2566f0.f9293b);
            this.f9321k.setInput(c2566f0.f9292a, c2566f0.f9293b, iMin);
            m4676b(false);
            long j8 = iMin;
            c2573j.f9314k -= j8;
            int i = c2566f0.f9293b + iMin;
            c2566f0.f9293b = i;
            if (i == c2566f0.f9294c) {
                c2573j.f9313j = c2566f0.m4624a();
                AbstractC2568g0.m4628a(c2566f0);
            }
            j -= j8;
        }
    }
}
