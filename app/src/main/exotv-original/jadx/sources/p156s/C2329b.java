package p156s;

import java.util.ArrayList;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.b */
/* loaded from: classes.dex */
public class C2329b {

    /* renamed from: d */
    public final C2328a f8149d;

    /* renamed from: a */
    public C2335h f8146a = null;

    /* renamed from: b */
    public float f8147b = 0.0f;

    /* renamed from: c */
    public final ArrayList f8148c = new ArrayList();

    /* renamed from: e */
    public boolean f8150e = false;

    public C2329b(C0073c c0073c) {
        this.f8149d = new C2328a(this, c0073c);
    }

    /* renamed from: a */
    public final void m4116a(C2330c c2330c, int i) {
        this.f8149d.m4114g(c2330c.m4135j(i), 1.0f);
        this.f8149d.m4114g(c2330c.m4135j(i), -1.0f);
    }

    /* renamed from: b */
    public final void m4117b(C2335h c2335h, C2335h c2335h2, C2335h c2335h3, int i) {
        boolean z7 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z7 = true;
            }
            this.f8147b = i;
        }
        if (z7) {
            this.f8149d.m4114g(c2335h, 1.0f);
            this.f8149d.m4114g(c2335h2, -1.0f);
            this.f8149d.m4114g(c2335h3, -1.0f);
        } else {
            this.f8149d.m4114g(c2335h, -1.0f);
            this.f8149d.m4114g(c2335h2, 1.0f);
            this.f8149d.m4114g(c2335h3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m4118c(C2335h c2335h, C2335h c2335h2, C2335h c2335h3, int i) {
        boolean z7 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z7 = true;
            }
            this.f8147b = i;
        }
        if (z7) {
            this.f8149d.m4114g(c2335h, 1.0f);
            this.f8149d.m4114g(c2335h2, -1.0f);
            this.f8149d.m4114g(c2335h3, 1.0f);
        } else {
            this.f8149d.m4114g(c2335h, -1.0f);
            this.f8149d.m4114g(c2335h2, 1.0f);
            this.f8149d.m4114g(c2335h3, -1.0f);
        }
    }

    /* renamed from: d */
    public C2335h mo4119d(boolean[] zArr) {
        return m4121f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo4120e() {
        return this.f8146a == null && this.f8147b == 0.0f && this.f8149d.m4111d() == 0;
    }

    /* renamed from: f */
    public final C2335h m4121f(boolean[] zArr, C2335h c2335h) {
        int i;
        int iM4111d = this.f8149d.m4111d();
        C2335h c2335h2 = null;
        float f8 = 0.0f;
        for (int i4 = 0; i4 < iM4111d; i4++) {
            float fM4113f = this.f8149d.m4113f(i4);
            if (fM4113f < 0.0f) {
                C2335h c2335hM4112e = this.f8149d.m4112e(i4);
                if ((zArr == null || !zArr[c2335hM4112e.f8177k]) && c2335hM4112e != c2335h && (((i = c2335hM4112e.f8187u) == 3 || i == 4) && fM4113f < f8)) {
                    f8 = fM4113f;
                    c2335h2 = c2335hM4112e;
                }
            }
        }
        return c2335h2;
    }

    /* renamed from: g */
    public final void m4122g(C2335h c2335h) {
        C2335h c2335h2 = this.f8146a;
        if (c2335h2 != null) {
            this.f8149d.m4114g(c2335h2, -1.0f);
            this.f8146a.f8178l = -1;
            this.f8146a = null;
        }
        float fM4115h = this.f8149d.m4115h(c2335h, true) * (-1.0f);
        this.f8146a = c2335h;
        if (fM4115h == 1.0f) {
            return;
        }
        this.f8147b /= fM4115h;
        C2328a c2328a = this.f8149d;
        int i = c2328a.f8143h;
        for (int i4 = 0; i != -1 && i4 < c2328a.f8136a; i4++) {
            float[] fArr = c2328a.f8142g;
            fArr[i] = fArr[i] / fM4115h;
            i = c2328a.f8141f[i];
        }
    }

    /* renamed from: h */
    public final void m4123h(C2330c c2330c, C2335h c2335h, boolean z7) {
        if (c2335h.f8181o) {
            float fM4110c = this.f8149d.m4110c(c2335h);
            this.f8147b = (c2335h.f8180n * fM4110c) + this.f8147b;
            this.f8149d.m4115h(c2335h, z7);
            if (z7) {
                c2335h.m4164b(this);
            }
            if (this.f8149d.m4111d() == 0) {
                this.f8150e = true;
                c2330c.f8153b = true;
            }
        }
    }

    /* renamed from: i */
    public void mo4124i(C2330c c2330c, C2329b c2329b, boolean z7) {
        C2328a c2328a = this.f8149d;
        c2328a.getClass();
        float fM4110c = c2328a.m4110c(c2329b.f8146a);
        c2328a.m4115h(c2329b.f8146a, z7);
        C2328a c2328a2 = c2329b.f8149d;
        int iM4111d = c2328a2.m4111d();
        for (int i = 0; i < iM4111d; i++) {
            C2335h c2335hM4112e = c2328a2.m4112e(i);
            c2328a.m4108a(c2335hM4112e, c2328a2.m4110c(c2335hM4112e) * fM4110c, z7);
        }
        this.f8147b = (c2329b.f8147b * fM4110c) + this.f8147b;
        if (z7) {
            c2329b.f8146a.m4164b(this);
        }
        if (this.f8146a == null || this.f8149d.m4111d() != 0) {
            return;
        }
        this.f8150e = true;
        c2330c.f8153b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z7;
        String strM16l = AbstractC0008a1.m16l(this.f8146a == null ? "0" : C2181z.FRAGMENT_ENCODE_SET + this.f8146a, " = ");
        if (this.f8147b != 0.0f) {
            strM16l = strM16l + this.f8147b;
            z7 = true;
        } else {
            z7 = false;
        }
        int iM4111d = this.f8149d.m4111d();
        for (int i = 0; i < iM4111d; i++) {
            C2335h c2335hM4112e = this.f8149d.m4112e(i);
            if (c2335hM4112e != null) {
                float fM4113f = this.f8149d.m4113f(i);
                if (fM4113f != 0.0f) {
                    String string = c2335hM4112e.toString();
                    if (!z7) {
                        if (fM4113f < 0.0f) {
                            strM16l = AbstractC0008a1.m16l(strM16l, "- ");
                            fM4113f *= -1.0f;
                        }
                        strM16l = fM4113f == 1.0f ? AbstractC0008a1.m16l(strM16l, string) : strM16l + fM4113f + " " + string;
                        z7 = true;
                    } else if (fM4113f > 0.0f) {
                        strM16l = AbstractC0008a1.m16l(strM16l, " + ");
                        if (fM4113f == 1.0f) {
                        }
                        z7 = true;
                    } else {
                        strM16l = AbstractC0008a1.m16l(strM16l, " - ");
                        fM4113f *= -1.0f;
                        if (fM4113f == 1.0f) {
                        }
                        z7 = true;
                    }
                }
            }
        }
        return !z7 ? AbstractC0008a1.m16l(strM16l, "0.0") : strM16l;
    }
}
