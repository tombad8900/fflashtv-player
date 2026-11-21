package p189v7;

import java.io.IOException;
import java.io.OutputStream;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.d */
/* loaded from: classes.dex */
public final class C2561d implements InterfaceC2572i0 {

    /* renamed from: j */
    public final /* synthetic */ int f9280j;

    /* renamed from: k */
    public final Object f9281k;

    /* renamed from: l */
    public final Object f9282l;

    public /* synthetic */ C2561d(Object obj, int i, Object obj2) {
        this.f9280j = i;
        this.f9281k = obj;
        this.f9282l = obj2;
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9280j) {
            case 0:
                C2565f c2565f = (C2565f) this.f9281k;
                InterfaceC2572i0 interfaceC2572i0 = (InterfaceC2572i0) this.f9282l;
                c2565f.enter();
                try {
                    interfaceC2572i0.close();
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
                ((OutputStream) this.f9281k).close();
                return;
        }
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f9280j) {
            case 0:
                C2565f c2565f = (C2565f) this.f9281k;
                InterfaceC2572i0 interfaceC2572i0 = (InterfaceC2572i0) this.f9282l;
                c2565f.enter();
                try {
                    interfaceC2572i0.flush();
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
                ((OutputStream) this.f9281k).flush();
                return;
        }
    }

    @Override // p189v7.InterfaceC2572i0
    public final C2582n0 timeout() {
        switch (this.f9280j) {
            case 0:
                return (C2565f) this.f9281k;
            default:
                return (C2582n0) this.f9282l;
        }
    }

    public final String toString() {
        switch (this.f9280j) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC2572i0) this.f9282l) + ')';
            default:
                return "sink(" + ((OutputStream) this.f9281k) + ')';
        }
    }

    @Override // p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) throws IOException {
        switch (this.f9280j) {
            case 0:
                AbstractC2980h.m5136e("source", c2573j);
                AbstractC2557b.m4580e(c2573j.f9314k, 0L, j);
                long j8 = j;
                while (true) {
                    long j9 = 0;
                    if (j8 <= 0) {
                        return;
                    }
                    C2566f0 c2566f0 = c2573j.f9313j;
                    AbstractC2980h.m5133b(c2566f0);
                    while (true) {
                        if (j9 < 65536) {
                            j9 += c2566f0.f9294c - c2566f0.f9293b;
                            if (j9 >= j8) {
                                j9 = j8;
                            } else {
                                c2566f0 = c2566f0.f9297f;
                                AbstractC2980h.m5133b(c2566f0);
                            }
                        }
                    }
                    C2565f c2565f = (C2565f) this.f9281k;
                    InterfaceC2572i0 interfaceC2572i0 = (InterfaceC2572i0) this.f9282l;
                    c2565f.enter();
                    try {
                        try {
                            interfaceC2572i0.write(c2573j, j9);
                            if (c2565f.exit()) {
                                throw c2565f.access$newTimeoutException(null);
                            }
                            j8 -= j9;
                        } catch (IOException e) {
                            if (!c2565f.exit()) {
                                throw e;
                            }
                            throw c2565f.access$newTimeoutException(e);
                        }
                    } catch (Throwable th) {
                        c2565f.exit();
                        throw th;
                    }
                }
            default:
                AbstractC2980h.m5136e("source", c2573j);
                AbstractC2557b.m4580e(c2573j.f9314k, 0L, j);
                while (j > 0) {
                    ((C2582n0) this.f9282l).throwIfReached();
                    C2566f0 c2566f02 = c2573j.f9313j;
                    AbstractC2980h.m5133b(c2566f02);
                    int iMin = (int) Math.min(j, c2566f02.f9294c - c2566f02.f9293b);
                    ((OutputStream) this.f9281k).write(c2566f02.f9292a, c2566f02.f9293b, iMin);
                    int i = c2566f02.f9293b + iMin;
                    c2566f02.f9293b = i;
                    long j10 = iMin;
                    j -= j10;
                    c2573j.f9314k -= j10;
                    if (i == c2566f02.f9294c) {
                        c2573j.f9313j = c2566f02.m4624a();
                        AbstractC2568g0.m4628a(c2566f02);
                    }
                }
                return;
        }
    }
}
