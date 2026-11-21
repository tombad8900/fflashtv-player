package p010b;

import java.util.ListIterator;
import p002a1.C0019f0;
import p102l6.C1693j;
import p111m6.C1911f;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.o */
/* loaded from: classes.dex */
public final class C0525o extends AbstractC2981i implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f2161j;

    /* renamed from: k */
    public final /* synthetic */ C0534x f2162k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0525o(C0534x c0534x, int i) {
        super(1);
        this.f2161j = i;
        this.f2162k = c0534x;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f2161j) {
            case 0:
                AbstractC2980h.m5136e("backEvent", (C0512b) obj);
                C0534x c0534x = this.f2162k;
                C1911f c1911f = c0534x.f2181b;
                ListIterator listIterator = c1911f.listIterator(c1911f.mo3715a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0019f0) objPrevious).f68a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C0019f0 c0019f0 = (C0019f0) objPrevious;
                if (c0534x.f2182c != null) {
                    c0534x.m1256b();
                }
                c0534x.f2182c = c0019f0;
                break;
            default:
                AbstractC2980h.m5136e("backEvent", (C0512b) obj);
                C0534x c0534x2 = this.f2162k;
                if (c0534x2.f2182c == null) {
                    C1911f c1911f2 = c0534x2.f2181b;
                    ListIterator listIterator2 = c1911f2.listIterator(c1911f2.mo3715a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C0019f0) objPrevious2).f68a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return C1693j.f6497a;
    }
}
