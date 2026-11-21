package p211y5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0714c;
import java.util.BitSet;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p037e0.AbstractC0850a;
import p136p5.AbstractC2218a;
import p136p5.AbstractC2219b;
import p145q5.C2272a;
import p175u0.C2454f;
import p175u0.C2455g;
import p205x5.C2782a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.j */
/* loaded from: classes.dex */
public class C2823j extends Drawable implements InterfaceC2839z {

    /* renamed from: N */
    public static final Paint f10476N;

    /* renamed from: O */
    public static final C2822i[] f10477O;

    /* renamed from: A */
    public final C2820g f10478A;

    /* renamed from: B */
    public final C2830q f10479B;

    /* renamed from: C */
    public PorterDuffColorFilter f10480C;

    /* renamed from: D */
    public PorterDuffColorFilter f10481D;

    /* renamed from: E */
    public final RectF f10482E;

    /* renamed from: F */
    public final boolean f10483F;

    /* renamed from: G */
    public boolean f10484G;

    /* renamed from: H */
    public C2828o f10485H;

    /* renamed from: I */
    public C2455g f10486I;

    /* renamed from: J */
    public final C2454f[] f10487J;

    /* renamed from: K */
    public float[] f10488K;

    /* renamed from: L */
    public float[] f10489L;

    /* renamed from: M */
    public C0456a f10490M;

    /* renamed from: j */
    public final C2820g f10491j;

    /* renamed from: k */
    public C2821h f10492k;

    /* renamed from: l */
    public final AbstractC2837x[] f10493l;

    /* renamed from: m */
    public final AbstractC2837x[] f10494m;

    /* renamed from: n */
    public final BitSet f10495n;

    /* renamed from: o */
    public boolean f10496o;

    /* renamed from: p */
    public boolean f10497p;

    /* renamed from: q */
    public final Matrix f10498q;

    /* renamed from: r */
    public final Path f10499r;

    /* renamed from: s */
    public final Path f10500s;

    /* renamed from: t */
    public final RectF f10501t;

    /* renamed from: u */
    public final RectF f10502u;

    /* renamed from: v */
    public final Region f10503v;

    /* renamed from: w */
    public final Region f10504w;

    /* renamed from: x */
    public final Paint f10505x;

    /* renamed from: y */
    public final Paint f10506y;

    /* renamed from: z */
    public final C2782a f10507z;

    static {
        Paint paint = new Paint(1);
        f10476N = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f10477O = new C2822i[4];
        int i = 0;
        while (true) {
            C2822i[] c2822iArr = f10477O;
            if (i >= c2822iArr.length) {
                return;
            }
            c2822iArr[i] = new C2822i(i);
            i++;
        }
    }

    public C2823j() {
        this(new C2828o());
    }

    /* renamed from: a */
    public final void m4930a(RectF rectF, Path path) {
        this.f10479B.m4958a(this.f10492k.f10459a.mo4922d(), this.f10488K, this.f10492k.f10467i, rectF, this.f10478A, path);
        if (this.f10492k.f10466h != 1.0f) {
            Matrix matrix = this.f10498q;
            matrix.reset();
            float f8 = this.f10492k.f10466h;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f10482E, true);
    }

