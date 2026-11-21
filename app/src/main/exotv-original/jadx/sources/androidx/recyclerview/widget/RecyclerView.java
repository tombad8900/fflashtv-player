package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.media3.common.C0228p;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p017b6.AbstractC0622v;
import p063h1.C1131v;
import p070i0.AbstractC1221f;
import p071i1.C1240s;
import p072i2.C1250j;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1810g0;
import p105m0.AbstractC1828m0;
import p105m0.AbstractC1831n0;
import p105m0.C1824l;
import p111m6.AbstractC1914i;
import p130p.C2189h;
import p130p.C2192k;
import p149r0.C2287a;
import p156s.AbstractC2334g;
import p156s.C2332e;
import p166t0.InterpolatorC2390d;
import p184v1.C2528c;
import p209y2.AbstractC2796a;
import p216z2.AbstractC2873a0;
import p216z2.AbstractC2876b0;
import p216z2.AbstractC2879c0;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2892h0;
import p216z2.AbstractC2894i0;
import p216z2.AbstractC2916t0;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.AbstractC2928z0;
import p216z2.C2872a;
import p216z2.C2886e1;
import p216z2.C2890g0;
import p216z2.C2891h;
import p216z2.C2895j;
import p216z2.C2896j0;
import p216z2.C2898k0;
import p216z2.C2900l0;
import p216z2.C2904n0;
import p216z2.C2906o0;
import p216z2.C2911r;
import p216z2.C2912r0;
import p216z2.C2914s0;
import p216z2.C2921w;
import p216z2.C2924x0;
import p216z2.InterfaceC2902m0;
import p216z2.InterfaceC2910q0;
import p216z2.InterfaceC2927z;
import p216z2.RunnableC2899l;
import p216z2.RunnableC2918u0;
import p216z2.RunnableC2919v;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: I0 */
    public static boolean f2004I0;

    /* renamed from: J0 */
    public static boolean f2005J0;

    /* renamed from: K0 */
    public static final int[] f2006K0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: L0 */
    public static final float f2007L0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: M0 */
    public static final boolean f2008M0 = true;

    /* renamed from: N0 */
    public static final boolean f2009N0 = true;

    /* renamed from: O0 */
    public static final boolean f2010O0 = true;

    /* renamed from: P0 */
    public static final Class[] f2011P0;

    /* renamed from: Q0 */
    public static final InterpolatorC2390d f2012Q0;

    /* renamed from: R0 */
    public static final C2914s0 f2013R0;

    /* renamed from: A */
    public C2895j f2014A;

    /* renamed from: A0 */
    public final int[] f2015A0;

    /* renamed from: B */
    public boolean f2016B;

    /* renamed from: B0 */
    public final int[] f2017B0;

    /* renamed from: C */
    public boolean f2018C;

    /* renamed from: C0 */
    public final ArrayList f2019C0;

    /* renamed from: D */
    public boolean f2020D;

    /* renamed from: D0 */
    public final RunnableC2919v f2021D0;

    /* renamed from: E */
    public int f2022E;

    /* renamed from: E0 */
    public boolean f2023E0;

    /* renamed from: F */
    public boolean f2024F;

    /* renamed from: F0 */
    public int f2025F0;

    /* renamed from: G */
    public boolean f2026G;

    /* renamed from: G0 */
    public int f2027G0;

    /* renamed from: H */
    public boolean f2028H;

    /* renamed from: H0 */
    public final C2921w f2029H0;

    /* renamed from: I */
    public int f2030I;

    /* renamed from: J */
    public boolean f2031J;

    /* renamed from: K */
    public final AccessibilityManager f2032K;

    /* renamed from: L */
    public boolean f2033L;

    /* renamed from: M */
    public boolean f2034M;

    /* renamed from: N */
    public int f2035N;

    /* renamed from: O */
    public int f2036O;

    /* renamed from: P */
    public AbstractC2873a0 f2037P;

    /* renamed from: Q */
    public EdgeEffect f2038Q;

    /* renamed from: R */
    public EdgeEffect f2039R;

    /* renamed from: S */
    public EdgeEffect f2040S;

    /* renamed from: T */
    public EdgeEffect f2041T;

    /* renamed from: U */
    public AbstractC2876b0 f2042U;

    /* renamed from: V */
    public int f2043V;

    /* renamed from: W */
    public int f2044W;

    /* renamed from: a0 */
    public VelocityTracker f2045a0;

    /* renamed from: b0 */
    public int f2046b0;

    /* renamed from: c0 */
    public int f2047c0;

    /* renamed from: d0 */
    public int f2048d0;

    /* renamed from: e0 */
    public int f2049e0;

    /* renamed from: f0 */
    public int f2050f0;

    /* renamed from: g0 */
    public AbstractC2892h0 f2051g0;

    /* renamed from: h0 */
    public final int f2052h0;

    /* renamed from: i0 */
    public final int f2053i0;

    /* renamed from: j */
    public final float f2054j;

    /* renamed from: j0 */
    public final float f2055j0;

    /* renamed from: k */
    public final C2904n0 f2056k;

    /* renamed from: k0 */
    public final float f2057k0;

    /* renamed from: l */
    public final C2900l0 f2058l;

    /* renamed from: l0 */
    public boolean f2059l0;

    /* renamed from: m */
    public C2906o0 f2060m;

    /* renamed from: m0 */
    public final RunnableC2918u0 f2061m0;

    /* renamed from: n */
    public final C1240s f2062n;

    /* renamed from: n0 */
    public RunnableC2899l f2063n0;

    /* renamed from: o */
    public final C1250j f2064o;

    /* renamed from: o0 */
    public final C1131v f2065o0;

    /* renamed from: p */
    public final C2332e f2066p;

    /* renamed from: p0 */
    public final C2912r0 f2067p0;

    /* renamed from: q */
    public boolean f2068q;

    /* renamed from: q0 */
    public AbstractC2894i0 f2069q0;

    /* renamed from: r */
    public final RunnableC2919v f2070r;

    /* renamed from: r0 */
    public ArrayList f2071r0;

    /* renamed from: s */
    public final Rect f2072s;

    /* renamed from: s0 */
    public boolean f2073s0;

    /* renamed from: t */
    public final Rect f2074t;

    /* renamed from: t0 */
    public boolean f2075t0;

    /* renamed from: u */
    public final RectF f2076u;

    /* renamed from: u0 */
    public final C2921w f2077u0;

    /* renamed from: v */
    public AbstractC2923x f2078v;

    /* renamed from: v0 */
    public boolean f2079v0;

    /* renamed from: w */
    public AbstractC2888f0 f2080w;

    /* renamed from: w0 */
    public C2924x0 f2081w0;

    /* renamed from: x */
    public final ArrayList f2082x;

    /* renamed from: x0 */
    public final int[] f2083x0;

    /* renamed from: y */
    public final ArrayList f2084y;

    /* renamed from: y0 */
    public C1824l f2085y0;

    /* renamed from: z */
    public final ArrayList f2086z;

    /* renamed from: z0 */
    public final int[] f2087z0;

    static {
        Class cls = Integer.TYPE;
        f2011P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2012Q0 = new InterpolatorC2390d(1);
        f2013R0 = new C2914s0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.exotv.net.R.attr.recyclerViewStyle);
    }

    /* renamed from: G */
    public static RecyclerView m1142G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM1142G = m1142G(viewGroup.getChildAt(i));
            if (recyclerViewM1142G != null) {
                return recyclerViewM1142G;
            }
        }
        return null;
    }

    /* renamed from: K */
    public static int m1143K(View view) {
        RecyclerView recyclerView;
        AbstractC2920v0 abstractC2920v0M1144M = m1144M(view);
        if (abstractC2920v0M1144M == null || (recyclerView = abstractC2920v0M1144M.f10865r) == null) {
            return -1;
        }
        return recyclerView.m1160I(abstractC2920v0M1144M);
    }

    /* renamed from: M */
    public static AbstractC2920v0 m1144M(View view) {
        if (view == null) {
            return null;
        }
        return ((C2890g0) view.getLayoutParams()).f10689a;
    }

    private C1824l getScrollingChildHelper() {
        if (this.f2085y0 == null) {
            this.f2085y0 = new C1824l(this);
        }
        return this.f2085y0;
    }

    /* renamed from: l */
    public static void m1151l(AbstractC2920v0 abstractC2920v0) {
        WeakReference weakReference = abstractC2920v0.f10849b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC2920v0.f10848a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC2920v0.f10849b = null;
        }
    }

    /* renamed from: o */
    public static int m1152o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i4) {
        if (i > 0 && edgeEffect != null && AbstractC0715d.m1541C(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0715d.m1553V(edgeEffect, ((-i) * 4.0f) / i4, 0.5f) * ((-i4) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0715d.m1541C(edgeEffect2) == 0.0f) {
            return i;
        }
        float f8 = i4;
        int iRound2 = Math.round(AbstractC0715d.m1553V(edgeEffect2, (i * 4.0f) / f8, 0.5f) * (f8 / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z7) {
        f2004I0 = z7;
    }

    public static void setVerboseLoggingEnabled(boolean z7) {
        f2005J0 = z7;
    }

    /* renamed from: A */
    public final void m1153A() {
        if (this.f2039R != null) {
            return;
        }
        ((C2914s0) this.f2037P).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2039R = edgeEffect;
        if (this.f2068q) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: B */
    public final String m1154B() {
        return " " + super.toString() + ", adapter:" + this.f2078v + ", layout:" + this.f2080w + ", context:" + getContext();
    }

    /* renamed from: C */
    public final void m1155C(C2912r0 c2912r0) {
        if (getScrollState() != 2) {
            c2912r0.getClass();
            return;
        }
        OverScroller overScroller = this.f2061m0.f10840l;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c2912r0.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* renamed from: D */
    public final View m1156D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1157E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2086z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2895j c2895j = (C2895j) arrayList.get(i);
            int i4 = c2895j.f10733v;
            if (i4 == 1) {
                boolean zM5022e = c2895j.m5022e(motionEvent.getX(), motionEvent.getY());
                boolean zM5021d = c2895j.m5021d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM5022e || zM5021d)) {
                    if (zM5021d) {
                        c2895j.f10734w = 1;
                        c2895j.f10727p = (int) motionEvent.getX();
                    } else if (zM5022e) {
                        c2895j.f10734w = 2;
                        c2895j.f10724m = (int) motionEvent.getY();
                    }
                    c2895j.m5023g(2);
                    if (action == 3) {
                        this.f2014A = c2895j;
                        return true;
                    }
                }
            } else if (i4 != 2) {
                continue;
            } else if (action == 3) {
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void m1158F(int[] iArr) {
        int iM2728g = this.f2064o.m2728g();
        if (iM2728g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < iM2728g; i8++) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2727f(i8));
            if (!abstractC2920v0M1144M.m5075o()) {
                int iM5062b = abstractC2920v0M1144M.m5062b();
                if (iM5062b < i) {
                    i = iM5062b;
                }
                if (iM5062b > i4) {
                    i4 = iM5062b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
    }

    /* renamed from: H */
    public final AbstractC2920v0 m1159H(int i) {
        AbstractC2920v0 abstractC2920v0 = null;
        if (this.f2033L) {
            return null;
        }
        int iM2731j = this.f2064o.m2731j();
        for (int i4 = 0; i4 < iM2731j; i4++) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2730i(i4));
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5068h() && m1160I(abstractC2920v0M1144M) == i) {
                if (!((ArrayList) this.f2064o.f5232n).contains(abstractC2920v0M1144M.f10848a)) {
                    return abstractC2920v0M1144M;
                }
                abstractC2920v0 = abstractC2920v0M1144M;
            }
        }
        return abstractC2920v0;
    }

    /* renamed from: I */
    public final int m1160I(AbstractC2920v0 abstractC2920v0) {
        if ((abstractC2920v0.f10857j & 524) == 0 && abstractC2920v0.m5065e()) {
            int i = abstractC2920v0.f10850c;
            ArrayList arrayList = (ArrayList) this.f2062n.f5178c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C2872a c2872a = (C2872a) arrayList.get(i4);
                int i8 = c2872a.f10602a;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int i9 = c2872a.f10603b;
                        if (i9 <= i) {
                            int i10 = c2872a.f10605d;
                            if (i9 + i10 <= i) {
                                i -= i10;
                            }
                        } else {
                            continue;
                        }
                    } else if (i8 == 8) {
                        int i11 = c2872a.f10603b;
                        if (i11 == i) {
                            i = c2872a.f10605d;
                        } else {
                            if (i11 < i) {
                                i--;
                            }
                            if (c2872a.f10605d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c2872a.f10603b <= i) {
                    i += c2872a.f10605d;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: J */
    public final long m1161J(AbstractC2920v0 abstractC2920v0) {
        return this.f2078v.f10871b ? abstractC2920v0.f10852e : abstractC2920v0.f10850c;
    }

    /* renamed from: L */
    public final AbstractC2920v0 m1162L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1144M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: N */
    public final Rect m1163N(View view) {
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        boolean z7 = c2890g0.f10691c;
        Rect rect = c2890g0.f10690b;
        if (z7) {
            C2912r0 c2912r0 = this.f2067p0;
            if (!c2912r0.f10825g || (!c2890g0.f10689a.m5071k() && !c2890g0.f10689a.m5066f())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f2084y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f2072s;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC2879c0) arrayList.get(i)).mo4754a(rect2, view, this, c2912r0);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c2890g0.f10691c = false;
                return rect;
            }
        }
        return rect;
    }

    /* renamed from: O */
    public final boolean m1164O() {
        return !this.f2020D || this.f2033L || this.f2062n.m2702l();
    }

    /* renamed from: P */
    public final boolean m1165P() {
        return this.f2035N > 0;
    }

    /* renamed from: Q */
    public final void m1166Q(int i) {
        if (this.f2080w == null) {
            return;
        }
        setScrollState(2);
        this.f2080w.mo1138p0(i);
        awakenScrollBars();
    }

    /* renamed from: R */
    public final void m1167R() {
        int iM2731j = this.f2064o.m2731j();
        for (int i = 0; i < iM2731j; i++) {
            ((C2890g0) this.f2064o.m2730i(i).getLayoutParams()).f10691c = true;
        }
        ArrayList arrayList = this.f2058l.f10758c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2890g0 c2890g0 = (C2890g0) ((AbstractC2920v0) arrayList.get(i4)).f10848a.getLayoutParams();
            if (c2890g0 != null) {
                c2890g0.f10691c = true;
            }
        }
    }

    /* renamed from: S */
    public final void m1168S(int i, int i4, boolean z7) {
        int i8 = i + i4;
        int iM2731j = this.f2064o.m2731j();
        for (int i9 = 0; i9 < iM2731j; i9++) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2730i(i9));
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5075o()) {
                int i10 = abstractC2920v0M1144M.f10850c;
                C2912r0 c2912r0 = this.f2067p0;
                if (i10 >= i8) {
                    if (f2005J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i9 + " holder " + abstractC2920v0M1144M + " now at position " + (abstractC2920v0M1144M.f10850c - i4));
                    }
                    abstractC2920v0M1144M.m5072l(-i4, z7);
                    c2912r0.f10824f = true;
                } else if (i10 >= i) {
                    if (f2005J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i9 + " holder " + abstractC2920v0M1144M + " now REMOVED");
                    }
                    abstractC2920v0M1144M.m5061a(8);
                    abstractC2920v0M1144M.m5072l(-i4, z7);
                    abstractC2920v0M1144M.f10850c = i - 1;
                    c2912r0.f10824f = true;
                }
            }
        }
        C2900l0 c2900l0 = this.f2058l;
        ArrayList arrayList = c2900l0.f10758c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(size);
            if (abstractC2920v0 != null) {
                int i11 = abstractC2920v0.f10850c;
                if (i11 >= i8) {
                    if (f2005J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC2920v0 + " now at position " + (abstractC2920v0.f10850c - i4));
                    }
                    abstractC2920v0.m5072l(-i4, z7);
                } else if (i11 >= i) {
                    abstractC2920v0.m5061a(8);
                    c2900l0.m5036h(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: T */
    public final void m1169T() {
        this.f2035N++;
    }

    /* renamed from: U */
    public final void m1170U(boolean z7) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.f2035N - 1;
        this.f2035N = i4;
        if (i4 < 1) {
            if (f2004I0 && i4 < 0) {
                throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f2035N = 0;
            if (z7) {
                int i8 = this.f2030I;
                this.f2030I = 0;
                if (i8 != 0 && (accessibilityManager = this.f2032K) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f2019C0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(size);
                    if (abstractC2920v0.f10848a.getParent() == this && !abstractC2920v0.m5075o() && (i = abstractC2920v0.f10864q) != -1) {
                        View view = abstractC2920v0.f10848a;
                        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                        view.setImportantForAccessibility(i);
                        abstractC2920v0.f10864q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: V */
    public final void m1171V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2044W) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2044W = motionEvent.getPointerId(i);
            int x6 = (int) (motionEvent.getX(i) + 0.5f);
            this.f2048d0 = x6;
            this.f2046b0 = x6;
            int y4 = (int) (motionEvent.getY(i) + 0.5f);
            this.f2049e0 = y4;
            this.f2047c0 = y4;
        }
    }

    /* renamed from: W */
    public final void m1172W() {
        if (this.f2079v0 || !this.f2016B) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        postOnAnimation(this.f2021D0);
        this.f2079v0 = true;
    }

    /* renamed from: X */
    public final void m1173X() {
        boolean z7;
        boolean z8 = false;
        if (this.f2033L) {
            C1240s c1240s = this.f2062n;
            c1240s.m2709s((ArrayList) c1240s.f5178c);
            c1240s.m2709s((ArrayList) c1240s.f5179d);
            c1240s.f5176a = 0;
            if (this.f2034M) {
                this.f2080w.mo1071Z();
            }
        }
        if (this.f2042U == null || !this.f2080w.mo1061B0()) {
            this.f2062n.m2695e();
        } else {
            this.f2062n.m2708r();
        }
        boolean z9 = this.f2073s0 || this.f2075t0;
        boolean z10 = this.f2020D && this.f2042U != null && ((z7 = this.f2033L) || z9 || this.f2080w.f10674f) && (!z7 || this.f2078v.f10871b);
        C2912r0 c2912r0 = this.f2067p0;
        c2912r0.f10828j = z10;
        if (z10 && z9 && !this.f2033L && this.f2042U != null && this.f2080w.mo1061B0()) {
            z8 = true;
        }
        c2912r0.f10829k = z8;
    }

    /* renamed from: Y */
    public final void m1174Y(boolean z7) {
        this.f2034M = z7 | this.f2034M;
        this.f2033L = true;
        int iM2731j = this.f2064o.m2731j();
        for (int i = 0; i < iM2731j; i++) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2730i(i));
            if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5075o()) {
                abstractC2920v0M1144M.m5061a(6);
            }
        }
        m1167R();
        C2900l0 c2900l0 = this.f2058l;
        ArrayList arrayList = c2900l0.f10758c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(i4);
            if (abstractC2920v0 != null) {
                abstractC2920v0.m5061a(6);
                abstractC2920v0.m5061a(1024);
            }
        }
        AbstractC2923x abstractC2923x = c2900l0.f10763h.f2078v;
        if (abstractC2923x == null || !abstractC2923x.f10871b) {
            c2900l0.m5035g();
        }
    }

    /* renamed from: Z */
    public final void m1175Z(AbstractC2920v0 abstractC2920v0, C0228p c0228p) {
        abstractC2920v0.f10857j &= -8193;
        boolean z7 = this.f2067p0.f10826h;
        C2332e c2332e = this.f2066p;
        if (z7 && abstractC2920v0.m5071k() && !abstractC2920v0.m5068h() && !abstractC2920v0.m5075o()) {
            ((C2189h) c2332e.f8171l).m3968d(abstractC2920v0, m1161J(abstractC2920v0));
        }
        C2192k c2192k = (C2192k) c2332e.f8170k;
        C2886e1 c2886e1M4981a = (C2886e1) c2192k.get(abstractC2920v0);
        if (c2886e1M4981a == null) {
            c2886e1M4981a = C2886e1.m4981a();
            c2192k.put(abstractC2920v0, c2886e1M4981a);
        }
        c2886e1M4981a.f10661b = c0228p;
        c2886e1M4981a.f10660a |= 4;
    }

    /* renamed from: a0 */
    public final int m1176a0(int i, float f8) {
        float height = f8 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f2038Q;
        float f9 = 0.0f;
        if (edgeEffect == null || AbstractC0715d.m1541C(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f2040S;
            if (edgeEffect2 != null && AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f2040S.onRelease();
                } else {
                    float fM1553V = AbstractC0715d.m1553V(this.f2040S, width, height);
                    if (AbstractC0715d.m1541C(this.f2040S) == 0.0f) {
                        this.f2040S.onRelease();
                    }
                    f9 = fM1553V;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f2038Q.onRelease();
            } else {
                float f10 = -AbstractC0715d.m1553V(this.f2038Q, -width, 1.0f - height);
                if (AbstractC0715d.m1541C(this.f2038Q) == 0.0f) {
                    this.f2038Q.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            abstractC2888f0.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    /* renamed from: b0 */
    public final int m1177b0(int i, float f8) {
        float width = f8 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f2039R;
        float f9 = 0.0f;
        if (edgeEffect == null || AbstractC0715d.m1541C(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f2041T;
            if (edgeEffect2 != null && AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f2041T.onRelease();
                } else {
                    float fM1553V = AbstractC0715d.m1553V(this.f2041T, height, 1.0f - width);
                    if (AbstractC0715d.m1541C(this.f2041T) == 0.0f) {
                        this.f2041T.onRelease();
                    }
                    f9 = fM1553V;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f2039R.onRelease();
            } else {
                float f10 = -AbstractC0715d.m1553V(this.f2039R, -height, width);
                if (AbstractC0715d.m1541C(this.f2039R) == 0.0f) {
                    this.f2039R.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * getHeight());
    }

    /* renamed from: c0 */
    public final void m1178c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2072s;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2890g0) {
            C2890g0 c2890g0 = (C2890g0) layoutParams;
            if (!c2890g0.f10691c) {
                Rect rect2 = c2890g0.f10690b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2080w.mo1832m0(this, view, this.f2072s, !this.f2020D, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2890g0) && this.f2080w.mo1078f((C2890g0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1127d()) {
            return this.f2080w.mo1136j(this.f2067p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1127d()) {
            return this.f2080w.mo1082k(this.f2067p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1127d()) {
            return this.f2080w.mo1084l(this.f2067p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1128e()) {
            return this.f2080w.mo1137m(this.f2067p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1128e()) {
            return this.f2080w.mo1087n(this.f2067p0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && abstractC2888f0.mo1128e()) {
            return this.f2080w.mo1089o(this.f2067p0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1179d0() {
        VelocityTracker velocityTracker = this.f2045a0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1191l0(0);
        EdgeEffect edgeEffect = this.f2038Q;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2038Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2039R;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2039R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2040S;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2040S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2041T;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2041T.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return getScrollingChildHelper().m3584a(f8, f9, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return getScrollingChildHelper().m3585b(f8, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3586c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().m3587d(i, i4, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z7;
        super.draw(canvas);
        ArrayList arrayList = this.f2084y;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC2879c0) arrayList.get(i)).mo3269c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2038Q;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2068q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2038Q;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2039R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2068q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2039R;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2040S;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2068q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2040S;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2041T;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2068q) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2041T;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(iSave4);
        }
        if ((z7 || this.f2042U == null || arrayList.size() <= 0 || !this.f2042U.mo4976f()) ? z7 : true) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1180e0(int i, int i4, MotionEvent motionEvent, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        m1194p();
        AbstractC2923x abstractC2923x = this.f2078v;
        int[] iArr = this.f2017B0;
        if (abstractC2923x != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m1181f0(i, i4, iArr);
            i9 = iArr[0];
            i10 = iArr[1];
            i11 = i - i9;
            i12 = i4 - i10;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.f2084y.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m1200v(i9, i10, i11, i12, this.f2087z0, i8, iArr);
        int i13 = iArr[0];
        int i14 = i11 - i13;
        int i15 = iArr[1];
        int i16 = i12 - i15;
        boolean z9 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.f2048d0;
        int[] iArr2 = this.f2087z0;
        int i18 = iArr2[0];
        this.f2048d0 = i17 - i18;
        int i19 = this.f2049e0;
        int i20 = iArr2[1];
        this.f2049e0 = i19 - i20;
        int[] iArr3 = this.f2015A0;
        iArr3[0] = iArr3[0] + i18;
        iArr3[1] = iArr3[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z7 = true;
            } else {
                float x6 = motionEvent.getX();
                float f8 = i14;
                float y4 = motionEvent.getY();
                float f9 = i16;
                if (f8 < 0.0f) {
                    m1203y();
                    z7 = true;
                    AbstractC0715d.m1553V(this.f2038Q, (-f8) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    z7 = true;
                    if (f8 > 0.0f) {
                        m1204z();
                        AbstractC0715d.m1553V(this.f2040S, f8 / getWidth(), y4 / getHeight());
                    } else {
                        z8 = false;
                        if (f9 >= 0.0f) {
                            m1153A();
                            AbstractC0715d.m1553V(this.f2039R, (-f9) / getHeight(), x6 / getWidth());
                        } else {
                            if (f9 > 0.0f) {
                                m1202x();
                                AbstractC0715d.m1553V(this.f2041T, f9 / getHeight(), 1.0f - (x6 / getWidth()));
                            }
                            if (z8 || f8 != 0.0f || f9 != 0.0f) {
                                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z8 = z7;
                        if (z8) {
                            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
                z8 = z7;
                if (f9 >= 0.0f) {
                }
                z8 = z7;
                if (z8) {
                }
            }
            m1193n(i, i4);
        } else {
            z7 = true;
        }
        if (i9 != 0 || i10 != 0) {
            m1201w(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z9 && i9 == 0 && i10 == 0) {
            return false;
        }
        return z7;
    }

    /* renamed from: f0 */
    public final void m1181f0(int i, int i4, int[] iArr) {
        AbstractC2920v0 abstractC2920v0;
        m1188j0();
        m1169T();
        int i8 = AbstractC1221f.f5104a;
        Trace.beginSection("RV Scroll");
        C2912r0 c2912r0 = this.f2067p0;
        m1155C(c2912r0);
        C2900l0 c2900l0 = this.f2058l;
        int iMo1090o0 = i != 0 ? this.f2080w.mo1090o0(i, c2900l0, c2912r0) : 0;
        int iMo1093q0 = i4 != 0 ? this.f2080w.mo1093q0(i4, c2900l0, c2912r0) : 0;
        Trace.endSection();
        C1250j c1250j = this.f2064o;
        int iM2728g = c1250j.m2728g();
        for (int i9 = 0; i9 < iM2728g; i9++) {
            View viewM2727f = c1250j.m2727f(i9);
            AbstractC2920v0 abstractC2920v0M1162L = m1162L(viewM2727f);
            if (abstractC2920v0M1162L != null && (abstractC2920v0 = abstractC2920v0M1162L.f10856i) != null) {
                View view = abstractC2920v0.f10848a;
                int left = viewM2727f.getLeft();
                int top = viewM2727f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1170U(true);
        m1190k0(false);
        if (iArr != null) {
            iArr[0] = iMo1090o0;
            iArr[1] = iMo1093q0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo1065T;
        int i4;
        char c8;
        boolean z7;
        this.f2080w.getClass();
        boolean z8 = true;
        boolean z9 = (this.f2078v == null || this.f2080w == null || m1165P() || this.f2026G) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C2912r0 c2912r0 = this.f2067p0;
        C2900l0 c2900l0 = this.f2058l;
        if (!z9 || (i != 2 && i != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z9) {
                m1194p();
                if (m1156D(view) != null) {
                    m1188j0();
                    viewMo1065T = this.f2080w.mo1065T(view, i, c2900l0, c2912r0);
                    m1190k0(false);
                }
                return null;
            }
            viewMo1065T = viewFindNextFocus;
            if (viewMo1065T == null && !viewMo1065T.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                m1178c0(viewMo1065T, null);
                return view;
            }
            if (viewMo1065T == null || viewMo1065T == this || viewMo1065T == view) {
                z8 = false;
            } else if (m1156D(viewMo1065T) == null) {
                z8 = false;
            } else if (view != null && m1156D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2072s;
                rect.set(0, 0, width, height);
                int width2 = viewMo1065T.getWidth();
                int height2 = viewMo1065T.getHeight();
                Rect rect2 = this.f2074t;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewMo1065T, rect2);
                int i8 = this.f2080w.m4992C() == 1 ? -1 : 1;
                int i9 = rect.left;
                int i10 = rect2.left;
                if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
                    i4 = 1;
                } else {
                    int i11 = rect.right;
                    int i12 = rect2.right;
                    i4 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? -1 : 0;
                }
                int i13 = rect.top;
                int i14 = rect2.top;
                if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
                    c8 = 1;
                } else {
                    int i15 = rect.bottom;
                    int i16 = rect2.bottom;
                    c8 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? '\uffff' : (char) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(AbstractC0008a1.m13i(this, sb));
                                    }
                                    if (c8 <= 0) {
                                    }
                                } else if (i4 <= 0) {
                                }
                            } else if (c8 >= 0) {
                            }
                        } else if (i4 >= 0) {
                        }
                    } else if (c8 <= 0 && (c8 != 0 || i4 * i8 <= 0)) {
                    }
                } else if (c8 >= 0 && (c8 != 0 || i4 * i8 >= 0)) {
                }
            }
            return z8 ? viewMo1065T : super.focusSearch(view, i);
        }
        if (this.f2080w.mo1128e()) {
            if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                z7 = true;
            }
            if (!z7 && this.f2080w.mo1127d()) {
                z7 = focusFinder.findNextFocus(this, view, !((this.f2080w.m4992C() != 1) ^ (i != 2)) ? 66 : 17) != null;
            }
            if (z7) {
                m1194p();
                if (m1156D(view) != null) {
                    m1188j0();
                    this.f2080w.mo1065T(view, i, c2900l0, c2912r0);
                    m1190k0(false);
                }
                return null;
            }
            viewMo1065T = focusFinder.findNextFocus(this, view, i);
            if (viewMo1065T == null) {
            }
            if (viewMo1065T == null) {
                z8 = false;
            }
            if (z8) {
            }
        }
        z7 = false;
        if (!z7) {
            if (focusFinder.findNextFocus(this, view, !((this.f2080w.m4992C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
            }
        }
        if (z7) {
        }
        viewMo1065T = focusFinder.findNextFocus(this, view, i);
        if (viewMo1065T == null) {
        }
        if (viewMo1065T == null) {
        }
        if (z8) {
        }
    }

    /* renamed from: g0 */
    public final void m1182g0(int i) {
        C2911r c2911r;
        if (this.f2026G) {
            return;
        }
        setScrollState(0);
        RunnableC2918u0 runnableC2918u0 = this.f2061m0;
        runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
        runnableC2918u0.f10840l.abortAnimation();
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && (c2911r = abstractC2888f0.f10673e) != null) {
            c2911r.m5050i();
        }
        AbstractC2888f0 abstractC2888f02 = this.f2080w;
        if (abstractC2888f02 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2888f02.mo1138p0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            return abstractC2888f0.mo1094r();
        }
        throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            return abstractC2888f0.mo1095s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2923x getAdapter() {
        return this.f2078v;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 == null) {
            return super.getBaseline();
        }
        abstractC2888f0.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2068q;
    }

    public C2924x0 getCompatAccessibilityDelegate() {
        return this.f2081w0;
    }

    public AbstractC2873a0 getEdgeEffectFactory() {
        return this.f2037P;
    }

    public AbstractC2876b0 getItemAnimator() {
        return this.f2042U;
    }

    public int getItemDecorationCount() {
        return this.f2084y.size();
    }

    public AbstractC2888f0 getLayoutManager() {
        return this.f2080w;
    }

    public int getMaxFlingVelocity() {
        return this.f2053i0;
    }

    public int getMinFlingVelocity() {
        return this.f2052h0;
    }

    public long getNanoTime() {
        if (f2010O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2892h0 getOnFlingListener() {
        return this.f2051g0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2059l0;
    }

    public C2898k0 getRecycledViewPool() {
        return this.f2058l.m5031c();
    }

    public int getScrollState() {
        return this.f2043V;
    }

    /* renamed from: h */
    public final void m1183h(AbstractC2920v0 abstractC2920v0) {
        View view = abstractC2920v0.f10848a;
        boolean z7 = view.getParent() == this;
        this.f2058l.m5041m(m1162L(view));
        if (abstractC2920v0.m5070j()) {
            this.f2064o.m2725d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z7) {
            this.f2064o.m2724c(view, -1, true);
            return;
        }
        C1250j c1250j = this.f2064o;
        int iIndexOfChild = ((C2921w) c1250j.f5230l).f10867a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C2528c) c1250j.f5231m).m4550q(iIndexOfChild);
            c1250j.m2732k(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: h0 */
    public final boolean m1184h0(EdgeEffect edgeEffect, int i, int i4) {
        if (i > 0) {
            return true;
        }
        float fM1541C = AbstractC0715d.m1541C(edgeEffect) * i4;
        float fAbs = Math.abs(-i) * 0.35f;
        float f8 = this.f2054j * 0.015f;
        double dLog = Math.log(fAbs / f8);
        double d8 = f2007L0;
        return ((float) (Math.exp((d8 / (d8 - 1.0d)) * dLog) * ((double) f8))) < fM1541C;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3589f(0);
    }

    /* renamed from: i */
    public final void m1185i(AbstractC2879c0 abstractC2879c0) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            abstractC2888f0.mo1125c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2084y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC2879c0);
        m1167R();
        requestLayout();
    }

    /* renamed from: i0 */
    public final void m1186i0(int i, int i4, boolean z7) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2026G) {
            return;
        }
        if (!abstractC2888f0.mo1127d()) {
            i = 0;
        }
        if (!this.f2080w.mo1128e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z7) {
            int i8 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i8 |= 2;
            }
            getScrollingChildHelper().m3590g(i8, 1);
        }
        this.f2061m0.m5060c(i, i4, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2016B;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2026G;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6902d;
    }

    /* renamed from: j */
    public final void m1187j(AbstractC2894i0 abstractC2894i0) {
        if (this.f2071r0 == null) {
            this.f2071r0 = new ArrayList();
        }
        this.f2071r0.add(abstractC2894i0);
    }

    /* renamed from: j0 */
    public final void m1188j0() {
        int i = this.f2022E + 1;
        this.f2022E = i;
        if (i != 1 || this.f2026G) {
            return;
        }
        this.f2024F = false;
    }

    /* renamed from: k */
    public final void m1189k(String str) {
        if (m1165P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f2036O > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder(C2181z.FRAGMENT_ENCODE_SET))));
        }
    }

    /* renamed from: k0 */
    public final void m1190k0(boolean z7) {
        if (this.f2022E < 1) {
            if (f2004I0) {
                throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f2022E = 1;
        }
        if (!z7 && !this.f2026G) {
            this.f2024F = false;
        }
        if (this.f2022E == 1) {
            if (z7 && this.f2024F && !this.f2026G && this.f2080w != null && this.f2078v != null) {
                m1196r();
            }
            if (!this.f2026G) {
                this.f2024F = false;
            }
        }
        this.f2022E--;
    }

    /* renamed from: l0 */
    public final void m1191l0(int i) {
        getScrollingChildHelper().m3591h(i);
    }

    /* renamed from: m */
    public final void m1192m() {
        int iM2731j = this.f2064o.m2731j();
        for (int i = 0; i < iM2731j; i++) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2730i(i));
            if (!abstractC2920v0M1144M.m5075o()) {
                abstractC2920v0M1144M.f10851d = -1;
                abstractC2920v0M1144M.f10854g = -1;
            }
        }
        C2900l0 c2900l0 = this.f2058l;
        ArrayList arrayList = c2900l0.f10756a;
        ArrayList arrayList2 = c2900l0.f10758c;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList2.get(i4);
            abstractC2920v0.f10851d = -1;
            abstractC2920v0.f10854g = -1;
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AbstractC2920v0 abstractC2920v02 = (AbstractC2920v0) arrayList.get(i8);
            abstractC2920v02.f10851d = -1;
            abstractC2920v02.f10854g = -1;
        }
        ArrayList arrayList3 = c2900l0.f10757b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                AbstractC2920v0 abstractC2920v03 = (AbstractC2920v0) c2900l0.f10757b.get(i9);
                abstractC2920v03.f10851d = -1;
                abstractC2920v03.f10854g = -1;
            }
        }
    }

    /* renamed from: n */
    public final void m1193n(int i, int i4) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2038Q;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f2038Q.onRelease();
            zIsFinished = this.f2038Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2040S;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2040S.onRelease();
            zIsFinished |= this.f2040S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2039R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2039R.onRelease();
            zIsFinished |= this.f2039R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2041T;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2041T.onRelease();
            zIsFinished |= this.f2041T.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f2035N = 0;
        this.f2016B = true;
        this.f2020D = this.f2020D && !isLayoutRequested();
        this.f2058l.m5033e();
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            abstractC2888f0.f10675g = true;
            abstractC2888f0.mo1831R(this);
        }
        this.f2079v0 = false;
        if (f2010O0) {
            ThreadLocal threadLocal = RunnableC2899l.f10750n;
            RunnableC2899l runnableC2899l = (RunnableC2899l) threadLocal.get();
            this.f2063n0 = runnableC2899l;
            if (runnableC2899l == null) {
                RunnableC2899l runnableC2899l2 = new RunnableC2899l();
                runnableC2899l2.f10752j = new ArrayList();
                runnableC2899l2.f10755m = new ArrayList();
                this.f2063n0 = runnableC2899l2;
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC2899l runnableC2899l3 = this.f2063n0;
                    runnableC2899l3.f10754l = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC2899l3);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC2899l runnableC2899l32 = this.f2063n0;
                    runnableC2899l32.f10754l = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC2899l32);
                }
            }
            ArrayList arrayList = this.f2063n0.f10752j;
            if (f2004I0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC2899l runnableC2899l;
        C2911r c2911r;
        super.onDetachedFromWindow();
        AbstractC2876b0 abstractC2876b0 = this.f2042U;
        if (abstractC2876b0 != null) {
            abstractC2876b0.mo4975e();
        }
        int i = 0;
        setScrollState(0);
        RunnableC2918u0 runnableC2918u0 = this.f2061m0;
        runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
        runnableC2918u0.f10840l.abortAnimation();
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null && (c2911r = abstractC2888f0.f10673e) != null) {
            c2911r.m5050i();
        }
        this.f2016B = false;
        AbstractC2888f0 abstractC2888f02 = this.f2080w;
        if (abstractC2888f02 != null) {
            abstractC2888f02.f10675g = false;
            abstractC2888f02.mo1114S(this);
        }
        this.f2019C0.clear();
        removeCallbacks(this.f2021D0);
        this.f2066p.getClass();
        while (C2886e1.f10659d.acquire() != null) {
        }
        C2900l0 c2900l0 = this.f2058l;
        ArrayList arrayList = c2900l0.f10758c;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            AbstractC0714c.m1523i(((AbstractC2920v0) arrayList.get(i4)).f10848a);
        }
        c2900l0.m5034f(c2900l0.f10763h.f2078v, false);
        while (i < getChildCount()) {
            int i8 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C2287a c2287a = (C2287a) childAt.getTag(com.exotv.net.R.id.pooling_container_listener_holder_tag);
            if (c2287a == null) {
                c2287a = new C2287a();
                childAt.setTag(com.exotv.net.R.id.pooling_container_listener_holder_tag, c2287a);
            }
            ArrayList arrayList2 = c2287a.f7979a;
            int iM3752s0 = AbstractC1914i.m3752s0(arrayList2);
            if (-1 < iM3752s0) {
                throw AbstractC0008a1.m10f(iM3752s0, arrayList2);
            }
            i = i8;
        }
        if (!f2010O0 || (runnableC2899l = this.f2063n0) == null) {
            return;
        }
        boolean zRemove = runnableC2899l.f10752j.remove(this);
        if (f2004I0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f2063n0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2084y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2879c0) arrayList.get(i)).mo1848b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f8;
        float axisValue;
        AbstractC2888f0 abstractC2888f0;
        if (this.f2080w != null && !this.f2026G && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f8 = this.f2080w.mo1128e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2080w.mo1127d() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f8 != 0.0f || axisValue != 0.0f) {
                    int i = (int) (axisValue * this.f2055j0);
                    int i4 = (int) (f8 * this.f2057k0);
                    abstractC2888f0 = this.f2080w;
                    if (abstractC2888f0 != null) {
                        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return false;
                    }
                    if (!this.f2026G) {
                        int[] iArr = this.f2017B0;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        boolean zMo1127d = abstractC2888f0.mo1127d();
                        boolean zMo1128e = this.f2080w.mo1128e();
                        int i8 = zMo1128e ? (zMo1127d ? 1 : 0) | 2 : zMo1127d ? 1 : 0;
                        float y4 = motionEvent.getY();
                        float x6 = motionEvent.getX();
                        int iM1176a0 = i - m1176a0(i, y4);
                        int iM1177b0 = i4 - m1177b0(i4, x6);
                        getScrollingChildHelper().m3590g(i8, 1);
                        if (m1199u(zMo1127d ? iM1176a0 : 0, zMo1128e ? iM1177b0 : 0, 1, this.f2017B0, this.f2087z0)) {
                            iM1176a0 -= iArr[0];
                            iM1177b0 -= iArr[1];
                        }
                        m1180e0(zMo1127d ? iM1176a0 : 0, zMo1128e ? iM1177b0 : 0, motionEvent, 1);
                        RunnableC2899l runnableC2899l = this.f2063n0;
                        if (runnableC2899l != null && (iM1176a0 != 0 || iM1177b0 != 0)) {
                            runnableC2899l.m5027a(this, iM1176a0, iM1177b0);
                        }
                        m1191l0(1);
                    }
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2080w.mo1128e()) {
                    f8 = -axisValue2;
                    if (f8 != 0.0f) {
                        int i9 = (int) (axisValue * this.f2055j0);
                        int i42 = (int) (f8 * this.f2057k0);
                        abstractC2888f0 = this.f2080w;
                        if (abstractC2888f0 != null) {
                        }
                    }
                } else {
                    if (this.f2080w.mo1127d()) {
                        axisValue = axisValue2;
                        f8 = 0.0f;
                    } else {
                        f8 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f8 != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        if (!this.f2026G) {
            this.f2014A = null;
            if (m1157E(motionEvent)) {
                m1179d0();
                setScrollState(0);
                return true;
            }
            AbstractC2888f0 abstractC2888f0 = this.f2080w;
            if (abstractC2888f0 != null) {
                boolean zMo1127d = abstractC2888f0.mo1127d();
                boolean zMo1128e = this.f2080w.mo1128e();
                if (this.f2045a0 == null) {
                    this.f2045a0 = VelocityTracker.obtain();
                }
                this.f2045a0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2028H) {
                        this.f2028H = false;
                    }
                    this.f2044W = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f2048d0 = x6;
                    this.f2046b0 = x6;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.f2049e0 = y4;
                    this.f2047c0 = y4;
                    EdgeEffect edgeEffect = this.f2038Q;
                    if (edgeEffect == null || AbstractC0715d.m1541C(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z7 = false;
                    } else {
                        AbstractC0715d.m1553V(this.f2038Q, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z7 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f2040S;
                    boolean z9 = z7;
                    if (edgeEffect2 != null) {
                        z9 = z7;
                        if (AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                            z9 = z7;
                            if (!canScrollHorizontally(1)) {
                                AbstractC0715d.m1553V(this.f2040S, 0.0f, motionEvent.getY() / getHeight());
                                z9 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f2039R;
                    boolean z10 = z9;
                    if (edgeEffect3 != null) {
                        z10 = z9;
                        if (AbstractC0715d.m1541C(edgeEffect3) != 0.0f) {
                            z10 = z9;
                            if (!canScrollVertically(-1)) {
                                AbstractC0715d.m1553V(this.f2039R, 0.0f, motionEvent.getX() / getWidth());
                                z10 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f2041T;
                    boolean z11 = z10;
                    if (edgeEffect4 != null) {
                        z11 = z10;
                        if (AbstractC0715d.m1541C(edgeEffect4) != 0.0f) {
                            z11 = z10;
                            if (!canScrollVertically(1)) {
                                AbstractC0715d.m1553V(this.f2041T, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z11 = true;
                            }
                        }
                    }
                    if (z11 || this.f2043V == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m1191l0(1);
                    }
                    int[] iArr = this.f2015A0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zMo1127d;
                    if (zMo1128e) {
                        i = (zMo1127d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m3590g(i, 0);
                } else if (actionMasked == 1) {
                    this.f2045a0.clear();
                    m1191l0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2044W);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2044W + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f2043V != 1) {
                        int i4 = x7 - this.f2046b0;
                        int i8 = y7 - this.f2047c0;
                        if (zMo1127d == 0 || Math.abs(i4) <= this.f2050f0) {
                            z8 = false;
                        } else {
                            this.f2048d0 = x7;
                            z8 = true;
                        }
                        if (zMo1128e && Math.abs(i8) > this.f2050f0) {
                            this.f2049e0 = y7;
                            z8 = true;
                        }
                        if (z8) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m1179d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2044W = motionEvent.getPointerId(actionIndex);
                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2048d0 = x8;
                    this.f2046b0 = x8;
                    int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2049e0 = y8;
                    this.f2047c0 = y8;
                } else if (actionMasked == 6) {
                    m1171V(motionEvent);
                }
                if (this.f2043V == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int i10 = AbstractC1221f.f5104a;
        Trace.beginSection("RV OnLayout");
        m1196r();
        Trace.endSection();
        this.f2020D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 == null) {
            m1195q(i, i4);
            return;
        }
        boolean zMo1107L = abstractC2888f0.mo1107L();
        boolean z7 = false;
        C2912r0 c2912r0 = this.f2067p0;
        if (zMo1107L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f2080w.f10670b.m1195q(i, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z7 = true;
            }
            this.f2023E0 = z7;
            if (z7 || this.f2078v == null) {
                return;
            }
            if (c2912r0.f10822d == 1) {
                m1197s();
            }
            this.f2080w.m5007s0(i, i4);
            c2912r0.f10827i = true;
            m1198t();
            this.f2080w.m5009u0(i, i4);
            if (this.f2080w.mo1140x0()) {
                this.f2080w.m5007s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c2912r0.f10827i = true;
                m1198t();
                this.f2080w.m5009u0(i, i4);
            }
            this.f2025F0 = getMeasuredWidth();
            this.f2027G0 = getMeasuredHeight();
            return;
        }
        if (this.f2018C) {
            this.f2080w.f10670b.m1195q(i, i4);
            return;
        }
        if (this.f2031J) {
            m1188j0();
            m1169T();
            m1173X();
            m1170U(true);
            if (c2912r0.f10829k) {
                c2912r0.f10825g = true;
            } else {
                this.f2062n.m2695e();
                c2912r0.f10825g = false;
            }
            this.f2031J = false;
            m1190k0(false);
        } else if (c2912r0.f10829k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2923x abstractC2923x = this.f2078v;
        if (abstractC2923x != null) {
            c2912r0.f10823e = abstractC2923x.mo1455a();
        } else {
            c2912r0.f10823e = 0;
        }
        m1188j0();
        this.f2080w.f10670b.m1195q(i, i4);
        m1190k0(false);
        c2912r0.f10825g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1165P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2906o0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2906o0 c2906o0 = (C2906o0) parcelable;
        this.f2060m = c2906o0;
        super.onRestoreInstanceState(c2906o0.f8189j);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2906o0 c2906o0 = new C2906o0(super.onSaveInstanceState());
        C2906o0 c2906o02 = this.f2060m;
        if (c2906o02 != null) {
            c2906o0.f10780l = c2906o02.f10780l;
            return c2906o0;
        }
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            c2906o0.f10780l = abstractC2888f0.mo1132g0();
            return c2906o0;
        }
        c2906o0.f10780l = null;
        return c2906o0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i8, int i9) {
        super.onSizeChanged(i, i4, i8, i9);
        if (i == i8 && i4 == i9) {
            return;
        }
        this.f2041T = null;
        this.f2039R = null;
        this.f2040S = null;
        this.f2038Q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[PHI: r1
      0x01f7: PHI (r1v59 int) = (r1v43 int), (r1v63 int) binds: [B:90:0x01e0, B:94:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1157E;
        int iMax;
        int i;
        RunnableC2918u0 runnableC2918u0;
        float f8;
        float f9;
        int minFlingVelocity;
        C2911r c2911rMo5055c;
        int iMo1440e;
        boolean z7;
        if (!this.f2026G && !this.f2028H) {
            C2895j c2895j = this.f2014A;
            if (c2895j == null) {
                zM1157E = motionEvent.getAction() == 0 ? false : m1157E(motionEvent);
            } else {
                int i4 = c2895j.f10713b;
                if (c2895j.f10733v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zM5022e = c2895j.m5022e(motionEvent.getX(), motionEvent.getY());
                        boolean zM5021d = c2895j.m5021d(motionEvent.getX(), motionEvent.getY());
                        if (zM5022e || zM5021d) {
                            if (zM5021d) {
                                c2895j.f10734w = 1;
                                c2895j.f10727p = (int) motionEvent.getX();
                            } else if (zM5022e) {
                                c2895j.f10734w = 2;
                                c2895j.f10724m = (int) motionEvent.getY();
                            }
                            c2895j.m5023g(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c2895j.f10733v == 2) {
                        c2895j.f10724m = 0.0f;
                        c2895j.f10727p = 0.0f;
                        c2895j.m5023g(1);
                        c2895j.f10734w = 0;
                    } else if (motionEvent.getAction() == 2 && c2895j.f10733v == 2) {
                        c2895j.m5024h();
                        if (c2895j.f10734w == 1) {
                            float x6 = motionEvent.getX();
                            int[] iArr = c2895j.f10736y;
                            iArr[0] = i4;
                            int i8 = c2895j.f10728q - i4;
                            iArr[1] = i8;
                            float fMax = Math.max(i4, Math.min(i8, x6));
                            if (Math.abs(c2895j.f10726o - fMax) >= 2.0f) {
                                int iM5020f = C2895j.m5020f(c2895j.f10727p, fMax, iArr, c2895j.f10730s.computeHorizontalScrollRange(), c2895j.f10730s.computeHorizontalScrollOffset(), c2895j.f10728q);
                                if (iM5020f != 0) {
                                    c2895j.f10730s.scrollBy(iM5020f, 0);
                                }
                                c2895j.f10727p = fMax;
                            }
                        }
                        if (c2895j.f10734w == 2) {
                            float y4 = motionEvent.getY();
                            int[] iArr2 = c2895j.f10735x;
                            iArr2[0] = i4;
                            int i9 = c2895j.f10729r - i4;
                            iArr2[1] = i9;
                            float fMax2 = Math.max(i4, Math.min(i9, y4));
                            if (Math.abs(c2895j.f10723l - fMax2) >= 2.0f) {
                                int iM5020f2 = C2895j.m5020f(c2895j.f10724m, fMax2, iArr2, c2895j.f10730s.computeVerticalScrollRange(), c2895j.f10730s.computeVerticalScrollOffset(), c2895j.f10729r);
                                if (iM5020f2 != 0) {
                                    c2895j.f10730s.scrollBy(0, iM5020f2);
                                }
                                c2895j.f10724m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f2014A = null;
                }
                zM1157E = true;
            }
            if (zM1157E) {
                m1179d0();
                setScrollState(0);
                return true;
            }
            AbstractC2888f0 abstractC2888f0 = this.f2080w;
            if (abstractC2888f0 != null) {
                boolean zMo1127d = abstractC2888f0.mo1127d();
                boolean zMo1128e = this.f2080w.mo1128e();
                if (this.f2045a0 == null) {
                    this.f2045a0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f2015A0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f2044W = motionEvent.getPointerId(0);
                    int x7 = (int) (motionEvent.getX() + 0.5f);
                    this.f2048d0 = x7;
                    this.f2046b0 = x7;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.f2049e0 = y7;
                    this.f2047c0 = y7;
                    int i10 = zMo1127d;
                    if (zMo1128e) {
                        i10 = (zMo1127d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m3590g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f2045a0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.f2045a0;
                        int i11 = this.f2053i0;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f10 = zMo1127d != 0 ? -this.f2045a0.getXVelocity(this.f2044W) : 0.0f;
                        float f11 = zMo1128e ? -this.f2045a0.getYVelocity(this.f2044W) : 0.0f;
                        if (f10 == 0.0f && f11 == 0.0f) {
                            setScrollState(0);
                            m1179d0();
                        } else {
                            int i12 = (int) f10;
                            int iMax2 = (int) f11;
                            AbstractC2888f0 abstractC2888f02 = this.f2080w;
                            if (abstractC2888f02 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f2026G) {
                                int iMo1127d = abstractC2888f02.mo1127d();
                                boolean zMo1128e2 = this.f2080w.mo1128e();
                                int i13 = this.f2052h0;
                                if (iMo1127d == 0 || Math.abs(i12) < i13) {
                                    i12 = 0;
                                }
                                if (!zMo1128e2 || Math.abs(iMax2) < i13) {
                                    iMax2 = 0;
                                }
                                if (i12 != 0 || iMax2 != 0) {
                                    if (i12 == 0) {
                                        iMax = 0;
                                        if (iMax2 == 0) {
                                            i = iMax2;
                                            iMax2 = 0;
                                            runnableC2918u0 = this.f2061m0;
                                            if (iMax == 0 || iMax2 != 0) {
                                                int i14 = -i11;
                                                iMax = Math.max(i14, Math.min(iMax, i11));
                                                iMax2 = Math.max(i14, Math.min(iMax2, i11));
                                                runnableC2918u0.m5058a(iMax, iMax2);
                                            }
                                            if (i12 == 0 || i != 0) {
                                                f8 = i12;
                                                f9 = i;
                                                if (!dispatchNestedPreFling(f8, f9)) {
                                                    boolean z8 = iMo1127d != 0 || zMo1128e2;
                                                    dispatchNestedFling(f8, f9, z8);
                                                    AbstractC2892h0 abstractC2892h0 = this.f2051g0;
                                                    if (abstractC2892h0 != null) {
                                                        AbstractC2928z0 abstractC2928z0 = (AbstractC2928z0) abstractC2892h0;
                                                        AbstractC2888f0 layoutManager = abstractC2928z0.f10877a.getLayoutManager();
                                                        if (layoutManager != null && abstractC2928z0.f10877a.getAdapter() != null && ((Math.abs(i) > (minFlingVelocity = abstractC2928z0.f10877a.getMinFlingVelocity()) || Math.abs(i12) > minFlingVelocity) && (layoutManager instanceof InterfaceC2910q0) && (c2911rMo5055c = abstractC2928z0.mo5055c(layoutManager)) != null && (iMo1440e = abstractC2928z0.mo1440e(layoutManager, i12, i)) != -1)) {
                                                            c2911rMo5055c.f10803a = iMo1440e;
                                                            layoutManager.m4990A0(c2911rMo5055c);
                                                        } else if (z8) {
                                                            if (zMo1128e2) {
                                                                iMo1127d = (iMo1127d == true ? 1 : 0) | 2;
                                                            }
                                                            getScrollingChildHelper().m3590g(iMo1127d, 1);
                                                            int i15 = -i11;
                                                            runnableC2918u0.m5058a(Math.max(i15, Math.min(i12, i11)), Math.max(i15, Math.min(i, i11)));
                                                        }
                                                        m1179d0();
                                                    }
                                                }
                                            } else {
                                                if (iMax == 0 && iMax2 == 0) {
                                                }
                                                m1179d0();
                                            }
                                        } else {
                                            EdgeEffect edgeEffect = this.f2039R;
                                            if (edgeEffect == null || AbstractC0715d.m1541C(edgeEffect) == 0.0f) {
                                                EdgeEffect edgeEffect2 = this.f2041T;
                                                if (edgeEffect2 != null && AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                                                    if (m1184h0(this.f2041T, iMax2, getHeight())) {
                                                        this.f2041T.onAbsorb(iMax2);
                                                        iMax2 = 0;
                                                    }
                                                    i = 0;
                                                    runnableC2918u0 = this.f2061m0;
                                                    if (iMax == 0) {
                                                        int i142 = -i11;
                                                        iMax = Math.max(i142, Math.min(iMax, i11));
                                                        iMax2 = Math.max(i142, Math.min(iMax2, i11));
                                                        runnableC2918u0.m5058a(iMax, iMax2);
                                                        if (i12 == 0) {
                                                            f8 = i12;
                                                            f9 = i;
                                                            if (!dispatchNestedPreFling(f8, f9)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i = iMax2;
                                                iMax2 = 0;
                                                runnableC2918u0 = this.f2061m0;
                                                if (iMax == 0) {
                                                }
                                            } else {
                                                int i16 = -iMax2;
                                                if (m1184h0(this.f2039R, i16, getHeight())) {
                                                    this.f2039R.onAbsorb(i16);
                                                    iMax2 = 0;
                                                }
                                                i = 0;
                                                runnableC2918u0 = this.f2061m0;
                                                if (iMax == 0) {
                                                }
                                            }
                                        }
                                    } else {
                                        EdgeEffect edgeEffect3 = this.f2038Q;
                                        if (edgeEffect3 == null || AbstractC0715d.m1541C(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.f2040S;
                                            if (edgeEffect4 != null && AbstractC0715d.m1541C(edgeEffect4) != 0.0f) {
                                                if (m1184h0(this.f2040S, i12, getWidth())) {
                                                    this.f2040S.onAbsorb(i12);
                                                    i12 = 0;
                                                }
                                                iMax = i12;
                                                i12 = 0;
                                                if (iMax2 == 0) {
                                                }
                                            }
                                            iMax = 0;
                                            if (iMax2 == 0) {
                                            }
                                        } else {
                                            int i17 = -i12;
                                            if (m1184h0(this.f2038Q, i17, getWidth())) {
                                                this.f2038Q.onAbsorb(i17);
                                                i12 = 0;
                                            }
                                            iMax = i12;
                                            i12 = 0;
                                            if (iMax2 == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            setScrollState(0);
                            m1179d0();
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f2044W);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2044W + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x8 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.f2048d0 - x8;
                        int iMax4 = this.f2049e0 - y8;
                        if (this.f2043V != 1) {
                            if (zMo1127d == 0) {
                                z7 = false;
                                if (zMo1128e) {
                                    iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f2050f0) : Math.min(0, iMax4 + this.f2050f0);
                                    if (iMax4 != 0) {
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    setScrollState(1);
                                }
                            } else {
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f2050f0) : Math.min(0, iMax3 + this.f2050f0);
                                if (iMax3 != 0) {
                                    z7 = true;
                                }
                                if (zMo1128e) {
                                }
                                if (z7) {
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.f2043V == 1) {
                            int[] iArr4 = this.f2017B0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iM1176a0 = iMax3 - m1176a0(iMax3, motionEvent.getY());
                            int iM1177b0 = iMax4 - m1177b0(iMax4, motionEvent.getX());
                            boolean zM1199u = m1199u(zMo1127d != 0 ? iM1176a0 : 0, zMo1128e ? iM1177b0 : 0, 0, this.f2017B0, this.f2087z0);
                            int[] iArr5 = this.f2087z0;
                            if (zM1199u) {
                                iM1176a0 -= iArr4[0];
                                iM1177b0 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i18 = iM1176a0;
                            int i19 = iM1177b0;
                            this.f2048d0 = x8 - iArr5[0];
                            this.f2049e0 = y8 - iArr5[1];
                            if (m1180e0(zMo1127d != 0 ? i18 : 0, zMo1128e ? i19 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC2899l runnableC2899l = this.f2063n0;
                            if (runnableC2899l != null && (i18 != 0 || i19 != 0)) {
                                runnableC2899l.m5027a(this, i18, i19);
                            }
                        }
                    } else if (actionMasked == 3) {
                        m1179d0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f2044W = motionEvent.getPointerId(actionIndex);
                        int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f2048d0 = x9;
                        this.f2046b0 = x9;
                        int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f2049e0 = y9;
                        this.f2047c0 = y9;
                    } else if (actionMasked == 6) {
                        m1171V(motionEvent);
                    }
                }
                this.f2045a0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m1194p() {
        if (!this.f2020D || this.f2033L) {
            int i = AbstractC1221f.f5104a;
            Trace.beginSection("RV FullInvalidate");
            m1196r();
            Trace.endSection();
            return;
        }
        C1240s c1240s = this.f2062n;
        if (c1240s.m2702l()) {
            int i4 = c1240s.f5176a;
            if ((i4 & 4) == 0 || (i4 & 11) != 0) {
                if (c1240s.m2702l()) {
                    int i8 = AbstractC1221f.f5104a;
                    Trace.beginSection("RV FullInvalidate");
                    m1196r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i9 = AbstractC1221f.f5104a;
            Trace.beginSection("RV PartialInvalidate");
            m1188j0();
            m1169T();
            c1240s.m2708r();
            if (!this.f2024F) {
                C1250j c1250j = this.f2064o;
                int iM2728g = c1250j.m2728g();
                int i10 = 0;
                while (true) {
                    if (i10 < iM2728g) {
                        AbstractC2920v0 abstractC2920v0M1144M = m1144M(c1250j.m2727f(i10));
                        if (abstractC2920v0M1144M != null && !abstractC2920v0M1144M.m5075o() && abstractC2920v0M1144M.m5071k()) {
                            m1196r();
                            break;
                        }
                        i10++;
                    } else {
                        c1240s.m2694d();
                        break;
                    }
                }
            }
            m1190k0(true);
            m1170U(true);
            Trace.endSection();
        }
    }

    /* renamed from: q */
    public final void m1195q(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        setMeasuredDimension(AbstractC2888f0.m4987g(i, paddingRight, getMinimumWidth()), AbstractC2888f0.m4987g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03aa  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1196r() {
        boolean z7;
        AbstractC2920v0 abstractC2920v0;
        View viewFindViewById;
        boolean z8;
        C0228p c0228p;
        ?? r32;
        RecyclerView recyclerView;
        boolean zM5015g;
        boolean z9;
        if (this.f2078v == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2080w == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C2912r0 c2912r0 = this.f2067p0;
        boolean z10 = false;
        c2912r0.f10827i = false;
        boolean z11 = true;
        boolean z12 = this.f2023E0 && !(this.f2025F0 == getWidth() && this.f2027G0 == getHeight());
        this.f2025F0 = 0;
        this.f2027G0 = 0;
        this.f2023E0 = false;
        if (c2912r0.f10822d == 1) {
            m1197s();
            this.f2080w.m5006r0(this);
            m1198t();
        } else {
            C1240s c1240s = this.f2062n;
            if ((((ArrayList) c1240s.f5179d).isEmpty() || ((ArrayList) c1240s.f5178c).isEmpty()) && !z12 && this.f2080w.f10682n == getWidth() && this.f2080w.f10683o == getHeight()) {
                this.f2080w.m5006r0(this);
            } else {
                this.f2080w.m5006r0(this);
                m1198t();
            }
        }
        c2912r0.m5051a(4);
        m1188j0();
        m1169T();
        c2912r0.f10822d = 1;
        boolean z13 = c2912r0.f10828j;
        C2900l0 c2900l0 = this.f2058l;
        C2332e c2332e = this.f2066p;
        if (z13) {
            int iM2728g = this.f2064o.m2728g() - 1;
            while (iM2728g >= 0) {
                AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2727f(iM2728g));
                if (abstractC2920v0M1144M.m5075o()) {
                    z9 = z11;
                } else {
                    long jM1161J = m1161J(abstractC2920v0M1144M);
                    this.f2042U.getClass();
                    C0228p c0228p2 = new C0228p();
                    c0228p2.m657b(abstractC2920v0M1144M);
                    C2189h c2189h = (C2189h) c2332e.f8171l;
                    C2192k c2192k = (C2192k) c2332e.f8170k;
                    AbstractC2920v0 abstractC2920v02 = (AbstractC2920v0) c2189h.m3966b(jM1161J);
                    if (abstractC2920v02 == null || abstractC2920v02.m5075o()) {
                        z9 = z11;
                        c2332e.m4146j(abstractC2920v0M1144M, c0228p2);
                    } else {
                        z9 = z11;
                        C2886e1 c2886e1 = (C2886e1) c2192k.get(abstractC2920v02);
                        boolean z14 = (c2886e1 == null || (c2886e1.f10660a & 1) == 0) ? false : z9;
                        C2886e1 c2886e12 = (C2886e1) c2192k.get(abstractC2920v0M1144M);
                        boolean z15 = (c2886e12 == null || (c2886e12.f10660a & 1) == 0) ? false : z9;
                        if (z14 && abstractC2920v02 == abstractC2920v0M1144M) {
                            c2332e.m4146j(abstractC2920v0M1144M, c0228p2);
                        } else {
                            C0228p c0228pM4157w = c2332e.m4157w(abstractC2920v02, 4);
                            c2332e.m4146j(abstractC2920v0M1144M, c0228p2);
                            C0228p c0228pM4157w2 = c2332e.m4157w(abstractC2920v0M1144M, 8);
                            if (c0228pM4157w == null) {
                                int iM2728g2 = this.f2064o.m2728g();
                                for (int i = 0; i < iM2728g2; i++) {
                                    AbstractC2920v0 abstractC2920v0M1144M2 = m1144M(this.f2064o.m2727f(i));
                                    if (abstractC2920v0M1144M2 != abstractC2920v0M1144M && m1161J(abstractC2920v0M1144M2) == jM1161J) {
                                        AbstractC2923x abstractC2923x = this.f2078v;
                                        if (abstractC2923x == null || !abstractC2923x.f10871b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC2920v0M1144M2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC2920v0M1144M);
                                            throw new IllegalStateException(AbstractC0008a1.m13i(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC2920v0M1144M2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC2920v0M1144M);
                                        throw new IllegalStateException(AbstractC0008a1.m13i(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC2920v02 + " cannot be found but it is necessary for " + abstractC2920v0M1144M + m1154B());
                            } else {
                                abstractC2920v02.m5074n(false);
                                if (z14) {
                                    m1183h(abstractC2920v02);
                                }
                                if (abstractC2920v02 != abstractC2920v0M1144M) {
                                    if (z15) {
                                        m1183h(abstractC2920v0M1144M);
                                    }
                                    abstractC2920v02.f10855h = abstractC2920v0M1144M;
                                    m1183h(abstractC2920v02);
                                    c2900l0.m5041m(abstractC2920v02);
                                    abstractC2920v0M1144M.m5074n(false);
                                    abstractC2920v0M1144M.f10856i = abstractC2920v02;
                                }
                                if (this.f2042U.mo4972a(abstractC2920v02, abstractC2920v0M1144M, c0228pM4157w, c0228pM4157w2)) {
                                    m1172W();
                                }
                            }
                        }
                    }
                }
                iM2728g--;
                z11 = z9;
            }
            z7 = z11;
            C2192k c2192k2 = (C2192k) c2332e.f8170k;
            int i4 = c2192k2.f7656l - 1;
            while (i4 >= 0) {
                AbstractC2920v0 abstractC2920v03 = (AbstractC2920v0) c2192k2.m3992f(i4);
                C2886e1 c2886e13 = (C2886e1) c2192k2.mo3994h(i4);
                int i8 = c2886e13.f10660a;
                int i9 = i8 & 3;
                C2921w c2921w = this.f2029H0;
                if (i9 == 3) {
                    RecyclerView recyclerView2 = c2921w.f10867a;
                    recyclerView2.f2080w.m5002k0(abstractC2920v03.f10848a, recyclerView2.f2058l);
                    r32 = z10;
                } else if ((i8 & 1) != 0) {
                    C0228p c0228p3 = c2886e13.f10661b;
                    if (c0228p3 == null) {
                        RecyclerView recyclerView3 = c2921w.f10867a;
                        recyclerView3.f2080w.m5002k0(abstractC2920v03.f10848a, recyclerView3.f2058l);
                        r32 = z10;
                    } else {
                        c2921w.m5083g(abstractC2920v03, c0228p3, c2886e13.f10662c);
                        r32 = z10;
                    }
                } else if ((i8 & 14) == 14) {
                    c2921w.m5082f(abstractC2920v03, c2886e13.f10661b, c2886e13.f10662c);
                    r32 = z10;
                } else if ((i8 & 12) == 12) {
                    C0228p c0228p4 = c2886e13.f10661b;
                    C0228p c0228p5 = c2886e13.f10662c;
                    c2921w.getClass();
                    abstractC2920v03.m5074n(z10);
                    RecyclerView recyclerView4 = c2921w.f10867a;
                    if (!recyclerView4.f2033L) {
                        C2891h c2891h = (C2891h) recyclerView4.f2042U;
                        c2891h.getClass();
                        int i10 = c0228p4.f1276a;
                        int i11 = c0228p5.f1276a;
                        if (i10 == i11 && c0228p4.f1277b == c0228p5.f1277b) {
                            c2891h.m4973c(abstractC2920v03);
                            recyclerView = recyclerView4;
                            zM5015g = false;
                        } else {
                            recyclerView = recyclerView4;
                            zM5015g = c2891h.m5015g(abstractC2920v03, i10, c0228p4.f1277b, i11, c0228p5.f1277b);
                        }
                        if (zM5015g) {
                            recyclerView.m1172W();
                        }
                    } else if (recyclerView4.f2042U.mo4972a(abstractC2920v03, abstractC2920v03, c0228p4, c0228p5)) {
                        recyclerView4.m1172W();
                    }
                    r32 = 0;
                } else {
                    if ((i8 & 4) != 0) {
                        c0228p = null;
                        c2921w.m5083g(abstractC2920v03, c2886e13.f10661b, null);
                    } else {
                        c0228p = null;
                        if ((i8 & 8) != 0) {
                            c2921w.m5082f(abstractC2920v03, c2886e13.f10661b, c2886e13.f10662c);
                        }
                    }
                    r32 = 0;
                    c2886e13.f10660a = r32;
                    c2886e13.f10661b = c0228p;
                    c2886e13.f10662c = c0228p;
                    C2886e1.f10659d.mo285g(c2886e13);
                    i4--;
                    z10 = false;
                }
                c0228p = null;
                c2886e13.f10660a = r32;
                c2886e13.f10661b = c0228p;
                c2886e13.f10662c = c0228p;
                C2886e1.f10659d.mo285g(c2886e13);
                i4--;
                z10 = false;
            }
        } else {
            z7 = true;
        }
        View view = null;
        this.f2080w.m5001j0(c2900l0);
        c2912r0.f10820b = c2912r0.f10823e;
        this.f2033L = false;
        this.f2034M = false;
        c2912r0.f10828j = false;
        c2912r0.f10829k = false;
        this.f2080w.f10674f = false;
        ArrayList arrayList = c2900l0.f10757b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0.f10679k) {
            abstractC2888f0.f10678j = 0;
            abstractC2888f0.f10679k = false;
            c2900l0.m5042n();
        }
        this.f2080w.mo1077e0(c2912r0);
        boolean z16 = z7;
        m1170U(z16);
        m1190k0(false);
        ((C2192k) c2332e.f8170k).clear();
        ((C2189h) c2332e.f8171l).m3965a();
        int[] iArr = this.f2083x0;
        int i12 = iArr[0];
        int i13 = iArr[z16 ? 1 : 0];
        m1158F(iArr);
        if ((iArr[0] == i12 && iArr[z16 ? 1 : 0] == i13) ? false : true) {
            m1201w(0, 0);
        }
        if (this.f2059l0 && this.f2078v != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (((ArrayList) this.f2064o.f5232n).contains(getFocusedChild())) {
                    long j = c2912r0.f10831m;
                    if (j != -1 && (z8 = this.f2078v.f10871b) && z8) {
                        int iM2731j = this.f2064o.m2731j();
                        int i14 = 0;
                        abstractC2920v0 = null;
                        while (true) {
                            if (i14 >= iM2731j) {
                                break;
                            }
                            AbstractC2920v0 abstractC2920v0M1144M3 = m1144M(this.f2064o.m2730i(i14));
                            if (abstractC2920v0M1144M3 != null && !abstractC2920v0M1144M3.m5068h() && abstractC2920v0M1144M3.f10852e == j) {
                                if (!((ArrayList) this.f2064o.f5232n).contains(abstractC2920v0M1144M3.f10848a)) {
                                    abstractC2920v0 = abstractC2920v0M1144M3;
                                    break;
                                }
                                abstractC2920v0 = abstractC2920v0M1144M3;
                            }
                            i14++;
                        }
                    } else {
                        abstractC2920v0 = null;
                    }
                    if (abstractC2920v0 != null) {
                        View view2 = abstractC2920v0.f10848a;
                        if (!((ArrayList) this.f2064o.f5232n).contains(view2) && view2.hasFocusable()) {
                            view = view2;
                        } else if (this.f2064o.m2728g() > 0) {
                            int i15 = c2912r0.f10830l;
                            int i16 = i15 != -1 ? i15 : 0;
                            int iM5052b = c2912r0.m5052b();
                            for (int i17 = i16; i17 < iM5052b; i17++) {
                                AbstractC2920v0 abstractC2920v0M1159H = m1159H(i17);
                                if (abstractC2920v0M1159H == null) {
                                    break;
                                }
                                View view3 = abstractC2920v0M1159H.f10848a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                    break;
                                }
                            }
                            int iMin = Math.min(iM5052b, i16) - 1;
                            while (true) {
                                if (iMin < 0) {
                                    break;
                                }
                                AbstractC2920v0 abstractC2920v0M1159H2 = m1159H(iMin);
                                if (abstractC2920v0M1159H2 == null) {
                                    break;
                                }
                                View view4 = abstractC2920v0M1159H2.f10848a;
                                if (view4.hasFocusable()) {
                                    view = view4;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        if (view != null) {
                            int i18 = c2912r0.f10832n;
                            if (i18 != -1 && (viewFindViewById = view.findViewById(i18)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
            }
        }
        c2912r0.f10831m = -1L;
        c2912r0.f10830l = -1;
        c2912r0.f10832n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z7) {
        AbstractC2920v0 abstractC2920v0M1144M = m1144M(view);
        if (abstractC2920v0M1144M != null) {
            if (abstractC2920v0M1144M.m5070j()) {
                abstractC2920v0M1144M.f10857j &= -257;
            } else if (!abstractC2920v0M1144M.m5075o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC2920v0M1144M);
                throw new IllegalArgumentException(AbstractC0008a1.m13i(this, sb));
            }
        } else if (f2004I0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0008a1.m13i(this, sb2));
        }
        view.clearAnimation();
        m1144M(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C2911r c2911r = this.f2080w.f10673e;
        if ((c2911r == null || !c2911r.f10807e) && !m1165P() && view2 != null) {
            m1178c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f2080w.mo1832m0(this, view, rect, z7, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        ArrayList arrayList = this.f2086z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2895j) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2022E != 0 || this.f2026G) {
            this.f2024F = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1197s() {
        int iM1160I;
        C2886e1 c2886e1;
        View viewM1156D;
        C2912r0 c2912r0 = this.f2067p0;
        c2912r0.m5051a(1);
        m1155C(c2912r0);
        c2912r0.f10827i = false;
        m1188j0();
        C2332e c2332e = this.f2066p;
        C2192k c2192k = (C2192k) c2332e.f8170k;
        C2192k c2192k2 = (C2192k) c2332e.f8170k;
        c2192k.clear();
        C2189h c2189h = (C2189h) c2332e.f8171l;
        c2189h.m3965a();
        m1169T();
        m1173X();
        AbstractC2920v0 abstractC2920v0M1162L = null;
        View focusedChild = (this.f2059l0 && hasFocus() && this.f2078v != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM1156D = m1156D(focusedChild)) != null) {
            abstractC2920v0M1162L = m1162L(viewM1156D);
        }
        if (abstractC2920v0M1162L == null) {
            c2912r0.f10831m = -1L;
            c2912r0.f10830l = -1;
            c2912r0.f10832n = -1;
        } else {
            c2912r0.f10831m = this.f2078v.f10871b ? abstractC2920v0M1162L.f10852e : -1L;
            if (!this.f2033L) {
                if (abstractC2920v0M1162L.m5068h()) {
                    iM1160I = abstractC2920v0M1162L.f10851d;
                } else {
                    RecyclerView recyclerView = abstractC2920v0M1162L.f10865r;
                    iM1160I = recyclerView == null ? -1 : recyclerView.m1160I(abstractC2920v0M1162L);
                }
                c2912r0.f10830l = iM1160I;
                View focusedChild2 = abstractC2920v0M1162L.f10848a;
                int id = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id = focusedChild2.getId();
                    }
                }
                c2912r0.f10832n = id;
            }
        }
        c2912r0.f10826h = c2912r0.f10828j && this.f2075t0;
        this.f2075t0 = false;
        this.f2073s0 = false;
        c2912r0.f10825g = c2912r0.f10829k;
        c2912r0.f10823e = this.f2078v.mo1455a();
        m1158F(this.f2083x0);
        if (c2912r0.f10828j) {
            int iM2728g = this.f2064o.m2728g();
            for (int i = 0; i < iM2728g; i++) {
                AbstractC2920v0 abstractC2920v0M1144M = m1144M(this.f2064o.m2727f(i));
                if (!abstractC2920v0M1144M.m5075o() && (!abstractC2920v0M1144M.m5066f() || this.f2078v.f10871b)) {
                    AbstractC2876b0 abstractC2876b0 = this.f2042U;
                    AbstractC2876b0.m4971b(abstractC2920v0M1144M);
                    abstractC2920v0M1144M.m5063c();
                    abstractC2876b0.getClass();
                    C0228p c0228p = new C0228p();
                    c0228p.m657b(abstractC2920v0M1144M);
                    C2886e1 c2886e1M4981a = (C2886e1) c2192k2.get(abstractC2920v0M1144M);
                    if (c2886e1M4981a == null) {
                        c2886e1M4981a = C2886e1.m4981a();
                        c2192k2.put(abstractC2920v0M1144M, c2886e1M4981a);
                    }
                    c2886e1M4981a.f10661b = c0228p;
                    c2886e1M4981a.f10660a |= 4;
                    if (c2912r0.f10826h && abstractC2920v0M1144M.m5071k() && !abstractC2920v0M1144M.m5068h() && !abstractC2920v0M1144M.m5075o() && !abstractC2920v0M1144M.m5066f()) {
                        c2189h.m3968d(abstractC2920v0M1144M, m1161J(abstractC2920v0M1144M));
                    }
                }
            }
        }
        if (c2912r0.f10829k) {
            int iM2731j = this.f2064o.m2731j();
            for (int i4 = 0; i4 < iM2731j; i4++) {
                AbstractC2920v0 abstractC2920v0M1144M2 = m1144M(this.f2064o.m2730i(i4));
                if (f2004I0 && abstractC2920v0M1144M2.f10850c == -1 && !abstractC2920v0M1144M2.m5068h()) {
                    throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC2920v0M1144M2.m5075o() && abstractC2920v0M1144M2.f10851d == -1) {
                    abstractC2920v0M1144M2.f10851d = abstractC2920v0M1144M2.f10850c;
                }
            }
            boolean z7 = c2912r0.f10824f;
            c2912r0.f10824f = false;
            this.f2080w.mo1075d0(this.f2058l, c2912r0);
            c2912r0.f10824f = z7;
            for (int i8 = 0; i8 < this.f2064o.m2728g(); i8++) {
                AbstractC2920v0 abstractC2920v0M1144M3 = m1144M(this.f2064o.m2727f(i8));
                if (!abstractC2920v0M1144M3.m5075o() && ((c2886e1 = (C2886e1) c2192k2.get(abstractC2920v0M1144M3)) == null || (c2886e1.f10660a & 4) == 0)) {
                    AbstractC2876b0.m4971b(abstractC2920v0M1144M3);
                    boolean z8 = (abstractC2920v0M1144M3.f10857j & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED) != 0;
                    AbstractC2876b0 abstractC2876b02 = this.f2042U;
                    abstractC2920v0M1144M3.m5063c();
                    abstractC2876b02.getClass();
                    C0228p c0228p2 = new C0228p();
                    c0228p2.m657b(abstractC2920v0M1144M3);
                    if (z8) {
                        m1175Z(abstractC2920v0M1144M3, c0228p2);
                    } else {
                        C2886e1 c2886e1M4981a2 = (C2886e1) c2192k2.get(abstractC2920v0M1144M3);
                        if (c2886e1M4981a2 == null) {
                            c2886e1M4981a2 = C2886e1.m4981a();
                            c2192k2.put(abstractC2920v0M1144M3, c2886e1M4981a2);
                        }
                        c2886e1M4981a2.f10660a |= 2;
                        c2886e1M4981a2.f10661b = c0228p2;
                    }
                }
            }
            m1192m();
        } else {
            m1192m();
        }
        m1170U(true);
        m1190k0(false);
        c2912r0.f10822d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2026G) {
            return;
        }
        boolean zMo1127d = abstractC2888f0.mo1127d();
        boolean zMo1128e = this.f2080w.mo1128e();
        if (zMo1127d || zMo1128e) {
            if (!zMo1127d) {
                i = 0;
            }
            if (!zMo1128e) {
                i4 = 0;
            }
            m1180e0(i, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1165P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2030I |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C2924x0 c2924x0) {
        this.f2081w0 = c2924x0;
        AbstractC1828m0.m3608m(this, c2924x0);
    }

    public void setAdapter(AbstractC2923x abstractC2923x) {
        setLayoutFrozen(false);
        AbstractC2923x abstractC2923x2 = this.f2078v;
        C2904n0 c2904n0 = this.f2056k;
        if (abstractC2923x2 != null) {
            abstractC2923x2.f10870a.unregisterObserver(c2904n0);
            this.f2078v.mo1458f(this);
        }
        AbstractC2876b0 abstractC2876b0 = this.f2042U;
        if (abstractC2876b0 != null) {
            abstractC2876b0.mo4975e();
        }
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        C2900l0 c2900l0 = this.f2058l;
        if (abstractC2888f0 != null) {
            abstractC2888f0.m5000i0(c2900l0);
            this.f2080w.m5001j0(c2900l0);
        }
        c2900l0.f10756a.clear();
        c2900l0.m5035g();
        C1240s c1240s = this.f2062n;
        c1240s.m2709s((ArrayList) c1240s.f5178c);
        c1240s.m2709s((ArrayList) c1240s.f5179d);
        c1240s.f5176a = 0;
        AbstractC2923x abstractC2923x3 = this.f2078v;
        this.f2078v = abstractC2923x;
        if (abstractC2923x != null) {
            abstractC2923x.f10870a.registerObserver(c2904n0);
        }
        AbstractC2888f0 abstractC2888f02 = this.f2080w;
        if (abstractC2888f02 != null) {
            abstractC2888f02.mo1222Q();
        }
        AbstractC2923x abstractC2923x4 = this.f2078v;
        c2900l0.f10756a.clear();
        c2900l0.m5035g();
        c2900l0.m5034f(abstractC2923x3, true);
        C2898k0 c2898k0M5031c = c2900l0.m5031c();
        if (abstractC2923x3 != null) {
            c2898k0M5031c.f10748b--;
        }
        if (c2898k0M5031c.f10748b == 0) {
            SparseArray sparseArray = c2898k0M5031c.f10747a;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2896j0 c2896j0 = (C2896j0) sparseArray.valueAt(i);
                ArrayList arrayList = c2896j0.f10738a;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    AbstractC0714c.m1523i(((AbstractC2920v0) obj).f10848a);
                }
                c2896j0.f10738a.clear();
            }
        }
        if (abstractC2923x4 != null) {
            c2898k0M5031c.f10748b++;
        }
        c2900l0.m5033e();
        this.f2067p0.f10824f = true;
        m1174Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2927z interfaceC2927z) {
        if (interfaceC2927z == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f2068q) {
            this.f2041T = null;
            this.f2039R = null;
            this.f2040S = null;
            this.f2038Q = null;
        }
        this.f2068q = z7;
        super.setClipToPadding(z7);
        if (this.f2020D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC2873a0 abstractC2873a0) {
        abstractC2873a0.getClass();
        this.f2037P = abstractC2873a0;
        this.f2041T = null;
        this.f2039R = null;
        this.f2040S = null;
        this.f2038Q = null;
    }

    public void setHasFixedSize(boolean z7) {
        this.f2018C = z7;
    }

    public void setItemAnimator(AbstractC2876b0 abstractC2876b0) {
        AbstractC2876b0 abstractC2876b02 = this.f2042U;
        if (abstractC2876b02 != null) {
            abstractC2876b02.mo4975e();
            this.f2042U.f10616a = null;
        }
        this.f2042U = abstractC2876b0;
        if (abstractC2876b0 != null) {
            abstractC2876b0.f10616a = this.f2077u0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C2900l0 c2900l0 = this.f2058l;
        c2900l0.f10760e = i;
        c2900l0.m5042n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(AbstractC2888f0 abstractC2888f0) {
        C2911r c2911r;
        if (abstractC2888f0 == this.f2080w) {
            return;
        }
        setScrollState(0);
        RunnableC2918u0 runnableC2918u0 = this.f2061m0;
        runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
        runnableC2918u0.f10840l.abortAnimation();
        AbstractC2888f0 abstractC2888f02 = this.f2080w;
        if (abstractC2888f02 != null && (c2911r = abstractC2888f02.f10673e) != null) {
            c2911r.m5050i();
        }
        AbstractC2888f0 abstractC2888f03 = this.f2080w;
        C2900l0 c2900l0 = this.f2058l;
        if (abstractC2888f03 != null) {
            AbstractC2876b0 abstractC2876b0 = this.f2042U;
            if (abstractC2876b0 != null) {
                abstractC2876b0.mo4975e();
            }
            this.f2080w.m5000i0(c2900l0);
            this.f2080w.m5001j0(c2900l0);
            c2900l0.f10756a.clear();
            c2900l0.m5035g();
            if (this.f2016B) {
                AbstractC2888f0 abstractC2888f04 = this.f2080w;
                abstractC2888f04.f10675g = false;
                abstractC2888f04.mo1114S(this);
            }
            this.f2080w.m5011v0(null);
            this.f2080w = null;
        } else {
            c2900l0.f10756a.clear();
            c2900l0.m5035g();
        }
        C1250j c1250j = this.f2064o;
        RecyclerView recyclerView = ((C2921w) c1250j.f5230l).f10867a;
        ((C2528c) c1250j.f5231m).m4549p();
        ArrayList arrayList = (ArrayList) c1250j.f5232n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2920v0 abstractC2920v0M1144M = m1144M((View) arrayList.get(size));
            if (abstractC2920v0M1144M != null) {
                int i = abstractC2920v0M1144M.f10863p;
                if (recyclerView.m1165P()) {
                    abstractC2920v0M1144M.f10864q = i;
                    recyclerView.f2019C0.add(abstractC2920v0M1144M);
                } else {
                    View view = abstractC2920v0M1144M.f10848a;
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    view.setImportantForAccessibility(i);
                }
                abstractC2920v0M1144M.f10863p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            m1144M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2080w = abstractC2888f0;
        if (abstractC2888f0 != null) {
            if (abstractC2888f0.f10670b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC2888f0);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0008a1.m13i(abstractC2888f0.f10670b, sb));
            }
            abstractC2888f0.m5011v0(this);
            if (this.f2016B) {
                AbstractC2888f0 abstractC2888f05 = this.f2080w;
                abstractC2888f05.f10675g = true;
                abstractC2888f05.mo1831R(this);
            }
        }
        c2900l0.m5042n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C1824l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6902d) {
            ViewGroup viewGroup = scrollingChildHelper.f6901c;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            AbstractC1804e0.m3539k(viewGroup);
        }
        scrollingChildHelper.f6902d = z7;
    }

    public void setOnFlingListener(AbstractC2892h0 abstractC2892h0) {
        this.f2051g0 = abstractC2892h0;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2894i0 abstractC2894i0) {
        this.f2069q0 = abstractC2894i0;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f2059l0 = z7;
    }

    public void setRecycledViewPool(C2898k0 c2898k0) {
        C2900l0 c2900l0 = this.f2058l;
        RecyclerView recyclerView = c2900l0.f10763h;
        c2900l0.m5034f(recyclerView.f2078v, false);
        if (c2900l0.f10762g != null) {
            r2.f10748b--;
        }
        c2900l0.f10762g = c2898k0;
        if (c2898k0 != null && recyclerView.getAdapter() != null) {
            c2900l0.f10762g.f10748b++;
        }
        c2900l0.m5033e();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2902m0 interfaceC2902m0) {
    }

    public void setScrollState(int i) {
        C2911r c2911r;
        if (i == this.f2043V) {
            return;
        }
        if (f2005J0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f2043V, new Exception());
        }
        this.f2043V = i;
        if (i != 2) {
            RunnableC2918u0 runnableC2918u0 = this.f2061m0;
            runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
            runnableC2918u0.f10840l.abortAnimation();
            AbstractC2888f0 abstractC2888f0 = this.f2080w;
            if (abstractC2888f0 != null && (c2911r = abstractC2888f0.f10673e) != null) {
                c2911r.m5050i();
            }
        }
        AbstractC2888f0 abstractC2888f02 = this.f2080w;
        if (abstractC2888f02 != null) {
            abstractC2888f02.mo1235h0(i);
        }
        AbstractC2894i0 abstractC2894i0 = this.f2069q0;
        if (abstractC2894i0 != null) {
            abstractC2894i0.mo1432a(this, i);
        }
        ArrayList arrayList = this.f2071r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2894i0) this.f2071r0.get(size)).mo1432a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f2050f0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f2050f0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2916t0 abstractC2916t0) {
        this.f2058l.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m3590g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m3591h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z7) {
        C2911r c2911r;
        if (z7 != this.f2026G) {
            m1189k("Do not suppressLayout in layout or scroll");
            if (!z7) {
                this.f2026G = false;
                if (this.f2024F && this.f2080w != null && this.f2078v != null) {
                    requestLayout();
                }
                this.f2024F = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2026G = true;
            this.f2028H = true;
            setScrollState(0);
            RunnableC2918u0 runnableC2918u0 = this.f2061m0;
            runnableC2918u0.f10844p.removeCallbacks(runnableC2918u0);
            runnableC2918u0.f10840l.abortAnimation();
            AbstractC2888f0 abstractC2888f0 = this.f2080w;
            if (abstractC2888f0 == null || (c2911r = abstractC2888f0.f10673e) == null) {
                return;
            }
            c2911r.m5050i();
        }
    }

    /* renamed from: t */
    public final void m1198t() {
        m1188j0();
        m1169T();
        C2912r0 c2912r0 = this.f2067p0;
        c2912r0.m5051a(6);
        this.f2062n.m2695e();
        c2912r0.f10823e = this.f2078v.mo1455a();
        c2912r0.f10821c = 0;
        if (this.f2060m != null) {
            AbstractC2923x abstractC2923x = this.f2078v;
            int iM4162a = AbstractC2334g.m4162a(abstractC2923x.f10872c);
            if (iM4162a == 1 ? abstractC2923x.mo1455a() > 0 : iM4162a != 2) {
                Parcelable parcelable = this.f2060m.f10780l;
                if (parcelable != null) {
                    this.f2080w.mo1130f0(parcelable);
                }
                this.f2060m = null;
            }
        }
        c2912r0.f10825g = false;
        this.f2080w.mo1075d0(this.f2058l, c2912r0);
        c2912r0.f10824f = false;
        c2912r0.f10828j = c2912r0.f10828j && this.f2042U != null;
        c2912r0.f10822d = 4;
        m1170U(true);
        m1190k0(false);
    }

    /* renamed from: u */
    public final boolean m1199u(int i, int i4, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3586c(i, i4, i8, iArr, iArr2);
    }

    /* renamed from: v */
    public final void m1200v(int i, int i4, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().m3587d(i, i4, i8, i9, iArr, i10, iArr2);
    }

    /* renamed from: w */
    public final void m1201w(int i, int i4) {
        this.f2036O++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        AbstractC2894i0 abstractC2894i0 = this.f2069q0;
        if (abstractC2894i0 != null) {
            abstractC2894i0.mo1433b(this, i, i4);
        }
        ArrayList arrayList = this.f2071r0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2894i0) this.f2071r0.get(size)).mo1433b(this, i, i4);
            }
        }
        this.f2036O--;
    }

    /* renamed from: x */
    public final void m1202x() {
        if (this.f2041T != null) {
            return;
        }
        ((C2914s0) this.f2037P).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2041T = edgeEffect;
        if (this.f2068q) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: y */
    public final void m1203y() {
        if (this.f2038Q != null) {
            return;
        }
        ((C2914s0) this.f2037P).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2038Q = edgeEffect;
        if (this.f2068q) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: z */
    public final void m1204z() {
        if (this.f2040S != null) {
            return;
        }
        ((C2914s0) this.f2037P).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2040S = edgeEffect;
        if (this.f2068q) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fM3611a;
        char c8;
        TypedArray typedArray;
        boolean z7;
        char c9;
        AttributeSet attributeSet2;
        int i4;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f2056k = new C2904n0(this);
        this.f2058l = new C2900l0(this);
        this.f2066p = new C2332e(13);
        this.f2070r = new RunnableC2919v(this, 0);
        this.f2072s = new Rect();
        this.f2074t = new Rect();
        this.f2076u = new RectF();
        this.f2082x = new ArrayList();
        this.f2084y = new ArrayList();
        this.f2086z = new ArrayList();
        this.f2022E = 0;
        this.f2033L = false;
        this.f2034M = false;
        this.f2035N = 0;
        this.f2036O = 0;
        this.f2037P = f2013R0;
        C2891h c2891h = new C2891h();
        Object[] objArr = null;
        c2891h.f10616a = null;
        c2891h.f10617b = new ArrayList();
        c2891h.f10618c = 120L;
        c2891h.f10619d = 120L;
        c2891h.f10620e = 250L;
        c2891h.f10621f = 250L;
        int i8 = 1;
        c2891h.f10694g = true;
        c2891h.f10695h = new ArrayList();
        c2891h.f10696i = new ArrayList();
        c2891h.f10697j = new ArrayList();
        c2891h.f10698k = new ArrayList();
        c2891h.f10699l = new ArrayList();
        c2891h.f10700m = new ArrayList();
        c2891h.f10701n = new ArrayList();
        c2891h.f10702o = new ArrayList();
        c2891h.f10703p = new ArrayList();
        c2891h.f10704q = new ArrayList();
        c2891h.f10705r = new ArrayList();
        this.f2042U = c2891h;
        this.f2043V = 0;
        this.f2044W = -1;
        this.f2055j0 = Float.MIN_VALUE;
        this.f2057k0 = Float.MIN_VALUE;
        this.f2059l0 = true;
        this.f2061m0 = new RunnableC2918u0(this);
        this.f2065o0 = f2010O0 ? new C1131v(4) : null;
        C2912r0 c2912r0 = new C2912r0();
        c2912r0.f10819a = -1;
        c2912r0.f10820b = 0;
        c2912r0.f10821c = 0;
        c2912r0.f10822d = 1;
        c2912r0.f10823e = 0;
        c2912r0.f10824f = false;
        c2912r0.f10825g = false;
        c2912r0.f10826h = false;
        c2912r0.f10827i = false;
        c2912r0.f10828j = false;
        c2912r0.f10829k = false;
        this.f2067p0 = c2912r0;
        this.f2073s0 = false;
        this.f2075t0 = false;
        C2921w c2921w = new C2921w(this);
        this.f2077u0 = c2921w;
        this.f2079v0 = false;
        this.f2083x0 = new int[2];
        this.f2087z0 = new int[2];
        this.f2015A0 = new int[2];
        this.f2017B0 = new int[2];
        this.f2019C0 = new ArrayList();
        this.f2021D0 = new RunnableC2919v(this, i8);
        this.f2025F0 = 0;
        this.f2027G0 = 0;
        this.f2029H0 = new C2921w(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2050f0 = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = AbstractC1831n0.f6917a;
            fM3611a = AbstractC0622v.m1393e(viewConfiguration);
        } else {
            fM3611a = AbstractC1831n0.m3611a(viewConfiguration, context);
        }
        this.f2055j0 = fM3611a;
        this.f2057k0 = i9 >= 26 ? AbstractC0622v.m1394f(viewConfiguration) : AbstractC1831n0.m3611a(viewConfiguration, context);
        this.f2052h0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2053i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2054j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2042U.f10616a = c2921w;
        this.f2062n = new C1240s(new C2921w(this));
        this.f2064o = new C1250j(new C2921w(this));
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if ((i9 >= 26 ? AbstractC1810g0.m3546a(this) : 0) == 0 && i9 >= 26) {
            AbstractC1810g0.m3547b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2032K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2924x0(this));
        int[] iArr = AbstractC2796a.f10412a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC1828m0.m3607l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2068q = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC0008a1.m13i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c9 = 2;
            z7 = 1;
            attributeSet2 = attributeSet;
            typedArray = typedArrayObtainStyledAttributes;
            c8 = 3;
            i4 = i;
            new C2895j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.exotv.net.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.exotv.net.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.exotv.net.R.dimen.fastscroll_margin));
        } else {
            c8 = 3;
            typedArray = typedArrayObtainStyledAttributes;
            z7 = 1;
            c9 = 2;
            attributeSet2 = attributeSet;
            i4 = i;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2888f0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f2011P0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[z7] = attributeSet2;
                        objArr2[c9] = Integer.valueOf(i4);
                        objArr2[c8] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e8) {
                            e8.initCause(e);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                        }
                    }
                    constructor.setAccessible(z7);
                    setLayoutManager((AbstractC2888f0) constructor.newInstance(objArr));
                } catch (ClassCastException e9) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                }
            }
        }
        int[] iArr2 = f2006K0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        AbstractC1828m0.m3607l(this, context, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, i4);
        boolean z8 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
        setTag(com.exotv.net.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2888f0 abstractC2888f0 = this.f2080w;
        if (abstractC2888f0 != null) {
            return abstractC2888f0.mo1096t(layoutParams);
        }
        throw new IllegalStateException(AbstractC0008a1.m13i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
