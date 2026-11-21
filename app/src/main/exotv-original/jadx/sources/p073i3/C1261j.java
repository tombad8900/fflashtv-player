package p073i3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.j */
/* loaded from: classes.dex */
public final class C1261j extends InputStream {

    /* renamed from: j */
    public final /* synthetic */ int f5261j = 0;

    /* renamed from: k */
    public int f5262k = 1073741824;

    /* renamed from: l */
    public final Object f5263l;

    public C1261j(InputStream inputStream) {
        this.f5263l = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f5261j) {
            case 0:
                return this.f5262k;
            default:
                return ((ByteBuffer) this.f5263l).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f5261j) {
            case 0:
                ((InputStream) this.f5263l).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f5261j) {
            case 1:
                synchronized (this) {
                    this.f5262k = ((ByteBuffer) this.f5263l).position();
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f5261j) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f5261j) {
            case 0:
                int i = ((InputStream) this.f5263l).read(bArr);
                if (i == -1) {
                    this.f5262k = 0;
                }
                return i;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f5261j) {
            case 1:
                synchronized (this) {
                    int i = this.f5262k;
                    if (i == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.f5263l).position(i);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        switch (this.f5261j) {
            case 0:
                return ((InputStream) this.f5263l).skip(j);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f5263l;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + jMin));
                return jMin;
        }
    }

    public C1261j(ByteBuffer byteBuffer) {
        this.f5263l = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f5261j) {
            case 0:
                int i = ((InputStream) this.f5263l).read();
                if (i == -1) {
                    this.f5262k = 0;
                }
                return i;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f5263l;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        switch (this.f5261j) {
            case 0:
                int i8 = ((InputStream) this.f5263l).read(bArr, i, i4);
                if (i8 == -1) {
                    this.f5262k = 0;
                }
                return i8;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f5263l;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i4, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
        }
    }
}
