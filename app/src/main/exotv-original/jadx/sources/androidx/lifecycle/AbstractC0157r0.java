package androidx.lifecycle;

import java.util.Iterator;
import p038e1.C0860a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0157r0 {

    /* renamed from: a */
    public final C0860a f944a = new C0860a();

    /* renamed from: a */
    public final void m580a() {
        C0860a c0860a = this.f944a;
        if (c0860a != null && !c0860a.f3797d) {
            c0860a.f3797d = true;
            synchronized (c0860a.f3794a) {
                try {
                    Iterator it = c0860a.f3795b.values().iterator();
                    while (it.hasNext()) {
                        C0860a.m2041a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0860a.f3796c.iterator();
                    while (it2.hasNext()) {
                        C0860a.m2041a((AutoCloseable) it2.next());
                    }
                    c0860a.f3796c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo191b();
    }

    /* renamed from: b */
    public void mo191b() {
    }
}
