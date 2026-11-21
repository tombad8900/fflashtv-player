package p062h;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.C0016e;
import p002a1.C0036o;
import p054g.AbstractC1026a;
import p062h.C1081g0;
import p087k.C1544i;
import p087k.C1545j;
import p104m.C1743l2;
import p104m.InterfaceC1708d;
import p104m.InterfaceC1710d1;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.g0 */
/* loaded from: classes.dex */
public final class C1081g0 extends AbstractC0714c implements InterfaceC1708d {

    /* renamed from: N */
    public static final AccelerateInterpolator f4572N = new AccelerateInterpolator();

    /* renamed from: O */
    public static final DecelerateInterpolator f4573O = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f4574A;

    /* renamed from: B */
    public final ArrayList f4575B;

    /* renamed from: C */
    public int f4576C;

    /* renamed from: D */
    public boolean f4577D;

    /* renamed from: E */
    public boolean f4578E;

    /* renamed from: F */
    public boolean f4579F;

    /* renamed from: G */
    public boolean f4580G;

    /* renamed from: H */
    public C1545j f4581H;

    /* renamed from: I */
    public boolean f4582I;

    /* renamed from: J */
    public boolean f4583J;

    /* renamed from: K */
    public final C1077e0 f4584K;

    /* renamed from: L */
    public final C1077e0 f4585L;

    /* renamed from: M */
    public final C0036o f4586M;

    /* renamed from: p */
    public Context f4587p;

    /* renamed from: q */
    public Context f4588q;

    /* renamed from: r */
    public ActionBarOverlayLayout f4589r;

    /* renamed from: s */
    public ActionBarContainer f4590s;

    /* renamed from: t */
    public InterfaceC1710d1 f4591t;

    /* renamed from: u */
    public ActionBarContextView f4592u;

    /* renamed from: v */
    public final View f4593v;

    /* renamed from: w */
    public boolean f4594w;

    /* renamed from: x */
    public C1079f0 f4595x;

    /* renamed from: y */
    public C1079f0 f4596y;

    /* renamed from: z */
    public C0016e f4597z;

    public C1081g0(Activity activity, boolean z7) {
        new ArrayList();
        this.f4575B = new ArrayList();
        this.f4576C = 0;
        this.f4577D = true;
        this.f4580G = true;
        this.f4584K = new C1077e0(this, 0);
        this.f4585L = new C1077e0(this, 1);
        this.f4586M = new C0036o(23, this);
        View decorView = activity.getWindow().getDecorView();
        m2280j0(decorView);
        if (z7) {
            return;
        }
        this.f4593v = decorView.findViewById(R.id.content);
    }

