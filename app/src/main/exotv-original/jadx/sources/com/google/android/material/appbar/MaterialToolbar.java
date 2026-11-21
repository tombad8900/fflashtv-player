package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.AbstractC0195e;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Collections;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p156s.C2331d;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p211y5.C2823j;
import p211y5.C2828o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: i0 */
    public static final ImageView.ScaleType[] f3051i0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: d0 */
    public Integer f3052d0;

    /* renamed from: e0 */
    public boolean f3053e0;

    /* renamed from: f0 */
    public boolean f3054f0;

    /* renamed from: g0 */
    public ImageView.ScaleType f3055g0;

    /* renamed from: h0 */
    public Boolean f3056h0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3762x, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM4215e.hasValue(2)) {
            setNavigationIconTint(typedArrayM4215e.getColor(2, -1));
        }
        this.f3053e0 = typedArrayM4215e.getBoolean(6, false);
        this.f3054f0 = typedArrayM4215e.getBoolean(5, false);
        int i = typedArrayM4215e.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3051i0;
            if (i < scaleTypeArr.length) {
                this.f3055g0 = scaleTypeArr[i];
            }
        }
        if (typedArrayM4215e.hasValue(0)) {
            this.f3056h0 = Boolean.valueOf(typedArrayM4215e.getBoolean(0, false));
        }
        typedArrayM4215e.recycle();
        C2828o c2828oM4951a = C2828o.m4952f(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).m4951a();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0195e.m612b(background);
        if (colorStateListValueOf != null) {
            C2823j c2823j = new C2823j(c2828oM4951a);
            c2823j.m4945q(colorStateListValueOf);
            c2823j.m4941m(context2);
            c2823j.m4944p(getElevation());
            setBackground(c2823j);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3055g0;
    }

    public Integer getNavigationIconTint() {
        return this.f3052d0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2823j) {
            AbstractC2429w.m4310o(this, (C2823j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z7, i, i4, i8, i9);
        C2331d c2331d = AbstractC2374l.f8373c;
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.f3053e0 || this.f3054f0) {
            ArrayList arrayListM4214d = AbstractC2374l.m4214d(this, getTitle());
            TextView textView = arrayListM4214d.isEmpty() ? null : (TextView) Collections.min(arrayListM4214d, c2331d);
            ArrayList arrayListM4214d2 = AbstractC2374l.m4214d(this, getSubtitle());
            TextView textView2 = arrayListM4214d2.isEmpty() ? null : (TextView) Collections.max(arrayListM4214d2, c2331d);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3053e0 && textView != null) {
                    m1769u(textView, pair);
                }
                if (this.f3054f0 && textView2 != null) {
                    m1769u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3056h0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3055g0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof C2823j) {
            ((C2823j) background).m4944p(f8);
        }
    }

    public void setLogoAdjustViewBounds(boolean z7) {
        Boolean bool = this.f3056h0;
        if (bool == null || bool.booleanValue() != z7) {
            this.f3056h0 = Boolean.valueOf(z7);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3055g0 != scaleType) {
            this.f3055g0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3052d0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f3052d0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3052d0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z7) {
        if (this.f3054f0 != z7) {
            this.f3054f0 = z7;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z7) {
        if (this.f3053e0 != z7) {
            this.f3053e0 = z7;
            requestLayout();
        }
    }

    /* renamed from: u */
    public final void m1769u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i4 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i4, textView.getBottom());
    }
}
