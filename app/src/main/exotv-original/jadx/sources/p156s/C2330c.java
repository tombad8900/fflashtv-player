package p156s;

import java.util.ArrayList;
import java.util.Arrays;
import p005a4.C0073c;
import p096l0.C1643c;
import p174u.C2441c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C2330c {

    /* renamed from: q */
    public static boolean f8151q;

    /* renamed from: d */
    public final C2333f f8155d;

    /* renamed from: m */
    public final C0073c f8164m;

    /* renamed from: p */
    public C2329b f8167p;

    /* renamed from: a */
    public int f8152a = 1000;

    /* renamed from: b */
    public boolean f8153b = false;

    /* renamed from: c */
    public int f8154c = 0;

    /* renamed from: e */
    public int f8156e = 32;

    /* renamed from: f */
    public int f8157f = 32;

    /* renamed from: h */
    public boolean f8159h = false;

    /* renamed from: i */
    public boolean[] f8160i = new boolean[32];

    /* renamed from: j */
    public int f8161j = 1;

    /* renamed from: k */
    public int f8162k = 0;

    /* renamed from: l */
    public int f8163l = 32;

    /* renamed from: n */
    public C2335h[] f8165n = new C2335h[1000];

    /* renamed from: o */
    public int f8166o = 0;

    /* renamed from: g */
    public C2329b[] f8158g = new C2329b[32];

    public C2330c() {
        m4143s();
        C0073c c0073c = new C0073c(22);
        c0073c.f324k = new C1643c();
        c0073c.f325l = new C1643c();
        c0073c.f326m = new C2335h[32];
        this.f8164m = c0073c;
        C2333f c2333f = new C2333f(c0073c);
        c2333f.f8172f = new C2335h[128];
        c2333f.f8173g = new C2335h[128];
        c2333f.f8174h = 0;
        c2333f.f8175i = new C2332e(c2333f);
        this.f8155d = c2333f;
        this.f8167p = new C2329b(c0073c);
    }

    /* renamed from: n */
    public static int m4125n(Object obj) {
        C2335h c2335h = ((C2441c) obj).f8819i;
        if (c2335h != null) {
            return (int) (c2335h.f8180n + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C2335h m4126a(int i) {
        C1643c c1643c = (C1643c) this.f8164m.f325l;
        int i4 = c1643c.f6283k;
        C2335h c2335h = null;
        if (i4 > 0) {
            int i8 = i4 - 1;
            ?? r32 = c1643c.f6282j;
            ?? r42 = r32[i8];
            r32[i8] = 0;
            c1643c.f6283k = i8;
            c2335h = r42;
        }
        C2335h c2335h2 = c2335h;
        if (c2335h2 == null) {
            c2335h2 = new C2335h(i);
            c2335h2.f8187u = i;
        } else {
            c2335h2.m4165c();
            c2335h2.f8187u = i;
        }
        int i9 = this.f8166o;
        int i10 = this.f8152a;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            this.f8152a = i11;
            this.f8165n = (C2335h[]) Arrays.copyOf(this.f8165n, i11);
        }
        C2335h[] c2335hArr = this.f8165n;
        int i12 = this.f8166o;
        this.f8166o = i12 + 1;
        c2335hArr[i12] = c2335h2;
        return c2335h2;
    }

    /* renamed from: b */
    public final void m4127b(C2335h c2335h, C2335h c2335h2, int i, float f8, C2335h c2335h3, C2335h c2335h4, int i4, int i8) {
        C2329b c2329bM4137l = m4137l();
        if (c2335h2 == c2335h3) {
            c2329bM4137l.f8149d.m4114g(c2335h, 1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h4, 1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, -2.0f);
        } else if (f8 == 0.5f) {
            c2329bM4137l.f8149d.m4114g(c2335h, 1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h3, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h4, 1.0f);
            if (i > 0 || i4 > 0) {
                c2329bM4137l.f8147b = (-i) + i4;
            }
        } else if (f8 <= 0.0f) {
            c2329bM4137l.f8149d.m4114g(c2335h, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, 1.0f);
            c2329bM4137l.f8147b = i;
        } else if (f8 >= 1.0f) {
            c2329bM4137l.f8149d.m4114g(c2335h4, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h3, 1.0f);
            c2329bM4137l.f8147b = -i4;
        } else {
            float f9 = 1.0f - f8;
            c2329bM4137l.f8149d.m4114g(c2335h, f9 * 1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, f9 * (-1.0f));
            c2329bM4137l.f8149d.m4114g(c2335h3, (-1.0f) * f8);
            c2329bM4137l.f8149d.m4114g(c2335h4, 1.0f * f8);
            if (i > 0 || i4 > 0) {
                c2329bM4137l.f8147b = (i4 * f8) + ((-i) * f9);
            }
        }
        if (i8 != 8) {
            c2329bM4137l.m4116a(this, i8);
        }
        m4128c(c2329bM4137l);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4128c(C2329b c2329b) {
        boolean z7;
        boolean z8;
        C2335h c2335h;
        C2335h c2335hM4121f;
        if (this.f8162k + 1 >= this.f8163l || this.f8161j + 1 >= this.f8157f) {
            m4139o();
        }
        if (c2329b.f8150e) {
            z7 = false;
        } else {
            ArrayList arrayList = c2329b.f8148c;
            if (this.f8158g.length != 0) {
                boolean z9 = false;
                while (!z9) {
                    int iM4111d = c2329b.f8149d.m4111d();
                    for (int i = 0; i < iM4111d; i++) {
                        C2335h c2335hM4112e = c2329b.f8149d.m4112e(i);
                        if (c2335hM4112e.f8178l != -1 || c2335hM4112e.f8181o) {
                            arrayList.add(c2335hM4112e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i4 = 0; i4 < size; i4++) {
                            C2335h c2335h2 = (C2335h) arrayList.get(i4);
                            if (c2335h2.f8181o) {
                                c2329b.m4123h(this, c2335h2, true);
                            } else {
                                c2329b.mo4124i(this, this.f8158g[c2335h2.f8178l], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z9 = true;
                    }
                }
                if (c2329b.f8146a != null && c2329b.f8149d.m4111d() == 0) {
                    c2329b.f8150e = true;
                    this.f8153b = true;
                }
            }
            if (c2329b.mo4120e()) {
                return;
            }
            float f8 = c2329b.f8147b;
            float f9 = 0.0f;
            if (f8 < 0.0f) {
                c2329b.f8147b = f8 * (-1.0f);
                C2328a c2328a = c2329b.f8149d;
                int i8 = c2328a.f8143h;
                for (int i9 = 0; i8 != -1 && i9 < c2328a.f8136a; i9++) {
                    float[] fArr = c2328a.f8142g;
                    fArr[i8] = fArr[i8] * (-1.0f);
                    i8 = c2328a.f8141f[i8];
                }
            }
            int iM4111d2 = c2329b.f8149d.m4111d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            C2335h c2335h3 = null;
            C2335h c2335h4 = null;
            int i10 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i10 < iM4111d2) {
                float fM4113f = c2329b.f8149d.m4113f(i10);
                C2335h c2335hM4112e2 = c2329b.f8149d.m4112e(i10);
                float f12 = f9;
                if (c2335hM4112e2.f8187u == 1) {
                    if (c2335h3 == null) {
                        z10 = c2335hM4112e2.f8186t <= 1;
                    } else if (f10 > fM4113f) {
                        if (c2335hM4112e2.f8186t <= 1) {
                        }
                    } else if (z10 || c2335hM4112e2.f8186t > 1) {
                    }
                    c2335h3 = c2335hM4112e2;
                    f10 = fM4113f;
                } else if (c2335h3 == null && fM4113f < f12) {
                    if (c2335h4 == null) {
                        z11 = c2335hM4112e2.f8186t <= 1;
                    } else if (f11 > fM4113f) {
                        if (c2335hM4112e2.f8186t <= 1) {
                        }
                    } else if (z11 || c2335hM4112e2.f8186t > 1) {
                    }
                    c2335h4 = c2335hM4112e2;
                    f11 = fM4113f;
                }
                i10++;
                f9 = f12;
            }
            float f13 = f9;
            if (c2335h3 == null) {
                c2335h3 = c2335h4;
            }
            if (c2335h3 == null) {
                z8 = true;
            } else {
                c2329b.m4122g(c2335h3);
                z8 = false;
            }
            if (c2329b.f8149d.m4111d() == 0) {
                c2329b.f8150e = true;
            }
            if (z8) {
                if (this.f8161j + 1 >= this.f8157f) {
                    m4139o();
                }
                C2335h c2335hM4126a = m4126a(3);
                int i11 = this.f8154c + 1;
                this.f8154c = i11;
                this.f8161j++;
                c2335hM4126a.f8177k = i11;
                C0073c c0073c = this.f8164m;
                ((C2335h[]) c0073c.f326m)[i11] = c2335hM4126a;
                c2329b.f8146a = c2335hM4126a;
                int i12 = this.f8162k;
                m4133h(c2329b);
                if (this.f8162k == i12 + 1) {
                    C2329b c2329b2 = this.f8167p;
                    c2329b2.f8146a = null;
                    c2329b2.f8149d.m4109b();
                    for (int i13 = 0; i13 < c2329b.f8149d.m4111d(); i13++) {
                        c2329b2.f8149d.m4108a(c2329b.f8149d.m4112e(i13), c2329b.f8149d.m4113f(i13), true);
                    }
                    m4142r(this.f8167p);
                    if (c2335hM4126a.f8178l == -1) {
                        if (c2329b.f8146a == c2335hM4126a && (c2335hM4121f = c2329b.m4121f(null, c2335hM4126a)) != null) {
                            c2329b.m4122g(c2335hM4121f);
                        }
                        if (!c2329b.f8150e) {
                            c2329b.f8146a.m4167e(this, c2329b);
                        }
                        ((C1643c) c0073c.f324k).m3342a(c2329b);
                        this.f8162k--;
                    }
                    z7 = true;
                }
                c2335h = c2329b.f8146a;
                if (c2335h != null) {
                }
            } else {
                z7 = false;
                c2335h = c2329b.f8146a;
                if (c2335h != null) {
                    return;
                }
                if (c2335h.f8187u != 1 && c2329b.f8147b < f13) {
                    return;
                }
            }
        }
        if (z7) {
            return;
        }
        m4133h(c2329b);
    }

    /* renamed from: d */
    public final void m4129d(C2335h c2335h, int i) {
        int i4 = c2335h.f8178l;
        if (i4 == -1) {
            c2335h.m4166d(this, i);
            for (int i8 = 0; i8 < this.f8154c + 1; i8++) {
                C2335h c2335h2 = ((C2335h[]) this.f8164m.f326m)[i8];
            }
            return;
        }
        if (i4 == -1) {
            C2329b c2329bM4137l = m4137l();
            c2329bM4137l.f8146a = c2335h;
            float f8 = i;
            c2335h.f8180n = f8;
            c2329bM4137l.f8147b = f8;
            c2329bM4137l.f8150e = true;
            m4128c(c2329bM4137l);
            return;
        }
        C2329b c2329b = this.f8158g[i4];
        if (c2329b.f8150e) {
            c2329b.f8147b = i;
            return;
        }
        if (c2329b.f8149d.m4111d() == 0) {
            c2329b.f8150e = true;
            c2329b.f8147b = i;
            return;
        }
        C2329b c2329bM4137l2 = m4137l();
        if (i < 0) {
            c2329bM4137l2.f8147b = i * (-1);
            c2329bM4137l2.f8149d.m4114g(c2335h, 1.0f);
        } else {
            c2329bM4137l2.f8147b = i;
            c2329bM4137l2.f8149d.m4114g(c2335h, -1.0f);
        }
        m4128c(c2329bM4137l2);
    }

    /* renamed from: e */
    public final void m4130e(C2335h c2335h, C2335h c2335h2, int i, int i4) {
        if (i4 == 8 && c2335h2.f8181o && c2335h.f8178l == -1) {
            c2335h.m4166d(this, c2335h2.f8180n + i);
            return;
        }
        C2329b c2329bM4137l = m4137l();
        boolean z7 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z7 = true;
            }
            c2329bM4137l.f8147b = i;
        }
        if (z7) {
            c2329bM4137l.f8149d.m4114g(c2335h, 1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, -1.0f);
        } else {
            c2329bM4137l.f8149d.m4114g(c2335h, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335h2, 1.0f);
        }
        if (i4 != 8) {
            c2329bM4137l.m4116a(this, i4);
        }
        m4128c(c2329bM4137l);
    }

    /* renamed from: f */
    public final void m4131f(C2335h c2335h, C2335h c2335h2, int i, int i4) {
        C2329b c2329bM4137l = m4137l();
        C2335h c2335hM4138m = m4138m();
        c2335hM4138m.f8179m = 0;
        c2329bM4137l.m4117b(c2335h, c2335h2, c2335hM4138m, i);
        if (i4 != 8) {
            c2329bM4137l.f8149d.m4114g(m4135j(i4), (int) (c2329bM4137l.f8149d.m4110c(c2335hM4138m) * (-1.0f)));
        }
        m4128c(c2329bM4137l);
    }

    /* renamed from: g */
    public final void m4132g(C2335h c2335h, C2335h c2335h2, int i, int i4) {
        C2329b c2329bM4137l = m4137l();
        C2335h c2335hM4138m = m4138m();
        c2335hM4138m.f8179m = 0;
        c2329bM4137l.m4118c(c2335h, c2335h2, c2335hM4138m, i);
        if (i4 != 8) {
            c2329bM4137l.f8149d.m4114g(m4135j(i4), (int) (c2329bM4137l.f8149d.m4110c(c2335hM4138m) * (-1.0f)));
        }
        m4128c(c2329bM4137l);
    }

    /* renamed from: h */
    public final void m4133h(C2329b c2329b) {
        int i;
        if (c2329b.f8150e) {
            c2329b.f8146a.m4166d(this, c2329b.f8147b);
        } else {
            C2329b[] c2329bArr = this.f8158g;
            int i4 = this.f8162k;
            c2329bArr[i4] = c2329b;
            C2335h c2335h = c2329b.f8146a;
            c2335h.f8178l = i4;
            this.f8162k = i4 + 1;
            c2335h.m4167e(this, c2329b);
        }
        if (this.f8153b) {
            int i8 = 0;
            while (i8 < this.f8162k) {
                if (this.f8158g[i8] == null) {
                    System.out.println("WTF");
                }
                C2329b c2329b2 = this.f8158g[i8];
                if (c2329b2 != null && c2329b2.f8150e) {
                    c2329b2.f8146a.m4166d(this, c2329b2.f8147b);
                    ((C1643c) this.f8164m.f324k).m3342a(c2329b2);
                    this.f8158g[i8] = null;
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (true) {
                        i = this.f8162k;
                        if (i9 >= i) {
                            break;
                        }
                        C2329b[] c2329bArr2 = this.f8158g;
                        int i11 = i9 - 1;
                        C2329b c2329b3 = c2329bArr2[i9];
                        c2329bArr2[i11] = c2329b3;
                        C2335h c2335h2 = c2329b3.f8146a;
                        if (c2335h2.f8178l == i9) {
                            c2335h2.f8178l = i11;
                        }
                        i10 = i9;
                        i9++;
                    }
                    if (i10 < i) {
                        this.f8158g[i10] = null;
                    }
                    this.f8162k = i - 1;
                    i8--;
                }
                i8++;
            }
            this.f8153b = false;
        }
    }

    /* renamed from: i */
    public final void m4134i() {
        for (int i = 0; i < this.f8162k; i++) {
            C2329b c2329b = this.f8158g[i];
            c2329b.f8146a.f8180n = c2329b.f8147b;
        }
    }

    /* renamed from: j */
    public final C2335h m4135j(int i) {
        if (this.f8161j + 1 >= this.f8157f) {
            m4139o();
        }
        C2335h c2335hM4126a = m4126a(4);
        float[] fArr = c2335hM4126a.f8183q;
        int i4 = this.f8154c + 1;
        this.f8154c = i4;
        this.f8161j++;
        c2335hM4126a.f8177k = i4;
        c2335hM4126a.f8179m = i;
        ((C2335h[]) this.f8164m.f326m)[i4] = c2335hM4126a;
        C2333f c2333f = this.f8155d;
        c2333f.f8175i.f8170k = c2335hM4126a;
        Arrays.fill(fArr, 0.0f);
        fArr[c2335hM4126a.f8179m] = 1.0f;
        c2333f.m4160j(c2335hM4126a);
        return c2335hM4126a;
    }

    /* renamed from: k */
    public final C2335h m4136k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f8161j + 1 >= this.f8157f) {
            m4139o();
        }
        if (!(obj instanceof C2441c)) {
            return null;
        }
        C2441c c2441c = (C2441c) obj;
        C2335h c2335h = c2441c.f8819i;
        if (c2335h == null) {
            c2441c.m4365k();
            c2335h = c2441c.f8819i;
        }
        int i = c2335h.f8177k;
        C0073c c0073c = this.f8164m;
        if (i != -1 && i <= this.f8154c && ((C2335h[]) c0073c.f326m)[i] != null) {
            return c2335h;
        }
        if (i != -1) {
            c2335h.m4165c();
        }
        int i4 = this.f8154c + 1;
        this.f8154c = i4;
        this.f8161j++;
        c2335h.f8177k = i4;
        c2335h.f8187u = 1;
        ((C2335h[]) c0073c.f326m)[i4] = c2335h;
        return c2335h;
    }

    /* renamed from: l */
    public final C2329b m4137l() {
        Object obj;
        C0073c c0073c = this.f8164m;
        C1643c c1643c = (C1643c) c0073c.f324k;
        int i = c1643c.f6283k;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = c1643c.f6282j;
            obj = objArr[i4];
            objArr[i4] = null;
            c1643c.f6283k = i4;
        } else {
            obj = null;
        }
        C2329b c2329b = (C2329b) obj;
        if (c2329b == null) {
            return new C2329b(c0073c);
        }
        c2329b.f8146a = null;
        c2329b.f8149d.m4109b();
        c2329b.f8147b = 0.0f;
        c2329b.f8150e = false;
        return c2329b;
    }

    /* renamed from: m */
    public final C2335h m4138m() {
        if (this.f8161j + 1 >= this.f8157f) {
            m4139o();
        }
        C2335h c2335hM4126a = m4126a(3);
        int i = this.f8154c + 1;
        this.f8154c = i;
        this.f8161j++;
        c2335hM4126a.f8177k = i;
        ((C2335h[]) this.f8164m.f326m)[i] = c2335hM4126a;
        return c2335hM4126a;
    }

    /* renamed from: o */
    public final void m4139o() {
        int i = this.f8156e * 2;
        this.f8156e = i;
        this.f8158g = (C2329b[]) Arrays.copyOf(this.f8158g, i);
        C0073c c0073c = this.f8164m;
        c0073c.f326m = (C2335h[]) Arrays.copyOf((C2335h[]) c0073c.f326m, this.f8156e);
        int i4 = this.f8156e;
        this.f8160i = new boolean[i4];
        this.f8157f = i4;
        this.f8163l = i4;
    }

    /* renamed from: p */
    public final void m4140p() {
        C2333f c2333f = this.f8155d;
        if (c2333f.mo4120e()) {
            m4134i();
            return;
        }
        if (!this.f8159h) {
            m4141q(c2333f);
            return;
        }
        for (int i = 0; i < this.f8162k; i++) {
            if (!this.f8158g[i].f8150e) {
                m4141q(c2333f);
                return;
            }
        }
        m4134i();
    }

    /* renamed from: q */
    public final void m4141q(C2333f c2333f) {
        int i = 0;
        while (true) {
            if (i >= this.f8162k) {
                break;
            }
            C2329b c2329b = this.f8158g[i];
            int i4 = 1;
            if (c2329b.f8146a.f8187u != 1) {
                float f8 = 0.0f;
                if (c2329b.f8147b < 0.0f) {
                    boolean z7 = false;
                    int i8 = 0;
                    while (!z7) {
                        i8 += i4;
                        float f9 = Float.MAX_VALUE;
                        int i9 = -1;
                        int i10 = -1;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < this.f8162k) {
                            C2329b c2329b2 = this.f8158g[i11];
                            if (c2329b2.f8146a.f8187u != i4 && !c2329b2.f8150e && c2329b2.f8147b < f8) {
                                int iM4111d = c2329b2.f8149d.m4111d();
                                int i13 = 0;
                                while (i13 < iM4111d) {
                                    C2335h c2335hM4112e = c2329b2.f8149d.m4112e(i13);
                                    float fM4110c = c2329b2.f8149d.m4110c(c2335hM4112e);
                                    if (fM4110c > f8) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f10 = c2335hM4112e.f8182p[i14] / fM4110c;
                                            if ((f10 < f9 && i14 == i12) || i14 > i12) {
                                                i12 = i14;
                                                i10 = c2335hM4112e.f8177k;
                                                i9 = i11;
                                                f9 = f10;
                                            }
                                        }
                                    }
                                    i13++;
                                    f8 = 0.0f;
                                }
                            }
                            i11++;
                            f8 = 0.0f;
                            i4 = 1;
                        }
                        if (i9 != -1) {
                            C2329b c2329b3 = this.f8158g[i9];
                            c2329b3.f8146a.f8178l = -1;
                            c2329b3.m4122g(((C2335h[]) this.f8164m.f326m)[i10]);
                            C2335h c2335h = c2329b3.f8146a;
                            c2335h.f8178l = i9;
                            c2335h.m4167e(this, c2329b3);
                        } else {
                            z7 = true;
                        }
                        if (i8 > this.f8161j / 2) {
                            z7 = true;
                        }
                        f8 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i++;
        }
        m4142r(c2333f);
        m4134i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4142r(C2329b c2329b) {
        boolean z7;
        int i = 0;
        for (int i4 = 0; i4 < this.f8161j; i4++) {
            this.f8160i[i4] = false;
        }
        boolean z8 = false;
        int i8 = 0;
        while (!z8) {
            int i9 = 1;
            i8++;
            if (i8 >= this.f8161j * 2) {
                return;
            }
            C2335h c2335h = c2329b.f8146a;
            if (c2335h != null) {
                this.f8160i[c2335h.f8177k] = true;
            }
            C2335h c2335hMo4119d = c2329b.mo4119d(this.f8160i);
            if (c2335hMo4119d != null) {
                boolean[] zArr = this.f8160i;
                int i10 = c2335hMo4119d.f8177k;
                if (zArr[i10]) {
                    return;
                } else {
                    zArr[i10] = true;
                }
            }
            if (c2335hMo4119d != null) {
                float f8 = Float.MAX_VALUE;
                int i11 = i;
                int i12 = -1;
                while (i11 < this.f8162k) {
                    C2329b c2329b2 = this.f8158g[i11];
                    if (c2329b2.f8146a.f8187u != i9 && !c2329b2.f8150e) {
                        C2328a c2328a = c2329b2.f8149d;
                        int i13 = c2328a.f8143h;
                        if (i13 == -1) {
                            z7 = false;
                            if (!z7) {
                                float fM4110c = c2329b2.f8149d.m4110c(c2335hMo4119d);
                                if (fM4110c < 0.0f) {
                                    float f9 = (-c2329b2.f8147b) / fM4110c;
                                    if (f9 < f8) {
                                        f8 = f9;
                                        i12 = i11;
                                    }
                                }
                            }
                        } else {
                            for (int i14 = 0; i13 != -1 && i14 < c2328a.f8136a; i14++) {
                                if (c2328a.f8140e[i13] == c2335hMo4119d.f8177k) {
                                    z7 = true;
                                    break;
                                }
                                i13 = c2328a.f8141f[i13];
                            }
                            z7 = false;
                            if (!z7) {
                            }
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 > -1) {
                    C2329b c2329b3 = this.f8158g[i12];
                    c2329b3.f8146a.f8178l = -1;
                    c2329b3.m4122g(c2335hMo4119d);
                    C2335h c2335h2 = c2329b3.f8146a;
                    c2335h2.f8178l = i12;
                    c2335h2.m4167e(this, c2329b3);
                }
            } else {
                z8 = true;
            }
            i = 0;
        }
    }

    /* renamed from: s */
    public final void m4143s() {
        for (int i = 0; i < this.f8162k; i++) {
            C2329b c2329b = this.f8158g[i];
            if (c2329b != null) {
                ((C1643c) this.f8164m.f324k).m3342a(c2329b);
            }
            this.f8158g[i] = null;
        }
    }

    /* renamed from: t */
    public final void m4144t() {
        C0073c c0073c;
        int i = 0;
        while (true) {
            c0073c = this.f8164m;
            C2335h[] c2335hArr = (C2335h[]) c0073c.f326m;
            if (i >= c2335hArr.length) {
                break;
            }
            C2335h c2335h = c2335hArr[i];
            if (c2335h != null) {
                c2335h.m4165c();
            }
            i++;
        }
        C1643c c1643c = (C1643c) c0073c.f325l;
        C2335h[] c2335hArr2 = this.f8165n;
        int length = this.f8166o;
        c1643c.getClass();
        if (length > c2335hArr2.length) {
            length = c2335hArr2.length;
        }
        for (int i4 = 0; i4 < length; i4++) {
            C2335h c2335h2 = c2335hArr2[i4];
            int i8 = c1643c.f6283k;
            Object[] objArr = c1643c.f6282j;
            if (i8 < objArr.length) {
                objArr[i8] = c2335h2;
                c1643c.f6283k = i8 + 1;
            }
        }
        this.f8166o = 0;
        Arrays.fill((C2335h[]) c0073c.f326m, (Object) null);
        this.f8154c = 0;
        C2333f c2333f = this.f8155d;
        c2333f.f8174h = 0;
        c2333f.f8147b = 0.0f;
        this.f8161j = 1;
        for (int i9 = 0; i9 < this.f8162k; i9++) {
            C2329b c2329b = this.f8158g[i9];
        }
        m4143s();
        this.f8162k = 0;
        this.f8167p = new C2329b(c0073c);
    }
}
