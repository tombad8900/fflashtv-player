package p066h4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p015b4.C0572f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.w */
/* loaded from: classes.dex */
public final class C1189w extends FilterInputStream {

    /* renamed from: j */
    public volatile byte[] f5060j;

    /* renamed from: k */
    public int f5061k;

    /* renamed from: l */
    public int f5062l;

    /* renamed from: m */
    public int f5063m;

    /* renamed from: n */
    public int f5064n;

    /* renamed from: o */
    public final C0572f f5065o;

    public C1189w(InputStream inputStream, C0572f c0572f) {
        super(inputStream);
        this.f5063m = -1;
        this.f5065o = c0572f;
        this.f5060j = (byte[]) c0572f.m1319c(65536, byte[].class);
    }

    /* renamed from: g */
    public static void m2609g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5060j == null || inputStream == null) {
            m2609g();
            throw null;
        }
        return (this.f5061k - this.f5064n) + inputStream.available();
    }

    /* renamed from: b */
    public final int m2610b(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f5063m;
        if (i != -1) {
            int i4 = this.f5064n - i;
            int i8 = this.f5062l;
            if (i4 < i8) {
                if (i == 0 && i8 > bArr.length && this.f5061k == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i8) {
                        i8 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5065o.m1319c(i8, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5060j = bArr2;
                    this.f5065o.m1323g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i9 = this.f5064n - this.f5063m;
                this.f5064n = i9;
                this.f5063m = 0;
                this.f5061k = 0;
                int i10 = inputStream.read(bArr, i9, bArr.length - i9);
                int i11 = this.f5064n;
                if (i10 > 0) {
                    i11 += i10;
                }
                this.f5061k = i11;
                return i10;
            }
        }
        int i12 = inputStream.read(bArr);
        if (i12 > 0) {
            this.f5063m = -1;
            this.f5064n = 0;
            this.f5061k = i12;
        }
        return i12;
    }

    /* renamed from: c */
    public final synchronized void m2611c() {
        if (this.f5060j != null) {
            this.f5065o.m1323g(this.f5060j);
            this.f5060j = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5060j != null) {
            this.f5065o.m1323g(this.f5060j);
            this.f5060j = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f5062l = Math.max(this.f5062l, i);
        this.f5063m = this.f5064n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f5060j;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m2609g();
            throw null;
        }
        if (this.f5064n >= this.f5061k && m2610b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f5060j && (bArr = this.f5060j) == null) {
            m2609g();
            throw null;
        }
        int i = this.f5061k;
        int i4 = this.f5064n;
        if (i - i4 <= 0) {
            return -1;
        }
        this.f5064n = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f5060j == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f5063m;
        if (-1 == i) {
            throw new C1188v("Mark has been invalidated, pos: " + this.f5064n + " markLimit: " + this.f5062l);
        }
        this.f5064n = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f5060j;
        if (bArr == null) {
            m2609g();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2609g();
            throw null;
        }
        int i = this.f5061k;
        int i4 = this.f5064n;
        if (i - i4 >= j) {
            this.f5064n = (int) (i4 + j);
            return j;
        }
        long j8 = i - i4;
        this.f5064n = i;
        if (this.f5063m == -1 || j > this.f5062l) {
            long jSkip = inputStream.skip(j - j8);
            if (jSkip > 0) {
                this.f5063m = -1;
            }
            return j8 + jSkip;
        }
        if (m2610b(inputStream, bArr) == -1) {
            return j8;
        }
        int i8 = this.f5061k;
        int i9 = this.f5064n;
        if (i8 - i9 >= j - j8) {
            this.f5064n = (int) ((i9 + j) - j8);
            return j;
        }
        long j9 = (j8 + i8) - i9;
        this.f5064n = i8;
        return j9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int i8;
        int i9;
        byte[] bArr2 = this.f5060j;
        if (bArr2 == null) {
            m2609g();
            throw null;
        }
        if (i4 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i10 = this.f5064n;
            int i11 = this.f5061k;
            if (i10 < i11) {
                int i12 = i11 - i10;
                if (i12 >= i4) {
                    i12 = i4;
                }
                System.arraycopy(bArr2, i10, bArr, i, i12);
                this.f5064n += i12;
                if (i12 == i4 || inputStream.available() == 0) {
                    return i12;
                }
                i += i12;
                i8 = i4 - i12;
            } else {
                i8 = i4;
            }
            while (true) {
                if (this.f5063m == -1 && i8 >= bArr2.length) {
                    i9 = inputStream.read(bArr, i, i8);
                    if (i9 == -1) {
                        return i8 != i4 ? i4 - i8 : -1;
                    }
                } else {
                    if (m2610b(inputStream, bArr2) == -1) {
                        return i8 != i4 ? i4 - i8 : -1;
                    }
                    if (bArr2 != this.f5060j && (bArr2 = this.f5060j) == null) {
                        m2609g();
                        throw null;
                    }
                    int i13 = this.f5061k;
                    int i14 = this.f5064n;
                    i9 = i13 - i14;
                    if (i9 >= i8) {
                        i9 = i8;
                    }
                    System.arraycopy(bArr2, i14, bArr, i, i9);
                    this.f5064n += i9;
                }
                i8 -= i9;
                if (i8 == 0) {
                    return i4;
                }
                if (inputStream.available() == 0) {
                    return i4 - i8;
                }
                i += i9;
            }
        } else {
            m2609g();
            throw null;
        }
    }
}
