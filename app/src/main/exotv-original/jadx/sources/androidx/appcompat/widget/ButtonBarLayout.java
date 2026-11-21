package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.exotv.net.R;
import java.util.WeakHashMap;
import p054g.AbstractC1026a;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: j */
    public boolean f722j;

    /* renamed from: k */
    public boolean f723k;

    /* renamed from: l */
    public int f724l;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f724l = -1;
        int[] iArr = AbstractC1026a.f4318k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC1828m0.m3607l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f722j = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f722j);
        }
    }

    private void setStacked(boolean z7) {
        if (this.f723k != z7) {
            if (!z7 || this.f722j) {
                this.f723k = z7;
                setOrientation(z7 ? 1 : 0);
                setGravity(z7 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z7 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int iMakeMeasureSpec;
        boolean z7;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f722j) {
            if (size > this.f724l && this.f723k) {
                setStacked(false);
            }
            this.f724l = size;
        }
        if (this.f723k || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z7 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i4);
        if (this.f722j && !this.f723k && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i, i4);
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i8 = -1;
            if (i9 >= childCount) {
                i9 = -1;
                break;
            } else if (getChildAt(i9).getVisibility() == 0) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            View childAt = getChildAt(i9);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f723k) {
                int i10 = i9 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i10 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i10).getVisibility() == 0) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
                paddingBottom = i8 >= 0 ? getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i4 == 0) {
                super.onMeasure(i, i4);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f722j != z7) {
            this.f722j = z7;
            if (!z7 && this.f723k) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
