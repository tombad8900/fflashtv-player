package p127o7;

import p076i7.AbstractC1339x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.j */
/* loaded from: classes.dex */
public final class C2059j extends AbstractRunnableC2058i {

    /* renamed from: l */
    public final Runnable f7605l;

    public C2059j(Runnable runnable, long j, boolean z7) {
        super(j, z7);
        this.f7605l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7605l.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7605l;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1339x.m2845f(runnable));
        sb.append(", ");
        sb.append(this.f7603j);
        sb.append(", ");
        sb.append(this.f7604k ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
