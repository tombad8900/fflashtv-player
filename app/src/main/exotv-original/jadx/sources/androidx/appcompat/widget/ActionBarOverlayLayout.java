package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.media3.common.C0228p;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.WeakHashMap;
import p017b6.C0614n;
import p037e0.C0851b;
import p062h.C1081g0;
import p087k.C1545j;
import p095l.InterfaceC1639y;
import p095l.MenuC1627m;
import p104m.C1712e;
import p104m.C1716f;
import p104m.C1723g2;
import p104m.C1736k;
import p104m.C1743l2;
import p104m.InterfaceC1706c1;
import p104m.InterfaceC1708d;
import p104m.InterfaceC1710d1;
import p104m.RunnableC1704c;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1814h1;
import p105m0.AbstractC1828m0;
import p105m0.C1799c1;
import p105m0.C1805e1;
import p105m0.C1808f1;
import p105m0.C1811g1;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1827m;
import p105m0.InterfaceC1830n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1706c1, InterfaceC1827m, InterfaceC1830n {

    /* renamed from: O */
    public static final int[] f676O = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: P */
    public static final C1844r1 f677P;

    /* renamed from: Q */
    public static final Rect f678Q;

    /* renamed from: A */
    public boolean f679A;

    /* renamed from: B */
    public boolean f680B;

    /* renamed from: C */
    public C1844r1 f681C;

    /* renamed from: D */
    public C1844r1 f682D;

    /* renamed from: E */
    public C1844r1 f683E;

    /* renamed from: F */
    public C1844r1 f684F;

    /* renamed from: G */
    public InterfaceC1708d f685G;

    /* renamed from: H */
    public OverScroller f686H;

    /* renamed from: I */
    public ViewPropertyAnimator f687I;

    /* renamed from: J */
    public final C0614n f688J;

    /* renamed from: K */
    public final RunnableC1704c f689K;

    /* renamed from: L */
    public final RunnableC1704c f690L;

    /* renamed from: M */
    public final C0228p f691M;

    /* renamed from: N */
    public final C1716f f692N;

    /* renamed from: j */
    public int f693j;

    /* renamed from: k */
    public int f694k;

    /* renamed from: l */
    public ContentFrameLayout f695l;

    /* renamed from: m */
    public ActionBarContainer f696m;

    /* renamed from: n */
    public InterfaceC1710d1 f697n;

    /* renamed from: o */
    public Drawable f698o;

    /* renamed from: p */
    public boolean f699p;

    /* renamed from: q */
    public boolean f700q;

    /* renamed from: r */
    public boolean f701r;

    /* renamed from: s */
    public boolean f702s;

    /* renamed from: t */
    public int f703t;

    /* renamed from: u */
    public int f704u;

    /* renamed from: v */
    public final Rect f705v;

    /* renamed from: w */
    public final Rect f706w;

    /* renamed from: x */
    public final Rect f707x;

    /* renamed from: y */
    public final Rect f708y;

    /* renamed from: z */
    public final Rect f709z;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC1814h1 c1811g1 = i >= 34 ? new C1811g1() : i >= 30 ? new C1808f1() : i >= 29 ? new C1805e1() : new C1799c1();
        c1811g1.mo3520g(C0851b.m2022c(0, 1, 0, 1));
        f677P = c1811g1.mo3518b();
        f678Q = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f694k = 0;
        this.f705v = new Rect();
        this.f706w = new Rect();
        this.f707x = new Rect();
        this.f708y = new Rect();
        this.f709z = new Rect();
        this.f679A = true;
        this.f680B = false;
        C1844r1 c1844r1 = C1844r1.f6933b;
        this.f681C = c1844r1;
        this.f682D = c1844r1;
        this.f683E = c1844r1;
        this.f684F = c1844r1;
        this.f688J = new C0614n(3, this);
        this.f689K = new RunnableC1704c(this, 0);
        this.f690L = new RunnableC1704c(this, 1);
        m462h(context);
        this.f691M = new C0228p();
        C1716f c1716f = new C1716f(context);
        c1716f.setWillNotDraw(true);
        this.f692N = c1716f;
        addView(c1716f);
    }

    /* renamed from: k */
    public static boolean m454k(View view, int i, int i4, int i8, int i9) {
        boolean z7;
        C1712e c1712e = (C1712e) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c1712e).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) c1712e).leftMargin = i;
            z7 = true;
        } else {
            z7 = false;
        }
        if (((ViewGroup.MarginLayoutParams) c1712e).topMargin != i4) {
            ((ViewGroup.MarginLayoutParams) c1712e).topMargin = i4;
            z7 = true;
        }
        if (((ViewGroup.MarginLayoutParams) c1712e).rightMargin != i8) {
            ((ViewGroup.MarginLayoutParams) c1712e).rightMargin = i8;
            z7 = true;
        }
        if (((ViewGroup.MarginLayoutParams) c1712e).bottomMargin == i9) {
            return z7;
        }
        ((ViewGroup.MarginLayoutParams) c1712e).bottomMargin = i9;
        return true;
    }

    @Override // p105m0.InterfaceC1830n
    /* renamed from: a */
    public final void mo455a(View view, int i, int i4, int i8, int i9, int i10, int[] iArr) {
        mo456b(view, i, i4, i8, i9, i10);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: b */
    public final void mo456b(View view, int i, int i4, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i, i4, i8, i9);
        }
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: c */
    public final boolean mo457c(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1712e;
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: d */
    public final void mo458d(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f698o != null) {
            if (this.f696m.getVisibility() == 0) {
                translationY = (int) (this.f696m.getTranslationY() + this.f696m.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f698o.setBounds(0, translationY, getWidth(), this.f698o.getIntrinsicHeight() + translationY);
            this.f698o.draw(canvas);
        }
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: e */
    public final void mo459e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: f */
    public final void mo460f(View view, int i, int i4, int[] iArr, int i8) {
    }

    /* renamed from: g */
    public final void m461g() {
        removeCallbacks(this.f689K);
        removeCallbacks(this.f690L);
        ViewPropertyAnimator viewPropertyAnimator = this.f687I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1712e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1712e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f696m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0228p c0228p = this.f691M;
        return c0228p.f1277b | c0228p.f1276a;
    }

    public CharSequence getTitle() {
        m464j();
        return ((C1743l2) this.f697n).f6626a.getTitle();
    }

    /* renamed from: h */
    public final void m462h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f676O);
        this.f693j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f698o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f686H = new OverScroller(context);
    }

    /* renamed from: i */
    public final void m463i(int i) {
        m464j();
        if (i == 2) {
            ((C1743l2) this.f697n).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C1743l2) this.f697n).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: j */
    public final void m464j() {
        InterfaceC1710d1 wrapper;
        if (this.f695l == null) {
            this.f695l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f696m = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1710d1) {
                wrapper = (InterfaceC1710d1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f697n = wrapper;
        }
    }

    /* renamed from: l */
    public final void m465l(Menu menu, InterfaceC1639y interfaceC1639y) {
        m464j();
        C1743l2 c1743l2 = (C1743l2) this.f697n;
        Toolbar toolbar = c1743l2.f6626a;
        if (c1743l2.f6638m == null) {
            c1743l2.f6638m = new C1736k(toolbar.getContext());
        }
        C1736k c1736k = c1743l2.f6638m;
        c1736k.f6594n = interfaceC1639y;
        MenuC1627m menuC1627m = (MenuC1627m) menu;
        if (menuC1627m == null && toolbar.f762j == null) {
            return;
        }
        toolbar.m482f();
        MenuC1627m menuC1627m2 = toolbar.f762j.f719y;
        if (menuC1627m2 == menuC1627m) {
            return;
        }
        if (menuC1627m2 != null) {
            menuC1627m2.m3315r(toolbar.f755T);
            menuC1627m2.m3315r(toolbar.f756U);
        }
        if (toolbar.f756U == null) {
            toolbar.f756U = new C1723g2(toolbar);
        }
        c1736k.f6606z = true;
        if (menuC1627m != null) {
            menuC1627m.m3307b(c1736k, toolbar.f771s);
            menuC1627m.m3307b(toolbar.f756U, toolbar.f771s);
        } else {
            c1736k.mo3302i(toolbar.f771s, null);
            toolbar.f756U.mo3302i(toolbar.f771s, null);
            c1736k.mo3279e();
            toolbar.f756U.mo3279e();
        }
        toolbar.f762j.setPopupTheme(toolbar.f772t);
        toolbar.f762j.setPresenter(c1736k);
        toolbar.f755T = c1736k;
        toolbar.m492t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zM454k;
        m464j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z7 = true;
        boolean z8 = (windowSystemUiVisibility & 256) != 0;
        boolean z9 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        C1716f c1716f = this.f692N;
        C1844r1 c1844r1 = f677P;
        Rect rect = this.f709z;
        AbstractC1804e0.m3530b(c1716f, c1844r1, rect);
        boolean zEquals = rect.equals(f678Q);
        this.f679A = !zEquals;
        boolean z10 = zEquals || (z8 && z9);
        this.f680B = z10;
        InterfaceC1708d interfaceC1708d = this.f685G;
        if (interfaceC1708d != null) {
            ((C1081g0) interfaceC1708d).f4577D = (z8 || z10) ? false : true;
        }
        C1844r1 c1844r1M3621g = C1844r1.m3621g(this, windowInsets);
        C1835o1 c1835o1 = c1844r1M3621g.f6934a;
        C0851b c0851bMo3565k = c1835o1.mo3565k();
        int i = c0851bMo3565k.f3769a;
        int i4 = c0851bMo3565k.f3769a;
        int i8 = c0851bMo3565k.f3770b;
        int i9 = c0851bMo3565k.f3771c;
        this.f708y.set(i, i8, i9, c0851bMo3565k.f3772d);
        if (this.f680B) {
            C0851b c0851bMo3563f = c1835o1.mo3563f(2);
            int i10 = c0851bMo3563f.f3769a;
            int i11 = c0851bMo3563f.f3771c;
            this.f696m.setPadding(i4 - i10, i8, i9 - i11, 0);
            zM454k = m454k(this.f696m, c0851bMo3563f.f3769a, 0, i11, 0);
        } else {
            this.f696m.setPadding(0, 0, 0, 0);
            zM454k = m454k(this.f696m, i4, i8, i9, 0);
        }
        Rect rect2 = this.f705v;
        AbstractC1804e0.m3530b(this, c1844r1M3621g, rect2);
        C1844r1 c1844r1Mo3566m = c1835o1.mo3566m(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f681C = c1844r1Mo3566m;
        if (!this.f682D.equals(c1844r1Mo3566m)) {
            this.f682D = this.f681C;
            zM454k = true;
        }
        Rect rect3 = this.f706w;
        if (rect3.equals(rect2)) {
            z7 = zM454k;
        } else {
            rect3.set(rect2);
        }
        if (z7) {
            requestLayout();
        }
        return c1835o1.mo3582a().f6934a.mo3576c().f6934a.mo3575b().m3626f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m462h(getContext());
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1798c0.m3516c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m461g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1712e c1712e = (C1712e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) c1712e).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) c1712e).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int measuredHeight;
        m464j();
        measureChildWithMargins(this.f696m, i, 0, i4, 0);
        C1712e c1712e = (C1712e) this.f696m.getLayoutParams();
        int iMax = Math.max(0, this.f696m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1712e).leftMargin + ((ViewGroup.MarginLayoutParams) c1712e).rightMargin);
        int iMax2 = Math.max(0, this.f696m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1712e).topMargin + ((ViewGroup.MarginLayoutParams) c1712e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f696m.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        boolean z7 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z7) {
            measuredHeight = this.f693j;
            if (this.f680B) {
                measuredHeight += this.f708y.top;
            }
            if (this.f700q && this.f696m.getTabContainer() != null) {
                measuredHeight += this.f693j;
            }
        } else {
            measuredHeight = this.f696m.getVisibility() != 8 ? this.f696m.getMeasuredHeight() : 0;
        }
        Rect rect = this.f705v;
        Rect rect2 = this.f707x;
        rect2.set(rect);
        C1844r1 c1844r1 = this.f681C;
        this.f683E = c1844r1;
        if (this.f699p || z7 || !this.f679A) {
            C0851b c0851bM2022c = this.f680B ? C0851b.m2022c(c1844r1.m3623b(), Math.max(this.f683E.m3625d(), measuredHeight), this.f683E.m3624c(), Math.max(this.f683E.m3622a(), 0)) : C0851b.m2022c(c1844r1.m3623b(), this.f683E.m3625d() + measuredHeight, this.f683E.m3624c(), this.f683E.m3622a());
            C1844r1 c1844r12 = this.f683E;
            int i8 = Build.VERSION.SDK_INT;
            AbstractC1814h1 c1811g1 = i8 >= 34 ? new C1811g1(c1844r12) : i8 >= 30 ? new C1808f1(c1844r12) : i8 >= 29 ? new C1805e1(c1844r12) : new C1799c1(c1844r12);
            c1811g1.mo3520g(c0851bM2022c);
            this.f683E = c1811g1.mo3518b();
        } else {
            if (this.f680B) {
                rect2.top = Math.max(rect2.top, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.f683E = this.f683E.f6934a.mo3566m(0, measuredHeight, 0, 0);
        }
        m454k(this.f695l, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.f684F.equals(this.f683E)) {
            C1844r1 c1844r13 = this.f683E;
            this.f684F = c1844r13;
            AbstractC1828m0.m3597b(this.f695l, c1844r13);
        }
        measureChildWithMargins(this.f695l, i, 0, i4, 0);
        C1712e c1712e2 = (C1712e) this.f695l.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f695l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1712e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1712e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f695l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1712e2).topMargin + ((ViewGroup.MarginLayoutParams) c1712e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f695l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (!this.f701r || !z7) {
            return false;
        }
        this.f686H.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f686H.getFinalY() > this.f696m.getHeight()) {
            m461g();
            this.f690L.run();
        } else {
            m461g();
            this.f689K.run();
        }
        this.f702s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i8, int i9) {
        int i10 = this.f703t + i4;
        this.f703t = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C1081g0 c1081g0;
        C1545j c1545j;
        this.f691M.f1276a = i;
        this.f703t = getActionBarHideOffset();
        m461g();
        InterfaceC1708d interfaceC1708d = this.f685G;
        if (interfaceC1708d == null || (c1545j = (c1081g0 = (C1081g0) interfaceC1708d).f4581H) == null) {
            return;
        }
        c1545j.m3222a();
        c1081g0.f4581H = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f696m.getVisibility() != 0) {
            return false;
        }
        return this.f701r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f701r || this.f702s) {
            return;
        }
        if (this.f703t <= this.f696m.getHeight()) {
            m461g();
            postDelayed(this.f689K, 600L);
        } else {
            m461g();
            postDelayed(this.f690L, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m464j();
        int i4 = this.f704u ^ i;
        this.f704u = i;
        boolean z7 = (i & 4) == 0;
        boolean z8 = (i & 256) != 0;
        InterfaceC1708d interfaceC1708d = this.f685G;
        if (interfaceC1708d != null) {
            C1081g0 c1081g0 = (C1081g0) interfaceC1708d;
            c1081g0.f4577D = (z8 || this.f680B) ? false : true;
            if (z7 || !z8) {
                if (c1081g0.f4578E) {
                    c1081g0.f4578E = false;
                    c1081g0.m2283m0(true);
                }
            } else if (!c1081g0.f4578E) {
                c1081g0.f4578E = true;
                c1081g0.m2283m0(true);
            }
        }
        if ((i4 & 256) == 0 || this.f685G == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1798c0.m3516c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f694k = i;
        InterfaceC1708d interfaceC1708d = this.f685G;
        if (interfaceC1708d != null) {
            ((C1081g0) interfaceC1708d).f4576C = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m461g();
        this.f696m.setTranslationY(-Math.max(0, Math.min(i, this.f696m.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1708d interfaceC1708d) {
        this.f685G = interfaceC1708d;
        if (getWindowToken() != null) {
            ((C1081g0) this.f685G).f4576C = this.f694k;
            int i = this.f704u;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                AbstractC1798c0.m3516c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f700q = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f701r) {
            this.f701r = z7;
            if (z7) {
                return;
            }
            m461g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m464j();
        C1743l2 c1743l2 = (C1743l2) this.f697n;
        c1743l2.f6629d = i != 0 ? AbstractC0715d.m1542D(c1743l2.f6626a.getContext(), i) : null;
        c1743l2.m3422c();
    }

    public void setLogo(int i) {
        m464j();
        C1743l2 c1743l2 = (C1743l2) this.f697n;
        c1743l2.f6630e = i != 0 ? AbstractC0715d.m1542D(c1743l2.f6626a.getContext(), i) : null;
        c1743l2.m3422c();
    }

    public void setOverlayMode(boolean z7) {
        this.f699p = z7;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p104m.InterfaceC1706c1
    public void setWindowCallback(Window.Callback callback) {
        m464j();
        ((C1743l2) this.f697n).f6636k = callback;
    }

    @Override // p104m.InterfaceC1706c1
    public void setWindowTitle(CharSequence charSequence) {
        m464j();
        C1743l2 c1743l2 = (C1743l2) this.f697n;
        if (c1743l2.f6632g) {
            return;
        }
        Toolbar toolbar = c1743l2.f6626a;
        c1743l2.f6633h = charSequence;
        if ((c1743l2.f6627b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1743l2.f6632g) {
                AbstractC1828m0.m3609n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1712e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m464j();
        C1743l2 c1743l2 = (C1743l2) this.f697n;
        c1743l2.f6629d = drawable;
        c1743l2.m3422c();
    }
}
