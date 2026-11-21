package p211y5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p205x5.C2782a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.t */
/* loaded from: classes.dex */
public final class C2833t extends AbstractC2837x {

    /* renamed from: c */
    public final C2835v f10549c;

    /* renamed from: d */
    public final float f10550d;

    /* renamed from: e */
    public final float f10551e;

    public C2833t(C2835v c2835v, float f8, float f9) {
        this.f10549c = c2835v;
        this.f10550d = f8;
        this.f10551e = f9;
    }

    @Override // p211y5.AbstractC2837x
    /* renamed from: a */
    public final void mo4960a(Matrix matrix, C2782a c2782a, int i, Canvas canvas) {
        C2835v c2835v = this.f10549c;
        float f8 = c2835v.f10560c;
        float f9 = this.f10551e;
        float f10 = c2835v.f10559b;
        float f11 = this.f10550d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f8 - f9, f10 - f11), 0.0f);
        Matrix matrix2 = this.f10563a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(m4961b());
        c2782a.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i4 = c2782a.f10340f;
        int[] iArr = C2782a.f10331i;
        iArr[0] = i4;
        iArr[1] = c2782a.f10339e;
        iArr[2] = c2782a.f10338d;
        Paint paint = c2782a.f10337c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, C2782a.f10332j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m4961b() {
        C2835v c2835v = this.f10549c;
        return (float) Math.toDegrees(Math.atan((c2835v.f10560c - this.f10551e) / (c2835v.f10559b - this.f10550d)));
    }
}
