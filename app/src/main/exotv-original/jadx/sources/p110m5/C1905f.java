package p110m5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import okhttp3.C2181z;
import p037e0.AbstractC0850a;
import p042e5.C0911b;
import p046f0.InterfaceC0929b;
import p162s5.C2372j;
import p162s5.InterfaceC2371i;
import p187v5.C2552d;
import p196w5.AbstractC2703a;
import p211y5.C2820g;
import p211y5.C2821h;
import p211y5.C2823j;
import p211y5.C2828o;
import p211y5.C2830q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m5.f */
/* loaded from: classes.dex */
public final class C1905f extends C2823j implements Drawable.Callback, InterfaceC2371i {

    /* renamed from: X0 */
    public static final int[] f7115X0 = {R.attr.state_enabled};

    /* renamed from: Y0 */
    public static final ShapeDrawable f7116Y0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    public final PointF f7117A0;

    /* renamed from: B0 */
    public final Path f7118B0;

    /* renamed from: C0 */
    public final C2372j f7119C0;

    /* renamed from: D0 */
    public int f7120D0;

    /* renamed from: E0 */
    public int f7121E0;

    /* renamed from: F0 */
    public int f7122F0;

    /* renamed from: G0 */
    public int f7123G0;

    /* renamed from: H0 */
    public int f7124H0;

    /* renamed from: I0 */
    public int f7125I0;

    /* renamed from: J0 */
    public boolean f7126J0;

    /* renamed from: K0 */
    public int f7127K0;

    /* renamed from: L0 */
    public int f7128L0;

    /* renamed from: M0 */
    public ColorFilter f7129M0;

    /* renamed from: N0 */
    public PorterDuffColorFilter f7130N0;

    /* renamed from: O0 */
    public ColorStateList f7131O0;

    /* renamed from: P */
    public ColorStateList f7132P;

    /* renamed from: P0 */
    public PorterDuff.Mode f7133P0;

    /* renamed from: Q */
    public ColorStateList f7134Q;

    /* renamed from: Q0 */
    public int[] f7135Q0;

    /* renamed from: R */
    public float f7136R;

    /* renamed from: R0 */
    public ColorStateList f7137R0;

    /* renamed from: S */
    public float f7138S;

    /* renamed from: S0 */
    public WeakReference f7139S0;

    /* renamed from: T */
    public ColorStateList f7140T;

    /* renamed from: T0 */
    public TextUtils.TruncateAt f7141T0;

    /* renamed from: U */
    public float f7142U;

    /* renamed from: U0 */
    public boolean f7143U0;

    /* renamed from: V */
    public ColorStateList f7144V;

    /* renamed from: V0 */
    public int f7145V0;

    /* renamed from: W */
    public CharSequence f7146W;

    /* renamed from: W0 */
    public boolean f7147W0;

    /* renamed from: X */
    public boolean f7148X;

    /* renamed from: Y */
    public Drawable f7149Y;

    /* renamed from: Z */
    public ColorStateList f7150Z;

    /* renamed from: a0 */
    public float f7151a0;

    /* renamed from: b0 */
    public boolean f7152b0;

    /* renamed from: c0 */
    public boolean f7153c0;

    /* renamed from: d0 */
    public Drawable f7154d0;

    /* renamed from: e0 */
    public RippleDrawable f7155e0;

    /* renamed from: f0 */
    public ColorStateList f7156f0;

    /* renamed from: g0 */
    public float f7157g0;

    /* renamed from: h0 */
    public SpannableStringBuilder f7158h0;

    /* renamed from: i0 */
    public boolean f7159i0;

    /* renamed from: j0 */
    public boolean f7160j0;

    /* renamed from: k0 */
    public Drawable f7161k0;

    /* renamed from: l0 */
    public ColorStateList f7162l0;

    /* renamed from: m0 */
    public C0911b f7163m0;

    /* renamed from: n0 */
    public C0911b f7164n0;

    /* renamed from: o0 */
    public float f7165o0;

    /* renamed from: p0 */
    public float f7166p0;

    /* renamed from: q0 */
    public float f7167q0;

    /* renamed from: r0 */
    public float f7168r0;

    /* renamed from: s0 */
    public float f7169s0;

