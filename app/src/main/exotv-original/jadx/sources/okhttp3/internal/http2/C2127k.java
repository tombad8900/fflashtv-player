package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C2120d;
import p002a1.AbstractC0008a1;
import p147q7.AbstractC2278c;
import p189v7.C2573j;
import p189v7.InterfaceC2575k;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.k */
/* loaded from: classes.dex */
public final class C2127k implements Closeable {
    public static final a Companion = new a(null);
    private static final Logger logger = Logger.getLogger(C2121e.class.getName());
    private final boolean client;
    private boolean closed;
    private final C2573j hpackBuffer;
    private final C2120d.b hpackWriter;
    private int maxFrameSize;
    private final InterfaceC2575k sink;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    public C2127k(InterfaceC2575k interfaceC2575k, boolean z7) {
        AbstractC2980h.m5136e("sink", interfaceC2575k);
        this.sink = interfaceC2575k;
        this.client = z7;
        C2573j c2573j = new C2573j();
        this.hpackBuffer = c2573j;
        this.maxFrameSize = 16384;
        this.hpackWriter = new C2120d.b(0, false, c2573j, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.maxFrameSize, j);
            j -= jMin;
            frameHeader(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(C2131o c2131o) {
        try {
            AbstractC2980h.m5136e("peerSettings", c2131o);
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = c2131o.getMaxFrameSize(this.maxFrameSize);
            if (c2131o.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(c2131o.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(AbstractC2278c.format(">> CONNECTION " + C2121e.CONNECTION_PREFACE.mo4635e(), new Object[0]));
                }
                this.sink.mo4602w(C2121e.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z7, int i, C2573j c2573j, int i4) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i, z7 ? 1 : 0, c2573j, i4);
    }

    public final void dataFrame(int i, int i4, C2573j c2573j, int i8) {
        frameHeader(i, i8, 0, i4);
        if (i8 > 0) {
            InterfaceC2575k interfaceC2575k = this.sink;
            AbstractC2980h.m5133b(c2573j);
            interfaceC2575k.write(c2573j, i8);
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i, int i4, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i10 = i;
            i11 = i4;
            i12 = i8;
            i13 = i9;
            logger2.fine(C2121e.INSTANCE.frameLog(false, i10, i11, i12, i13));
        } else {
            i10 = i;
            i11 = i4;
            i12 = i8;
            i13 = i9;
        }
        if (i11 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i10, "reserved bit set: ").toString());
        }
        AbstractC2278c.writeMedium(this.sink, i11);
        this.sink.writeByte(i12 & 255);
        this.sink.writeByte(i13 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i10);
    }

    public final C2120d.b getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, EnumC2118b enumC2118b, byte[] bArr) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        AbstractC2980h.m5136e("debugData", bArr);
        if (this.closed) {
            throw new IOException("closed");
        }
        if (enumC2118b.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        frameHeader(0, bArr.length + 8, 7, 0);
        this.sink.writeInt(i);
        this.sink.writeInt(enumC2118b.getHttpCode());
        if (bArr.length != 0) {
            this.sink.write(bArr);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z7, int i, List<C2119c> list) {
        AbstractC2980h.m5136e("headerBlock", list);
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j = this.hpackBuffer.f9314k;
        long jMin = Math.min(this.maxFrameSize, j);
        int i4 = j == jMin ? 4 : 0;
        if (z7) {
            i4 |= 1;
        }
        frameHeader(i, (int) jMin, 1, i4);
        this.sink.write(this.hpackBuffer, jMin);
        if (j > jMin) {
            writeContinuationFrames(i, j - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z7, int i, int i4) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z7 ? 1 : 0);
        this.sink.writeInt(i);
        this.sink.writeInt(i4);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i, int i4, List<C2119c> list) {
        AbstractC2980h.m5136e("requestHeaders", list);
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j = this.hpackBuffer.f9314k;
        int iMin = (int) Math.min(this.maxFrameSize - 4, j);
        long j8 = iMin;
        frameHeader(i, iMin + 4, 5, j == j8 ? 4 : 0);
        this.sink.writeInt(i4 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j8);
        if (j > j8) {
            writeContinuationFrames(i, j - j8);
        }
    }

    public final synchronized void rstStream(int i, EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        if (this.closed) {
            throw new IOException("closed");
        }
        if (enumC2118b.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(i, 4, 3, 0);
        this.sink.writeInt(enumC2118b.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(C2131o c2131o) {
        try {
            AbstractC2980h.m5136e("settings", c2131o);
            if (this.closed) {
                throw new IOException("closed");
            }
            int i = 0;
            frameHeader(0, c2131o.size() * 6, 4, 0);
            while (i < 10) {
                if (c2131o.isSet(i)) {
                    this.sink.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.sink.writeInt(c2131o.get(i));
                }
                i++;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i, long j) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        frameHeader(i, 4, 8, 0);
        this.sink.writeInt((int) j);
        this.sink.flush();
    }
}
