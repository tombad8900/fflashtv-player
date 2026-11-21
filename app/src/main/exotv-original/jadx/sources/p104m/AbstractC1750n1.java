package p104m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC1750n1 extends ViewGroup {

    /* renamed from: j */
    public boolean f6658j;

    /* renamed from: k */
    public int f6659k;

    /* renamed from: l */
    public int f6660l;

    /* renamed from: m */
    public int f6661m;

    /* renamed from: n */
    public int f6662n;

    /* renamed from: o */
    public int f6663o;

    /* renamed from: p */
    public float f6664p;

    /* renamed from: q */
    public boolean f6665q;

    /* renamed from: r */
    public int[] f6666r;

    /* renamed from: s */
    public int[] f6667s;

    /* renamed from: t */
    public Drawable f6668t;

    /* renamed from: u */
    public int f6669u;

    /* renamed from: v */
    public int f6670v;

    /* renamed from: w */
    public int f6671w;

    /* renamed from: x */
    public int f6672x;

    public AbstractC1750n1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f6658j = true;
        this.f6659k = -1;
        this.f6660l = 0;
        this.f6662n = 8388659;
        int[] iArr = AbstractC1026a.f4321n;
        C0073c c0073cM263F = C0073c.m263F(0, 0, context, attributeSet, iArr);
        AbstractC1828m0.m3607l(this, context, iArr, attributeSet, (TypedArray) c0073cM263F.f325l, 0);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i8 = typedArray.getInt(0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean z7 = typedArray.getBoolean(2, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.f6664p = typedArray.getFloat(4, -1.0f);
        this.f6659k = typedArray.getInt(3, -1);
        this.f6665q = typedArray.getBoolean(7, false);
        setDividerDrawable(c0073cM263F.m299x(5));
        this.f6671w = typedArray.getInt(8, 0);
        this.f6672x = typedArray.getDimensionPixelSize(6, 0);
        c0073cM263F.m275I();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1746m1;
    }

    /* renamed from: d */
    public final void m3424d(Canvas canvas, int i) {
        this.f6668t.setBounds(getPaddingLeft() + this.f6672x, i, (getWidth() - getPaddingRight()) - this.f6672x, this.f6670v + i);
        this.f6668t.draw(canvas);
    }

    /* renamed from: e */
    public final void m3425e(Canvas canvas, int i) {
        this.f6668t.setBounds(i, getPaddingTop() + this.f6672x, this.f6669u + i, (getHeight() - getPaddingBottom()) - this.f6672x);
        this.f6668t.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1746m1 generateDefaultLayoutParams() {
        int i = this.f6661m;
        if (i == 0) {
            return new C1746m1(-2, -2);
        }
        if (i == 1) {
            return new C1746m1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1746m1 generateLayoutParams(AttributeSet attributeSet) {
        return new C1746m1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f6659k < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f6659k;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6659k == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f6660l;
        if (this.f6661m == 1 && (i = this.f6662n & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6663o) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6663o;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1746m1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6659k;
    }

    public Drawable getDividerDrawable() {
        return this.f6668t;
    }

    public int getDividerPadding() {
        return this.f6672x;
    }

    public int getDividerWidth() {
        return this.f6669u;
    }

    public int getGravity() {
        return this.f6662n;
    }

    public int getOrientation() {
        return this.f6661m;
    }

    public int getShowDividers() {
        return this.f6671w;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6664p;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1746m1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1746m1 ? new C1746m1((C1746m1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1746m1((ViewGroup.MarginLayoutParams) layoutParams) : new C1746m1(layoutParams);
    }

    /* renamed from: i */
    public final boolean m3426i(int i) {
        if (i == 0) {
            return (this.f6671w & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f6671w & 4) != 0;
        }
        if ((this.f6671w & 2) != 0) {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f6668t == null) {
            return;
        }
        int i4 = 0;
        if (this.f6661m == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && m3426i(i4)) {
                    m3424d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1746m1) childAt.getLayoutParams())).topMargin) - this.f6670v);
                }
                i4++;
            }
            if (m3426i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m3424d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f6670v : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1746m1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z7 = AbstractC1763q2.f6715a;
        boolean z8 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m3426i(i4)) {
                C1746m1 c1746m1 = (C1746m1) childAt3.getLayoutParams();
                m3425e(canvas, z8 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1746m1).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1746m1).leftMargin) - this.f6669u);
            }
            i4++;
        }
        if (m3426i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1746m1 c1746m12 = (C1746m1) childAt4.getLayoutParams();
                if (z8) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1746m12).leftMargin;
                    i = this.f6669u;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1746m12).rightMargin;
                }
            } else if (z8) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f6669u;
                right = left - i;
            }
            m3425e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        char c8;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c9 = 2;
        if (this.f6661m == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i8 - i;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f6662n;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i9) - i4) - this.f6663o : getPaddingTop() + (((i9 - i4) - this.f6663o) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c8 = c9;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1746m1 c1746m1 = (C1746m1) childAt.getLayoutParams();
                    c8 = c9;
                    int i26 = ((LinearLayout.LayoutParams) c1746m1).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1746m1).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) c1746m1).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) c1746m1).leftMargin + paddingLeft;
                        if (m3426i(i25)) {
                            paddingTop += this.f6670v;
                        }
                        int i27 = paddingTop + ((LinearLayout.LayoutParams) c1746m1).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1746m1).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) c1746m1).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (m3426i(i25)) {
                    }
                    int i272 = paddingTop + ((LinearLayout.LayoutParams) c1746m1).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1746m1).bottomMargin + i272;
                }
                i25++;
                c9 = c8;
                i20 = 8;
            }
            return;
        }
        boolean z8 = AbstractC1763q2.f6715a;
        boolean z9 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i9 - i4;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f6662n;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z10 = this.f6658j;
        int[] iArr = this.f6666r;
        int[] iArr2 = this.f6667s;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i8) - i) - this.f6663o : getPaddingLeft() + (((i8 - i) - this.f6663o) / 2);
        if (z9) {
            i11 = virtualChildCount2 - 1;
            i10 = -1;
        } else {
            i10 = 1;
            i11 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i10 * i32) + i11;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C1746m1 c1746m12 = (C1746m1) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z10) {
                        i13 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c1746m12).height != -1 ? childAt2.getBaseline() : -1;
                        i14 = ((LinearLayout.LayoutParams) c1746m12).gravity;
                        if (i14 < 0) {
                            i14 = i31;
                        }
                        i15 = i14 & 112;
                        if (i15 == 16) {
                            if (i15 == 48) {
                                i16 = i13 + ((LinearLayout.LayoutParams) c1746m12).topMargin;
                                if (baseline != -1) {
                                    i16 = (iArr[1] - baseline) + i16;
                                }
                            } else if (i15 != 80) {
                                i16 = i13;
                            } else {
                                i16 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1746m12).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i35 = (m3426i(i33) ? i34 + this.f6669u : i34) + ((LinearLayout.LayoutParams) c1746m12).leftMargin;
                            childAt2.layout(i35, i16, i35 + measuredWidth2, i16 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1746m12).rightMargin + i35;
                            i32++;
                            i11 = i12;
                            paddingTop2 = i13;
                        } else {
                            i16 = ((paddingBottom2 - measuredHeight3) / 2) + i13 + ((LinearLayout.LayoutParams) c1746m12).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c1746m12).bottomMargin;
                        }
                        i16 -= measuredHeight;
                        int i352 = (m3426i(i33) ? i34 + this.f6669u : i34) + ((LinearLayout.LayoutParams) c1746m12).leftMargin;
                        childAt2.layout(i352, i16, i352 + measuredWidth2, i16 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1746m12).rightMargin + i352;
                        i32++;
                        i11 = i12;
                        paddingTop2 = i13;
                    } else {
                        i13 = paddingTop2;
                    }
                    i14 = ((LinearLayout.LayoutParams) c1746m12).gravity;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    if (i15 == 16) {
                    }
                    i16 -= measuredHeight;
                    int i3522 = (m3426i(i33) ? i34 + this.f6669u : i34) + ((LinearLayout.LayoutParams) c1746m12).leftMargin;
                    childAt2.layout(i3522, i16, i3522 + measuredWidth2, i16 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1746m12).rightMargin + i3522;
                    i32++;
                    i11 = i12;
                    paddingTop2 = i13;
                }
            }
            i13 = paddingTop2;
            i32++;
            i11 = i12;
            paddingTop2 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i4) {
        int i8;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int baseline;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        boolean z7;
        boolean z8;
        C1746m1 c1746m1;
        int i17;
        int[] iArr2;
        int i18;
        View view;
        int i19;
        boolean z9;
        boolean z10;
        int iMax2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z11;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z12;
        AbstractC1750n1 abstractC1750n1 = this;
        int i31 = -2;
        int iMax3 = 0;
        int i32 = 1073741824;
        int i33 = 8;
        if (abstractC1750n1.f6661m == 1) {
            abstractC1750n1.f6663o = 0;
            int virtualChildCount = abstractC1750n1.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i34 = abstractC1750n1.f6659k;
            boolean z13 = abstractC1750n1.f6665q;
            int i35 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z14 = false;
            int i36 = 0;
            boolean z15 = false;
            boolean z16 = true;
            float f8 = 0.0f;
            int iMax6 = 0;
            while (i35 < virtualChildCount) {
                int i37 = mode;
                View childAt = abstractC1750n1.getChildAt(i35);
                if (childAt == null) {
                    abstractC1750n1.f6663o = abstractC1750n1.f6663o;
                } else {
                    if (childAt.getVisibility() != i33) {
                        if (abstractC1750n1.m3426i(i35)) {
                            abstractC1750n1.f6663o += abstractC1750n1.f6670v;
                        }
                        C1746m1 c1746m12 = (C1746m1) childAt.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) c1746m12).weight;
                        f8 += f9;
                        if (mode2 == i32 && ((LinearLayout.LayoutParams) c1746m12).height == 0 && f9 > 0.0f) {
                            int i38 = abstractC1750n1.f6663o;
                            abstractC1750n1.f6663o = Math.max(i38, ((LinearLayout.LayoutParams) c1746m12).topMargin + i38 + ((LinearLayout.LayoutParams) c1746m12).bottomMargin);
                            view2 = childAt;
                            i27 = mode2;
                            i28 = i34;
                            z11 = z13;
                            i29 = i35;
                            z14 = true;
                            i30 = i37;
                        } else {
                            if (((LinearLayout.LayoutParams) c1746m12).height != 0 || f9 <= 0.0f) {
                                i24 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c1746m12).height = i31;
                                i24 = 0;
                            }
                            if (f8 == 0.0f) {
                                i25 = i35;
                                i26 = abstractC1750n1.f6663o;
                            } else {
                                i25 = i35;
                                i26 = 0;
                            }
                            i27 = mode2;
                            z11 = z13;
                            i28 = i34;
                            i29 = i25;
                            i30 = i37;
                            abstractC1750n1.measureChildWithMargins(childAt, i, 0, i4, i26);
                            if (i24 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c1746m12).height = i24;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i39 = abstractC1750n1.f6663o;
                            view2 = childAt;
                            abstractC1750n1.f6663o = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) c1746m12).topMargin + ((LinearLayout.LayoutParams) c1746m12).bottomMargin);
                            if (z11) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i28 >= 0 && i28 == i29 + 1) {
                            abstractC1750n1.f6660l = abstractC1750n1.f6663o;
                        }
                        if (i29 < i28 && ((LinearLayout.LayoutParams) c1746m12).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) c1746m12).width != -1) {
                            z12 = false;
                        } else {
                            z12 = true;
                            z15 = true;
                        }
                        int i40 = ((LinearLayout.LayoutParams) c1746m12).leftMargin + ((LinearLayout.LayoutParams) c1746m12).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i40;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z17 = z12;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                        if (z16) {
                            i36 = iCombineMeasuredStates;
                            boolean z18 = ((LinearLayout.LayoutParams) c1746m12).width == -1;
                            if (((LinearLayout.LayoutParams) c1746m12).weight <= 0.0f) {
                                if (!z17) {
                                    i40 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i40);
                            } else {
                                if (!z17) {
                                    i40 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i40);
                            }
                            z16 = z18;
                        } else {
                            i36 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c1746m12).weight <= 0.0f) {
                        }
                        z16 = z18;
                    }
                    i35 = i29 + 1;
                    i34 = i28;
                    mode = i30;
                    z13 = z11;
                    mode2 = i27;
                    i31 = -2;
                    i32 = 1073741824;
                    i33 = 8;
                }
                i27 = mode2;
                i28 = i34;
                z11 = z13;
                i29 = i35;
                i30 = i37;
                i35 = i29 + 1;
                i34 = i28;
                mode = i30;
                z13 = z11;
                mode2 = i27;
                i31 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z19 = z13;
            int i43 = i36;
            int i44 = i4;
            if (abstractC1750n1.f6663o > 0 && abstractC1750n1.m3426i(virtualChildCount)) {
                abstractC1750n1.f6663o += abstractC1750n1.f6670v;
            }
            if (z19 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                abstractC1750n1.f6663o = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = abstractC1750n1.getChildAt(i45);
                    if (childAt2 == null) {
                        abstractC1750n1.f6663o = abstractC1750n1.f6663o;
                    } else if (childAt2.getVisibility() != 8) {
                        C1746m1 c1746m13 = (C1746m1) childAt2.getLayoutParams();
                        int i46 = abstractC1750n1.f6663o;
                        abstractC1750n1.f6663o = Math.max(i46, i46 + iMax6 + ((LinearLayout.LayoutParams) c1746m13).topMargin + ((LinearLayout.LayoutParams) c1746m13).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1750n1.getPaddingBottom() + abstractC1750n1.getPaddingTop() + abstractC1750n1.f6663o;
            abstractC1750n1.f6663o = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1750n1.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (iResolveSizeAndState & 16777215) - abstractC1750n1.f6663o;
            if (z14 || (i47 != 0 && f8 > 0.0f)) {
                float f10 = abstractC1750n1.f6664p;
                if (f10 > 0.0f) {
                    f8 = f10;
                }
                abstractC1750n1.f6663o = 0;
                int iCombineMeasuredStates2 = i43;
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt3 = abstractC1750n1.getChildAt(i48);
                    if (childAt3.getVisibility() == 8) {
                        i21 = i48;
                    } else {
                        C1746m1 c1746m14 = (C1746m1) childAt3.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c1746m14).weight;
                        if (f11 > 0.0f) {
                            int i49 = (int) ((i47 * f11) / f8);
                            f8 -= f11;
                            i47 -= i49;
                            i21 = i48;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC1750n1.getPaddingRight() + abstractC1750n1.getPaddingLeft() + ((LinearLayout.LayoutParams) c1746m14).leftMargin + ((LinearLayout.LayoutParams) c1746m14).rightMargin, ((LinearLayout.LayoutParams) c1746m14).width);
                            if (((LinearLayout.LayoutParams) c1746m14).height == 0) {
                                i23 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i49 <= 0) {
                                        i49 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i23 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i49;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i23));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i21 = i48;
                        }
                        int i50 = ((LinearLayout.LayoutParams) c1746m14).leftMargin + ((LinearLayout.LayoutParams) c1746m14).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i50;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i41 != 1073741824) {
                            i22 = -1;
                            if (((LinearLayout.LayoutParams) c1746m14).width == -1) {
                                measuredWidth2 = i50;
                            }
                        } else {
                            i22 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z20 = z16 && ((LinearLayout.LayoutParams) c1746m14).width == i22;
                        int i51 = abstractC1750n1.f6663o;
                        abstractC1750n1.f6663o = Math.max(i51, childAt3.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) c1746m14).topMargin + ((LinearLayout.LayoutParams) c1746m14).bottomMargin);
                        z16 = z20;
                    }
                    i48 = i21 + 1;
                }
                abstractC1750n1.f6663o = abstractC1750n1.getPaddingBottom() + abstractC1750n1.getPaddingTop() + abstractC1750n1.f6663o;
                i43 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z19 && i42 != 1073741824) {
                    for (int i52 = 0; i52 < virtualChildCount; i52++) {
                        View childAt4 = abstractC1750n1.getChildAt(i52);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1746m1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z16 || i41 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC1750n1.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1750n1.getPaddingRight() + abstractC1750n1.getPaddingLeft() + iMax4, abstractC1750n1.getSuggestedMinimumWidth()), i, i43), iResolveSizeAndState);
            if (z15) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1750n1.getMeasuredWidth(), 1073741824);
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt5 = abstractC1750n1.getChildAt(i53);
                    if (childAt5.getVisibility() != 8) {
                        C1746m1 c1746m15 = (C1746m1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1746m15).width == -1) {
                            int i54 = ((LinearLayout.LayoutParams) c1746m15).height;
                            ((LinearLayout.LayoutParams) c1746m15).height = childAt5.getMeasuredHeight();
                            abstractC1750n1.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) c1746m15).height = i54;
                        }
                    }
                    i53++;
                    i44 = i4;
                }
                return;
            }
            return;
        }
        int i55 = i;
        abstractC1750n1.f6663o = 0;
        int virtualChildCount2 = abstractC1750n1.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i55);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (abstractC1750n1.f6666r == null || abstractC1750n1.f6667s == null) {
            abstractC1750n1.f6666r = new int[4];
            abstractC1750n1.f6667s = new int[4];
        }
        int[] iArr3 = abstractC1750n1.f6666r;
        int[] iArr4 = abstractC1750n1.f6667s;
        iArr3[3] = -1;
        char c8 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z21 = abstractC1750n1.f6658j;
        boolean z22 = abstractC1750n1.f6665q;
        boolean z23 = mode3 == 1073741824;
        float f12 = 0.0f;
        boolean z24 = true;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z25 = false;
        boolean z26 = false;
        while (i56 < virtualChildCount2) {
            char c9 = c8;
            View childAt6 = abstractC1750n1.getChildAt(i56);
            if (childAt6 == null) {
                abstractC1750n1.f6663o = abstractC1750n1.f6663o;
                i16 = i56;
                i20 = i58;
                iArr2 = iArr3;
                iArr = iArr4;
                z7 = z21;
                z8 = z22;
            } else {
                int i59 = i57;
                if (childAt6.getVisibility() == 8) {
                    i55 = i;
                    i16 = i56;
                    i20 = i58;
                    iArr = iArr4;
                    z7 = z21;
                    z8 = z22;
                    i57 = i59;
                    iArr2 = iArr3;
                } else {
                    if (abstractC1750n1.m3426i(i56)) {
                        abstractC1750n1.f6663o += abstractC1750n1.f6669u;
                    }
                    C1746m1 c1746m16 = (C1746m1) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c1746m16).weight;
                    f12 += f13;
                    int i60 = i56;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1746m16).width == 0 && f13 > 0.0f) {
                        if (z23) {
                            abstractC1750n1.f6663o = ((LinearLayout.LayoutParams) c1746m16).leftMargin + ((LinearLayout.LayoutParams) c1746m16).rightMargin + abstractC1750n1.f6663o;
                        } else {
                            int i61 = abstractC1750n1.f6663o;
                            abstractC1750n1.f6663o = Math.max(i61, ((LinearLayout.LayoutParams) c1746m16).leftMargin + i61 + ((LinearLayout.LayoutParams) c1746m16).rightMargin);
                        }
                        if (z21) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z7 = z21;
                            z8 = z22;
                            i17 = i59;
                            i16 = i60;
                            c1746m1 = c1746m16;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i;
                            i18 = i58;
                            i15 = iMax7;
                        } else {
                            view = childAt6;
                            z7 = z21;
                            z8 = z22;
                            z26 = true;
                            i17 = i59;
                            i16 = i60;
                            i19 = 1073741824;
                            c1746m1 = c1746m16;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i;
                            i18 = i58;
                            i15 = iMax7;
                            if (mode4 == i19 && ((LinearLayout.LayoutParams) c1746m1).height == -1) {
                                z9 = true;
                                z25 = true;
                            } else {
                                z9 = false;
                            }
                            int i62 = ((LinearLayout.LayoutParams) c1746m1).topMargin + ((LinearLayout.LayoutParams) c1746m1).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i62;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z7) {
                                z10 = z9;
                            } else {
                                int baseline2 = view.getBaseline();
                                z10 = z9;
                                if (baseline2 != -1) {
                                    int i63 = ((LinearLayout.LayoutParams) c1746m1).gravity;
                                    if (i63 < 0) {
                                        i63 = abstractC1750n1.f6662n;
                                    }
                                    int i64 = (((i63 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i64] = Math.max(iArr2[i64], baseline2);
                                    iArr[i64] = Math.max(iArr[i64], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i17, measuredHeight3);
                            boolean z27 = !z24 && ((LinearLayout.LayoutParams) c1746m1).height == -1;
                            if (((LinearLayout.LayoutParams) c1746m1).weight <= 0.0f) {
                                if (!z10) {
                                    i62 = measuredHeight3;
                                }
                                iMax7 = Math.max(i15, i62);
                                iMax2 = i18;
                            } else {
                                if (!z10) {
                                    i62 = measuredHeight3;
                                }
                                iMax2 = Math.max(i18, i62);
                                iMax7 = i15;
                            }
                            int i65 = iMax2;
                            i57 = iMax9;
                            i20 = i65;
                            z24 = z27;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c1746m16).width != 0 || f13 <= 0.0f) {
                            i14 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c1746m16).width = -2;
                            i14 = 0;
                        }
                        iArr = iArr4;
                        i15 = iMax7;
                        i16 = i60;
                        z7 = z21;
                        z8 = z22;
                        int i66 = i14;
                        c1746m1 = c1746m16;
                        i17 = i59;
                        i55 = i;
                        iArr2 = iArr3;
                        i18 = i58;
                        abstractC1750n1.measureChildWithMargins(childAt6, i55, f12 == 0.0f ? abstractC1750n1.f6663o : 0, i4, 0);
                        if (i66 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1746m1).width = i66;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z23) {
                            view = childAt6;
                            abstractC1750n1.f6663o = ((LinearLayout.LayoutParams) c1746m1).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1746m1).rightMargin + abstractC1750n1.f6663o;
                        } else {
                            view = childAt6;
                            int i67 = abstractC1750n1.f6663o;
                            abstractC1750n1.f6663o = Math.max(i67, i67 + measuredWidth3 + ((LinearLayout.LayoutParams) c1746m1).leftMargin + ((LinearLayout.LayoutParams) c1746m1).rightMargin);
                        }
                        if (z8) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i19 = 1073741824;
                    if (mode4 == i19) {
                        z9 = false;
                        int i622 = ((LinearLayout.LayoutParams) c1746m1).topMargin + ((LinearLayout.LayoutParams) c1746m1).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i622;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z7) {
                        }
                        int iMax92 = Math.max(i17, measuredHeight32);
                        if (z24) {
                            if (((LinearLayout.LayoutParams) c1746m1).weight <= 0.0f) {
                            }
                            int i652 = iMax2;
                            i57 = iMax92;
                            i20 = i652;
                            z24 = z27;
                        }
                    }
                }
            }
            i58 = i20;
            i56 = i16 + 1;
            c8 = c9;
            iArr3 = iArr2;
            iArr4 = iArr;
            z21 = z7;
            z22 = z8;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c10 = c8;
        boolean z28 = z21;
        boolean z29 = z22;
        int i68 = i57;
        int i69 = i58;
        int i70 = iMax7;
        if (abstractC1750n1.f6663o > 0 && abstractC1750n1.m3426i(virtualChildCount2)) {
            abstractC1750n1.f6663o += abstractC1750n1.f6669u;
        }
        int i71 = iArr5[1];
        int iMax10 = (i71 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) ? i68 : Math.max(i68, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i71, iArr5[c10]))));
        if (z29 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1750n1.f6663o = 0;
            for (int i72 = 0; i72 < virtualChildCount2; i72++) {
                View childAt7 = abstractC1750n1.getChildAt(i72);
                if (childAt7 == null) {
                    abstractC1750n1.f6663o = abstractC1750n1.f6663o;
                } else if (childAt7.getVisibility() != 8) {
                    C1746m1 c1746m17 = (C1746m1) childAt7.getLayoutParams();
                    if (z23) {
                        abstractC1750n1.f6663o = ((LinearLayout.LayoutParams) c1746m17).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c1746m17).rightMargin + abstractC1750n1.f6663o;
                    } else {
                        int i73 = abstractC1750n1.f6663o;
                        abstractC1750n1.f6663o = Math.max(i73, i73 + iMax8 + ((LinearLayout.LayoutParams) c1746m17).leftMargin + ((LinearLayout.LayoutParams) c1746m17).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1750n1.getPaddingRight() + abstractC1750n1.getPaddingLeft() + abstractC1750n1.f6663o;
        abstractC1750n1.f6663o = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1750n1.getSuggestedMinimumWidth()), i55, 0);
        int i74 = (iResolveSizeAndState2 & 16777215) - abstractC1750n1.f6663o;
        if (z26 || (i74 != 0 && f12 > 0.0f)) {
            float f14 = abstractC1750n1.f6664p;
            if (f14 > 0.0f) {
                f12 = f14;
            }
            iArr5[3] = -1;
            iArr5[c10] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c10] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC1750n1.f6663o = 0;
            iMax10 = -1;
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt8 = abstractC1750n1.getChildAt(i75);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i11 = iResolveSizeAndState2;
                } else {
                    C1746m1 c1746m18 = (C1746m1) childAt8.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c1746m18).weight;
                    if (f15 > 0.0f) {
                        int i76 = (int) ((i74 * f15) / f12);
                        f12 -= f15;
                        i74 -= i76;
                        i11 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, abstractC1750n1.getPaddingBottom() + abstractC1750n1.getPaddingTop() + ((LinearLayout.LayoutParams) c1746m18).topMargin + ((LinearLayout.LayoutParams) c1746m18).bottomMargin, ((LinearLayout.LayoutParams) c1746m18).height);
                        if (((LinearLayout.LayoutParams) c1746m18).width == 0) {
                            i13 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i76 <= 0) {
                                    i76 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i76;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i13), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i11 = iResolveSizeAndState2;
                    }
                    if (z23) {
                        abstractC1750n1.f6663o = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1746m18).leftMargin + ((LinearLayout.LayoutParams) c1746m18).rightMargin + abstractC1750n1.f6663o;
                    } else {
                        int i77 = abstractC1750n1.f6663o;
                        abstractC1750n1.f6663o = Math.max(i77, childAt8.getMeasuredWidth() + i77 + ((LinearLayout.LayoutParams) c1746m18).leftMargin + ((LinearLayout.LayoutParams) c1746m18).rightMargin);
                    }
                    boolean z30 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1746m18).height == -1;
                    int i78 = ((LinearLayout.LayoutParams) c1746m18).topMargin + ((LinearLayout.LayoutParams) c1746m18).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i78;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z30) {
                        i78 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i69, i78);
                    if (z24) {
                        i12 = -1;
                        boolean z31 = ((LinearLayout.LayoutParams) c1746m18).height == -1;
                        if (!z28 && (baseline = childAt8.getBaseline()) != i12) {
                            int i79 = ((LinearLayout.LayoutParams) c1746m18).gravity;
                            if (i79 < 0) {
                                i79 = abstractC1750n1.f6662n;
                            }
                            int i80 = (((i79 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i80] = Math.max(iArr5[i80], baseline);
                            iArr6[i80] = Math.max(iArr6[i80], measuredHeight4 - baseline);
                        }
                        z24 = z31;
                        i69 = iMax11;
                    } else {
                        i12 = -1;
                    }
                    if (!z28) {
                        z24 = z31;
                        i69 = iMax11;
                    }
                }
                i75++;
                iResolveSizeAndState2 = i11;
            }
            i8 = iResolveSizeAndState2;
            i9 = -16777216;
            abstractC1750n1.f6663o = abstractC1750n1.getPaddingRight() + abstractC1750n1.getPaddingLeft() + abstractC1750n1.f6663o;
            int i81 = iArr5[1];
            if (i81 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) {
                i10 = 0;
            } else {
                i10 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[c10]))));
            }
            iMax = i69;
        } else {
            iMax = Math.max(i69, i70);
            if (z29 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt9 = abstractC1750n1.getChildAt(i82);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1746m1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i8 = iResolveSizeAndState2;
            i9 = -16777216;
            i10 = 0;
        }
        if (!z24 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        abstractC1750n1.setMeasuredDimension(i8 | (iCombineMeasuredStates3 & i9), View.resolveSizeAndState(Math.max(abstractC1750n1.getPaddingBottom() + abstractC1750n1.getPaddingTop() + iMax10, abstractC1750n1.getSuggestedMinimumHeight()), i4, iCombineMeasuredStates3 << 16));
        if (z25) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1750n1.getMeasuredHeight(), 1073741824);
            int i83 = i10;
            while (i83 < virtualChildCount2) {
                View childAt10 = abstractC1750n1.getChildAt(i83);
                if (childAt10.getVisibility() != 8) {
                    C1746m1 c1746m19 = (C1746m1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1746m19).height == -1) {
                        int i84 = ((LinearLayout.LayoutParams) c1746m19).width;
                        ((LinearLayout.LayoutParams) c1746m19).width = childAt10.getMeasuredWidth();
                        abstractC1750n1.measureChildWithMargins(childAt10, i55, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1746m19).width = i84;
                    }
                }
                i83++;
                abstractC1750n1 = this;
                i55 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z7) {
        this.f6658j = z7;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f6659k = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6668t) {
            return;
        }
        this.f6668t = drawable;
        if (drawable != null) {
            this.f6669u = drawable.getIntrinsicWidth();
            this.f6670v = drawable.getIntrinsicHeight();
        } else {
            this.f6669u = 0;
            this.f6670v = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f6672x = i;
    }

    public void setGravity(int i) {
        if (this.f6662n != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f6662n = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i4 = i & 8388615;
        int i8 = this.f6662n;
        if ((8388615 & i8) != i4) {
            this.f6662n = i4 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f6665q = z7;
    }

    public void setOrientation(int i) {
        if (this.f6661m != i) {
            this.f6661m = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f6671w) {
            requestLayout();
        }
        this.f6671w = i;
    }

    public void setVerticalGravity(int i) {
        int i4 = i & 112;
        int i8 = this.f6662n;
        if ((i8 & 112) != i4) {
            this.f6662n = i4 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f6664p = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
