package p079j0;

import java.util.ArrayList;
import p002a1.C0016e;
import p096l0.InterfaceC1641a;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C1478f implements InterfaceC1641a {

    /* renamed from: a */
    public final /* synthetic */ int f5699a;

    /* renamed from: b */
    public final /* synthetic */ Object f5700b;

    public /* synthetic */ C1478f(int i, Object obj) {
        this.f5699a = i;
        this.f5700b = obj;
    }

    @Override // p096l0.InterfaceC1641a
    public final void accept(Object obj) {
        switch (this.f5699a) {
            case 0:
                C1479g c1479g = (C1479g) obj;
                if (c1479g == null) {
                    c1479g = new C1479g(-3);
                }
                ((C0016e) this.f5700b).m39I(c1479g);
                return;
            default:
                C1479g c1479g2 = (C1479g) obj;
                synchronized (AbstractC1480h.f5705c) {
                    try {
                        C2192k c2192k = AbstractC1480h.f5706d;
                        ArrayList arrayList = (ArrayList) c2192k.get((String) this.f5700b);
                        if (arrayList == null) {
                            return;
                        }
                        c2192k.remove((String) this.f5700b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC1641a) arrayList.get(i)).accept(c1479g2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
