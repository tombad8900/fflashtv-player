package p076i7;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.i0 */
/* loaded from: classes.dex */
public final class C1302i0 extends AbstractRunnableC1305j0 {

    /* renamed from: l */
    public final RunnableC1309k1 f5331l;

    public C1302i0(long j, RunnableC1309k1 runnableC1309k1) {
        super(j);
        this.f5331l = runnableC1309k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5331l.run();
    }

    @Override // p076i7.AbstractRunnableC1305j0
    public final String toString() {
        return super.toString() + this.f5331l;
    }
}
