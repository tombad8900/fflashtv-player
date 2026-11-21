package p216z2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p063h1.C1131v;
import p072i2.C1250j;
import p105m0.AbstractC1828m0;
import p114n0.C1952d;
import p130p.C2192k;
import p156s.C2332e;
import p184v1.C2528c;
import p209y2.AbstractC2796a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC2888f0 {

    /* renamed from: a */
    public C1250j f10669a;

    /* renamed from: b */
    public RecyclerView f10670b;

    /* renamed from: c */
    public final C2332e f10671c;

    /* renamed from: d */
    public final C2332e f10672d;

    /* renamed from: e */
    public C2911r f10673e;

    /* renamed from: f */
    public boolean f10674f;

    /* renamed from: g */
    public boolean f10675g;

    /* renamed from: h */
    public final boolean f10676h;

    /* renamed from: i */
    public final boolean f10677i;

    /* renamed from: j */
    public int f10678j;

    /* renamed from: k */
    public boolean f10679k;

    /* renamed from: l */
    public int f10680l;

    /* renamed from: m */
    public int f10681m;

    /* renamed from: n */
    public int f10682n;

    /* renamed from: o */
    public int f10683o;

    public AbstractC2888f0() {
        C2882d0 c2882d0 = new C2882d0(this, 0);
        C2882d0 c2882d02 = new C2882d0(this, 1);
        this.f10671c = new C2332e(c2882d0);
        this.f10672d = new C2332e(c2882d02);
        this.f10674f = false;
        this.f10675g = false;
        this.f10676h = true;
        this.f10677i = true;
    }

    /* renamed from: A */
    public static int m4982A(View view) {
        Rect rect = ((C2890g0) view.getLayoutParams()).f10690b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m4983H(View view) {
        return ((C2890g0) view.getLayoutParams()).f10689a.m5062b();
    }

    /* renamed from: I */
    public static C2885e0 m4984I(Context context, AttributeSet attributeSet, int i, int i4) {
        C2885e0 c2885e0 = new C2885e0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2796a.f10412a, i, i4);
        c2885e0.f10655a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2885e0.f10656b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2885e0.f10657c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2885e0.f10658d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2885e0;
    }

    /* renamed from: M */
    public static boolean m4985M(int i, int i4, int i8) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i8 > 0 && i != i8) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: N */
    public static void m4986N(View view, int i, int i4, int i8, int i9) {
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        Rect rect = c2890g0.f10690b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c2890g0).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2890g0).bottomMargin);
    }

    /* renamed from: g */
    public static int m4987g(int i, int i4, int i8) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i8) : size : Math.min(size, Math.max(i4, i8));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4988w(int i, int i4, int i8, int i9, boolean z7) {
        int iMax = Math.max(0, i - i8);
        if (z7) {
            if (i9 < 0) {
                if (i9 != -1 || (i4 != Integer.MIN_VALUE && (i4 == 0 || i4 != 1073741824))) {
                    i4 = 0;
                    i9 = 0;
                } else {
                    i9 = iMax;
                }
            }
            i4 = 1073741824;
        } else if (i9 >= 0) {
            i4 = 1073741824;
        } else if (i9 != -1) {
            if (i9 == -2) {
                if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
                    i9 = iMax;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i9 = iMax;
                    i4 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i9, i4);
    }

    /* renamed from: z */
    public static int m4989z(View view) {
        Rect rect = ((C2890g0) view.getLayoutParams()).f10690b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: A0 */
    public final void m4990A0(C2911r c2911r) {
        C2911r c2911r2 = this.f10673e;
        if (c2911r2 != null && c2911r != c2911r2 && c2911r2.f10807e) {
            c2911r2.m5050i();
        }
        this.f10673e = c2911r;
        RecyclerView recyclerView = this.f10670b;
        RunnableC2918u0 runnableC2918u0 = recyclerView.f2061m0;
        runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
        runnableC2918u0.f10840l.abortAnimation();
        if (c2911r.f10810h) {
            Log.w("RecyclerView", "An instance of " + c2911r.getClass().getSimpleName() + " was started more than once. Each instance of" + c2911r.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c2911r.f10804b = recyclerView;
        c2911r.f10805c = this;
        int i = c2911r.f10803a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2067p0.f10819a = i;
        c2911r.f10807e = true;
        c2911r.f10806d = true;
        c2911r.f10808f = recyclerView.f2080w.mo1139q(i);
        c2911r.f10804b.f2061m0.m5059b();
        c2911r.f10810h = true;
    }

    /* renamed from: B */
    public final int m4991B() {
        RecyclerView recyclerView = this.f10670b;
        AbstractC2923x adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo1455a();
        }
        return 0;
    }

    /* renamed from: B0 */
    public boolean mo1061B0() {
        return false;
    }

    /* renamed from: C */
    public final int m4992C() {
        RecyclerView recyclerView = this.f10670b;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m4993D() {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m4994E() {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m4995F() {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m4996G() {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1063J(C2900l0 c2900l0, C2912r0 c2912r0) {
        return -1;
    }

    /* renamed from: K */
    public final void m4997K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C2890g0) view.getLayoutParams()).f10690b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f10670b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f10670b.f2076u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1107L();

    /* renamed from: O */
    public void mo1218O(int i) {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            int iM2728g = recyclerView.f2064o.m2728g();
            for (int i4 = 0; i4 < iM2728g; i4++) {
                recyclerView.f2064o.m2727f(i4).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: P */
    public void mo1220P(int i) {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            int iM2728g = recyclerView.f2064o.m2728g();
            for (int i4 = 0; i4 < iM2728g; i4++) {
                recyclerView.f2064o.m2727f(i4).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: Q */
    public void mo1222Q() {
    }

    /* renamed from: R */
    public void mo1831R(RecyclerView recyclerView) {
    }

    /* renamed from: S */
    public abstract void mo1114S(RecyclerView recyclerView);

    /* renamed from: T */
    public abstract View mo1065T(View view, int i, C2900l0 c2900l0, C2912r0 c2912r0);

    /* renamed from: U */
    public void mo1117U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f10670b;
        C2900l0 c2900l0 = recyclerView.f2058l;
        C2912r0 c2912r0 = recyclerView.f2067p0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z7 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f10670b.canScrollVertically(-1) && !this.f10670b.canScrollHorizontally(-1) && !this.f10670b.canScrollHorizontally(1)) {
            z7 = false;
        }
        accessibilityEvent.setScrollable(z7);
        AbstractC2923x abstractC2923x = this.f10670b.f2078v;
        if (abstractC2923x != null) {
            accessibilityEvent.setItemCount(abstractC2923x.mo1455a());
        }
    }

    /* renamed from: V */
    public void mo1066V(C2900l0 c2900l0, C2912r0 c2912r0, C1952d c1952d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        if (this.f10670b.canScrollVertically(-1) || this.f10670b.canScrollHorizontally(-1)) {
            c1952d.m3811a(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f10670b.canScrollVertically(1) || this.f10670b.canScrollHorizontally(1)) {
            c1952d.m3811a(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo1063J(c2900l0, c2912r0), mo1098x(c2900l0, c2912r0), false, 0));
    }

    /* renamed from: W */
    public final void m4998W(View view, C1952d c1952d) {
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        if (abstractC2920v0M1144M == null || abstractC2920v0M1144M.m5068h()) {
            return;
        }
        C1250j c1250j = this.f10669a;
        if (((ArrayList) c1250j.f5232n).contains(abstractC2920v0M1144M.f10848a)) {
            return;
        }
        RecyclerView recyclerView = this.f10670b;
        mo1068X(recyclerView.f2058l, recyclerView.f2067p0, view, c1952d);
    }

    /* renamed from: X */
    public void mo1068X(C2900l0 c2900l0, C2912r0 c2912r0, View view, C1952d c1952d) {
    }

    /* renamed from: Y */
    public void mo1070Y(int i, int i4) {
    }

    /* renamed from: Z */
    public void mo1071Z() {
    }

    /* renamed from: a0 */
    public void mo1072a0(int i, int i4) {
    }

    /* renamed from: b */
    public final void m4999b(View view, int i, boolean z7) {
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        if (z7 || abstractC2920v0M1144M.m5068h()) {
            C2192k c2192k = (C2192k) this.f10670b.f2066p.f8170k;
            C2886e1 c2886e1M4981a = (C2886e1) c2192k.get(abstractC2920v0M1144M);
            if (c2886e1M4981a == null) {
                c2886e1M4981a = C2886e1.m4981a();
                c2192k.put(abstractC2920v0M1144M, c2886e1M4981a);
            }
            c2886e1M4981a.f10660a |= 1;
        } else {
            this.f10670b.f2066p.m4158x(abstractC2920v0M1144M);
        }
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        if (abstractC2920v0M1144M.m5076p() || abstractC2920v0M1144M.m5069i()) {
            if (abstractC2920v0M1144M.m5069i()) {
                abstractC2920v0M1144M.f10861n.m5041m(abstractC2920v0M1144M);
            } else {
                abstractC2920v0M1144M.f10857j &= -33;
            }
            this.f10669a.m2725d(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f10670b) {
                C1250j c1250j = this.f10669a;
                C2528c c2528c = (C2528c) c1250j.f5231m;
                int iIndexOfChild = ((C2921w) c1250j.f5230l).f10867a.indexOfChild(view);
                int iM4544k = (iIndexOfChild == -1 || c2528c.m4546m(iIndexOfChild)) ? -1 : iIndexOfChild - c2528c.m4544k(iIndexOfChild);
                if (i == -1) {
                    i = this.f10669a.m2728g();
                }
                if (iM4544k == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f10670b.indexOfChild(view));
                    throw new IllegalStateException(AbstractC0008a1.m13i(this.f10670b, sb));
                }
                if (iM4544k != i) {
                    AbstractC2888f0 abstractC2888f0 = this.f10670b.f2080w;
                    View viewM5008u = abstractC2888f0.m5008u(iM4544k);
                    if (viewM5008u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM4544k + abstractC2888f0.f10670b.toString());
                    }
                    abstractC2888f0.m5008u(iM4544k);
                    abstractC2888f0.f10669a.m2726e(iM4544k);
                    C2890g0 c2890g02 = (C2890g0) viewM5008u.getLayoutParams();
                    AbstractC2920v0 abstractC2920v0M1144M2 = RecyclerView.m1144M(viewM5008u);
                    if (abstractC2920v0M1144M2.m5068h()) {
                        C2192k c2192k2 = (C2192k) abstractC2888f0.f10670b.f2066p.f8170k;
                        C2886e1 c2886e1M4981a2 = (C2886e1) c2192k2.get(abstractC2920v0M1144M2);
                        if (c2886e1M4981a2 == null) {
                            c2886e1M4981a2 = C2886e1.m4981a();
                            c2192k2.put(abstractC2920v0M1144M2, c2886e1M4981a2);
                        }
                        c2886e1M4981a2.f10660a = 1 | c2886e1M4981a2.f10660a;
                    } else {
                        abstractC2888f0.f10670b.f2066p.m4158x(abstractC2920v0M1144M2);
                    }
                    abstractC2888f0.f10669a.m2725d(viewM5008u, i, c2890g02, abstractC2920v0M1144M2.m5068h());
                }
            } else {
                this.f10669a.m2724c(view, i, false);
                c2890g0.f10691c = true;
                C2911r c2911r = this.f10673e;
                if (c2911r != null && c2911r.f10807e) {
                    c2911r.f10804b.getClass();
                    AbstractC2920v0 abstractC2920v0M1144M3 = RecyclerView.m1144M(view);
                    if ((abstractC2920v0M1144M3 != null ? abstractC2920v0M1144M3.m5062b() : -1) == c2911r.f10803a) {
                        c2911r.f10808f = view;
                        if (RecyclerView.f2005J0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c2890g0.f10692d) {
            if (RecyclerView.f2005J0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c2890g0.f10689a);
            }
            abstractC2920v0M1144M.f10848a.invalidate();
            c2890g0.f10692d = false;
        }
    }

    /* renamed from: b0 */
    public void mo1073b0(int i, int i4) {
    }

    /* renamed from: c */
    public void mo1125c(String str) {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            recyclerView.m1189k(str);
        }
    }

    /* renamed from: c0 */
    public void mo1074c0(int i, int i4) {
    }

    /* renamed from: d */
    public abstract boolean mo1127d();

    /* renamed from: d0 */
    public abstract void mo1075d0(C2900l0 c2900l0, C2912r0 c2912r0);

    /* renamed from: e */
    public abstract boolean mo1128e();

    /* renamed from: e0 */
    public abstract void mo1077e0(C2912r0 c2912r0);

    /* renamed from: f */
    public boolean mo1078f(C2890g0 c2890g0) {
        return c2890g0 != null;
    }

    /* renamed from: f0 */
    public void mo1130f0(Parcelable parcelable) {
    }

    /* renamed from: g0 */
    public Parcelable mo1132g0() {
        return null;
    }

    /* renamed from: h */
    public void mo1134h(int i, int i4, C2912r0 c2912r0, C1131v c1131v) {
    }

    /* renamed from: h0 */
    public void mo1235h0(int i) {
    }

    /* renamed from: i */
    public void mo1135i(int i, C1131v c1131v) {
    }

    /* renamed from: i0 */
    public final void m5000i0(C2900l0 c2900l0) {
        for (int iM5010v = m5010v() - 1; iM5010v >= 0; iM5010v--) {
            if (!RecyclerView.m1144M(m5008u(iM5010v)).m5075o()) {
                View viewM5008u = m5008u(iM5010v);
                m5003l0(iM5010v);
                c2900l0.m5037i(viewM5008u);
            }
        }
    }

    /* renamed from: j */
    public abstract int mo1136j(C2912r0 c2912r0);

    /* renamed from: j0 */
    public final void m5001j0(C2900l0 c2900l0) {
        ArrayList arrayList = c2900l0.f10756a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC2920v0) arrayList.get(i)).f10848a;
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
            if (!abstractC2920v0M1144M.m5075o()) {
                abstractC2920v0M1144M.m5074n(false);
                if (abstractC2920v0M1144M.m5070j()) {
                    this.f10670b.removeDetachedView(view, false);
                }
                AbstractC2876b0 abstractC2876b0 = this.f10670b.f2042U;
                if (abstractC2876b0 != null) {
                    abstractC2876b0.mo4974d(abstractC2920v0M1144M);
                }
                abstractC2920v0M1144M.m5074n(true);
                AbstractC2920v0 abstractC2920v0M1144M2 = RecyclerView.m1144M(view);
                abstractC2920v0M1144M2.f10861n = null;
                abstractC2920v0M1144M2.f10862o = false;
                abstractC2920v0M1144M2.f10857j &= -33;
                c2900l0.m5038j(abstractC2920v0M1144M2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c2900l0.f10757b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f10670b.invalidate();
        }
    }

    /* renamed from: k */
    public abstract int mo1082k(C2912r0 c2912r0);

    /* renamed from: k0 */
    public final void m5002k0(View view, C2900l0 c2900l0) {
        C1250j c1250j = this.f10669a;
        C2921w c2921w = (C2921w) c1250j.f5230l;
        int i = c1250j.f5229k;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c1250j.f5229k = 1;
            c1250j.f5233o = view;
            int iIndexOfChild = c2921w.f10867a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C2528c) c1250j.f5231m).m4548o(iIndexOfChild)) {
                    c1250j.m2733l(view);
                }
                c2921w.m5084h(iIndexOfChild);
            }
            c1250j.f5229k = 0;
            c1250j.f5233o = null;
            c2900l0.m5037i(view);
        } catch (Throwable th) {
            c1250j.f5229k = 0;
            c1250j.f5233o = null;
            throw th;
        }
    }

    /* renamed from: l */
    public abstract int mo1084l(C2912r0 c2912r0);

    /* renamed from: l0 */
    public final void m5003l0(int i) {
        if (m5008u(i) != null) {
            C1250j c1250j = this.f10669a;
            C2921w c2921w = (C2921w) c1250j.f5230l;
            int i4 = c1250j.f5229k;
            if (i4 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i4 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM2729h = c1250j.m2729h(i);
                View childAt = c2921w.f10867a.getChildAt(iM2729h);
                if (childAt != null) {
                    c1250j.f5229k = 1;
                    c1250j.f5233o = childAt;
                    if (((C2528c) c1250j.f5231m).m4548o(iM2729h)) {
                        c1250j.m2733l(childAt);
                    }
                    c2921w.m5084h(iM2729h);
                }
                c1250j.f5229k = 0;
                c1250j.f5233o = null;
            } catch (Throwable th) {
                c1250j.f5229k = 0;
                c1250j.f5233o = null;
                throw th;
            }
        }
    }

    /* renamed from: m */
    public abstract int mo1137m(C2912r0 c2912r0);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1832m0(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        int iM4994E = m4994E();
        int iM4996G = m4996G();
        int iM4995F = this.f10682n - m4995F();
        int iM4993D = this.f10683o - m4993D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM4994E;
        int iMin = Math.min(0, i);
        int i4 = top - iM4996G;
        int iMin2 = Math.min(0, i4);
        int i8 = iWidth - iM4995F;
        int iMax = Math.max(0, i8);
        int iMax2 = Math.max(0, iHeight - iM4993D);
        if (m4992C() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i8);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i4, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (z8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM4994E2 = m4994E();
                int iM4996G2 = m4996G();
                int iM4995F2 = this.f10682n - m4995F();
                int iM4993D2 = this.f10683o - m4993D();
                Rect rect2 = this.f10670b.f2072s;
                mo1833y(focusedChild, rect2);
                if (rect2.left - i9 < iM4995F2 && rect2.right - i9 > iM4994E2 && rect2.top - i10 < iM4993D2 && rect2.bottom - i10 > iM4996G2) {
                }
            }
        } else if (i9 != 0 || i10 != 0) {
            if (z7) {
                recyclerView.scrollBy(i9, i10);
                return true;
            }
            recyclerView.m1186i0(i9, i10, false);
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract int mo1087n(C2912r0 c2912r0);

    /* renamed from: n0 */
    public final void m5004n0() {
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: o */
    public abstract int mo1089o(C2912r0 c2912r0);

    /* renamed from: o0 */
    public abstract int mo1090o0(int i, C2900l0 c2900l0, C2912r0 c2912r0);

    /* renamed from: p */
    public final void m5005p(C2900l0 c2900l0) {
        for (int iM5010v = m5010v() - 1; iM5010v >= 0; iM5010v--) {
            View viewM5008u = m5008u(iM5010v);
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(viewM5008u);
            if (abstractC2920v0M1144M.m5075o()) {
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "ignoring view " + abstractC2920v0M1144M);
                }
            } else if (!abstractC2920v0M1144M.m5066f() || abstractC2920v0M1144M.m5068h() || this.f10670b.f2078v.f10871b) {
                m5008u(iM5010v);
                this.f10669a.m2726e(iM5010v);
                c2900l0.m5039k(viewM5008u);
                this.f10670b.f2066p.m4158x(abstractC2920v0M1144M);
            } else {
                m5003l0(iM5010v);
                c2900l0.m5038j(abstractC2920v0M1144M);
            }
        }
    }

    /* renamed from: p0 */
    public abstract void mo1138p0(int i);

    /* renamed from: q */
    public View mo1139q(int i) {
        int iM5010v = m5010v();
        for (int i4 = 0; i4 < iM5010v; i4++) {
            View viewM5008u = m5008u(i4);
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(viewM5008u);
            if (abstractC2920v0M1144M != null && abstractC2920v0M1144M.m5062b() == i && !abstractC2920v0M1144M.m5075o() && (this.f10670b.f2067p0.f10825g || !abstractC2920v0M1144M.m5068h())) {
                return viewM5008u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public abstract int mo1093q0(int i, C2900l0 c2900l0, C2912r0 c2912r0);

    /* renamed from: r */
    public abstract C2890g0 mo1094r();

    /* renamed from: r0 */
    public final void m5006r0(RecyclerView recyclerView) {
        m5007s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: s */
    public C2890g0 mo1095s(Context context, AttributeSet attributeSet) {
        return new C2890g0(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m5007s0(int i, int i4) {
        this.f10682n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f10680l = mode;
        if (mode == 0 && !RecyclerView.f2008M0) {
            this.f10682n = 0;
        }
        this.f10683o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f10681m = mode2;
        if (mode2 != 0 || RecyclerView.f2008M0) {
            return;
        }
        this.f10683o = 0;
    }

    /* renamed from: t */
    public C2890g0 mo1096t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2890g0 ? new C2890g0((C2890g0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2890g0((ViewGroup.MarginLayoutParams) layoutParams) : new C2890g0(layoutParams);
    }

    /* renamed from: t0 */
    public void mo1097t0(Rect rect, int i, int i4) {
        int iM4995F = m4995F() + m4994E() + rect.width();
        int iM4993D = m4993D() + m4996G() + rect.height();
        RecyclerView recyclerView = this.f10670b;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        this.f10670b.setMeasuredDimension(m4987g(i, iM4995F, recyclerView.getMinimumWidth()), m4987g(i4, iM4993D, this.f10670b.getMinimumHeight()));
    }

    /* renamed from: u */
    public final View m5008u(int i) {
        C1250j c1250j = this.f10669a;
        if (c1250j != null) {
            return c1250j.m2727f(i);
        }
        return null;
    }

    /* renamed from: u0 */
    public final void m5009u0(int i, int i4) {
        int iM5010v = m5010v();
        if (iM5010v == 0) {
            this.f10670b.m1195q(i, i4);
            return;
        }
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iM5010v; i12++) {
            View viewM5008u = m5008u(i12);
            Rect rect = this.f10670b.f2072s;
            mo1833y(viewM5008u, rect);
            int i13 = rect.left;
            if (i13 < i11) {
                i11 = i13;
            }
            int i14 = rect.right;
            if (i14 > i8) {
                i8 = i14;
            }
            int i15 = rect.top;
            if (i15 < i9) {
                i9 = i15;
            }
            int i16 = rect.bottom;
            if (i16 > i10) {
                i10 = i16;
            }
        }
        this.f10670b.f2072s.set(i11, i9, i8, i10);
        mo1097t0(this.f10670b.f2072s, i, i4);
    }

    /* renamed from: v */
    public final int m5010v() {
        C1250j c1250j = this.f10669a;
        if (c1250j != null) {
            return c1250j.m2728g();
        }
        return 0;
    }

    /* renamed from: v0 */
    public final void m5011v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f10670b = null;
            this.f10669a = null;
            this.f10682n = 0;
            this.f10683o = 0;
        } else {
            this.f10670b = recyclerView;
            this.f10669a = recyclerView.f2064o;
            this.f10682n = recyclerView.getWidth();
            this.f10683o = recyclerView.getHeight();
        }
        this.f10680l = 1073741824;
        this.f10681m = 1073741824;
    }

    /* renamed from: w0 */
    public final boolean m5012w0(View view, int i, int i4, C2890g0 c2890g0) {
        return (!view.isLayoutRequested() && this.f10676h && m4985M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2890g0).width) && m4985M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c2890g0).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1098x(C2900l0 c2900l0, C2912r0 c2912r0) {
        return -1;
    }

    /* renamed from: x0 */
    public boolean mo1140x0() {
        return false;
    }

    /* renamed from: y */
    public void mo1833y(View view, Rect rect) {
        boolean z7 = RecyclerView.f2004I0;
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        Rect rect2 = c2890g0.f10690b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2890g0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2890g0).bottomMargin);
    }

    /* renamed from: y0 */
    public final boolean m5013y0(View view, int i, int i4, C2890g0 c2890g0) {
        return (this.f10676h && m4985M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2890g0).width) && m4985M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c2890g0).height)) ? false : true;
    }

    /* renamed from: z0 */
    public abstract void mo1141z0(RecyclerView recyclerView, int i);
}
