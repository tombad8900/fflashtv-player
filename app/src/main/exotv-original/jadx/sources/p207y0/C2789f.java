package p207y0;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.f */
/* loaded from: classes.dex */
public final class C2789f extends C2785b {
    public C2789f(byte[] bArr) {
        super(bArr);
        this.f10347j.mark(Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public final void m4875c(long j) throws IOException {
        int i = this.f10348k;
        if (i > j) {
            this.f10348k = 0;
            this.f10347j.reset();
        } else {
            j -= i;
        }
        m4867b((int) j);
    }

    public C2789f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10347j.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
