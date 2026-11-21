package okhttp3.internal.p129ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import p189v7.AbstractC2557b;
import p189v7.C2569h;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.C2581n;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.a */
/* loaded from: classes.dex */
public final class C2150a implements Closeable {
    private final C2573j deflatedBytes;
    private final Deflater deflater;
    private final C2581n deflaterSink;
    private final boolean noContextTakeover;

    public C2150a(boolean z7) {
        this.noContextTakeover = z7;
        C2573j c2573j = new C2573j();
        this.deflatedBytes = c2573j;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C2581n(c2573j, deflater);
    }

    private final boolean endsWith(C2573j c2573j, C2579m c2579m) {
        return c2573j.m4669t(c2573j.f9314k - c2579m.mo4634d(), c2579m);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C2573j c2573j) throws IOException {
        AbstractC2980h.m5136e("buffer", c2573j);
        if (this.deflatedBytes.f9314k != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c2573j, c2573j.f9314k);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, AbstractC2151b.EMPTY_DEFLATE_BLOCK)) {
            C2573j c2573j2 = this.deflatedBytes;
            long j = c2573j2.f9314k - 4;
            C2569h c2569hM4670x = c2573j2.m4670x(AbstractC2557b.f9271a);
            try {
                c2569hM4670x.m4630b(j);
                c2569hM4670x.close();
            } finally {
            }
        } else {
            this.deflatedBytes.m4655K(0);
        }
        C2573j c2573j3 = this.deflatedBytes;
        c2573j.write(c2573j3, c2573j3.f9314k);
    }
}
