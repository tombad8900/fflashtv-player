package p156s;

import java.util.Arrays;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.h */
/* loaded from: classes.dex */
public final class C2335h implements Comparable {

    /* renamed from: j */
    public boolean f8176j;

    /* renamed from: n */
    public float f8180n;

    /* renamed from: u */
    public int f8187u;

    /* renamed from: k */
    public int f8177k = -1;

    /* renamed from: l */
    public int f8178l = -1;

    /* renamed from: m */
    public int f8179m = 0;

    /* renamed from: o */
    public boolean f8181o = false;

    /* renamed from: p */
    public final float[] f8182p = new float[9];

    /* renamed from: q */
    public final float[] f8183q = new float[9];

    /* renamed from: r */
    public C2329b[] f8184r = new C2329b[16];

    /* renamed from: s */
    public int f8185s = 0;

    /* renamed from: t */
    public int f8186t = 0;

    public C2335h(int i) {
        this.f8187u = i;
    }

    /* renamed from: a */
    public final void m4163a(C2329b c2329b) {
        int i = 0;
        while (true) {
            int i4 = this.f8185s;
            if (i >= i4) {
                C2329b[] c2329bArr = this.f8184r;
                if (i4 >= c2329bArr.length) {
                    this.f8184r = (C2329b[]) Arrays.copyOf(c2329bArr, c2329bArr.length * 2);
                }
                C2329b[] c2329bArr2 = this.f8184r;
                int i8 = this.f8185s;
                c2329bArr2[i8] = c2329b;
                this.f8185s = i8 + 1;
                return;
            }
            if (this.f8184r[i] == c2329b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m4164b(C2329b c2329b) {
        int i = this.f8185s;
        int i4 = 0;
        while (i4 < i) {
            if (this.f8184r[i4] == c2329b) {
                while (i4 < i - 1) {
                    C2329b[] c2329bArr = this.f8184r;
                    int i8 = i4 + 1;
                    c2329bArr[i4] = c2329bArr[i8];
                    i4 = i8;
                }
                this.f8185s--;
                return;
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final void m4165c() {
        this.f8187u = 5;
        this.f8179m = 0;
        this.f8177k = -1;
        this.f8178l = -1;
        this.f8180n = 0.0f;
        this.f8181o = false;
        int i = this.f8185s;
        for (int i4 = 0; i4 < i; i4++) {
            this.f8184r[i4] = null;
        }
        this.f8185s = 0;
        this.f8186t = 0;
        this.f8176j = false;
        Arrays.fill(this.f8183q, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8177k - ((C2335h) obj).f8177k;
    }

    /* renamed from: d */
    public final void m4166d(C2330c c2330c, float f8) {
        this.f8180n = f8;
        this.f8181o = true;
        int i = this.f8185s;
        this.f8178l = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f8184r[i4].m4123h(c2330c, this, false);
        }
        this.f8185s = 0;
    }

    /* renamed from: e */
    public final void m4167e(C2330c c2330c, C2329b c2329b) {
        int i = this.f8185s;
        for (int i4 = 0; i4 < i; i4++) {
            this.f8184r[i4].mo4124i(c2330c, c2329b, false);
        }
        this.f8185s = 0;
    }

    public final String toString() {
        return C2181z.FRAGMENT_ENCODE_SET + this.f8177k;
    }
}
