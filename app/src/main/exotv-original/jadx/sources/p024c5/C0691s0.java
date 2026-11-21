package p024c5;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.s0 */
/* loaded from: classes.dex */
public final class C0691s0 extends NestedScrollView {

    /* renamed from: O */
    public final int f2699O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691s0(LinearLayout linearLayout, int i) {
        super(linearLayout.getContext(), null);
        AbstractC2980h.m5136e("child", linearLayout);
        this.f2699O = i;
        setVerticalScrollBarEnabled(false);
        addView(linearLayout);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        AbstractC2980h.m5136e("child", view);
        AbstractC2980h.m5136e("rectangle", rect);
        int i = this.f2699O;
        if (i <= 0) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        Rect rect2 = new Rect(rect);
        rect2.top -= i;
        return super.requestChildRectangleOnScreen(view, rect2, z7);
    }
}
