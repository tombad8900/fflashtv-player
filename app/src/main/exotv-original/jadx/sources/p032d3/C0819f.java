package p032d3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC0714c;
import java.util.HashMap;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.f */
/* loaded from: classes.dex */
public final class C0819f extends AbstractC0829n {

    /* renamed from: J */
    public static final String[] f3646J = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: K */
    public static final C0811b f3647K = new C0811b(PointF.class, "topLeft", 0);

    /* renamed from: L */
    public static final C0811b f3648L = new C0811b(PointF.class, "bottomRight", 1);

    /* renamed from: M */
    public static final C0811b f3649M = new C0811b(PointF.class, "bottomRight", 2);

    /* renamed from: N */
    public static final C0811b f3650N = new C0811b(PointF.class, "topLeft", 3);

    /* renamed from: O */
    public static final C0811b f3651O = new C0811b(PointF.class, "position", 4);

    /* renamed from: H */
    public static void m1977H(C0837v c0837v) {
        View view = c0837v.f3718b;
        HashMap map = c0837v.f3717a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: c */
    public final void mo1956c(C0837v c0837v) {
        m1977H(c0837v);
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: f */
    public final void mo1958f(C0837v c0837v) {
        m1977H(c0837v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p032d3.AbstractC0829n
    /* renamed from: j */
    public final Animator mo1978j(ViewGroup viewGroup, C0837v c0837v, C0837v c0837v2) {
        int i;
        C0819f c0819f;
        ObjectAnimator objectAnimatorM1987a;
        if (c0837v != null) {
            HashMap map = c0837v.f3717a;
            if (c0837v2 != null) {
                HashMap map2 = c0837v2.f3717a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c0837v2.f3718b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i4 = rect.left;
                    int i8 = rect2.left;
                    int i9 = rect.top;
                    int i10 = rect2.top;
                    int i11 = rect.right;
                    int i12 = rect2.right;
                    int i13 = rect.bottom;
                    int i14 = rect2.bottom;
                    int i15 = i11 - i4;
                    int i16 = i13 - i9;
                    int i17 = i12 - i8;
                    int i18 = i14 - i10;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
                        i = 0;
                    } else {
                        i = (i4 == i8 && i9 == i10) ? 0 : 1;
                        if (i11 != i12 || i13 != i14) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i19 = i;
                    if (i19 > 0) {
                        AbstractC0839x.m2007a(view, i4, i9, i11, i13);
                        if (i19 != 2) {
                            c0819f = this;
                            if (i4 == i8 && i9 == i10) {
                                c0819f.f3689E.getClass();
                                objectAnimatorM1987a = AbstractC0824i.m1987a(view, f3649M, C2819f.m4928p(i11, i13, i12, i14));
                            } else {
                                c0819f.f3689E.getClass();
                                objectAnimatorM1987a = AbstractC0824i.m1987a(view, f3650N, C2819f.m4928p(i4, i9, i8, i10));
                            }
                        } else if (i15 == i17 && i16 == i18) {
                            c0819f = this;
                            c0819f.f3689E.getClass();
                            objectAnimatorM1987a = AbstractC0824i.m1987a(view, f3651O, C2819f.m4928p(i4, i9, i8, i10));
                        } else {
                            c0819f = this;
                            C0817e c0817e = new C0817e(view);
                            c0819f.f3689E.getClass();
                            ObjectAnimator objectAnimatorM1987a2 = AbstractC0824i.m1987a(c0817e, f3647K, C2819f.m4928p(i4, i9, i8, i10));
                            c0819f.f3689E.getClass();
                            ObjectAnimator objectAnimatorM1987a3 = AbstractC0824i.m1987a(c0817e, f3648L, C2819f.m4928p(i11, i13, i12, i14));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM1987a2, objectAnimatorM1987a3);
                            animatorSet.addListener(new C0813c(c0817e));
                            objectAnimatorM1987a = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC0714c.m1514c0(viewGroup4, true);
                            c0819f.m1998n().m1992a(new C0815d(viewGroup4));
                        }
                        return objectAnimatorM1987a;
                    }
                }
            }
        }
        return null;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: p */
    public final String[] mo1979p() {
        return f3646J;
    }
}
