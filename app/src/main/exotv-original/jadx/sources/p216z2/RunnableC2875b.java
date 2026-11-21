package p216z2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.b */
/* loaded from: classes.dex */
public final class RunnableC2875b implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f10613j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f10614k;

    /* renamed from: l */
    public final /* synthetic */ C2891h f10615l;

    public /* synthetic */ RunnableC2875b(C2891h c2891h, ArrayList arrayList, int i) {
        this.f10613j = i;
        this.f10615l = c2891h;
        this.f10614k = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10613j) {
            case 0:
                ArrayList arrayList = this.f10614k;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    C2891h c2891h = this.f10615l;
                    if (i >= size) {
                        arrayList.clear();
                        c2891h.f10700m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        C2889g c2889g = (C2889g) obj;
                        AbstractC2920v0 abstractC2920v0 = c2889g.f10684a;
                        int i4 = c2889g.f10685b;
                        int i8 = c2889g.f10686c;
                        int i9 = c2889g.f10687d;
                        int i10 = c2889g.f10688e;
                        c2891h.getClass();
                        View view = abstractC2920v0.f10848a;
                        int i11 = i9 - i4;
                        int i12 = i10 - i8;
                        if (i11 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i12 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c2891h.f10703p.add(abstractC2920v0);
                        viewPropertyAnimatorAnimate.setDuration(c2891h.f10620e).setListener(new C2881d(c2891h, abstractC2920v0, i11, view, i12, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f10614k;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    C2891h c2891h2 = this.f10615l;
                    if (i13 >= size2) {
                        arrayList2.clear();
                        c2891h2.f10701n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        C2887f c2887f = (C2887f) obj2;
                        ArrayList arrayList3 = c2891h2.f10705r;
                        long j = c2891h2.f10621f;
                        AbstractC2920v0 abstractC2920v02 = c2887f.f10663a;
                        View view2 = abstractC2920v02 == null ? null : abstractC2920v02.f10848a;
                        AbstractC2920v0 abstractC2920v03 = c2887f.f10664b;
                        View view3 = abstractC2920v03 != null ? abstractC2920v03.f10848a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c2887f.f10663a);
                            duration.translationX(c2887f.f10667e - c2887f.f10665c);
                            duration.translationY(c2887f.f10668f - c2887f.f10666d);
                            duration.alpha(0.0f).setListener(new C2884e(c2891h2, c2887f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c2887f.f10664b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C2884e(c2891h2, c2887f, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f10614k;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (true) {
                    C2891h c2891h3 = this.f10615l;
                    if (i14 >= size3) {
                        arrayList4.clear();
                        c2891h3.f10699l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        AbstractC2920v0 abstractC2920v04 = (AbstractC2920v0) obj3;
                        c2891h3.getClass();
                        View view4 = abstractC2920v04.f10848a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c2891h3.f10702o.add(abstractC2920v04);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c2891h3.f10618c).setListener(new C2878c(c2891h3, abstractC2920v04, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
