package p004a3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0140j;
import com.bumptech.glide.AbstractC0715d;
import java.util.LinkedHashSet;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p104m.AbstractC1714e1;
import p104m.C1767s;
import p105m0.AbstractC1828m0;
import p120o.C2031c;
import p120o.C2034f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a3.e */
/* loaded from: classes.dex */
public final class C0067e {

    /* renamed from: a */
    public boolean f306a;

    /* renamed from: b */
    public boolean f307b;

    /* renamed from: c */
    public boolean f308c;

    /* renamed from: d */
    public final Object f309d;

    /* renamed from: e */
    public Parcelable f310e;

    /* renamed from: f */
    public Object f311f;

    public /* synthetic */ C0067e(TextView textView) {
        this.f310e = null;
        this.f311f = null;
        this.f306a = false;
        this.f307b = false;
        this.f309d = textView;
    }

    /* renamed from: a */
    public void m250a() {
        CompoundButton compoundButton = (CompoundButton) this.f309d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f306a || this.f307b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f306a) {
                    drawableMutate.setTintList((ColorStateList) this.f310e);
                }
                if (this.f307b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f311f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public void m251b() {
        C1767s c1767s = (C1767s) this.f309d;
        Drawable checkMarkDrawable = c1767s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f306a || this.f307b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f306a) {
                    drawableMutate.setTintList((ColorStateList) this.f310e);
                }
                if (this.f307b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f311f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1767s.getDrawableState());
                }
                c1767s.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m252c(String str) {
        if (!this.f307b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f310e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f310e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f310e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f310e = null;
        return bundle2;
    }

    /* renamed from: d */
    public void m253d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f309d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1026a.f4320m;
        C0073c c0073cM263F = C0073c.m263F(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        AbstractC1828m0.m3607l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0715d.m1542D(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0715d.m1542D(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c0073cM263F.m298w(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC1714e1.m3393b(typedArray.getInt(3, -1), null));
            }
            c0073cM263F.m275I();
        } catch (Throwable th) {
            c0073cM263F.m275I();
            throw th;
        }
    }

    /* renamed from: e */
    public void m254e(String str, InterfaceC0066d interfaceC0066d) {
        Object obj;
        AbstractC2980h.m5136e("provider", interfaceC0066d);
        C2034f c2034f = (C2034f) this.f309d;
        C2031c c2031cMo3921a = c2034f.mo3921a(str);
        if (c2031cMo3921a != null) {
            obj = c2031cMo3921a.f7493k;
        } else {
            C2031c c2031c = new C2031c(str, interfaceC0066d);
            c2034f.f7502m++;
            C2031c c2031c2 = c2034f.f7500k;
            if (c2031c2 == null) {
                c2034f.f7499j = c2031c;
                c2034f.f7500k = c2031c;
            } else {
                c2031c2.f7494l = c2031c;
                c2031c.f7495m = c2031c2;
                c2034f.f7500k = c2031c;
            }
            obj = null;
        }
        if (((InterfaceC0066d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: f */
    public void m255f() throws NoSuchMethodException, SecurityException {
        if (!this.f308c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0063a c0063a = (C0063a) this.f311f;
        if (c0063a == null) {
            c0063a = new C0063a(this);
        }
        this.f311f = c0063a;
        try {
            C0140j.class.getDeclaredConstructor(null);
            C0063a c0063a2 = (C0063a) this.f311f;
            if (c0063a2 != null) {
                ((LinkedHashSet) c0063a2.f303b).add(C0140j.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0140j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public C0067e() {
        this.f309d = new C2034f();
        this.f308c = true;
    }
}
