package p076i7;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.h0 */
/* loaded from: classes.dex */
public final class C1299h0 extends AbstractRunnableC1305j0 {

    /* renamed from: l */
    public final C1295g f5326l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC1311l0 f5327m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299h0(AbstractC1311l0 abstractC1311l0, long j, C1295g c1295g) {
        super(j);
        this.f5327m = abstractC1311l0;
        this.f5326l = c1295g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5326l.m2799E(this.f5327m);
    }

    @Override // p076i7.AbstractRunnableC1305j0
    public final String toString() {
        return super.toString() + this.f5326l;
    }
}
