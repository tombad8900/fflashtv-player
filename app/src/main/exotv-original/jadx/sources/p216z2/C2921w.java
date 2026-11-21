package p216z2;

import android.util.Log;
import android.view.View;
import androidx.media3.common.C0228p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.w */
/* loaded from: classes.dex */
public final class C2921w {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f10867a;

    public /* synthetic */ C2921w(RecyclerView recyclerView) {
        this.f10867a = recyclerView;
    }

    /* renamed from: a */
    public void m5077a(C2872a c2872a) {
        int i = c2872a.f10602a;
        RecyclerView recyclerView = this.f10867a;
        if (i == 1) {
            recyclerView.f2080w.mo1070Y(c2872a.f10603b, c2872a.f10605d);
            return;
        }
        if (i == 2) {
            recyclerView.f2080w.mo1073b0(c2872a.f10603b, c2872a.f10605d);
        } else if (i == 4) {
            recyclerView.f2080w.mo1074c0(c2872a.f10603b, c2872a.f10605d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f2080w.mo1072a0(c2872a.f10603b, c2872a.f10605d);
        }
    }

    /* renamed from: b */
    public AbstractC2920v0 m5078b(int i) {
        RecyclerView recyclerView = this.f10867a;
        int iM2731j = recyclerView.f2064o.m2731j();
        int i4 = 0;
        AbstractC2920v0 abstractC2920v0 = null;
        while (true) {
            if (i4 >= iM2731j) {
                break;
            }
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(recyclerView.f2064o.m2730i(i4));
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5068h() && abstractC2920v0M1144M.f10850c == i) {
                if (!((ArrayList) recyclerView.f2064o.f5232n).contains(abstractC2920v0M1144M.f10848a)) {
                    abstractC2920v0 = abstractC2920v0M1144M;
                    break;
                }
                abstractC2920v0 = abstractC2920v0M1144M;
            }
            i4++;
        }
        if (abstractC2920v0 != null) {
            if (!((ArrayList) recyclerView.f2064o.f5232n).contains(abstractC2920v0.f10848a)) {
                return abstractC2920v0;
            }
            if (RecyclerView.f2005J0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* renamed from: c */
    public void m5079c(int i, int i4, Object obj) {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f10867a;
        int iM2731j = recyclerView.f2064o.m2731j();
        int i10 = i4 + i;
        for (int i11 = 0; i11 < iM2731j; i11++) {
            View viewM2730i = recyclerView.f2064o.m2730i(i11);
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(viewM2730i);
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5075o() && (i9 = abstractC2920v0M1144M.f10850c) >= i && i9 < i10) {
                abstractC2920v0M1144M.m5061a(2);
                if (obj == null) {
                    abstractC2920v0M1144M.m5061a(1024);
                } else if ((1024 & abstractC2920v0M1144M.f10857j) == 0) {
                    if (abstractC2920v0M1144M.f10858k == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC2920v0M1144M.f10858k = arrayList;
                        abstractC2920v0M1144M.f10859l = Collections.unmodifiableList(arrayList);
                    }
                    abstractC2920v0M1144M.f10858k.add(obj);
                }
                ((C2890g0) viewM2730i.getLayoutParams()).f10691c = true;
            }
        }
        C2900l0 c2900l0 = recyclerView.f2058l;
        ArrayList arrayList2 = c2900l0.f10758c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList2.get(size);
            if (abstractC2920v0 != null && (i8 = abstractC2920v0.f10850c) >= i && i8 < i10) {
                abstractC2920v0.m5061a(2);
                c2900l0.m5036h(size);
            }
        }
        recyclerView.f2075t0 = true;
    }

    /* renamed from: d */
    public void m5080d(int i, int i4) {
        RecyclerView recyclerView = this.f10867a;
        int iM2731j = recyclerView.f2064o.m2731j();
        for (int i8 = 0; i8 < iM2731j; i8++) {
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(recyclerView.f2064o.m2730i(i8));
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5075o() && abstractC2920v0M1144M.f10850c >= i) {
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i8 + " holder " + abstractC2920v0M1144M + " now at position " + (abstractC2920v0M1144M.f10850c + i4));
                }
                abstractC2920v0M1144M.m5072l(i4, false);
                recyclerView.f2067p0.f10824f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2058l.f10758c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(i9);
            if (abstractC2920v0 != null && abstractC2920v0.f10850c >= i) {
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i9 + " holder " + abstractC2920v0 + " now at position " + (abstractC2920v0.f10850c + i4));
                }
                abstractC2920v0.m5072l(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2073s0 = true;
    }

