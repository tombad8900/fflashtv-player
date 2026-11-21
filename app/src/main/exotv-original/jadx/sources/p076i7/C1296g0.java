package p076i7;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.g0 */
/* loaded from: classes.dex */
public final class C1296g0 implements InterfaceC1323p0 {

    /* renamed from: j */
    public final boolean f5324j;

    public C1296g0(boolean z7) {
        this.f5324j = z7;
    }

    @Override // p076i7.InterfaceC1323p0
    /* renamed from: b */
    public final C1282b1 mo2779b() {
        return null;
    }

    @Override // p076i7.InterfaceC1323p0
    public final boolean isActive() {
        return this.f5324j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f5324j ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
