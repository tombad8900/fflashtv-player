package androidx.media3.exoplayer.analytics;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.exotv.net.p027ui.AdActivity;
import java.util.Set;
import p037e0.C0851b;
import p063h1.InterfaceC1122m;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0287i implements InterfaceC1122m, InterfaceC1833o {

    /* renamed from: j */
    public final /* synthetic */ int f1590j;

    /* renamed from: k */
    public final /* synthetic */ Object f1591k;

    /* renamed from: l */
    public final /* synthetic */ Object f1592l;

    public /* synthetic */ C0287i(Object obj, int i, Object obj2) {
        this.f1591k = obj;
        this.f1592l = obj2;
        this.f1590j = i;
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.f1591k, (C0226o0) this.f1592l, this.f1590j);
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        AdActivity adActivity = (AdActivity) this.f1591k;
        View view2 = (View) this.f1592l;
        Set set = AdActivity.f3036P;
        C0851b c0851bMo3563f = c1844r1.f6934a.mo3563f(647);
        int i = c0851bMo3563f.f3769a;
        int i4 = c0851bMo3563f.f3772d;
        view.setPadding(i, c0851bMo3563f.f3770b, c0851bMo3563f.f3771c, 0);
        Button button = adActivity.f3038I;
        if (button == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.f1590j + i4;
        button.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i4;
        view2.setLayoutParams(layoutParams2);
        return C1844r1.f6933b;
    }
}
