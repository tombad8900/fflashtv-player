package p024c5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2928z0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.h0 */
/* loaded from: classes.dex */
public final class C0668h0 extends AbstractC2928z0 {

    /* renamed from: c */
    public final C0656d0 f2621c;

    /* renamed from: d */
    public int f2622d = -1;

    /* renamed from: e */
    public float f2623e = Float.NaN;

    public C0668h0(C0656d0 c0656d0) {
        this.f2621c = c0656d0;
    }

    /* renamed from: g */
    public static float m1436g(AbstractC2888f0 abstractC2888f0, View view, ViewGroup viewGroup) {
        float width = (((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / 2.0f) + viewGroup.getPaddingLeft();
        float width2 = view.getWidth();
        if (width2 < 1.0f) {
            width2 = 1.0f;
        }
        float right = width - ((view.getRight() + view.getLeft()) / 2.0f);
        abstractC2888f0.getClass();
        return (right / width2) + AbstractC2888f0.m4983H(view);
    }

    /* renamed from: h */
    public static ViewGroup m1437h(AbstractC2888f0 abstractC2888f0) {
        LinearLayoutManager linearLayoutManager = abstractC2888f0 instanceof LinearLayoutManager ? (LinearLayoutManager) abstractC2888f0 : null;
        if (linearLayoutManager != null) {
            View viewMo1139q = ((LinearLayoutManager) abstractC2888f0).mo1139q(linearLayoutManager.m1109M0());
            ViewParent parent = viewMo1139q != null ? viewMo1139q.getParent() : null;
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
        }
        return null;
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: b */
    public final int[] mo1438b(AbstractC2888f0 abstractC2888f0, View view) {
        AbstractC2980h.m5136e("layoutManager", abstractC2888f0);
        AbstractC2980h.m5136e("view", view);
        ViewGroup viewGroupM1437h = m1437h(abstractC2888f0);
        if (viewGroupM1437h == null) {
            return new int[0];
        }
        int iM4983H = this.f2622d;
        if (iM4983H == -1) {
            iM4983H = AbstractC2888f0.m4983H(view);
        }
        this.f2622d = -1;
        float width = view.getWidth();
        if (width < 1.0f) {
            width = 1.0f;
        }
        int iM1560f0 = AbstractC0715d.m1560f0((iM4983H - m1436g(abstractC2888f0, view, viewGroupM1437h)) * width);
        if (Math.abs(iM1560f0) <= 2) {
            iM1560f0 = 0;
        }
        return new int[]{iM1560f0, 0};
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: d */
    public final View mo1439d(AbstractC2888f0 abstractC2888f0) {
        ViewGroup viewGroupM1437h = m1437h(abstractC2888f0);
        View view = null;
        if (viewGroupM1437h == null) {
            return null;
        }
        float width = (((viewGroupM1437h.getWidth() - viewGroupM1437h.getPaddingLeft()) - viewGroupM1437h.getPaddingRight()) / 2.0f) + viewGroupM1437h.getPaddingLeft();
        int childCount = viewGroupM1437h.getChildCount();
        float f8 = Float.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroupM1437h.getChildAt(i);
            float fAbs = Math.abs(((childAt.getRight() + childAt.getLeft()) / 2.0f) - width);
            if (fAbs < f8) {
                view = childAt;
                f8 = fAbs;
            }
        }
        return view;
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: e */
    public final int mo1440e(AbstractC2888f0 abstractC2888f0, int i, int i4) {
        View viewMo1439d = mo1439d(abstractC2888f0);
        int iM1534t = 0;
        if (viewMo1439d == null) {
            return 0;
        }
        ViewGroup viewGroupM1437h = m1437h(abstractC2888f0);
        if (viewGroupM1437h == null) {
            return AbstractC2888f0.m4983H(viewMo1439d);
        }
        int iIntValue = ((Number) this.f2621c.invoke()).intValue() - 1;
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        float fM1436g = m1436g(abstractC2888f0, viewMo1439d, viewGroupM1437h);
        if (Float.isNaN(this.f2623e)) {
            this.f2623e = fM1436g;
        }
        int iM1560f0 = AbstractC0715d.m1560f0(this.f2623e);
        float f8 = fM1436g - this.f2623e;
        if (Math.abs(f8) < 0.12f) {
            iM1534t = AbstractC0714c.m1534t(iM1560f0, 0, iIntValue);
        } else if (f8 > 0.0f) {
            iM1534t = iM1560f0 + 1;
            if (iM1534t > iIntValue) {
                iM1534t = iIntValue;
            }
        } else {
            int i8 = iM1560f0 - 1;
            if (i8 >= 0) {
                iM1534t = i8;
            }
        }
        this.f2622d = iM1534t;
        return iM1534t;
    }
}
