package p195w4;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.exotv.net.PlayerActivity;
import com.exotv.net.SeriesDetailActivity;
import java.util.ArrayList;
import p006a5.C0107b;
import p062h.AbstractActivityC1083i;
import p111m6.AbstractC1914i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalFocusChangeListenerC2672k0 implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: j */
    public final /* synthetic */ int f9710j;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC1083i f9711k;

    public /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC2672k0(AbstractActivityC1083i abstractActivityC1083i, int i) {
        this.f9710j = i;
        this.f9711k = abstractActivityC1083i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        int i = this.f9710j;
        AbstractActivityC1083i abstractActivityC1083i = this.f9711k;
        switch (i) {
            case 0:
                PlayerActivity playerActivity = (PlayerActivity) abstractActivityC1083i;
                C0107b c0107b = playerActivity.f2937H;
                if (c0107b == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b.f535l.getVisibility() != 0 || playerActivity.isFinishing() || playerActivity.isDestroyed()) {
                    return;
                }
                C0107b c0107b2 = playerActivity.f2937H;
                if (c0107b2 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                View view3 = c0107b2.f537n;
                if (view2 == view3 || view2 == c0107b2.f536m) {
                    playerActivity.f2975t0 = view2;
                    return;
                }
                View view4 = playerActivity.f2975t0;
                if (view4 != null) {
                    view3 = view4;
                }
                view3.post(new RunnableC2670j0(playerActivity, view3, 1));
                return;
            default:
                final SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) abstractActivityC1083i;
                ArrayList arrayList = seriesDetailActivity.f3010N;
                if (view2 == null || !arrayList.contains(view2)) {
                    view2 = null;
                }
                if (view2 == null) {
                    int i4 = SeriesDetailActivity.f3003k0;
                    return;
                }
                final int iIndexOf = arrayList.indexOf(view2);
                if (iIndexOf < 0) {
                    return;
                }
                int i8 = iIndexOf + 2;
                int iM3752s0 = AbstractC1914i.m3752s0(arrayList);
                if (i8 > iM3752s0) {
                    i8 = iM3752s0;
                }
                Object obj = arrayList.get(i8);
                AbstractC2980h.m5135d("get(...)", obj);
                final View view5 = (View) obj;
                int i9 = iIndexOf - 2;
                if (i9 < 0) {
                    i9 = 0;
                }
                Object obj2 = arrayList.get(i9);
                AbstractC2980h.m5135d("get(...)", obj2);
                final View view6 = (View) obj2;
                ScrollView scrollView = seriesDetailActivity.f3006J;
                if (scrollView != null) {
                    scrollView.post(new Runnable() { // from class: w4.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SeriesDetailActivity seriesDetailActivity2 = seriesDetailActivity;
                            ScrollView scrollView2 = seriesDetailActivity2.f3006J;
                            if (scrollView2 == null) {
                                AbstractC2980h.m5139h("pageScroll");
                                throw null;
                            }
                            if (scrollView2.getHeight() == 0) {
                                return;
                            }
                            int iApplyDimension = (int) TypedValue.applyDimension(1, 36, seriesDetailActivity2.getResources().getDisplayMetrics());
                            if (iIndexOf >= 2) {
                                View view7 = view6;
                                if (view7.isShown()) {
                                    Rect rect = new Rect();
                                    view7.getDrawingRect(rect);
                                    ScrollView scrollView3 = seriesDetailActivity2.f3006J;
                                    if (scrollView3 == null) {
                                        AbstractC2980h.m5139h("pageScroll");
                                        throw null;
                                    }
                                    scrollView3.offsetDescendantRectToMyCoords(view7, rect);
                                    ScrollView scrollView4 = seriesDetailActivity2.f3006J;
                                    if (scrollView4 == null) {
                                        AbstractC2980h.m5139h("pageScroll");
                                        throw null;
                                    }
                                    int scrollY = scrollView4.getScrollY() + iApplyDimension;
                                    int i10 = rect.top;
                                    if (i10 < scrollY) {
                                        ScrollView scrollView5 = seriesDetailActivity2.f3006J;
                                        if (scrollView5 != null) {
                                            scrollView5.smoothScrollTo(0, i10 - iApplyDimension);
                                            return;
                                        } else {
                                            AbstractC2980h.m5139h("pageScroll");
                                            throw null;
                                        }
                                    }
                                }
                            }
                            View view8 = view5;
                            if (view8.isShown()) {
                                Rect rect2 = new Rect();
                                view8.getDrawingRect(rect2);
                                ScrollView scrollView6 = seriesDetailActivity2.f3006J;
                                if (scrollView6 == null) {
                                    AbstractC2980h.m5139h("pageScroll");
                                    throw null;
                                }
                                scrollView6.offsetDescendantRectToMyCoords(view8, rect2);
                                ScrollView scrollView7 = seriesDetailActivity2.f3006J;
                                if (scrollView7 == null) {
                                    AbstractC2980h.m5139h("pageScroll");
                                    throw null;
                                }
                                int scrollY2 = scrollView7.getScrollY();
                                ScrollView scrollView8 = seriesDetailActivity2.f3006J;
                                if (scrollView8 == null) {
                                    AbstractC2980h.m5139h("pageScroll");
                                    throw null;
                                }
                                int height = (scrollView8.getHeight() + scrollY2) - iApplyDimension;
                                int i11 = rect2.bottom;
                                if (i11 > height) {
                                    ScrollView scrollView9 = seriesDetailActivity2.f3006J;
                                    if (scrollView9 != null) {
                                        scrollView9.smoothScrollTo(0, (i11 - scrollView9.getHeight()) + iApplyDimension);
                                    } else {
                                        AbstractC2980h.m5139h("pageScroll");
                                        throw null;
                                    }
                                }
                            }
                        }
                    });
                    return;
                } else {
                    AbstractC2980h.m5139h("pageScroll");
                    throw null;
                }
        }
    }
}
