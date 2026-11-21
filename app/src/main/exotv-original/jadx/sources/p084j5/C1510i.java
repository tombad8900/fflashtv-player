package p084j5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import p171t5.AbstractC2436a;
import p175u0.C2455g;
import p196w5.AbstractC2703a;
import p211y5.C2821h;
import p211y5.C2823j;
import p211y5.InterfaceC2826m;
import p211y5.InterfaceC2839z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j5.i */
/* loaded from: classes.dex */
public final class C1510i {

    /* renamed from: a */
    public final MaterialButton f5793a;

    /* renamed from: b */
    public InterfaceC2826m f5794b;

    /* renamed from: c */
    public C2455g f5795c;

    /* renamed from: d */
    public C0456a f5796d;

    /* renamed from: e */
    public int f5797e;

    /* renamed from: f */
    public int f5798f;

    /* renamed from: g */
    public int f5799g;

    /* renamed from: h */
    public int f5800h;

    /* renamed from: i */
    public int f5801i;

    /* renamed from: j */
    public int f5802j;

    /* renamed from: k */
    public PorterDuff.Mode f5803k;

    /* renamed from: l */
    public ColorStateList f5804l;

    /* renamed from: m */
    public ColorStateList f5805m;

    /* renamed from: n */
    public ColorStateList f5806n;

    /* renamed from: o */
    public C2823j f5807o;

    /* renamed from: s */
    public boolean f5811s;

    /* renamed from: u */
    public RippleDrawable f5813u;

    /* renamed from: v */
    public int f5814v;

    /* renamed from: p */
    public boolean f5808p = false;

    /* renamed from: q */
    public boolean f5809q = false;

    /* renamed from: r */
    public boolean f5810r = false;

    /* renamed from: t */
    public boolean f5812t = true;

    public C1510i(MaterialButton materialButton, InterfaceC2826m interfaceC2826m) {
        this.f5793a = materialButton;
        this.f5794b = interfaceC2826m;
    }

