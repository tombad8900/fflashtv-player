package p193w2;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import com.exotv.net.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2628p implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9559j;

    /* renamed from: k */
    public final /* synthetic */ C2632t f9560k;

    public /* synthetic */ RunnableC2628p(C2632t c2632t, int i) {
        this.f9559j = i;
        this.f9560k = c2632t;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Resources.NotFoundException {
        switch (this.f9559j) {
            case 0:
                this.f9560k.m4731k();
                break;
            case 1:
                C2632t c2632t = this.f9560k;
                View view = c2632t.f9580j;
                ViewGroup viewGroup = c2632t.f9575e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(c2632t.f9568A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = c2632t.f9571a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (c2632t.f9568A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof C2607d) {
                        C2607d c2607d = (C2607d) view;
                        Rect rect = c2607d.f9398j;
                        ValueAnimator valueAnimator = c2607d.f9387N;
                        if (c2632t.f9568A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c2607d.f9389P = true;
                            c2607d.f9388O = 0.0f;
                            c2607d.invalidate(rect);
                        } else {
                            int i = c2632t.f9596z;
                            if (i == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c2607d.f9389P = false;
                                c2607d.f9388O = 0.0f;
                                c2607d.invalidate(rect);
                            } else if (i != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c2607d.f9389P = false;
                                c2607d.f9388O = 1.0f;
                                c2607d.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = c2632t.f9595y;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    View view2 = (View) obj;
                    view2.setVisibility((c2632t.f9568A && C2632t.m4723j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                C2632t c2632t2 = this.f9560k;
                ValueAnimator valueAnimator2 = c2632t2.f9588r;
                View view3 = c2632t2.f9581k;
                C2627o c2627o = c2632t2.f9571a;
                ViewGroup viewGroup2 = c2632t2.f9577g;
                ViewGroup viewGroup3 = c2632t2.f9576f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (c2627o.getWidth() - c2627o.getPaddingLeft()) - c2627o.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iM4721c = C2632t.m4721c(c2632t2.f9579i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i8 = 0; i8 < childCount; i8++) {
                                iM4721c += C2632t.m4721c(viewGroup3.getChildAt(i8));
                            }
                            if (iM4721c <= width) {
                                ViewGroup viewGroup4 = c2632t2.f9578h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    c2632t2.f9587q.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            } else {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iM4721c += C2632t.m4721c(view3);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (int i9 = 0; i9 < childCount; i9++) {
                                    View childAt = viewGroup3.getChildAt(i9);
                                    iM4721c -= C2632t.m4721c(childAt);
                                    arrayList2.add(childAt);
                                    if (iM4721c <= width) {
                                        if (arrayList2.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList2.size());
                                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                                viewGroup2.addView((View) arrayList2.get(i10), viewGroup2.getChildCount() - 1);
                                            }
                                            break;
                                        }
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f9560k.f9584n.start();
                break;
            case 4:
                this.f9560k.f9583m.start();
                break;
            case 5:
                C2632t c2632t3 = this.f9560k;
                c2632t3.f9582l.start();
                c2632t3.m4726e(c2632t3.f9591u, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                break;
            default:
                this.f9560k.m4730i(2);
                break;
        }
    }
}
