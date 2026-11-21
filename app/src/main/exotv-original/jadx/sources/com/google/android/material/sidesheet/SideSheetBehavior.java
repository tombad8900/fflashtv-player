package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p034d5.AbstractC0847a;
import p074i5.C1270b;
import p074i5.C1272d;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p114n0.C1951c;
import p166t0.C2392f;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p195w4.C2667i;
import p211y5.C2809a;
import p211y5.C2823j;
import p211y5.C2827n;
import p211y5.C2828o;
import p213z.AbstractC2863a;
import p213z.C2866d;
import p219z5.C2971a;
import p219z5.C2972b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC2863a {

    /* renamed from: a */
    public AbstractC2415i0 f3377a;

    /* renamed from: b */
    public final C2823j f3378b;

    /* renamed from: c */
    public final ColorStateList f3379c;

    /* renamed from: d */
    public final C2828o f3380d;

    /* renamed from: e */
    public final C1272d f3381e;

    /* renamed from: f */
    public final float f3382f;

    /* renamed from: g */
    public final boolean f3383g;

    /* renamed from: h */
    public int f3384h;

    /* renamed from: i */
    public C2392f f3385i;

    /* renamed from: j */
    public boolean f3386j;

    /* renamed from: k */
    public final float f3387k;

    /* renamed from: l */
    public int f3388l;

    /* renamed from: m */
    public int f3389m;

    /* renamed from: n */
    public int f3390n;

    /* renamed from: o */
    public int f3391o;

    /* renamed from: p */
    public WeakReference f3392p;

    /* renamed from: q */
    public WeakReference f3393q;

    /* renamed from: r */
    public final int f3394r;

    /* renamed from: s */
    public VelocityTracker f3395s;

    /* renamed from: t */
    public int f3396t;

    /* renamed from: u */
    public final LinkedHashSet f3397u;

    /* renamed from: v */
    public final C1270b f3398v;

    public SideSheetBehavior() {
        this.f3381e = new C1272d(this);
        this.f3383g = true;
        this.f3384h = 5;
        this.f3387k = 0.1f;
        this.f3394r = -1;
        this.f3397u = new LinkedHashSet();
        this.f3398v = new C1270b(this, 1);
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: c */
    public final void mo1790c(C2866d c2866d) {
        this.f3392p = null;
        this.f3385i = null;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: e */
    public final void mo1791e() {
        this.f3392p = null;
        this.f3385i = null;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: f */
    public final boolean mo1754f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C2392f c2392f;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC1828m0.m3600e(view) == null) || !this.f3383g) {
            this.f3386j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3395s) != null) {
            velocityTracker.recycle();
            this.f3395s = null;
        }
        if (this.f3395s == null) {
            this.f3395s = VelocityTracker.obtain();
        }
        this.f3395s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3396t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f3386j) {
            this.f3386j = false;
            return false;
        }
        return (this.f3386j || (c2392f = this.f3385i) == null || !c2392f.m4237o(motionEvent)) ? false : true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i4;
        View viewFindViewById;
        int i8 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f3392p;
        C2823j c2823j = this.f3378b;
        int iMo4281n = 0;
        if (weakReference == null) {
            this.f3392p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC2436a.m4342q(context, R.attr.motionDurationMedium2, 300);
            AbstractC2436a.m4342q(context, R.attr.motionDurationShort3, 150);
            AbstractC2436a.m4342q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c2823j != null) {
                view.setBackground(c2823j);
                float elevation = this.f3382f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c2823j.m4944p(elevation);
            } else {
                ColorStateList colorStateList = this.f3379c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    AbstractC1804e0.m3535g(view, colorStateList);
                }
            }
            int i9 = this.f3384h == 5 ? 4 : 0;
            if (view.getVisibility() != i9) {
                view.setVisibility(i9);
            }
            m1889u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC1828m0.m3600e(view) == null) {
                AbstractC1828m0.m3609n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i10 = Gravity.getAbsoluteGravity(((C2866d) view.getLayoutParams()).f10574c, i) == 3 ? 1 : 0;
        AbstractC2415i0 abstractC2415i0 = this.f3377a;
        if (abstractC2415i0 == null || abstractC2415i0.mo4283p() != i10) {
            C2866d c2866d = null;
            C2828o c2828o = this.f3380d;
            if (i10 == 0) {
                this.f3377a = new C2971a(this, i8);
                if (c2828o != null) {
                    WeakReference weakReference2 = this.f3392p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C2866d)) {
                        c2866d = (C2866d) view3.getLayoutParams();
                    }
                    if (c2866d == null || ((ViewGroup.MarginLayoutParams) c2866d).rightMargin <= 0) {
                        C2827n c2827nM4956j = c2828o.m4956j();
                        c2827nM4956j.f10514f = new C2809a(0.0f);
                        c2827nM4956j.f10515g = new C2809a(0.0f);
                        C2828o c2828oM4951a = c2827nM4956j.m4951a();
                        if (c2823j != null) {
                            c2823j.setShapeAppearanceModel(c2828oM4951a);
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException(AbstractC0008a1.m14j("Invalid sheet edge position value: ", i10, ". Must be 0 or 1."));
                }
                this.f3377a = new C2971a(this, iMo4281n);
                if (c2828o != null) {
                    WeakReference weakReference3 = this.f3392p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C2866d)) {
                        c2866d = (C2866d) view2.getLayoutParams();
                    }
                    if (c2866d == null || ((ViewGroup.MarginLayoutParams) c2866d).leftMargin <= 0) {
                        C2827n c2827nM4956j2 = c2828o.m4956j();
                        c2827nM4956j2.f10513e = new C2809a(0.0f);
                        c2827nM4956j2.f10516h = new C2809a(0.0f);
                        C2828o c2828oM4951a2 = c2827nM4956j2.m4951a();
                        if (c2823j != null) {
                            c2823j.setShapeAppearanceModel(c2828oM4951a2);
                        }
                    }
                }
            }
        }
        if (this.f3385i == null) {
            this.f3385i = new C2392f(coordinatorLayout.getContext(), coordinatorLayout, this.f3398v);
        }
        int iMo4281n2 = this.f3377a.mo4281n(view);
        coordinatorLayout.m514q(view, i);
        this.f3389m = coordinatorLayout.getWidth();
        this.f3390n = this.f3377a.mo4282o(coordinatorLayout);
        this.f3388l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3391o = marginLayoutParams != null ? this.f3377a.mo4274b(marginLayoutParams) : 0;
        int i11 = this.f3384h;
        if (i11 == 1 || i11 == 2) {
            iMo4281n = iMo4281n2 - this.f3377a.mo4281n(view);
        } else if (i11 != 3) {
            if (i11 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3384h);
            }
            iMo4281n = this.f3377a.mo4278k();
        }
        WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
        view.offsetLeftAndRight(iMo4281n);
        if (this.f3393q == null && (i4 = this.f3394r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f3393q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f3397u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: h */
    public final boolean mo1756h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: m */
    public final void mo1759m(View view, Parcelable parcelable) {
        int i = ((C2972b) parcelable).f11098l;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f3384h = i;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: n */
    public final Parcelable mo1760n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2972b(this);
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: q */
    public final boolean mo1763q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3384h == 1 && actionMasked == 0) {
            return true;
        }
        if (m1887s()) {
            this.f3385i.m4231i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3395s) != null) {
            velocityTracker.recycle();
            this.f3395s = null;
        }
        if (this.f3395s == null) {
            this.f3395s = VelocityTracker.obtain();
        }
        this.f3395s.addMovement(motionEvent);
        if (m1887s() && actionMasked == 2 && !this.f3386j && m1887s()) {
            float fAbs = Math.abs(this.f3396t - motionEvent.getX());
            C2392f c2392f = this.f3385i;
            if (fAbs > c2392f.f8398b) {
                c2392f.m4224b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3386j;
    }

    /* renamed from: r */
    public final void m1886r(int i) {
        View view;
        if (this.f3384h == i) {
            return;
        }
        this.f3384h = i;
        WeakReference weakReference = this.f3392p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.f3384h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f3397u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m1889u();
    }

    /* renamed from: s */
    public final boolean m1887s() {
        if (this.f3385i != null) {
            return this.f3383g || this.f3384h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m4236n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m1886r(2);
        r2.f3381e.m2738a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1888t(View view, int i, boolean z7) {
        int iMo4276i;
        if (i == 3) {
            iMo4276i = this.f3377a.mo4276i();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Invalid state to get outer edge offset: "));
            }
            iMo4276i = this.f3377a.mo4278k();
        }
        C2392f c2392f = this.f3385i;
        if (c2392f != null) {
            if (!z7) {
                int top = view.getTop();
                c2392f.f8414r = view;
                c2392f.f8399c = -1;
                boolean zM4230h = c2392f.m4230h(iMo4276i, top, 0, 0);
                if (!zM4230h && c2392f.f8397a == 0 && c2392f.f8414r != null) {
                    c2392f.f8414r = null;
                }
            }
        }
        m1886r(i);
    }

    /* renamed from: u */
    public final void m1889u() {
        View view;
        WeakReference weakReference = this.f3392p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1828m0.m3605j(view, 262144);
        AbstractC1828m0.m3603h(view, 0);
        AbstractC1828m0.m3605j(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        AbstractC1828m0.m3603h(view, 0);
        int i = 5;
        if (this.f3384h != 5) {
            AbstractC1828m0.m3606k(view, C1951c.f7250i, new C2667i(i, this));
        }
        int i4 = 3;
        if (this.f3384h != 3) {
            AbstractC1828m0.m3606k(view, C1951c.f7249h, new C2667i(i4, this));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3381e = new C1272d(this);
        this.f3383g = true;
        this.f3384h = 5;
        this.f3387k = 0.1f;
        this.f3394r = -1;
        this.f3397u = new LinkedHashSet();
        this.f3398v = new C1270b(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3733B);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3379c = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f3380d = C2828o.m4952f(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m4951a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f3394r = resourceId;
            WeakReference weakReference = this.f3393q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3393q = null;
            WeakReference weakReference2 = this.f3392p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C2828o c2828o = this.f3380d;
        if (c2828o != null) {
            C2823j c2823j = new C2823j(c2828o);
            this.f3378b = c2823j;
            c2823j.m4941m(context);
            ColorStateList colorStateList = this.f3379c;
            if (colorStateList != null) {
                this.f3378b.m4945q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3378b.setTint(typedValue.data);
            }
        }
        this.f3382f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f3383g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
