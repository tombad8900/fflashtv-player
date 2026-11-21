package p211y5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.c */
/* loaded from: classes.dex */
public final class C2813c implements InterfaceC2815d {

    /* renamed from: a */
    public final float f10442a;

    public C2813c(float f8) {
        this.f10442a = f8;
    }

    @Override // p211y5.InterfaceC2815d
    /* renamed from: a */
    public final float mo4909a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f8 = this.f10442a;
        if (f8 < 0.0f) {
            return 0.0f;
        }
        return f8 > fMin ? fMin : f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2813c) && this.f10442a == ((C2813c) obj).f10442a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10442a)});
    }
}
