package p104m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.bumptech.glide.AbstractC0715d;
import p005a4.C0073c;
import p071i1.C1240s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.o */
/* loaded from: classes.dex */
public class C1752o extends AutoCompleteTextView {

    /* renamed from: m */
    public static final int[] f6685m = {R.attr.popupBackground};

    /* renamed from: j */
    public final C1240s f6686j;

    /* renamed from: k */
    public final C1768s0 f6687k;

    /* renamed from: l */
    public final C1701b0 f6688l;

    public C1752o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.exotv.net.R.attr.autoCompleteTextViewStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C0073c c0073cM263F = C0073c.m263F(com.exotv.net.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f6685m);
        if (((TypedArray) c0073cM263F.f325l).hasValue(0)) {
            setDropDownBackgroundDrawable(c0073cM263F.m299x(0));
        }
        c0073cM263F.m275I();
        C1240s c1240s = new C1240s(this);
        this.f6686j = c1240s;
        c1240s.m2703m(attributeSet, com.exotv.net.R.attr.autoCompleteTextViewStyle);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6687k = c1768s0;
        c1768s0.m3445h(attributeSet, com.exotv.net.R.attr.autoCompleteTextViewStyle);
        c1768s0.m3441b();
        C1701b0 c1701b0 = new C1701b0(this);
        this.f6688l = c1701b0;
        c1701b0.mo3384b(attributeSet, com.exotv.net.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM3383a = c1701b0.m3383a(keyListener);
        if (keyListenerM3383a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3383a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6687k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0120b.m406Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6687k.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6687k.m3444g();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0715d.m1552U(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f6688l.m3385c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6687k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6687k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0120b.m407R(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f6688l.m3386d(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6688l.m3383a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6686j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6687k;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6687k;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1768s0 c1768s0 = this.f6687k;
        if (c1768s0 != null) {
            c1768s0.m3446i(context, i);
        }
    }
}
