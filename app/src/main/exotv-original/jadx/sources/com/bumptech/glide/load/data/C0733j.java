package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes.dex */
public final class C0733j extends FilterInputStream {

    /* renamed from: l */
    public static final byte[] f2859l = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: m */
    public static final int f2860m = 31;

    /* renamed from: j */
    public final byte f2861j;

    /* renamed from: k */
    public int f2862k;

    public C0733j(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Cannot add invalid orientation: "));
        }
        this.f2861j = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i4 = this.f2862k;
        int i8 = (i4 < 2 || i4 > (i = f2860m)) ? super.read() : i4 == i ? this.f2861j : f2859l[i4 - 2] & 255;
        if (i8 != -1) {
            this.f2862k++;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f2862k = (int) (this.f2862k + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i8;
        int i9 = this.f2862k;
        int i10 = f2860m;
        if (i9 > i10) {
            i8 = super.read(bArr, i, i4);
        } else if (i9 == i10) {
            bArr[i] = this.f2861j;
            i8 = 1;
        } else if (i9 < 2) {
            i8 = super.read(bArr, i, 2 - i9);
        } else {
            int iMin = Math.min(i10 - i9, i4);
            System.arraycopy(f2859l, this.f2862k - 2, bArr, i, iMin);
            i8 = iMin;
        }
        if (i8 > 0) {
            this.f2862k += i8;
        }
        return i8;
    }
}
