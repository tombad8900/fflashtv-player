package p211y5;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.v */
/* loaded from: classes.dex */
public final class C2835v extends AbstractC2836w {

    /* renamed from: b */
    public float f10559b;

    /* renamed from: c */
    public float f10560c;

    @Override // p211y5.AbstractC2836w
    /* renamed from: a */
    public final void mo4962a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10561a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f10559b, this.f10560c);
        path.transform(matrix);
    }
}
