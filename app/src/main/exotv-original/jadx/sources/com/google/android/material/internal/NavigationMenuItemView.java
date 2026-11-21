package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.C0752j;
import p029d0.AbstractC0795k;
import p095l.C1630p;
import p095l.InterfaceC1610a0;
import p104m.C1746m1;
import p105m0.AbstractC1828m0;
import p162s5.AbstractC2367e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC2367e implements InterfaceC1610a0 {

    /* renamed from: P */
    public static final int[] f3364P = {R.attr.state_checked};

    /* renamed from: E */
    public int f3365E;

    /* renamed from: F */
    public boolean f3366F;

    /* renamed from: G */
    public boolean f3367G;

    /* renamed from: H */
    public final boolean f3368H;

    /* renamed from: I */
    public final CheckedTextView f3369I;

    /* renamed from: J */
    public FrameLayout f3370J;

    /* renamed from: K */
    public C1630p f3371K;

    /* renamed from: L */
    public ColorStateList f3372L;

    /* renamed from: M */
    public boolean f3373M;

    /* renamed from: N */
    public Drawable f3374N;

    /* renamed from: O */
    public final C0752j f3375O;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3368H = true;
        C0752j c0752j = new C0752j(3, this);
        this.f3375O = c0752j;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.exotv.net.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.exotv.net.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.exotv.net.R.id.design_menu_item_text);
        this.f3369I = checkedTextView;
        AbstractC1828m0.m3608m(checkedTextView, c0752j);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3370J == null) {
                this.f3370J = (FrameLayout) ((ViewStub) findViewById(com.exotv.net.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f3370J.removeAllViews();
            this.f3370J.addView(view);
        }
    }

    @Override // p095l.InterfaceC1610a0
    /* renamed from: b */
    public final void mo437b(C1630p c1630p) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f3371K = c1630p;
        int i = c1630p.f6242j;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1630p.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.exotv.net.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3364P, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c1630p.isCheckable());
        setChecked(c1630p.isChecked());
        setEnabled(c1630p.isEnabled());
        setTitle(c1630p.f6246n);
        setIcon(c1630p.getIcon());
        setActionView(c1630p.getActionView());
        setContentDescription(c1630p.f6258z);
        AbstractC0120b.m400K(this, c1630p.f6230A);
        C1630p c1630p2 = this.f3371K;
        CharSequence charSequence = c1630p2.f6246n;
        CheckedTextView checkedTextView = this.f3369I;
        if (charSequence == null && c1630p2.getIcon() == null && this.f3371K.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3370J;
            if (frameLayout != null) {
                C1746m1 c1746m1 = (C1746m1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1746m1).width = -1;
                this.f3370J.setLayoutParams(c1746m1);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3370J;
        if (frameLayout2 != null) {
            C1746m1 c1746m12 = (C1746m1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1746m12).width = -2;
            this.f3370J.setLayoutParams(c1746m12);
        }
    }

    @Override // p095l.InterfaceC1610a0
    public C1630p getItemData() {
        return this.f3371K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1630p c1630p = this.f3371K;
        if (c1630p != null && c1630p.isCheckable() && this.f3371K.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3364P);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
        if (this.f3367G != z7) {
            this.f3367G = z7;
            this.f3375O.mo3504h(this.f3369I, 2048);
        }
    }

    public void setChecked(boolean z7) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3369I;
        checkedTextView.setChecked(z7);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z7 && this.f3368H) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f3373M) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f3372L);
            }
            int i = this.f3365E;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3366F) {
            if (this.f3374N == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0795k.f3568a;
                Drawable drawable2 = resources.getDrawable(com.exotv.net.R.drawable.navigation_empty_icon, theme);
                this.f3374N = drawable2;
                if (drawable2 != null) {
                    int i4 = this.f3365E;
                    drawable2.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f3374N;
        }
        this.f3369I.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3369I.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f3365E = i;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f3372L = colorStateList;
        this.f3373M = colorStateList != null;
        C1630p c1630p = this.f3371K;
        if (c1630p != null) {
            setIcon(c1630p.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f3369I.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z7) {
        this.f3366F = z7;
    }

    public void setTextAppearance(int i) {
        this.f3369I.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3369I.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3369I.setText(charSequence);
    }
}
