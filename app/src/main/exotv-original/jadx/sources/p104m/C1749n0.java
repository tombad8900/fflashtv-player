package p104m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.bumptech.glide.AbstractC0715d;
import java.util.Objects;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p071i1.C1240s;
import p087k.C1538c;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC1615d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.n0 */
/* loaded from: classes.dex */
public final class C1749n0 extends Spinner {

    /* renamed from: r */
    public static final int[] f6649r = {R.attr.spinnerMode};

    /* renamed from: j */
    public final C1240s f6650j;

    /* renamed from: k */
    public final Context f6651k;

    /* renamed from: l */
    public final C1721g0 f6652l;

    /* renamed from: m */
    public SpinnerAdapter f6653m;

    /* renamed from: n */
    public final boolean f6654n;

    /* renamed from: o */
    public final InterfaceC1745m0 f6655o;

    /* renamed from: p */
    public int f6656p;

    /* renamed from: q */
    public final Rect f6657q;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1749n0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.exotv.net.R.attr.spinnerStyle);
        this.f6657q = new Rect();
        AbstractC1707c2.m3388a(this, getContext());
        int[] iArr = AbstractC1026a.f4328u;
        C0073c c0073cM263F = C0073c.m263F(com.exotv.net.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        this.f6650j = new C1240s(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f6651k = new C1538c(context, resourceId);
        } else {
            this.f6651k = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6649r, com.exotv.net.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c0073cM263F.m275I();
                    this.f6654n = true;
                    spinnerAdapter = this.f6653m;
                    if (spinnerAdapter != null) {
                    }
                    this.f6650j.m2703m(attributeSet, com.exotv.net.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC1725h0 dialogInterfaceOnClickListenerC1725h0 = new DialogInterfaceOnClickListenerC1725h0(this);
            this.f6655o = dialogInterfaceOnClickListenerC1725h0;
            dialogInterfaceOnClickListenerC1725h0.f6558l = typedArray.getString(2);
        } else if (i == 1) {
            C1737k0 c1737k0 = new C1737k0(this, this.f6651k, attributeSet);
            C0073c c0073cM263F2 = C0073c.m263F(com.exotv.net.R.attr.spinnerStyle, 0, this.f6651k, attributeSet, iArr);
            this.f6656p = ((TypedArray) c0073cM263F2.f325l).getLayoutDimension(3, -2);
            c1737k0.m3461j(c0073cM263F2.m299x(1));
            c1737k0.f6607L = typedArray.getString(2);
            c0073cM263F2.m275I();
            this.f6655o = c1737k0;
            this.f6652l = new C1721g0(this, this, c1737k0);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.exotv.net.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0073cM263F.m275I();
        this.f6654n = true;
        spinnerAdapter = this.f6653m;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f6653m = null;
        }
        this.f6650j.m2703m(attributeSet, com.exotv.net.R.attr.spinnerStyle);
    }

    /* renamed from: a */
    public final int m3423a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f6657q;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        return interfaceC1745m0 != null ? interfaceC1745m0.mo3401b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        return interfaceC1745m0 != null ? interfaceC1745m0.mo3410o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f6655o != null ? this.f6656p : super.getDropDownWidth();
    }

    public final InterfaceC1745m0 getInternalPopup() {
        return this.f6655o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        return interfaceC1745m0 != null ? interfaceC1745m0.mo3404g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f6651k;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        return interfaceC1745m0 != null ? interfaceC1745m0.mo3403e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 == null || !interfaceC1745m0.mo3400a()) {
            return;
        }
        interfaceC1745m0.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f6655o == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m3423a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1741l0 c1741l0 = (C1741l0) parcelable;
        super.onRestoreInstanceState(c1741l0.getSuperState());
        if (!c1741l0.f6616j || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1615d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1741l0 c1741l0 = new C1741l0(super.onSaveInstanceState());
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        c1741l0.f6616j = interfaceC1745m0 != null && interfaceC1745m0.mo3400a();
        return c1741l0;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1721g0 c1721g0 = this.f6652l;
        if (c1721g0 == null || !c1721g0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 == null) {
            return super.performClick();
        }
        if (interfaceC1745m0.mo3400a()) {
            return true;
        }
        interfaceC1745m0.mo3409m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1745m0.mo3408l(i);
            interfaceC1745m0.mo3402c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 != null) {
            interfaceC1745m0.mo3407k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f6655o != null) {
            this.f6656p = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 != null) {
            interfaceC1745m0.mo3406j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0715d.m1542D(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 != null) {
            interfaceC1745m0.mo3405i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6650j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6654n) {
            this.f6653m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1745m0 interfaceC1745m0 = this.f6655o;
        if (interfaceC1745m0 != null) {
            Context context = this.f6651k;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1729i0 c1729i0 = new C1729i0();
            c1729i0.f6565a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1729i0.f6566b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            interfaceC1745m0.mo3411p(c1729i0);
        }
    }
}
