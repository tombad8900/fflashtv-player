package p194w3;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w3.a */
/* loaded from: classes.dex */
public final class CallableC2639a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C2642d f9602a;

    public CallableC2639a(C2642d c2642d) {
        this.f9602a = c2642d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f9602a) {
            try {
                C2642d c2642d = this.f9602a;
                if (c2642d.f9618r == null) {
                    return null;
                }
                c2642d.m4745J();
                if (this.f9602a.m4748x()) {
                    this.f9602a.m4744H();
                    this.f9602a.f9620t = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
