package p195w4;

import android.view.View;
import com.exotv.net.PlayerActivity;
import p006a5.C0107b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.g0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2664g0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9688j;

    /* renamed from: k */
    public final /* synthetic */ PlayerActivity f9689k;

    public /* synthetic */ RunnableC2664g0(PlayerActivity playerActivity, int i) {
        this.f9688j = i;
        this.f9689k = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9688j;
        PlayerActivity playerActivity = this.f9689k;
        switch (i) {
            case 0:
                C0107b c0107b = playerActivity.f2937H;
                if (c0107b != null) {
                    c0107b.f525b.requestFocus();
                    return;
                } else {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
            case 1:
                int i4 = PlayerActivity.f2936z0;
                playerActivity.m1710D();
                return;
            case 2:
                if (playerActivity.f2945P) {
                    return;
                }
                playerActivity.m1720N("startup");
                return;
            case 3:
                if (playerActivity.f2945P) {
                    return;
                }
                playerActivity.m1720N("buffer");
                return;
            case 4:
                String str = playerActivity.f2979x0;
                if (str != null) {
                    playerActivity.m1726T(str, playerActivity.f2980y0, playerActivity.m1719M());
                    return;
                }
                return;
            case 5:
                playerActivity.f2967l0 = false;
                return;
            default:
                C0107b c0107b2 = playerActivity.f2937H;
                if (c0107b2 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b2.f535l.getVisibility() == 0) {
                    View view = playerActivity.f2975t0;
                    if (view == null) {
                        C0107b c0107b3 = playerActivity.f2937H;
                        if (c0107b3 == null) {
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                        view = c0107b3.f537n;
                    }
                    view.requestFocus();
                    return;
                }
                return;
        }
    }
}
