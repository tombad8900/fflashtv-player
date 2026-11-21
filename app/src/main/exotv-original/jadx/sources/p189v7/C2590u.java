package p189v7;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.u */
/* loaded from: classes.dex */
public final class C2590u implements InterfaceC2576k0 {

    /* renamed from: j */
    public final C2564e0 f9337j;

    /* renamed from: k */
    public final Inflater f9338k;

    /* renamed from: l */
    public int f9339l;

    /* renamed from: m */
    public boolean f9340m;

    public C2590u(C2564e0 c2564e0, Inflater inflater) {
        this.f9337j = c2564e0;
        this.f9338k = inflater;
    }

    /* renamed from: b */
    public final long m4682b(C2573j c2573j, long j) throws DataFormatException, IOException {
        Inflater inflater = this.f9338k;
        AbstractC2980h.m5136e("sink", c2573j);
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        if (this.f9340m) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C2566f0 c2566f0M4653I = c2573j.m4653I(1);
                int iMin = (int) Math.min(j, 8192 - c2566f0M4653I.f9294c);
                boolean zNeedsInput = inflater.needsInput();
                C2564e0 c2564e0 = this.f9337j;
                if (zNeedsInput && !c2564e0.mo4614j()) {
                    C2566f0 c2566f0 = c2564e0.f9290k.f9313j;
                    AbstractC2980h.m5133b(c2566f0);
                    int i = c2566f0.f9294c;
                    int i4 = c2566f0.f9293b;
                    int i8 = i - i4;
                    this.f9339l = i8;
                    inflater.setInput(c2566f0.f9292a, i4, i8);
                }
                int iInflate = inflater.inflate(c2566f0M4653I.f9292a, c2566f0M4653I.f9294c, iMin);
                int i9 = this.f9339l;
                if (i9 != 0) {
                    int remaining = i9 - inflater.getRemaining();
                    this.f9339l -= remaining;
                    c2564e0.skip(remaining);
                }
                if (iInflate > 0) {
                    c2566f0M4653I.f9294c += iInflate;
                    long j8 = iInflate;
                    c2573j.f9314k += j8;
                    return j8;
                }
                if (c2566f0M4653I.f9293b == c2566f0M4653I.f9294c) {
                    c2573j.f9313j = c2566f0M4653I.m4624a();
                    AbstractC2568g0.m4628a(c2566f0M4653I);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9340m) {
            return;
        }
        this.f9338k.end();
        this.f9340m = true;
        this.f9337j.close();
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) throws DataFormatException, IOException {
        AbstractC2980h.m5136e("sink", c2573j);
        do {
            long jM4682b = m4682b(c2573j, j);
            if (jM4682b > 0) {
                return jM4682b;
            }
            Inflater inflater = this.f9338k;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f9337j.mo4614j());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return this.f9337j.f9289j.timeout();
    }
}
