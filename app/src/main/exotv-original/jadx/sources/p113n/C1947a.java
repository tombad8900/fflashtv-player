package p113n;

import com.bumptech.glide.AbstractC0715d;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1947a extends AbstractC0715d {

    /* renamed from: o */
    public static volatile C1947a f7239o;

    /* renamed from: n */
    public final Object f7240n;

    public C1947a(int i) {
        switch (i) {
            case 1:
                this.f7240n = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1948b());
                break;
            default:
                this.f7240n = new C1947a(1);
                break;
        }
    }

    /* renamed from: s0 */
    public static C1947a m3804s0() {
        if (f7239o != null) {
            return f7239o;
        }
        synchronized (C1947a.class) {
            try {
                if (f7239o == null) {
                    f7239o = new C1947a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7239o;
    }
}
