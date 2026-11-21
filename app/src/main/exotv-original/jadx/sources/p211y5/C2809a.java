package p211y5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.a */
/* loaded from: classes.dex */
public final class C2809a implements InterfaceC2815d {

    /* renamed from: a */
    public final float f10427a;

    public C2809a(float f8) {
        this.f10427a = f8;
    }

    @Override // p211y5.InterfaceC2815d
    /* renamed from: a */
    public final float mo4909a(RectF rectF) {
        return this.f10427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2809a) && this.f10427a == ((C2809a) obj).f10427a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10427a)});
    }

    public final String toString() {
        return this.f10427a + "px";
    }
}
