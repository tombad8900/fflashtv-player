package p211y5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p205x5.C2782a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.s */
/* loaded from: classes.dex */
public final class C2832s extends AbstractC2837x {

    /* renamed from: c */
    public final C2834u f10548c;

    public C2832s(C2834u c2834u) {
        this.f10548c = c2834u;
    }

    @Override // p211y5.AbstractC2837x
    /* renamed from: a */
    public final void mo4960a(Matrix matrix, C2782a c2782a, int i, Canvas canvas) {
        float f8;
        C2834u c2834u = this.f10548c;
        float f9 = c2834u.f10557f;
        float f10 = c2834u.f10558g;
        RectF rectF = new RectF(c2834u.f10553b, c2834u.f10554c, c2834u.f10555d, c2834u.f10556e);
        Paint paint = c2782a.f10336b;
        boolean z7 = f10 < 0.0f;
        Path path = c2782a.f10341g;
        int[] iArr = C2782a.f10333k;
        if (z7) {
            iArr[0] = 0;
            iArr[1] = c2782a.f10340f;
            iArr[2] = c2782a.f10339e;
            iArr[3] = c2782a.f10338d;
            f8 = 0.0f;
        } else {
            path.rewind();
            f8 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f9, f10);
            path.close();
            float f11 = -i;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = c2782a.f10338d;
            iArr[2] = c2782a.f10339e;
            iArr[3] = c2782a.f10340f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f8) {
            return;
        }
        float f12 = 1.0f - (i / fWidth);
        float[] fArr = C2782a.f10334l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z7) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c2782a.f10342h);
        }
        canvas.drawArc(rectF, f9, f10, true, paint);
        canvas.restore();
    }
}
