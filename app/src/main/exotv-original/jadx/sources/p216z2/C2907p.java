package p216z2;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.p */
/* loaded from: classes.dex */
public final class C2907p {

    /* renamed from: a */
    public boolean f10781a;

    /* renamed from: b */
    public int f10782b;

    /* renamed from: c */
    public int f10783c;

    /* renamed from: d */
    public int f10784d;

    /* renamed from: e */
    public int f10785e;

    /* renamed from: f */
    public int f10786f;

    /* renamed from: g */
    public int f10787g;

    /* renamed from: h */
    public int f10788h;

    /* renamed from: i */
    public int f10789i;

    /* renamed from: j */
    public int f10790j;

    /* renamed from: k */
    public List f10791k;

    /* renamed from: l */
    public boolean f10792l;

    /* renamed from: a */
    public final void m5043a(View view) {
        int iM5062b;
        int size = this.f10791k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((AbstractC2920v0) this.f10791k.get(i4)).f10848a;
            C2890g0 c2890g0 = (C2890g0) view3.getLayoutParams();
            if (view3 != view && !c2890g0.f10689a.m5068h() && (iM5062b = (c2890g0.f10689a.m5062b() - this.f10784d) * this.f10785e) >= 0 && iM5062b < i) {
                view2 = view3;
                if (iM5062b == 0) {
                    break;
                } else {
                    i = iM5062b;
                }
            }
        }
        if (view2 == null) {
            this.f10784d = -1;
        } else {
            this.f10784d = ((C2890g0) view2.getLayoutParams()).f10689a.m5062b();
        }
    }

    /* renamed from: b */
    public final View m5044b(C2900l0 c2900l0) {
        List list = this.f10791k;
        if (list == null) {
            View viewM5032d = c2900l0.m5032d(this.f10784d);
            this.f10784d += this.f10785e;
            return viewM5032d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC2920v0) this.f10791k.get(i)).f10848a;
            C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
            if (!c2890g0.f10689a.m5068h() && this.f10784d == c2890g0.f10689a.m5062b()) {
                m5043a(view);
                return view;
            }
        }
        return null;
    }
}
