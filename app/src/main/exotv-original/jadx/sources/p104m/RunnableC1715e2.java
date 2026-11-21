package p104m;

import androidx.appcompat.widget.Toolbar;
import p095l.C1630p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.e2 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1715e2 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6533j;

    /* renamed from: k */
    public final /* synthetic */ Toolbar f6534k;

    public /* synthetic */ RunnableC1715e2(Toolbar toolbar, int i) {
        this.f6533j = i;
        this.f6534k = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6533j) {
            case 0:
                C1723g2 c1723g2 = this.f6534k.f756U;
                C1630p c1630p = c1723g2 == null ? null : c1723g2.f6553k;
                if (c1630p != null) {
                    c1630p.collapseActionView();
                    break;
                }
                break;
            default:
                this.f6534k.m485m();
                break;
        }
    }
}
