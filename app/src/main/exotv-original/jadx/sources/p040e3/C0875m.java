package p040e3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p005a4.C0094o;
import p037e0.C0853d;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.m */
/* loaded from: classes.dex */
public final class C0875m {

    /* renamed from: p */
    public static final Matrix f3844p = new Matrix();

    /* renamed from: a */
    public final Path f3845a;

    /* renamed from: b */
    public final Path f3846b;

    /* renamed from: c */
    public final Matrix f3847c;

    /* renamed from: d */
    public Paint f3848d;

    /* renamed from: e */
    public Paint f3849e;

    /* renamed from: f */
    public PathMeasure f3850f;

    /* renamed from: g */
    public final C0872j f3851g;

    /* renamed from: h */
    public float f3852h;

    /* renamed from: i */
    public float f3853i;

    /* renamed from: j */
    public float f3854j;

    /* renamed from: k */
    public float f3855k;

    /* renamed from: l */
    public int f3856l;

    /* renamed from: m */
    public String f3857m;

    /* renamed from: n */
    public Boolean f3858n;

    /* renamed from: o */
    public final C2186e f3859o;

    public C0875m() {
        this.f3847c = new Matrix();
        this.f3852h = 0.0f;
        this.f3853i = 0.0f;
        this.f3854j = 0.0f;
        this.f3855k = 0.0f;
        this.f3856l = 255;
        this.f3857m = null;
        this.f3858n = null;
        this.f3859o = new C2186e(0);
        this.f3851g = new C0872j();
        this.f3845a = new Path();
        this.f3846b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m2045a(C0872j c0872j, Matrix matrix, Canvas canvas, int i, int i4) {
        int i8;
        float f8;
        int i9;
        float f9;
        Matrix matrix2 = c0872j.f3830a;
        ArrayList arrayList = c0872j.f3831b;
        matrix2.set(matrix);
        Matrix matrix3 = c0872j.f3830a;
        matrix3.preConcat(c0872j.f3839j);
        canvas.save();
        char c8 = 0;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            AbstractC0873k abstractC0873k = (AbstractC0873k) arrayList.get(i10);
            if (abstractC0873k instanceof C0872j) {
                m2045a((C0872j) abstractC0873k, matrix3, canvas, i, i4);
            } else if (abstractC0873k instanceof AbstractC0874l) {
                AbstractC0874l abstractC0874l = (AbstractC0874l) abstractC0873k;
                float f10 = i / this.f3854j;
                float f11 = i4 / this.f3855k;
                float fMin = Math.min(f10, f11);
                Matrix matrix4 = this.f3847c;
                matrix4.set(matrix3);
                matrix4.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c8], fArr[1]);
                boolean z7 = c8;
                i8 = i10;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[z7 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f12) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f3845a;
                    path.reset();
                    C0853d[] c0853dArr = abstractC0874l.f3841a;
                    if (c0853dArr != null) {
                        C0853d.m2026b(c0853dArr, path);
                    }
                    Path path2 = this.f3846b;
                    path2.reset();
                    if (abstractC0874l instanceof C0870h) {
                        path2.setFillType(abstractC0874l.f3843c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0871i c0871i = (C0871i) abstractC0874l;
                        float f13 = c0871i.f3824i;
                        if (f13 != 0.0f || c0871i.f3825j != 1.0f) {
                            float f14 = c0871i.f3826k;
                            float f15 = (f13 + f14) % 1.0f;
                            float f16 = (c0871i.f3825j + f14) % 1.0f;
                            if (this.f3850f == null) {
                                this.f3850f = new PathMeasure();
                            }
                            this.f3850f.setPath(path, z7);
                            float length = this.f3850f.getLength();
                            float f17 = f15 * length;
                            float f18 = f16 * length;
                            path.reset();
                            if (f17 > f18) {
                                this.f3850f.getSegment(f17, length, path, true);
                                f8 = 0.0f;
                                this.f3850f.getSegment(0.0f, f18, path, true);
                            } else {
                                f8 = 0.0f;
                                this.f3850f.getSegment(f17, f18, path, true);
                            }
                            path.rLineTo(f8, f8);
                        }
                        path2.addPath(path, matrix4);
                        C0094o c0094o = c0871i.f3821f;
                        if (((Shader) c0094o.f441k) == null && c0094o.f440j == 0) {
                            f9 = 255.0f;
                            i9 = 16777215;
                        } else {
                            if (this.f3849e == null) {
                                i9 = 16777215;
                                Paint paint = new Paint(1);
                                this.f3849e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i9 = 16777215;
                            }
                            Paint paint2 = this.f3849e;
                            Shader shader = (Shader) c0094o.f441k;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0871i.f3823h * 255.0f));
                                f9 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i11 = c0094o.f440j;
                                float f19 = c0871i.f3823h;
                                PorterDuff.Mode mode = C0878p.f3873s;
                                f9 = 255.0f;
                                paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f19)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0871i.f3843c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0094o c0094o2 = c0871i.f3819d;
                        if (((Shader) c0094o2.f441k) != null || c0094o2.f440j != 0) {
                            if (this.f3848d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3848d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3848d;
                            Paint.Join join = c0871i.f3828m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0871i.f3827l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0871i.f3829n);
                            Shader shader2 = (Shader) c0094o2.f441k;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0871i.f3822g * f9));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i12 = c0094o2.f440j;
                                float f20 = c0871i.f3822g;
                                PorterDuff.Mode mode2 = C0878p.f3873s;
                                paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f20)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0871i.f3820e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i10 = i8 + 1;
                c8 = 0;
            }
            i8 = i10;
            i10 = i8 + 1;
            c8 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3856l;
    }

    public void setAlpha(float f8) {
        setRootAlpha((int) (f8 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3856l = i;
    }

    public C0875m(C0875m c0875m) {
        this.f3847c = new Matrix();
        this.f3852h = 0.0f;
        this.f3853i = 0.0f;
        this.f3854j = 0.0f;
        this.f3855k = 0.0f;
        this.f3856l = 255;
        this.f3857m = null;
        this.f3858n = null;
        C2186e c2186e = new C2186e(0);
        this.f3859o = c2186e;
        this.f3851g = new C0872j(c0875m.f3851g, c2186e);
        this.f3845a = new Path(c0875m.f3845a);
        this.f3846b = new Path(c0875m.f3846b);
        this.f3852h = c0875m.f3852h;
        this.f3853i = c0875m.f3853i;
        this.f3854j = c0875m.f3854j;
        this.f3855k = c0875m.f3855k;
        this.f3856l = c0875m.f3856l;
        this.f3857m = c0875m.f3857m;
        String str = c0875m.f3857m;
        if (str != null) {
            c2186e.put(str, this);
        }
        this.f3858n = c0875m.f3858n;
    }
}
