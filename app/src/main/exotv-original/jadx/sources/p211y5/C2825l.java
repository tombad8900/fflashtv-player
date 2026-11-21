package p211y5;

import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.l */
/* loaded from: classes.dex */
public final class C2825l extends AbstractC2436a {
    @Override // p171t5.AbstractC2436a
    /* renamed from: f */
    public final void mo4348f(C2838y c2838y, float f8, float f9) {
        float f10 = f9 * f8;
        c2838y.m4966d(f10, 180.0f, 90.0f);
        float f11 = f10 * 2.0f;
        C2834u c2834u = new C2834u(0.0f, 0.0f, f11, f11);
        c2834u.f10557f = 180.0f;
        c2834u.f10558g = 90.0f;
        c2838y.f10569f.add(c2834u);
        C2832s c2832s = new C2832s(c2834u);
        c2838y.m4963a(180.0f);
        c2838y.f10570g.add(c2832s);
        c2838y.f10567d = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d8 = 270.0f;
        c2838y.f10565b = (((float) Math.cos(Math.toRadians(d8))) * f13) + f12;
        c2838y.f10566c = (f13 * ((float) Math.sin(Math.toRadians(d8)))) + f12;
    }
}
