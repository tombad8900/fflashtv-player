package p189v7;

import java.io.IOException;
import java.io.InputStream;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.e */
/* loaded from: classes.dex */
public final class C2563e implements InterfaceC2576k0 {

    /* renamed from: j */
    public final /* synthetic */ int f9286j = 1;

    /* renamed from: k */
    public final Object f9287k;

    /* renamed from: l */
    public final Object f9288l;

    public C2563e(InputStream inputStream, C2582n0 c2582n0) {
        AbstractC2980h.m5136e("input", inputStream);
        AbstractC2980h.m5136e("timeout", c2582n0);
        this.f9287k = inputStream;
        this.f9288l = c2582n0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f9286j) {
            case 0:
                C2565f c2565f = (C2565f) this.f9287k;
                InterfaceC2576k0 interfaceC2576k0 = (InterfaceC2576k0) this.f9288l;
                c2565f.enter();
                try {
                    interfaceC2576k0.close();
                    if (c2565f.exit()) {
                        throw c2565f.access$newTimeoutException(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!c2565f.exit()) {
                        throw e;
                    }
                    throw c2565f.access$newTimeoutException(e);
                } finally {
                    c2565f.exit();
                }
            default:
                ((InputStream) this.f9287k).close();
                return;
        }
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) throws IOException {
        switch (this.f9286j) {
            case 0:
                AbstractC2980h.m5136e("sink", c2573j);
                C2565f c2565f = (C2565f) this.f9287k;
                InterfaceC2576k0 interfaceC2576k0 = (InterfaceC2576k0) this.f9288l;
                c2565f.enter();
                try {
                    long j8 = interfaceC2576k0.read(c2573j, j);
                    if (c2565f.exit()) {
                        throw c2565f.access$newTimeoutException(null);
                    }
                    return j8;
                } catch (IOException e) {
                    if (c2565f.exit()) {
                        throw c2565f.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    c2565f.exit();
                }
            default:
                AbstractC2980h.m5136e("sink", c2573j);
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
                }
                try {
                    ((C2582n0) this.f9288l).throwIfReached();
                    C2566f0 c2566f0M4653I = c2573j.m4653I(1);
                    int i = ((InputStream) this.f9287k).read(c2566f0M4653I.f9292a, c2566f0M4653I.f9294c, (int) Math.min(j, 8192 - c2566f0M4653I.f9294c));
                    if (i == -1) {
                        if (c2566f0M4653I.f9293b == c2566f0M4653I.f9294c) {
                            c2573j.f9313j = c2566f0M4653I.m4624a();
                            AbstractC2568g0.m4628a(c2566f0M4653I);
                        }
                        return -1L;
                    }
                    c2566f0M4653I.f9294c += i;
                    long j9 = i;
                    c2573j.f9314k += j9;
                    return j9;
                } catch (AssertionError e8) {
                    if (AbstractC2557b.m4581f(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        switch (this.f9286j) {
            case 0:
                return (C2565f) this.f9287k;
            default:
                return (C2582n0) this.f9288l;
        }
    }

    public final String toString() {
        switch (this.f9286j) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC2576k0) this.f9288l) + ')';
            default:
                return "source(" + ((InputStream) this.f9287k) + ')';
        }
    }

    public C2563e(C2565f c2565f, InterfaceC2576k0 interfaceC2576k0) {
        this.f9287k = c2565f;
        this.f9288l = interfaceC2576k0;
    }
}
