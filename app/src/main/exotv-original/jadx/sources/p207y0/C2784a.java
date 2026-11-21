package p207y0;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.a */
/* loaded from: classes.dex */
public final class C2784a extends MediaDataSource {

    /* renamed from: j */
    public long f10345j;

    /* renamed from: k */
    public final /* synthetic */ C2789f f10346k;

    public C2784a(C2789f c2789f) {
        this.f10346k = c2789f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j8 = this.f10345j;
            C2789f c2789f = this.f10346k;
            if (j8 != j) {
                if (j8 >= 0 && j >= j8 + c2789f.f10347j.available()) {
                    return -1;
                }
                c2789f.m4875c(j);
                this.f10345j = j;
            }
            if (i4 > c2789f.f10347j.available()) {
                i4 = c2789f.f10347j.available();
            }
            int i8 = c2789f.read(bArr, i, i4);
            if (i8 >= 0) {
                this.f10345j += i8;
                return i8;
            }
        } catch (IOException unused) {
        }
        this.f10345j = -1L;
        return -1;
    }
}
