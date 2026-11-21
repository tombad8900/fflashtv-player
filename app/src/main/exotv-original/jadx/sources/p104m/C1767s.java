package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import p004a3.C0067e;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p071i1.C1240s;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.s */
/* loaded from: classes.dex */
public final class C1767s extends CheckedTextView {

    /* renamed from: j */
    public final C0067e f6728j;

    /* renamed from: k */
    public final C1240s f6729k;

    /* renamed from: l */
    public final C1768s0 f6730l;

    /* renamed from: m */
    public C1779w f6731m;

    public C1767s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6730l = c1768s0;
        c1768s0.m3445h(attributeSet, R.attr.checkedTextViewStyle);
        c1768s0.m3441b();
        C1240s c1240s = new C1240s(this);
        this.f6729k = c1240s;
        c1240s.m2703m(attributeSet, R.attr.checkedTextViewStyle);
        this.f6728j = new C0067e(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1026a.f4319l;
        C0073c c0073cM263F = C0073c.m263F(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        AbstractC1828m0.m3607l(this, getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0715d.m1542D(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0715d.m1542D(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0073cM263F.m298w(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1714e1.m3393b(typedArray.getInt(3, -1), null));
            }
            c0073cM263F.m275I();
            getEmojiTextViewHelper().m3468a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0073cM263F.m275I();
            throw th;
        }
    }

    private C1779w getEmojiTextViewHelper() {
        if (this.f6731m == null) {
            this.f6731m = new C1779w(this);
        }
        return this.f6731m;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1768s0 c1768s0 = this.f6730l;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            c0067e.m251b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0120b.m406Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            return (ColorStateList) c0067e.f310e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            return (PorterDuff.Mode) c0067e.f311f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6730l.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6730l.m3444g();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0715d.m1552U(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m3469b(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            if (c0067e.f308c) {
                c0067e.f308c = false;
            } else {
                c0067e.f308c = true;
                c0067e.m251b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6730l;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6730l;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0120b.m407R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m3470c(z7);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6729k;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            c0067e.f310e = colorStateList;
            c0067e.f306a = true;
            c0067e.m251b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0067e c0067e = this.f6728j;
        if (c0067e != null) {
            c0067e.f311f = mode;
            c0067e.f307b = true;
            c0067e.m251b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6730l;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6730l;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1768s0 c1768s0 = this.f6730l;
        if (c1768s0 != null) {
            c1768s0.m3446i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0715d.m1542D(getContext(), i));
    }
}
