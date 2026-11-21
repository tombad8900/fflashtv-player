package p082j3;

import java.io.Closeable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.h */
/* loaded from: classes.dex */
public final class C1495h implements Closeable {

    /* renamed from: j */
    public final C1490c f5759j;

    public C1495h(C1490c c1490c) {
        this.f5759j = c1490c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5759j.close();
    }
}
