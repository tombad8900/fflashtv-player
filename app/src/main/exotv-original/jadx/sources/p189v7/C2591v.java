package p189v7;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.v */
/* loaded from: classes.dex */
public final class C2591v implements Closeable {

    /* renamed from: j */
    public boolean f9341j;

    /* renamed from: k */
    public int f9342k;

    /* renamed from: l */
    public final ReentrantLock f9343l = new ReentrantLock();

    /* renamed from: m */
    public final RandomAccessFile f9344m;

    public C2591v(RandomAccessFile randomAccessFile) {
        this.f9344m = randomAccessFile;
    }

    /* renamed from: b */
    public final C2583o m4683b(long j) {
        ReentrantLock reentrantLock = this.f9343l;
        reentrantLock.lock();
        try {
            if (this.f9341j) {
                throw new IllegalStateException("closed");
            }
            this.f9342k++;
            reentrantLock.unlock();
            return new C2583o(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f9343l;
        reentrantLock.lock();
        try {
            if (this.f9341j) {
                return;
            }
            this.f9341j = true;
            if (this.f9342k != 0) {
                return;
            }
            synchronized (this) {
                this.f9344m.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f9343l;
        reentrantLock.lock();
        try {
            if (this.f9341j) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f9344m.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
