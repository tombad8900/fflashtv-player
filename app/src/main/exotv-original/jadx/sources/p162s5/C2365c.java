package p162s5;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import p020c1.C0629a;
import p042e5.AbstractC0910a;
import p088k0.AbstractC1551f;
import p187v5.AbstractC2553e;
import p187v5.C2549a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s5.c */
/* loaded from: classes.dex */
public final class C2365c {

    /* renamed from: B */
    public CharSequence f8282B;

    /* renamed from: C */
    public CharSequence f8283C;

    /* renamed from: D */
    public boolean f8284D;

    /* renamed from: F */
    public float f8286F;

    /* renamed from: G */
    public float f8287G;

    /* renamed from: H */
    public float f8288H;

    /* renamed from: I */
    public float f8289I;

    /* renamed from: J */
    public float f8290J;

    /* renamed from: K */
    public int f8291K;

    /* renamed from: L */
    public int f8292L;

    /* renamed from: M */
    public int[] f8293M;

    /* renamed from: N */
    public boolean f8294N;

    /* renamed from: O */
    public final TextPaint f8295O;

    /* renamed from: P */
    public final TextPaint f8296P;

    /* renamed from: Q */
    public TimeInterpolator f8297Q;

    /* renamed from: R */
    public TimeInterpolator f8298R;

    /* renamed from: S */
    public float f8299S;

    /* renamed from: T */
    public float f8300T;

    /* renamed from: U */
    public float f8301U;

    /* renamed from: V */
    public ColorStateList f8302V;

    /* renamed from: W */
    public float f8303W;

    /* renamed from: X */
    public float f8304X;

    /* renamed from: Y */
    public float f8305Y;

    /* renamed from: Z */
    public StaticLayout f8306Z;

    /* renamed from: a */
    public final TextInputLayout f8307a;

    /* renamed from: a0 */
    public float f8308a0;

    /* renamed from: b */
    public float f8309b;

    /* renamed from: b0 */
    public float f8310b0;

    /* renamed from: c */
    public final Rect f8311c;

    /* renamed from: c0 */
    public float f8312c0;

    /* renamed from: d */
    public final Rect f8313d;

    /* renamed from: d0 */
    public CharSequence f8314d0;

    /* renamed from: e */
    public final RectF f8315e;

    /* renamed from: j */
    public ColorStateList f8325j;

    /* renamed from: k */
    public ColorStateList f8327k;

    /* renamed from: k0 */
    public boolean f8328k0;

    /* renamed from: l */
    public int f8329l;

    /* renamed from: m */
    public float f8330m;

    /* renamed from: n */
    public float f8331n;

    /* renamed from: o */
    public float f8332o;

    /* renamed from: p */
    public float f8333p;

    /* renamed from: q */
    public float f8334q;

    /* renamed from: r */
    public float f8335r;

    /* renamed from: s */
    public Typeface f8336s;

    /* renamed from: t */
    public Typeface f8337t;

    /* renamed from: u */
    public Typeface f8338u;

    /* renamed from: v */
    public Typeface f8339v;

    /* renamed from: w */
    public Typeface f8340w;

    /* renamed from: x */
    public Typeface f8341x;

    /* renamed from: y */
    public Typeface f8342y;

    /* renamed from: z */
    public C2549a f8343z;

    /* renamed from: f */
    public int f8317f = 16;

    /* renamed from: g */
    public int f8319g = 16;

    /* renamed from: h */
    public float f8321h = 15.0f;

    /* renamed from: i */
    public float f8323i = 15.0f;

    /* renamed from: A */
    public final TextUtils.TruncateAt f8281A = TextUtils.TruncateAt.END;

    /* renamed from: E */
    public final boolean f8285E = true;

    /* renamed from: e0 */
    public int f8316e0 = 1;

    /* renamed from: f0 */
    public int f8318f0 = 1;

    /* renamed from: g0 */
    public final float f8320g0 = 1.0f;

    /* renamed from: h0 */
    public final int f8322h0 = 1;

    /* renamed from: i0 */
    public int f8324i0 = -1;

    /* renamed from: j0 */
    public int f8326j0 = -1;