    /* renamed from: e */
    public void m5081e(int i, int i4) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.f10867a;
        int iM2731j = recyclerView.f2064o.m2731j();
        if (i < i4) {
            i9 = i;
            i8 = i4;
            i10 = -1;
        } else {
            i8 = i;
            i9 = i4;
            i10 = 1;
        }
        boolean z7 = false;
        for (int i16 = 0; i16 < iM2731j; i16++) {
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(recyclerView.f2064o.m2730i(i16));
            if (abstractC2920v0M1144M != null && (i15 = abstractC2920v0M1144M.f10850c) >= i9 && i15 <= i8) {
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + abstractC2920v0M1144M);
                }
                if (abstractC2920v0M1144M.f10850c == i) {
                    abstractC2920v0M1144M.m5072l(i4 - i, false);
                } else {
                    abstractC2920v0M1144M.m5072l(i10, false);
                }
                recyclerView.f2067p0.f10824f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2058l.f10758c;
        if (i < i4) {
            i12 = i;
            i11 = i4;
            i13 = -1;
        } else {
            i11 = i;
            i12 = i4;
            i13 = 1;
        }
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(i17);
            if (abstractC2920v0 != null && (i14 = abstractC2920v0.f10850c) >= i12 && i14 <= i11) {
                if (i14 == i) {
                    abstractC2920v0.m5072l(i4 - i, z7);
                } else {
                    abstractC2920v0.m5072l(i13, z7);
                }
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i17 + " holder " + abstractC2920v0);
                }
            }
            i17++;
            z7 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f2073s0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5082f(AbstractC2920v0 abstractC2920v0, C0228p c0228p, C0228p c0228p2) {
        boolean zM5015g;
        RecyclerView recyclerView = this.f10867a;
        recyclerView.getClass();
        abstractC2920v0.m5074n(false);
        C2891h c2891h = (C2891h) recyclerView.f2042U;
        if (c0228p != null) {
            c2891h.getClass();
            int i = c0228p.f1276a;
            int i4 = c0228p2.f1276a;
            if (i == i4 && c0228p.f1277b == c0228p2.f1277b) {
                c2891h.m5019l(abstractC2920v0);
                abstractC2920v0.f10848a.setAlpha(0.0f);
                c2891h.f10696i.add(abstractC2920v0);
                zM5015g = true;
            } else {
                zM5015g = c2891h.m5015g(abstractC2920v0, i, c0228p.f1277b, i4, c0228p2.f1277b);
            }
        }
        if (zM5015g) {
            recyclerView.m1172W();
        }
    }

    /* renamed from: g */
    public void m5083g(AbstractC2920v0 abstractC2920v0, C0228p c0228p, C0228p c0228p2) {
        boolean zM5015g;
        RecyclerView recyclerView = this.f10867a;
        recyclerView.f2058l.m5041m(abstractC2920v0);
        recyclerView.m1183h(abstractC2920v0);
        abstractC2920v0.m5074n(false);
        C2891h c2891h = (C2891h) recyclerView.f2042U;
        c2891h.getClass();
        int i = c0228p.f1276a;
        int i4 = c0228p.f1277b;
        View view = abstractC2920v0.f10848a;
        int left = c0228p2 == null ? view.getLeft() : c0228p2.f1276a;
        int top = c0228p2 == null ? view.getTop() : c0228p2.f1277b;
        if (abstractC2920v0.m5068h() || (i == left && i4 == top)) {
            c2891h.m5019l(abstractC2920v0);
            c2891h.f10695h.add(abstractC2920v0);
            zM5015g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM5015g = c2891h.m5015g(abstractC2920v0, i, i4, left, top);
        }
        if (zM5015g) {
            recyclerView.m1172W();
        }
    }

    /* renamed from: h */
    public void m5084h(int i) {
        RecyclerView recyclerView = this.f10867a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m1144M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
