package p002a1;

import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.m0 */
/* loaded from: classes.dex */
public final class C0033m0 implements InterfaceC0031l0 {

    /* renamed from: a */
    public final int f99a;

    /* renamed from: b */
    public final /* synthetic */ C0035n0 f100b;

    public C0033m0(C0035n0 c0035n0, int i) {
        this.f100b = c0035n0;
        this.f99a = i;
    }

    @Override // p002a1.InterfaceC0031l0
    /* renamed from: a */
    public final boolean mo1a(ArrayList arrayList, ArrayList arrayList2) {
        C0035n0 c0035n0 = this.f100b;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0035n0.f137w;
        int i = this.f99a;
        if (abstractComponentCallbacksC0050v == null || i >= 0 || !abstractComponentCallbacksC0050v.m226g().m121O(-1, 0)) {
            return c0035n0.m122P(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
