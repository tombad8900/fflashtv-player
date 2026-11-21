package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.C2180y;
import p002a1.AbstractC0008a1;
import p147q7.AbstractC2278c;
import p189v7.C2565f;
import p189v7.C2573j;
import p189v7.C2582n0;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.j */
/* loaded from: classes.dex */
public final class C2126j {
    public static final a Companion = new a(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final C2122f connection;
    private EnumC2118b errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<C2180y> headersQueue;

    /* renamed from: id */
    private final int f7619id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final d readTimeout;
    private final b sink;
    private final c source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final d writeTimeout;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.j$c */
    public final class c implements InterfaceC2576k0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private C2180y trailers;
        private final C2573j receiveBuffer = new C2573j();
        private final C2573j readBuffer = new C2573j();

        public c(long j, boolean z7) {
            this.maxByteCount = j;
            this.finished = z7;
        }

        private final void updateConnectionFlowControl(long j) {
            C2126j c2126j = C2126j.this;
            if (!AbstractC2278c.assertionsEnabled || !Thread.holdsLock(c2126j)) {
                C2126j.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2126j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            C2126j c2126j = C2126j.this;
            synchronized (c2126j) {
                this.closed = true;
                C2573j c2573j = this.readBuffer;
                j = c2573j.f9314k;
                c2573j.skip(j);
                c2126j.notifyAll();
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            C2126j.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final C2573j getReadBuffer() {
            return this.readBuffer;
        }

        public final C2573j getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final C2180y getTrailers() {
            return this.trailers;
        }

        @Override // p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            IOException errorException$okhttp;
            boolean z7;
            long j8;
            AbstractC2980h.m5136e("sink", c2573j);
            long j9 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
            }
            while (true) {
                C2126j c2126j = C2126j.this;
                synchronized (c2126j) {
                    c2126j.getReadTimeout$okhttp().enter();
                    try {
                        if (c2126j.getErrorCode$okhttp() == null || this.finished) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = c2126j.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                EnumC2118b errorCode$okhttp = c2126j.getErrorCode$okhttp();
                                AbstractC2980h.m5133b(errorCode$okhttp);
                                errorException$okhttp = new C2132p(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        C2573j c2573j2 = this.readBuffer;
                        long j10 = c2573j2.f9314k;
                        z7 = false;
                        if (j10 > j9) {
                            j8 = c2573j2.read(c2573j, Math.min(j, j10));
                            c2126j.setReadBytesTotal$okhttp(c2126j.getReadBytesTotal() + j8);
                            long readBytesTotal = c2126j.getReadBytesTotal() - c2126j.getReadBytesAcknowledged();
                            if (errorException$okhttp == null && readBytesTotal >= c2126j.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                c2126j.getConnection().writeWindowUpdateLater$okhttp(c2126j.getId(), readBytesTotal);
                                c2126j.setReadBytesAcknowledged$okhttp(c2126j.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException$okhttp == null) {
                                c2126j.waitForIo$okhttp();
                                z7 = true;
                            }
                            j8 = -1;
                        }
                        c2126j.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    } finally {
                    }
                }
                if (!z7) {
                    if (j8 != -1) {
                        return j8;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j9 = 0;
            }
        }

        public final void receive$okhttp(InterfaceC2577l interfaceC2577l, long j) throws EOFException {
            boolean z7;
            boolean z8;
            AbstractC2980h.m5136e("source", interfaceC2577l);
            C2126j c2126j = C2126j.this;
            if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(c2126j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2126j);
            }
            long j8 = j;
            while (j8 > 0) {
                synchronized (C2126j.this) {
                    z7 = this.finished;
                    z8 = this.readBuffer.f9314k + j8 > this.maxByteCount;
                }
                if (z8) {
                    interfaceC2577l.skip(j8);
                    C2126j.this.closeLater(EnumC2118b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z7) {
                    interfaceC2577l.skip(j8);
                    return;
                }
                long j9 = interfaceC2577l.read(this.receiveBuffer, j8);
                if (j9 == -1) {
                    throw new EOFException();
                }
                j8 -= j9;
                C2126j c2126j2 = C2126j.this;
                synchronized (c2126j2) {
                    try {
                        if (this.closed) {
                            C2573j c2573j = this.receiveBuffer;
                            c2573j.skip(c2573j.f9314k);
                        } else {
                            C2573j c2573j2 = this.readBuffer;
                            boolean z9 = c2573j2.f9314k == 0;
                            c2573j2.mo4598f(this.receiveBuffer);
                            if (z9) {
                                c2126j2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            updateConnectionFlowControl(j);
        }

        public final void setClosed$okhttp(boolean z7) {
            this.closed = z7;
        }

        public final void setFinished$okhttp(boolean z7) {
            this.finished = z7;
        }

        public final void setTrailers(C2180y c2180y) {
            this.trailers = c2180y;
        }

        @Override // p189v7.InterfaceC2576k0
        public C2582n0 timeout() {
            return C2126j.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.j$d */
    public final class d extends C2565f {
        public d() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // p189v7.C2565f
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p189v7.C2565f
        public void timedOut() {
            C2126j.this.closeLater(EnumC2118b.CANCEL);
            C2126j.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public C2126j(int i, C2122f c2122f, boolean z7, boolean z8, C2180y c2180y) {
        AbstractC2980h.m5136e("connection", c2122f);
        this.f7619id = i;
        this.connection = c2122f;
        this.writeBytesMaximum = c2122f.getPeerSettings().getInitialWindowSize();
        ArrayDeque<C2180y> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(c2122f.getOkHttpSettings().getInitialWindowSize(), z8);
        this.sink = new b(z7);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (c2180y == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c2180y);
        }
    }

    private final boolean closeInternal(EnumC2118b enumC2118b, IOException iOException) {
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = enumC2118b;
            this.errorException = iOException;
            notifyAll();
            if (this.source.getFinished$okhttp()) {
                if (this.sink.getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.f7619id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z7;
        boolean zIsOpen;
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z7 = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
                zIsOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            close(EnumC2118b.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.f7619id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            EnumC2118b enumC2118b = this.errorCode;
            AbstractC2980h.m5133b(enumC2118b);
            throw new C2132p(enumC2118b);
        }
    }

    public final void close(EnumC2118b enumC2118b, IOException iOException) {
        AbstractC2980h.m5136e("rstStatusCode", enumC2118b);
        if (closeInternal(enumC2118b, iOException)) {
            this.connection.writeSynReset$okhttp(this.f7619id, enumC2118b);
        }
    }

    public final void closeLater(EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        if (closeInternal(enumC2118b, null)) {
            this.connection.writeSynResetLater$okhttp(this.f7619id, enumC2118b);
        }
    }

    public final void enqueueTrailers(C2180y c2180y) {
        AbstractC2980h.m5136e("trailers", c2180y);
        synchronized (this) {
            if (this.sink.getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (c2180y.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            this.sink.setTrailers(c2180y);
        }
    }

    public final C2122f getConnection() {
        return this.connection;
    }

    public final synchronized EnumC2118b getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f7619id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final d getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final InterfaceC2572i0 getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public final b getSink$okhttp() {
        return this.sink;
    }

    public final InterfaceC2576k0 getSource() {
        return this.source;
    }

    public final c getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final d getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.f7619id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) {
                if (this.sink.getFinished() || this.sink.getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C2582n0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(InterfaceC2577l interfaceC2577l, int i) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        if (!AbstractC2278c.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(interfaceC2577l, i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void receiveHeaders(C2180y c2180y, boolean z7) {
        boolean zIsOpen;
        AbstractC2980h.m5136e("headers", c2180y);
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && z7) {
                    this.source.setTrailers(c2180y);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(c2180y);
                }
                if (z7) {
                    this.source.setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.f7619id);
    }

    public final synchronized void receiveRstStream(EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        if (this.errorCode == null) {
            this.errorCode = enumC2118b;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(EnumC2118b enumC2118b) {
        this.errorCode = enumC2118b;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final synchronized C2180y takeHeaders() {
        C2180y c2180yRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            EnumC2118b enumC2118b = this.errorCode;
            AbstractC2980h.m5133b(enumC2118b);
            throw new C2132p(enumC2118b);
        }
        c2180yRemoveFirst = this.headersQueue.removeFirst();
        AbstractC2980h.m5135d("headersQueue.removeFirst()", c2180yRemoveFirst);
        return c2180yRemoveFirst;
    }

    public final synchronized C2180y trailers() throws IOException {
        C2180y trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().mo4614j() || !this.source.getReadBuffer().mo4614j()) {
            if (this.errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            EnumC2118b enumC2118b = this.errorCode;
            AbstractC2980h.m5133b(enumC2118b);
            throw new C2132p(enumC2118b);
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = AbstractC2278c.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<C2119c> list, boolean z7, boolean z8) {
        boolean z9;
        AbstractC2980h.m5136e("responseHeaders", list);
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z7) {
                this.sink.setFinished(true);
            }
        }
        if (!z8) {
            synchronized (this.connection) {
                z9 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z8 = z9;
        }
        this.connection.writeHeaders$okhttp(this.f7619id, z7, list);
        if (z8) {
            this.connection.flush();
        }
    }

    public final C2582n0 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.j$b */
    public final class b implements InterfaceC2572i0 {
        private boolean closed;
        private boolean finished;
        private final C2573j sendBuffer;
        private C2180y trailers;

        public b(boolean z7) {
            this.finished = z7;
            this.sendBuffer = new C2573j();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean z7) throws IOException {
            long jMin;
            boolean z8;
            C2126j c2126j = C2126j.this;
            synchronized (c2126j) {
                c2126j.getWriteTimeout$okhttp().enter();
                while (c2126j.getWriteBytesTotal() >= c2126j.getWriteBytesMaximum() && !this.finished && !this.closed && c2126j.getErrorCode$okhttp() == null) {
                    try {
                        c2126j.waitForIo$okhttp();
                    } catch (Throwable th) {
                        c2126j.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                c2126j.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                c2126j.checkOutNotClosed$okhttp();
                jMin = Math.min(c2126j.getWriteBytesMaximum() - c2126j.getWriteBytesTotal(), this.sendBuffer.f9314k);
                c2126j.setWriteBytesTotal$okhttp(c2126j.getWriteBytesTotal() + jMin);
                z8 = z7 && jMin == this.sendBuffer.f9314k;
            }
            C2126j.this.getWriteTimeout$okhttp().enter();
            try {
                C2126j.this.getConnection().writeData(C2126j.this.getId(), z8, this.sendBuffer, jMin);
            } finally {
                C2126j.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C2126j c2126j = C2126j.this;
            if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(c2126j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2126j);
            }
            C2126j c2126j2 = C2126j.this;
            synchronized (c2126j2) {
                if (this.closed) {
                    return;
                }
                boolean z7 = c2126j2.getErrorCode$okhttp() == null;
                if (!C2126j.this.getSink$okhttp().finished) {
                    boolean z8 = this.sendBuffer.f9314k > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.f9314k > 0) {
                            emitFrame(false);
                        }
                        C2122f connection = C2126j.this.getConnection();
                        int id = C2126j.this.getId();
                        C2180y c2180y = this.trailers;
                        AbstractC2980h.m5133b(c2180y);
                        connection.writeHeaders$okhttp(id, z7, AbstractC2278c.toHeaderList(c2180y));
                    } else if (z8) {
                        while (this.sendBuffer.f9314k > 0) {
                            emitFrame(true);
                        }
                    } else if (z7) {
                        C2126j.this.getConnection().writeData(C2126j.this.getId(), true, null, 0L);
                    }
                }
                synchronized (C2126j.this) {
                    this.closed = true;
                }
                C2126j.this.getConnection().flush();
                C2126j.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Flushable
        public void flush() throws IOException {
            C2126j c2126j = C2126j.this;
            if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(c2126j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2126j);
            }
            C2126j c2126j2 = C2126j.this;
            synchronized (c2126j2) {
                c2126j2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f9314k > 0) {
                emitFrame(false);
                C2126j.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final C2180y getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z7) {
            this.closed = z7;
        }

        public final void setFinished(boolean z7) {
            this.finished = z7;
        }

        public final void setTrailers(C2180y c2180y) {
            this.trailers = c2180y;
        }

        @Override // p189v7.InterfaceC2572i0
        public C2582n0 timeout() {
            return C2126j.this.getWriteTimeout$okhttp();
        }

        @Override // p189v7.InterfaceC2572i0
        public void write(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("source", c2573j);
            C2126j c2126j = C2126j.this;
            if (!AbstractC2278c.assertionsEnabled || !Thread.holdsLock(c2126j)) {
                this.sendBuffer.write(c2573j, j);
                while (this.sendBuffer.f9314k >= C2126j.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2126j);
            }
        }

        public /* synthetic */ b(C2126j c2126j, boolean z7, int i, AbstractC2977e abstractC2977e) {
            this((i & 1) != 0 ? false : z7);
        }
    }
}
