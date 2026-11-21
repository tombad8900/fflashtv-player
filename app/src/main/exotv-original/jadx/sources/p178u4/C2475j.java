package p178u4;

import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.j */
/* loaded from: classes.dex */
public final class C2475j extends FilterInputStream {

    /* renamed from: j */
    public int f9064j;

    public C2475j(C2469d c2469d) {
        super(c2469d);
        this.f9064j = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f9064j;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: b */
    public final long m4451b(long j) {
        int i = this.f9064j;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* renamed from: c */
    public final void m4452c(long j) {
        int i = this.f9064j;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f9064j = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f9064j = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m4451b(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m4452c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f9064j = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM4451b = m4451b(j);
        if (jM4451b == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM4451b);
        m4452c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int iM4451b = (int) m4451b(i4);
        if (iM4451b == -1) {
            return -1;
        }
        int i8 = super.read(bArr, i, iM4451b);
        m4452c(i8);
        return i8;
    }
}
