package p024c5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.HorizontalScrollView;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.l0 */
/* loaded from: classes.dex */
public final class C0677l0 extends HorizontalScrollView {

    /* renamed from: j */
    public final int f2664j;

    public C0677l0(Context context, int i) {
        super(context);
        this.f2664j = i;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        AbstractC2980h.m5136e("child", view);
        AbstractC2980h.m5136e("rectangle", rect);
        int i = this.f2664j;
        if (i <= 0) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        Rect rect2 = new Rect(rect);
        rect2.left -= i;
        rect2.right += i;
        return super.requestChildRectangleOnScreen(view, rect2, z7);
    }
}
