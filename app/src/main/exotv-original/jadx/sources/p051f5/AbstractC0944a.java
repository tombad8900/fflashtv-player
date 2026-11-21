package p051f5;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p105m0.AbstractC1828m0;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f5.a */
/* loaded from: classes.dex */
public abstract class AbstractC0944a extends AbstractC2863a {

    /* renamed from: a */
    public C0945b f4151a;

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo1768r(coordinatorLayout, view, i);
        if (this.f4151a == null) {
            this.f4151a = new C0945b(view);
        }
        C0945b c0945b = this.f4151a;
        View view2 = (View) c0945b.f4154l;
        c0945b.f4152j = view2.getTop();
        c0945b.f4153k = view2.getLeft();
        C0945b c0945b2 = this.f4151a;
        View view3 = (View) c0945b2.f4154l;
        int top = 0 - (view3.getTop() - c0945b2.f4152j);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0945b2.f4153k));
        return true;
    }

    /* renamed from: r */
    public void mo1768r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m514q(view, i);
    }
}