    /* renamed from: a */
    public final C2823j m3193a(boolean z7) {
        RippleDrawable rippleDrawable = this.f5813u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2823j) ((LayerDrawable) ((InsetDrawable) this.f5813u.getDrawable(0)).getDrawable()).getDrawable(!z7 ? 1 : 0);
    }

    /* renamed from: b */
    public final void m3194b(int i, int i4, int i8, int i9) {
        MaterialButton materialButton = this.f5793a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.f5797e;
        int i11 = this.f5799g;
        int i12 = this.f5798f;
        int i13 = this.f5800h;
        this.f5797e = i;
        this.f5799g = i4;
        this.f5798f = i8;
        this.f5800h = i9;
        if (!this.f5809q) {
            m3195c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i10, (paddingTop + i4) - i11, (paddingEnd + i8) - i12, (paddingBottom + i9) - i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3195c() {
        C2823j c2823j = new C2823j(this.f5794b);
        C2455g c2455g = this.f5795c;
        if (c2455g != null) {
            c2823j.m4943o(c2455g);
        }
        C0456a c0456a = this.f5796d;
        if (c0456a != null) {
            c2823j.f10490M = c0456a;
        }
        MaterialButton materialButton = this.f5793a;
        Context context = materialButton.getContext();
        c2823j.m4941m(context);
        c2823j.setTintList(this.f5804l);
        PorterDuff.Mode mode = this.f5803k;
        if (mode != null) {
            c2823j.setTintMode(mode);
        }
        float f8 = this.f5802j;
        ColorStateList colorStateList = this.f5805m;
        c2823j.f10492k.f10468j = f8;
        c2823j.invalidateSelf();
        C2821h c2821h = c2823j.f10492k;
        if (c2821h.f10462d != colorStateList) {
            c2821h.f10462d = colorStateList;
            c2823j.onStateChange(c2823j.getState());
        }
        C2823j c2823j2 = new C2823j(this.f5794b);
        C2455g c2455g2 = this.f5795c;
        if (c2455g2 != null) {
            c2823j2.m4943o(c2455g2);
        }
        int i = 0;
        c2823j2.setTint(0);
        float f9 = this.f5802j;
        int iM1509X = this.f5808p ? AbstractC0714c.m1509X(materialButton.getContext(), AbstractC2436a.m4345t(materialButton, R.attr.colorSurface)) : 0;
        c2823j2.f10492k.f10468j = f9;
        c2823j2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM1509X);
        C2821h c2821h2 = c2823j2.f10492k;
        if (c2821h2.f10462d != colorStateListValueOf) {
            c2821h2.f10462d = colorStateListValueOf;
            c2823j2.onStateChange(c2823j2.getState());
        }
        C2823j c2823j3 = new C2823j(this.f5794b);
        this.f5807o = c2823j3;
        C2455g c2455g3 = this.f5795c;
        if (c2455g3 != null) {
            c2823j3.m4943o(c2455g3);
        }
        this.f5807o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2703a.m4755a(this.f5806n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2823j2, c2823j}), this.f5797e, this.f5799g, this.f5798f, this.f5800h), this.f5807o);
        this.f5813u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.m1880e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f5813u);
        C2823j c2823jM3193a = m3193a(false);
        if (c2823jM3193a != null) {
            c2823jM3193a.m4944p(this.f5814v);
            c2823jM3193a.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable = ((DrawableWrapper) background).getDrawable();
            if (drawable instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable;
            } else if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f3348q = new WeakReference(c2823jM3193a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3196d() {
        InterfaceC2839z interfaceC2839z;
        C2823j c2823jM3193a = m3193a(false);
        if (c2823jM3193a != null) {
            c2823jM3193a.m4946r(this.f5794b);
            C2455g c2455g = this.f5795c;
            if (c2455g != null) {
                c2823jM3193a.m4943o(c2455g);
            }
        }
        C2823j c2823jM3193a2 = m3193a(true);
        if (c2823jM3193a2 != null) {
            c2823jM3193a2.m4946r(this.f5794b);
            C2455g c2455g2 = this.f5795c;
            if (c2455g2 != null) {
                c2823jM3193a2.m4943o(c2455g2);
            }
        }
        RippleDrawable rippleDrawable = this.f5813u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            interfaceC2839z = objFindDrawableByLayerId instanceof InterfaceC2839z ? (InterfaceC2839z) objFindDrawableByLayerId : null;
        }
        if (interfaceC2839z != null) {
            if (!(interfaceC2839z instanceof C2823j)) {
                interfaceC2839z.setShapeAppearanceModel(this.f5794b.mo4922d());
                return;
            }
            C2823j c2823j = (C2823j) interfaceC2839z;
            c2823j.m4946r(this.f5794b);
            C2455g c2455g3 = this.f5795c;
            if (c2455g3 != null) {
                c2823j.m4943o(c2455g3);
            }
        }
    }

    /* renamed from: e */
    public final void m3197e() {
        int iM1509X = 0;
        C2823j c2823jM3193a = m3193a(false);
        C2823j c2823jM3193a2 = m3193a(true);
        if (c2823jM3193a != null) {
            float f8 = this.f5802j;
            ColorStateList colorStateList = this.f5805m;
            c2823jM3193a.f10492k.f10468j = f8;
            c2823jM3193a.invalidateSelf();
            C2821h c2821h = c2823jM3193a.f10492k;
            if (c2821h.f10462d != colorStateList) {
                c2821h.f10462d = colorStateList;
                c2823jM3193a.onStateChange(c2823jM3193a.getState());
            }
            if (c2823jM3193a2 != null) {
                float f9 = this.f5802j;
                if (this.f5808p) {
                    MaterialButton materialButton = this.f5793a;
                    iM1509X = AbstractC0714c.m1509X(materialButton.getContext(), AbstractC2436a.m4345t(materialButton, R.attr.colorSurface));
                }
                c2823jM3193a2.f10492k.f10468j = f9;
                c2823jM3193a2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM1509X);
                C2821h c2821h2 = c2823jM3193a2.f10492k;
                if (c2821h2.f10462d != colorStateListValueOf) {
                    c2821h2.f10462d = colorStateListValueOf;
                    c2823jM3193a2.onStateChange(c2823jM3193a2.getState());
                }
            }
        }
    }
}