    public C2365c(TextInputLayout textInputLayout) {
        this.f8307a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f8295O = textPaint;
        this.f8296P = new TextPaint(textPaint);
        this.f8313d = new Rect();
        this.f8311c = new Rect();
        this.f8315e = new RectF();
        m4200i(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m4192a(float f8, int i, int i4) {
        float f9 = 1.0f - f8;
        return Color.argb(Math.round((Color.alpha(i4) * f8) + (Color.alpha(i) * f9)), Math.round((Color.red(i4) * f8) + (Color.red(i) * f9)), Math.round((Color.green(i4) * f8) + (Color.green(i) * f9)), Math.round((Color.blue(i4) * f8) + (Color.blue(i) * f9)));
    }

    /* renamed from: h */
    public static float m4193h(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return AbstractC0910a.m2077a(f8, f9, f10);
    }

    /* renamed from: b */
    public final void m4194b() {
        float f8 = this.f8309b;
        float f9 = this.f8311c.left;
        Rect rect = this.f8313d;
        float fM4193h = m4193h(f9, rect.left, f8, this.f8297Q);
        RectF rectF = this.f8315e;
        rectF.left = fM4193h;
        rectF.top = m4193h(this.f8330m, this.f8331n, f8, this.f8297Q);
        rectF.right = m4193h(r1.right, rect.right, f8, this.f8297Q);
        rectF.bottom = m4193h(r1.bottom, rect.bottom, f8, this.f8297Q);
        this.f8334q = m4193h(this.f8332o, this.f8333p, f8, this.f8297Q);
        this.f8335r = m4193h(this.f8330m, this.f8331n, f8, this.f8297Q);
        m4196d(f8, false);
        TextInputLayout textInputLayout = this.f8307a;
        textInputLayout.postInvalidateOnAnimation();
        float f10 = this.f8303W;
        float f11 = this.f8304X;
        TextPaint textPaint = this.f8295O;
        if (f10 != f11) {
            textPaint.setLetterSpacing(m4193h(f11, f10, f8, AbstractC0910a.f3957b));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        C0629a c0629a = AbstractC0910a.f3957b;
        this.f8310b0 = 1.0f - m4193h(0.0f, 1.0f, 1.0f - f8, c0629a);
        textInputLayout.postInvalidateOnAnimation();
        this.f8312c0 = m4193h(1.0f, 0.0f, f8, c0629a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f8327k;
        ColorStateList colorStateList2 = this.f8325j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m4192a(f8, m4199g(colorStateList2), m4199g(this.f8327k)));
        } else {
            textPaint.setColor(m4199g(colorStateList));
        }
        this.f8288H = AbstractC0910a.m2077a(0.0f, this.f8299S, f8);
        this.f8289I = AbstractC0910a.m2077a(0.0f, this.f8300T, f8);
        this.f8290J = AbstractC0910a.m2077a(0.0f, this.f8301U, f8);
        int iM4192a = m4192a(f8, 0, m4199g(this.f8302V));
        this.f8291K = iM4192a;
        textPaint.setShadowLayer(this.f8288H, this.f8289I, this.f8290J, iM4192a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: c */
    public final boolean m4195c(CharSequence charSequence) {
        boolean z7 = this.f8307a.getLayoutDirection() == 1;
        if (this.f8285E) {
            return (z7 ? AbstractC1551f.f5941d : AbstractC1551f.f5940c).m326d(charSequence, charSequence.length());
        }
        return z7;
    }

    /* renamed from: d */
    public final void m4196d(float f8, boolean z7) {
        float f9;
        Typeface typeface;
        float f10;
        if (this.f8282B == null) {
            return;
        }
        float fWidth = this.f8313d.width();
        float fWidth2 = this.f8311c.width();
        if (Math.abs(f8 - 1.0f) < 1.0E-5f) {
            f9 = m4206o() ? this.f8323i : this.f8321h;
            f10 = m4206o() ? this.f8303W : this.f8304X;
            this.f8286F = m4206o() ? 1.0f : m4193h(this.f8321h, this.f8323i, f8, this.f8298R) / this.f8321h;
            if (!m4206o()) {
                fWidth = fWidth2;
            }
            typeface = this.f8336s;
            fWidth2 = fWidth;
        } else {
            f9 = this.f8321h;
            float f11 = this.f8304X;
            typeface = this.f8339v;
            if (Math.abs(f8 - 0.0f) < 1.0E-5f) {
                this.f8286F = 1.0f;
            } else {
                this.f8286F = m4193h(this.f8321h, this.f8323i, f8, this.f8298R) / this.f8321h;
            }
            float f12 = this.f8323i / this.f8321h;
            float f13 = fWidth2 * f12;
            if (!z7 && f13 > fWidth && m4206o()) {
                fWidth2 = Math.min(fWidth / f12, fWidth2);
            }
            f10 = f11;
        }
        int i = f8 < 0.5f ? this.f8316e0 : this.f8318f0;
        TextPaint textPaint = this.f8295O;
        if (fWidth2 > 0.0f) {
            boolean z8 = this.f8287G != f9;
            boolean z9 = this.f8305Y != f10;
            boolean z10 = this.f8342y != typeface;
            StaticLayout staticLayout = this.f8306Z;
            boolean z11 = z8 || z9 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z10 || (this.f8292L != i) || this.f8294N;
            this.f8287G = f9;
            this.f8305Y = f10;
            this.f8342y = typeface;
            this.f8294N = false;
            this.f8292L = i;
            textPaint.setLinearText(this.f8286F != 1.0f);
            z = z11;
        }
        if (this.f8283C == null || z) {
            textPaint.setTextSize(this.f8287G);
            textPaint.setTypeface(this.f8342y);
            textPaint.setLetterSpacing(this.f8305Y);
            boolean zM4195c = m4195c(this.f8282B);
            this.f8284D = zM4195c;
            StaticLayout staticLayoutM4197e = m4197e(((this.f8316e0 > 1 || this.f8318f0 > 1) && !zM4195c) ? i : 1, textPaint, this.f8282B, fWidth2 * (m4206o() ? 1.0f : this.f8286F), this.f8284D);
            this.f8306Z = staticLayoutM4197e;
            this.f8283C = staticLayoutM4197e.getText();
        }
    }

    /* renamed from: e */
    public final StaticLayout m4197e(int i, TextPaint textPaint, CharSequence charSequence, float f8, boolean z7) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f8317f, this.f8284D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f8284D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f8284D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        C2370h c2370h = new C2370h(charSequence, textPaint, (int) f8);
        c2370h.f8363l = this.f8281A;
        c2370h.f8362k = z7;
        c2370h.f8356e = alignment;
        c2370h.f8361j = false;
        c2370h.f8357f = i;
        float f9 = this.f8320g0;
        c2370h.f8358g = 0.0f;
        c2370h.f8359h = f9;
        c2370h.f8360i = this.f8322h0;
        c2370h.f8364m = null;
        StaticLayout staticLayoutM4209a = c2370h.m4209a();
        staticLayoutM4209a.getClass();
        return staticLayoutM4209a;
    }

    /* renamed from: f */
    public final float m4198f() {
        int i = this.f8324i0;
        if (i != -1) {
            return i;
        }
        float f8 = this.f8323i;
        TextPaint textPaint = this.f8296P;
        textPaint.setTextSize(f8);
        textPaint.setTypeface(this.f8336s);
        textPaint.setLetterSpacing(this.f8303W);
        return -textPaint.ascent();
    }

    /* renamed from: g */
    public final int m4199g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8293M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: i */
    public final void m4200i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8338u;
            if (typeface != null) {
                this.f8337t = AbstractC2553e.m4569a(configuration, typeface);
            }
            Typeface typeface2 = this.f8341x;
            if (typeface2 != null) {
                this.f8340w = AbstractC2553e.m4569a(configuration, typeface2);
            }
            Typeface typeface3 = this.f8337t;
            if (typeface3 == null) {
                typeface3 = this.f8338u;
            }
            this.f8336s = typeface3;
            Typeface typeface4 = this.f8340w;
            if (typeface4 == null) {
                typeface4 = this.f8341x;
            }
            this.f8339v = typeface4;
            m4201j(true);
        }
    }

    /* renamed from: j */
    public final void m4201j(boolean z7) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f8307a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z7) {
            return;
        }
        m4196d(1.0f, z7);
        CharSequence charSequence = this.f8283C;
        TextPaint textPaint = this.f8295O;
        if (charSequence != null && this.f8306Z != null) {
            this.f8314d0 = m4206o() ? TextUtils.ellipsize(this.f8283C, textPaint, this.f8306Z.getWidth(), this.f8281A) : this.f8283C;
        }
        CharSequence charSequence2 = this.f8314d0;
        if (charSequence2 != null) {
            this.f8308a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f8308a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f8319g, this.f8284D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f8313d;
        if (i == 48) {
            this.f8331n = rect.top;
        } else if (i != 80) {
            this.f8331n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f8331n = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f8333p = rect.centerX() - (this.f8308a0 / 2.0f);
        } else if (i4 != 5) {
            this.f8333p = rect.left;
        } else {
            this.f8333p = rect.right - this.f8308a0;
        }
        if (this.f8308a0 <= rect.width()) {
            float f8 = this.f8333p;
            float fMax = Math.max(0.0f, rect.left - f8) + f8;
            this.f8333p = fMax;
            this.f8333p = Math.min(0.0f, rect.right - (this.f8308a0 + fMax)) + fMax;
        }
        float f9 = this.f8323i;
        TextPaint textPaint2 = this.f8296P;
        textPaint2.setTextSize(f9);
        textPaint2.setTypeface(this.f8336s);
        textPaint2.setLetterSpacing(this.f8303W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f10 = this.f8331n;
            float fMax2 = Math.max(0.0f, rect.top - f10) + f10;
            this.f8331n = fMax2;
            this.f8331n = Math.min(0.0f, rect.bottom - (m4198f() + fMax2)) + fMax2;
        }
        m4196d(0.0f, z7);
        float height = this.f8306Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f8306Z;
        if (staticLayout == null || this.f8316e0 <= 1) {
            CharSequence charSequence3 = this.f8283C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f8306Z;
        this.f8329l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f8317f, this.f8284D ? 1 : 0);
        int i8 = absoluteGravity2 & 112;
        Rect rect2 = this.f8311c;
        if (i8 == 48) {
            this.f8330m = rect2.top;
        } else if (i8 != 80) {
            this.f8330m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f8330m = (rect2.bottom - height) + (this.f8328k0 ? textPaint.descent() : 0.0f);
        }
        int i9 = absoluteGravity2 & 8388615;
        if (i9 == 1) {
            this.f8332o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i9 != 5) {
            this.f8332o = rect2.left;
        } else {
            this.f8332o = rect2.right - fMeasureText;
        }
        m4196d(this.f8309b, false);
        textInputLayout.postInvalidateOnAnimation();
        m4194b();
    }

