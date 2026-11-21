package p089k1;

import java.io.InputStream;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.j */
/* loaded from: classes.dex */
public final class C1566j extends InputStream {

    /* renamed from: j */
    public final InterfaceC1564h f5982j;

    /* renamed from: k */
    public final C1568l f5983k;

    /* renamed from: m */
    public boolean f5985m = false;

    /* renamed from: n */
    public boolean f5986n = false;

    /* renamed from: l */
    public final byte[] f5984l = new byte[1];

    public C1566j(InterfaceC1564h interfaceC1564h, C1568l c1568l) {
        this.f5982j = interfaceC1564h;
        this.f5983k = c1568l;
    }

    /* renamed from: b */
    public final void m3232b() {
        if (this.f5985m) {
            return;
        }
        this.f5982j.open(this.f5983k);
        this.f5985m = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5986n) {
            return;
        }
        this.f5982j.close();
        this.f5986n = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f5984l;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        AbstractC1101a.m2359j(!this.f5986n);
        m3232b();
        int i8 = this.f5982j.read(bArr, i, i4);
        if (i8 == -1) {
            return -1;
        }
        return i8;
    }
}
