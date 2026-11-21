package androidx.media3.exoplayer.source;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import com.exotv.net.R;
import com.exotv.net.SeriesDetailActivity;
import p037e0.C0851b;
import p063h1.InterfaceC1111f;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0447i implements InterfaceC1111f, InterfaceC1833o {

    /* renamed from: j */
    public final /* synthetic */ Object f1839j;

    /* renamed from: k */
    public final /* synthetic */ Object f1840k;

    /* renamed from: l */
    public final /* synthetic */ Object f1841l;

    public /* synthetic */ C0447i(Object obj, Object obj2, Object obj3) {
        this.f1839j = obj;
        this.f1840k = obj2;
        this.f1841l = obj3;
    }

    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f1839j).lambda$upstreamDiscarded$4((MediaSource.MediaPeriodId) this.f1840k, (MediaLoadData) this.f1841l, (MediaSourceEventListener) obj);
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) this.f1839j;
        LinearLayout linearLayout = (LinearLayout) this.f1840k;
        View view2 = (View) this.f1841l;
        int i = SeriesDetailActivity.f3003k0;
        C1835o1 c1835o1 = c1844r1.f6934a;
        C0851b c0851bMo3563f = c1835o1.mo3563f(647);
        seriesDetailActivity.f3022Z = !seriesDetailActivity.getResources().getBoolean(R.bool.is_large_screen) ? c1835o1.mo3563f(647).f3770b : c1835o1.mo3563f(128).f3770b;
        int i4 = c0851bMo3563f.f3769a;
        int i8 = c0851bMo3563f.f3772d;
        linearLayout.setPadding(i4, 0, c0851bMo3563f.f3771c, i8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = i8;
        view2.setLayoutParams(layoutParams2);
        TextView textView = seriesDetailActivity.f3009M;
        if (textView == null) {
            AbstractC2980h.m5139h("back");
            throw null;
        }
        textView.setTranslationX(c0851bMo3563f.f3769a);
        TextView textView2 = seriesDetailActivity.f3009M;
        if (textView2 != null) {
            textView2.setTranslationY(c0851bMo3563f.f3770b);
            return C1844r1.f6933b;
        }
        AbstractC2980h.m5139h("back");
        throw null;
    }
}
