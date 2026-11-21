package p195w4;

import android.view.View;
import com.exotv.net.PlayerActivity;
import p006a5.C0107b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.j0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2670j0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9703j;

    /* renamed from: k */
    public final /* synthetic */ PlayerActivity f9704k;

    /* renamed from: l */
    public final /* synthetic */ View f9705l;

    public /* synthetic */ RunnableC2670j0(PlayerActivity playerActivity, View view, int i) {
        this.f9703j = i;
        this.f9704k = playerActivity;
        this.f9705l = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9703j) {
            case 0:
                C0107b c0107b = this.f9704k.f2937H;
                if (c0107b == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b.f519C.getVisibility() == 0) {
                    this.f9705l.requestFocus();
                    return;
                }
                return;
            default:
                PlayerActivity playerActivity = this.f9704k;
                C0107b c0107b2 = playerActivity.f2937H;
                if (c0107b2 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b2.f535l.getVisibility() != 0 || playerActivity.isFinishing() || playerActivity.isDestroyed()) {
                    return;
                }
                View currentFocus = playerActivity.getCurrentFocus();
                C0107b c0107b3 = playerActivity.f2937H;
                if (c0107b3 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (currentFocus != c0107b3.f537n) {
                    View currentFocus2 = playerActivity.getCurrentFocus();
                    C0107b c0107b4 = playerActivity.f2937H;
                    if (c0107b4 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    if (currentFocus2 != c0107b4.f536m) {
                        this.f9705l.requestFocus();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
