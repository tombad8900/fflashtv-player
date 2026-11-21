package p076i7;

import p137p6.InterfaceC2222c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.x0 */
/* loaded from: classes.dex */
public final class C1340x0 extends C1295g {

    /* renamed from: r */
    public final C1313m f5385r;

    public C1340x0(InterfaceC2222c interfaceC2222c, C1313m c1313m) {
        super(1, interfaceC2222c);
        this.f5385r = c1313m;
    }

    @Override // p076i7.C1295g
    /* renamed from: B */
    public final String mo2796B() {
        return "AwaitContinuation";
    }

    @Override // p076i7.C1295g
    /* renamed from: t */
    public final Throwable mo2808t(C1279a1 c1279a1) {
        Throwable thM2861c;
        C1313m c1313m = this.f5385r;
        c1313m.getClass();
        Object obj = C1279a1.f5307j.get(c1313m);
        return (!(obj instanceof C1344z0) || (thM2861c = ((C1344z0) obj).m2861c()) == null) ? obj instanceof C1319o ? ((C1319o) obj).f5358a : c1279a1.m2772v() : thM2861c;
    }
}
