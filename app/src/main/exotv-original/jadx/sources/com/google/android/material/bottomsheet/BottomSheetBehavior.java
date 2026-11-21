package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p005a4.C0087j;
import p005a4.C0088j0;
import p017b6.C0602f0;
import p023c4.C0644h;
import p034d5.AbstractC0847a;
import p074i5.C1270b;
import p074i5.C1271c;
import p074i5.C1272d;
import p074i5.C1273e;
import p074i5.RunnableC1269a;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1807f0;
import p105m0.AbstractC1828m0;
import p105m0.C1791a;
import p105m0.C1794b;
import p105m0.C1844r1;
import p114n0.C1951c;
import p156s.C2332e;
import p162s5.ViewOnAttachStateChangeListenerC2375m;
import p166t0.C2392f;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p211y5.C2821h;
import p211y5.C2823j;
import p211y5.C2828o;
import p213z.AbstractC2863a;
import p213z.C2866d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC2863a {

    /* renamed from: A */
    public boolean f3090A;

    /* renamed from: B */
    public final C1272d f3091B;

    /* renamed from: C */
    public final ValueAnimator f3092C;

    /* renamed from: D */
    public final int f3093D;

    /* renamed from: E */
    public int f3094E;

    /* renamed from: F */
    public int f3095F;

    /* renamed from: G */
    public final float f3096G;

    /* renamed from: H */
    public int f3097H;

    /* renamed from: I */
    public final float f3098I;

    /* renamed from: J */
    public boolean f3099J;

    /* renamed from: K */
    public boolean f3100K;

    /* renamed from: L */
    public final boolean f3101L;

    /* renamed from: M */
    public final boolean f3102M;

    /* renamed from: N */
    public boolean f3103N;

    /* renamed from: O */
    public final boolean f3104O;

    /* renamed from: P */
    public int f3105P;

    /* renamed from: Q */
    public C2392f f3106Q;

    /* renamed from: R */
    public boolean f3107R;

    /* renamed from: S */
    public int f3108S;

    /* renamed from: T */
    public boolean f3109T;

    /* renamed from: U */
    public final float f3110U;

    /* renamed from: V */
    public int f3111V;

    /* renamed from: W */
    public int f3112W;

    /* renamed from: X */
    public int f3113X;

    /* renamed from: Y */
    public WeakReference f3114Y;

    /* renamed from: Z */
    public final ArrayList f3115Z;

    /* renamed from: a */
    public final int f3116a;

    /* renamed from: a0 */
    public final ArrayList f3117a0;

    /* renamed from: b */
    public boolean f3118b;

    /* renamed from: b0 */
    public VelocityTracker f3119b0;

    /* renamed from: c */
    public final float f3120c;

    /* renamed from: c0 */
    public int f3121c0;

    /* renamed from: d */
    public final int f3122d;

    /* renamed from: d0 */
    public int f3123d0;

    /* renamed from: e */
    public final boolean f3124e;

    /* renamed from: e0 */
    public WeakReference f3125e0;

    /* renamed from: f */
    public int f3126f;

    /* renamed from: f0 */
    public boolean f3127f0;

    /* renamed from: g */
    public boolean f3128g;

    /* renamed from: g0 */
    public HashMap f3129g0;

    /* renamed from: h */
    public int f3130h;

    /* renamed from: h0 */
    public final SparseIntArray f3131h0;

    /* renamed from: i */
    public final int f3132i;

    /* renamed from: i0 */
    public final SparseIntArray f3133i0;

    /* renamed from: j */
    public final C2823j f3134j;

    /* renamed from: j0 */
    public final SparseIntArray f3135j0;

    /* renamed from: k */
    public final ColorStateList f3136k;

    /* renamed from: k0 */
    public final Rect f3137k0;

    /* renamed from: l */
    public final int f3138l;

    /* renamed from: l0 */
    public final C1270b f3139l0;

    /* renamed from: m */
    public final int f3140m;

    /* renamed from: n */
    public int f3141n;

    /* renamed from: o */
    public final boolean f3142o;

    /* renamed from: p */
    public final boolean f3143p;

    /* renamed from: q */
    public final boolean f3144q;

    /* renamed from: r */
    public final boolean f3145r;

    /* renamed from: s */
    public final boolean f3146s;

    /* renamed from: t */
    public final boolean f3147t;

    /* renamed from: u */
    public final boolean f3148u;

    /* renamed from: v */
    public final boolean f3149v;

    /* renamed from: w */
    public int f3150w;

    /* renamed from: x */
    public int f3151x;

    /* renamed from: y */
    public final boolean f3152y;

    /* renamed from: z */
    public final C2828o f3153z;

    public BottomSheetBehavior() {
        this.f3116a = 0;
        this.f3118b = true;
        this.f3138l = -1;
        this.f3140m = -1;
        this.f3091B = new C1272d(this);
        this.f3096G = 0.5f;
        this.f3098I = -1.0f;
        this.f3101L = true;
        this.f3102M = true;
        this.f3104O = true;
        this.f3105P = 4;
        this.f3110U = 0.1f;
        this.f3115Z = new ArrayList();
        this.f3117a0 = new ArrayList();
        this.f3123d0 = -1;
        this.f3131h0 = new SparseIntArray();
        this.f3133i0 = new SparseIntArray();
        this.f3135j0 = new SparseIntArray();
        this.f3137k0 = new Rect();
        this.f3139l0 = new C1270b(this, 0);
    }

    /* renamed from: w */
    public static View m1776w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM1776w = m1776w(viewGroup.getChildAt(i));
            if (viewM1776w != null) {
                return viewM1776w;
            }
        }
        return null;
    }

    /* renamed from: x */
    public static int m1777x(int i, int i4, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    /* renamed from: A */
    public final boolean m1778A() {
        WeakReference weakReference = this.f3114Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f3114Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m1779B(View view) {
        ArrayList arrayList = this.f3115Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m1780C(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f3115Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1780C(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: D */
    public final void m1781D(int i) {
        if (i == -1) {
            if (this.f3128g) {
                return;
            } else {
                this.f3128g = true;
            }
        } else {
            if (!this.f3128g && this.f3126f == i) {
                return;
            }
            this.f3128g = false;
            this.f3126f = Math.max(0, i);
        }
        m1789L();
    }

    /* renamed from: E */
    public final void m1782E(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0008a1.m18n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f3099J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i4 = (i == 6 && this.f3118b && m1799z(i) <= this.f3094E) ? 3 : i;
        WeakReference weakReference = this.f3114Y;
        if (weakReference == null || weakReference.get() == null) {
            m1783F(i);
            return;
        }
        View view = (View) this.f3114Y.get();
        RunnableC1269a runnableC1269a = new RunnableC1269a(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC1269a);
        } else {
            runnableC1269a.run();
        }
    }

    /* renamed from: F */
    public final void m1783F(int i) {
        if (this.f3105P == i) {
            return;
        }
        this.f3105P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z7 = this.f3099J;
        }
        WeakReference weakReference = this.f3114Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m1788K(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m1788K(false);
        }
        m1787J(i, true);
        ArrayList arrayList = this.f3117a0;
        if (arrayList.size() > 0) {
            throw AbstractC0008a1.m10f(0, arrayList);
        }
        m1786I();
    }

    /* renamed from: G */
    public final boolean m1784G(View view, float f8) {
        if (this.f3100K) {
            return true;
        }
        if (view.getTop() < this.f3097H) {
            return false;
        }
        return Math.abs(((f8 * this.f3110U) + ((float) view.getTop())) - ((float) this.f3097H)) / ((float) m1796u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m1783F(2);
        m1787J(r4, true);
        r2.f3091B.m2738a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m4236n(r3.getLeft(), r0) != false) goto L16;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1785H(View view, int i, boolean z7) {
        int iM1799z = m1799z(i);
        C2392f c2392f = this.f3106Q;
        if (c2392f != null) {
            if (!z7) {
                int left = view.getLeft();
                c2392f.f8414r = view;
                c2392f.f8399c = -1;
                boolean zM4230h = c2392f.m4230h(left, iM1799z, 0, 0);
                if (!zM4230h && c2392f.f8397a == 0 && c2392f.f8414r != null) {
                    c2392f.f8414r = null;
                }
            }
        }
        m1783F(i);
    }

    /* renamed from: I */
    public final void m1786I() {
        View view;
        WeakReference weakReference = this.f3114Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1828m0.m3605j(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        AbstractC1828m0.m3603h(view, 0);
        AbstractC1828m0.m3605j(view, 524288);
        AbstractC1828m0.m3603h(view, 0);
        AbstractC1828m0.m3605j(view, 262144);
        AbstractC1828m0.m3603h(view, 0);
        SparseIntArray sparseIntArray = this.f3133i0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC1828m0.m3605j(view, i);
            AbstractC1828m0.m3603h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f3131h0;
        int i4 = sparseIntArray2.get(0, -1);
        if (i4 != -1) {
            AbstractC1828m0.m3605j(view, i4);
            AbstractC1828m0.m3603h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f3135j0;
        int i8 = sparseIntArray3.get(0, -1);
        if (i8 != -1) {
            AbstractC1828m0.m3605j(view, i8);
            AbstractC1828m0.m3603h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f3118b && this.f3105P != 6) {
            sparseIntArray2.put(0, m1793r(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f3099J) {
            int i9 = 5;
            if (this.f3105P != 5) {
                AbstractC1828m0.m3606k(view, C1951c.f7250i, new C0087j(i9, this));
            }
        }
        int i10 = this.f3105P;
        if (i10 == 3) {
            if (this.f3100K && this.f3099J) {
                return;
            }
            sparseIntArray3.put(0, m1793r(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i10 == 4) {
            sparseIntArray.put(0, m1793r(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i10 != 6) {
                return;
            }
            if (!this.f3100K || !this.f3099J) {
                sparseIntArray3.put(0, m1793r(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, m1793r(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    /* renamed from: J */
    public final void m1787J(int i, boolean z7) {
        C2823j c2823j;
        if (i == 2) {
            return;
        }
        boolean z8 = this.f3105P == 3 && (this.f3152y || m1778A());
        if (this.f3090A == z8 || (c2823j = this.f3134j) == null) {
            return;
        }
        this.f3090A = z8;
        ValueAnimator valueAnimator = this.f3092C;
        if (z7 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c2823j.f10492k.f10467i, z8 ? m1795t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM1795t = this.f3090A ? m1795t() : 1.0f;
        C2821h c2821h = c2823j.f10492k;
        if (c2821h.f10467i != fM1795t) {
            c2821h.f10467i = fM1795t;
            c2823j.f10496o = true;
            c2823j.f10497p = true;
            c2823j.invalidateSelf();
        }
    }

    /* renamed from: K */
    public final void m1788K(boolean z7) {
        WeakReference weakReference = this.f3114Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                if (this.f3129g0 != null) {
                    return;
                } else {
                    this.f3129g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f3114Y.get() && z7) {
                    this.f3129g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z7) {
                return;
            }
            this.f3129g0 = null;
        }
    }

    /* renamed from: L */
    public final void m1789L() {
        View view;
        if (this.f3114Y != null) {
            m1794s();
            if (this.f3105P != 4 || (view = (View) this.f3114Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: c */
    public final void mo1790c(C2866d c2866d) {
        this.f3114Y = null;
        this.f3106Q = null;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: e */
    public final void mo1791e() {
        this.f3114Y = null;
        this.f3106Q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    @Override // p213z.AbstractC2863a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1754f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C2392f c2392f;
        if (!view.isShown() || !this.f3101L) {
            this.f3107R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f3121c0 = -1;
            this.f3123d0 = -1;
            this.f3125e0 = null;
            VelocityTracker velocityTracker = this.f3119b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3119b0 = null;
            }
        }
        if (this.f3119b0 == null) {
            this.f3119b0 = VelocityTracker.obtain();
        }
        this.f3119b0.addMovement(motionEvent);
        ArrayList arrayList = this.f3115Z;
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f3123d0 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.m512o(view2, x7, y4)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f3125e0 = weakReference;
            if (this.f3105P != 2 && weakReference.get() != null) {
                this.f3121c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f3127f0 = true;
            }
            this.f3107R = this.f3121c0 == -1 && !coordinatorLayout.m512o(view, x6, this.f3123d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3127f0 = false;
            this.f3125e0 = null;
            this.f3121c0 = -1;
            if (this.f3107R) {
                this.f3107R = false;
                return false;
            }
        }
        if (this.f3107R || (c2392f = this.f3106Q) == null || !c2392f.m4237o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.f3107R && this.f3105P != 1) {
                            if (this.f3124e) {
                                WeakReference weakReference2 = this.f3125e0;
                                if (weakReference2 == null || weakReference2.get() == null) {
                                    if (this.f3106Q == null || (i = this.f3123d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.f3106Q.f8398b) {
                                        break;
                                    }
                                }
                            } else {
                                View view3 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view3 == null || !coordinatorLayout.m512o(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i4 = 2;
        if (this.f3114Y == null) {
            this.f3130h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z7 = (Build.VERSION.SDK_INT < 29 || this.f3142o || this.f3128g) ? false : true;
            if (this.f3143p || this.f3144q || this.f3145r || this.f3147t || this.f3148u || this.f3149v || z7) {
                C0088j0 c0088j0 = new C0088j0(this, z7);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0644h c0644h = new C0644h();
                c0644h.f2541a = paddingStart;
                c0644h.f2542b = paddingEnd;
                c0644h.f2543c = paddingBottom;
                C2332e c2332e = new C2332e(c0088j0, i4, c0644h);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                AbstractC1804e0.m3538j(view, c2332e);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2375m());
                }
            }
            AbstractC1828m0.m3610o(view, new C1273e(view));
            this.f3114Y = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC2436a.m4342q(context, R.attr.motionDurationMedium2, 300);
            AbstractC2436a.m4342q(context, R.attr.motionDurationShort3, 150);
            AbstractC2436a.m4342q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C2823j c2823j = this.f3134j;
            if (c2823j != null) {
                view.setBackground(c2823j);
                float elevation = this.f3098I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c2823j.m4944p(elevation);
            } else {
                ColorStateList colorStateList = this.f3136k;
                if (colorStateList != null) {
                    AbstractC1804e0.m3535g(view, colorStateList);
                }
            }
            m1786I();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f3106Q == null) {
            this.f3106Q = new C2392f(coordinatorLayout.getContext(), coordinatorLayout, this.f3139l0);
        }
        int top = view.getTop();
        coordinatorLayout.m514q(view, i);
        this.f3112W = coordinatorLayout.getWidth();
        this.f3113X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f3111V = height;
        int iMin = this.f3113X;
        int i8 = iMin - height;
        int i9 = this.f3151x;
        if (i8 < i9) {
            boolean z8 = this.f3146s;
            int i10 = this.f3140m;
            if (z8) {
                if (i10 != -1) {
                    iMin = Math.min(iMin, i10);
                }
                this.f3111V = iMin;
            } else {
                int iMin2 = iMin - i9;
                if (i10 != -1) {
                    iMin2 = Math.min(iMin2, i10);
                }
                this.f3111V = iMin2;
            }
        }
        this.f3094E = Math.max(0, this.f3113X - this.f3111V);
        this.f3095F = (int) ((1.0f - this.f3096G) * this.f3113X);
        m1794s();
        int i11 = this.f3105P;
        if (i11 == 3) {
            int iM1798y = m1798y();
            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(iM1798y);
        } else if (i11 == 6) {
            int i12 = this.f3095F;
            WeakHashMap weakHashMap3 = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(i12);
        } else if (this.f3099J && i11 == 5) {
            int i13 = this.f3113X;
            WeakHashMap weakHashMap4 = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(i13);
        } else if (i11 == 4) {
            int i14 = this.f3097H;
            WeakHashMap weakHashMap5 = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(i14);
        } else if (i11 == 1 || i11 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(top2);
        }
        m1787J(this.f3105P, false);
        ArrayList arrayList = this.f3115Z;
        arrayList.clear();
        if (this.f3124e) {
            m1780C(view);
        } else {
            arrayList.add(new WeakReference(m1776w(view)));
        }
        ArrayList arrayList2 = this.f3117a0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        throw AbstractC0008a1.m10f(0, arrayList2);
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: h */
    public final boolean mo1756h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1777x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f3138l, marginLayoutParams.width), m1777x(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3140m, marginLayoutParams.height));
        return true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: i */
    public final boolean mo1792i(View view) {
        ArrayList arrayList = this.f3115Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                if (!m1779B(view) || this.f3105P == 3 || this.f3103N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: j */
    public final void mo1757j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i8) {
        boolean zM1779B;
        if (i8 != 1 && (zM1779B = m1779B(view2))) {
            int top = view.getTop();
            int i9 = top - i4;
            boolean z7 = this.f3101L;
            boolean z8 = this.f3102M;
            if (i4 > 0) {
                if (!this.f3109T && !z8 && zM1779B && view2.canScrollVertically(1)) {
                    this.f3103N = true;
                    return;
                }
                if (i9 < m1798y()) {
                    int iM1798y = top - m1798y();
                    iArr[1] = iM1798y;
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    view.offsetTopAndBottom(-iM1798y);
                    m1783F(3);
                } else {
                    if (!z7) {
                        return;
                    }
                    iArr[1] = i4;
                    WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                    view.offsetTopAndBottom(-i4);
                    m1783F(1);
                }
            } else if (i4 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f3109T && !z8 && zM1779B && zCanScrollVertically) {
                    this.f3103N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i10 = this.f3097H;
                    if (i9 > i10 && !this.f3099J) {
                        int i11 = top - i10;
                        iArr[1] = i11;
                        WeakHashMap weakHashMap3 = AbstractC1828m0.f6911a;
                        view.offsetTopAndBottom(-i11);
                        m1783F(4);
                    } else {
                        if (!z7) {
                            return;
                        }
                        iArr[1] = i4;
                        WeakHashMap weakHashMap4 = AbstractC1828m0.f6911a;
                        view.offsetTopAndBottom(-i4);
                        m1783F(1);
                    }
                }
            }
            m1797v(view.getTop());
            this.f3108S = i4;
            this.f3109T = true;
            this.f3103N = false;
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: k */
    public final void mo1758k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8, int[] iArr) {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: l */
    public final boolean mo1767l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.f3104O || view.isInTouchMode()) {
            return false;
        }
        int i = this.f3105P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.f3137k0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            C1844r1 c1844r1M3543a = AbstractC1807f0.m3543a(view);
            if (c1844r1M3543a != null) {
                rect2.bottom -= c1844r1M3543a.f6934a.mo3563f(519).f3772d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        m1782E(3);
        return true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: m */
    public final void mo1759m(View view, Parcelable parcelable) {
        C1271c c1271c = (C1271c) parcelable;
        int i = this.f3116a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3126f = c1271c.f5285m;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3118b = c1271c.f5286n;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f3099J = c1271c.f5287o;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f3100K = c1271c.f5288p;
            }
        }
        int i4 = c1271c.f5284l;
        if (i4 == 1 || i4 == 2) {
            this.f3105P = 4;
        } else {
            this.f3105P = i4;
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: n */
    public final Parcelable mo1760n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1271c(this);
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: o */
    public final boolean mo1761o(View view, int i, int i4) {
        this.f3108S = 0;
        this.f3109T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // p213z.AbstractC2863a
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1762p(View view, View view2, int i) {
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == m1798y()) {
            m1783F(3);
            return;
        }
        if (m1779B(view2) && this.f3109T) {
            if (this.f3108S > 0) {
                if (!this.f3118b && view.getTop() > this.f3095F) {
                    i4 = 6;
                }
            } else if (this.f3099J) {
                VelocityTracker velocityTracker = this.f3119b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f3120c);
                    yVelocity = this.f3119b0.getYVelocity(this.f3121c0);
                }
                if (m1784G(view, yVelocity)) {
                    i4 = 5;
                }
            } else if (this.f3108S == 0) {
                int top = view.getTop();
                if (!this.f3118b) {
                    int i8 = this.f3095F;
                    if (top < i8) {
                        if (top >= Math.abs(top - this.f3097H)) {
                        }
                    } else if (Math.abs(top - i8) < Math.abs(top - this.f3097H)) {
                    }
                    i4 = 6;
                } else if (Math.abs(top - this.f3094E) >= Math.abs(top - this.f3097H)) {
                    i4 = 4;
                }
            } else {
                if (!this.f3118b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f3095F) < Math.abs(top2 - this.f3097H)) {
                    }
                }
                i4 = 4;
            }
            m1785H(view, i4, false);
            this.f3109T = false;
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: q */
    public final boolean mo1763q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3105P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C2392f c2392f = this.f3106Q;
        if (c2392f != null && (this.f3101L || i == 1)) {
            c2392f.m4231i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3121c0 = -1;
            this.f3123d0 = -1;
            this.f3125e0 = null;
            VelocityTracker velocityTracker = this.f3119b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3119b0 = null;
            }
        }
        if (this.f3119b0 == null) {
            this.f3119b0 = VelocityTracker.obtain();
        }
        this.f3119b0.addMovement(motionEvent);
        if (this.f3106Q != null && ((this.f3101L || this.f3105P == 1) && actionMasked == 2 && !this.f3107R)) {
            float fAbs = Math.abs(this.f3123d0 - motionEvent.getY());
            C2392f c2392f2 = this.f3106Q;
            if (fAbs > c2392f2.f8398b) {
                c2392f2.m4224b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3107R;
    }

    /* renamed from: r */
    public final int m1793r(View view, int i, int i4) throws Resources.NotFoundException {
        int iM3809a;
        String string = view.getResources().getString(i);
        C0087j c0087j = new C0087j(i4, this);
        ArrayList arrayListM3601f = AbstractC1828m0.m3601f(view);
        int i8 = 0;
        while (true) {
            if (i8 >= arrayListM3601f.size()) {
                int i9 = 0;
                int i10 = -1;
                while (true) {
                    int[] iArr = AbstractC1828m0.f6914d;
                    if (i9 >= 32 || i10 != -1) {
                        break;
                    }
                    int i11 = iArr[i9];
                    boolean z7 = true;
                    for (int i12 = 0; i12 < arrayListM3601f.size(); i12++) {
                        z7 &= ((C1951c) arrayListM3601f.get(i12)).m3809a() != i11;
                    }
                    if (z7) {
                        i10 = i11;
                    }
                    i9++;
                }
                iM3809a = i10;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1951c) arrayListM3601f.get(i8)).f7253a).getLabel())) {
                    iM3809a = ((C1951c) arrayListM3601f.get(i8)).m3809a();
                    break;
                }
                i8++;
            }
        }
        if (iM3809a != -1) {
            C1951c c1951c = new C1951c(null, iM3809a, string, c0087j, null);
            View.AccessibilityDelegate accessibilityDelegateM3599d = AbstractC1828m0.m3599d(view);
            C1794b c1794b = accessibilityDelegateM3599d == null ? null : accessibilityDelegateM3599d instanceof C1791a ? ((C1791a) accessibilityDelegateM3599d).f6843a : new C1794b(accessibilityDelegateM3599d);
            if (c1794b == null) {
                c1794b = new C1794b();
            }
            AbstractC1828m0.m3608m(view, c1794b);
            AbstractC1828m0.m3605j(view, c1951c.m3809a());
            AbstractC1828m0.m3601f(view).add(c1951c);
            AbstractC1828m0.m3603h(view, 0);
        }
        return iM3809a;
    }

    /* renamed from: s */
    public final void m1794s() {
        int iM1796u = m1796u();
        if (this.f3118b) {
            this.f3097H = Math.max(this.f3113X - iM1796u, this.f3094E);
        } else {
            this.f3097H = this.f3113X - iM1796u;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1795t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f8;
        float f9 = 0.0f;
        if (this.f3134j != null && (weakReference = this.f3114Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f3114Y.get();
            if (m1778A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C2823j c2823j = this.f3134j;
                float[] fArr = c2823j.f10488K;
                float fMo4909a = fArr != null ? fArr[3] : c2823j.f10492k.f10459a.mo4922d().f10525e.mo4909a(c2823j.m4935g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f8 = (radius <= 0.0f || fMo4909a <= 0.0f) ? 0.0f : radius / fMo4909a;
                }
                C2823j c2823j2 = this.f3134j;
                float[] fArr2 = c2823j2.f10488K;
                float fMo4909a2 = fArr2 != null ? fArr2[0] : c2823j2.f10492k.f10459a.mo4922d().f10526f.mo4909a(c2823j2.m4935g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo4909a2 > 0.0f) {
                        f9 = radius2 / fMo4909a2;
                    }
                }
                return Math.max(f8, f9);
            }
        }
        return 0.0f;
    }

    /* renamed from: u */
    public final int m1796u() {
        int i;
        return this.f3128g ? Math.min(Math.max(this.f3130h, this.f3113X - ((this.f3112W * 9) / 16)), this.f3111V) + this.f3150w : (this.f3142o || this.f3143p || (i = this.f3141n) <= 0) ? this.f3126f + this.f3150w : Math.max(this.f3126f, i + this.f3132i);
    }

    /* renamed from: v */
    public final void m1797v(int i) {
        if (((View) this.f3114Y.get()) != null) {
            ArrayList arrayList = this.f3117a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f3097H;
            if (i <= i4 && i4 != m1798y()) {
                m1798y();
            }
            if (arrayList.size() > 0) {
                throw AbstractC0008a1.m10f(0, arrayList);
            }
        }
    }

    /* renamed from: y */
    public final int m1798y() {
        if (this.f3118b) {
            return this.f3094E;
        }
        return Math.max(this.f3093D, this.f3146s ? 0 : this.f3151x);
    }

    /* renamed from: z */
    public final int m1799z(int i) {
        if (i == 3) {
            return m1798y();
        }
        if (i == 4) {
            return this.f3097H;
        }
        if (i == 5) {
            return this.f3113X;
        }
        if (i == 6) {
            return this.f3095F;
        }
        throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Invalid state to get top offset: "));
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f3116a = 0;
        int i4 = 1;
        this.f3118b = true;
        this.f3138l = -1;
        this.f3140m = -1;
        this.f3091B = new C1272d(this);
        this.f3096G = 0.5f;
        this.f3098I = -1.0f;
        this.f3101L = true;
        this.f3102M = true;
        this.f3104O = true;
        this.f3105P = 4;
        this.f3110U = 0.1f;
        this.f3115Z = new ArrayList();
        this.f3117a0 = new ArrayList();
        this.f3123d0 = -1;
        this.f3131h0 = new SparseIntArray();
        this.f3133i0 = new SparseIntArray();
        this.f3135j0 = new SparseIntArray();
        this.f3137k0 = new Rect();
        this.f3139l0 = new C1270b(this, 0);
        this.f3132i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3739a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3136k = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f3153z = C2828o.m4952f(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m4951a();
        }
        C2828o c2828o = this.f3153z;
        if (c2828o != null) {
            C2823j c2823j = new C2823j(c2828o);
            this.f3134j = c2823j;
            c2823j.m4941m(context);
            ColorStateList colorStateList = this.f3136k;
            if (colorStateList != null) {
                this.f3134j.m4945q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3134j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m1795t(), 1.0f);
        this.f3092C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f3092C.addUpdateListener(new C0602f0(i4, this));
        this.f3098I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f3138l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f3140m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m1781D(i);
        } else {
            m1781D(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f3099J != z7) {
            this.f3099J = z7;
            if (!z7 && this.f3105P == 5) {
                m1782E(4);
            }
            m1786I();
        }
        this.f3142o = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f3118b != z8) {
            this.f3118b = z8;
            if (this.f3114Y != null) {
                m1794s();
            }
            m1783F((this.f3118b && this.f3105P == 6) ? 3 : this.f3105P);
            m1787J(this.f3105P, true);
            m1786I();
        }
        this.f3100K = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f3101L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f3102M = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f3116a = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f8 = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f8 > 0.0f && f8 < 1.0f) {
            this.f3096G = f8;
            if (this.f3114Y != null) {
                this.f3095F = (int) ((1.0f - f8) * this.f3113X);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i8 = typedValuePeekValue2.data;
                if (i8 >= 0) {
                    this.f3093D = i8;
                    m1787J(this.f3105P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f3093D = dimensionPixelOffset;
                    m1787J(this.f3105P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3122d = typedArrayObtainStyledAttributes.getInt(14, 500);
            this.f3124e = typedArrayObtainStyledAttributes.getBoolean(11, false);
            this.f3104O = typedArrayObtainStyledAttributes.getBoolean(4, true);
            this.f3143p = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f3144q = typedArrayObtainStyledAttributes.getBoolean(21, false);
            this.f3145r = typedArrayObtainStyledAttributes.getBoolean(22, false);
            this.f3146s = typedArrayObtainStyledAttributes.getBoolean(23, true);
            this.f3147t = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f3148u = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f3149v = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f3152y = typedArrayObtainStyledAttributes.getBoolean(26, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f3120c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
