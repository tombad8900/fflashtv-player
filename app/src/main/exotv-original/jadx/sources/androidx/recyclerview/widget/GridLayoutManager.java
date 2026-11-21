package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p063h1.C1131v;
import p105m0.AbstractC1828m0;
import p114n0.C1952d;
import p156s.C2332e;
import p168t2.C2430x;
import p216z2.AbstractC2888f0;
import p216z2.C2890g0;
import p216z2.C2900l0;
import p216z2.C2901m;
import p216z2.C2905o;
import p216z2.C2907p;
import p216z2.C2912r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f1981E;

    /* renamed from: F */
    public int f1982F;

    /* renamed from: G */
    public int[] f1983G;

    /* renamed from: H */
    public View[] f1984H;

    /* renamed from: I */
    public final SparseIntArray f1985I;

    /* renamed from: J */
    public final SparseIntArray f1986J;

    /* renamed from: K */
    public final C2332e f1987K;

    /* renamed from: L */
    public final Rect f1988L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f1981E = false;
        this.f1982F = -1;
        this.f1985I = new SparseIntArray();
        this.f1986J = new SparseIntArray();
        this.f1987K = new C2332e(10);
        this.f1988L = new Rect();
        m1091o1(AbstractC2888f0.m4984I(context, attributeSet, i, i4).f10656b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: B0 */
    public final boolean mo1061B0() {
        return this.f2003z == null && !this.f1981E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D0 */
    public final void mo1062D0(C2912r0 c2912r0, C2907p c2907p, C1131v c1131v) {
        int i;
        int i4 = this.f1982F;
        for (int i8 = 0; i8 < this.f1982F && (i = c2907p.f10784d) >= 0 && i < c2912r0.m5052b() && i4 > 0; i8++) {
            c1131v.m2484a(c2907p.f10784d, Math.max(0, c2907p.f10787g));
            this.f1987K.getClass();
            i4--;
            c2907p.f10784d += c2907p.f10785e;
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: J */
    public final int mo1063J(C2900l0 c2900l0, C2912r0 c2912r0) {
        if (this.f1993p == 0) {
            return this.f1982F;
        }
        if (c2912r0.m5052b() < 1) {
            return 0;
        }
        return m1083k1(c2912r0.m5052b() - 1, c2900l0, c2912r0) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Q0 */
    public final View mo1064Q0(C2900l0 c2900l0, C2912r0 c2912r0, boolean z7, boolean z8) {
        int i;
        int iM5010v;
        int iM5010v2 = m5010v();
        int i4 = 1;
        if (z8) {
            iM5010v = m5010v() - 1;
            i = -1;
            i4 = -1;
        } else {
            i = iM5010v2;
            iM5010v = 0;
        }
        int iM5052b = c2912r0.m5052b();
        m1104I0();
        int iMo4516k = this.f1995r.mo4516k();
        int iMo4512g = this.f1995r.mo4512g();
        View view = null;
        View view2 = null;
        while (iM5010v != i) {
            View viewM5008u = m5008u(iM5010v);
            int iM4983H = AbstractC2888f0.m4983H(viewM5008u);
            if (iM4983H >= 0 && iM4983H < iM5052b && m1085l1(iM4983H, c2900l0, c2912r0) == 0) {
                if (((C2890g0) viewM5008u.getLayoutParams()).f10689a.m5068h()) {
                    if (view2 == null) {
                        view2 = viewM5008u;
                    }
                } else {
                    if (this.f1995r.mo4510e(viewM5008u) < iMo4512g && this.f1995r.mo4507b(viewM5008u) >= iMo4516k) {
                        return viewM5008u;
                    }
                    if (view == null) {
                        view = viewM5008u;
                    }
                }
            }
            iM5010v += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1065T(View view, int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        View viewM1156D;
        int iM5010v;
        int i4;
        int iM5010v2;
        View view2;
        int i8;
        int i9;
        C2900l0 c2900l02 = c2900l0;
        C2912r0 c2912r02 = c2912r0;
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView == null || (viewM1156D = recyclerView.m1156D(view)) == null || ((ArrayList) this.f10669a.f5232n).contains(viewM1156D)) {
            viewM1156D = null;
        }
        if (viewM1156D != null) {
            C2901m c2901m = (C2901m) viewM1156D.getLayoutParams();
            int i10 = c2901m.f10764e;
            int i11 = c2901m.f10765f + i10;
            if (super.mo1065T(view, i, c2900l0, c2912r0) != null) {
                if ((m1103H0(i) == 1) != this.f1998u) {
                    iM5010v2 = m5010v() - 1;
                    iM5010v = -1;
                    i4 = -1;
                } else {
                    iM5010v = m5010v();
                    i4 = 1;
                    iM5010v2 = 0;
                }
                boolean z7 = this.f1993p == 1 && m1119V0();
                int iM1083k1 = m1083k1(iM5010v2, c2900l02, c2912r02);
                View view3 = null;
                int i12 = -1;
                int i13 = -1;
                int iMin = 0;
                int i14 = iM5010v2;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i14 == iM5010v) {
                        break;
                    }
                    int iM1083k12 = m1083k1(i14, c2900l02, c2912r02);
                    View viewM5008u = m5008u(i14);
                    if (viewM5008u == viewM1156D) {
                        break;
                    }
                    if (!viewM5008u.hasFocusable() || iM1083k12 == iM1083k1) {
                        C2901m c2901m2 = (C2901m) viewM5008u.getLayoutParams();
                        int i15 = c2901m2.f10764e;
                        view2 = viewM1156D;
                        int i16 = c2901m2.f10765f + i15;
                        if (viewM5008u.hasFocusable() && i15 == i10 && i16 == i11) {
                            return viewM5008u;
                        }
                        if (!(viewM5008u.hasFocusable() && view3 == null) && (viewM5008u.hasFocusable() || view5 != null)) {
                            i8 = iM5010v;
                            int iMin3 = Math.min(i16, i11) - Math.max(i15, i10);
                            if (viewM5008u.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i9 = iMin;
                                }
                                i9 = iMin;
                            } else if (view3 == null) {
                                i9 = iMin;
                                if (!this.f10671c.m4153s(viewM5008u) || !this.f10672d.m4153s(viewM5008u)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z7 == (i15 > i12)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i9 = iMin;
                            }
                            i14 += i4;
                            c2900l02 = c2900l0;
                            c2912r02 = c2912r0;
                            viewM1156D = view2;
                            iM5010v = i8;
                        } else {
                            i9 = iMin;
                            i8 = iM5010v;
                        }
                        if (viewM5008u.hasFocusable()) {
                            int i17 = c2901m2.f10764e;
                            iMin = Math.min(i16, i11) - Math.max(i15, i10);
                            view3 = viewM5008u;
                            i13 = i17;
                            view4 = view5;
                        } else {
                            int i18 = c2901m2.f10764e;
                            view4 = viewM5008u;
                            i12 = i18;
                            iMin = i9;
                            iMin2 = Math.min(i16, i11) - Math.max(i15, i10);
                        }
                        i14 += i4;
                        c2900l02 = c2900l0;
                        c2912r02 = c2912r0;
                        viewM1156D = view2;
                        iM5010v = i8;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewM1156D;
                        i9 = iMin;
                        i8 = iM5010v;
                    }
                    view4 = view5;
                    iMin = i9;
                    i14 += i4;
                    c2900l02 = c2900l0;
                    c2912r02 = c2912r0;
                    viewM1156D = view2;
                    iM5010v = i8;
                }
            }
        }
        return null;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: V */
    public final void mo1066V(C2900l0 c2900l0, C2912r0 c2912r0, C1952d c1952d) {
        super.mo1066V(c2900l0, c2912r0, c1952d);
        c1952d.m3818i(GridView.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W0 */
    public final void mo1067W0(C2900l0 c2900l0, C2912r0 c2912r0, C2907p c2907p, C2905o c2905o) {
        int i;
        int i4;
        int i8;
        int iMo4509d;
        int iM4996G;
        int iM4994E;
        int iMo4509d2;
        int iM4988w;
        int iM4988w2;
        ?? r12;
        int i9;
        View viewM5044b;
        int iMo4515j = this.f1995r.mo4515j();
        boolean z7 = iMo4515j != 1073741824;
        int i10 = m5010v() > 0 ? this.f1983G[this.f1982F] : 0;
        if (z7) {
            m1092p1();
        }
        boolean z8 = c2907p.f10785e == 1;
        int iM1085l1 = this.f1982F;
        if (!z8) {
            iM1085l1 = m1085l1(c2907p.f10784d, c2900l0, c2912r0) + m1086m1(c2907p.f10784d, c2900l0, c2912r0);
        }
        int i11 = 0;
        while (i11 < this.f1982F && (i9 = c2907p.f10784d) >= 0 && i9 < c2912r0.m5052b() && iM1085l1 > 0) {
            int i12 = c2907p.f10784d;
            int iM1086m1 = m1086m1(i12, c2900l0, c2912r0);
            if (iM1086m1 > this.f1982F) {
                StringBuilder sbM19o = AbstractC0008a1.m19o(i12, iM1086m1, "Item at position ", " requires ", " spans but GridLayoutManager has only ");
                sbM19o.append(this.f1982F);
                sbM19o.append(" spans.");
                throw new IllegalArgumentException(sbM19o.toString());
            }
            iM1085l1 -= iM1086m1;
            if (iM1085l1 < 0 || (viewM5044b = c2907p.m5044b(c2900l0)) == null) {
                break;
            }
            this.f1984H[i11] = viewM5044b;
            i11++;
        }
        if (i11 == 0) {
            c2905o.f10777b = true;
            return;
        }
        if (z8) {
            i8 = 1;
            i4 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i4 = -1;
            i8 = -1;
        }
        int i13 = 0;
        while (i != i4) {
            View view = this.f1984H[i];
            C2901m c2901m = (C2901m) view.getLayoutParams();
            int iM1086m12 = m1086m1(AbstractC2888f0.m4983H(view), c2900l0, c2912r0);
            c2901m.f10765f = iM1086m12;
            c2901m.f10764e = i13;
            i13 += iM1086m12;
            i += i8;
        }
        float f8 = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.f1984H[i15];
            if (c2907p.f10791k != null) {
                r12 = 0;
                r12 = 0;
                if (z8) {
                    m4999b(view2, -1, true);
                } else {
                    m4999b(view2, 0, true);
                }
            } else if (z8) {
                r12 = 0;
                m4999b(view2, -1, false);
            } else {
                r12 = 0;
                m4999b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f10670b;
            Rect rect = this.f1988L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m1163N(view2));
            }
            m1088n1(view2, iMo4515j, r12);
            int iMo4508c = this.f1995r.mo4508c(view2);
            if (iMo4508c > i14) {
                i14 = iMo4508c;
            }
            float fMo4509d = (this.f1995r.mo4509d(view2) * 1.0f) / ((C2901m) view2.getLayoutParams()).f10765f;
            if (fMo4509d > f8) {
                f8 = fMo4509d;
            }
        }
        if (z7) {
            m1079h1(Math.max(Math.round(f8 * this.f1982F), i10));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.f1984H[i16];
                m1088n1(view3, 1073741824, true);
                int iMo4508c2 = this.f1995r.mo4508c(view3);
                if (iMo4508c2 > i14) {
                    i14 = iMo4508c2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.f1984H[i17];
            if (this.f1995r.mo4508c(view4) != i14) {
                C2901m c2901m2 = (C2901m) view4.getLayoutParams();
                Rect rect2 = c2901m2.f10690b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2901m2).topMargin + ((ViewGroup.MarginLayoutParams) c2901m2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c2901m2).leftMargin + ((ViewGroup.MarginLayoutParams) c2901m2).rightMargin;
                int iM1081j1 = m1081j1(c2901m2.f10764e, c2901m2.f10765f);
                if (this.f1993p == 1) {
                    iM4988w2 = AbstractC2888f0.m4988w(iM1081j1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c2901m2).width, false);
                    iM4988w = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    iM4988w = AbstractC2888f0.m4988w(iM1081j1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c2901m2).height, false);
                    iM4988w2 = iMakeMeasureSpec;
                }
                if (m5013y0(view4, iM4988w2, iM4988w, (C2890g0) view4.getLayoutParams())) {
                    view4.measure(iM4988w2, iM4988w);
                }
            }
        }
        c2905o.f10776a = i14;
        if (this.f1993p != 1) {
            if (c2907p.f10786f == -1) {
                int i20 = c2907p.f10782b;
                iM4994E = i20 - i14;
                iM4996G = 0;
                iMo4509d = i20;
            } else {
                int i21 = c2907p.f10782b;
                iMo4509d = i21 + i14;
                iM4996G = 0;
                iM4994E = i21;
            }
            iMo4509d2 = iM4996G;
        } else if (c2907p.f10786f == -1) {
            iMo4509d2 = c2907p.f10782b;
            iM4996G = iMo4509d2 - i14;
            iM4994E = 0;
            iMo4509d = 0;
        } else {
            int i22 = c2907p.f10782b;
            iMo4509d = 0;
            iM4996G = i22;
            iMo4509d2 = i22 + i14;
            iM4994E = 0;
        }
        for (int i23 = 0; i23 < i11; i23++) {
            View view5 = this.f1984H[i23];
            C2901m c2901m3 = (C2901m) view5.getLayoutParams();
            if (this.f1993p != 1) {
                iM4996G = m4996G() + this.f1983G[c2901m3.f10764e];
                iMo4509d2 = this.f1995r.mo4509d(view5) + iM4996G;
            } else if (m1119V0()) {
                int iM4994E2 = m4994E() + this.f1983G[this.f1982F - c2901m3.f10764e];
                iMo4509d = iM4994E2;
                iM4994E = iM4994E2 - this.f1995r.mo4509d(view5);
            } else {
                iM4994E = m4994E() + this.f1983G[c2901m3.f10764e];
                iMo4509d = this.f1995r.mo4509d(view5) + iM4994E;
            }
            AbstractC2888f0.m4986N(view5, iM4994E, iM4996G, iMo4509d, iMo4509d2);
            if (c2901m3.f10689a.m5068h() || c2901m3.f10689a.m5071k()) {
                c2905o.f10778c = true;
            }
            c2905o.f10779d = view5.hasFocusable() | c2905o.f10779d;
        }
        Arrays.fill(this.f1984H, (Object) null);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: X */
    public final void mo1068X(C2900l0 c2900l0, C2912r0 c2912r0, View view, C1952d c1952d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2901m)) {
            m4998W(view, c1952d);
            return;
        }
        C2901m c2901m = (C2901m) layoutParams;
        int iM1083k1 = m1083k1(c2901m.f10689a.m5062b(), c2900l0, c2912r0);
        if (this.f1993p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c2901m.f10764e, c2901m.f10765f, iM1083k1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM1083k1, 1, c2901m.f10764e, c2901m.f10765f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: X0 */
    public final void mo1069X0(C2900l0 c2900l0, C2912r0 c2912r0, C2430x c2430x, int i) {
        m1092p1();
        if (c2912r0.m5052b() > 0 && !c2912r0.f10825g) {
            boolean z7 = i == 1;
            int iM1085l1 = m1085l1(c2430x.f8759b, c2900l0, c2912r0);
            if (z7) {
                while (iM1085l1 > 0) {
                    int i4 = c2430x.f8759b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i8 = i4 - 1;
                    c2430x.f8759b = i8;
                    iM1085l1 = m1085l1(i8, c2900l0, c2912r0);
                }
            } else {
                int iM5052b = c2912r0.m5052b() - 1;
                int i9 = c2430x.f8759b;
                while (i9 < iM5052b) {
                    int i10 = i9 + 1;
                    int iM1085l12 = m1085l1(i10, c2900l0, c2912r0);
                    if (iM1085l12 <= iM1085l1) {
                        break;
                    }
                    i9 = i10;
                    iM1085l1 = iM1085l12;
                }
                c2430x.f8759b = i9;
            }
        }
        m1080i1();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Y */
    public final void mo1070Y(int i, int i4) {
        C2332e c2332e = this.f1987K;
        c2332e.m4152r();
        ((SparseIntArray) c2332e.f8171l).clear();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Z */
    public final void mo1071Z() {
        C2332e c2332e = this.f1987K;
        c2332e.m4152r();
        ((SparseIntArray) c2332e.f8171l).clear();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: a0 */
    public final void mo1072a0(int i, int i4) {
        C2332e c2332e = this.f1987K;
        c2332e.m4152r();
        ((SparseIntArray) c2332e.f8171l).clear();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: b0 */
    public final void mo1073b0(int i, int i4) {
        C2332e c2332e = this.f1987K;
        c2332e.m4152r();
        ((SparseIntArray) c2332e.f8171l).clear();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: c0 */
    public final void mo1074c0(int i, int i4) {
        C2332e c2332e = this.f1987K;
        c2332e.m4152r();
        ((SparseIntArray) c2332e.f8171l).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: d0 */
    public final void mo1075d0(C2900l0 c2900l0, C2912r0 c2912r0) {
        boolean z7 = c2912r0.f10825g;
        SparseIntArray sparseIntArray = this.f1986J;
        SparseIntArray sparseIntArray2 = this.f1985I;
        if (z7) {
            int iM5010v = m5010v();
            for (int i = 0; i < iM5010v; i++) {
                C2901m c2901m = (C2901m) m5008u(i).getLayoutParams();
                int iM5062b = c2901m.f10689a.m5062b();
                sparseIntArray2.put(iM5062b, c2901m.f10765f);
                sparseIntArray.put(iM5062b, c2901m.f10764e);
            }
        }
        super.mo1075d0(c2900l0, c2912r0);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: d1 */
    public final void mo1076d1(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1076d1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: e0 */
    public final void mo1077e0(C2912r0 c2912r0) {
        super.mo1077e0(c2912r0);
        this.f1981E = false;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: f */
    public final boolean mo1078f(C2890g0 c2890g0) {
        return c2890g0 instanceof C2901m;
    }

    /* renamed from: h1 */
    public final void m1079h1(int i) {
        int i4;
        int[] iArr = this.f1983G;
        int i8 = this.f1982F;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i8 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i / i8;
        int i11 = i % i8;
        int i12 = 0;
        for (int i13 = 1; i13 <= i8; i13++) {
            i9 += i11;
            if (i9 <= 0 || i8 - i9 >= i11) {
                i4 = i10;
            } else {
                i4 = i10 + 1;
                i9 -= i8;
            }
            i12 += i4;
            iArr[i13] = i12;
        }
        this.f1983G = iArr;
    }

    /* renamed from: i1 */
    public final void m1080i1() {
        View[] viewArr = this.f1984H;
        if (viewArr == null || viewArr.length != this.f1982F) {
            this.f1984H = new View[this.f1982F];
        }
    }

    /* renamed from: j1 */
    public final int m1081j1(int i, int i4) {
        if (this.f1993p != 1 || !m1119V0()) {
            int[] iArr = this.f1983G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.f1983G;
        int i8 = this.f1982F;
        return iArr2[i8 - i] - iArr2[(i8 - i) - i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: k */
    public final int mo1082k(C2912r0 c2912r0) {
        return m1101F0(c2912r0);
    }

    /* renamed from: k1 */
    public final int m1083k1(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        boolean z7 = c2912r0.f10825g;
        C2332e c2332e = this.f1987K;
        if (!z7) {
            int i4 = this.f1982F;
            c2332e.getClass();
            return C2332e.m4145q(i, i4);
        }
        int iM5030b = c2900l0.m5030b(i);
        if (iM5030b != -1) {
            int i8 = this.f1982F;
            c2332e.getClass();
            return C2332e.m4145q(iM5030b, i8);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: l */
    public final int mo1084l(C2912r0 c2912r0) {
        return m1102G0(c2912r0);
    }

    /* renamed from: l1 */
    public final int m1085l1(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        boolean z7 = c2912r0.f10825g;
        C2332e c2332e = this.f1987K;
        if (!z7) {
            int i4 = this.f1982F;
            c2332e.getClass();
            return i % i4;
        }
        int i8 = this.f1986J.get(i, -1);
        if (i8 != -1) {
            return i8;
        }
        int iM5030b = c2900l0.m5030b(i);
        if (iM5030b != -1) {
            int i9 = this.f1982F;
            c2332e.getClass();
            return iM5030b % i9;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: m1 */
    public final int m1086m1(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        boolean z7 = c2912r0.f10825g;
        C2332e c2332e = this.f1987K;
        if (!z7) {
            c2332e.getClass();
            return 1;
        }
        int i4 = this.f1985I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (c2900l0.m5030b(i) != -1) {
            c2332e.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: n */
    public final int mo1087n(C2912r0 c2912r0) {
        return m1101F0(c2912r0);
    }

    /* renamed from: n1 */
    public final void m1088n1(View view, int i, boolean z7) {
        int iM4988w;
        int iM4988w2;
        C2901m c2901m = (C2901m) view.getLayoutParams();
        Rect rect = c2901m.f10690b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2901m).topMargin + ((ViewGroup.MarginLayoutParams) c2901m).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2901m).leftMargin + ((ViewGroup.MarginLayoutParams) c2901m).rightMargin;
        int iM1081j1 = m1081j1(c2901m.f10764e, c2901m.f10765f);
        if (this.f1993p == 1) {
            iM4988w2 = AbstractC2888f0.m4988w(iM1081j1, i, i8, ((ViewGroup.MarginLayoutParams) c2901m).width, false);
            iM4988w = AbstractC2888f0.m4988w(this.f1995r.mo4517l(), this.f10681m, i4, ((ViewGroup.MarginLayoutParams) c2901m).height, true);
        } else {
            int iM4988w3 = AbstractC2888f0.m4988w(iM1081j1, i, i4, ((ViewGroup.MarginLayoutParams) c2901m).height, false);
            int iM4988w4 = AbstractC2888f0.m4988w(this.f1995r.mo4517l(), this.f10680l, i8, ((ViewGroup.MarginLayoutParams) c2901m).width, true);
            iM4988w = iM4988w3;
            iM4988w2 = iM4988w4;
        }
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        if (z7 ? m5013y0(view, iM4988w2, iM4988w, c2890g0) : m5012w0(view, iM4988w2, iM4988w, c2890g0)) {
            view.measure(iM4988w2, iM4988w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: o */
    public final int mo1089o(C2912r0 c2912r0) {
        return m1102G0(c2912r0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: o0 */
    public final int mo1090o0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        m1092p1();
        m1080i1();
        return super.mo1090o0(i, c2900l0, c2912r0);
    }

    /* renamed from: o1 */
    public final void m1091o1(int i) {
        if (i == this.f1982F) {
            return;
        }
        this.f1981E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Span count should be at least 1. Provided "));
        }
        this.f1982F = i;
        this.f1987K.m4152r();
        m5004n0();
    }

    /* renamed from: p1 */
    public final void m1092p1() {
        int iM4993D;
        int iM4996G;
        if (this.f1993p == 1) {
            iM4993D = this.f10682n - m4995F();
            iM4996G = m4994E();
        } else {
            iM4993D = this.f10683o - m4993D();
            iM4996G = m4996G();
        }
        m1079h1(iM4993D - iM4996G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: q0 */
    public final int mo1093q0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        m1092p1();
        m1080i1();
        return super.mo1093q0(i, c2900l0, c2912r0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: r */
    public final C2890g0 mo1094r() {
        return this.f1993p == 0 ? new C2901m(-2, -1) : new C2901m(-1, -2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: s */
    public final C2890g0 mo1095s(Context context, AttributeSet attributeSet) {
        C2901m c2901m = new C2901m(context, attributeSet);
        c2901m.f10764e = -1;
        c2901m.f10765f = 0;
        return c2901m;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: t */
    public final C2890g0 mo1096t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C2901m c2901m = new C2901m((ViewGroup.MarginLayoutParams) layoutParams);
            c2901m.f10764e = -1;
            c2901m.f10765f = 0;
            return c2901m;
        }
        C2901m c2901m2 = new C2901m(layoutParams);
        c2901m2.f10764e = -1;
        c2901m2.f10765f = 0;
        return c2901m2;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: t0 */
    public final void mo1097t0(Rect rect, int i, int i4) {
        int iM4987g;
        int iM4987g2;
        if (this.f1983G == null) {
            super.mo1097t0(rect, i, i4);
        }
        int iM4995F = m4995F() + m4994E();
        int iM4993D = m4993D() + m4996G();
        if (this.f1993p == 1) {
            int iHeight = rect.height() + iM4993D;
            RecyclerView recyclerView = this.f10670b;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            iM4987g2 = AbstractC2888f0.m4987g(i4, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f1983G;
            iM4987g = AbstractC2888f0.m4987g(i, iArr[iArr.length - 1] + iM4995F, this.f10670b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4995F;
            RecyclerView recyclerView2 = this.f10670b;
            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
            iM4987g = AbstractC2888f0.m4987g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1983G;
            iM4987g2 = AbstractC2888f0.m4987g(i4, iArr2[iArr2.length - 1] + iM4993D, this.f10670b.getMinimumHeight());
        }
        this.f10670b.setMeasuredDimension(iM4987g, iM4987g2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: x */
    public final int mo1098x(C2900l0 c2900l0, C2912r0 c2912r0) {
        if (this.f1993p == 1) {
            return this.f1982F;
        }
        if (c2912r0.m5052b() < 1) {
            return 0;
        }
        return m1083k1(c2912r0.m5052b() - 1, c2900l0, c2912r0) + 1;
    }

    public GridLayoutManager(int i, int i4) {
        super(1);
        this.f1981E = false;
        this.f1982F = -1;
        this.f1985I = new SparseIntArray();
        this.f1986J = new SparseIntArray();
        this.f1987K = new C2332e(10);
        this.f1988L = new Rect();
        m1091o1(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1981E = false;
        this.f1982F = -1;
        this.f1985I = new SparseIntArray();
        this.f1986J = new SparseIntArray();
        this.f1987K = new C2332e(10);
        this.f1988L = new Rect();
        m1091o1(i);
    }
}
