package p082j3;

import java.io.Closeable;
import p069h7.C1204f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.c */
/* loaded from: classes.dex */
public final class C1490c implements Closeable {

    /* renamed from: j */
    public final C1489b f5734j;

    /* renamed from: k */
    public boolean f5735k;

    /* renamed from: l */
    public final /* synthetic */ C1493f f5736l;

    public C1490c(C1493f c1493f, C1489b c1489b) {
        this.f5736l = c1493f;
        this.f5734j = c1489b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5735k) {
            return;
        }
        this.f5735k = true;
        C1493f c1493f = this.f5736l;
        synchronized (c1493f) {
            C1489b c1489b = this.f5734j;
            int i = c1489b.f5732h - 1;
            c1489b.f5732h = i;
            if (i == 0 && c1489b.f5730f) {
                C1204f c1204f = C1493f.f5740z;
                c1493f.m3168F(c1489b);
            }
        }
    }
}
