package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p015b4.C0572f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes.dex */
public final class C0726c extends OutputStream {

    /* renamed from: j */
    public final FileOutputStream f2851j;

    /* renamed from: k */
    public byte[] f2852k;

    /* renamed from: l */
    public final C0572f f2853l;

    /* renamed from: m */
    public int f2854m;

    public C0726c(FileOutputStream fileOutputStream, C0572f c0572f) {
        this.f2851j = fileOutputStream;
        this.f2853l = c0572f;
        this.f2852k = (byte[]) c0572f.m1319c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2851j;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2852k;
            if (bArr != null) {
                this.f2853l.m1323g(bArr);
                this.f2852k = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2854m;
        FileOutputStream fileOutputStream = this.f2851j;
        if (i > 0) {
            fileOutputStream.write(this.f2852k, 0, i);
            this.f2854m = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2852k;
        int i4 = this.f2854m;
        int i8 = i4 + 1;
        this.f2854m = i8;
        bArr[i4] = (byte) i;
        if (i8 != bArr.length || i8 <= 0) {
            return;
        }
        this.f2851j.write(bArr, 0, i8);
        this.f2854m = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) throws IOException {
        int i8 = 0;
        do {
            int i9 = i4 - i8;
            int i10 = i + i8;
            int i11 = this.f2854m;
            FileOutputStream fileOutputStream = this.f2851j;
            if (i11 == 0 && i9 >= this.f2852k.length) {
                fileOutputStream.write(bArr, i10, i9);
                return;
            }
            int iMin = Math.min(i9, this.f2852k.length - i11);
            System.arraycopy(bArr, i10, this.f2852k, this.f2854m, iMin);
            int i12 = this.f2854m + iMin;
            this.f2854m = i12;
            i8 += iMin;
            byte[] bArr2 = this.f2852k;
            if (i12 == bArr2.length && i12 > 0) {
                fileOutputStream.write(bArr2, 0, i12);
                this.f2854m = 0;
            }
        } while (i8 < i4);
    }
}
