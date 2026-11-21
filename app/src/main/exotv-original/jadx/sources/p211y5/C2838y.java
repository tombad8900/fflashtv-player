package p211y5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.y */
/* loaded from: classes.dex */
public final class C2838y {

    /* renamed from: a */
    public float f10564a;

    /* renamed from: b */
    public float f10565b;

    /* renamed from: c */
    public float f10566c;

    /* renamed from: d */
    public float f10567d;

    /* renamed from: e */
    public float f10568e;

    /* renamed from: f */
    public final ArrayList f10569f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f10570g = new ArrayList();

    public C2838y() {
        m4966d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m4963a(float f8) {
        float f9 = this.f10567d;
        if (f9 == f8) {
            return;
        }
        float f10 = ((f8 - f9) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f10565b;
        float f12 = this.f10566c;
        C2834u c2834u = new C2834u(f11, f12, f11, f12);
        c2834u.f10557f = this.f10567d;
        c2834u.f10558g = f10;
        this.f10570g.add(new C2832s(c2834u));
        this.f10567d = f8;
    }

    /* renamed from: b */
    public final void m4964b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f10569f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2836w) arrayList.get(i)).mo4962a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m4965c(float f8, float f9) {
        C2835v c2835v = new C2835v();
        c2835v.f10559b = f8;
        c2835v.f10560c = f9;
        this.f10569f.add(c2835v);
        C2833t c2833t = new C2833t(c2835v, this.f10565b, this.f10566c);
        float fM4961b = c2833t.m4961b() + 270.0f;
        float fM4961b2 = c2833t.m4961b() + 270.0f;
        m4963a(fM4961b);
        this.f10570g.add(c2833t);
        this.f10567d = fM4961b2;
        this.f10565b = f8;
        this.f10566c = f9;
    }

    /* renamed from: d */
    public final void m4966d(float f8, float f9, float f10) {
        this.f10564a = f8;
        this.f10565b = 0.0f;
        this.f10566c = f8;
        this.f10567d = f9;
        this.f10568e = (f9 + f10) % 360.0f;
        this.f10569f.clear();
        this.f10570g.clear();
    }
}
