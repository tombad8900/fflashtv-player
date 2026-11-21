package p182v;

import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.g */
/* loaded from: classes.dex */
public class C2492g extends C2491f {

    /* renamed from: m */
    public int f9109m;

    public C2492g(AbstractC2500o abstractC2500o) {
        super(abstractC2500o);
        if (abstractC2500o instanceof C2496k) {
            this.f9101e = 2;
        } else {
            this.f9101e = 3;
        }
    }

    @Override // p182v.C2491f
    /* renamed from: d */
    public final void mo4479d(int i) {
        if (this.f9106j) {
            return;
        }
        this.f9106j = true;
        this.f9103g = i;
        ArrayList arrayList = this.f9107k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            InterfaceC2489d interfaceC2489d = (InterfaceC2489d) obj;
            interfaceC2489d.mo4462a(interfaceC2489d);
        }
    }
}
