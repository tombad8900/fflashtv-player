package p211y5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.b */
/* loaded from: classes.dex */
public final class C2811b implements InterfaceC2815d {

    /* renamed from: a */
    public final InterfaceC2815d f10432a;

    /* renamed from: b */
    public final float f10433b;

    public C2811b(float f8, InterfaceC2815d interfaceC2815d) {
        while (interfaceC2815d instanceof C2811b) {
            interfaceC2815d = ((C2811b) interfaceC2815d).f10432a;
            f8 += ((C2811b) interfaceC2815d).f10433b;
        }
        this.f10432a = interfaceC2815d;
        this.f10433b = f8;
    }

    @Override // p211y5.InterfaceC2815d
    /* renamed from: a */
    public final float mo4909a(RectF rectF) {
        return Math.max(0.0f, this.f10432a.mo4909a(rectF) + this.f10433b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2811b)) {
            return false;
        }
        C2811b c2811b = (C2811b) obj;
        return this.f10432a.equals(c2811b.f10432a) && this.f10433b == c2811b.f10433b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10432a, Float.valueOf(this.f10433b)});
    }
}
