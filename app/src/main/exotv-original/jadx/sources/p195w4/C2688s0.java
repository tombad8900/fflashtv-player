package p195w4;

import android.view.View;
import android.widget.TextView;
import com.exotv.net.R;
import com.exotv.net.SeriesDetailActivity;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p212y6.InterfaceC2840a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.s0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2688s0 implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f9767j;

    /* renamed from: k */
    public final /* synthetic */ SeriesDetailActivity f9768k;

    public /* synthetic */ C2688s0(int i, SeriesDetailActivity seriesDetailActivity) {
        this.f9767j = i;
        this.f9768k = seriesDetailActivity;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        int i = this.f9767j;
        SeriesDetailActivity seriesDetailActivity = this.f9768k;
        switch (i) {
            case 0:
                int i4 = SeriesDetailActivity.f3003k0;
                return Boolean.valueOf(seriesDetailActivity.getResources().getBoolean(R.bool.is_large_screen));
            case 1:
                TextView textView = seriesDetailActivity.f3012P;
                return textView == null ? (View) AbstractC1913h.m3742G0(seriesDetailActivity.f3010N) : textView;
            default:
                int i8 = SeriesDetailActivity.f3003k0;
                seriesDetailActivity.m1743s();
                return C1693j.f6497a;
        }
    }
}
