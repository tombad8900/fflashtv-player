package p063h1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.e */
/* loaded from: classes.dex */
public final class C1109e {

    /* renamed from: a */
    public boolean f4731a;

    /* renamed from: a */
    public final synchronized void m2403a() {
        while (!this.f4731a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m2404b() {
        boolean z7 = false;
        while (!this.f4731a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m2405c() {
        if (this.f4731a) {
            return false;
        }
        this.f4731a = true;
        notifyAll();
        return true;
    }
}
