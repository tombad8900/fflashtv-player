package p017b6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p211y5.C2823j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.i */
/* loaded from: classes.dex */
public abstract class AbstractC0607i extends C2823j {

    /* renamed from: Q */
    public static final /* synthetic */ int f2408Q = 0;

    /* renamed from: P */
    public C0603g f2409P;

    @Override // p211y5.C2823j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2409P = new C0603g(this.f2409P);
        return this;
    }

    /* renamed from: w */
    public final void m1365w(float f8, float f9, float f10, float f11) {
        RectF rectF = this.f2409P.f2406q;
        if (f8 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f8, f9, f10, f11);
        invalidateSelf();
    }
}
