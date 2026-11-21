package p156s;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C2333f extends C2329b {

    /* renamed from: f */
    public C2335h[] f8172f;

    /* renamed from: g */
    public C2335h[] f8173g;

    /* renamed from: h */
    public int f8174h;

    /* renamed from: i */
    public C2332e f8175i;

    @Override // p156s.C2329b
    /* renamed from: d */
    public final C2335h mo4119d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.f8174h; i4++) {
            C2335h[] c2335hArr = this.f8172f;
            C2335h c2335h = c2335hArr[i4];
            if (!zArr[c2335h.f8177k]) {
                C2332e c2332e = this.f8175i;
                c2332e.f8170k = c2335h;
                int i8 = 8;
                if (i == -1) {
                    while (i8 >= 0) {
                        float f8 = ((C2335h) c2332e.f8170k).f8183q[i8];
                        if (f8 <= 0.0f) {
                            if (f8 < 0.0f) {
                                i = i4;
                                break;
                            }
                            i8--;
                        }
                    }
                } else {
                    C2335h c2335h2 = c2335hArr[i];
                    while (true) {
                        if (i8 >= 0) {
                            float f9 = c2335h2.f8183q[i8];
                            float f10 = ((C2335h) c2332e.f8170k).f8183q[i8];
                            if (f10 == f9) {
                                i8--;
                            } else if (f10 < f9) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8172f[i];
    }

    @Override // p156s.C2329b
    /* renamed from: e */
    public final boolean mo4120e() {
        return this.f8174h == 0;
    }

    @Override // p156s.C2329b
    /* renamed from: i */
    public final void mo4124i(C2330c c2330c, C2329b c2329b, boolean z7) {
        C2335h c2335h = c2329b.f8146a;
        if (c2335h == null) {
            return;
        }
        float[] fArr = c2335h.f8183q;
        C2328a c2328a = c2329b.f8149d;
        int iM4111d = c2328a.m4111d();
        for (int i = 0; i < iM4111d; i++) {
            C2335h c2335hM4112e = c2328a.m4112e(i);
            float fM4113f = c2328a.m4113f(i);
            C2332e c2332e = this.f8175i;
            c2332e.f8170k = c2335hM4112e;
            if (c2335hM4112e.f8176j) {
                boolean z8 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((C2335h) c2332e.f8170k).f8183q;
                    float f8 = (fArr[i4] * fM4113f) + fArr2[i4];
                    fArr2[i4] = f8;
                    if (Math.abs(f8) < 1.0E-4f) {
                        ((C2335h) c2332e.f8170k).f8183q[i4] = 0.0f;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    ((C2333f) c2332e.f8171l).m4161k((C2335h) c2332e.f8170k);
                }
            } else {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f9 = fArr[i8];
                    if (f9 != 0.0f) {
                        float f10 = f9 * fM4113f;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        ((C2335h) c2332e.f8170k).f8183q[i8] = f10;
                    } else {
                        ((C2335h) c2332e.f8170k).f8183q[i8] = 0.0f;
                    }
                }
                m4160j(c2335hM4112e);
            }
            this.f8147b = (c2329b.f8147b * fM4113f) + this.f8147b;
        }
        m4161k(c2335h);
    }

    /* renamed from: j */
    public final void m4160j(C2335h c2335h) {
        int i;
        int i4 = this.f8174h + 1;
        C2335h[] c2335hArr = this.f8172f;
        if (i4 > c2335hArr.length) {
            C2335h[] c2335hArr2 = (C2335h[]) Arrays.copyOf(c2335hArr, c2335hArr.length * 2);
            this.f8172f = c2335hArr2;
            this.f8173g = (C2335h[]) Arrays.copyOf(c2335hArr2, c2335hArr2.length * 2);
        }
        C2335h[] c2335hArr3 = this.f8172f;
        int i8 = this.f8174h;
        c2335hArr3[i8] = c2335h;
        int i9 = i8 + 1;
        this.f8174h = i9;
        if (i9 > 1 && c2335hArr3[i8].f8177k > c2335h.f8177k) {
            int i10 = 0;
            while (true) {
                i = this.f8174h;
                if (i10 >= i) {
                    break;
                }
                this.f8173g[i10] = this.f8172f[i10];
                i10++;
            }
            Arrays.sort(this.f8173g, 0, i, new C2331d(0));
            for (int i11 = 0; i11 < this.f8174h; i11++) {
                this.f8172f[i11] = this.f8173g[i11];
            }
        }
        c2335h.f8176j = true;
        c2335h.m4163a(this);
    }

    /* renamed from: k */
    public final void m4161k(C2335h c2335h) {
        int i = 0;
        while (i < this.f8174h) {
            if (this.f8172f[i] == c2335h) {
                while (true) {
                    int i4 = this.f8174h;
                    if (i >= i4 - 1) {
                        this.f8174h = i4 - 1;
                        c2335h.f8176j = false;
                        return;
                    } else {
                        C2335h[] c2335hArr = this.f8172f;
                        int i8 = i + 1;
                        c2335hArr[i] = c2335hArr[i8];
                        i = i8;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p156s.C2329b
    public final String toString() {
        C2332e c2332e = this.f8175i;
        String str = " goal -> (" + this.f8147b + ") : ";
        for (int i = 0; i < this.f8174h; i++) {
            c2332e.f8170k = this.f8172f[i];
            str = str + c2332e + " ";
        }
        return str;
    }
}
