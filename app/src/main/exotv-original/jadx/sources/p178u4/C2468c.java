package p178u4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.c */
/* loaded from: classes.dex */
public final class C2468c extends FilterInputStream {

    /* renamed from: j */
    public final long f9050j;

    /* renamed from: k */
    public int f9051k;

    public C2468c(InputStream inputStream, long j) {
        super(inputStream);
        this.f9050j = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f9050j - this.f9051k, ((FilterInputStream) this).in.available());
    }

    /* renamed from: b */
    public final void m4443b(int i) throws IOException {
        if (i >= 0) {
            this.f9051k += i;
            return;
        }
        long j = this.f9051k;
        long j8 = this.f9050j;
        if (j8 - j <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j8 + ", but read: " + this.f9051k);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m4443b(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int i8;
        i8 = super.read(bArr, i, i4);
        m4443b(i8);
        return i8;
    }
}
