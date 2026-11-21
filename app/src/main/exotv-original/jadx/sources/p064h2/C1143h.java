package p064h2;

import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.h */
/* loaded from: classes.dex */
public final class C1143h {

    /* renamed from: a */
    public final InterfaceC1980i0 f4827a;

    /* renamed from: d */
    public C1155t f4830d;

    /* renamed from: e */
    public C1140e f4831e;

    /* renamed from: f */
    public int f4832f;

    /* renamed from: g */
    public int f4833g;

    /* renamed from: h */
    public int f4834h;

    /* renamed from: i */
    public int f4835i;

    /* renamed from: l */
    public boolean f4838l;

    /* renamed from: b */
    public final C1154s f4828b = new C1154s();

    /* renamed from: c */
    public final C1132w f4829c = new C1132w();

    /* renamed from: j */
    public final C1132w f4836j = new C1132w(1);

    /* renamed from: k */
    public final C1132w f4837k = new C1132w();

    public C1143h(InterfaceC1980i0 interfaceC1980i0, C1155t c1155t, C1140e c1140e) {
        this.f4827a = interfaceC1980i0;
        this.f4830d = c1155t;
        this.f4831e = c1140e;
        this.f4830d = c1155t;
        this.f4831e = c1140e;
        interfaceC1980i0.format(c1155t.f4962a.f4934g);
        m2557e();
    }

    /* renamed from: a */
    public final int m2553a() {
        int i = !this.f4838l ? this.f4830d.f4968g[this.f4832f] : this.f4828b.f4954j[this.f4832f] ? 1 : 0;
        return m2554b() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final C1153r m2554b() {
        if (this.f4838l) {
            C1154s c1154s = this.f4828b;
            C1140e c1140e = c1154s.f4945a;
            int i = AbstractC1118i0.f4750a;
            int i4 = c1140e.f4819a;
            C1153r c1153r = c1154s.f4957m;
            if (c1153r == null) {
                C1153r[] c1153rArr = this.f4830d.f4962a.f4939l;
                c1153r = c1153rArr == null ? null : c1153rArr[i4];
            }
            if (c1153r != null && c1153r.f4940a) {
                return c1153r;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m2555c() {
        this.f4832f++;
        if (!this.f4838l) {
            return false;
        }
        int i = this.f4833g + 1;
        this.f4833g = i;
        int[] iArr = this.f4828b.f4951g;
        int i4 = this.f4834h;
        if (i != iArr[i4]) {
            return true;
        }
        this.f4834h = i4 + 1;
        this.f4833g = 0;
        return false;
    }

    /* renamed from: d */
    public final int m2556d(int i, int i4) {
        C1132w c1132w;
        C1153r c1153rM2554b = m2554b();
        if (c1153rM2554b == null) {
            return 0;
        }
        int length = c1153rM2554b.f4943d;
        C1154s c1154s = this.f4828b;
        if (length != 0) {
            c1132w = c1154s.f4958n;
        } else {
            byte[] bArr = c1153rM2554b.f4944e;
            int i8 = AbstractC1118i0.f4750a;
            int length2 = bArr.length;
            C1132w c1132w2 = this.f4837k;
            c1132w2.m2511E(bArr, length2);
            length = bArr.length;
            c1132w = c1132w2;
        }
        boolean z7 = c1154s.f4955k && c1154s.f4956l[this.f4832f];
        boolean z8 = z7 || i4 != 0;
        C1132w c1132w3 = this.f4836j;
        c1132w3.f4799a[0] = (byte) ((z8 ? 128 : 0) | length);
        c1132w3.m2513G(0);
        InterfaceC1980i0 interfaceC1980i0 = this.f4827a;
        interfaceC1980i0.sampleData(c1132w3, 1, 1);
        interfaceC1980i0.sampleData(c1132w, length, 1);
        if (!z8) {
            return length + 1;
        }
        C1132w c1132w4 = this.f4829c;
        if (!z7) {
            c1132w4.m2510D(8);
            byte[] bArr2 = c1132w4.f4799a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i4 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC1980i0.sampleData(c1132w4, 8, 1);
            return length + 9;
        }
        C1132w c1132w5 = c1154s.f4958n;
        int iM2507A = c1132w5.m2507A();
        c1132w5.m2514H(-2);
        int i9 = (iM2507A * 6) + 2;
        if (i4 != 0) {
            c1132w4.m2510D(i9);
            byte[] bArr3 = c1132w4.f4799a;
            c1132w5.m2519e(bArr3, 0, i9);
            int i10 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i4;
            bArr3[2] = (byte) ((i10 >> 8) & 255);
            bArr3[3] = (byte) (i10 & 255);
        } else {
            c1132w4 = c1132w5;
        }
        interfaceC1980i0.sampleData(c1132w4, i9, 1);
        return length + 1 + i9;
    }

    /* renamed from: e */
    public final void m2557e() {
        C1154s c1154s = this.f4828b;
        c1154s.f4948d = 0;
        c1154s.f4960p = 0L;
        c1154s.f4961q = false;
        c1154s.f4955k = false;
        c1154s.f4959o = false;
        c1154s.f4957m = null;
        this.f4832f = 0;
        this.f4834h = 0;
        this.f4833g = 0;
        this.f4835i = 0;
        this.f4838l = false;
    }
}