    /* renamed from: b */
    public final float m4931b(RectF rectF, C2828o c2828o, float[] fArr) {
        if (fArr == null) {
            if (c2828o.m4955i(rectF)) {
                return c2828o.f10525e.mo4909a(rectF);
            }
            return -1.0f;
        }
        if (this.f10484G) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* renamed from: c */
    public final int m4932c(int i) {
        int i4;
        C2821h c2821h = this.f10492k;
        float f8 = c2821h.f10471m + 0.0f + c2821h.f10470l;
        C2272a c2272a = c2821h.f10460b;
        if (c2272a == null || !c2272a.f7948a || AbstractC0850a.m2019d(i, 255) != c2272a.f7951d) {
            return i;
        }
        float fMin = (c2272a.f7952e <= 0.0f || f8 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f8 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM1503P = AbstractC0714c.m1503P(fMin, AbstractC0850a.m2019d(i, 255), c2272a.f7949b);
        if (fMin > 0.0f && (i4 = c2272a.f7950c) != 0) {
            iM1503P = AbstractC0850a.m2017b(AbstractC0850a.m2019d(i4, C2272a.f7947f), iM1503P);
        }
        return AbstractC0850a.m2019d(iM1503P, iAlpha);
    }

    /* renamed from: d */
    public final void m4933d(Canvas canvas) {
        if (this.f10495n.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f10492k.f10473o;
        Path path = this.f10499r;
        C2782a c2782a = this.f10507z;
        if (i != 0) {
            canvas.drawPath(path, c2782a.f10335a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            AbstractC2837x abstractC2837x = this.f10493l[i4];
            int i8 = this.f10492k.f10472n;
            Matrix matrix = AbstractC2837x.f10562b;
            abstractC2837x.mo4960a(matrix, c2782a, i8, canvas);
            this.f10494m[i4].mo4960a(matrix, c2782a, this.f10492k.f10472n, canvas);
        }
        if (this.f10483F) {
            double d8 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d8)) * this.f10492k.f10473o);
            int iCos = (int) (Math.cos(Math.toRadians(d8)) * this.f10492k.f10473o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f10476N);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f10480C;
        Paint paint2 = this.f10505x;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f10492k.f10469k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10481D;
        Paint paint3 = this.f10506y;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f10492k.f10468j);
        int alpha2 = paint3.getAlpha();
        int i4 = this.f10492k.f10469k;
        paint3.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z7 = m4939k() || !m4942n();
        Paint.Style style = this.f10492k.f10474p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z8 = this.f10496o;
            paint = paint2;
            Path path = this.f10499r;
            if (z8) {
                if (z7) {
                    m4930a(m4935g(), path);
                }
                this.f10496o = false;
            }
            if (m4939k()) {
                canvas.save();
                double d8 = 0;
                canvas.translate((int) (this.f10492k.f10473o * Math.sin(Math.toRadians(d8))), (int) (Math.cos(Math.toRadians(d8)) * this.f10492k.f10473o));
                if (this.f10483F) {
                    Rect bounds = getBounds();
                    RectF rectF = this.f10482E;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        StringBuilder sbM19o = AbstractC0008a1.m19o(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: ");
                        sbM19o.append(rectF);
                        throw new IllegalStateException(sbM19o.toString());
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f10492k.f10472n * 2) + ((int) rectF.width()) + iWidth, (this.f10492k.f10472n * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i8 = bounds.left;
                    int i9 = this.f10492k.f10472n;
                    float f8 = (i8 - i9) - iWidth;
                    float f9 = (bounds.top - i9) - iHeight;
                    canvas2.translate(-f8, -f9);
                    m4933d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f8, f9, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m4933d(canvas);
                    canvas.restore();
                }
            }
            m4934e(canvas, paint, path, this.f10492k.f10459a.mo4922d(), this.f10488K, m4935g());
        } else {
            paint = paint2;
        }
        if (m4940l()) {
            if (this.f10497p) {
                C2828o c2828oM4937i = m4937i();
                C2827n c2827nM4956j = c2828oM4937i.m4956j();
                InterfaceC2815d interfaceC2815d = c2828oM4937i.f10525e;
                C2820g c2820g = this.f10491j;
                c2827nM4956j.f10513e = c2820g.m4929a(interfaceC2815d);
                c2827nM4956j.f10514f = c2820g.m4929a(c2828oM4937i.f10526f);
                c2827nM4956j.f10516h = c2820g.m4929a(c2828oM4937i.f10528h);
                c2827nM4956j.f10515g = c2820g.m4929a(c2828oM4937i.f10527g);
                this.f10485H = c2827nM4956j.m4951a();
                float[] fArr = this.f10488K;
                if (fArr != null) {
                    if (this.f10489L == null) {
                        this.f10489L = new float[fArr.length];
                    }
                    float fM4938j = m4938j();
                    int i10 = 0;
                    while (true) {
                        float[] fArr2 = this.f10488K;
                        if (i10 >= fArr2.length) {
                            break;
                        }
                        this.f10489L[i10] = Math.max(0.0f, fArr2[i10] - fM4938j);
                        i10++;
                    }
                } else {
                    this.f10489L = null;
                }
                if (z7) {
                    C2828o c2828o = this.f10485H;
                    float[] fArr3 = this.f10489L;
                    float f10 = this.f10492k.f10467i;
                    RectF rectFM4935g = m4935g();
                    RectF rectF2 = this.f10502u;
                    rectF2.set(rectFM4935g);
                    float fM4938j2 = m4938j();
                    rectF2.inset(fM4938j2, fM4938j2);
                    this.f10479B.m4958a(c2828o, fArr3, f10, rectF2, null, this.f10500s);
                }
                this.f10497p = false;
            }
            mo1364f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    /* renamed from: e */
    public final void m4934e(Canvas canvas, Paint paint, Path path, C2828o c2828o, float[] fArr, RectF rectF) {
        float fM4931b = m4931b(rectF, c2828o, fArr);
        if (fM4931b < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f8 = fM4931b * this.f10492k.f10467i;
            canvas.drawRoundRect(rectF, f8, f8, paint);
        }
    }

    /* renamed from: f */
    public void mo1364f(Canvas canvas) {
        C2828o c2828o = this.f10485H;
        float[] fArr = this.f10489L;
        RectF rectFM4935g = m4935g();
        RectF rectF = this.f10502u;
        rectF.set(rectFM4935g);
        float fM4938j = m4938j();
        rectF.inset(fM4938j, fM4938j);
        m4934e(canvas, this.f10506y, this.f10500s, c2828o, fArr, rectF);
    }

    /* renamed from: g */
    public final RectF m4935g() {
        Rect bounds = getBounds();
        RectF rectF = this.f10501t;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10492k.f10469k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f10492k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f10492k.getClass();
        RectF rectFM4935g = m4935g();
        if (rectFM4935g.isEmpty()) {
            return;
        }
        float fM4931b = m4931b(rectFM4935g, this.f10492k.f10459a.mo4922d(), this.f10488K);
        if (fM4931b >= 0.0f) {
            outline.setRoundRect(getBounds(), fM4931b * this.f10492k.f10467i);
            return;
        }
        boolean z7 = this.f10496o;
        Path path = this.f10499r;
        if (z7) {
            m4930a(rectFM4935g, path);
            this.f10496o = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2219b.m4007a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC2218a.m4006a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC2218a.m4006a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f10492k.f10465g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f10503v;
        region.set(bounds);
        RectF rectFM4935g = m4935g();
        Path path = this.f10499r;
        m4930a(rectFM4935g, path);
        Region region2 = this.f10504w;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final float m4936h() {
        float[] fArr = this.f10488K;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM4935g = m4935g();
        C2828o c2828oM4937i = m4937i();
        C2830q c2830q = this.f10479B;
        c2830q.getClass();
        float fMo4909a = c2828oM4937i.f10525e.mo4909a(rectFM4935g);
        C2828o c2828oM4937i2 = m4937i();
        c2830q.getClass();
        float fMo4909a2 = c2828oM4937i2.f10528h.mo4909a(rectFM4935g) + fMo4909a;
        C2828o c2828oM4937i3 = m4937i();
        c2830q.getClass();
        float fMo4909a3 = fMo4909a2 - c2828oM4937i3.f10527g.mo4909a(rectFM4935g);
        C2828o c2828oM4937i4 = m4937i();
        c2830q.getClass();
        return (fMo4909a3 - c2828oM4937i4.f10526f.mo4909a(rectFM4935g)) / 2.0f;
    }

    /* renamed from: i */
    public final C2828o m4937i() {
        return this.f10492k.f10459a.mo4922d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f10496o = true;
        this.f10497p = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f10492k.f10463e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f10492k.getClass();
        ColorStateList colorStateList2 = this.f10492k.f10462d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f10492k.f10461c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f10492k.f10459a.mo4923e();
    }

    /* renamed from: j */
    public final float m4938j() {
        if (m4940l()) {
            return this.f10506y.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final boolean m4939k() {
        C2821h c2821h = this.f10492k;
        c2821h.getClass();
        return c2821h.f10472n > 0 && !m4942n() && !this.f10499r.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: l */
    public final boolean m4940l() {
        Paint.Style style = this.f10492k.f10474p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f10506y.getStrokeWidth() > 0.0f;
    }

    /* renamed from: m */
    public final void m4941m(Context context) {
        this.f10492k.f10460b = new C2272a(context);
        m4950v();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10492k = new C2821h(this.f10492k);
        return this;
    }

    /* renamed from: n */
    public final boolean m4942n() {
        if (this.f10492k.f10459a.mo4920b(getState()).m4955i(m4935g())) {
            return this.f10488K == null || this.f10484G;
        }
        return false;
    }

    /* renamed from: o */
    public final void m4943o(C2455g c2455g) {
        if (this.f10486I == c2455g) {
            return;
        }
        this.f10486I = c2455g;
        int i = 0;
        while (true) {
            C2454f[] c2454fArr = this.f10487J;
            if (i >= c2454fArr.length) {
                m4948t(getState(), true);
                invalidateSelf();
                return;
            }
            if (c2454fArr[i] == null) {
                c2454fArr[i] = new C2454f(this, f10477O[i]);
            }
            C2454f c2454f = c2454fArr[i];
            C2455g c2455g2 = new C2455g();
            float f8 = (float) c2455g.f9007b;
            if (f8 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c2455g2.f9007b = f8;
            c2455g2.f9008c = false;
            double d8 = c2455g.f9006a;
            float f9 = (float) (d8 * d8);
            if (f9 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c2455g2.f9006a = Math.sqrt(f9);
            c2455g2.f9008c = false;
            c2454f.f9003j = c2455g2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f10496o = true;
        this.f10497p = true;
        super.onBoundsChange(rect);
        if (!this.f10492k.f10459a.mo4923e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        C2454f[] c2454fArr = this.f10487J;
        int length = c2454fArr.length;
        boolean z7 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                C2454f c2454f = c2454fArr[i];
                if (c2454f != null && c2454f.f8998e) {
                    z7 = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        m4948t(state, true ^ z7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f10492k.f10459a.mo4923e()) {
            m4948t(iArr, false);
        }
        boolean z7 = m4947s(iArr) || m4949u();
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    /* renamed from: p */
    public final void m4944p(float f8) {
        C2821h c2821h = this.f10492k;
        if (c2821h.f10471m != f8) {
            c2821h.f10471m = f8;
            m4950v();
        }
    }

    /* renamed from: q */
    public final void m4945q(ColorStateList colorStateList) {
        C2821h c2821h = this.f10492k;
        if (c2821h.f10461c != colorStateList) {
            c2821h.f10461c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: r */
    public final void m4946r(InterfaceC2826m interfaceC2826m) {
        if (interfaceC2826m instanceof C2828o) {
            setShapeAppearanceModel((C2828o) interfaceC2826m);
            return;
        }
        C2814c0 c2814c0 = (C2814c0) interfaceC2826m;
        C2821h c2821h = this.f10492k;
        if (c2821h.f10459a != c2814c0) {
            c2821h.f10459a = c2814c0;
            m4948t(getState(), true);
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public final boolean m4947s(int[] iArr) {
        boolean z7;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f10492k.f10461c == null || color2 == (colorForState2 = this.f10492k.f10461c.getColorForState(iArr, (color2 = (paint2 = this.f10505x).getColor())))) {
            z7 = false;
        } else {
            paint2.setColor(colorForState2);
            z7 = true;
        }
        if (this.f10492k.f10462d == null || color == (colorForState = this.f10492k.f10462d.getColorForState(iArr, (color = (paint = this.f10506y).getColor())))) {
            return z7;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C2821h c2821h = this.f10492k;
        if (c2821h.f10469k != i) {
            c2821h.f10469k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10492k.getClass();
        super.invalidateSelf();
    }

    @Override // p211y5.InterfaceC2839z
    public final void setShapeAppearanceModel(C2828o c2828o) {
        this.f10492k.f10459a = c2828o;
        this.f10488K = null;
        this.f10489L = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10492k.f10463e = colorStateList;
        m4949u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C2821h c2821h = this.f10492k;
        if (c2821h.f10464f != mode) {
            c2821h.f10464f = mode;
            m4949u();
            super.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[EDGE_INSN: B:55:0x0053->B:27:0x0053 BREAK  A[LOOP:0: B:18:0x003a->B:23:0x0044]] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4948t(int[] iArr, boolean z7) {
        boolean z8;
        RectF rectFM4935g = m4935g();
        if (!this.f10492k.f10459a.mo4923e() || rectFM4935g.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z9 = z7 | (this.f10486I == null);
        if (this.f10488K == null) {
            this.f10488K = new float[4];
        }
        C2828o c2828oMo4920b = this.f10492k.f10459a.mo4920b(iArr);
        float[] fArr = this.f10488K;
        if (fArr.length <= 1) {
            z8 = !c2828oMo4920b.m4955i(m4935g());
        } else {
            float f8 = fArr[0];
            for (int i4 = 1; i4 < fArr.length; i4++) {
                if (fArr[i4] != f8) {
                    break;
                }
            }
            if (!c2828oMo4920b.m4955i(m4935g())) {
            }
        }
        this.f10484G = z8;
        if (!z8) {
            this.f10496o = true;
            this.f10497p = true;
        }
        while (i < 4) {
            this.f10479B.getClass();
            float fMo4909a = (i != 1 ? i != 2 ? i != 3 ? c2828oMo4920b.f10526f : c2828oMo4920b.f10525e : c2828oMo4920b.f10528h : c2828oMo4920b.f10527g).mo4909a(rectFM4935g);
            if (z9) {
                this.f10488K[i] = fMo4909a;
            }
            C2454f[] c2454fArr = this.f10487J;
            C2454f c2454f = c2454fArr[i];
            if (c2454f != null) {
                c2454f.m4431a(fMo4909a);
                if (z9) {
                    c2454fArr[i].m4433d();
                }
            }
            i++;
        }
        if (z9) {
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public final boolean m4949u() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10480C;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f10481D;
        C2821h c2821h = this.f10492k;
        ColorStateList colorStateList = c2821h.f10463e;
        PorterDuff.Mode mode = c2821h.f10464f;
        if (colorStateList == null || mode == null) {
            int color = this.f10505x.getColor();
            int iM4932c = m4932c(color);
            porterDuffColorFilter = iM4932c != color ? new PorterDuffColorFilter(iM4932c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m4932c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f10480C = porterDuffColorFilter;
        this.f10492k.getClass();
        this.f10481D = null;
        this.f10492k.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f10480C) && Objects.equals(porterDuffColorFilter3, this.f10481D)) ? false : true;
    }

    /* renamed from: v */
    public final void m4950v() {
        C2821h c2821h = this.f10492k;
        float f8 = c2821h.f10471m + 0.0f;
        c2821h.f10472n = (int) Math.ceil(0.75f * f8);
        this.f10492k.f10473o = (int) Math.ceil(f8 * 0.25f);
        m4949u();
        if (m4939k() || !m4942n()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public C2823j(Context context, AttributeSet attributeSet, int i, int i4) {
        this(C2828o.m4952f(context, attributeSet, i, i4).m4951a());
    }

    public C2823j(C2828o c2828o) {
        this(new C2821h(c2828o));
    }

    public C2823j(InterfaceC2826m interfaceC2826m) {
        this(new C2821h(interfaceC2826m));
    }

    public C2823j(C2821h c2821h) {
        this.f10491j = new C2820g(this);
        this.f10493l = new AbstractC2837x[4];
        this.f10494m = new AbstractC2837x[4];
        this.f10495n = new BitSet(8);
        this.f10498q = new Matrix();
        this.f10499r = new Path();
        this.f10500s = new Path();
        this.f10501t = new RectF();
        this.f10502u = new RectF();
        this.f10503v = new Region();
        this.f10504w = new Region();
        Paint paint = new Paint(1);
        this.f10505x = paint;
        Paint paint2 = new Paint(1);
        this.f10506y = paint2;
        this.f10507z = new C2782a();
        this.f10479B = C2830q.m4957b();
        this.f10482E = new RectF();
        this.f10483F = true;
        this.f10484G = true;
        this.f10487J = new C2454f[4];
        this.f10492k = c2821h;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m4949u();
        m4947s(getState());
        this.f10478A = new C2820g(this);
    }
}
