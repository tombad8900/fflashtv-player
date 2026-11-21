package p101l5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005a4.C0073c;
import p017b6.C0614n;
import p029d0.AbstractC0795k;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p040e3.C0864b;
import p040e3.C0866d;
import p040e3.C0867e;
import p040e3.C0868f;
import p104m.C1764r;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l5.c */
/* loaded from: classes.dex */
public final class C1683c extends C1764r {

    /* renamed from: H */
    public static final int[] f6461H = {R.attr.state_indeterminate};

    /* renamed from: I */
    public static final int[] f6462I = {R.attr.state_error};

    /* renamed from: J */
    public static final int[][] f6463J = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: K */
    public static final int f6464K = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A */
    public int f6465A;

    /* renamed from: B */
    public int[] f6466B;

    /* renamed from: C */
    public boolean f6467C;

    /* renamed from: D */
    public CharSequence f6468D;

    /* renamed from: E */
    public CompoundButton.OnCheckedChangeListener f6469E;

    /* renamed from: F */
    public final C0868f f6470F;

    /* renamed from: G */
    public final C1681a f6471G;

    /* renamed from: n */
    public final LinkedHashSet f6472n;

    /* renamed from: o */
    public final LinkedHashSet f6473o;

    /* renamed from: p */
    public ColorStateList f6474p;

    /* renamed from: q */
    public boolean f6475q;

    /* renamed from: r */
    public boolean f6476r;

    /* renamed from: s */
    public boolean f6477s;

    /* renamed from: t */
    public CharSequence f6478t;

    /* renamed from: u */
    public Drawable f6479u;

    /* renamed from: v */
    public Drawable f6480v;

    /* renamed from: w */
    public boolean f6481w;

    /* renamed from: x */
    public ColorStateList f6482x;

    /* renamed from: y */
    public ColorStateList f6483y;

    /* renamed from: z */
    public PorterDuff.Mode f6484z;

