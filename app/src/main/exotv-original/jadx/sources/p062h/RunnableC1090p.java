package p062h;

import android.view.ViewGroup;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.p */
/* loaded from: classes.dex */
public final class RunnableC1090p implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f4621j;

    /* renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C1098x f4622k;

    public /* synthetic */ RunnableC1090p(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, int i) {
        this.f4621j = i;
        this.f4622k = layoutInflaterFactory2C1098x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f4621j) {
            case 0:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4622k;
                if ((layoutInflaterFactory2C1098x.f4690h0 & 1) != 0) {
                    layoutInflaterFactory2C1098x.m2337u(0);
                }
                if ((layoutInflaterFactory2C1098x.f4690h0 & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED) != 0) {
                    layoutInflaterFactory2C1098x.m2337u(108);
                }
                layoutInflaterFactory2C1098x.f4689g0 = false;
                layoutInflaterFactory2C1098x.f4690h0 = 0;
                break;
            default:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x2 = this.f4622k;
                layoutInflaterFactory2C1098x2.f4662F.showAtLocation(layoutInflaterFactory2C1098x2.f4661E, 55, 0, 0);
                C1843r0 c1843r0 = layoutInflaterFactory2C1098x2.f4664H;
                if (c1843r0 != null) {
                    c1843r0.m3616b();
                }
                if (!layoutInflaterFactory2C1098x2.f4665I || (viewGroup = layoutInflaterFactory2C1098x2.f4666J) == null || !viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C1098x2.f4661E.setAlpha(1.0f);
                    layoutInflaterFactory2C1098x2.f4661E.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C1098x2.f4661E.setAlpha(0.0f);
                    C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(layoutInflaterFactory2C1098x2.f4661E);
                    c1843r0M3596a.m3615a(1.0f);
                    layoutInflaterFactory2C1098x2.f4664H = c1843r0M3596a;
                    c1843r0M3596a.m3618d(new C1092r(0, this));
                    break;
                }
                break;
        }
    }
}
