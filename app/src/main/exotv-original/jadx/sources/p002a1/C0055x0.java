package p002a1;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.x0 */
/* loaded from: classes.dex */
public final class C0055x0 extends Writer {

    /* renamed from: k */
    public final StringBuilder f271k = new StringBuilder(128);

    /* renamed from: j */
    public final String f270j = "FragmentManager";

    /* renamed from: b */
    public final void m241b() {
        StringBuilder sb = this.f271k;
        if (sb.length() > 0) {
            Log.d(this.f270j, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m241b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m241b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        for (int i8 = 0; i8 < i4; i8++) {
            char c8 = cArr[i + i8];
            if (c8 == '\n') {
                m241b();
            } else {
                this.f271k.append(c8);
            }
        }
    }
}