    /* renamed from: h0 */
    public final void m2278h0(boolean z7) {
        C1843r0 c1843r0M452j;
        C1843r0 c1843r0M452j2;
        if (z7) {
            if (!this.f4579F) {
                this.f4579F = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4589r;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2283m0(false);
            }
        } else if (this.f4579F) {
            this.f4579F = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4589r;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2283m0(false);
        }
        if (!this.f4590s.isLaidOut()) {
            if (z7) {
                ((C1743l2) this.f4591t).f6626a.setVisibility(4);
                this.f4592u.setVisibility(0);
                return;
            } else {
                ((C1743l2) this.f4591t).f6626a.setVisibility(0);
                this.f4592u.setVisibility(8);
                return;
            }
        }
        if (z7) {
            C1743l2 c1743l2 = (C1743l2) this.f4591t;
            c1843r0M452j = AbstractC1828m0.m3596a(c1743l2.f6626a);
            c1843r0M452j.m3615a(0.0f);
            c1843r0M452j.m3617c(100L);
            c1843r0M452j.m3618d(new C1544i(c1743l2, 4));
            c1843r0M452j2 = this.f4592u.m452j(0, 200L);
        } else {
            C1743l2 c1743l22 = (C1743l2) this.f4591t;
            C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(c1743l22.f6626a);
            c1843r0M3596a.m3615a(1.0f);
            c1843r0M3596a.m3617c(200L);
            c1843r0M3596a.m3618d(new C1544i(c1743l22, 0));
            c1843r0M452j = this.f4592u.m452j(8, 100L);
            c1843r0M452j2 = c1843r0M3596a;
        }
        C1545j c1545j = new C1545j();
        ArrayList arrayList = c1545j.f5917a;
        arrayList.add(c1843r0M452j);
        View view = (View) c1843r0M452j.f6932a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c1843r0M452j2.f6932a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c1843r0M452j2);
        c1545j.m3223b();
    }

    /* renamed from: i0 */
    public final Context m2279i0() {
        if (this.f4588q == null) {
            TypedValue typedValue = new TypedValue();
            this.f4587p.getTheme().resolveAttribute(com.exotv.net.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4588q = new ContextThemeWrapper(this.f4587p, i);
            } else {
                this.f4588q = this.f4587p;
            }
        }
        return this.f4588q;
    }

    /* renamed from: j0 */
    public final void m2280j0(View view) {
        InterfaceC1710d1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.exotv.net.R.id.decor_content_parent);
        this.f4589r = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.exotv.net.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1710d1) {
            wrapper = (InterfaceC1710d1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f4591t = wrapper;
        this.f4592u = (ActionBarContextView) view.findViewById(com.exotv.net.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.exotv.net.R.id.action_bar_container);
        this.f4590s = actionBarContainer;
        InterfaceC1710d1 interfaceC1710d1 = this.f4591t;
        if (interfaceC1710d1 == null || this.f4592u == null || actionBarContainer == null) {
            throw new IllegalStateException(C1081g0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1743l2) interfaceC1710d1).f6626a.getContext();
        this.f4587p = context;
        if ((((C1743l2) this.f4591t).f6627b & 4) != 0) {
            this.f4594w = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f4591t.getClass();
        m2282l0(context.getResources().getBoolean(com.exotv.net.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f4587p.obtainStyledAttributes(null, AbstractC1026a.f4308a, com.exotv.net.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4589r;
            if (!actionBarOverlayLayout2.f699p) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f4583J = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f4590s;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            AbstractC1804e0.m3537i(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: k0 */
    public final void m2281k0(boolean z7) {
        if (this.f4594w) {
            return;
        }
        int i = z7 ? 4 : 0;
        C1743l2 c1743l2 = (C1743l2) this.f4591t;
        int i4 = c1743l2.f6627b;
        this.f4594w = true;
        c1743l2.m3420a((i & 4) | (i4 & (-5)));
    }

    /* renamed from: l0 */
    public final void m2282l0(boolean z7) {
        if (z7) {
            this.f4590s.setTabContainer(null);
            ((C1743l2) this.f4591t).getClass();
        } else {
            ((C1743l2) this.f4591t).getClass();
            this.f4590s.setTabContainer(null);
        }
        this.f4591t.getClass();
        ((C1743l2) this.f4591t).f6626a.setCollapsible(false);
        this.f4589r.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: m0 */
    public final void m2283m0(boolean z7) {
        boolean z8 = this.f4578E;
        boolean z9 = this.f4579F;
        final C0036o c0036o = this.f4586M;
        View view = this.f4593v;
        if (!z9 && z8) {
            if (this.f4580G) {
                this.f4580G = false;
                C1545j c1545j = this.f4581H;
                if (c1545j != null) {
                    c1545j.m3222a();
                }
                int i = this.f4576C;
                C1077e0 c1077e0 = this.f4584K;
                if (i != 0 || (!this.f4582I && !z7)) {
                    c1077e0.mo2256c();
                    return;
                }
                this.f4590s.setAlpha(1.0f);
                this.f4590s.setTransitioning(true);
                C1545j c1545j2 = new C1545j();
                float f8 = -this.f4590s.getHeight();
                if (z7) {
                    this.f4590s.getLocationInWindow(new int[]{0, 0});
                    f8 -= r12[1];
                }
                C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(this.f4590s);
                c1843r0M3596a.m3619e(f8);
                final View view2 = (View) c1843r0M3596a.f6932a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0036o != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: m0.q0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C1081g0) c0036o.f143k).f4590s.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z10 = c1545j2.f5921e;
                ArrayList arrayList = c1545j2.f5917a;
                if (!z10) {
                    arrayList.add(c1843r0M3596a);
                }
                if (this.f4577D && view != null) {
                    C1843r0 c1843r0M3596a2 = AbstractC1828m0.m3596a(view);
                    c1843r0M3596a2.m3619e(f8);
                    if (!c1545j2.f5921e) {
                        arrayList.add(c1843r0M3596a2);
                    }
                }
                boolean z11 = c1545j2.f5921e;
                if (!z11) {
                    c1545j2.f5919c = f4572N;
                }
                if (!z11) {
                    c1545j2.f5918b = 250L;
                }
                if (!z11) {
                    c1545j2.f5920d = c1077e0;
                }
                this.f4581H = c1545j2;
                c1545j2.m3223b();
                return;
            }
            return;
        }
        if (this.f4580G) {
            return;
        }
        this.f4580G = true;
        C1545j c1545j3 = this.f4581H;
        if (c1545j3 != null) {
            c1545j3.m3222a();
        }
        this.f4590s.setVisibility(0);
        int i4 = this.f4576C;
        C1077e0 c1077e02 = this.f4585L;
        if (i4 == 0 && (this.f4582I || z7)) {
            this.f4590s.setTranslationY(0.0f);
            float f9 = -this.f4590s.getHeight();
            if (z7) {
                this.f4590s.getLocationInWindow(new int[]{0, 0});
                f9 -= r12[1];
            }
            this.f4590s.setTranslationY(f9);
            C1545j c1545j4 = new C1545j();
            C1843r0 c1843r0M3596a3 = AbstractC1828m0.m3596a(this.f4590s);
            c1843r0M3596a3.m3619e(0.0f);
            final View view3 = (View) c1843r0M3596a3.f6932a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0036o != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: m0.q0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C1081g0) c0036o.f143k).f4590s.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z12 = c1545j4.f5921e;
            ArrayList arrayList2 = c1545j4.f5917a;
            if (!z12) {
                arrayList2.add(c1843r0M3596a3);
            }
            if (this.f4577D && view != null) {
                view.setTranslationY(f9);
                C1843r0 c1843r0M3596a4 = AbstractC1828m0.m3596a(view);
                c1843r0M3596a4.m3619e(0.0f);
                if (!c1545j4.f5921e) {
                    arrayList2.add(c1843r0M3596a4);
                }
            }
            boolean z13 = c1545j4.f5921e;
            if (!z13) {
                c1545j4.f5919c = f4573O;
            }
            if (!z13) {
                c1545j4.f5918b = 250L;
            }
            if (!z13) {
                c1545j4.f5920d = c1077e02;
            }
            this.f4581H = c1545j4;
            c1545j4.m3223b();
        } else {
            this.f4590s.setAlpha(1.0f);
            this.f4590s.setTranslationY(0.0f);
            if (this.f4577D && view != null) {
                view.setTranslationY(0.0f);
            }
            c1077e02.mo2256c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4589r;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            AbstractC1798c0.m3516c(actionBarOverlayLayout);
        }
    }

    public C1081g0(Dialog dialog) {
        new ArrayList();
        this.f4575B = new ArrayList();
        this.f4576C = 0;
        this.f4577D = true;
        this.f4580G = true;
        this.f4584K = new C1077e0(this, 0);
        this.f4585L = new C1077e0(this, 1);
        this.f4586M = new C0036o(23, this);
        m2280j0(dialog.getWindow().getDecorView());
    }
}
