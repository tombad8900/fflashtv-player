package p195w4;

import com.exotv.net.MainActivity;
import p006a5.C0106a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2665h implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9690j;

    /* renamed from: k */
    public final /* synthetic */ MainActivity f9691k;

    public /* synthetic */ RunnableC2665h(MainActivity mainActivity, int i) {
        this.f9690j = i;
        this.f9691k = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9690j) {
            case 0:
                C0106a c0106a = this.f9691k.f2892P;
                if (c0106a != null) {
                    c0106a.f509j.requestFocus();
                    return;
                } else {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
            default:
                C0106a c0106a2 = this.f9691k.f2892P;
                if (c0106a2 != null) {
                    c0106a2.f512m.requestFocus();
                    return;
                } else {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
        }
    }
}
