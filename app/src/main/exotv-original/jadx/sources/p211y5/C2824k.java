package p211y5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.k */
/* loaded from: classes.dex */
public final class C2824k implements InterfaceC2815d {

    /* renamed from: a */
    public final float f10508a;

    public C2824k(float f8) {
        this.f10508a = f8;
    }

    @Override // p211y5.InterfaceC2815d
    /* renamed from: a */
    public final float mo4909a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f10508a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2824k) && this.f10508a == ((C2824k) obj).f10508a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10508a)});
    }

    public final String toString() {
        return ((int) (this.f10508a * 100.0f)) + "%";
    }
}
