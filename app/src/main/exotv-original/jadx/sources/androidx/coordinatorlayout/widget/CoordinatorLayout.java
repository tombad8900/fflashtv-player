package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.common.C0228p;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p002a1.C0022h;
import p095l.C1629o;
import p096l0.C1643c;
import p096l0.C1644d;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1844r1;
import p105m0.InterfaceC1827m;
import p105m0.InterfaceC1830n;
import p130p.C2192k;
import p152r4.ViewTreeObserverOnPreDrawListenerC2311b;
import p156s.C2331d;
import p206y.AbstractC2783a;
import p213z.AbstractC2863a;
import p213z.AbstractC2868f;
import p213z.C2866d;
import p213z.C2867e;
import p213z.InterfaceC2864b;
import p213z.ViewGroupOnHierarchyChangeListenerC2865c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1827m, InterfaceC1830n {

    /* renamed from: C */
    public static final String f801C;

    /* renamed from: D */
    public static final Class[] f802D;

    /* renamed from: E */
    public static final ThreadLocal f803E;

    /* renamed from: F */
    public static final C2331d f804F;

    /* renamed from: G */
    public static final C1644d f805G;

    /* renamed from: A */
    public C1629o f806A;

    /* renamed from: B */
    public final C0228p f807B;

    /* renamed from: j */
    public final ArrayList f808j;

    /* renamed from: k */
    public final C0022h f809k;

    /* renamed from: l */
    public final ArrayList f810l;

    /* renamed from: m */
    public final ArrayList f811m;

    /* renamed from: n */
    public final int[] f812n;

    /* renamed from: o */
    public final int[] f813o;

    /* renamed from: p */
    public boolean f814p;

    /* renamed from: q */
    public boolean f815q;

    /* renamed from: r */
    public final int[] f816r;

    /* renamed from: s */
    public View f817s;

    /* renamed from: t */
    public View f818t;

    /* renamed from: u */
    public ViewTreeObserverOnPreDrawListenerC2311b f819u;

    /* renamed from: v */
    public boolean f820v;

    /* renamed from: w */
    public C1844r1 f821w;

    /* renamed from: x */
    public boolean f822x;

    /* renamed from: y */
    public Drawable f823y;

    /* renamed from: z */
    public ViewGroup.OnHierarchyChangeListener f824z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f801C = r02 != null ? r02.getName() : null;
        f804F = new C2331d(5);
        f802D = new Class[]{Context.class, AttributeSet.class};
        f803E = new ThreadLocal();
        f805G = new C1644d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f808j = new ArrayList();
        this.f809k = new C0022h(7);
        this.f810l = new ArrayList();
        this.f811m = new ArrayList();
        this.f812n = new int[2];
        this.f813o = new int[2];
        this.f807B = new C0228p();
        int[] iArr = AbstractC2783a.f10343a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f816r = intArray;
            float f8 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                coordinatorLayout.f816r[i] = (int) (r1[i] * f8);
            }
        }
        coordinatorLayout.f823y = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m518w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2865c(this));
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m502g() {
        Rect rect = (Rect) f805G.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m503l(int i, Rect rect, Rect rect2, C2866d c2866d, int i4, int i8) {
        int i9 = c2866d.f10574c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = c2866d.f10575d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int iWidth = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            iWidth -= i4 / 2;
        } else if (i11 != 5) {
            iWidth -= i4;
        }
        if (i12 == 16) {
            iHeight -= i8 / 2;
        } else if (i12 != 80) {
            iHeight -= i8;
        }
        rect2.set(iWidth, iHeight, i4 + iWidth, i8 + iHeight);
    }

    /* renamed from: n */
    public static C2866d m504n(View view) {
        C2866d c2866d = (C2866d) view.getLayoutParams();
        if (!c2866d.f10573b) {
            InterfaceC2864b interfaceC2864b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC2864b = (InterfaceC2864b) superclass.getAnnotation(InterfaceC2864b.class);
                if (interfaceC2864b != null) {
                    break;
                }
            }
            if (interfaceC2864b != null) {
                try {
                    AbstractC2863a abstractC2863a = (AbstractC2863a) interfaceC2864b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC2863a abstractC2863a2 = c2866d.f10572a;
                    if (abstractC2863a2 != abstractC2863a) {
                        if (abstractC2863a2 != null) {
                            abstractC2863a2.mo1791e();
                        }
                        c2866d.f10572a = abstractC2863a;
                        c2866d.f10573b = true;
                        if (abstractC2863a != null) {
                            abstractC2863a.mo1790c(c2866d);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC2864b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c2866d.f10573b = true;
        }
        return c2866d;
    }

    /* renamed from: u */
    public static void m505u(View view, int i) {
        C2866d c2866d = (C2866d) view.getLayoutParams();
        int i4 = c2866d.f10580i;
        if (i4 != i) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            view.offsetLeftAndRight(i - i4);
            c2866d.f10580i = i;
        }
    }

    /* renamed from: v */
    public static void m506v(View view, int i) {
        C2866d c2866d = (C2866d) view.getLayoutParams();
        int i4 = c2866d.f10581j;
        if (i4 != i) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(i - i4);
            c2866d.f10581j = i;
        }
    }

    @Override // p105m0.InterfaceC1830n
    /* renamed from: a */
    public final void mo455a(View view, int i, int i4, int i8, int i9, int i10, int[] iArr) {
        AbstractC2863a abstractC2863a;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z7 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2866d c2866d = (C2866d) childAt.getLayoutParams();
                if (c2866d.m4967a(i10) && (abstractC2863a = c2866d.f10572a) != null) {
                    int[] iArr2 = this.f812n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2863a.mo1758k(this, childAt, i4, i8, i9, iArr2);
                    iMax = i8 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i9 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z7) {
            m513p(1);
        }
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: b */
    public final void mo456b(View view, int i, int i4, int i8, int i9, int i10) {
        mo455a(view, i, i4, i8, i9, 0, this.f813o);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: c */
    public final boolean mo457c(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C2866d c2866d = (C2866d) childAt.getLayoutParams();
                AbstractC2863a abstractC2863a = c2866d.f10572a;
                if (abstractC2863a != null) {
                    boolean zMo1761o = abstractC2863a.mo1761o(childAt, i, i4);
                    z7 |= zMo1761o;
                    if (i4 == 0) {
                        c2866d.f10584m = zMo1761o;
                    } else if (i4 == 1) {
                        c2866d.f10585n = zMo1761o;
                    }
                } else if (i4 == 0) {
                    c2866d.f10584m = false;
                } else if (i4 == 1) {
                    c2866d.f10585n = false;
                }
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2866d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: d */
    public final void mo458d(View view, View view2, int i, int i4) {
        C0228p c0228p = this.f807B;
        if (i4 == 1) {
            c0228p.f1277b = i;
        } else {
            c0228p.f1276a = i;
        }
        this.f818t = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((C2866d) getChildAt(i8).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC2863a abstractC2863a = ((C2866d) view.getLayoutParams()).f10572a;
        if (abstractC2863a != null) {
            abstractC2863a.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f823y;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: e */
    public final void mo459e(View view, int i) {
        C0228p c0228p = this.f807B;
        if (i == 1) {
            c0228p.f1277b = 0;
        } else {
            c0228p.f1276a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C2866d c2866d = (C2866d) childAt.getLayoutParams();
            if (c2866d.m4967a(i)) {
                AbstractC2863a abstractC2863a = c2866d.f10572a;
                if (abstractC2863a != null) {
                    abstractC2863a.mo1762p(childAt, view, i);
                }
                if (i == 0) {
                    c2866d.f10584m = false;
                } else if (i == 1) {
                    c2866d.f10585n = false;
                }
            }
        }
        this.f818t = null;
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: f */
    public final void mo460f(View view, int i, int i4, int[] iArr, int i8) {
        AbstractC2863a abstractC2863a;
        int childCount = getChildCount();
        boolean z7 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2866d c2866d = (C2866d) childAt.getLayoutParams();
                if (c2866d.m4967a(i8) && (abstractC2863a = c2866d.f10572a) != null) {
                    int[] iArr2 = this.f812n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2863a.mo1757j(this, childAt, view, i, i4, iArr2, i8);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z7) {
            m513p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2866d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2866d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m516s();
        return Collections.unmodifiableList(this.f808j);
    }

    public final C1844r1 getLastWindowInsets() {
        return this.f821w;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0228p c0228p = this.f807B;
        return c0228p.f1277b | c0228p.f1276a;
    }

    public Drawable getStatusBarBackground() {
        return this.f823y;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m507h(C2866d c2866d, Rect rect, int i, int i4) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2866d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c2866d).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2866d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) c2866d).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i4 + iMax2);
    }

    /* renamed from: i */
    public final void m508i(View view, Rect rect, boolean z7) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z7) {
            m510k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m509j(View view) {
        C2192k c2192k = (C2192k) this.f809k.f79k;
        int i = c2192k.f7656l;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) c2192k.m3996j(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2192k.m3992f(i4));
            }
        }
        ArrayList arrayList3 = this.f811m;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m510k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC2868f.f10588a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC2868f.f10588a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC2868f.m4968a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC2868f.f10589b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: m */
    public final int m511m(int i) {
        int[] iArr = this.f816r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* renamed from: o */
    public final boolean m512o(View view, int i, int i4) {
        C1644d c1644d = f805G;
        Rect rectM502g = m502g();
        m510k(view, rectM502g);
        try {
            return rectM502g.contains(i, i4);
        } finally {
            rectM502g.setEmpty();
            c1644d.mo285g(rectM502g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m517t(false);
        if (this.f820v) {
            if (this.f819u == null) {
                this.f819u = new ViewTreeObserverOnPreDrawListenerC2311b(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f819u);
        }
        if (this.f821w == null) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            if (getFitsSystemWindows()) {
                AbstractC1798c0.m3516c(this);
            }
        }
        this.f815q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m517t(false);
        if (this.f820v && this.f819u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f819u);
        }
        View view = this.f818t;
        if (view != null) {
            mo459e(view, 0);
        }
        this.f815q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f822x || this.f823y == null) {
            return;
        }
        C1844r1 c1844r1 = this.f821w;
        int iM3625d = c1844r1 != null ? c1844r1.m3625d() : 0;
        if (iM3625d > 0) {
            this.f823y.setBounds(0, 0, getWidth(), iM3625d);
            this.f823y.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m517t(true);
        }
        boolean zM515r = m515r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM515r;
        }
        m517t(true);
        return zM515r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        AbstractC2863a abstractC2863a;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f808j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((abstractC2863a = ((C2866d) view.getLayoutParams()).f10572a) == null || !abstractC2863a.mo1755g(this, view, layoutDirection))) {
                m514q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC2863a abstractC2863a;
        int i12;
        int i13;
        boolean z8;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        View view;
        int i18;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m516s();
        int childCount = coordinatorLayout.getChildCount();
        int i19 = 0;
        loop0: while (true) {
            if (i19 >= childCount) {
                z7 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i19);
            C2192k c2192k = (C2192k) coordinatorLayout.f809k.f79k;
            int i20 = c2192k.f7656l;
            for (int i21 = 0; i21 < i20; i21++) {
                ArrayList arrayList2 = (ArrayList) c2192k.m3996j(i21);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z7 = true;
                    break loop0;
                }
            }
            i19++;
        }
        if (z7 != coordinatorLayout.f820v) {
            if (z7) {
                if (coordinatorLayout.f815q) {
                    if (coordinatorLayout.f819u == null) {
                        coordinatorLayout.f819u = new ViewTreeObserverOnPreDrawListenerC2311b(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f819u);
                }
                coordinatorLayout.f820v = true;
            } else {
                if (coordinatorLayout.f815q && coordinatorLayout.f819u != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f819u);
                }
                coordinatorLayout.f820v = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z9 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.f821w != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f808j;
        int size3 = arrayList3.size();
        int i24 = 0;
        int iCombineMeasuredStates = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList3.get(i24);
            int i25 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i11 = size3;
                i18 = i24;
                i12 = paddingLeft;
                suggestedMinimumWidth = i25;
                z8 = false;
                i14 = paddingRight;
            } else {
                C2866d c2866d = (C2866d) view2.getLayoutParams();
                int i26 = c2866d.f10576e;
                if (i26 < 0 || mode == 0) {
                    i8 = suggestedMinimumHeight;
                } else {
                    int iM511m = coordinatorLayout.m511m(i26);
                    int i27 = c2866d.f10574c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i8 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z9) || (absoluteGravity == 5 && z9)) {
                        iMax = Math.max(0, (size - paddingRight) - iM511m);
                    } else if ((absoluteGravity == 5 && !z9) || (absoluteGravity == 3 && z9)) {
                        iMax = Math.max(0, iM511m - paddingLeft);
                    }
                    int i28 = size3;
                    i10 = iMax;
                    i9 = i28;
                    if (z10 || view2.getFitsSystemWindows()) {
                        i11 = i9;
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i4;
                    } else {
                        i11 = i9;
                        int iM3624c = coordinatorLayout.f821w.m3624c() + coordinatorLayout.f821w.m3623b();
                        int iM3622a = coordinatorLayout.f821w.m3622a() + coordinatorLayout.f821w.m3625d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM3624c, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM3622a, mode2);
                    }
                    abstractC2863a = c2866d.f10572a;
                    if (abstractC2863a == null) {
                        z8 = false;
                        i12 = paddingLeft;
                        i13 = i25;
                        i14 = paddingRight;
                        i15 = i8;
                        arrayList = arrayList3;
                        int i29 = iMakeMeasureSpec;
                        i18 = i24;
                        int i30 = iMakeMeasureSpec2;
                        boolean zMo1756h = abstractC2863a.mo1756h(this, view2, i29, i10, i30);
                        view = view2;
                        iMakeMeasureSpec = i29;
                        i16 = i10;
                        i17 = i30;
                        if (zMo1756h) {
                            coordinatorLayout = this;
                        }
                        int iMax2 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) c2866d).leftMargin + ((ViewGroup.MarginLayoutParams) c2866d).rightMargin);
                        int iMax3 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) c2866d).topMargin + ((ViewGroup.MarginLayoutParams) c2866d).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax2;
                        suggestedMinimumHeight = iMax3;
                    } else {
                        i12 = paddingLeft;
                        i13 = i25;
                        z8 = false;
                        i14 = paddingRight;
                        i15 = i8;
                        arrayList = arrayList3;
                        i16 = i10;
                        i17 = iMakeMeasureSpec2;
                        view = view2;
                        i18 = i24;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i17, 0);
                    int iMax22 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) c2866d).leftMargin + ((ViewGroup.MarginLayoutParams) c2866d).rightMargin);
                    int iMax32 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) c2866d).topMargin + ((ViewGroup.MarginLayoutParams) c2866d).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax22;
                    suggestedMinimumHeight = iMax32;
                }
                i9 = size3;
                i10 = 0;
                if (z10) {
                    i11 = i9;
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i4;
                    abstractC2863a = c2866d.f10572a;
                    if (abstractC2863a == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i17, 0);
                    int iMax222 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) c2866d).leftMargin + ((ViewGroup.MarginLayoutParams) c2866d).rightMargin);
                    int iMax322 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) c2866d).topMargin + ((ViewGroup.MarginLayoutParams) c2866d).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i24 = i18 + 1;
            paddingLeft = i12;
            paddingRight = i14;
            size3 = i11;
            arrayList3 = arrayList;
        }
        int i31 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i4, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2866d c2866d = (C2866d) childAt.getLayoutParams();
                if (c2866d.m4967a(0)) {
                    AbstractC2863a abstractC2863a = c2866d.f10572a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        AbstractC2863a abstractC2863a;
        int childCount = getChildCount();
        boolean zMo1792i = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2866d c2866d = (C2866d) childAt.getLayoutParams();
                if (c2866d.m4967a(0) && (abstractC2863a = c2866d.f10572a) != null) {
                    zMo1792i |= abstractC2863a.mo1792i(view);
                }
            }
        }
        return zMo1792i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        mo460f(view, i, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i8, int i9) {
        mo456b(view, i, i4, i8, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo458d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2867e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2867e c2867e = (C2867e) parcelable;
        super.onRestoreInstanceState(c2867e.f8189j);
        SparseArray sparseArray = c2867e.f10587l;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC2863a abstractC2863a = m504n(childAt).f10572a;
            if (id != -1 && abstractC2863a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC2863a.mo1759m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1760n;
        C2867e c2867e = new C2867e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC2863a abstractC2863a = ((C2866d) childAt.getLayoutParams()).f10572a;
            if (id != -1 && abstractC2863a != null && (parcelableMo1760n = abstractC2863a.mo1760n(childAt)) != null) {
                sparseArray.append(id, parcelableMo1760n);
            }
        }
        c2867e.f10587l = sparseArray;
        return c2867e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo457c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo459e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM515r;
        boolean zMo1763q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f817s == null) {
            zM515r = m515r(motionEvent, 1);
            if (!zM515r) {
                zMo1763q = false;
            }
            motionEventObtain = null;
            if (this.f817s != null) {
                zMo1763q |= super.onTouchEvent(motionEvent);
            } else if (zM515r) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo1763q;
            }
            m517t(false);
            return zMo1763q;
        }
        zM515r = false;
        AbstractC2863a abstractC2863a = ((C2866d) this.f817s.getLayoutParams()).f10572a;
        if (abstractC2863a != null) {
            zMo1763q = abstractC2863a.mo1763q(this.f817s, motionEvent);
        }
        motionEventObtain = null;
        if (this.f817s != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m517t(false);
        return zMo1763q;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m513p(int i) {
        int i4;
        Rect rect;
        int i8;
        int i9;
        ArrayList arrayList;
        boolean z7;
        boolean z8;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList2;
        C2866d c2866d;
        int i16;
        int i17;
        Rect rect2;
        int i18;
        View view;
        AbstractC2863a abstractC2863a;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f808j;
        int size = arrayList3.size();
        Rect rectM502g = m502g();
        Rect rectM502g2 = m502g();
        Rect rectM502g3 = m502g();
        int i19 = 0;
        while (true) {
            C1644d c1644d = f805G;
            if (i19 >= size) {
                Rect rect3 = rectM502g3;
                rectM502g.setEmpty();
                c1644d.mo285g(rectM502g);
                rectM502g2.setEmpty();
                c1644d.mo285g(rectM502g2);
                rect3.setEmpty();
                c1644d.mo285g(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i19);
            C2866d c2866d2 = (C2866d) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i9 = size;
                rect = rectM502g3;
                i4 = i19;
            } else {
                int i20 = 0;
                while (i20 < i19) {
                    if (c2866d2.f10583l == ((View) arrayList3.get(i20))) {
                        C2866d c2866d3 = (C2866d) view2.getLayoutParams();
                        if (c2866d3.f10582k != null) {
                            Rect rectM502g4 = m502g();
                            Rect rectM502g5 = m502g();
                            C2866d c2866d4 = c2866d2;
                            Rect rectM502g6 = m502g();
                            m510k(c2866d3.f10582k, rectM502g4);
                            m508i(view2, rectM502g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            c2866d = c2866d4;
                            i16 = i20;
                            layoutDirection = layoutDirection;
                            i18 = i19;
                            view = view3;
                            m503l(layoutDirection, rectM502g4, rectM502g6, c2866d3, measuredWidth, measuredHeight);
                            i17 = size;
                            rect2 = rectM502g3;
                            boolean z9 = (rectM502g6.left == rectM502g5.left && rectM502g6.top == rectM502g5.top) ? false : true;
                            m507h(c2866d3, rectM502g6, measuredWidth, measuredHeight);
                            int i21 = rectM502g6.left - rectM502g5.left;
                            int i22 = rectM502g6.top - rectM502g5.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC1828m0.f6911a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z9 && (abstractC2863a = c2866d3.f10572a) != null) {
                                abstractC2863a.mo1766d(this, view, c2866d3.f10582k);
                            }
                            rectM502g4.setEmpty();
                            c1644d.mo285g(rectM502g4);
                            rectM502g5.setEmpty();
                            c1644d.mo285g(rectM502g5);
                            rectM502g6.setEmpty();
                            c1644d.mo285g(rectM502g6);
                        } else {
                            arrayList2 = arrayList3;
                            c2866d = c2866d2;
                            i16 = i20;
                            i17 = size;
                            rect2 = rectM502g3;
                            i18 = i19;
                            view = view2;
                        }
                    }
                    i20 = i16 + 1;
                    c2866d2 = c2866d;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i17;
                    i19 = i18;
                    rectM502g3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                C2866d c2866d5 = c2866d2;
                int i23 = size;
                Rect rect4 = rectM502g3;
                i4 = i19;
                View view4 = view2;
                m508i(view4, rectM502g2, true);
                if (c2866d5.f10578g != 0 && !rectM502g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c2866d5.f10578g, layoutDirection);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        rectM502g.top = Math.max(rectM502g.top, rectM502g2.bottom);
                    } else if (i24 == 80) {
                        rectM502g.bottom = Math.max(rectM502g.bottom, getHeight() - rectM502g2.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rectM502g.left = Math.max(rectM502g.left, rectM502g2.right);
                    } else if (i25 == 5) {
                        rectM502g.right = Math.max(rectM502g.right, getWidth() - rectM502g2.left);
                    }
                }
                if (c2866d5.f10579h == 0 || view4.getVisibility() != 0) {
                    if (i != 2) {
                        rect = rect4;
                        rect.set(((C2866d) view4.getLayoutParams()).f10586o);
                        if (rect.equals(rectM502g2)) {
                            arrayList = arrayList4;
                            i9 = i23;
                        } else {
                            ((C2866d) view4.getLayoutParams()).f10586o.set(rectM502g2);
                        }
                    } else {
                        rect = rect4;
                    }
                    i8 = i4 + 1;
                    i9 = i23;
                    while (true) {
                        arrayList = arrayList4;
                        if (i8 < i9) {
                            View view5 = (View) arrayList.get(i8);
                            AbstractC2863a abstractC2863a2 = ((C2866d) view5.getLayoutParams()).f10572a;
                            if (abstractC2863a2 != null) {
                                abstractC2863a2.mo1765b(view5);
                            }
                            i8++;
                            arrayList4 = arrayList;
                        }
                    }
                } else {
                    WeakHashMap weakHashMap4 = AbstractC1828m0.f6911a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C2866d c2866d6 = (C2866d) view4.getLayoutParams();
                        AbstractC2863a abstractC2863a3 = c2866d6.f10572a;
                        Rect rectM502g7 = m502g();
                        Rect rectM502g8 = m502g();
                        rectM502g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC2863a3 == null || !abstractC2863a3.mo1878a(view4)) {
                            rectM502g7.set(rectM502g8);
                        } else if (!rectM502g8.contains(rectM502g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM502g7.toShortString() + " | Bounds:" + rectM502g8.toShortString());
                        }
                        rectM502g8.setEmpty();
                        c1644d.mo285g(rectM502g8);
                        if (rectM502g7.isEmpty()) {
                            rectM502g7.setEmpty();
                            c1644d.mo285g(rectM502g7);
                            if (i != 2) {
                            }
                            i8 = i4 + 1;
                            i9 = i23;
                            while (true) {
                                arrayList = arrayList4;
                                if (i8 < i9) {
                                    break;
                                }
                                i8++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c2866d6.f10579h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i14 = (rectM502g7.top - ((ViewGroup.MarginLayoutParams) c2866d6).topMargin) - c2866d6.f10581j) >= (i15 = rectM502g.top)) {
                                z7 = false;
                            } else {
                                m506v(view4, i15 - i14);
                                z7 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM502g7.bottom) - ((ViewGroup.MarginLayoutParams) c2866d6).bottomMargin) + c2866d6.f10581j) < (i13 = rectM502g.bottom)) {
                                m506v(view4, height - i13);
                                z7 = true;
                            }
                            if (!z7) {
                                m506v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i11 = (rectM502g7.left - ((ViewGroup.MarginLayoutParams) c2866d6).leftMargin) - c2866d6.f10580i) >= (i12 = rectM502g.left)) {
                                z8 = false;
                            } else {
                                m505u(view4, i12 - i11);
                                z8 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM502g7.right) - ((ViewGroup.MarginLayoutParams) c2866d6).rightMargin) + c2866d6.f10580i) < (i10 = rectM502g.right)) {
                                m505u(view4, width - i10);
                                z8 = true;
                            }
                            if (!z8) {
                                m505u(view4, 0);
                            }
                            rectM502g7.setEmpty();
                            c1644d.mo285g(rectM502g7);
                            if (i != 2) {
                            }
                            i8 = i4 + 1;
                            i9 = i23;
                            while (true) {
                                arrayList = arrayList4;
                                if (i8 < i9) {
                                }
                                i8++;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
            }
            i19 = i4 + 1;
            size = i9;
            rectM502g3 = rect;
            arrayList3 = arrayList;
        }
    }

    /* renamed from: q */
    public final void m514q(View view, int i) {
        Rect rectM502g;
        Rect rectM502g2;
        C2866d c2866d = (C2866d) view.getLayoutParams();
        View view2 = c2866d.f10582k;
        if (view2 == null && c2866d.f10577f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C1644d c1644d = f805G;
        if (view2 != null) {
            rectM502g = m502g();
            rectM502g2 = m502g();
            try {
                m510k(view2, rectM502g);
                C2866d c2866d2 = (C2866d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m503l(i, rectM502g, rectM502g2, c2866d2, measuredWidth, measuredHeight);
                m507h(c2866d2, rectM502g2, measuredWidth, measuredHeight);
                view.layout(rectM502g2.left, rectM502g2.top, rectM502g2.right, rectM502g2.bottom);
                return;
            } finally {
                rectM502g.setEmpty();
                c1644d.mo285g(rectM502g);
                rectM502g2.setEmpty();
                c1644d.mo285g(rectM502g2);
            }
        }
        int i4 = c2866d.f10576e;
        if (i4 < 0) {
            C2866d c2866d3 = (C2866d) view.getLayoutParams();
            rectM502g = m502g();
            rectM502g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2866d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2866d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2866d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2866d3).bottomMargin);
            if (this.f821w != null) {
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM502g.left = this.f821w.m3623b() + rectM502g.left;
                    rectM502g.top = this.f821w.m3625d() + rectM502g.top;
                    rectM502g.right -= this.f821w.m3624c();
                    rectM502g.bottom -= this.f821w.m3622a();
                }
            }
            rectM502g2 = m502g();
            int i8 = c2866d3.f10574c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM502g, rectM502g2, i);
            view.layout(rectM502g2.left, rectM502g2.top, rectM502g2.right, rectM502g2.bottom);
            return;
        }
        C2866d c2866d4 = (C2866d) view.getLayoutParams();
        int i9 = c2866d4.f10574c;
        if (i9 == 0) {
            i9 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i4 = width - i4;
        }
        int iM511m = m511m(i4) - measuredWidth2;
        if (i10 == 1) {
            iM511m += measuredWidth2 / 2;
        } else if (i10 == 5) {
            iM511m += measuredWidth2;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2866d4).leftMargin, Math.min(iM511m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c2866d4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2866d4).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c2866d4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* renamed from: r */
    public final boolean m515r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f810l;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        C2331d c2331d = f804F;
        if (c2331d != null) {
            Collections.sort(arrayList, c2331d);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1754f = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            AbstractC2863a abstractC2863a = ((C2866d) view.getLayoutParams()).f10572a;
            if (zMo1754f && actionMasked != 0) {
                if (abstractC2863a != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC2863a.mo1754f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC2863a.mo1763q(view, motionEventObtain);
                    }
                }
            } else if (!zMo1754f && abstractC2863a != null) {
                if (i == 0) {
                    zMo1754f = abstractC2863a.mo1754f(this, view, motionEvent);
                } else if (i == 1) {
                    zMo1754f = abstractC2863a.mo1763q(view, motionEvent);
                }
                if (zMo1754f) {
                    this.f817s = view;
                }
            }
        }
        arrayList.clear();
        return zMo1754f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        AbstractC2863a abstractC2863a = ((C2866d) view.getLayoutParams()).f10572a;
        if (abstractC2863a == null || !abstractC2863a.mo1767l(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (!z7 || this.f814p) {
            return;
        }
        m517t(false);
        this.f814p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m516s() {
        View viewFindViewById;
        ArrayList arrayList = this.f808j;
        arrayList.clear();
        C0022h c0022h = this.f809k;
        C2192k c2192k = (C2192k) c0022h.f79k;
        C1643c c1643c = (C1643c) c0022h.f78j;
        C2192k c2192k2 = (C2192k) c0022h.f79k;
        int i = c2192k.f7656l;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) c2192k.m3996j(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                c1643c.mo285g(arrayList2);
            }
        }
        c2192k.clear();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C2866d c2866dM504n = m504n(childAt);
            int i9 = c2866dM504n.f10577f;
            if (i9 == -1) {
                c2866dM504n.f10583l = null;
                c2866dM504n.f10582k = null;
            } else {
                View view = c2866dM504n.f10582k;
                if (view == null || view.getId() != i9) {
                    viewFindViewById = findViewById(i9);
                    c2866dM504n.f10582k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i9) + " to anchor view " + childAt);
                        }
                        c2866dM504n.f10583l = null;
                        c2866dM504n.f10582k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                c2866dM504n.f10583l = null;
                                c2866dM504n.f10582k = null;
                            }
                        }
                        c2866dM504n.f10583l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c2866dM504n.f10583l = null;
                        c2866dM504n.f10582k = null;
                    }
                } else {
                    View view2 = c2866dM504n.f10582k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c2866dM504n.f10583l = null;
                            c2866dM504n.f10582k = null;
                            viewFindViewById = findViewById(i9);
                            c2866dM504n.f10582k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c2866dM504n.f10583l = view2;
                }
            }
            if (!c2192k2.containsKey(childAt)) {
                c2192k2.put(childAt, null);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                if (i10 != i8) {
                    View childAt2 = getChildAt(i10);
                    if (childAt2 != c2866dM504n.f10583l) {
                        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C2866d) childAt2.getLayoutParams()).f10578g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c2866dM504n.f10579h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC2863a abstractC2863a = c2866dM504n.f10572a;
                            if (abstractC2863a != null) {
                                abstractC2863a.mo1765b(childAt);
                            }
                        } else {
                            if (!c2192k2.containsKey(childAt2) && !c2192k2.containsKey(childAt2)) {
                                c2192k2.put(childAt2, null);
                            }
                            if (!c2192k2.containsKey(childAt2) || !c2192k2.containsKey(childAt)) {
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                            ArrayList arrayList3 = (ArrayList) c2192k2.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) c1643c.acquire();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                c2192k2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) c0022h.f80l;
        arrayList4.clear();
        HashSet hashSet = (HashSet) c0022h.f81m;
        hashSet.clear();
        int i11 = c2192k2.f7656l;
        for (int i12 = 0; i12 < i11; i12++) {
            c0022h.m72b(c2192k2.m3992f(i12), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z7) {
        super.setFitsSystemWindows(z7);
        m518w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f824z = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f823y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f823y = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f823y.setState(getDrawableState());
                }
                Drawable drawable3 = this.f823y;
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f823y.setVisible(getVisibility() == 0, false);
                this.f823y.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z7 = i == 0;
        Drawable drawable = this.f823y;
        if (drawable == null || drawable.isVisible() == z7) {
            return;
        }
        this.f823y.setVisible(z7, false);
    }

    /* renamed from: t */
    public final void m517t(boolean z7) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC2863a abstractC2863a = ((C2866d) childAt.getLayoutParams()).f10572a;
            if (abstractC2863a != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z7) {
                    abstractC2863a.mo1754f(this, childAt, motionEventObtain);
                } else {
                    abstractC2863a.mo1763q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C2866d) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f817s = null;
        this.f814p = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f823y;
    }

    /* renamed from: w */
    public final void m518w() {
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if (!getFitsSystemWindows()) {
            AbstractC1804e0.m3538j(this, null);
            return;
        }
        if (this.f806A == null) {
            this.f806A = new C1629o((Object) this);
        }
        AbstractC1804e0.m3538j(this, this.f806A);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2866d ? new C2866d((C2866d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2866d((ViewGroup.MarginLayoutParams) layoutParams) : new C2866d(layoutParams);
    }
}
