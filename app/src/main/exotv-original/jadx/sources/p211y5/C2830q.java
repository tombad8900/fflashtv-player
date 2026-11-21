package p211y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.q */
/* loaded from: classes.dex */
public final class C2830q {

    /* renamed from: a */
    public final C2838y[] f10534a = new C2838y[4];

    /* renamed from: b */
    public final Matrix[] f10535b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f10536c = new Matrix[4];

    /* renamed from: d */
    public final PointF f10537d = new PointF();

    /* renamed from: e */
    public final Path f10538e = new Path();

    /* renamed from: f */
    public final Path f10539f = new Path();

    /* renamed from: g */
    public final C2838y f10540g = new C2838y();

    /* renamed from: h */
    public final float[] f10541h = new float[2];

    /* renamed from: i */
    public final float[] f10542i = new float[2];

    /* renamed from: j */
    public final Path f10543j = new Path();

    /* renamed from: k */
    public final Path f10544k = new Path();

    /* renamed from: l */
    public final boolean f10545l = true;

    public C2830q() {
        for (int i = 0; i < 4; i++) {
            this.f10534a[i] = new C2838y();
            this.f10535b[i] = new Matrix();
            this.f10536c[i] = new Matrix();
        }
    }

    /* renamed from: b */
    public static C2830q m4957b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC2829p.f10533a : new C2830q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: a */
    public final void m4958a(C2828o c2828o, float[] fArr, float f8, RectF rectF, C2820g c2820g, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        C2838y[] c2838yArr;
        Matrix[] matrixArr2;
        boolean z7;
        float f9;
        boolean z8;
        int i4;
        path.rewind();
        Path path2 = this.f10538e;
        path2.rewind();
        Path path3 = this.f10539f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i8 = 0;
        while (true) {
            matrixArr = this.f10536c;
            fArr2 = this.f10541h;
            c2838yArr = this.f10534a;
            matrixArr2 = this.f10535b;
            z7 = 0;
            if (i8 >= 4) {
                break;
            }
            InterfaceC2815d c2813c = fArr == null ? i8 != 1 ? i8 != 2 ? i8 != 3 ? c2828o.f10526f : c2828o.f10525e : c2828o.f10528h : c2828o.f10527g : new C2813c(fArr[i8]);
            AbstractC2436a abstractC2436a = i8 != 1 ? i8 != 2 ? i8 != 3 ? c2828o.f10522b : c2828o.f10521a : c2828o.f10524d : c2828o.f10523c;
            C2838y c2838y = c2838yArr[i8];
            abstractC2436a.getClass();
            abstractC2436a.mo4348f(c2838y, f8, c2813c.mo4909a(rectF));
            int i9 = i8 + 1;
            float f10 = (i9 % 4) * 90;
            matrixArr2[i8].reset();
            PointF pointF = this.f10537d;
            if (i8 == 1) {
                i4 = i8;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i8 == 2) {
                i4 = i8;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i8 != 3) {
                i4 = i8;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i8;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f10);
            C2838y c2838y2 = c2838yArr[i4];
            fArr2[0] = c2838y2.f10565b;
            fArr2[1] = c2838y2.f10566c;
            matrixArr2[i4].mapPoints(fArr2);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i4].preRotate(f10);
            i8 = i9;
        }
        int i10 = 0;
        for (i = 4; i10 < i; i = 4) {
            C2838y c2838y3 = c2838yArr[i10];
            c2838y3.getClass();
            fArr2[z7] = 0.0f;
            fArr2[1] = c2838y3.f10564a;
            matrixArr2[i10].mapPoints(fArr2);
            if (i10 == 0) {
                path.moveTo(fArr2[z7], fArr2[1]);
            } else {
                path.lineTo(fArr2[z7], fArr2[1]);
            }
            c2838yArr[i10].m4964b(matrixArr2[i10], path);
            if (c2820g != null) {
                C2838y c2838y4 = c2838yArr[i10];
                Matrix matrix = matrixArr2[i10];
                C2823j c2823j = c2820g.f10458a;
                f9 = 0.0f;
                BitSet bitSet = c2823j.f10495n;
                c2838y4.getClass();
                bitSet.set(i10, z7);
                AbstractC2837x[] abstractC2837xArr = c2823j.f10493l;
                c2838y4.m4963a(c2838y4.f10568e);
                abstractC2837xArr[i10] = new C2831r(new ArrayList(c2838y4.f10570g), new Matrix(matrix));
            } else {
                f9 = 0.0f;
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            C2838y c2838y5 = c2838yArr[i10];
            fArr2[0] = c2838y5.f10565b;
            fArr2[1] = c2838y5.f10566c;
            matrixArr2[i10].mapPoints(fArr2);
            C2838y c2838y6 = c2838yArr[i12];
            c2838y6.getClass();
            float[] fArr3 = this.f10542i;
            fArr3[0] = f9;
            fArr3[1] = c2838y6.f10564a;
            matrixArr2[i12].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            C2838y[] c2838yArr2 = c2838yArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f9);
            C2838y c2838y7 = c2838yArr2[i10];
            fArr2[0] = c2838y7.f10565b;
            fArr2[1] = c2838y7.f10566c;
            matrixArr2[i10].mapPoints(fArr2);
            if (i10 == 1 || i10 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C2838y c2838y8 = this.f10540g;
            c2838y8.m4966d(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? c2828o.f10530j : c2828o.f10529i : c2828o.f10532l : c2828o.f10531k).getClass();
            c2838y8.m4965c(fMax, 0.0f);
            Path path4 = this.f10543j;
            path4.reset();
            c2838y8.m4964b(matrixArr3[i10], path4);
            if (this.f10545l && (m4959c(path4, i10) || m4959c(path4, i12))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c2838y8.f10564a;
                matrixArr3[i10].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c2838y8.m4964b(matrixArr3[i10], path2);
            } else {
                c2838y8.m4964b(matrixArr3[i10], path);
            }
            if (c2820g != null) {
                Matrix matrix2 = matrixArr3[i10];
                C2823j c2823j2 = c2820g.f10458a;
                z8 = false;
                c2823j2.f10495n.set(i10 + 4, false);
                AbstractC2837x[] abstractC2837xArr2 = c2823j2.f10494m;
                c2838y8.m4963a(c2838y8.f10568e);
                abstractC2837xArr2[i10] = new C2831r(new ArrayList(c2838y8.f10570g), new Matrix(matrix2));
            } else {
                z8 = false;
            }
            matrixArr = matrixArr3;
            i10 = i11;
            z7 = z8;
            c2838yArr = c2838yArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: c */
    public final boolean m4959c(Path path, int i) {
        Path path2 = this.f10544k;
        path2.reset();
        this.f10534a[i].m4964b(this.f10535b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
