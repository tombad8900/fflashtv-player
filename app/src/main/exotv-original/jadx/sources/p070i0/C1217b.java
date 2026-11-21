package p070i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C1217b {

    /* renamed from: a */
    public boolean f5097a;

    /* renamed from: b */
    public InterfaceC1216a f5098b;

    /* renamed from: c */
    public boolean f5099c;

    /* renamed from: a */
    public final void m2668a(InterfaceC1216a interfaceC1216a) {
        synchronized (this) {
            while (this.f5099c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f5098b == interfaceC1216a) {
                return;
            }
            this.f5098b = interfaceC1216a;
            if (this.f5097a) {
                interfaceC1216a.onCancel();
            }
        }
    }
}
