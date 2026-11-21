package p178u4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p066h4.C1189w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.d */
/* loaded from: classes.dex */
public final class C2469d extends InputStream {

    /* renamed from: l */
    public static final ArrayDeque f9052l;

    /* renamed from: j */
    public C1189w f9053j;

    /* renamed from: k */
    public IOException f9054k;

    static {
        char[] cArr = AbstractC2478m.f9069a;
        f9052l = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9053j.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9053j.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f9053j.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f9053j.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f9053j.read();
        } catch (IOException e) {
            this.f9054k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f9053j.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f9053j.skip(j);
        } catch (IOException e) {
            this.f9054k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f9053j.read(bArr);
        } catch (IOException e) {
            this.f9054k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        try {
            return this.f9053j.read(bArr, i, i4);
        } catch (IOException e) {
            this.f9054k = e;
            throw e;
        }
    }
}
