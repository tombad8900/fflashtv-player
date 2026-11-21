package p024c5;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.SeriesDetailActivity;
import p111m6.AbstractC1914i;
import p195w4.C2663g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.q */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0686q implements View.OnKeyListener {

    /* renamed from: j */
    public final /* synthetic */ int f2684j;

    /* renamed from: k */
    public final /* synthetic */ int f2685k;

    /* renamed from: l */
    public final /* synthetic */ Object f2686l;

    public /* synthetic */ ViewOnKeyListenerC0686q(int i, int i4, Object obj) {
        this.f2684j = i4;
        this.f2686l = obj;
        this.f2685k = i;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i4 = this.f2684j;
        int i8 = this.f2685k;
        Object obj = this.f2686l;
        switch (i4) {
            case 0:
                C0692t c0692t = (C0692t) obj;
                if (i != 21 || keyEvent.getAction() != 0) {
                    return false;
                }
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                return (gridLayoutManager == null || i8 % gridLayoutManager.f1982F == 0) && ((Boolean) ((C2663g) c0692t.f2702f).invoke()).booleanValue();
            case 1:
                C0648a1 c0648a1 = (C0648a1) obj;
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i == 19) {
                    EditText editText = c0648a1.f2557g;
                    if (editText != null) {
                        return editText.requestFocus();
                    }
                    AbstractC2980h.m5139h("input");
                    throw null;
                }
                if (i == 20) {
                    LinearLayout linearLayout = c0648a1.f2560j;
                    if (linearLayout != null) {
                        return linearLayout.requestFocus();
                    }
                } else {
                    if (i != 22) {
                        return false;
                    }
                    EnumC0699w0[] enumC0699w0ArrValues = EnumC0699w0.values();
                    AbstractC2980h.m5136e("<this>", enumC0699w0ArrValues);
                    if (i8 != enumC0699w0ArrValues.length - 1) {
                        return false;
                    }
                }
                return true;
            default:
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) obj;
                int i9 = SeriesDetailActivity.f3003k0;
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i == 19) {
                    TextView textView = seriesDetailActivity.f3009M;
                    if (textView == null) {
                        AbstractC2980h.m5139h("back");
                        throw null;
                    }
                    textView.requestFocus();
                    ScrollView scrollView = seriesDetailActivity.f3006J;
                    if (scrollView == null) {
                        AbstractC2980h.m5139h("pageScroll");
                        throw null;
                    }
                    scrollView.smoothScrollTo(0, 0);
                } else if (i != 22 || i8 != AbstractC1914i.m3752s0(seriesDetailActivity.f3026d0)) {
                    return false;
                }
                return true;
        }
    }

    public /* synthetic */ ViewOnKeyListenerC0686q(int i, C0692t c0692t) {
        this.f2684j = 0;
        this.f2685k = i;
        this.f2686l = c0692t;
    }
}
