package p017b6;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.exotv.net.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import okhttp3.C2181z;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p104m.C1752o;
import p104m.C1772t1;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p211y5.C2823j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.a0 */
/* loaded from: classes.dex */
public final class C0592a0 extends C1752o {

    /* renamed from: n */
    public final C1772t1 f2362n;

    /* renamed from: o */
    public final AccessibilityManager f2363o;

    /* renamed from: p */
    public final int[] f2364p;

    /* renamed from: q */
    public final Rect f2365q;

    /* renamed from: r */
    public final int f2366r;

    /* renamed from: s */
    public final float f2367s;

    /* renamed from: t */
    public ColorStateList f2368t;

    /* renamed from: u */
    public int f2369u;

    /* renamed from: v */
    public ColorStateList f2370v;

    public C0592a0(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2364p = new int[]{android.R.attr.state_selected};
        this.f2365q = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3748j, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM4215e.hasValue(0) && typedArrayM4215e.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2366r = typedArrayM4215e.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f2367s = typedArrayM4215e.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM4215e.hasValue(2)) {
            this.f2368t = ColorStateList.valueOf(typedArrayM4215e.getColor(2, 0));
        }
        this.f2369u = typedArrayM4215e.getColor(4, 0);
        this.f2370v = AbstractC2429w.m4301f(context2, typedArrayM4215e, 5);
        this.f2363o = (AccessibilityManager) context2.getSystemService("accessibility");
        C1772t1 c1772t1 = new C1772t1(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f2362n = c1772t1;
        c1772t1.f6759H = true;
        c1772t1.f6760I.setFocusable(true);
        c1772t1.f6775x = this;
        c1772t1.f6760I.setInputMethodMode(2);
        c1772t1.mo3411p(getAdapter());
        c1772t1.f6776y = new C0625y(0, this);
        if (typedArrayM4215e.hasValue(6)) {
            setSimpleItems(typedArrayM4215e.getResourceId(6, 0));
        }
        typedArrayM4215e.recycle();
    }

    /* renamed from: b */
    public final TextInputLayout m1337b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m1338c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f2363o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m1338c()) {
            this.f2362n.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2368t;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM1337b = m1337b();
        return (textInputLayoutM1337b == null || !textInputLayoutM1337b.f3433O) ? super.getHint() : textInputLayoutM1337b.getHint();
    }

    public float getPopupElevation() {
        return this.f2367s;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2369u;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f2370v;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        C1772t1 c1772t1 = this.f2362n;
        if (c1772t1 == null || !c1772t1.f6760I.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM1337b = m1337b();
        if (textInputLayoutM1337b != null && textInputLayoutM1337b.f3433O && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : C2181z.FRAGMENT_ENCODE_SET).equals("meizu")) {
                setHint(C2181z.FRAGMENT_ENCODE_SET);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2362n.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z7 = i == 66 || i == 23;
        boolean z8 = i == 62;
        if (getKeyListener() == null ? !(z7 || z8) : !(z7 && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout textInputLayoutM1337b = m1337b();
        if (textInputLayoutM1337b != null) {
            textInputLayoutM1337b.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM1337b = m1337b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM1337b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1772t1 c1772t1 = this.f2362n;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c1772t1.f6760I.isShowing() ? -1 : c1772t1.f6763l.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM1337b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c1772t1.f6760I.getBackground();
                if (background != null) {
                    Rect rect = this.f2365q;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM1337b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        if (m1338c()) {
            return;
        }
        super.onWindowFocusChanged(z7);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f2362n.mo3411p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1772t1 c1772t1 = this.f2362n;
        if (c1772t1 != null) {
            c1772t1.m3461j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f2368t = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C2823j) {
            ((C2823j) dropDownBackground).m4945q(this.f2368t);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2362n.f6777z = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM1337b = m1337b();
        if (textInputLayoutM1337b != null) {
            textInputLayoutM1337b.m1911u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f2369u = i;
        if (getAdapter() instanceof C0626z) {
            ((C0626z) getAdapter()).m1417a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f2370v = colorStateList;
        if (getAdapter() instanceof C0626z) {
            ((C0626z) getAdapter()).m1417a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m1338c()) {
            this.f2362n.mo3275f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0626z(this, getContext(), this.f2366r, strArr));
    }
}
