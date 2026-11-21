package p211y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.u */
/* loaded from: classes.dex */
public final class C2834u extends AbstractC2836w {

    /* renamed from: h */
    public static final RectF f10552h = new RectF();

    /* renamed from: b */
    public final float f10553b;

    /* renamed from: c */
    public final float f10554c;

    /* renamed from: d */
    public final float f10555d;

    /* renamed from: e */
    public final float f10556e;

    /* renamed from: f */
    public float f10557f;

    /* renamed from: g */
    public float f10558g;

    public C2834u(float f8, float f9, float f10, float f11) {
        this.f10553b = f8;
        this.f10554c = f9;
        this.f10555d = f10;
        this.f10556e = f11;
    }

    @Override // p211y5.AbstractC2836w
    /* renamed from: a */
    public final void mo4962a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10561a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f8 = this.f10555d;
        float f9 = this.f10556e;
        RectF rectF = f10552h;
        rectF.set(this.f10553b, this.f10554c, f8, f9);
        path.arcTo(rectF, this.f10557f, this.f10558g, false);
        path.transform(matrix);
    }
}
