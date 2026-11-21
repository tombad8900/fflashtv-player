package p024c5;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.exotv.net.MovieDetailActivity;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.l */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0676l implements View.OnKeyListener {

    /* renamed from: j */
    public final /* synthetic */ int f2662j;

    /* renamed from: k */
    public final /* synthetic */ Object f2663k;

    public /* synthetic */ ViewOnKeyListenerC0676l(int i, Object obj) {
        this.f2662j = i;
        this.f2663k = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i4 = this.f2662j;
        Object obj = this.f2663k;
        switch (i4) {
            case 0:
                C0682o c0682o = (C0682o) obj;
                if (keyEvent.getAction() == 0) {
                    if (i != 21 ? i != 22 ? false : ((Boolean) c0682o.f2676f.invoke()).booleanValue() : ((Boolean) c0682o.f2675e.invoke()).booleanValue()) {
                        return true;
                    }
                }
                return false;
            case 1:
                return i == 22 && keyEvent.getAction() == 0 && ((Boolean) ((C0702y) obj).f2737b.invoke()).booleanValue();
            default:
                MovieDetailActivity movieDetailActivity = (MovieDetailActivity) obj;
                int i8 = MovieDetailActivity.f2918Y;
                if (i != 19 || keyEvent.getAction() != 0) {
                    return false;
                }
                TextView textView = movieDetailActivity.f2924M;
                if (textView == null) {
                    AbstractC2980h.m5139h("back");
                    throw null;
                }
                textView.requestFocus();
                ScrollView scrollView = movieDetailActivity.f2922K;
                if (scrollView != null) {
                    scrollView.smoothScrollTo(0, 0);
                    return true;
                }
                AbstractC2980h.m5139h("pageScroll");
                throw null;
        }
    }
}
