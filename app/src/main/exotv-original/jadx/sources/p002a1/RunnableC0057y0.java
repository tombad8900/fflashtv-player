package p002a1;

import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.y0 */
/* loaded from: classes.dex */
public final class RunnableC0057y0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f274j;

    /* renamed from: k */
    public final /* synthetic */ C0059z0 f275k;

    /* renamed from: l */
    public final /* synthetic */ C0030l f276l;

    public /* synthetic */ RunnableC0057y0(C0030l c0030l, C0059z0 c0059z0, int i) {
        this.f274j = i;
        this.f276l = c0030l;
        this.f275k = c0059z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f274j) {
            case 0:
                ArrayList arrayList = this.f276l.f94b;
                C0059z0 c0059z0 = this.f275k;
                if (arrayList.contains(c0059z0)) {
                    AbstractC0008a1.m5a(c0059z0.f284c.f222N, c0059z0.f282a);
                    break;
                }
                break;
            default:
                C0030l c0030l = this.f276l;
                ArrayList arrayList2 = c0030l.f94b;
                C0059z0 c0059z02 = this.f275k;
                arrayList2.remove(c0059z02);
                c0030l.f95c.remove(c0059z02);
                break;
        }
    }
}
