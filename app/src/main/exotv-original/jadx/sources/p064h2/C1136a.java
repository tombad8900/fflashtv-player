package p064h2;

import androidx.media3.common.C0247v0;
import p063h1.C1132w;
import p115n1.AbstractC1965b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.a */
/* loaded from: classes.dex */
public final class C1136a {

    /* renamed from: a */
    public final int f4805a;

    /* renamed from: b */
    public int f4806b;

    /* renamed from: c */
    public int f4807c;

    /* renamed from: d */
    public long f4808d;

    /* renamed from: e */
    public final boolean f4809e;

    /* renamed from: f */
    public final C1132w f4810f;

    /* renamed from: g */
    public final C1132w f4811g;

    /* renamed from: h */
    public int f4812h;

    /* renamed from: i */
    public int f4813i;

    public C1136a(C1132w c1132w, C1132w c1132w2, boolean z7) throws C0247v0 {
        this.f4811g = c1132w;
        this.f4810f = c1132w2;
        this.f4809e = z7;
        c1132w2.m2513G(12);
        this.f4805a = c1132w2.m2539y();
        c1132w.m2513G(12);
        this.f4813i = c1132w.m2539y();
        AbstractC1965b.m3828d("first_chunk must be 1", c1132w.m2521g() == 1);
        this.f4806b = -1;
    }

    /* renamed from: a */
    public final boolean m2542a() {
        int i = this.f4806b + 1;
        this.f4806b = i;
        if (i == this.f4805a) {
            return false;
        }
        boolean z7 = this.f4809e;
        C1132w c1132w = this.f4810f;
        this.f4808d = z7 ? c1132w.m2540z() : c1132w.m2537w();
        if (this.f4806b == this.f4812h) {
            C1132w c1132w2 = this.f4811g;
            this.f4807c = c1132w2.m2539y();
            c1132w2.m2514H(4);
            int i4 = this.f4813i - 1;
            this.f4813i = i4;
            this.f4812h = i4 > 0 ? c1132w2.m2539y() - 1 : -1;
        }
        return true;
    }
}