    public C1683c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f6472n = new LinkedHashSet();
        this.f6473o = new LinkedHashSet();
        Context context2 = getContext();
        C0868f c0868f = new C0868f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0795k.f3568a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0868f.f3818j = drawable;
        drawable.setCallback(c0868f.f3817o);
        new C0867e(0, c0868f.f3818j.getConstantState());
        this.f6470F = c0868f;
        this.f6471G = new C1681a(this);
        Context context3 = getContext();
        this.f6479u = getButtonDrawable();
        this.f6482x = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC2374l.m4211a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC0847a.f3755q;
        AbstractC2374l.m4212b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0073c c0073c = new C0073c(context3, typedArrayObtainStyledAttributes);
        this.f6480v = c0073c.m299x(2);
        if (this.f6479u != null && AbstractC2436a.m4341p(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f6464K && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f6479u = AbstractC0715d.m1542D(context3, R.drawable.mtrl_checkbox_button);
                this.f6481w = true;
                if (this.f6480v == null) {
                    this.f6480v = AbstractC0715d.m1542D(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f6483y = AbstractC2429w.m4300e(context3, c0073c, 3);
        this.f6484z = AbstractC2374l.m4216f(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f6475q = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f6476r = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f6477s = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f6478t = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(AbstractC2429w.m4300e(context3, c0073c, 10));
        }
        c0073c.m275I();
        m3381a();
    }

    private String getButtonStateDescription() {
        int i = this.f6465A;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6474p == null) {
            int iM1509X = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorControlActivated));
            int iM1509X2 = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorError));
            int iM1509X3 = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorSurface));
            int iM1509X4 = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorOnSurface));
            this.f6474p = new ColorStateList(f6463J, new int[]{AbstractC0714c.m1503P(1.0f, iM1509X3, iM1509X2), AbstractC0714c.m1503P(1.0f, iM1509X3, iM1509X), AbstractC0714c.m1503P(0.54f, iM1509X3, iM1509X4), AbstractC0714c.m1503P(0.38f, iM1509X3, iM1509X4), AbstractC0714c.m1503P(0.38f, iM1509X3, iM1509X4)});
        }
        return this.f6474p;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f6482x;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    /* renamed from: a */
    public final void m3381a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0614n c0614n;
        Drawable drawableMutate = this.f6479u;
        ColorStateList colorStateList3 = this.f6482x;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f6479u = drawableMutate;
        Drawable drawableMutate2 = this.f6480v;
        ColorStateList colorStateList4 = this.f6483y;
        PorterDuff.Mode mode = this.f6484z;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f6480v = drawableMutate2;
        if (this.f6481w) {
            C0868f c0868f = this.f6470F;
            if (c0868f != null) {
                C0866d c0866d = c0868f.f3813k;
                Drawable drawable = c0868f.f3818j;
                C1681a c1681a = this.f6471G;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1681a.f6458a == null) {
                        c1681a.f6458a = new C0864b(c1681a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1681a.f6458a);
                }
                ArrayList arrayList = c0868f.f3816n;
                if (arrayList != null && c1681a != null) {
                    arrayList.remove(c1681a);
                    if (c0868f.f3816n.size() == 0 && (c0614n = c0868f.f3815m) != null) {
                        c0866d.f3808b.removeListener(c0614n);
                        c0868f.f3815m = null;
                    }
                }
                Drawable drawable2 = c0868f.f3818j;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1681a.f6458a == null) {
                        c1681a.f6458a = new C0864b(c1681a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1681a.f6458a);
                } else if (c1681a != null) {
                    if (c0868f.f3816n == null) {
                        c0868f.f3816n = new ArrayList();
                    }
                    if (!c0868f.f3816n.contains(c1681a)) {
                        c0868f.f3816n.add(c1681a);
                        if (c0868f.f3815m == null) {
                            c0868f.f3815m = new C0614n(2, c0868f);
                        }
                        c0866d.f3808b.addListener(c0868f.f3815m);
                    }
                }
            }
            Drawable drawable3 = this.f6479u;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0868f != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0868f, false);
                ((AnimatedStateListDrawable) this.f6479u).addTransition(R.id.indeterminate, R.id.unchecked, c0868f, false);
            }
        }
        Drawable drawable4 = this.f6479u;
        if (drawable4 != null && (colorStateList2 = this.f6482x) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f6480v;
        if (drawable5 != null && (colorStateList = this.f6483y) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f6479u;
        Drawable drawable7 = this.f6480v;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f8 = intrinsicWidth / intrinsicHeight;
                if (f8 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f8);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f8 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f6479u;
    }

    public Drawable getButtonIconDrawable() {
        return this.f6480v;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f6483y;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f6484z;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f6482x;
    }

    public int getCheckedState() {
        return this.f6465A;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f6478t;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f6465A == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6475q && this.f6482x == null && this.f6483y == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6461H);
        }
        if (this.f6477s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6462I);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i8 = iArrOnCreateDrawableState[i4];
            if (i8 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i8 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f6466B = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f6476r || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f6477s) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f6478t));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1682b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1682b c1682b = (C1682b) parcelable;
        super.onRestoreInstanceState(c1682b.getSuperState());
        setCheckedState(c1682b.f6460j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1682b c1682b = new C1682b(super.onSaveInstanceState());
        c1682b.f6460j = getCheckedState();
        return c1682b;
    }

    @Override // p104m.C1764r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f6480v = drawable;
        m3381a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f6483y == colorStateList) {
            return;
        }
        this.f6483y = colorStateList;
        m3381a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f6484z == mode) {
            return;
        }
        this.f6484z = mode;
        m3381a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f6482x == colorStateList) {
            return;
        }
        this.f6482x = colorStateList;
        m3381a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m3381a();
    }

    public void setCenterIfNoTextEnabled(boolean z7) {
        this.f6476r = z7;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedState(z7 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6465A != i) {
            this.f6465A = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && this.f6468D == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f6467C) {
                return;
            }
            this.f6467C = true;
            LinkedHashSet linkedHashSet = this.f6473o;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f6465A != 2 && (onCheckedChangeListener = this.f6469E) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i4 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f6467C = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f6478t = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z7) {
        if (this.f6477s == z7) {
            return;
        }
        this.f6477s = z7;
        refreshDrawableState();
        Iterator it = this.f6472n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6469E = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f6468D = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f6475q = z7;
        if (z7) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p104m.C1764r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f6479u = drawable;
        this.f6481w = false;
        m3381a();
    }
}
