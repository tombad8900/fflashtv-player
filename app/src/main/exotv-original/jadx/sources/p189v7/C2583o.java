package p189v7;

import java.util.concurrent.locks.ReentrantLock;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.o */
/* loaded from: classes.dex */
public final class C2583o implements InterfaceC2576k0 {

    /* renamed from: j */
    public final C2591v f9323j;

    /* renamed from: k */
    public long f9324k;

    /* renamed from: l */
    public boolean f9325l;

    public C2583o(C2591v c2591v, long j) {
        this.f9323j = c2591v;
        this.f9324k = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2591v c2591v = this.f9323j;
        if (this.f9325l) {
            return;
        }
        this.f9325l = true;
        ReentrantLock reentrantLock = c2591v.f9343l;
        reentrantLock.lock();
        try {
            int i = c2591v.f9342k - 1;
            c2591v.f9342k = i;
            if (i == 0) {
                if (c2591v.f9341j) {
                    synchronized (c2591v) {
                        c2591v.f9344m.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) {
        long j8;
        long j9;
        int i;
        AbstractC2980h.m5136e("sink", c2573j);
        if (this.f9325l) {
            throw new IllegalStateException("closed");
        }
        C2591v c2591v = this.f9323j;
        long j10 = this.f9324k;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        long j11 = j + j10;
        long j12 = j10;
        while (true) {
            if (j12 >= j11) {
                j8 = -1;
                break;
            }
            C2566f0 c2566f0M4653I = c2573j.m4653I(1);
            byte[] bArr = c2566f0M4653I.f9292a;
            int i4 = c2566f0M4653I.f9294c;
            j8 = -1;
            int iMin = (int) Math.min(j11 - j12, 8192 - i4);
            synchronized (c2591v) {
                AbstractC2980h.m5136e("array", bArr);
                c2591v.f9344m.seek(j12);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i8 = c2591v.f9344m.read(bArr, i4, iMin - i);
                    if (i8 != -1) {
                        i += i8;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (c2566f0M4653I.f9293b == c2566f0M4653I.f9294c) {
                    c2573j.f9313j = c2566f0M4653I.m4624a();
                    AbstractC2568g0.m4628a(c2566f0M4653I);
                }
                if (j10 == j12) {
                    j9 = -1;
                }
            } else {
                c2566f0M4653I.f9294c += i;
                long j13 = i;
                j12 += j13;
                c2573j.f9314k += j13;
            }
        }
        j9 = j12 - j10;
        if (j9 != j8) {
            this.f9324k += j9;
        }
        return j9;
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return C2582n0.NONE;
    }
}