    /* renamed from: k */
    public final void m4202k(ColorStateList colorStateList) {
        if (this.f8327k == colorStateList && this.f8325j == colorStateList) {
            return;
        }
        this.f8327k = colorStateList;
        this.f8325j = colorStateList;
        m4201j(false);
    }

    /* renamed from: l */
    public final boolean m4203l(Typeface typeface) {
        C2549a c2549a = this.f8343z;
        if (c2549a != null) {
            c2549a.f9244c = true;
        }
        if (this.f8338u == typeface) {
            return false;
        }
        this.f8338u = typeface;
        Typeface typefaceM4569a = AbstractC2553e.m4569a(this.f8307a.getContext().getResources().getConfiguration(), typeface);
        this.f8337t = typefaceM4569a;
        if (typefaceM4569a == null) {
            typefaceM4569a = this.f8338u;
        }
        this.f8336s = typefaceM4569a;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4204m(float f8) {
        float f9 = 0.0f;
        if (f8 < 0.0f) {
            f8 = f9;
        } else {
            f9 = 1.0f;
            if (f8 > 1.0f) {
            }
        }
        if (f8 != this.f8309b) {
            this.f8309b = f8;
            m4194b();
        }
    }

    /* renamed from: n */
    public final void m4205n(Typeface typeface) {
        boolean z7;
        boolean zM4203l = m4203l(typeface);
        if (this.f8341x != typeface) {
            this.f8341x = typeface;
            Typeface typefaceM4569a = AbstractC2553e.m4569a(this.f8307a.getContext().getResources().getConfiguration(), typeface);
            this.f8340w = typefaceM4569a;
            if (typefaceM4569a == null) {
                typefaceM4569a = this.f8341x;
            }
            this.f8339v = typefaceM4569a;
            z7 = true;
        } else {
            z7 = false;
        }
        if (zM4203l || z7) {
            m4201j(false);
        }
    }

    /* renamed from: o */
    public final boolean m4206o() {
        return this.f8318f0 == 1;
    }
}
