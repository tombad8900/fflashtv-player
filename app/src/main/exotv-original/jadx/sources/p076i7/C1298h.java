package p076i7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.h */
/* loaded from: classes.dex */
public final class C1298h extends C1319o {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5325c = AtomicIntegerFieldUpdater.newUpdater(C1298h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1298h(C1295g c1295g, Throwable th, boolean z7) {
        if (th == null) {
            th = new CancellationException("Continuation " + c1295g + " was cancelled normally");
        }
        super(th, z7);
        this._resumed$volatile = 0;
    }
}
