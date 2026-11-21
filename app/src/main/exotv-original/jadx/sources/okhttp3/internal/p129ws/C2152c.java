package okhttp3.internal.p129ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.C2131o;
import p189v7.AbstractC2557b;
import p189v7.C2573j;
import p189v7.C2590u;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.c */
/* loaded from: classes.dex */
public final class C2152c implements Closeable {
    private final C2573j deflatedBytes;
    private final Inflater inflater;
    private final C2590u inflaterSource;
    private final boolean noContextTakeover;

    public C2152c(boolean z7) {
        this.noContextTakeover = z7;
        C2573j c2573j = new C2573j();
        this.deflatedBytes = c2573j;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new C2590u(AbstractC2557b.m4578c(c2573j), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(C2573j c2573j) throws DataFormatException, IOException {
        AbstractC2980h.m5136e("buffer", c2573j);
        if (this.deflatedBytes.f9314k != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.mo4598f(c2573j);
        this.deflatedBytes.m4658N(C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f9314k;
        do {
            this.inflaterSource.m4682b(c2573j, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
