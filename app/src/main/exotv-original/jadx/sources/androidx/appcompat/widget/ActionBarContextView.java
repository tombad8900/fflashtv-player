package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754l;
import p054g.AbstractC1026a;
import p087k.AbstractC1536a;
import p095l.InterfaceC1612b0;
import p095l.MenuC1627m;
import p104m.AbstractC1763q2;
import p104m.C1696a;
import p104m.C1720g;
import p104m.C1736k;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A */
    public final int f649A;

    /* renamed from: B */
    public boolean f650B;

    /* renamed from: C */
    public final int f651C;

    /* renamed from: D */
    public int f652D;

    /* renamed from: E */
    public int f653E;

    /* renamed from: F */
    public int f654F;

    /* renamed from: G */
    public int f655G;

    /* renamed from: H */
    public int f656H;

    /* renamed from: I */
    public int f657I;

    /* renamed from: J */
    public int f658J;

    /* renamed from: j */
    public final C1696a f659j;

    /* renamed from: k */
    public final Context f660k;

    /* renamed from: l */
    public ActionMenuView f661l;

    /* renamed from: m */
    public C1736k f662m;

    /* renamed from: n */
    public int f663n;

    /* renamed from: o */
    public C1843r0 f664o;

    /* renamed from: p */
    public boolean f665p;

    /* renamed from: q */
    public boolean f666q;

    /* renamed from: r */
    public CharSequence f667r;

    /* renamed from: s */
    public CharSequence f668s;

    /* renamed from: t */
    public View f669t;

    /* renamed from: u */
    public View f670u;

    /* renamed from: v */
    public View f671v;

    /* renamed from: w */
    public LinearLayout f672w;

    /* renamed from: x */
    public TextView f673x;

    /* renamed from: y */
    public TextView f674y;

    /* renamed from: z */
    public final int f675z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f659j = new C1696a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f660k = context;
        } else {
            this.f660k = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4311d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0715d.m1542D(context, resourceId));
        this.f675z = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f649A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f663n = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f651C = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
        this.f655G = getPaddingLeft();
        this.f656H = getPaddingTop();
        this.f657I = getPaddingRight();
        this.f658J = getPaddingBottom();
    }

    /* renamed from: f */
    public static int m445f(View view, int i, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: h */
    public static int m446h(View view, int i, int i4, int i8, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i8 - measuredHeight) / 2) + i4;
        if (z7) {
            view.layout(i - measuredWidth, i9, i, measuredHeight + i9);
        } else {
            view.layout(i, i9, i + measuredWidth, measuredHeight + i9);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m447c(AbstractC1536a abstractC1536a) {
        View view = this.f669t;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f651C, (ViewGroup) this, false);
            this.f669t = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f669t);
        }
        View viewFindViewById = this.f669t.findViewById(R.id.action_mode_close_button);
        this.f670u = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0754l(2, abstractC1536a));
        MenuC1627m menuC1627mMo2259c = abstractC1536a.mo2259c();
        C1736k c1736k = this.f662m;
        if (c1736k != null) {
            c1736k.m3415f();
            C1720g c1720g = c1736k.f6586C;
            if (c1720g != null && c1720g.m3339b()) {
                c1720g.f6279j.dismiss();
            }
        }
        C1736k c1736k2 = new C1736k(getContext());
        this.f662m = c1736k2;
        c1736k2.f6601u = true;
        c1736k2.f6602v = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC1627mMo2259c.m3307b(this.f662m, this.f660k);
        C1736k c1736k3 = this.f662m;
        InterfaceC1612b0 interfaceC1612b0 = c1736k3.f6597q;
        if (interfaceC1612b0 == null) {
            InterfaceC1612b0 interfaceC1612b02 = (InterfaceC1612b0) c1736k3.f6593m.inflate(c1736k3.f6595o, (ViewGroup) this, false);
            c1736k3.f6597q = interfaceC1612b02;
            interfaceC1612b02.mo442c(c1736k3.f6592l);
            c1736k3.mo3279e();
        }
        InterfaceC1612b0 interfaceC1612b03 = c1736k3.f6597q;
        if (interfaceC1612b0 != interfaceC1612b03) {
            ((ActionMenuView) interfaceC1612b03).setPresenter(c1736k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1612b03;
        this.f661l = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f661l, layoutParams);
    }

    /* renamed from: d */
    public final void m448d() {
        if (this.f672w == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f672w = linearLayout;
            this.f673x = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f674y = (TextView) this.f672w.findViewById(R.id.action_bar_subtitle);
            int i = this.f675z;
            if (i != 0) {
                this.f673x.setTextAppearance(getContext(), i);
            }
            int i4 = this.f649A;
            if (i4 != 0) {
                this.f674y.setTextAppearance(getContext(), i4);
            }
        }
        this.f673x.setText(this.f667r);
        this.f674y.setText(this.f668s);
        boolean zIsEmpty = TextUtils.isEmpty(this.f667r);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f668s);
        this.f674y.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f672w.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f672w.getParent() == null) {
            addView(this.f672w);
        }
    }

    /* renamed from: e */
    public final void m449e() {
        removeAllViews();
        this.f671v = null;
        this.f661l = null;
        this.f662m = null;
        View view = this.f670u;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: g */
    public final void m450g(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1026a.f4308a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1736k c1736k = this.f662m;
        if (c1736k != null) {
            Configuration configuration2 = c1736k.f6591k.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            c1736k.f6605y = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC1627m menuC1627m = c1736k.f6592l;
            if (menuC1627m != null) {
                menuC1627m.m3313p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f664o != null ? this.f659j.f6502b : getVisibility();
    }

    public int getContentHeight() {
        return this.f663n;
    }

    public CharSequence getSubtitle() {
        return this.f668s;
    }

    public CharSequence getTitle() {
        return this.f667r;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C1843r0 c1843r0 = this.f664o;
            if (c1843r0 != null) {
                c1843r0.m3616b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: j */
    public final C1843r0 m452j(int i, long j) {
        C1843r0 c1843r0 = this.f664o;
        if (c1843r0 != null) {
            c1843r0.m3616b();
        }
        C1696a c1696a = this.f659j;
        if (i != 0) {
            C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(this);
            c1843r0M3596a.m3615a(0.0f);
            c1843r0M3596a.m3617c(j);
            c1696a.f6503c.f664o = c1843r0M3596a;
            c1696a.f6502b = i;
            c1843r0M3596a.m3618d(c1696a);
            return c1843r0M3596a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1843r0 c1843r0M3596a2 = AbstractC1828m0.m3596a(this);
        c1843r0M3596a2.m3615a(1.0f);
        c1843r0M3596a2.m3617c(j);
        c1696a.f6503c.f664o = c1843r0M3596a2;
        c1696a.f6502b = i;
        c1843r0M3596a2.m3618d(c1696a);
        return c1843r0M3596a2;
    }

    /* renamed from: k */
    public final void m453k() {
        super.setPadding(this.f652D + this.f655G, this.f653E + this.f656H, this.f654F + this.f657I, this.f658J);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m450g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1026a.f4311d, R.attr.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1736k c1736k = this.f662m;
        if (c1736k != null) {
            c1736k.m3415f();
            C1720g c1720g = this.f662m.f6586C;
            if (c1720g == null || !c1720g.m3339b()) {
                return;
            }
            c1720g.f6279j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f666q = false;
        }
        if (!this.f666q) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f666q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f666q = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        boolean z8 = AbstractC1763q2.f6715a;
        boolean z9 = getLayoutDirection() == 1;
        int paddingRight = z9 ? (i8 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f669t;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f669t.getLayoutParams();
            int i10 = z9 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = z9 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = z9 ? paddingRight - i10 : paddingRight + i10;
            int iM446h = m446h(this.f669t, i12, paddingTop, paddingTop2, z9) + i12;
            paddingRight = z9 ? iM446h - i11 : iM446h + i11;
        }
        LinearLayout linearLayout = this.f672w;
        if (linearLayout != null && this.f671v == null && linearLayout.getVisibility() != 8) {
            paddingRight += m446h(this.f672w, paddingRight, paddingTop, paddingTop2, z9);
        }
        View view2 = this.f671v;
        if (view2 != null) {
            m446h(view2, paddingRight, paddingTop, paddingTop2, z9);
        }
        int paddingLeft = z9 ? getPaddingLeft() : (i8 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f661l;
        if (actionMenuView != null) {
            m446h(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z9);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i8 = this.f663n;
        int size2 = i8 > 0 ? i8 + this.f653E : View.MeasureSpec.getSize(i4);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f669t;
        if (view != null) {
            int iM445f = m445f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f669t.getLayoutParams();
            paddingLeft = iM445f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f661l;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m445f(this.f661l, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f672w;
        if (linearLayout != null && this.f671v == null) {
            if (this.f650B) {
                this.f672w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f672w.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f672w.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = m445f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f671v;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.f671v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f663n > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f665p = false;
        }
        if (!this.f665p) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f665p = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f665p = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f663n = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f671v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f671v = view;
        if (view != null && (linearLayout = this.f672w) != null) {
            removeView(linearLayout);
            this.f672w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i4, int i8, int i9) {
        this.f655G = i;
        this.f656H = i4;
        this.f657I = i8;
        this.f658J = i9;
        m453k();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i8, int i9) {
        if (getLayoutDirection() != 1) {
            this.f655G = i;
            this.f657I = i8;
        } else {
            this.f655G = i8;
            this.f657I = i;
        }
        this.f656H = i4;
        this.f658J = i9;
        m453k();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f668s = charSequence;
        m448d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f667r = charSequence;
        m448d();
        AbstractC1828m0.m3609n(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f650B) {
            requestLayout();
        }
        this.f650B = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
