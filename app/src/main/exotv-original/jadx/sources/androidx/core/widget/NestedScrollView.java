package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.media3.common.C0228p;
import com.bumptech.glide.AbstractC0715d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p017b6.C0600e0;
import p095l.C1629o;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.AbstractC1831n0;
import p105m0.AbstractC1857w;
import p105m0.AbstractC1860x;
import p105m0.C1815i;
import p105m0.C1824l;
import p105m0.C1845s;
import p105m0.C1862y;
import p105m0.InterfaceC1830n;
import p140q0.AbstractC2243c;
import p140q0.AbstractC2245e;
import p140q0.C2247g;
import p140q0.InterfaceC2246f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1830n {

    /* renamed from: L */
    public static final float f851L = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: M */
    public static final C0600e0 f852M = new C0600e0(4);

    /* renamed from: N */
    public static final int[] f853N = {R.attr.fillViewport};

    /* renamed from: A */
    public final int f854A;

    /* renamed from: B */
    public int f855B;

    /* renamed from: C */
    public final int[] f856C;

    /* renamed from: D */
    public final int[] f857D;

    /* renamed from: E */
    public int f858E;

    /* renamed from: F */
    public int f859F;

    /* renamed from: G */
    public C2247g f860G;

    /* renamed from: H */
    public final C0228p f861H;

    /* renamed from: I */
    public final C1824l f862I;

    /* renamed from: J */
    public float f863J;

    /* renamed from: K */
    public final C1815i f864K;

    /* renamed from: j */
    public final float f865j;

    /* renamed from: k */
    public long f866k;

    /* renamed from: l */
    public final Rect f867l;

    /* renamed from: m */
    public final OverScroller f868m;

    /* renamed from: n */
    public final EdgeEffect f869n;

    /* renamed from: o */
    public final EdgeEffect f870o;

    /* renamed from: p */
    public C1845s f871p;

    /* renamed from: q */
    public int f872q;

    /* renamed from: r */
    public boolean f873r;

    /* renamed from: s */
    public boolean f874s;

    /* renamed from: t */
    public View f875t;

    /* renamed from: u */
    public boolean f876u;

    /* renamed from: v */
    public VelocityTracker f877v;

    /* renamed from: w */
    public boolean f878w;

    /* renamed from: x */
    public boolean f879x;

    /* renamed from: y */
    public final int f880y;

    /* renamed from: z */
    public final int f881z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.exotv.net.R.attr.nestedScrollViewStyle);
        this.f867l = new Rect();
        this.f873r = true;
        this.f874s = false;
        this.f875t = null;
        this.f876u = false;
        this.f879x = true;
        this.f855B = -1;
        this.f856C = new int[2];
        this.f857D = new int[2];
        this.f864K = new C1815i(getContext(), new C1629o((Object) this));
        int i = Build.VERSION.SDK_INT;
        this.f869n = i >= 31 ? AbstractC2243c.m4015a(context, attributeSet) : new EdgeEffect(context);
        this.f870o = i >= 31 ? AbstractC2243c.m4015a(context, attributeSet) : new EdgeEffect(context);
        this.f865j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f868m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f880y = viewConfiguration.getScaledTouchSlop();
        this.f881z = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f854A = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f853N, com.exotv.net.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f861H = new C0228p();
        this.f862I = new C1824l(this);
        setNestedScrollingEnabled(true);
        AbstractC1828m0.m3608m(this, f852M);
    }

    private C1845s getScrollFeedbackProvider() {
        if (this.f871p == null) {
            this.f871p = new C1845s(this);
        }
        return this.f871p;
    }

    /* renamed from: l */
    public static boolean m526l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m526l((View) parent, nestedScrollView);
    }

    @Override // p105m0.InterfaceC1830n
    /* renamed from: a */
    public final void mo455a(View view, int i, int i4, int i8, int i9, int i10, int[] iArr) {
        m533n(i9, i10, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: b */
    public final void mo456b(View view, int i, int i4, int i8, int i9, int i10) {
        m533n(i9, i10, null);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: c */
    public final boolean mo457c(View view, View view2, int i, int i4) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i;
        if (this.f868m.isFinished()) {
            return;
        }
        this.f868m.computeScrollOffset();
        int currY = this.f868m.getCurrY();
        int i4 = currY - this.f859F;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f869n;
        EdgeEffect edgeEffect2 = this.f870o;
        if (i4 <= 0 || AbstractC0715d.m1541C(edgeEffect) == 0.0f) {
            if (i4 < 0 && AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                float f8 = height;
                iRound = Math.round(AbstractC0715d.m1553V(edgeEffect2, (i4 * 4.0f) / f8, 0.5f) * (f8 / 4.0f));
                if (iRound != i4) {
                    edgeEffect2.finish();
                }
            }
            int i8 = i4;
            this.f859F = currY;
            int[] iArr = this.f857D;
            iArr[1] = 0;
            this.f862I.m3586c(0, i8, 1, iArr, null);
            i = i8 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2245e.m4023a(this, Math.abs(this.f868m.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                m535p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i9 = i - scrollY2;
                iArr[1] = 0;
                this.f862I.m3587d(0, scrollY2, 0, i9, this.f856C, 1, iArr);
                i = i9 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f868m.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f868m.getCurrVelocity());
                    }
                }
                this.f868m.abortAnimation();
                m543x(1);
            }
            if (this.f868m.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m543x(1);
                return;
            }
        }
        iRound = Math.round(AbstractC0715d.m1553V(edgeEffect, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i4) {
            edgeEffect.finish();
        }
        i4 -= iRound;
        int i82 = i4;
        this.f859F = currY;
        int[] iArr2 = this.f857D;
        iArr2[1] = 0;
        this.f862I.m3586c(0, i82, 1, iArr2, null);
        i = i82 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f868m.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: d */
    public final void mo458d(View view, View view2, int i, int i4) {
        C0228p c0228p = this.f861H;
        if (i4 == 1) {
            c0228p.f1277b = i;
        } else {
            c0228p.f1276a = i;
        }
        m541v(2, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m529i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return this.f862I.m3584a(f8, f9, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f862I.m3585b(f8, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return this.f862I.m3586c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i8, int i9, int[] iArr) {
        return this.f862I.m3587d(i, i4, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f869n;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f870o;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: e */
    public final void mo459e(View view, int i) {
        C0228p c0228p = this.f861H;
        if (i == 1) {
            c0228p.f1277b = 0;
        } else {
            c0228p.f1276a = 0;
        }
        m543x(i);
    }

    @Override // p105m0.InterfaceC1827m
    /* renamed from: f */
    public final void mo460f(View view, int i, int i4, int[] iArr, int i8) {
        this.f862I.m3586c(i, i4, i8, iArr, null);
    }

    /* renamed from: g */
    public final boolean m527g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m532m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m538s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f867l;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m538s(m528h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m532m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0228p c0228p = this.f861H;
        return c0228p.f1277b | c0228p.f1276a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f863J == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f863J = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f863J;
    }

    /* renamed from: h */
    public final int m528h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i8 = rect.bottom;
        if (i8 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i8 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f862I.m3589f(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m529i(KeyEvent keyEvent) {
        this.f867l.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m531k(33) : m527g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m531k(130) : m527g(130);
                    }
                    if (keyCode == 62) {
                        m536q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m531k(33);
                    }
                    if (keyCode == 93) {
                        return m531k(130);
                    }
                    if (keyCode == 122) {
                        m536q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m536q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f862I.f6902d;
    }

    /* renamed from: j */
    public final void m530j(int i) {
        if (getChildCount() > 0) {
            this.f868m.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m541v(2, 1);
            this.f859F = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2245e.m4023a(this, Math.abs(this.f868m.getCurrVelocity()));
            }
        }
    }

    /* renamed from: k */
    public final boolean m531k(int i) {
        int childCount;
        boolean z7 = i == 130;
        int height = getHeight();
        Rect rect = this.f867l;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m537r(i, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m532m(View view, int i, int i4) {
        Rect rect = this.f867l;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i4, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m533n(int i, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f862I.m3587d(0, scrollY2, 0, i - scrollY2, null, i4, iArr);
    }

    /* renamed from: o */
    public final void m534o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f855B) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f872q = (int) motionEvent.getY(i);
            this.f855B = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f877v;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f874s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f8;
        int i;
        int width;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z7;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f9;
        long j;
        float f10;
        float fSqrt;
        int i8;
        NestedScrollView nestedScrollView3;
        float f11;
        if (motionEvent.getAction() != 8 || this.f876u) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i = 9;
            f8 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f8 = axisValue2;
            i = 26;
        } else {
            f8 = 0.0f;
            i = 0;
            width = 0;
        }
        if (f8 == 0.0f) {
            return false;
        }
        m538s(-((int) (getVerticalScrollFactorCompat() * f8)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            C1815i c1815i = this.f864K;
            NestedScrollView nestedScrollView4 = (NestedScrollView) c1815i.f6879b.f6229j;
            int[] iArr = c1815i.f6885h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i9 = 1;
            if (c1815i.f6883f == source && c1815i.f6884g == deviceId && c1815i.f6882e == i) {
                z7 = false;
                i4 = 0;
            } else {
                Context context = c1815i.f6878a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i4 = 0;
                int source2 = motionEvent.getSource();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    Method method = AbstractC1831n0.f6917a;
                    scaledMinimumFlingVelocity = AbstractC1857w.m3640f(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = AbstractC1831n0.f6917a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i10 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC1857w.m3639e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c1815i.f6883f = source;
                c1815i.f6884g = deviceId;
                c1815i.f6882e = i;
                z7 = true;
            }
            if (iArr[i4] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = c1815i.f6880c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                c1815i.f6880c = null;
                return true;
            }
            if (c1815i.f6880c == null) {
                c1815i.f6880c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = c1815i.f6880c;
            Map map = AbstractC1860x.f6956a;
            velocityTracker2.addMovement(motionEvent);
            int i11 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC1860x.f6956a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new C1862y());
                }
                C1862y c1862y = (C1862y) map2.get(velocityTracker2);
                long[] jArr = c1862y.f6958b;
                long eventTime = motionEvent.getEventTime();
                if (c1862y.f6960d != 0 && eventTime - jArr[c1862y.f6961e] > 40) {
                    c1862y.f6960d = i4;
                    c1862y.f6959c = 0.0f;
                }
                int i12 = (c1862y.f6961e + 1) % 20;
                c1862y.f6961e = i12;
                int i13 = c1862y.f6960d;
                if (i13 != 20) {
                    c1862y.f6960d = i13 + 1;
                }
                c1862y.f6957a[i12] = motionEvent.getAxisValue(26);
                jArr[c1862y.f6961e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C1862y c1862y2 = (C1862y) AbstractC1860x.f6956a.get(velocityTracker2);
            if (c1862y2 != null) {
                float[] fArr = c1862y2.f6957a;
                long[] jArr2 = c1862y2.f6958b;
                int i14 = c1862y2.f6960d;
                if (i14 < 2) {
                    nestedScrollView = nestedScrollView4;
                    f10 = Float.MAX_VALUE;
                    i8 = 1000;
                    fSqrt = 0.0f;
                    f11 = fSqrt * i8;
                    c1862y2.f6959c = f11;
                    if (f11 >= (-Math.abs(f10))) {
                        c1862y2.f6959c = -Math.abs(f10);
                    } else if (c1862y2.f6959c > Math.abs(f10)) {
                        c1862y2.f6959c = Math.abs(f10);
                    }
                } else {
                    int i15 = c1862y2.f6961e;
                    int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                    long j8 = jArr2[i15];
                    while (true) {
                        j = jArr2[i16];
                        if (j8 - j <= 100) {
                            break;
                        }
                        c1862y2.f6960d--;
                        i16 = (i16 + 1) % 20;
                    }
                    int i17 = c1862y2.f6960d;
                    if (i17 >= 2) {
                        if (i17 == 2) {
                            int i18 = (i16 + 1) % 20;
                            if (j != jArr2[i18]) {
                                nestedScrollView = nestedScrollView4;
                                f10 = Float.MAX_VALUE;
                                i8 = 1000;
                                fSqrt = fArr[i18] / (r12 - j);
                            }
                        } else {
                            f10 = Float.MAX_VALUE;
                            float f12 = 0.0f;
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 >= c1862y2.f6960d - 1) {
                                    break;
                                }
                                int i21 = i19 + i16;
                                long j9 = jArr2[i21 % 20];
                                int i22 = (i21 + 1) % i11;
                                if (jArr2[i22] == j9) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i20++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float fSqrt2 = (f12 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                    float f13 = fArr[i22] / (jArr2[i22] - j9);
                                    float fAbs = (Math.abs(f13) * (f13 - fSqrt2)) + f12;
                                    if (i20 == i9) {
                                        fAbs *= 0.5f;
                                    }
                                    f12 = fAbs;
                                }
                                i19++;
                                nestedScrollView4 = nestedScrollView3;
                                i11 = 20;
                                i9 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            fSqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < 0.0f ? -1.0f : 1.0f);
                            i8 = 1000;
                        }
                        f11 = fSqrt * i8;
                        c1862y2.f6959c = f11;
                        if (f11 >= (-Math.abs(f10))) {
                        }
                    }
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC1857w.m3636b(velocityTracker2, i);
            } else if (i == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                C1862y c1862y3 = (C1862y) AbstractC1860x.f6956a.get(velocityTracker2);
                yVelocity = (c1862y3 == null || i != 26) ? 0.0f : c1862y3.f6959c;
            }
            float f14 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f14);
            if (z7 || !(fSignum == Math.signum(c1815i.f6881d) || fSignum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f868m.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f14) >= iArr[0]) {
                float fMax = Math.max(-r2, Math.min(f14, iArr[1]));
                if (fMax == 0.0f) {
                    f9 = 0.0f;
                } else {
                    nestedScrollView2.f868m.abortAnimation();
                    nestedScrollView2.m530j((int) fMax);
                    f9 = fMax;
                }
                c1815i.f6881d = f9;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f876u) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y4 = (int) motionEvent.getY();
            int x6 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 < childAt.getTop() - scrollY || y4 >= childAt.getBottom() - scrollY || x6 < childAt.getLeft() || x6 >= childAt.getRight()) {
                    if (!m542w(motionEvent) && this.f868m.isFinished()) {
                        z7 = false;
                    }
                    this.f876u = z7;
                    VelocityTracker velocityTracker = this.f877v;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f877v = null;
                    }
                } else {
                    this.f872q = y4;
                    this.f855B = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f877v;
                    if (velocityTracker2 == null) {
                        this.f877v = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f877v.addMovement(motionEvent);
                    this.f868m.computeScrollOffset();
                    if (!m542w(motionEvent) && this.f868m.isFinished()) {
                        z7 = false;
                    }
                    this.f876u = z7;
                    m541v(2, 0);
                }
            }
        } else if (i == 1) {
            this.f876u = false;
            this.f855B = -1;
            VelocityTracker velocityTracker3 = this.f877v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f877v = null;
            }
            if (this.f868m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m543x(0);
        } else if (i == 2) {
            int i4 = this.f855B;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y7 - this.f872q) > this.f880y && (2 & getNestedScrollAxes()) == 0) {
                        this.f876u = true;
                        this.f872q = y7;
                        if (this.f877v == null) {
                            this.f877v = VelocityTracker.obtain();
                        }
                        this.f877v.addMovement(motionEvent);
                        this.f858E = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m534o(motionEvent);
            }
        }
        return this.f876u;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int measuredHeight;
        super.onLayout(z7, i, i4, i8, i9);
        int i10 = 0;
        this.f873r = false;
        View view = this.f875t;
        if (view != null && m526l(view, this)) {
            View view2 = this.f875t;
            Rect rect = this.f867l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM528h = m528h(rect);
            if (iM528h != 0) {
                scrollBy(0, iM528h);
            }
        }
        this.f875t = null;
        if (!this.f874s) {
            if (this.f860G != null) {
                scrollTo(getScrollX(), this.f860G.f7798j);
                this.f860G = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i9 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i10 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f874s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f878w && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        m530j((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return this.f862I.m3585b(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        this.f862I.m3586c(i, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i8, int i9) {
        m533n(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo458d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i4, boolean z7, boolean z8) {
        super.scrollTo(i, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m532m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2247g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2247g c2247g = (C2247g) parcelable;
        super.onRestoreInstanceState(c2247g.getSuperState());
        this.f860G = c2247g;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2247g c2247g = new C2247g(super.onSaveInstanceState());
        c2247g.f7798j = getScrollY();
        return c2247g;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i8, int i9) {
        super.onScrollChanged(i, i4, i8, i9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i8, int i9) {
        super.onSizeChanged(i, i4, i8, i9);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m532m(viewFindFocus, 0, i9)) {
            return;
        }
        Rect rect = this.f867l;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM528h = m528h(rect);
        if (iM528h != 0) {
            if (this.f879x) {
                m540u(0, iM528h, false);
            } else {
                scrollBy(0, iM528h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo457c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo459e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM1553V;
        int iRound;
        int i;
        ViewParent parent2;
        if (this.f877v == null) {
            this.f877v = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f858E = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f8 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f858E);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f869n;
            EdgeEffect edgeEffect2 = this.f870o;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f877v;
                velocityTracker.computeCurrentVelocity(1000, this.f854A);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f855B);
                if (Math.abs(yVelocity) >= this.f881z) {
                    if (AbstractC0715d.m1541C(edgeEffect) != 0.0f) {
                        if (m539t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m530j(-yVelocity);
                        }
                    } else if (AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (m539t(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            m530j(i4);
                        }
                    } else {
                        int i8 = -yVelocity;
                        float f9 = i8;
                        if (!this.f862I.m3585b(0.0f, f9)) {
                            dispatchNestedFling(0.0f, f9, true);
                            m530j(i8);
                        }
                    }
                } else if (this.f868m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f855B = -1;
                this.f876u = false;
                VelocityTracker velocityTracker2 = this.f877v;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f877v = null;
                }
                m543x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f855B);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f855B + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    int i9 = this.f872q - y4;
                    float x6 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i9 / getHeight();
                    if (AbstractC0715d.m1541C(edgeEffect) != 0.0f) {
                        fM1553V = -AbstractC0715d.m1553V(edgeEffect, -height, x6);
                        if (AbstractC0715d.m1541C(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (AbstractC0715d.m1541C(edgeEffect2) != 0.0f) {
                            fM1553V = AbstractC0715d.m1553V(edgeEffect2, height, 1.0f - x6);
                            if (AbstractC0715d.m1541C(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        iRound = Math.round(f8 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i9 - iRound;
                        if (!this.f876u && Math.abs(i) > this.f880y) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f876u = true;
                            i = i <= 0 ? i - this.f880y : i + this.f880y;
                        }
                        if (this.f876u) {
                            int iM538s = m538s(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f872q = y4 - iM538s;
                            this.f858E += iM538s;
                        }
                    }
                    f8 = fM1553V;
                    iRound = Math.round(f8 * getHeight());
                    if (iRound != 0) {
                    }
                    i = i9 - iRound;
                    if (!this.f876u) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f876u = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.f876u) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f876u && getChildCount() > 0) {
                    if (this.f868m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f855B = -1;
                this.f876u = false;
                VelocityTracker velocityTracker3 = this.f877v;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f877v = null;
                }
                m543x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f872q = (int) motionEvent.getY(actionIndex);
                this.f855B = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m534o(motionEvent);
                this.f872q = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f855B));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f876u && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f868m.isFinished()) {
                this.f868m.abortAnimation();
                m543x(1);
            }
            int y7 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f872q = y7;
            this.f855B = pointerId;
            m541v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f877v;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m535p(int i, int i4, int i8, int i9) {
        int i10;
        boolean z7;
        int i11;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i12 = i8 + i;
        if (i4 <= 0 && i4 >= 0) {
            i10 = i4;
            z7 = false;
        } else {
            i10 = 0;
            z7 = true;
        }
        if (i12 > i9) {
            i11 = i9;
        } else {
            if (i12 >= 0) {
                i11 = i12;
                z8 = false;
                if (z8 && !this.f862I.m3589f(1)) {
                    this.f868m.springBack(i10, i11, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i11);
                return !z7 || z8;
            }
            i11 = 0;
        }
        z8 = true;
        if (z8) {
            this.f868m.springBack(i10, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i11);
        if (z7) {
        }
    }

    /* renamed from: q */
    public final void m536q(int i) {
        boolean z7 = i == 130;
        int height = getHeight();
        Rect rect = this.f867l;
        if (z7) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i8 = height + i4;
        rect.bottom = i8;
        m537r(i, i4, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m537r(int i, int i4, int i8) {
        boolean z7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        boolean z8 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i8) {
                boolean z10 = i4 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z9 = z10;
                } else {
                    boolean z11 = (z8 && top < view.getTop()) || (!z8 && bottom > view.getBottom());
                    if (z9) {
                        if (z10 && z11) {
                            view = view2;
                        }
                    } else if (z10) {
                        view = view2;
                        z9 = true;
                    } else if (z11) {
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i4 < scrollY || i8 > i9) {
            m538s(z8 ? i4 - scrollY : i8 - i9, -1, null, 0, 1, true);
            z7 = true;
        } else {
            z7 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f873r) {
            this.f875t = view2;
        } else {
            Rect rect = this.f867l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM528h = m528h(rect);
            if (iM528h != 0) {
                scrollBy(0, iM528h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM528h = m528h(rect);
        boolean z8 = iM528h != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, iM528h);
                return z8;
            }
            m540u(0, iM528h, false);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        VelocityTracker velocityTracker;
        if (z7 && (velocityTracker = this.f877v) != null) {
            velocityTracker.recycle();
            this.f877v = null;
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f873r = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m538s(int i, int i4, MotionEvent motionEvent, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            m541v(2, i9);
        }
        boolean zM3586c = this.f862I.m3586c(0, i, i9, this.f857D, this.f856C);
        int[] iArr = this.f856C;
        int[] iArr2 = this.f857D;
        if (zM3586c) {
            i10 = i - iArr2[1];
            i11 = iArr[1];
        } else {
            i10 = i;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z10 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z7;
        boolean z11 = m535p(i10, 0, scrollY, scrollRange) && !this.f862I.m3589f(i9);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f6935a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        iArr2[1] = 0;
        this.f862I.m3587d(0, scrollY2, 0, i10 - scrollY2, this.f856C, i9, iArr2);
        int i12 = i11 + iArr[1];
        int i13 = i10 - iArr2[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f870o;
        EdgeEffect edgeEffect2 = this.f869n;
        if (i14 >= 0) {
            if (i14 > scrollRange && z10) {
                AbstractC0715d.m1553V(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
                if (motionEvent != null) {
                    z8 = false;
                    getScrollFeedbackProvider().f6935a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                } else {
                    z8 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z9 = z8;
            } else {
                z9 = z11;
            }
            if (z9 && i9 == 0 && (velocityTracker = this.f877v) != null) {
                velocityTracker.clear();
            }
            if (i9 == 1) {
                m543x(i9);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i12;
        }
        if (z10) {
            AbstractC0715d.m1553V(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f6935a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z8 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z9 = z8;
        }
        if (z9) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
        }
        return i12;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i4);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f878w) {
            this.f878w = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C1824l c1824l = this.f862I;
        if (c1824l.f6902d) {
            ViewGroup viewGroup = c1824l.f6901c;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            AbstractC1804e0.m3539k(viewGroup);
        }
        c1824l.f6902d = z7;
    }

    public void setOnScrollChangeListener(InterfaceC2246f interfaceC2246f) {
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f879x = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f862I.m3590g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m543x(0);
    }

    /* renamed from: t */
    public final boolean m539t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM1541C = AbstractC0715d.m1541C(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f8 = this.f865j * 0.015f;
        double dLog = Math.log(fAbs / f8);
        double d8 = f851L;
        return ((float) (Math.exp((d8 / (d8 - 1.0d)) * dLog) * ((double) f8))) < fM1541C;
    }

    /* renamed from: u */
    public final void m540u(int i, int i4, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f866k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f868m.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z7) {
                m541v(2, 1);
            } else {
                m543x(1);
            }
            this.f859F = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f868m.isFinished()) {
                this.f868m.abortAnimation();
                m543x(1);
            }
            scrollBy(i, i4);
        }
        this.f866k = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final void m541v(int i, int i4) {
        this.f862I.m3590g(2, i4);
    }

    /* renamed from: w */
    public final boolean m542w(MotionEvent motionEvent) {
        boolean z7;
        EdgeEffect edgeEffect = this.f869n;
        if (AbstractC0715d.m1541C(edgeEffect) != 0.0f) {
            AbstractC0715d.m1553V(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f870o;
        if (AbstractC0715d.m1541C(edgeEffect2) == 0.0f) {
            return z7;
        }
        AbstractC0715d.m1553V(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: x */
    public final void m543x(int i) {
        this.f862I.m3591h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
