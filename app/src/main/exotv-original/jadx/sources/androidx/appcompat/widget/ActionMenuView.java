package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p090k2.C1584b;
import p095l.C1629o;
import p095l.C1630p;
import p095l.InterfaceC1612b0;
import p095l.InterfaceC1626l;
import p095l.MenuC1627m;
import p104m.AbstractC1750n1;
import p104m.AbstractC1763q2;
import p104m.C1719f2;
import p104m.C1720g;
import p104m.C1732j;
import p104m.C1736k;
import p104m.C1744m;
import p104m.C1746m1;
import p104m.InterfaceC1740l;
import p104m.InterfaceC1748n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1750n1 implements InterfaceC1626l, InterfaceC1612b0 {

    /* renamed from: A */
    public int f710A;

    /* renamed from: B */
    public boolean f711B;

    /* renamed from: C */
    public C1736k f712C;

    /* renamed from: D */
    public C1719f2 f713D;

    /* renamed from: E */
    public boolean f714E;

    /* renamed from: F */
    public int f715F;

    /* renamed from: G */
    public final int f716G;

    /* renamed from: H */
    public final int f717H;

    /* renamed from: I */
    public InterfaceC1748n f718I;

    /* renamed from: y */
    public MenuC1627m f719y;

    /* renamed from: z */
    public Context f720z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f716G = (int) (56.0f * f8);
        this.f717H = (int) (f8 * 4.0f);
        this.f720z = context;
        this.f710A = 0;
    }

    /* renamed from: j */
    public static C1744m m466j() {
        C1744m c1744m = new C1744m(-2, -2);
        c1744m.f6641a = false;
        ((LinearLayout.LayoutParams) c1744m).gravity = 16;
        return c1744m;
    }

    /* renamed from: k */
    public static C1744m m467k(ViewGroup.LayoutParams layoutParams) {
        C1744m c1744m;
        if (layoutParams == null) {
            return m466j();
        }
        if (layoutParams instanceof C1744m) {
            C1744m c1744m2 = (C1744m) layoutParams;
            c1744m = new C1744m(c1744m2);
            c1744m.f6641a = c1744m2.f6641a;
        } else {
            c1744m = new C1744m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1744m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1744m).gravity = 16;
        }
        return c1744m;
    }

    @Override // p095l.InterfaceC1626l
    /* renamed from: a */
    public final boolean mo441a(C1630p c1630p) {
        return this.f719y.m3314q(c1630p, null, 0);
    }

    @Override // p095l.InterfaceC1612b0
    /* renamed from: c */
    public final void mo442c(MenuC1627m menuC1627m) {
        this.f719y = menuC1627m;
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1744m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p104m.AbstractC1750n1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1746m1 generateDefaultLayoutParams() {
        return m466j();
    }

    @Override // p104m.AbstractC1750n1
    /* renamed from: g */
    public final C1746m1 generateLayoutParams(AttributeSet attributeSet) {
        return new C1744m(getContext(), attributeSet);
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m466j();
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m467k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f719y == null) {
            Context context = getContext();
            MenuC1627m menuC1627m = new MenuC1627m(context);
            this.f719y = menuC1627m;
            menuC1627m.f6213n = new C1629o((Object) this);
            C1736k c1736k = new C1736k(context);
            this.f712C = c1736k;
            c1736k.f6601u = true;
            c1736k.f6602v = true;
            c1736k.f6594n = new C1584b(4);
            this.f719y.m3307b(c1736k, this.f720z);
            C1736k c1736k2 = this.f712C;
            c1736k2.f6597q = this;
            this.f719y = c1736k2.f6592l;
        }
        return this.f719y;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1736k c1736k = this.f712C;
        C1732j c1732j = c1736k.f6598r;
        if (c1732j != null) {
            return c1732j.getDrawable();
        }
        if (c1736k.f6600t) {
            return c1736k.f6599s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f710A;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p104m.AbstractC1750n1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1746m1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m467k(layoutParams);
    }

    /* renamed from: l */
    public final boolean m471l(int i) {
        boolean zMo436a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1740l)) {
            zMo436a = ((InterfaceC1740l) childAt).mo436a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1740l)) ? zMo436a : ((InterfaceC1740l) childAt2).mo438c() | zMo436a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1736k c1736k = this.f712C;
        if (c1736k != null) {
            c1736k.mo3279e();
            if (this.f712C.m3416h()) {
                this.f712C.m3415f();
                this.f712C.m3417l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1736k c1736k = this.f712C;
        if (c1736k != null) {
            c1736k.m3415f();
            C1720g c1720g = c1736k.f6586C;
            if (c1720g == null || !c1720g.m3339b()) {
                return;
            }
            c1720g.f6279j.dismiss();
        }
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int width;
        int paddingLeft;
        if (!this.f714E) {
            super.onLayout(z7, i, i4, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i9 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i8 - i;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean z8 = AbstractC1763q2.f6715a;
        boolean z9 = getLayoutDirection() == 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C1744m c1744m = (C1744m) childAt.getLayoutParams();
                if (c1744m.f6641a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m471l(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z9) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1744m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1744m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1744m).leftMargin) + ((LinearLayout.LayoutParams) c1744m).rightMargin;
                    m471l(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int iMax = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (z9) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C1744m c1744m2 = (C1744m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1744m2.f6641a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) c1744m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1744m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            C1744m c1744m3 = (C1744m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1744m3.f6641a) {
                int i23 = paddingLeft2 + ((LinearLayout.LayoutParams) c1744m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1744m3).rightMargin + iMax + i23;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p104m.AbstractC1750n1, android.view.View
    public final void onMeasure(int i, int i4) {
        int i8;
        int i9;
        ?? r11;
        int i10;
        int i11;
        MenuC1627m menuC1627m;
        boolean z7 = this.f714E;
        boolean z8 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f714E = z8;
        if (z7 != z8) {
            this.f715F = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f714E && (menuC1627m = this.f719y) != null && size != this.f715F) {
            this.f715F = size;
            menuC1627m.m3313p(true);
        }
        int childCount = getChildCount();
        if (!this.f714E || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C1744m c1744m = (C1744m) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) c1744m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1744m).leftMargin = 0;
            }
            super.onMeasure(i, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f716G;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        boolean z9 = false;
        int i20 = 0;
        long j = 0;
        while (true) {
            i8 = this.f717H;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i10 = i17;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z10) {
                    childAt.setPadding(i8, 0, i8, 0);
                }
                C1744m c1744m2 = (C1744m) childAt.getLayoutParams();
                c1744m2.f6646f = false;
                c1744m2.f6643c = 0;
                c1744m2.f6642b = 0;
                c1744m2.f6644d = false;
                ((LinearLayout.LayoutParams) c1744m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1744m2).rightMargin = 0;
                c1744m2.f6645e = z10 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c1744m2.f6641a ? 1 : i15;
                C1744m c1744m3 = (C1744m) childAt.getLayoutParams();
                int i24 = i15;
                i10 = i17;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z10 ? (ActionMenuItemView) childAt : null;
                boolean z11 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z12 = z11;
                if (i23 <= 0 || (z11 && i23 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i23, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i11++;
                    }
                    if (z12 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c1744m3.f6644d = !c1744m3.f6641a && z12;
                c1744m3.f6642b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i11);
                if (c1744m2.f6644d) {
                    i20++;
                }
                if (c1744m2.f6641a) {
                    z9 = true;
                }
                i15 = i24 - i11;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j |= 1 << i19;
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i17 = i10;
        }
        int i25 = size3;
        int i26 = i15;
        int i27 = i17;
        boolean z13 = z9 && i18 == 2;
        int i28 = i26;
        boolean z14 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j8 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                int i32 = iMax;
                C1744m c1744m4 = (C1744m) getChildAt(i31).getLayoutParams();
                boolean z15 = z13;
                if (c1744m4.f6644d) {
                    int i33 = c1744m4.f6642b;
                    if (i33 < i29) {
                        j8 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j8 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z13 = z15;
                iMax = i32;
            }
            i9 = iMax;
            boolean z16 = z13;
            j |= j8;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C1744m c1744m5 = (C1744m) childAt2.getLayoutParams();
                boolean z17 = z9;
                long j9 = 1 << i35;
                if ((j8 & j9) != 0) {
                    if (z16 && c1744m5.f6645e) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i8 + i27, 0, i8, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1744m5.f6642b += r11;
                    c1744m5.f6646f = r11;
                    i28--;
                } else if (c1744m5.f6642b == i34) {
                    j |= j9;
                }
                i35++;
                z9 = z17;
            }
            z13 = z16;
            iMax = i9;
            z14 = true;
        }
        i9 = iMax;
        boolean z18 = !z9 && i18 == 1;
        if (i28 > 0 && j != 0 && (i28 < i18 - 1 || z18 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z18) {
                if ((j & 1) != 0 && !((C1744m) getChildAt(0).getLayoutParams()).f6645e) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & (1 << i36)) != 0 && !((C1744m) getChildAt(i36).getLayoutParams()).f6645e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i28 * i27) / fBitCount) : 0;
            boolean z19 = z14;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    C1744m c1744m6 = (C1744m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1744m6.f6643c = i37;
                        c1744m6.f6646f = true;
                        if (i38 == 0 && !c1744m6.f6645e) {
                            ((LinearLayout.LayoutParams) c1744m6).leftMargin = (-i37) / 2;
                        }
                        z19 = true;
                    } else if (c1744m6.f6641a) {
                        c1744m6.f6643c = i37;
                        c1744m6.f6646f = true;
                        ((LinearLayout.LayoutParams) c1744m6).rightMargin = (-i37) / 2;
                        z19 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c1744m6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1744m6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z14 = z19;
        }
        if (z14) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C1744m c1744m7 = (C1744m) childAt4.getLayoutParams();
                if (c1744m7.f6646f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1744m7.f6642b * i27) + c1744m7.f6643c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, mode != 1073741824 ? i9 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f712C.f6606z = z7;
    }

    public void setOnMenuItemClickListener(InterfaceC1748n interfaceC1748n) {
        this.f718I = interfaceC1748n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1736k c1736k = this.f712C;
        C1732j c1732j = c1736k.f6598r;
        if (c1732j != null) {
            c1732j.setImageDrawable(drawable);
        } else {
            c1736k.f6600t = true;
            c1736k.f6599s = drawable;
        }
    }

    public void setOverflowReserved(boolean z7) {
        this.f711B = z7;
    }

    public void setPopupTheme(int i) {
        if (this.f710A != i) {
            this.f710A = i;
            if (i == 0) {
                this.f720z = getContext();
            } else {
                this.f720z = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1736k c1736k) {
        this.f712C = c1736k;
        c1736k.f6597q = this;
        this.f719y = c1736k.f6592l;
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1744m(getContext(), attributeSet);
    }
}
