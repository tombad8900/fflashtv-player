package com.exotv.net;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0120b;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import androidx.media3.exoplayer.audio.RunnableC0321j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import com.exotv.net.model.Channel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p002a1.C0019f0;
import p002a1.C0048u;
import p006a5.C0106a;
import p010b.C0533w;
import p016b5.C0586i;
import p024c5.AbstractC0704z;
import p024c5.C0648a1;
import p024c5.C0665g0;
import p024c5.C0672j;
import p024c5.C0682o;
import p024c5.C0689r0;
import p024c5.C0692t;
import p024c5.C0700x;
import p024c5.C0702y;
import p024c5.EnumC0698w;
import p044e7.C0926c;
import p061g7.C1057d;
import p061g7.C1058e;
import p061g7.C1060g;
import p061g7.C1065l;
import p062h.AbstractActivityC1083i;
import p069h7.AbstractC1206h;
import p069h7.C1215q;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p095l.C1629o;
import p102l6.C1689f;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1847s1;
import p105m0.C1850t1;
import p105m0.C1853u1;
import p105m0.C1859w1;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p195w4.C2649b;
import p195w4.C2658e;
import p195w4.C2663g;
import p195w4.C2667i;
import p195w4.C2671k;
import p195w4.C2673l;
import p195w4.C2675m;
import p195w4.C2677n;
import p195w4.C2679o;
import p195w4.C2689t;
import p195w4.C2695w;
import p195w4.EnumC2681p;
import p195w4.EnumC2683q;
import p195w4.RunnableC2661f;
import p195w4.RunnableC2665h;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.C2909q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC1083i {

    /* renamed from: p0 */
    public static final Set f2882p0;

    /* renamed from: q0 */
    public static final String f2883q0;

    /* renamed from: H */
    public LinearLayout f2884H;

    /* renamed from: I */
    public FrameLayout f2885I;

    /* renamed from: J */
    public C0702y f2886J;

    /* renamed from: K */
    public EnumC2683q f2887K;

    /* renamed from: L */
    public EnumC2683q f2888L;

    /* renamed from: M */
    public C0648a1 f2889M;

    /* renamed from: N */
    public C0016e f2890N;

    /* renamed from: O */
    public boolean f2891O;

    /* renamed from: P */
    public C0106a f2892P;

    /* renamed from: Q */
    public C1629o f2893Q;

    /* renamed from: R */
    public C2649b f2894R;

    /* renamed from: S */
    public C0682o f2895S;

    /* renamed from: T */
    public C0692t f2896T;

    /* renamed from: U */
    public List f2897U;

    /* renamed from: V */
    public int f2898V;

    /* renamed from: W */
    public boolean f2899W;

    /* renamed from: X */
    public boolean f2900X;

    /* renamed from: Y */
    public C0586i f2901Y;

    /* renamed from: Z */
    public Channel f2902Z;

    /* renamed from: a0 */
    public final List f2903a0;

    /* renamed from: b0 */
    public final List f2904b0;

    /* renamed from: c0 */
    public final HashMap f2905c0;

    /* renamed from: d0 */
    public LinearLayout f2906d0;

    /* renamed from: e0 */
    public TextView f2907e0;

    /* renamed from: f0 */
    public LinearLayout f2908f0;

    /* renamed from: g0 */
    public int f2909g0;

    /* renamed from: h0 */
    public int f2910h0;

    /* renamed from: i0 */
    public int f2911i0;

    /* renamed from: j0 */
    public int f2912j0;

    /* renamed from: k0 */
    public final int f2913k0;

    /* renamed from: l0 */
    public final int f2914l0;

    /* renamed from: m0 */
    public C2679o f2915m0;

    /* renamed from: n0 */
    public EnumC2683q f2916n0;

    /* renamed from: o0 */
    public boolean f2917o0;

    static {
        Set setM1512a0 = AbstractC0714c.m1512a0(16, 10763, 10764, 10767);
        f2882p0 = setM1512a0;
        f2883q0 = AbstractC1913h.m3740E0(setM1512a0, "%7C", null, null, null, 62);
    }

    public MainActivity() {
        EnumC2683q enumC2683q = EnumC2683q.f9746j;
        this.f2887K = enumC2683q;
        this.f2888L = enumC2683q;
        this.f2897U = C1921p.f7187j;
        C2675m c2675m = new C2675m("trending", "Trending", "/trending/movie/day");
        EnumC2681p enumC2681p = EnumC2681p.f9737j;
        C2671k c2671k = new C2671k(c2675m, enumC2681p, null, null, 12);
        C2675m c2675m2 = new C2675m("now_playing", "Now Playing", "/movie/now_playing");
        EnumC2681p enumC2681p2 = EnumC2681p.f9738k;
        this.f2903a0 = AbstractC1914i.m3753t0(c2671k, new C2671k(c2675m2, enumC2681p2, null, null, 12), new C2671k(new C2675m("popular", "Popular", "/movie/popular"), enumC2681p2, null, null, 12), new C2671k(new C2675m("top_rated", "Top Rated", "/movie/top_rated"), enumC2681p2, null, null, 12));
        this.f2904b0 = AbstractC1914i.m3753t0(new C2671k(new C2675m("trending", "Trending Series", "/trending/tv/day"), enumC2681p, null, f2882p0, 4), new C2671k(new C2675m("new_streaming", "New on Streaming", "/discover/tv"), enumC2681p2, new C0533w(0, this, MainActivity.class, "streamingQuery", "streamingQuery()Ljava/lang/String;", 0, 0, 2), null, 8), new C2671k(new C2675m("popular", "Popular Series", AbstractC0008a1.m25u("/discover/tv?sort_by=popularity.desc&without_genres=", f2883q0)), enumC2681p2, null, null, 12), new C2671k(new C2675m("top_rated", "Top Rated Series", "/tv/top_rated"), enumC2681p2, null, null, 12));
        this.f2905c0 = new HashMap();
        this.f2913k0 = -1;
        this.f2914l0 = -2;
    }

    /* renamed from: C */
    public static View m1664C(RecyclerView recyclerView) {
        float width = recyclerView.getWidth() / 2.0f;
        int childCount = recyclerView.getChildCount();
        View view = null;
        float f8 = Float.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getWidth() > 0) {
                float fAbs = Math.abs(((childAt.getRight() + childAt.getLeft()) / 2.0f) - width);
                if (fAbs < f8) {
                    view = childAt;
                    f8 = fAbs;
                }
            }
        }
        return view;
    }

    /* renamed from: D */
    public static RecyclerView m1665D(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        for (Object parent = view != null ? view.getParent() : null; parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return m1666E(viewGroup);
        }
        return null;
    }

    /* renamed from: E */
    public static final RecyclerView m1666E(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC2980h.m5135d("getChildAt(...)", childAt);
            RecyclerView recyclerViewM1666E = m1666E(childAt);
            if (recyclerViewM1666E != null) {
                return recyclerViewM1666E;
            }
        }
        return null;
    }

    /* renamed from: H */
    public static boolean m1667H(View view, ViewGroup viewGroup) {
        for (Object parent = view.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public static void m1668L(MainActivity mainActivity, int i) {
        boolean z7 = (i & 1) == 0;
        boolean z8 = (i & 2) == 0;
        boolean z9 = (i & 4) == 0;
        if (mainActivity.f2900X) {
            return;
        }
        mainActivity.f2900X = true;
        mainActivity.m1687Q(true);
        AbstractC1339x.m2850k(AbstractC0147m0.m566e(mainActivity), null, new C2695w(mainActivity, z7, z9, z8, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m1669N(HorizontalScrollView horizontalScrollView) {
        View childAt;
        horizontalScrollView.scrollTo(0, 0);
        View childAt2 = horizontalScrollView.getChildCount() > 0 ? horizontalScrollView.getChildAt(0) : null;
        if (childAt2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) childAt2;
            childAt = viewGroup.getChildCount() > 0 ? viewGroup.getChildAt(0) : null;
        }
        if (childAt != null && childAt.requestFocus()) {
            return childAt;
        }
        return null;
    }

    /* renamed from: W */
    public static HorizontalScrollView m1670W(View view) {
        for (Object parent = view.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof HorizontalScrollView) {
                return (HorizontalScrollView) parent;
            }
        }
        return null;
    }

    /* renamed from: Y */
    public static EnumC0698w m1671Y(EnumC2683q enumC2683q) {
        int iOrdinal = enumC2683q.ordinal();
        if (iOrdinal == 0) {
            return EnumC0698w.f2714m;
        }
        if (iOrdinal == 1) {
            return EnumC0698w.f2715n;
        }
        if (iOrdinal == 2) {
            return EnumC0698w.f2716o;
        }
        if (iOrdinal == 3) {
            return EnumC0698w.f2717p;
        }
        throw new C0048u();
    }

    /* renamed from: r */
    public static final void m1672r(MainActivity mainActivity, C2769l c2769l, EnumC2770m enumC2770m) {
        if (enumC2770m == EnumC2770m.f10248k) {
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SeriesDetailActivity.class).putExtra("series_id", c2769l.f10241a).putExtra("series_title", c2769l.f10242b));
        } else {
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MovieDetailActivity.class).putExtra("movie_id", c2769l.f10241a).putExtra("movie_title", c2769l.f10242b));
        }
    }

    /* renamed from: s */
    public static final void m1673s(MainActivity mainActivity, C0586i c0586i) {
        boolean z7 = c0586i.f2327b;
        mainActivity.f2901Y = c0586i;
        EnumC2683q enumC2683q = mainActivity.f2887K;
        EnumC2683q enumC2683q2 = EnumC2683q.f9746j;
        if (enumC2683q != enumC2683q2) {
            mainActivity.m1685O(enumC2683q2);
        }
        C0106a c0106a = mainActivity.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a.f512m.setText(mainActivity.getString(R.string.update));
        C0106a c0106a2 = mainActivity.f2892P;
        if (c0106a2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a2.f512m.setEnabled(true);
        C0106a c0106a3 = mainActivity.f2892P;
        if (c0106a3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a3.f500a.setEnabled(!z7);
        C0106a c0106a4 = mainActivity.f2892P;
        if (c0106a4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a4.f512m.setAlpha(1.0f);
        C0106a c0106a5 = mainActivity.f2892P;
        if (c0106a5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a5.f500a.setAlpha(z7 ? 0.4f : 1.0f);
        C0106a c0106a6 = mainActivity.f2892P;
        if (c0106a6 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a6.f505f.setIndeterminate(false);
        C0106a c0106a7 = mainActivity.f2892P;
        if (c0106a7 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a7.f505f.setProgress(0);
        C0106a c0106a8 = mainActivity.f2892P;
        if (c0106a8 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a8.f515p.setVisibility(8);
        C0106a c0106a9 = mainActivity.f2892P;
        if (c0106a9 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a9.f514o.setVisibility(8);
        C0106a c0106a10 = mainActivity.f2892P;
        if (c0106a10 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a10.f513n.setVisibility(8);
        C0106a c0106a11 = mainActivity.f2892P;
        if (c0106a11 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a11.f508i.setVisibility(0);
        C0106a c0106a12 = mainActivity.f2892P;
        if (c0106a12 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a12.f510k.setVisibility(8);
        C0106a c0106a13 = mainActivity.f2892P;
        if (c0106a13 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a13.f509j.setVisibility(8);
        C0106a c0106a14 = mainActivity.f2892P;
        if (c0106a14 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a14.f516q.setVisibility(0);
        C0106a c0106a15 = mainActivity.f2892P;
        if (c0106a15 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        TextView textView = c0106a15.f511l;
        String string = c0586i.f2328c;
        if (string == null) {
            string = C2181z.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC1206h.m2630D0(string)) {
            string = mainActivity.getString(R.string.update_prompt_default);
            AbstractC2980h.m5135d("getString(...)", string);
        }
        textView.setText(string);
        C0106a c0106a16 = mainActivity.f2892P;
        if (c0106a16 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a16.f512m.setVisibility(0);
        C0106a c0106a17 = mainActivity.f2892P;
        if (c0106a17 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a17.f500a.setVisibility(0);
        mainActivity.m1686P(false);
        C0702y c0702y = mainActivity.f2886J;
        if (c0702y == null) {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
        c0702y.m1473d(false);
        if (mainActivity.m1682J()) {
            C0106a c0106a18 = mainActivity.f2892P;
            if (c0106a18 != null) {
                c0106a18.f512m.post(new RunnableC2665h(mainActivity, 1));
            } else {
                AbstractC2980h.m5139h("b");
                throw null;
            }
        }
    }

    /* renamed from: x */
    public static HorizontalScrollView m1674x(View view) {
        if (view instanceof HorizontalScrollView) {
            return (HorizontalScrollView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC2980h.m5135d("getChildAt(...)", childAt);
            HorizontalScrollView horizontalScrollViewM1674x = m1674x(childAt);
            if (horizontalScrollViewM1674x != null) {
                return horizontalScrollViewM1674x;
            }
        }
        return null;
    }

    /* renamed from: y */
    public static final void m1675y(final int i, final int i4, final RecyclerView recyclerView, final MainActivity mainActivity) {
        View viewM1664C;
        if (i4 <= 0 || i == -1) {
            AbstractC2920v0 abstractC2920v0M1159H = recyclerView.m1159H(i);
            if (abstractC2920v0M1159H == null || (viewM1664C = abstractC2920v0M1159H.f10848a) == null) {
                viewM1664C = m1664C(recyclerView);
            }
            if (viewM1664C != null) {
                viewM1664C.setFocusable(true);
                viewM1664C.setFocusableInTouchMode(true);
                viewM1664C.requestFocus();
                return;
            }
            return;
        }
        AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.f2001x = i;
            linearLayoutManager.f2002y = 0;
            C2909q c2909q = linearLayoutManager.f2003z;
            if (c2909q != null) {
                c2909q.f10800j = -1;
            }
            linearLayoutManager.m5004n0();
        }
        recyclerView.postOnAnimation(new Runnable() { // from class: w4.j
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.m1675y(i, i4 - 1, recyclerView, mainActivity);
            }
        });
    }

    /* renamed from: z */
    public static boolean m1676z(RecyclerView recyclerView, int i) {
        if (i >= 0) {
            AbstractC2923x adapter = recyclerView.getAdapter();
            if (i < (adapter != null ? adapter.mo1455a() : 0)) {
                AbstractC2920v0 abstractC2920v0M1159H = recyclerView.m1159H(i);
                View view = abstractC2920v0M1159H != null ? abstractC2920v0M1159H.f10848a : null;
                if (view != null && view.isShown()) {
                    view.requestFocus();
                    return true;
                }
                AbstractC2888f0 layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.f2001x = i;
                    linearLayoutManager.f2002y = 0;
                    C2909q c2909q = linearLayoutManager.f2003z;
                    if (c2909q != null) {
                        c2909q.f10800j = -1;
                    }
                    linearLayoutManager.m5004n0();
                }
                recyclerView.post(new RunnableC2661f(recyclerView, i));
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final boolean m1677A() {
        if (this.f2887K != EnumC2683q.f9746j) {
            return false;
        }
        C0106a c0106a = this.f2892P;
        if (c0106a != null) {
            return m1676z(c0106a.f501b, this.f2898V);
        }
        AbstractC2980h.m5139h("b");
        throw null;
    }

    /* renamed from: B */
    public final EnumC2770m m1678B() {
        int iOrdinal = this.f2887K.ordinal();
        if (iOrdinal == 1) {
            return EnumC2770m.f10247j;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return EnumC2770m.f10248k;
    }

    /* renamed from: F */
    public final void m1679F() {
        if (!m1682J()) {
            C0672j.m1442a(this);
            return;
        }
        Window window = getWindow();
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        C1629o c1629o = new C1629o((View) c0106a.f507h);
        int i = Build.VERSION.SDK_INT;
        AbstractC0715d c1859w1 = i >= 35 ? new C1859w1(window, c1629o) : i >= 30 ? new C1853u1(window, c1629o) : i >= 26 ? new C1850t1(window, c1629o) : new C1847s1(window, c1629o);
        c1859w1.mo1583L(519);
        c1859w1.mo1596j0();
    }

    /* renamed from: G */
    public final void m1680G() {
        this.f2901Y = null;
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a.f516q.setVisibility(8);
        C0106a c0106a2 = this.f2892P;
        if (c0106a2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a2.f512m.setText(getString(R.string.update));
        C0106a c0106a3 = this.f2892P;
        if (c0106a3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a3.f512m.setEnabled(true);
        C0106a c0106a4 = this.f2892P;
        if (c0106a4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a4.f500a.setEnabled(true);
        C0106a c0106a5 = this.f2892P;
        if (c0106a5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a5.f512m.setAlpha(1.0f);
        C0106a c0106a6 = this.f2892P;
        if (c0106a6 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a6.f500a.setAlpha(1.0f);
        C0106a c0106a7 = this.f2892P;
        if (c0106a7 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a7.f505f.setIndeterminate(false);
        C0106a c0106a8 = this.f2892P;
        if (c0106a8 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a8.f505f.setProgress(0);
        C0106a c0106a9 = this.f2892P;
        if (c0106a9 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a9.f504e.setText(getString(R.string.download_percent, 0));
        C0106a c0106a10 = this.f2892P;
        if (c0106a10 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a10.f515p.setVisibility(8);
        C0106a c0106a11 = this.f2892P;
        if (c0106a11 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a11.f512m.setVisibility(8);
        C0106a c0106a12 = this.f2892P;
        if (c0106a12 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a12.f500a.setVisibility(8);
        C0106a c0106a13 = this.f2892P;
        if (c0106a13 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a13.f514o.setVisibility(8);
        C0106a c0106a14 = this.f2892P;
        if (c0106a14 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a14.f513n.setVisibility(8);
        C0702y c0702y = this.f2886J;
        if (c0702y != null) {
            c0702y.m1473d(true);
        } else {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
    }

    /* renamed from: I */
    public final boolean m1681I() {
        return getResources().getBoolean(R.bool.is_large_screen);
    }

    /* renamed from: J */
    public final boolean m1682J() {
        return getResources().getBoolean(R.bool.is_tv_layout);
    }

    /* renamed from: K */
    public final void m1683K(EnumC2770m enumC2770m) {
        C2673l c2673l = (C2673l) AbstractC1924s.m3758S(this.f2905c0, enumC2770m);
        boolean z7 = c2673l.f9715d;
        LinearLayout linearLayout = c2673l.f9713b;
        if (z7 || c2673l.f9714c) {
            return;
        }
        c2673l.f9715d = true;
        c2673l.f9716e = null;
        linearLayout.removeAllViews();
        ProgressBar progressBar = new ProgressBar(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f2913k0, this.f2914l0);
        layoutParams.gravity = 17;
        linearLayout.addView(progressBar, layoutParams);
        m1693X();
        AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C2689t(c2673l, enumC2770m, this, enumC2770m == EnumC2770m.f10247j ? this.f2903a0 : this.f2904b0, null, 0), 3);
    }

    /* renamed from: M */
    public final void m1684M() {
        C2679o c2679o = this.f2915m0;
        if (c2679o != null) {
            boolean z7 = c2679o.f9730c;
            String string = c2679o.f9729b;
            if (this.f2916n0 == this.f2887K) {
                C0106a c0106a = this.f2892P;
                if (c0106a == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0106a.f508i.setVisibility(0);
                if (c2679o.f9728a) {
                    C0106a c0106a2 = this.f2892P;
                    if (c0106a2 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a2.f510k.setVisibility(0);
                    C0106a c0106a3 = this.f2892P;
                    if (c0106a3 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    TextView textView = c0106a3.f511l;
                    if (string == null) {
                        string = getString(R.string.loading_channels);
                        AbstractC2980h.m5135d("getString(...)", string);
                    }
                    textView.setText(string);
                    C0106a c0106a4 = this.f2892P;
                    if (c0106a4 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a4.f509j.setVisibility(8);
                    m1686P(true);
                    return;
                }
                C0106a c0106a5 = this.f2892P;
                if (c0106a5 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0106a5.f510k.setVisibility(8);
                C0106a c0106a6 = this.f2892P;
                if (c0106a6 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0106a6.f511l.setText(string);
                C0106a c0106a7 = this.f2892P;
                if (c0106a7 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0106a7.f509j.setVisibility(z7 ? 0 : 8);
                if (!m1682J() || !z7) {
                    m1686P(true);
                    return;
                }
                m1686P(false);
                C0106a c0106a8 = this.f2892P;
                if (c0106a8 != null) {
                    c0106a8.f509j.post(new RunnableC2665h(this, 0));
                    return;
                } else {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
            }
        }
        C0106a c0106a9 = this.f2892P;
        if (c0106a9 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a9.f508i.setVisibility(8);
        m1686P(true);
    }

    /* renamed from: O */
    public final void m1685O(EnumC2683q enumC2683q) {
        if (this.f2887K == enumC2683q) {
            return;
        }
        this.f2887K = enumC2683q;
        if (enumC2683q != EnumC2683q.f9749m) {
            this.f2888L = enumC2683q;
        }
        m1691U();
    }

    /* renamed from: P */
    public final void m1686P(boolean z7) {
        int i = z7 ? 262144 : 393216;
        C0106a c0106a = this.f2892P;
        if (c0106a != null) {
            c0106a.f503d.setDescendantFocusability(i);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: Q */
    public final void m1687Q(boolean z7) {
        C0106a c0106a = this.f2892P;
        if (c0106a != null) {
            c0106a.f506g.setVisibility(z7 ? 0 : 8);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: R */
    public final void m1688R(boolean z7) {
        C0586i c0586i = this.f2901Y;
        boolean z8 = c0586i != null && c0586i.f2327b;
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a.f512m.setEnabled(!z7);
        C0106a c0106a2 = this.f2892P;
        if (c0106a2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a2.f500a.setEnabled((z7 || z8) ? false : true);
        C0106a c0106a3 = this.f2892P;
        if (c0106a3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        float f8 = 1.0f;
        c0106a3.f512m.setAlpha(z7 ? 0.6f : 1.0f);
        C0106a c0106a4 = this.f2892P;
        if (c0106a4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        TextView textView = c0106a4.f500a;
        if (z7) {
            f8 = 0.6f;
        } else if (z8) {
            f8 = 0.4f;
        }
        textView.setAlpha(f8);
        C0106a c0106a5 = this.f2892P;
        if (c0106a5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a5.f515p.setVisibility(z7 ? 0 : 8);
        if (z7) {
            C0106a c0106a6 = this.f2892P;
            if (c0106a6 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0106a6.f505f.setIndeterminate(false);
            C0106a c0106a7 = this.f2892P;
            if (c0106a7 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0106a7.f505f.setProgress(0);
            C0106a c0106a8 = this.f2892P;
            if (c0106a8 != null) {
                c0106a8.f504e.setText(getString(R.string.download_percent, 0));
            } else {
                AbstractC2980h.m5139h("b");
                throw null;
            }
        }
    }

    /* renamed from: S */
    public final void m1689S(List list) {
        C0692t c0692t = this.f2896T;
        if (c0692t == null) {
            AbstractC2980h.m5139h("channelAdapter");
            throw null;
        }
        AbstractC2980h.m5136e("channels", list);
        c0692t.f2703g = list;
        c0692t.f10870a.m5087b();
        C0692t c0692t2 = this.f2896T;
        if (c0692t2 != null) {
            c0692t2.m1468g(this.f2902Z);
        } else {
            AbstractC2980h.m5139h("channelAdapter");
            throw null;
        }
    }

    /* renamed from: T */
    public final void m1690T(boolean z7, String str, boolean z8, EnumC2683q enumC2683q) {
        m1680G();
        C2679o c2679o = z7 ? new C2679o(str, true, false) : str != null ? new C2679o(str, false, z8) : null;
        this.f2915m0 = c2679o;
        if (c2679o == null) {
            enumC2683q = null;
        }
        this.f2916n0 = enumC2683q;
        m1684M();
        m1694Z();
    }

    /* renamed from: U */
    public final void m1691U() {
        LinearLayout linearLayout;
        boolean z7 = this.f2887K == EnumC2683q.f9746j;
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a.f507h.setVisibility(z7 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2906d0;
        if (linearLayout2 == null) {
            AbstractC2980h.m5139h("catalogPage");
            throw null;
        }
        linearLayout2.setVisibility((z7 || this.f2887K == EnumC2683q.f9749m) ? 8 : 0);
        C0648a1 c0648a1 = this.f2889M;
        if (c0648a1 != null && (linearLayout = c0648a1.f2564n) != null) {
            linearLayout.setVisibility(this.f2887K == EnumC2683q.f9749m ? 0 : 8);
        }
        EnumC2770m enumC2770mM1678B = m1678B();
        if (enumC2770mM1678B != null) {
            HashMap map = this.f2905c0;
            C2673l c2673l = (C2673l) AbstractC1924s.m3758S(map, enumC2770mM1678B);
            this.f2908f0 = c2673l.f9713b;
            for (Map.Entry entry : map.entrySet()) {
                ((C2673l) entry.getValue()).f9712a.setVisibility(((EnumC2770m) entry.getKey()) == enumC2770mM1678B ? 0 : 8);
            }
            LinearLayout linearLayout3 = this.f2906d0;
            if (linearLayout3 == null) {
                AbstractC2980h.m5139h("catalogPage");
                throw null;
            }
            linearLayout3.setBackgroundResource(enumC2770mM1678B == EnumC2770m.f10247j ? R.drawable.bg_catalog_glow : R.drawable.bg_series_glow);
            if (!c2673l.f9714c && !c2673l.f9715d) {
                m1683K(enumC2770mM1678B);
            }
            m1693X();
        }
        if (this.f2887K == EnumC2683q.f9746j && this.f2897U.isEmpty() && !this.f2900X) {
            m1668L(this, 7);
        }
        C0702y c0702y = this.f2886J;
        if (c0702y == null) {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
        c0702y.m1474e(m1671Y(this.f2887K));
        m1684M();
        m1694Z();
    }

    /* renamed from: V */
    public final void m1692V(String str) {
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a.f513n.setText(str);
        C0106a c0106a2 = this.f2892P;
        if (c0106a2 != null) {
            c0106a2.f513n.setVisibility(0);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: X */
    public final void m1693X() {
        EnumC2770m enumC2770mM1678B = m1678B();
        if (enumC2770mM1678B == null) {
            return;
        }
        String str = ((C2673l) AbstractC1924s.m3758S(this.f2905c0, enumC2770mM1678B)).f9716e;
        if (str == null) {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        TextView textView = this.f2907e0;
        if (textView == null) {
            AbstractC2980h.m5139h("status");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.f2907e0;
        if (textView2 != null) {
            textView2.setVisibility(AbstractC1206h.m2630D0(str) ? 8 : 0);
        } else {
            AbstractC2980h.m5139h("status");
            throw null;
        }
    }

    /* renamed from: Z */
    public final void m1694Z() {
        C0016e c0016e = this.f2890N;
        if (c0016e == null) {
            return;
        }
        ((LinearLayout) c0016e.f63l).setVisibility((this.f2887K != EnumC2683q.f9749m || (this.f2915m0 != null && this.f2916n0 == this.f2887K) || this.f2901Y != null || this.f2891O || C0016e.f60m) ? false : true ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0246, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x028b, code lost:
    
        if (r7.requestFocus(r3) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ab, code lost:
    
        if (r11 == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104 A[EDGE_INSN: B:231:0x0104->B:85:0x0104 BREAK  A[LOOP:0: B:93:0x0117->B:235:?]] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v32, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewParent] */
    @Override // p062h.AbstractActivityC1083i, p011b0.AbstractActivityC0539e, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ?? r17;
        int i;
        HorizontalScrollView horizontalScrollViewM1670W;
        View viewM1669N;
        View viewM1697v;
        int i4;
        ?? r32;
        AbstractC2980h.m5136e("event", keyEvent);
        if (!m1681I() || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int i8 = 1;
        Object obj = null;
        if (keyEvent.getKeyCode() != 21) {
            boolean zRequestFocus = false;
            zRequestFocus = false;
            zRequestFocus = false;
            zRequestFocus = false;
            zRequestFocus = false;
            zRequestFocus = false;
            if (keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20) {
                C0702y c0702y = this.f2886J;
                if (c0702y == null) {
                    AbstractC2980h.m5139h("nav");
                    throw null;
                }
                if (m1667H(currentFocus, c0702y.f2749n)) {
                    C0702y c0702y2 = this.f2886J;
                    if (c0702y2 == null) {
                        AbstractC2980h.m5139h("nav");
                        throw null;
                    }
                    int keyCode = keyEvent.getKeyCode();
                    ArrayList arrayList = c0702y2.f2741f;
                    if (c0702y2.f2742g) {
                        int size = arrayList.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                r17 = obj;
                                i9 = -1;
                                break;
                            }
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            r17 = obj;
                            if (((C0700x) obj2).f2728a == currentFocus) {
                                break;
                            }
                            i9++;
                            obj = r17;
                        }
                        if (i9 < 0 || (keyCode == 19 ? i9 != 0 : keyCode != 20 || i9 != AbstractC1914i.m3752s0(arrayList))) {
                        }
                    }
                    if (this.f2887K != EnumC2683q.f9746j) {
                    }
                } else {
                    r17 = 0;
                    if (this.f2887K != EnumC2683q.f9746j) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    ?? r33 = keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22;
                    RecyclerView recyclerViewM1665D = r33 != false ? m1665D(currentFocus) : r17;
                    if (recyclerViewM1665D != null) {
                        C0689r0 c0689r0 = C0689r0.f2694a;
                        int keyCode2 = keyEvent.getKeyCode();
                        C0665g0 c0665g0 = recyclerViewM1665D instanceof C0665g0 ? (C0665g0) recyclerViewM1665D : r17;
                        if (!(c0665g0 != null ? c0665g0.m1434m0(currentFocus, keyCode2) : false)) {
                            HorizontalScrollView horizontalScrollViewM1670W2 = r33 != false ? m1670W(currentFocus) : r17;
                            if (horizontalScrollViewM1670W2 != null) {
                                C0689r0 c0689r02 = C0689r0.f2694a;
                                int keyCode3 = keyEvent.getKeyCode();
                                if (keyCode3 == 21 || keyCode3 == 22) {
                                    View childAt = horizontalScrollViewM1670W2.getChildAt(0);
                                    ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : r17;
                                    if (viewGroup == null) {
                                        r32 = false;
                                        if (r32 == false) {
                                            if (keyEvent.getRepeatCount() == 0) {
                                                switch (keyEvent.getKeyCode()) {
                                                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                                                        i = 33;
                                                        break;
                                                    case 20:
                                                        i = 130;
                                                        break;
                                                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                                                        i = 17;
                                                        break;
                                                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                                                        i = 66;
                                                        break;
                                                    default:
                                                        return super.dispatchKeyEvent(keyEvent);
                                                }
                                                View viewFocusSearch = currentFocus.focusSearch(i);
                                                if (viewFocusSearch != null && viewFocusSearch != currentFocus) {
                                                    RecyclerView recyclerViewM1665D2 = m1665D(currentFocus);
                                                    HorizontalScrollView horizontalScrollViewM1670W3 = m1670W(currentFocus);
                                                    int i11 = 12;
                                                    if (i == 66) {
                                                        C0702y c0702y3 = this.f2886J;
                                                        if (c0702y3 == null) {
                                                            AbstractC2980h.m5139h("nav");
                                                            throw r17;
                                                        }
                                                        if (m1667H(currentFocus, c0702y3.f2749n)) {
                                                            if (this.f2887K == EnumC2683q.f9749m) {
                                                                C0648a1 c0648a1 = this.f2889M;
                                                                if (c0648a1 != null) {
                                                                    EditText editText = c0648a1.f2557g;
                                                                    if (editText == null) {
                                                                        AbstractC2980h.m5139h("input");
                                                                        throw r17;
                                                                    }
                                                                    zRequestFocus = editText.requestFocus();
                                                                }
                                                            } else {
                                                                LinearLayout linearLayout = this.f2908f0;
                                                                if (linearLayout == null) {
                                                                    AbstractC2980h.m5139h("catalogContent");
                                                                    throw r17;
                                                                }
                                                                C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, linearLayout.getChildCount());
                                                                AbstractC2980h.m5136e("<this>", c0926cM1521g0);
                                                                C1057d c1057d = new C1057d(new C1058e(new C1058e(new C1060g(2, c0926cM1521g0), new C2658e(this, zRequestFocus ? 1 : 0), i8), new C1065l(i8), zRequestFocus ? 1 : 0));
                                                                RecyclerView recyclerView = (RecyclerView) (!c1057d.hasNext() ? r17 : c1057d.next());
                                                                if (recyclerView != null) {
                                                                    recyclerView.post(new RunnableC0320i(recyclerView, i11, this));
                                                                }
                                                                zRequestFocus = true;
                                                            }
                                                        }
                                                    }
                                                    if (i != 66 || horizontalScrollViewM1670W3 == null || m1667H(viewFocusSearch, horizontalScrollViewM1670W3)) {
                                                        ?? r52 = i == 33 || i == 130;
                                                        RecyclerView recyclerViewM1665D3 = m1665D(viewFocusSearch);
                                                        if (recyclerViewM1665D3 == null || recyclerViewM1665D3 == recyclerViewM1665D2) {
                                                            if (r52 != false && recyclerViewM1665D2 != null) {
                                                                View view = currentFocus;
                                                                while (true) {
                                                                    if (view != null) {
                                                                        LinearLayout linearLayout2 = this.f2908f0;
                                                                        if (linearLayout2 == null) {
                                                                            AbstractC2980h.m5139h("catalogContent");
                                                                            throw r17;
                                                                        }
                                                                        if (view != linearLayout2) {
                                                                            ?? parent = view.getParent();
                                                                            LinearLayout linearLayout3 = this.f2908f0;
                                                                            if (linearLayout3 == null) {
                                                                                AbstractC2980h.m5139h("catalogContent");
                                                                                throw r17;
                                                                            }
                                                                            if (parent == linearLayout3) {
                                                                                int iIndexOfChild = linearLayout3.indexOfChild(view);
                                                                                if (i == 33) {
                                                                                    i4 = iIndexOfChild - 1;
                                                                                } else if (i == 130) {
                                                                                    i4 = iIndexOfChild + 1;
                                                                                }
                                                                                if (i4 >= 0) {
                                                                                    LinearLayout linearLayout4 = this.f2908f0;
                                                                                    if (linearLayout4 == null) {
                                                                                        AbstractC2980h.m5139h("catalogContent");
                                                                                        throw r17;
                                                                                    }
                                                                                    if (i4 < linearLayout4.getChildCount()) {
                                                                                        LinearLayout linearLayout5 = this.f2908f0;
                                                                                        if (linearLayout5 == null) {
                                                                                            AbstractC2980h.m5139h("catalogContent");
                                                                                            throw r17;
                                                                                        }
                                                                                        View childAt2 = linearLayout5.getChildAt(i4);
                                                                                        AbstractC2980h.m5133b(childAt2);
                                                                                        viewM1697v = m1697v(childAt2, currentFocus, i);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                view = parent instanceof View ? (View) parent : r17;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (viewM1697v != null) {
                                                                }
                                                            }
                                                            if (r52 != false && (horizontalScrollViewM1670W = m1670W(viewFocusSearch)) != null && horizontalScrollViewM1670W != m1670W(currentFocus) && (viewM1669N = m1669N(horizontalScrollViewM1670W)) != null && viewM1669N.requestFocus(i)) {
                                                            }
                                                        } else {
                                                            recyclerViewM1665D3.post(new RunnableC0320i(recyclerViewM1665D3, i11, this));
                                                        }
                                                    }
                                                    zRequestFocus = true;
                                                }
                                            }
                                            return super.dispatchKeyEvent(keyEvent);
                                        }
                                    } else {
                                        View view2 = currentFocus;
                                        while (true) {
                                            if (view2.getParent() != viewGroup) {
                                                ?? parent2 = view2.getParent();
                                                view2 = parent2 instanceof View ? (View) parent2 : r17;
                                                if (view2 == null) {
                                                    break;
                                                }
                                            } else {
                                                int iIndexOfChild2 = viewGroup.indexOfChild(view2);
                                                if (iIndexOfChild2 != -1) {
                                                    int i12 = keyCode3 == 21 ? iIndexOfChild2 - 1 : iIndexOfChild2 + 1;
                                                    if (i12 < 0) {
                                                        break;
                                                    }
                                                    if (i12 < viewGroup.getChildCount()) {
                                                        viewGroup.getChildAt(i12).requestFocus();
                                                    }
                                                    r32 = true;
                                                }
                                            }
                                        }
                                        if (r32 == false) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            C0702y c0702y4 = this.f2886J;
            if (c0702y4 == null) {
                AbstractC2980h.m5139h("nav");
                throw null;
            }
            if (!m1667H(currentFocus, c0702y4.f2749n)) {
            }
        }
        return true;
    }

    @Override // p062h.AbstractActivityC1083i, p010b.AbstractActivityC0522l, p011b0.AbstractActivityC0539e, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        setTheme(R.style.Theme_ExoTV);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        final int i = 2;
        attributes.rotationAnimation = 2;
        window.setAttributes(attributes);
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i8 = R.id.cancelBtn;
        TextView textView = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.cancelBtn);
        if (textView != null) {
            i8 = R.id.categoryList;
            RecyclerView recyclerView = (RecyclerView) AbstractC0714c.m1494G(viewInflate, R.id.categoryList);
            if (recyclerView != null) {
                i8 = R.id.channelList;
                RecyclerView recyclerView2 = (RecyclerView) AbstractC0714c.m1494G(viewInflate, R.id.channelList);
                if (recyclerView2 != null) {
                    i8 = R.id.contentRow;
                    LinearLayout linearLayout = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.contentRow);
                    if (linearLayout != null) {
                        i8 = R.id.downloadPercent;
                        TextView textView2 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.downloadPercent);
                        if (textView2 != null) {
                            i8 = R.id.downloadProgressBar;
                            ProgressBar progressBar = (ProgressBar) AbstractC0714c.m1494G(viewInflate, R.id.downloadProgressBar);
                            if (progressBar != null) {
                                i8 = R.id.liveSpinner;
                                ProgressBar progressBar2 = (ProgressBar) AbstractC0714c.m1494G(viewInflate, R.id.liveSpinner);
                                if (progressBar2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i8 = R.id.stateOverlay;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.stateOverlay);
                                    if (linearLayout2 != null) {
                                        i8 = R.id.stateReload;
                                        TextView textView3 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.stateReload);
                                        if (textView3 != null) {
                                            i8 = R.id.stateSpinner;
                                            ProgressBar progressBar3 = (ProgressBar) AbstractC0714c.m1494G(viewInflate, R.id.stateSpinner);
                                            if (progressBar3 != null) {
                                                i8 = R.id.stateText;
                                                TextView textView4 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.stateText);
                                                if (textView4 != null) {
                                                    i8 = R.id.updateBtn;
                                                    TextView textView5 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.updateBtn);
                                                    if (textView5 != null) {
                                                        i8 = R.id.updateError;
                                                        TextView textView6 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.updateError);
                                                        if (textView6 != null) {
                                                            i8 = R.id.updateHint;
                                                            TextView textView7 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.updateHint);
                                                            if (textView7 != null) {
                                                                i8 = R.id.updateProgress;
                                                                LinearLayout linearLayout3 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.updateProgress);
                                                                if (linearLayout3 != null) {
                                                                    i8 = R.id.updateTitle;
                                                                    TextView textView8 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.updateTitle);
                                                                    if (textView8 != null) {
                                                                        this.f2892P = new C0106a(textView, recyclerView, recyclerView2, linearLayout, textView2, progressBar, progressBar2, constraintLayout, linearLayout2, textView3, progressBar3, textView4, textView5, textView6, textView7, linearLayout3, textView8);
                                                                        AbstractC0120b.m396G(getWindow(), false);
                                                                        int i9 = 4;
                                                                        final int i10 = 1;
                                                                        if (m1682J()) {
                                                                            setRequestedOrientation(0);
                                                                        } else {
                                                                            setRequestedOrientation(getResources().getBoolean(R.bool.is_large_screen) ? 4 : 1);
                                                                        }
                                                                        if (Build.VERSION.SDK_INT >= 28) {
                                                                            Window window2 = getWindow();
                                                                            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
                                                                            attributes2.layoutInDisplayCutoutMode = 1;
                                                                            window2.setAttributes(attributes2);
                                                                        }
                                                                        this.f2893Q = new C1629o(this);
                                                                        this.f2895S = new C0682o(new C2658e(this, i), new C2663g(this, i), new C2663g(this, i));
                                                                        this.f2896T = new C0692t(new C2658e(this, i9), new C2663g(this, i9));
                                                                        C0106a c0106a = this.f2892P;
                                                                        if (c0106a == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a.f501b.setLayoutManager(new LinearLayoutManager(1));
                                                                        C0106a c0106a2 = this.f2892P;
                                                                        if (c0106a2 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        RecyclerView recyclerView3 = c0106a2.f501b;
                                                                        C0682o c0682o = this.f2895S;
                                                                        if (c0682o == null) {
                                                                            AbstractC2980h.m5139h("categoryAdapter");
                                                                            throw null;
                                                                        }
                                                                        recyclerView3.setAdapter(c0682o);
                                                                        C0106a c0106a3 = this.f2892P;
                                                                        if (c0106a3 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a3.f501b.setBackgroundResource(R.drawable.bg_category_fade);
                                                                        i = m1682J() ? 6 : 3;
                                                                        C0106a c0106a4 = this.f2892P;
                                                                        if (c0106a4 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a4.f502c.setLayoutManager(new GridLayoutManager(i));
                                                                        C0106a c0106a5 = this.f2892P;
                                                                        if (c0106a5 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        RecyclerView recyclerView4 = c0106a5.f502c;
                                                                        C0692t c0692t = this.f2896T;
                                                                        if (c0692t == null) {
                                                                            AbstractC2980h.m5139h("channelAdapter");
                                                                            throw null;
                                                                        }
                                                                        recyclerView4.setAdapter(c0692t);
                                                                        C0106a c0106a6 = this.f2892P;
                                                                        if (c0106a6 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a6.f502c.setHasFixedSize(true);
                                                                        C0106a c0106a7 = this.f2892P;
                                                                        if (c0106a7 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a7.f502c.setItemAnimator(null);
                                                                        Resources resources = getResources();
                                                                        AbstractC2980h.m5135d("getResources(...)", resources);
                                                                        TypedValue typedValue = new TypedValue();
                                                                        resources.getValue(R.dimen.rail_width_weight, typedValue, true);
                                                                        float f8 = typedValue.getFloat();
                                                                        C0106a c0106a8 = this.f2892P;
                                                                        if (c0106a8 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        ViewGroup.LayoutParams layoutParams = c0106a8.f501b.getLayoutParams();
                                                                        AbstractC2980h.m5134c("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams", layoutParams);
                                                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                                                        layoutParams2.width = 0;
                                                                        layoutParams2.weight = f8;
                                                                        C0106a c0106a9 = this.f2892P;
                                                                        if (c0106a9 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        ViewGroup.LayoutParams layoutParams3 = c0106a9.f502c.getLayoutParams();
                                                                        AbstractC2980h.m5134c("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams", layoutParams3);
                                                                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                                                        layoutParams4.width = 0;
                                                                        layoutParams4.weight = 1.0f - f8;
                                                                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.channel_gap_h);
                                                                        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.channel_gap_v);
                                                                        getResources().getDimensionPixelSize(R.dimen.channels_padding_h);
                                                                        m1695t();
                                                                        C0106a c0106a10 = this.f2892P;
                                                                        if (c0106a10 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a10.f502c.m1185i(new C2677n(dimensionPixelSize, dimensionPixelSize2));
                                                                        C0106a c0106a11 = this.f2892P;
                                                                        if (c0106a11 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a11.f509j.setOnClickListener(new View.OnClickListener(this) { // from class: w4.c

                                                                            /* renamed from: k */
                                                                            public final /* synthetic */ MainActivity f9657k;

                                                                            {
                                                                                this.f9657k = this;
                                                                            }

                                                                            /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        MainActivity mainActivity = this.f9657k;
                                                                                        C0586i c0586i = mainActivity.f2901Y;
                                                                                        if (c0586i == null || !c0586i.f2327b) {
                                                                                            mainActivity.f2901Y = null;
                                                                                            mainActivity.m1680G();
                                                                                            mainActivity.m1686P(true);
                                                                                            MainActivity.m1668L(mainActivity, 6);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        MainActivity mainActivity2 = this.f9657k;
                                                                                        mainActivity2.m1690T(false, null, false, mainActivity2.f2887K);
                                                                                        int iOrdinal = mainActivity2.f2887K.ordinal();
                                                                                        if (iOrdinal == 0) {
                                                                                            MainActivity.m1668L(mainActivity2, 1);
                                                                                            return;
                                                                                        }
                                                                                        if (iOrdinal != 3) {
                                                                                            EnumC2770m enumC2770mM1678B = mainActivity2.m1678B();
                                                                                            if (enumC2770mM1678B == null) {
                                                                                                return;
                                                                                            }
                                                                                            C2673l c2673l = (C2673l) AbstractC1924s.m3758S(mainActivity2.f2905c0, enumC2770mM1678B);
                                                                                            c2673l.f9714c = false;
                                                                                            c2673l.f9716e = null;
                                                                                            mainActivity2.m1683K(enumC2770mM1678B);
                                                                                            return;
                                                                                        }
                                                                                        C0648a1 c0648a1 = mainActivity2.f2889M;
                                                                                        if (c0648a1 != null) {
                                                                                            EditText editText = c0648a1.f2557g;
                                                                                            if (editText != null) {
                                                                                                editText.requestFocus();
                                                                                                return;
                                                                                            } else {
                                                                                                AbstractC2980h.m5139h("input");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        MainActivity mainActivity3 = this.f9657k;
                                                                                        C0586i c0586i2 = mainActivity3.f2901Y;
                                                                                        if (c0586i2 != null) {
                                                                                            String str2 = c0586i2.f2329d;
                                                                                            if (str2 == null) {
                                                                                                str2 = c0586i2.f2330e;
                                                                                                str = str2;
                                                                                            } else {
                                                                                                if (AbstractC1206h.m2630D0(str2)) {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                if (str2 == null) {
                                                                                                }
                                                                                                str = str2;
                                                                                            }
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        C0106a c0106a12 = mainActivity3.f2892P;
                                                                                        if (c0106a12 == null) {
                                                                                            AbstractC2980h.m5139h("b");
                                                                                            throw null;
                                                                                        }
                                                                                        c0106a12.f513n.setVisibility(8);
                                                                                        if (str == null) {
                                                                                            String string = mainActivity3.getString(R.string.no_update_link);
                                                                                            AbstractC2980h.m5135d("getString(...)", string);
                                                                                            mainActivity3.m1692V(string);
                                                                                            return;
                                                                                        }
                                                                                        mainActivity3.m1688R(true);
                                                                                        C2649b c2649b = mainActivity3.f2894R;
                                                                                        if (c2649b == null) {
                                                                                            AbstractC2980h.m5139h("installer");
                                                                                            throw null;
                                                                                        }
                                                                                        int i11 = 2;
                                                                                        C2658e c2658e = new C2658e(mainActivity3, i11);
                                                                                        C1215q c1215q = new C1215q(i11, mainActivity3);
                                                                                        if (AbstractC1206h.m2630D0(str)) {
                                                                                            c2658e.invoke(new C1689f(AbstractC0714c.m1539y(new IOException("No APK url provided"))));
                                                                                            return;
                                                                                        } else {
                                                                                            c2649b.f9644b.execute(new RunnableC0321j(c2649b, str, c1215q, c2658e, 1));
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            }
                                                                        });
                                                                        C0106a c0106a12 = this.f2892P;
                                                                        if (c0106a12 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a12.f509j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: w4.d
                                                                            @Override // android.view.View.OnFocusChangeListener
                                                                            public final void onFocusChange(View view, boolean z7) {
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        Set set = MainActivity.f2882p0;
                                                                                        view.animate().scaleX(z7 ? 1.08f : 1.0f).scaleY(z7 ? 1.08f : 1.0f).setDuration(120L).start();
                                                                                        break;
                                                                                    default:
                                                                                        Set set2 = MainActivity.f2882p0;
                                                                                        view.animate().scaleX(z7 ? 1.08f : 1.0f).scaleY(z7 ? 1.08f : 1.0f).setDuration(120L).start();
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        C0106a c0106a13 = this.f2892P;
                                                                        if (c0106a13 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a13.f512m.setOnClickListener(new View.OnClickListener(this) { // from class: w4.c

                                                                            /* renamed from: k */
                                                                            public final /* synthetic */ MainActivity f9657k;

                                                                            {
                                                                                this.f9657k = this;
                                                                            }

                                                                            /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                switch (i) {
                                                                                    case 0:
                                                                                        MainActivity mainActivity = this.f9657k;
                                                                                        C0586i c0586i = mainActivity.f2901Y;
                                                                                        if (c0586i == null || !c0586i.f2327b) {
                                                                                            mainActivity.f2901Y = null;
                                                                                            mainActivity.m1680G();
                                                                                            mainActivity.m1686P(true);
                                                                                            MainActivity.m1668L(mainActivity, 6);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        MainActivity mainActivity2 = this.f9657k;
                                                                                        mainActivity2.m1690T(false, null, false, mainActivity2.f2887K);
                                                                                        int iOrdinal = mainActivity2.f2887K.ordinal();
                                                                                        if (iOrdinal == 0) {
                                                                                            MainActivity.m1668L(mainActivity2, 1);
                                                                                            return;
                                                                                        }
                                                                                        if (iOrdinal != 3) {
                                                                                            EnumC2770m enumC2770mM1678B = mainActivity2.m1678B();
                                                                                            if (enumC2770mM1678B == null) {
                                                                                                return;
                                                                                            }
                                                                                            C2673l c2673l = (C2673l) AbstractC1924s.m3758S(mainActivity2.f2905c0, enumC2770mM1678B);
                                                                                            c2673l.f9714c = false;
                                                                                            c2673l.f9716e = null;
                                                                                            mainActivity2.m1683K(enumC2770mM1678B);
                                                                                            return;
                                                                                        }
                                                                                        C0648a1 c0648a1 = mainActivity2.f2889M;
                                                                                        if (c0648a1 != null) {
                                                                                            EditText editText = c0648a1.f2557g;
                                                                                            if (editText != null) {
                                                                                                editText.requestFocus();
                                                                                                return;
                                                                                            } else {
                                                                                                AbstractC2980h.m5139h("input");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        MainActivity mainActivity3 = this.f9657k;
                                                                                        C0586i c0586i2 = mainActivity3.f2901Y;
                                                                                        if (c0586i2 != null) {
                                                                                            String str2 = c0586i2.f2329d;
                                                                                            if (str2 == null) {
                                                                                                str2 = c0586i2.f2330e;
                                                                                                str = str2;
                                                                                            } else {
                                                                                                if (AbstractC1206h.m2630D0(str2)) {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                if (str2 == null) {
                                                                                                }
                                                                                                str = str2;
                                                                                            }
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        C0106a c0106a122 = mainActivity3.f2892P;
                                                                                        if (c0106a122 == null) {
                                                                                            AbstractC2980h.m5139h("b");
                                                                                            throw null;
                                                                                        }
                                                                                        c0106a122.f513n.setVisibility(8);
                                                                                        if (str == null) {
                                                                                            String string = mainActivity3.getString(R.string.no_update_link);
                                                                                            AbstractC2980h.m5135d("getString(...)", string);
                                                                                            mainActivity3.m1692V(string);
                                                                                            return;
                                                                                        }
                                                                                        mainActivity3.m1688R(true);
                                                                                        C2649b c2649b = mainActivity3.f2894R;
                                                                                        if (c2649b == null) {
                                                                                            AbstractC2980h.m5139h("installer");
                                                                                            throw null;
                                                                                        }
                                                                                        int i11 = 2;
                                                                                        C2658e c2658e = new C2658e(mainActivity3, i11);
                                                                                        C1215q c1215q = new C1215q(i11, mainActivity3);
                                                                                        if (AbstractC1206h.m2630D0(str)) {
                                                                                            c2658e.invoke(new C1689f(AbstractC0714c.m1539y(new IOException("No APK url provided"))));
                                                                                            return;
                                                                                        } else {
                                                                                            c2649b.f9644b.execute(new RunnableC0321j(c2649b, str, c1215q, c2658e, 1));
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            }
                                                                        });
                                                                        C0106a c0106a14 = this.f2892P;
                                                                        if (c0106a14 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a14.f500a.setOnClickListener(new View.OnClickListener(this) { // from class: w4.c

                                                                            /* renamed from: k */
                                                                            public final /* synthetic */ MainActivity f9657k;

                                                                            {
                                                                                this.f9657k = this;
                                                                            }

                                                                            /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                String str;
                                                                                switch (i4) {
                                                                                    case 0:
                                                                                        MainActivity mainActivity = this.f9657k;
                                                                                        C0586i c0586i = mainActivity.f2901Y;
                                                                                        if (c0586i == null || !c0586i.f2327b) {
                                                                                            mainActivity.f2901Y = null;
                                                                                            mainActivity.m1680G();
                                                                                            mainActivity.m1686P(true);
                                                                                            MainActivity.m1668L(mainActivity, 6);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 1:
                                                                                        MainActivity mainActivity2 = this.f9657k;
                                                                                        mainActivity2.m1690T(false, null, false, mainActivity2.f2887K);
                                                                                        int iOrdinal = mainActivity2.f2887K.ordinal();
                                                                                        if (iOrdinal == 0) {
                                                                                            MainActivity.m1668L(mainActivity2, 1);
                                                                                            return;
                                                                                        }
                                                                                        if (iOrdinal != 3) {
                                                                                            EnumC2770m enumC2770mM1678B = mainActivity2.m1678B();
                                                                                            if (enumC2770mM1678B == null) {
                                                                                                return;
                                                                                            }
                                                                                            C2673l c2673l = (C2673l) AbstractC1924s.m3758S(mainActivity2.f2905c0, enumC2770mM1678B);
                                                                                            c2673l.f9714c = false;
                                                                                            c2673l.f9716e = null;
                                                                                            mainActivity2.m1683K(enumC2770mM1678B);
                                                                                            return;
                                                                                        }
                                                                                        C0648a1 c0648a1 = mainActivity2.f2889M;
                                                                                        if (c0648a1 != null) {
                                                                                            EditText editText = c0648a1.f2557g;
                                                                                            if (editText != null) {
                                                                                                editText.requestFocus();
                                                                                                return;
                                                                                            } else {
                                                                                                AbstractC2980h.m5139h("input");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        MainActivity mainActivity3 = this.f9657k;
                                                                                        C0586i c0586i2 = mainActivity3.f2901Y;
                                                                                        if (c0586i2 != null) {
                                                                                            String str2 = c0586i2.f2329d;
                                                                                            if (str2 == null) {
                                                                                                str2 = c0586i2.f2330e;
                                                                                                str = str2;
                                                                                            } else {
                                                                                                if (AbstractC1206h.m2630D0(str2)) {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                if (str2 == null) {
                                                                                                }
                                                                                                str = str2;
                                                                                            }
                                                                                        } else {
                                                                                            str = null;
                                                                                        }
                                                                                        C0106a c0106a122 = mainActivity3.f2892P;
                                                                                        if (c0106a122 == null) {
                                                                                            AbstractC2980h.m5139h("b");
                                                                                            throw null;
                                                                                        }
                                                                                        c0106a122.f513n.setVisibility(8);
                                                                                        if (str == null) {
                                                                                            String string = mainActivity3.getString(R.string.no_update_link);
                                                                                            AbstractC2980h.m5135d("getString(...)", string);
                                                                                            mainActivity3.m1692V(string);
                                                                                            return;
                                                                                        }
                                                                                        mainActivity3.m1688R(true);
                                                                                        C2649b c2649b = mainActivity3.f2894R;
                                                                                        if (c2649b == null) {
                                                                                            AbstractC2980h.m5139h("installer");
                                                                                            throw null;
                                                                                        }
                                                                                        int i11 = 2;
                                                                                        C2658e c2658e = new C2658e(mainActivity3, i11);
                                                                                        C1215q c1215q = new C1215q(i11, mainActivity3);
                                                                                        if (AbstractC1206h.m2630D0(str)) {
                                                                                            c2658e.invoke(new C1689f(AbstractC0714c.m1539y(new IOException("No APK url provided"))));
                                                                                            return;
                                                                                        } else {
                                                                                            c2649b.f9644b.execute(new RunnableC0321j(c2649b, str, c1215q, c2658e, 1));
                                                                                            return;
                                                                                        }
                                                                                }
                                                                            }
                                                                        });
                                                                        C0106a c0106a15 = this.f2892P;
                                                                        if (c0106a15 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        TextView[] textViewArr = {c0106a15.f512m, c0106a15.f500a};
                                                                        for (int i11 = 0; i11 < 2; i11++) {
                                                                            TextView textView9 = textViewArr[i11];
                                                                            AbstractC2980h.m5133b(textView9);
                                                                            textView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: w4.d
                                                                                @Override // android.view.View.OnFocusChangeListener
                                                                                public final void onFocusChange(View view, boolean z7) {
                                                                                    switch (i4) {
                                                                                        case 0:
                                                                                            Set set = MainActivity.f2882p0;
                                                                                            view.animate().scaleX(z7 ? 1.08f : 1.0f).scaleY(z7 ? 1.08f : 1.0f).setDuration(120L).start();
                                                                                            break;
                                                                                        default:
                                                                                            Set set2 = MainActivity.f2882p0;
                                                                                            view.animate().scaleX(z7 ? 1.08f : 1.0f).scaleY(z7 ? 1.08f : 1.0f).setDuration(120L).start();
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                        this.f2894R = new C2649b(this);
                                                                        LinearLayout linearLayout4 = new LinearLayout(this);
                                                                        linearLayout4.setOrientation(!m1681I() ? 1 : 0);
                                                                        this.f2884H = linearLayout4;
                                                                        this.f2885I = new FrameLayout(this);
                                                                        this.f2886J = new C0702y(this, new C2658e(this, i10), new C2663g(this, i4));
                                                                        boolean zM1681I = m1681I();
                                                                        int i12 = this.f2913k0;
                                                                        LinearLayout.LayoutParams layoutParams5 = zM1681I ? new LinearLayout.LayoutParams(0, i12, 1.0f) : new LinearLayout.LayoutParams(i12, 0, 1.0f);
                                                                        boolean zM1681I2 = m1681I();
                                                                        int i13 = this.f2914l0;
                                                                        LinearLayout.LayoutParams layoutParams6 = zM1681I2 ? new LinearLayout.LayoutParams(i13, i12) : new LinearLayout.LayoutParams(i12, i13);
                                                                        if (m1681I()) {
                                                                            LinearLayout linearLayout5 = this.f2884H;
                                                                            if (linearLayout5 == null) {
                                                                                AbstractC2980h.m5139h("shell");
                                                                                throw null;
                                                                            }
                                                                            C0702y c0702y = this.f2886J;
                                                                            if (c0702y == null) {
                                                                                AbstractC2980h.m5139h("nav");
                                                                                throw null;
                                                                            }
                                                                            linearLayout5.addView(c0702y.f2749n, layoutParams6);
                                                                            LinearLayout linearLayout6 = this.f2884H;
                                                                            if (linearLayout6 == null) {
                                                                                AbstractC2980h.m5139h("shell");
                                                                                throw null;
                                                                            }
                                                                            FrameLayout frameLayout = this.f2885I;
                                                                            if (frameLayout == null) {
                                                                                AbstractC2980h.m5139h("tabHost");
                                                                                throw null;
                                                                            }
                                                                            linearLayout6.addView(frameLayout, layoutParams5);
                                                                        } else {
                                                                            LinearLayout linearLayout7 = this.f2884H;
                                                                            if (linearLayout7 == null) {
                                                                                AbstractC2980h.m5139h("shell");
                                                                                throw null;
                                                                            }
                                                                            FrameLayout frameLayout2 = this.f2885I;
                                                                            if (frameLayout2 == null) {
                                                                                AbstractC2980h.m5139h("tabHost");
                                                                                throw null;
                                                                            }
                                                                            linearLayout7.addView(frameLayout2, layoutParams5);
                                                                            LinearLayout linearLayout8 = this.f2884H;
                                                                            if (linearLayout8 == null) {
                                                                                AbstractC2980h.m5139h("shell");
                                                                                throw null;
                                                                            }
                                                                            C0702y c0702y2 = this.f2886J;
                                                                            if (c0702y2 == null) {
                                                                                AbstractC2980h.m5139h("nav");
                                                                                throw null;
                                                                            }
                                                                            linearLayout8.addView(c0702y2.f2749n, layoutParams6);
                                                                            if (!m1682J()) {
                                                                                C0016e c0016e = new C0016e(this);
                                                                                LinearLayout linearLayout9 = (LinearLayout) c0016e.f63l;
                                                                                this.f2890N = c0016e;
                                                                                linearLayout9.setVisibility(8);
                                                                                LinearLayout linearLayout10 = this.f2884H;
                                                                                if (linearLayout10 == null) {
                                                                                    AbstractC2980h.m5139h("shell");
                                                                                    throw null;
                                                                                }
                                                                                linearLayout10.addView(linearLayout9, 1, new LinearLayout.LayoutParams(i12, i13));
                                                                            }
                                                                        }
                                                                        C0106a c0106a16 = this.f2892P;
                                                                        if (c0106a16 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        c0106a16.f507h.setBackgroundResource(R.drawable.bg_live_glow);
                                                                        FrameLayout frameLayout3 = this.f2885I;
                                                                        if (frameLayout3 == null) {
                                                                            AbstractC2980h.m5139h("tabHost");
                                                                            throw null;
                                                                        }
                                                                        C0106a c0106a17 = this.f2892P;
                                                                        if (c0106a17 == null) {
                                                                            AbstractC2980h.m5139h("b");
                                                                            throw null;
                                                                        }
                                                                        frameLayout3.addView(c0106a17.f507h, new FrameLayout.LayoutParams(i12, i12));
                                                                        FrameLayout frameLayout4 = this.f2885I;
                                                                        if (frameLayout4 == null) {
                                                                            AbstractC2980h.m5139h("tabHost");
                                                                            throw null;
                                                                        }
                                                                        LinearLayout linearLayout11 = new LinearLayout(this);
                                                                        linearLayout11.setOrientation(1);
                                                                        linearLayout11.setBackgroundResource(R.drawable.bg_catalog_glow);
                                                                        this.f2906d0 = linearLayout11;
                                                                        TextView textView10 = new TextView(this);
                                                                        textView10.setTextColor(AbstractC0704z.f2753c);
                                                                        textView10.setTextSize(12.0f);
                                                                        textView10.setPadding(m1698w(16), 0, m1698w(16), m1698w(8));
                                                                        textView10.setVisibility(8);
                                                                        this.f2907e0 = textView10;
                                                                        this.f2909g0 = m1681I() ? ((int) TypedValue.applyDimension(1, 4, getResources().getDisplayMetrics())) / 2 : 0;
                                                                        this.f2910h0 = m1698w(20);
                                                                        LinearLayout linearLayout12 = this.f2906d0;
                                                                        String str = "catalogPage";
                                                                        if (linearLayout12 == null) {
                                                                            AbstractC2980h.m5139h("catalogPage");
                                                                            throw null;
                                                                        }
                                                                        TextView textView11 = this.f2907e0;
                                                                        if (textView11 == null) {
                                                                            AbstractC2980h.m5139h("status");
                                                                            throw null;
                                                                        }
                                                                        linearLayout12.addView(textView11, new LinearLayout.LayoutParams(i12, i13));
                                                                        EnumC2770m[] enumC2770mArrValues = EnumC2770m.values();
                                                                        int length = enumC2770mArrValues.length;
                                                                        int i14 = 0;
                                                                        while (true) {
                                                                            HashMap map = this.f2905c0;
                                                                            if (i14 >= length) {
                                                                                String str2 = str;
                                                                                this.f2908f0 = ((C2673l) AbstractC1924s.m3758S(map, EnumC2770m.f10247j)).f9713b;
                                                                                LinearLayout linearLayout13 = this.f2906d0;
                                                                                if (linearLayout13 == null) {
                                                                                    AbstractC2980h.m5139h(str2);
                                                                                    throw null;
                                                                                }
                                                                                frameLayout4.addView(linearLayout13, new FrameLayout.LayoutParams(i12, i12));
                                                                                C0648a1 c0648a1 = new C0648a1(this, AbstractC0147m0.m566e(this), new C2663g(this, 1));
                                                                                this.f2889M = c0648a1;
                                                                                FrameLayout frameLayout5 = this.f2885I;
                                                                                if (frameLayout5 == null) {
                                                                                    AbstractC2980h.m5139h("tabHost");
                                                                                    throw null;
                                                                                }
                                                                                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(i12, i12);
                                                                                LinearLayout linearLayout14 = c0648a1.f2564n;
                                                                                frameLayout5.addView(linearLayout14, layoutParams7);
                                                                                C0106a c0106a18 = this.f2892P;
                                                                                if (c0106a18 == null) {
                                                                                    AbstractC2980h.m5139h("b");
                                                                                    throw null;
                                                                                }
                                                                                ViewParent parent = c0106a18.f508i.getParent();
                                                                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                                                                if (viewGroup != null) {
                                                                                    C0106a c0106a19 = this.f2892P;
                                                                                    if (c0106a19 == null) {
                                                                                        AbstractC2980h.m5139h("b");
                                                                                        throw null;
                                                                                    }
                                                                                    viewGroup.removeView(c0106a19.f508i);
                                                                                }
                                                                                FrameLayout frameLayout6 = this.f2885I;
                                                                                if (frameLayout6 == null) {
                                                                                    AbstractC2980h.m5139h("tabHost");
                                                                                    throw null;
                                                                                }
                                                                                C0106a c0106a20 = this.f2892P;
                                                                                if (c0106a20 == null) {
                                                                                    AbstractC2980h.m5139h("b");
                                                                                    throw null;
                                                                                }
                                                                                frameLayout6.addView(c0106a20.f508i, new FrameLayout.LayoutParams(i12, i12));
                                                                                LinearLayout linearLayout15 = this.f2906d0;
                                                                                if (linearLayout15 == null) {
                                                                                    AbstractC2980h.m5139h(str2);
                                                                                    throw null;
                                                                                }
                                                                                linearLayout15.setVisibility(8);
                                                                                linearLayout14.setVisibility(8);
                                                                                C0702y c0702y3 = this.f2886J;
                                                                                if (c0702y3 == null) {
                                                                                    AbstractC2980h.m5139h("nav");
                                                                                    throw null;
                                                                                }
                                                                                c0702y3.m1474e(m1671Y(this.f2887K));
                                                                                LinearLayout linearLayout16 = this.f2884H;
                                                                                if (linearLayout16 == null) {
                                                                                    AbstractC2980h.m5139h("shell");
                                                                                    throw null;
                                                                                }
                                                                                setContentView(linearLayout16);
                                                                                C0702y c0702y4 = this.f2886J;
                                                                                if (c0702y4 == null) {
                                                                                    AbstractC2980h.m5139h("nav");
                                                                                    throw null;
                                                                                }
                                                                                int paddingBottom = c0702y4.f2749n.getPaddingBottom();
                                                                                LinearLayout linearLayout17 = this.f2884H;
                                                                                if (linearLayout17 == null) {
                                                                                    AbstractC2980h.m5139h("shell");
                                                                                    throw null;
                                                                                }
                                                                                C2667i c2667i = new C2667i(paddingBottom, this);
                                                                                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                                                                                AbstractC1804e0.m3538j(linearLayout17, c2667i);
                                                                                LinearLayout linearLayout18 = this.f2884H;
                                                                                if (linearLayout18 == null) {
                                                                                    AbstractC2980h.m5139h("shell");
                                                                                    throw null;
                                                                                }
                                                                                AbstractC1798c0.m3516c(linearLayout18);
                                                                                m1247i().m1255a(this, new C0019f0(this, 1));
                                                                                m1668L(this, 7);
                                                                                m1696u();
                                                                                return;
                                                                            }
                                                                            EnumC2770m enumC2770m = enumC2770mArrValues[i14];
                                                                            LinearLayout linearLayout19 = new LinearLayout(this);
                                                                            linearLayout19.setOrientation(i10);
                                                                            int i15 = this.f2909g0;
                                                                            EnumC2770m[] enumC2770mArr = enumC2770mArrValues;
                                                                            linearLayout19.setPadding(i15, 0, i15, this.f2910h0);
                                                                            ScrollView scrollView = new ScrollView(this);
                                                                            scrollView.setVerticalScrollBarEnabled(false);
                                                                            scrollView.setClipToPadding(false);
                                                                            scrollView.setClipChildren(false);
                                                                            scrollView.addView(linearLayout19, new FrameLayout.LayoutParams(i12, i13));
                                                                            scrollView.setVisibility(8);
                                                                            LinearLayout linearLayout20 = this.f2906d0;
                                                                            String str3 = str;
                                                                            if (linearLayout20 == null) {
                                                                                AbstractC2980h.m5139h(str3);
                                                                                throw null;
                                                                            }
                                                                            linearLayout20.addView(scrollView, new LinearLayout.LayoutParams(i12, 0, 1.0f));
                                                                            map.put(enumC2770m, new C2673l(scrollView, linearLayout19));
                                                                            i14++;
                                                                            enumC2770mArrValues = enumC2770mArr;
                                                                            str = str3;
                                                                            length = length;
                                                                            i10 = 1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i8)));
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onDestroy() {
        C0648a1 c0648a1 = this.f2889M;
        if (c0648a1 != null) {
            C1278a0 c1278a0 = c0648a1.f2554d;
            if (c1278a0 != null) {
                AbstractC1339x.m2841b(c1278a0);
            }
            AbstractC1339x.m2842c(c0648a1.f2555e);
        }
        super.onDestroy();
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC2980h.m5136e("intent", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        m1696u();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onResume() {
        super.onResume();
        m1679F();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            m1679F();
        }
        if (!z7 || this.f2917o0) {
            return;
        }
        this.f2917o0 = true;
        if (m1681I()) {
            C0702y c0702y = this.f2886J;
            if (c0702y != null) {
                c0702y.m1470a();
            } else {
                AbstractC2980h.m5139h("nav");
                throw null;
            }
        }
    }

    /* renamed from: t */
    public final void m1695t() throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.channels_padding_h) - (getResources().getDimensionPixelSize(R.dimen.channel_gap_h) / 2);
        if (dimensionPixelSize < 0) {
            dimensionPixelSize = 0;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.rail_padding_v);
        C0106a c0106a = this.f2892P;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        RecyclerView recyclerView = c0106a.f501b;
        if (c0106a == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = this.f2912j0 + dimensionPixelSize2;
        C0106a c0106a2 = this.f2892P;
        if (c0106a2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        recyclerView.setPadding(paddingLeft, i, c0106a2.f501b.getPaddingRight(), dimensionPixelSize2);
        C0106a c0106a3 = this.f2892P;
        if (c0106a3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0106a3.f502c.setPadding(dimensionPixelSize, dimensionPixelSize2 + this.f2912j0, dimensionPixelSize, 0);
        C0106a c0106a4 = this.f2892P;
        if (c0106a4 != null) {
            c0106a4.f503d.setPadding(0, 0, getResources().getDimensionPixelSize(R.dimen.content_padding_h), 0);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1696u() {
        EnumC2683q enumC2683q;
        String stringExtra = getIntent().getStringExtra("nav_tab");
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -2014930109:
                    if (!stringExtra.equals("MOVIES")) {
                        enumC2683q = null;
                        break;
                    } else {
                        enumC2683q = EnumC2683q.f9747k;
                        break;
                    }
                case -1853007448:
                    if (stringExtra.equals("SEARCH")) {
                        enumC2683q = EnumC2683q.f9749m;
                        break;
                    }
                    break;
                case -1852509577:
                    if (stringExtra.equals("SERIES")) {
                        enumC2683q = EnumC2683q.f9748l;
                        break;
                    }
                    break;
                case 2337004:
                    if (stringExtra.equals("LIVE")) {
                        enumC2683q = EnumC2683q.f9746j;
                        break;
                    }
                    break;
            }
        }
        if (enumC2683q == null) {
            C0702y c0702y = this.f2886J;
            if (c0702y != null) {
                c0702y.m1474e(m1671Y(this.f2887K));
                return;
            } else {
                AbstractC2980h.m5139h("nav");
                throw null;
            }
        }
        getIntent().removeExtra("nav_tab");
        if (enumC2683q != this.f2887K) {
            this.f2887K = enumC2683q;
            if (enumC2683q != EnumC2683q.f9749m) {
                this.f2888L = enumC2683q;
            }
            m1691U();
            return;
        }
        C0702y c0702y2 = this.f2886J;
        if (c0702y2 != null) {
            c0702y2.m1474e(m1671Y(enumC2683q));
        } else {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
    }

    /* renamed from: v */
    public final View m1697v(View view, View view2, int i) {
        RecyclerView recyclerViewM1665D = m1665D(view);
        if (recyclerViewM1665D != null) {
            View viewM1664C = m1664C(recyclerViewM1665D);
            if (viewM1664C != null) {
                recyclerViewM1665D.post(new RunnableC2661f(i, recyclerViewM1665D, this));
            }
            return viewM1664C;
        }
        HorizontalScrollView horizontalScrollViewM1674x = m1674x(view);
        if (horizontalScrollViewM1674x != null) {
            if (m1667H(view2, horizontalScrollViewM1674x)) {
                return null;
            }
            return m1669N(horizontalScrollViewM1674x);
        }
        if (view.isFocusable()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            AbstractC2980h.m5133b(childAt);
            View viewM1697v = m1697v(childAt, view2, i);
            if (viewM1697v != null) {
                return viewM1697v;
            }
        }
        return null;
    }

    /* renamed from: w */
    public final int m1698w(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }
}
