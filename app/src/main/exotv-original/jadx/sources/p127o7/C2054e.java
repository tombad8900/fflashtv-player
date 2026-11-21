package p127o7;

import p076i7.AbstractC1327r;
import p112m7.AbstractC1925a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.e */
/* loaded from: classes.dex */
public final class C2054e extends AbstractC2057h {

    /* renamed from: m */
    public static final C2054e f7600m;

    static {
        int i = AbstractC2060k.f7608c;
        int i4 = AbstractC2060k.f7609d;
        long j = AbstractC2060k.f7610e;
        String str = AbstractC2060k.f7606a;
        C2054e c2054e = new C2054e();
        c2054e.f7602l = new ExecutorC2052c(i, i4, j, str);
        f7600m = c2054e;
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: F */
    public final AbstractC1327r mo2830F(int i) {
        AbstractC1925a.m3765a(1);
        return 1 >= AbstractC2060k.f7608c ? this : super.mo2830F(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p076i7.AbstractC1327r
    public final String toString() {
        return "Dispatchers.Default";
    }
}
