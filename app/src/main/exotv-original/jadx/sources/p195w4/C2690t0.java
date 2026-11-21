package p195w4;

import android.content.Intent;
import android.view.View;
import com.exotv.net.SeriesDetailActivity;
import p102l6.C1693j;
import p204x4.C2769l;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.t0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2690t0 implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f9775j;

    /* renamed from: k */
    public final /* synthetic */ SeriesDetailActivity f9776k;

    public /* synthetic */ C2690t0(int i, SeriesDetailActivity seriesDetailActivity) {
        this.f9775j = i;
        this.f9776k = seriesDetailActivity;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        int i = this.f9775j;
        C1693j c1693j = C1693j.f6497a;
        SeriesDetailActivity seriesDetailActivity = this.f9776k;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i4 = SeriesDetailActivity.f3003k0;
                AbstractC2980h.m5136e("it", view);
                seriesDetailActivity.f3013Q = view;
                break;
            default:
                C2769l c2769l = (C2769l) obj;
                int i8 = SeriesDetailActivity.f3003k0;
                AbstractC2980h.m5136e("it", c2769l);
                seriesDetailActivity.getClass();
                seriesDetailActivity.startActivity(new Intent(seriesDetailActivity, (Class<?>) SeriesDetailActivity.class).addFlags(603979776).putExtra("series_id", c2769l.f10241a).putExtra("series_title", c2769l.f10242b));
                break;
        }
        return c1693j;
    }
}
