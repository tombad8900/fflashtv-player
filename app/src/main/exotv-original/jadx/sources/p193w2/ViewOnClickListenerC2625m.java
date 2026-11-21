package p193w2;

import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0236r1;
import androidx.media3.common.InterfaceC0193d1;
import com.exotv.net.SeriesDetailActivity;
import p002a1.AbstractC0008a1;
import p024c5.C0670i;
import p052f6.AbstractC0983m0;
import p076i7.AbstractC1339x;
import p195w4.C2648a1;
import p195w4.C2688s0;
import p218z4.C2945g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.m */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2625m implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f9479j;

    /* renamed from: k */
    public final /* synthetic */ Object f9480k;

    /* renamed from: l */
    public final /* synthetic */ Object f9481l;

    /* renamed from: m */
    public final /* synthetic */ Object f9482m;

    /* renamed from: n */
    public final /* synthetic */ Object f9483n;

    public /* synthetic */ ViewOnClickListenerC2625m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f9479j = i;
        this.f9480k = obj;
        this.f9481l = obj2;
        this.f9482m = obj3;
        this.f9483n = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9479j;
        Object obj = this.f9483n;
        Object obj2 = this.f9482m;
        Object obj3 = this.f9481l;
        Object obj4 = this.f9480k;
        switch (i) {
            case 0:
                C2609e c2609e = (C2609e) obj4;
                InterfaceC0193d1 interfaceC0193d1 = (InterfaceC0193d1) obj3;
                C0233q1 c0233q1 = (C0233q1) obj2;
                C2623l c2623l = (C2623l) obj;
                if (interfaceC0193d1.isCommandAvailable(29)) {
                    interfaceC0193d1.setTrackSelectionParameters(interfaceC0193d1.getTrackSelectionParameters().buildUpon().setOverrideForType(new C0236r1(c0233q1, AbstractC0983m0.m2168n(Integer.valueOf(c2623l.f9471b)))).setTrackTypeDisabled(c2623l.f9470a.f1538b.f1321c, false).build());
                    String str = c2623l.f9472c;
                    switch (c2609e.f9418f) {
                        case 0:
                            ((String[]) c2609e.f9419g.f9535o.f2702f)[1] = str;
                            break;
                    }
                    c2609e.f9417e.f9545t.dismiss();
                    break;
                }
                break;
            default:
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) obj4;
                C2648a1 c2648a1 = (C2648a1) obj3;
                TextView textView = (TextView) obj2;
                ProgressBar progressBar = (ProgressBar) obj;
                int i4 = SeriesDetailActivity.f3003k0;
                C2945g0 c2945g0 = C2945g0.f10965a;
                String str2 = c2648a1.f9641f;
                int i8 = c2648a1.f9636a;
                if (!C2945g0.m5098e(str2) && !seriesDetailActivity.f3019W) {
                    seriesDetailActivity.f3019W = true;
                    seriesDetailActivity.f3017U = textView;
                    seriesDetailActivity.f3018V = progressBar;
                    textView.setVisibility(8);
                    progressBar.setVisibility(0);
                    String str3 = seriesDetailActivity.f3025c0 + "  S" + SeriesDetailActivity.m1736A(seriesDetailActivity.f3027e0) + "E" + SeriesDetailActivity.m1736A(i8);
                    int i9 = seriesDetailActivity.f3027e0;
                    int i10 = c2648a1.f9642g;
                    StringBuilder sbM19o = AbstractC0008a1.m19o(i9, i8, "play S", "E", " (tmdb episode ");
                    sbM19o.append(i10);
                    sbM19o.append(")");
                    Log.i("SeriesDetail", sbM19o.toString());
                    String strValueOf = String.valueOf(seriesDetailActivity.f3024b0);
                    int i11 = seriesDetailActivity.f3027e0;
                    int i12 = c2648a1.f9636a;
                    C2688s0 c2688s0 = new C2688s0(2, seriesDetailActivity);
                    int i13 = c2648a1.f9642g;
                    AbstractC2980h.m5136e("id", strValueOf);
                    AbstractC1339x.m2850k(AbstractC0147m0.m566e(seriesDetailActivity), null, new C0670i(c2688s0, strValueOf, i11, i12, seriesDetailActivity, str3, i13, null), 3);
                    break;
                }
                break;
        }
    }
}
