package p079j0;

import android.os.Handler;
import p085j6.RunnableC1527q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.m */
/* loaded from: classes.dex */
public final class RunnableC1485m implements Runnable {

    /* renamed from: j */
    public CallableC1477e f5716j;

    /* renamed from: k */
    public C1478f f5717k;

    /* renamed from: l */
    public Handler f5718l;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f5716j.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f5718l.post(new RunnableC1527q(this.f5717k, 8, objCall));
    }
}