    /* renamed from: t0 */
    public float f7170t0;

    /* renamed from: u0 */
    public float f7171u0;

    /* renamed from: v0 */
    public float f7172v0;

    /* renamed from: w0 */
    public final Context f7173w0;

    /* renamed from: x0 */
    public final Paint f7174x0;

    /* renamed from: y0 */
    public final Paint.FontMetrics f7175y0;

    /* renamed from: z0 */
    public final RectF f7176z0;

    public C1905f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action);
        this.f7138S = -1.0f;
        this.f7174x0 = new Paint(1);
        this.f7175y0 = new Paint.FontMetrics();
        this.f7176z0 = new RectF();
        this.f7117A0 = new PointF();
        this.f7118B0 = new Path();
        this.f7128L0 = 255;
        this.f7133P0 = PorterDuff.Mode.SRC_IN;
        this.f7139S0 = new WeakReference(null);
        m4941m(context);
        this.f7173w0 = context;
        C2372j c2372j = new C2372j(this);
        this.f7119C0 = c2372j;
        this.f7146W = C2181z.FRAGMENT_ENCODE_SET;
        c2372j.f8365a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f7115X0;
        setState(iArr);
        m3701U(iArr);
        this.f7143U0 = true;
        f7116Y0.setTint(-1);
    }

    /* renamed from: B */
    public static boolean m3680B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: C */
    public static boolean m3681C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: e0 */
    public static void m3682e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: A */
    public final float m3683A() {
        if (!this.f7147W0) {
            return this.f7138S;
        }
        float[] fArr = this.f10488K;
        return fArr != null ? fArr[3] : this.f10492k.f10459a.mo4922d().f10525e.mo4909a(m4935g());
    }

    /* renamed from: D */
    public final void m3684D() {
        InterfaceC1904e interfaceC1904e = (InterfaceC1904e) this.f7139S0.get();
        if (interfaceC1904e != null) {
            Chip chip = (Chip) interfaceC1904e;
            chip.m1835b(chip.f3222y);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3685E(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z7;
        boolean z8;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f7132P;
        int iM4932c = m4932c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7120D0) : 0);
        boolean state = true;
        if (this.f7120D0 != iM4932c) {
            this.f7120D0 = iM4932c;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7134Q;
        int iM4932c2 = m4932c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7121E0) : 0);
        if (this.f7121E0 != iM4932c2) {
            this.f7121E0 = iM4932c2;
            zOnStateChange = true;
        }
        int iM2017b = AbstractC0850a.m2017b(iM4932c2, iM4932c);
        if ((this.f7122F0 != iM2017b) | (this.f10492k.f10461c == null)) {
            this.f7122F0 = iM2017b;
            m4945q(ColorStateList.valueOf(iM2017b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f7140T;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7123G0) : 0;
        if (this.f7123G0 != colorForState2) {
            this.f7123G0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f7137R0 != null) {
            int[] iArr3 = AbstractC2703a.f9820a;
            boolean z9 = false;
            boolean z10 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z9 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z10 = true;
                }
            }
            colorForState = (z9 && z10) ? this.f7137R0.getColorForState(iArr, this.f7124H0) : 0;
        }
        if (this.f7124H0 != colorForState) {
            this.f7124H0 = colorForState;
        }
        C2552d c2552d = this.f7119C0.f8370f;
        int colorForState3 = (c2552d == null || (colorStateList = c2552d.f9261k) == null) ? 0 : colorStateList.getColorForState(iArr, this.f7125I0);
        if (this.f7125I0 != colorForState3) {
            this.f7125I0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z7 = false;
        } else {
            int length = state2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (state2[i4] != 16842912) {
                    i4++;
                } else if (this.f7159i0) {
                    z7 = true;
                }
            }
            z7 = false;
        }
        if (this.f7126J0 == z7 || this.f7161k0 == null) {
            z8 = false;
        } else {
            float fM3713y = m3713y();
            this.f7126J0 = z7;
            if (fM3713y != m3713y()) {
                zOnStateChange = true;
                z8 = true;
            } else {
                z8 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f7131O0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f7127K0) : 0;
        if (this.f7127K0 != colorForState4) {
            this.f7127K0 = colorForState4;
            ColorStateList colorStateList6 = this.f7131O0;
            PorterDuff.Mode mode = this.f7133P0;
            this.f7130N0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m3681C(this.f7149Y)) {
            state |= this.f7149Y.setState(iArr);
        }
        if (m3681C(this.f7161k0)) {
            state |= this.f7161k0.setState(iArr);
        }
        if (m3681C(this.f7154d0)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.f7154d0.setState(iArr4);
        }
        if (m3681C(this.f7155e0)) {
            state |= this.f7155e0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z8) {
            m3684D();
        }
        return state;
    }

    /* renamed from: F */
    public final void m3686F(boolean z7) {
        if (this.f7159i0 != z7) {
            this.f7159i0 = z7;
            float fM3713y = m3713y();
            if (!z7 && this.f7126J0) {
                this.f7126J0 = false;
            }
            float fM3713y2 = m3713y();
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: G */
    public final void m3687G(Drawable drawable) {
        if (this.f7161k0 != drawable) {
            float fM3713y = m3713y();
            this.f7161k0 = drawable;
            float fM3713y2 = m3713y();
            m3682e0(this.f7161k0);
            m3711w(this.f7161k0);
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: H */
    public final void m3688H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f7162l0 != colorStateList) {
            this.f7162l0 = colorStateList;
            if (this.f7160j0 && (drawable = this.f7161k0) != null && this.f7159i0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: I */
    public final void m3689I(boolean z7) {
        if (this.f7160j0 != z7) {
            boolean zM3708b0 = m3708b0();
            this.f7160j0 = z7;
            boolean zM3708b02 = m3708b0();
            if (zM3708b0 != zM3708b02) {
                if (zM3708b02) {
                    m3711w(this.f7161k0);
                } else {
                    m3682e0(this.f7161k0);
                }
                invalidateSelf();
                m3684D();
            }
        }
    }

    /* renamed from: J */
    public final void m3690J(float f8) {
        if (this.f7138S != f8) {
            this.f7138S = f8;
            setShapeAppearanceModel(m4937i().mo4919a(f8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final void m3691K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7149Y;
        if (drawable3 != 0) {
            boolean z7 = drawable3 instanceof InterfaceC0929b;
            drawable2 = drawable3;
            if (z7) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM3713y = m3713y();
            this.f7149Y = drawable != null ? drawable.mutate() : null;
            float fM3713y2 = m3713y();
            m3682e0(drawable2);
            if (m3709c0()) {
                m3711w(this.f7149Y);
            }
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: L */
    public final void m3692L(float f8) {
        if (this.f7151a0 != f8) {
            float fM3713y = m3713y();
            this.f7151a0 = f8;
            float fM3713y2 = m3713y();
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: M */
    public final void m3693M(ColorStateList colorStateList) {
        this.f7152b0 = true;
        if (this.f7150Z != colorStateList) {
            this.f7150Z = colorStateList;
            if (m3709c0()) {
                this.f7149Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public final void m3694N(boolean z7) {
        if (this.f7148X != z7) {
            boolean zM3709c0 = m3709c0();
            this.f7148X = z7;
            boolean zM3709c02 = m3709c0();
            if (zM3709c0 != zM3709c02) {
                if (zM3709c02) {
                    m3711w(this.f7149Y);
                } else {
                    m3682e0(this.f7149Y);
                }
                invalidateSelf();
                m3684D();
            }
        }
    }

    /* renamed from: O */
    public final void m3695O(ColorStateList colorStateList) {
        if (this.f7140T != colorStateList) {
            this.f7140T = colorStateList;
            if (this.f7147W0) {
                C2821h c2821h = this.f10492k;
                if (c2821h.f10462d != colorStateList) {
                    c2821h.f10462d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P */
    public final void m3696P(float f8) {
        if (this.f7142U != f8) {
            this.f7142U = f8;
            this.f7174x0.setStrokeWidth(f8);
            if (this.f7147W0) {
                this.f10492k.f10468j = f8;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final void m3697Q(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7154d0;
        if (drawable3 != 0) {
            boolean z7 = drawable3 instanceof InterfaceC0929b;
            drawable2 = drawable3;
            if (z7) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM3714z = m3714z();
            this.f7154d0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2703a.m4755a(this.f7144V), this.f7154d0, f7116Y0);
            FocusRingDrawable.m1880e(this.f7173w0, rippleDrawable, null);
            this.f7155e0 = rippleDrawable;
            float fM3714z2 = m3714z();
            m3682e0(drawable2);
            if (m3710d0()) {
                m3711w(this.f7154d0);
            }
            invalidateSelf();
            if (fM3714z != fM3714z2) {
                m3684D();
            }
        }
    }

    /* renamed from: R */
    public final void m3698R(float f8) {
        if (this.f7171u0 != f8) {
            this.f7171u0 = f8;
            invalidateSelf();
            if (m3710d0()) {
                m3684D();
            }
        }
    }

    /* renamed from: S */
    public final void m3699S(float f8) {
        if (this.f7157g0 != f8) {
            this.f7157g0 = f8;
            invalidateSelf();
            if (m3710d0()) {
                m3684D();
            }
        }
    }

    /* renamed from: T */
    public final void m3700T(float f8) {
        if (this.f7170t0 != f8) {
            this.f7170t0 = f8;
            invalidateSelf();
            if (m3710d0()) {
                m3684D();
            }
        }
    }

    /* renamed from: U */
    public final boolean m3701U(int[] iArr) {
        if (Arrays.equals(this.f7135Q0, iArr)) {
            return false;
        }
        this.f7135Q0 = iArr;
        if (m3710d0()) {
            return m3685E(getState(), iArr);
        }
        return false;
    }

    /* renamed from: V */
    public final void m3702V(ColorStateList colorStateList) {
        if (this.f7156f0 != colorStateList) {
            this.f7156f0 = colorStateList;
            if (m3710d0()) {
                this.f7154d0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: W */
    public final void m3703W(boolean z7) {
        if (this.f7153c0 != z7) {
            boolean zM3710d0 = m3710d0();
            this.f7153c0 = z7;
            boolean zM3710d02 = m3710d0();
            if (zM3710d0 != zM3710d02) {
                if (zM3710d02) {
                    m3711w(this.f7154d0);
                } else {
                    m3682e0(this.f7154d0);
                }
                invalidateSelf();
                m3684D();
            }
        }
    }

    /* renamed from: X */
    public final void m3704X(float f8) {
        if (this.f7167q0 != f8) {
            float fM3713y = m3713y();
            this.f7167q0 = f8;
            float fM3713y2 = m3713y();
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: Y */
    public final void m3705Y(float f8) {
        if (this.f7166p0 != f8) {
            float fM3713y = m3713y();
            this.f7166p0 = f8;
            float fM3713y2 = m3713y();
            invalidateSelf();
            if (fM3713y != fM3713y2) {
                m3684D();
            }
        }
    }

    /* renamed from: Z */
    public final void m3706Z(ColorStateList colorStateList) {
        if (this.f7144V != colorStateList) {
            this.f7144V = colorStateList;
            this.f7137R0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: a0 */
    public final void m3707a0(C2552d c2552d) {
        C2372j c2372j = this.f7119C0;
        C1901b c1901b = c2372j.f8366b;
        TextPaint textPaint = c2372j.f8365a;
        if (c2372j.f8370f != c2552d) {
            c2372j.f8370f = c2552d;
            if (c2552d != null) {
                Context context = this.f7173w0;
                c2552d.m4567e(context, textPaint, c1901b);
                InterfaceC2371i interfaceC2371i = (InterfaceC2371i) c2372j.f8369e.get();
                if (interfaceC2371i != null) {
                    textPaint.drawableState = interfaceC2371i.getState();
                }
                c2552d.m4566d(context, textPaint, c1901b);
                c2372j.f8368d = true;
            }
            InterfaceC2371i interfaceC2371i2 = (InterfaceC2371i) c2372j.f8369e.get();
            if (interfaceC2371i2 != null) {
                C1905f c1905f = (C1905f) interfaceC2371i2;
                c1905f.m3684D();
                c1905f.invalidateSelf();
                c1905f.onStateChange(interfaceC2371i2.getState());
            }
        }
    }

    /* renamed from: b0 */
    public final boolean m3708b0() {
        return this.f7160j0 && this.f7161k0 != null && this.f7126J0;
    }

    /* renamed from: c0 */
    public final boolean m3709c0() {
        return this.f7148X && this.f7149Y != null;
    }

    /* renamed from: d0 */
    public final boolean m3710d0() {
        return this.f7153c0 && this.f7154d0 != null;
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f8;
        int i4;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f7128L0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z7 = this.f7147W0;
        Paint paint = this.f7174x0;
        RectF rectF = this.f7176z0;
        if (!z7) {
            paint.setColor(this.f7120D0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3683A(), m3683A(), paint);
        }
        if (!this.f7147W0) {
            paint.setColor(this.f7121E0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f7129M0;
            if (colorFilter == null) {
                colorFilter = this.f7130N0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3683A(), m3683A(), paint);
        }
        if (this.f7147W0) {
            super.draw(canvas);
        }
        if (this.f7142U > 0.0f && !this.f7147W0) {
            paint.setColor(this.f7123G0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f7147W0) {
                ColorFilter colorFilter2 = this.f7129M0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f7130N0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f9 = bounds.left;
            float f10 = this.f7142U / 2.0f;
            rectF.set(f9 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
            float f11 = this.f7138S - (this.f7142U / 2.0f);
            canvas2.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setColor(this.f7124H0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f7147W0) {
            RectF rectF2 = new RectF(bounds);
            C2828o c2828oMo4922d = this.f10492k.f10459a.mo4922d();
            float[] fArr = this.f10488K;
            float f12 = this.f10492k.f10467i;
            C2820g c2820g = this.f10478A;
            C2830q c2830q = this.f10479B;
            f8 = 2.0f;
            Path path = this.f7118B0;
            c2830q.m4958a(c2828oMo4922d, fArr, f12, rectF2, c2820g, path);
            m4934e(canvas2, paint, path, this.f10492k.f10459a.mo4922d(), this.f10488K, m4935g());
        } else {
            canvas2.drawRoundRect(rectF, m3683A(), m3683A(), paint);
            f8 = 2.0f;
        }
        if (m3709c0()) {
            m3712x(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f7149Y.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7149Y.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (m3708b0()) {
            m3712x(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f7161k0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7161k0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f7143U0 && this.f7146W != null) {
            PointF pointF = this.f7117A0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f7146W;
            C2372j c2372j = this.f7119C0;
            if (charSequence != null) {
                float fM3713y = m3713y() + this.f7165o0 + this.f7168r0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM3713y;
                } else {
                    pointF.x = bounds.right - fM3713y;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c2372j.f8365a;
                Paint.FontMetrics fontMetrics = this.f7175y0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f8);
            }
            rectF.setEmpty();
            if (this.f7146W != null) {
                float fM3713y2 = m3713y() + this.f7165o0 + this.f7168r0;
                float fM3714z = m3714z() + this.f7172v0 + this.f7169s0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM3713y2;
                    rectF.right = bounds.right - fM3714z;
                } else {
                    rectF.left = bounds.left + fM3714z;
                    rectF.right = bounds.right - fM3713y2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C2552d c2552d = c2372j.f8370f;
            TextPaint textPaint2 = c2372j.f8365a;
            if (c2552d != null) {
                textPaint2.drawableState = getState();
                c2372j.f8370f.m4566d(this.f7173w0, textPaint2, c2372j.f8366b);
            }
            textPaint2.setTextAlign(align);
            boolean z8 = Math.round(c2372j.m4210a(this.f7146W.toString())) > Math.round(rectF.width());
            if (z8) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i4 = iSave;
            } else {
                i4 = 0;
            }
            CharSequence charSequenceEllipsize = this.f7146W;
            if (z8 && this.f7141T0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f7141T0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z8) {
                canvas2.restoreToCount(i4);
            }
        }
        if (m3710d0()) {
            rectF.setEmpty();
            if (m3710d0()) {
                float f17 = this.f7172v0 + this.f7171u0;
                if (getLayoutDirection() == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f7157g0;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f7157g0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f20 = this.f7157g0;
                float f21 = fExactCenterY - (f20 / f8);
                rectF.top = f21;
                rectF.bottom = f21 + f20;
            }
            float f22 = rectF.left;
            float f23 = rectF.top;
            canvas2.translate(f22, f23);
            this.f7154d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7155e0.setBounds(this.f7154d0.getBounds());
            this.f7155e0.jumpToCurrentState();
            this.f7155e0.draw(canvas2);
            canvas2.translate(-f22, -f23);
        }
        if (this.f7128L0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7128L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f7129M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f7136R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m3714z() + this.f7119C0.m4210a(this.f7146W.toString()) + m3713y() + this.f7165o0 + this.f7168r0 + this.f7169s0 + this.f7172v0), this.f7145V0);
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f7147W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f7136R, this.f7138S);
        } else {
            outline.setRoundRect(bounds, this.f7138S);
            outline2 = outline;
        }
        outline2.setAlpha(this.f7128L0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m3680B(this.f7132P) || m3680B(this.f7134Q) || m3680B(this.f7140T)) {
            return true;
        }
        C2552d c2552d = this.f7119C0.f8370f;
        if (c2552d == null || (colorStateList = c2552d.f9261k) == null || !colorStateList.isStateful()) {
            return (this.f7160j0 && this.f7161k0 != null && this.f7159i0) || m3681C(this.f7149Y) || m3681C(this.f7161k0) || m3680B(this.f7131O0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m3709c0()) {
            zOnLayoutDirectionChanged |= this.f7149Y.setLayoutDirection(i);
        }
        if (m3708b0()) {
            zOnLayoutDirectionChanged |= this.f7161k0.setLayoutDirection(i);
        }
        if (m3710d0()) {
            zOnLayoutDirectionChanged |= this.f7154d0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m3709c0()) {
            zOnLevelChange |= this.f7149Y.setLevel(i);
        }
        if (m3708b0()) {
            zOnLevelChange |= this.f7161k0.setLevel(i);
        }
        if (m3710d0()) {
            zOnLevelChange |= this.f7154d0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f7147W0) {
            super.onStateChange(iArr);
        }
        return m3685E(iArr, this.f7135Q0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f7128L0 != i) {
            this.f7128L0 = i;
            invalidateSelf();
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f7129M0 != colorFilter) {
            this.f7129M0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f7131O0 != colorStateList) {
            this.f7131O0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f7133P0 != mode) {
            this.f7133P0 = mode;
            ColorStateList colorStateList = this.f7131O0;
            this.f7130N0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        if (m3709c0()) {
            visible |= this.f7149Y.setVisible(z7, z8);
        }
        if (m3708b0()) {
            visible |= this.f7161k0.setVisible(z7, z8);
        }
        if (m3710d0()) {
            visible |= this.f7154d0.setVisible(z7, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: w */
    public final void m3711w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7154d0) {
            drawable.setTintList(this.f7156f0);
            if (drawable.isStateful()) {
                drawable.setState(this.f7135Q0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f7149Y;
        if (drawable == drawable2 && this.f7152b0) {
            drawable2.setTintList(this.f7150Z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: x */
    public final void m3712x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3709c0() || m3708b0()) {
            float f8 = this.f7165o0 + this.f7166p0;
            Drawable drawable = this.f7126J0 ? this.f7161k0 : this.f7149Y;
            float intrinsicWidth = this.f7151a0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f9 = rect.left + f8;
                rectF.left = f9;
                rectF.right = f9 + intrinsicWidth;
            } else {
                float f10 = rect.right - f8;
                rectF.right = f10;
                rectF.left = f10 - intrinsicWidth;
            }
            Drawable drawable2 = this.f7126J0 ? this.f7161k0 : this.f7149Y;
            float fCeil = this.f7151a0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f7173w0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* renamed from: y */
    public final float m3713y() {
        if (!m3709c0() && !m3708b0()) {
            return 0.0f;
        }
        float f8 = this.f7166p0;
        Drawable drawable = this.f7126J0 ? this.f7161k0 : this.f7149Y;
        float intrinsicWidth = this.f7151a0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f8 + this.f7167q0;
    }

    /* renamed from: z */
    public final float m3714z() {
        if (m3710d0()) {
            return this.f7170t0 + this.f7157g0 + this.f7171u0;
        }
        return 0.0f;
    }
}
