package p106m1;

import java.util.ArrayDeque;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m1.j */
/* loaded from: classes.dex */
public abstract class AbstractC1875j implements InterfaceC1869d {
    private int availableInputBufferCount;
    private final C1872g[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final AbstractC1873h[] availableOutputBuffers;
    private final Thread decodeThread;
    private C1872g dequeuedInputBuffer;
    private AbstractC1870e exception;
    private boolean flushed;
    private final Object lock = new Object();
    private long outputStartTimeUs = -9223372036854775807L;
    private final ArrayDeque<C1872g> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<AbstractC1873h> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public AbstractC1875j(C1872g[] c1872gArr, AbstractC1873h[] abstractC1873hArr) {
        this.availableInputBuffers = c1872gArr;
        this.availableInputBufferCount = c1872gArr.length;
        for (int i = 0; i < this.availableInputBufferCount; i++) {
            this.availableInputBuffers[i] = createInputBuffer();
        }
        this.availableOutputBuffers = abstractC1873hArr;
        this.availableOutputBufferCount = abstractC1873hArr.length;
        for (int i4 = 0; i4 < this.availableOutputBufferCount; i4++) {
            this.availableOutputBuffers[i4] = createOutputBuffer();
        }
        C1874i c1874i = new C1874i(this);
        this.decodeThread = c1874i;
        c1874i.start();
    }

    public static void access$000(AbstractC1875j abstractC1875j) {
        abstractC1875j.getClass();
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC1875j.m3658a());
    }

    /* renamed from: a */
    public final boolean m3658a() {
        AbstractC1870e abstractC1870eCreateUnexpectedDecodeException;
        synchronized (this.lock) {
            while (!this.released) {
                try {
                    if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                        break;
                    }
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            C1872g c1872gRemoveFirst = this.queuedInputBuffers.removeFirst();
            AbstractC1873h[] abstractC1873hArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i;
            AbstractC1873h abstractC1873h = abstractC1873hArr[i];
            boolean z7 = this.flushed;
            this.flushed = false;
            if (c1872gRemoveFirst.isEndOfStream()) {
                abstractC1873h.addFlag(4);
            } else {
                abstractC1873h.timeUs = c1872gRemoveFirst.timeUs;
                if (c1872gRemoveFirst.isFirstSample()) {
                    abstractC1873h.addFlag(134217728);
                }
                if (!isAtLeastOutputStartTimeUs(c1872gRemoveFirst.timeUs)) {
                    abstractC1873h.shouldBeSkipped = true;
                }
                try {
                    abstractC1870eCreateUnexpectedDecodeException = decode(c1872gRemoveFirst, abstractC1873h, z7);
                } catch (OutOfMemoryError e) {
                    abstractC1870eCreateUnexpectedDecodeException = createUnexpectedDecodeException(e);
                } catch (RuntimeException e8) {
                    abstractC1870eCreateUnexpectedDecodeException = createUnexpectedDecodeException(e8);
                }
                if (abstractC1870eCreateUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = abstractC1870eCreateUnexpectedDecodeException;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        abstractC1873h.release();
                    } else if (abstractC1873h.shouldBeSkipped) {
                        this.skippedOutputBufferCount++;
                        abstractC1873h.release();
                    } else {
                        abstractC1873h.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(abstractC1873h);
                    }
                    c1872gRemoveFirst.clear();
                    C1872g[] c1872gArr = this.availableInputBuffers;
                    int i4 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i4 + 1;
                    c1872gArr[i4] = c1872gRemoveFirst;
                } finally {
                }
            }
            return true;
        }
    }

    public abstract C1872g createInputBuffer();

    public abstract AbstractC1873h createOutputBuffer();

    public abstract AbstractC1870e createUnexpectedDecodeException(Throwable th);

    public abstract AbstractC1870e decode(C1872g c1872g, AbstractC1873h abstractC1873h, boolean z7);

    @Override // p106m1.InterfaceC1869d
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                C1872g c1872g = this.dequeuedInputBuffer;
                if (c1872g != null) {
                    c1872g.clear();
                    C1872g[] c1872gArr = this.availableInputBuffers;
                    int i = this.availableInputBufferCount;
                    this.availableInputBufferCount = i + 1;
                    c1872gArr[i] = c1872g;
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    C1872g c1872gRemoveFirst = this.queuedInputBuffers.removeFirst();
                    c1872gRemoveFirst.clear();
                    C1872g[] c1872gArr2 = this.availableInputBuffers;
                    int i4 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i4 + 1;
                    c1872gArr2[i4] = c1872gRemoveFirst;
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isAtLeastOutputStartTimeUs(long j) {
        boolean z7;
        synchronized (this.lock) {
            long j8 = this.outputStartTimeUs;
            z7 = j8 == -9223372036854775807L || j >= j8;
        }
        return z7;
    }

    @Override // p106m1.InterfaceC1869d
    public void release() throws InterruptedException {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(AbstractC1873h abstractC1873h) {
        synchronized (this.lock) {
            abstractC1873h.clear();
            AbstractC1873h[] abstractC1873hArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount;
            this.availableOutputBufferCount = i + 1;
            abstractC1873hArr[i] = abstractC1873h;
            if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                this.lock.notify();
            }
        }
    }

    public final void setInitialInputBufferSize(int i) {
        AbstractC1101a.m2359j(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (C1872g c1872g : this.availableInputBuffers) {
            c1872g.ensureSpaceForWrite(i);
        }
    }

    @Override // p106m1.InterfaceC1869d
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.lock) {
            try {
                AbstractC1101a.m2359j(this.availableInputBufferCount == this.availableInputBuffers.length || this.flushed);
                this.outputStartTimeUs = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p106m1.InterfaceC1869d
    public final C1872g dequeueInputBuffer() {
        C1872g c1872g;
        synchronized (this.lock) {
            try {
                AbstractC1870e abstractC1870e = this.exception;
                if (abstractC1870e != null) {
                    throw abstractC1870e;
                }
                AbstractC1101a.m2359j(this.dequeuedInputBuffer == null);
                int i = this.availableInputBufferCount;
                if (i == 0) {
                    c1872g = null;
                } else {
                    C1872g[] c1872gArr = this.availableInputBuffers;
                    int i4 = i - 1;
                    this.availableInputBufferCount = i4;
                    c1872g = c1872gArr[i4];
                }
                this.dequeuedInputBuffer = c1872g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1872g;
    }

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public final AbstractC1873h dequeueOutputBuffer() {
        synchronized (this.lock) {
            try {
                AbstractC1870e abstractC1870e = this.exception;
                if (abstractC1870e != null) {
                    throw abstractC1870e;
                }
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p106m1.InterfaceC1869d
    public final void queueInputBuffer(C1872g c1872g) {
        synchronized (this.lock) {
            try {
                AbstractC1870e abstractC1870e = this.exception;
                if (abstractC1870e != null) {
                    throw abstractC1870e;
                }
                AbstractC1101a.m2353d(c1872g == this.dequeuedInputBuffer);
                this.queuedInputBuffers.addLast(c1872g);
                if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                    this.lock.notify();
                }
                this.dequeuedInputBuffer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
