package p092k5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.RunnableC0127c0;
import com.google.android.material.carousel.CarouselLayoutManager;
import p193w2.C2627o;
import p193w2.C2632t;
import p193w2.RunnableC2628p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k5.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC1602a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6100a;

    /* renamed from: b */
    public final /* synthetic */ Object f6101b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1602a(int i, Object obj) {
        this.f6100a = i;
        this.f6101b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i8, int i9, int i10, int i11, int i12, int i13) {
        int height;
        int height2;
        switch (this.f6100a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f6101b;
                if (i8 - i != i12 - i10 || i9 - i4 != i13 - i11) {
                    view.post(new RunnableC0127c0(15, carouselLayoutManager));
                    break;
                }
                break;
            case 1:
                C2627o c2627o = (C2627o) this.f6101b;
                int i14 = c2627o.f9547u;
                PopupWindow popupWindow = c2627o.f9545t;
                int i15 = i9 - i4;
                int i16 = i13 - i11;
                if ((i8 - i != i12 - i10 || i15 != i16) && popupWindow.isShowing()) {
                    c2627o.m4717q();
                    popupWindow.update(view, (c2627o.getWidth() - popupWindow.getWidth()) - i14, (-popupWindow.getHeight()) - i14, -1, -1);
                    break;
                }
                break;
            default:
                C2632t c2632t = (C2632t) this.f6101b;
                C2627o c2627o2 = c2632t.f9571a;
                int width = (c2627o2.getWidth() - c2627o2.getPaddingLeft()) - c2627o2.getPaddingRight();
                int height3 = (c2627o2.getHeight() - c2627o2.getPaddingBottom()) - c2627o2.getPaddingTop();
                ViewGroup viewGroup = c2632t.f9573c;
                int iM4721c = C2632t.m4721c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iM4721c, C2632t.m4721c(c2632t.f9581k) + C2632t.m4721c(c2632t.f9579i));
                ViewGroup viewGroup2 = c2632t.f9574d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z7 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (c2632t.f9568A != z7) {
                    c2632t.f9568A = z7;
                    view.post(new RunnableC2628p(c2632t, 1));
                }
                boolean z8 = i8 - i != i12 - i10;
                if (!c2632t.f9568A && z8) {
                    view.post(new RunnableC2628p(c2632t, 2));
                    break;
                }
                break;
        }
    }
}
