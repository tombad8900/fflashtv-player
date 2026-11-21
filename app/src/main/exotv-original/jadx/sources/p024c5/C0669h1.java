package p024c5;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.h1 */
/* loaded from: classes.dex */
public final class C0669h1 extends ViewGroup {

    /* renamed from: j */
    public int f2624j;

    /* renamed from: k */
    public Integer f2625k;

    /* renamed from: l */
    public int f2626l;

    /* renamed from: a */
    public final int m1441a(int i) {
        int i4;
        Integer num = this.f2625k;
        if (num != null) {
            return num.intValue();
        }
        int i8 = this.f2624j;
        if (i8 > 0 && (i4 = i / i8) >= 1) {
            return i4;
        }
        return 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int i10;
        int paddingLeft = ((i8 - i) - getPaddingLeft()) - getPaddingRight();
        int iM1441a = m1441a(paddingLeft);
        int i11 = iM1441a > 1 ? iM1441a - 1 : 0;
        int i12 = this.f2626l;
        if (i12 > 0) {
            i10 = this.f2624j + i12;
        } else if (i11 > 0) {
            int i13 = this.f2624j;
            int i14 = (paddingLeft - (iM1441a * i13)) / i11;
            if (i14 < 0) {
                i14 = 0;
            }
            i10 = i14 + i13;
        } else {
            i10 = this.f2624j;
        }
        int i15 = this.f2624j;
        int i16 = ((i10 - i15) * i11) + (i15 * iM1441a);
        int paddingLeft2 = getPaddingLeft();
        int i17 = (paddingLeft - i16) / 2;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = paddingLeft2 + i17;
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i19 = i18;
        int iMax = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (i20 > 0 && i20 % iM1441a == 0) {
                paddingTop += iMax;
                i19 = i18;
                iMax = 0;
            }
            childAt.layout(i19, paddingTop, this.f2624j + i19, childAt.getMeasuredHeight() + paddingTop);
            i19 += i10;
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int iM1441a = m1441a((size - getPaddingLeft()) - getPaddingRight());
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2624j, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        int i8 = 0;
        int iMax = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            measureChild(childAt, iMakeMeasureSpec, iMakeMeasureSpec2);
            if (i9 > 0 && i9 % iM1441a == 0) {
                i8 += iMax;
                iMax = 0;
            }
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i8 + iMax);
    }
}
