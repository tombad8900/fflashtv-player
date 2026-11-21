package p189v7;

import java.io.IOException;
import java.io.InputStream;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.i */
/* loaded from: classes.dex */
public final class C2571i extends InputStream {

    /* renamed from: j */
    public final /* synthetic */ int f9311j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2577l f9312k;

    public /* synthetic */ C2571i(InterfaceC2577l interfaceC2577l, int i) {
        this.f9311j = i;
        this.f9312k = interfaceC2577l;
    }

    /* renamed from: b */
    private final void m4647b() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f9311j) {
            case 0:
                jMin = Math.min(((C2573j) this.f9312k).f9314k, Integer.MAX_VALUE);
                break;
            default:
                C2564e0 c2564e0 = (C2564e0) this.f9312k;
                if (!c2564e0.f9291l) {
                    jMin = Math.min(c2564e0.f9290k.f9314k, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9311j) {
            case 0:
                break;
            default:
                ((C2564e0) this.f9312k).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f9311j) {
            case 0:
                C2573j c2573j = (C2573j) this.f9312k;
                if (c2573j.f9314k > 0) {
                    return c2573j.readByte() & 255;
                }
                return -1;
            default:
                C2564e0 c2564e0 = (C2564e0) this.f9312k;
                C2573j c2573j2 = c2564e0.f9290k;
                if (c2564e0.f9291l) {
                    throw new IOException("closed");
                }
                if (c2573j2.f9314k == 0 && c2564e0.f9289j.read(c2573j2, 8192L) == -1) {
                    return -1;
                }
                return c2573j2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f9311j) {
            case 0:
                return ((C2573j) this.f9312k) + ".inputStream()";
            default:
                return ((C2564e0) this.f9312k) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        switch (this.f9311j) {
            case 0:
                AbstractC2980h.m5136e("sink", bArr);
                return ((C2573j) this.f9312k).read(bArr, i, i4);
            default:
                AbstractC2980h.m5136e("data", bArr);
                C2564e0 c2564e0 = (C2564e0) this.f9312k;
                C2573j c2573j = c2564e0.f9290k;
                if (!c2564e0.f9291l) {
                    AbstractC2557b.m4580e(bArr.length, i, i4);
                    if (c2573j.f9314k == 0 && c2564e0.f9289j.read(c2573j, 8192L) == -1) {
                        return -1;
                    }
                    return c2573j.read(bArr, i, i4);
                }
                throw new IOException("closed");
        }
    }
}
