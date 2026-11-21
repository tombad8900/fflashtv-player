package p032d3;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import p002a1.C0022h;
import p130p.C2186e;
import p130p.C2189h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.q */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0832q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    public AbstractC0829n f3709j;

    /* renamed from: k */
    public ViewGroup f3710k;

    /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C0022h c0022h;
        C2186e c2186e;
        C2186e c2186e2;
        int i4;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        C0826k c0826k;
        C0022h c0022h2;
        boolean z7;
        C0837v c0837v;
        View view;
        View view2;
        C0022h c0022h3;
        boolean z8;
        AbstractC0829n abstractC0829n = this.f3709j;
        ViewGroup viewGroup = this.f3710k;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z9 = true;
        if (!AbstractC0833r.f3713c.remove(viewGroup)) {
            return true;
        }
        C2186e c2186eM2003b = AbstractC0833r.m2003b();
        ArrayList arrayList2 = (ArrayList) c2186eM2003b.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC0829n);
            abstractC0829n.m1992a(new C0831p(this, c2186eM2003b));
            i = 0;
            abstractC0829n.m1994g(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((AbstractC0829n) obj).mo1963x(viewGroup);
                }
            }
            abstractC0829n.f3700t = new ArrayList();
            abstractC0829n.f3701u = new ArrayList();
            C0022h c0022h4 = abstractC0829n.f3696p;
            c0022h = abstractC0829n.f3697q;
            c2186e = new C2186e((C2186e) c0022h4.f78j);
            c2186e2 = new C2186e((C2186e) c0022h.f78j);
            i4 = 0;
            while (true) {
                iArr = abstractC0829n.f3699s;
                if (i4 < iArr.length) {
                    break;
                }
                int i12 = iArr[i4];
                if (i12 == z9) {
                    c0022h2 = c0022h;
                    z7 = z9;
                    for (int i13 = c2186e.f7656l - 1; i13 >= 0; i13--) {
                        View view3 = (View) c2186e.m3992f(i13);
                        if (view3 != null && abstractC0829n.m2000s(view3) && (c0837v = (C0837v) c2186e2.remove(view3)) != null && abstractC0829n.m2000s(c0837v.f3718b)) {
                            abstractC0829n.f3700t.add((C0837v) c2186e.mo3994h(i13));
                            abstractC0829n.f3701u.add(c0837v);
                        }
                    }
                } else if (i12 == 2) {
                    c0022h2 = c0022h;
                    z7 = z9;
                    C2186e c2186e3 = (C2186e) c0022h4.f81m;
                    C2186e c2186e4 = (C2186e) c0022h2.f81m;
                    int i14 = c2186e3.f7656l;
                    for (int i15 = 0; i15 < i14; i15++) {
                        View view4 = (View) c2186e3.m3996j(i15);
                        if (view4 != null && abstractC0829n.m2000s(view4) && (view = (View) c2186e4.get(c2186e3.m3992f(i15))) != null && abstractC0829n.m2000s(view)) {
                            C0837v c0837v2 = (C0837v) c2186e.get(view4);
                            C0837v c0837v3 = (C0837v) c2186e2.get(view);
                            if (c0837v2 != null && c0837v3 != null) {
                                abstractC0829n.f3700t.add(c0837v2);
                                abstractC0829n.f3701u.add(c0837v3);
                                c2186e.remove(view4);
                                c2186e2.remove(view);
                            }
                        }
                    }
                } else if (i12 == 3) {
                    z7 = z9;
                    SparseArray sparseArray = (SparseArray) c0022h4.f79k;
                    c0022h2 = c0022h;
                    SparseArray sparseArray2 = (SparseArray) c0022h2.f79k;
                    int size2 = sparseArray.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        View view5 = (View) sparseArray.valueAt(i16);
                        if (view5 != null && abstractC0829n.m2000s(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i16))) != null && abstractC0829n.m2000s(view2)) {
                            C0837v c0837v4 = (C0837v) c2186e.get(view5);
                            C0837v c0837v5 = (C0837v) c2186e2.get(view2);
                            if (c0837v4 != null && c0837v5 != null) {
                                abstractC0829n.f3700t.add(c0837v4);
                                abstractC0829n.f3701u.add(c0837v5);
                                c2186e.remove(view5);
                                c2186e2.remove(view2);
                            }
                        }
                    }
                } else if (i12 != 4) {
                    c0022h2 = c0022h;
                    z7 = z9;
                } else {
                    C2189h c2189h = (C2189h) c0022h4.f80l;
                    C2189h c2189h2 = (C2189h) c0022h.f80l;
                    int iM3969e = c2189h.m3969e();
                    int i17 = i;
                    while (i17 < iM3969e) {
                        View view6 = (View) c2189h.m3970f(i17);
                        if (view6 == null || !abstractC0829n.m2000s(view6)) {
                            c0022h3 = c0022h;
                        } else {
                            c0022h3 = c0022h;
                            View view7 = (View) c2189h2.m3966b(c2189h.m3967c(i17));
                            if (view7 != null && abstractC0829n.m2000s(view7)) {
                                C0837v c0837v6 = (C0837v) c2186e.get(view6);
                                C0837v c0837v7 = (C0837v) c2186e2.get(view7);
                                if (c0837v6 != null && c0837v7 != null) {
                                    z8 = z9;
                                    abstractC0829n.f3700t.add(c0837v6);
                                    abstractC0829n.f3701u.add(c0837v7);
                                    c2186e.remove(view6);
                                    c2186e2.remove(view7);
                                }
                            }
                            i17++;
                            c0022h = c0022h3;
                            z9 = z8;
                        }
                        z8 = z9;
                        i17++;
                        c0022h = c0022h3;
                        z9 = z8;
                    }
                    z7 = z9;
                    c0022h2 = c0022h;
                }
                i4++;
                c0022h = c0022h2;
                z9 = z7;
                i = 0;
            }
            boolean z10 = z9;
            for (i8 = 0; i8 < c2186e.f7656l; i8++) {
                C0837v c0837v8 = (C0837v) c2186e.m3996j(i8);
                if (abstractC0829n.m2000s(c0837v8.f3718b)) {
                    abstractC0829n.f3700t.add(c0837v8);
                    abstractC0829n.f3701u.add(null);
                }
            }
            for (i9 = 0; i9 < c2186e2.f7656l; i9++) {
                C0837v c0837v9 = (C0837v) c2186e2.m3996j(i9);
                if (abstractC0829n.m2000s(c0837v9.f3718b)) {
                    abstractC0829n.f3701u.add(c0837v9);
                    abstractC0829n.f3700t.add(null);
                }
            }
            C2186e c2186eM1989o = AbstractC0829n.m1989o();
            int i18 = c2186eM1989o.f7656l;
            WindowId windowId = viewGroup.getWindowId();
            i10 = i18 - 1;
            while (i10 >= 0) {
                Animator animator = (Animator) c2186eM1989o.m3992f(i10);
                if (animator != null && (c0826k = (C0826k) c2186eM1989o.get(animator)) != null) {
                    AbstractC0829n abstractC0829n2 = c0826k.f3674e;
                    View view8 = c0826k.f3670a;
                    if (view8 != null && windowId.equals(c0826k.f3673d)) {
                        C0837v c0837v10 = c0826k.f3672c;
                        boolean z11 = z10;
                        C0837v c0837vM1999q = abstractC0829n.m1999q(view8, z11);
                        C0837v c0837vM1997m = abstractC0829n.m1997m(view8, z11);
                        if (c0837vM1999q == null && c0837vM1997m == null) {
                            c0837vM1997m = (C0837v) ((C2186e) abstractC0829n.f3697q.f78j).get(view8);
                        }
                        if ((c0837vM1999q != null || c0837vM1997m != null) && abstractC0829n2.mo1986r(c0837v10, c0837vM1997m)) {
                            abstractC0829n2.m1998n().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c2186eM1989o.remove(animator);
                            }
                        }
                    }
                }
                i10--;
                z10 = true;
            }
            abstractC0829n.mo1960k(viewGroup, abstractC0829n.f3696p, abstractC0829n.f3697q, abstractC0829n.f3700t, abstractC0829n.f3701u);
            abstractC0829n.mo1964y();
            return true;
        }
        arrayList2 = new ArrayList();
        c2186eM2003b.put(viewGroup, arrayList2);
        arrayList2.add(abstractC0829n);
        abstractC0829n.m1992a(new C0831p(this, c2186eM2003b));
        i = 0;
        abstractC0829n.m1994g(viewGroup, false);
        if (arrayList != null) {
        }
        abstractC0829n.f3700t = new ArrayList();
        abstractC0829n.f3701u = new ArrayList();
        C0022h c0022h42 = abstractC0829n.f3696p;
        c0022h = abstractC0829n.f3697q;
        c2186e = new C2186e((C2186e) c0022h42.f78j);
        c2186e2 = new C2186e((C2186e) c0022h.f78j);
        i4 = 0;
        while (true) {
            iArr = abstractC0829n.f3699s;
            if (i4 < iArr.length) {
            }
            i4++;
            c0022h = c0022h2;
            z9 = z7;
            i = 0;
        }
        boolean z102 = z9;
        while (i8 < c2186e.f7656l) {
        }
        while (i9 < c2186e2.f7656l) {
        }
        C2186e c2186eM1989o2 = AbstractC0829n.m1989o();
        int i182 = c2186eM1989o2.f7656l;
        WindowId windowId2 = viewGroup.getWindowId();
        i10 = i182 - 1;
        while (i10 >= 0) {
        }
        abstractC0829n.mo1960k(viewGroup, abstractC0829n.f3696p, abstractC0829n.f3697q, abstractC0829n.f3700t, abstractC0829n.f3701u);
        abstractC0829n.mo1964y();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f3710k;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC0833r.f3713c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC0833r.m2003b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((AbstractC0829n) obj).mo1963x(viewGroup);
            }
        }
        this.f3709j.m1995h(true);
    }
}
