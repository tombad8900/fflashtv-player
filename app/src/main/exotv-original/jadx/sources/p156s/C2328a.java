package p156s;

import java.util.Arrays;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C2328a {

    /* renamed from: b */
    public final C2329b f8137b;

    /* renamed from: c */
    public final C0073c f8138c;

    /* renamed from: a */
    public int f8136a = 0;

    /* renamed from: d */
    public int f8139d = 8;

    /* renamed from: e */
    public int[] f8140e = new int[8];

    /* renamed from: f */
    public int[] f8141f = new int[8];

    /* renamed from: g */
    public float[] f8142g = new float[8];

    /* renamed from: h */
    public int f8143h = -1;

    /* renamed from: i */
    public int f8144i = -1;

    /* renamed from: j */
    public boolean f8145j = false;

    public C2328a(C2329b c2329b, C0073c c0073c) {
        this.f8137b = c2329b;
        this.f8138c = c0073c;
    }

    /* renamed from: a */
    public final void m4108a(C2335h c2335h, float f8, boolean z7) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int i = this.f8143h;
            C2329b c2329b = this.f8137b;
            if (i == -1) {
                this.f8143h = 0;
                this.f8142g[0] = f8;
                this.f8140e[0] = c2335h.f8177k;
                this.f8141f[0] = -1;
                c2335h.f8186t++;
                c2335h.m4163a(c2329b);
                this.f8136a++;
                if (this.f8145j) {
                    return;
                }
                int i4 = this.f8144i + 1;
                this.f8144i = i4;
                int[] iArr = this.f8140e;
                if (i4 >= iArr.length) {
                    this.f8145j = true;
                    this.f8144i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i != -1 && i9 < this.f8136a; i9++) {
                int i10 = this.f8140e[i];
                int i11 = c2335h.f8177k;
                if (i10 == i11) {
                    float[] fArr = this.f8142g;
                    float f9 = fArr[i] + f8;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i] = f9;
                    if (f9 == 0.0f) {
                        if (i == this.f8143h) {
                            this.f8143h = this.f8141f[i];
                        } else {
                            int[] iArr2 = this.f8141f;
                            iArr2[i8] = iArr2[i];
                        }
                        if (z7) {
                            c2335h.m4164b(c2329b);
                        }
                        if (this.f8145j) {
                            this.f8144i = i;
                        }
                        c2335h.f8186t--;
                        this.f8136a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i;
                }
                i = this.f8141f[i];
            }
            int length = this.f8144i;
            int i12 = length + 1;
            if (this.f8145j) {
                int[] iArr3 = this.f8140e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i12;
            }
            int[] iArr4 = this.f8140e;
            if (length >= iArr4.length && this.f8136a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f8140e;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        length = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f8140e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i14 = this.f8139d * 2;
                this.f8139d = i14;
                this.f8145j = false;
                this.f8144i = length - 1;
                this.f8142g = Arrays.copyOf(this.f8142g, i14);
                this.f8140e = Arrays.copyOf(this.f8140e, this.f8139d);
                this.f8141f = Arrays.copyOf(this.f8141f, this.f8139d);
            }
            this.f8140e[length] = c2335h.f8177k;
            this.f8142g[length] = f8;
            if (i8 != -1) {
                int[] iArr7 = this.f8141f;
                iArr7[length] = iArr7[i8];
                iArr7[i8] = length;
            } else {
                this.f8141f[length] = this.f8143h;
                this.f8143h = length;
            }
            c2335h.f8186t++;
            c2335h.m4163a(c2329b);
            this.f8136a++;
            if (!this.f8145j) {
                this.f8144i++;
            }
            int i15 = this.f8144i;
            int[] iArr8 = this.f8140e;
            if (i15 >= iArr8.length) {
                this.f8145j = true;
                this.f8144i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m4109b() {
        int i = this.f8143h;
        for (int i4 = 0; i != -1 && i4 < this.f8136a; i4++) {
            C2335h c2335h = ((C2335h[]) this.f8138c.f326m)[this.f8140e[i]];
            if (c2335h != null) {
                c2335h.m4164b(this.f8137b);
            }
            i = this.f8141f[i];
        }
        this.f8143h = -1;
        this.f8144i = -1;
        this.f8145j = false;
        this.f8136a = 0;
    }

    /* renamed from: c */
    public final float m4110c(C2335h c2335h) {
        int i = this.f8143h;
        for (int i4 = 0; i != -1 && i4 < this.f8136a; i4++) {
            if (this.f8140e[i] == c2335h.f8177k) {
                return this.f8142g[i];
            }
            i = this.f8141f[i];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m4111d() {
        return this.f8136a;
    }

    /* renamed from: e */
    public final C2335h m4112e(int i) {
        int i4 = this.f8143h;
        for (int i8 = 0; i4 != -1 && i8 < this.f8136a; i8++) {
            if (i8 == i) {
                return ((C2335h[]) this.f8138c.f326m)[this.f8140e[i4]];
            }
            i4 = this.f8141f[i4];
        }
        return null;
    }

    /* renamed from: f */
    public final float m4113f(int i) {
        int i4 = this.f8143h;
        for (int i8 = 0; i4 != -1 && i8 < this.f8136a; i8++) {
            if (i8 == i) {
                return this.f8142g[i4];
            }
            i4 = this.f8141f[i4];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m4114g(C2335h c2335h, float f8) {
        if (f8 == 0.0f) {
            m4115h(c2335h, true);
            return;
        }
        int i = this.f8143h;
        C2329b c2329b = this.f8137b;
        if (i == -1) {
            this.f8143h = 0;
            this.f8142g[0] = f8;
            this.f8140e[0] = c2335h.f8177k;
            this.f8141f[0] = -1;
            c2335h.f8186t++;
            c2335h.m4163a(c2329b);
            this.f8136a++;
            if (this.f8145j) {
                return;
            }
            int i4 = this.f8144i + 1;
            this.f8144i = i4;
            int[] iArr = this.f8140e;
            if (i4 >= iArr.length) {
                this.f8145j = true;
                this.f8144i = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i != -1 && i9 < this.f8136a; i9++) {
            int i10 = this.f8140e[i];
            int i11 = c2335h.f8177k;
            if (i10 == i11) {
                this.f8142g[i] = f8;
                return;
            }
            if (i10 < i11) {
                i8 = i;
            }
            i = this.f8141f[i];
        }
        int length = this.f8144i;
        int i12 = length + 1;
        if (this.f8145j) {
            int[] iArr2 = this.f8140e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i12;
        }
        int[] iArr3 = this.f8140e;
        if (length >= iArr3.length && this.f8136a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f8140e;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    length = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f8140e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i14 = this.f8139d * 2;
            this.f8139d = i14;
            this.f8145j = false;
            this.f8144i = length - 1;
            this.f8142g = Arrays.copyOf(this.f8142g, i14);
            this.f8140e = Arrays.copyOf(this.f8140e, this.f8139d);
            this.f8141f = Arrays.copyOf(this.f8141f, this.f8139d);
        }
        this.f8140e[length] = c2335h.f8177k;
        this.f8142g[length] = f8;
        if (i8 != -1) {
            int[] iArr6 = this.f8141f;
            iArr6[length] = iArr6[i8];
            iArr6[i8] = length;
        } else {
            this.f8141f[length] = this.f8143h;
            this.f8143h = length;
        }
        c2335h.f8186t++;
        c2335h.m4163a(c2329b);
        int i15 = this.f8136a + 1;
        this.f8136a = i15;
        if (!this.f8145j) {
            this.f8144i++;
        }
        int[] iArr7 = this.f8140e;
        if (i15 >= iArr7.length) {
            this.f8145j = true;
        }
        if (this.f8144i >= iArr7.length) {
            this.f8145j = true;
            this.f8144i = iArr7.length - 1;
        }
    }

    /* renamed from: h */
    public final float m4115h(C2335h c2335h, boolean z7) {
        int i = this.f8143h;
        if (i == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i8 = -1;
        while (i != -1 && i4 < this.f8136a) {
            if (this.f8140e[i] == c2335h.f8177k) {
                if (i == this.f8143h) {
                    this.f8143h = this.f8141f[i];
                } else {
                    int[] iArr = this.f8141f;
                    iArr[i8] = iArr[i];
                }
                if (z7) {
                    c2335h.m4164b(this.f8137b);
                }
                c2335h.f8186t--;
                this.f8136a--;
                this.f8140e[i] = -1;
                if (this.f8145j) {
                    this.f8144i = i;
                }
                return this.f8142g[i];
            }
            i4++;
            i8 = i;
            i = this.f8141f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f8143h;
        String str = C2181z.FRAGMENT_ENCODE_SET;
        for (int i4 = 0; i != -1 && i4 < this.f8136a; i4++) {
            str = (AbstractC0008a1.m16l(str, " -> ") + this.f8142g[i] + " : ") + ((C2335h[]) this.f8138c.f326m)[this.f8140e[i]];
            i = this.f8141f[i];
        }
        return str;
    }
}
