package androidx.media3.common;

import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.m1 */
/* loaded from: classes.dex */
public final class C0221m1 {

    /* renamed from: h */
    public static final String f1199h;

    /* renamed from: i */
    public static final String f1200i;

    /* renamed from: j */
    public static final String f1201j;

    /* renamed from: k */
    public static final String f1202k;

    /* renamed from: l */
    public static final String f1203l;

    /* renamed from: a */
    public Object f1204a;

    /* renamed from: b */
    public Object f1205b;

    /* renamed from: c */
    public int f1206c;

    /* renamed from: d */
    public long f1207d;

    /* renamed from: e */
    public long f1208e;

    /* renamed from: f */
    public boolean f1209f;

    /* renamed from: g */
    public C0187c f1210g = C0187c.f1044g;

    static {
        int i = AbstractC1118i0.f4750a;
        f1199h = Integer.toString(0, 36);
        f1200i = Integer.toString(1, 36);
        f1201j = Integer.toString(2, 36);
        f1202k = Integer.toString(3, 36);
        f1203l = Integer.toString(4, 36);
    }

    /* renamed from: a */
    public final long m636a(int i, int i4) {
        C0183b c0183bM609a = this.f1210g.m609a(i);
        if (c0183bM609a.f1022b != -1) {
            return c0183bM609a.f1027g[i4];
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public final int m637b(long j) {
        C0183b c0183bM609a;
        int i;
        C0187c c0187c = this.f1210g;
        long j8 = this.f1207d;
        int i4 = c0187c.f1051b;
        if (j != Long.MIN_VALUE && (j8 == -9223372036854775807L || j < j8)) {
            int i8 = c0187c.f1054e;
            while (i8 < i4 && ((c0187c.m609a(i8).f1021a != Long.MIN_VALUE && c0187c.m609a(i8).f1021a <= j) || ((i = (c0183bM609a = c0187c.m609a(i8)).f1022b) != -1 && c0183bM609a.m605b(-1) >= i))) {
                i8++;
            }
            if (i8 < i4) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int m638c(long j) {
        C0187c c0187c = this.f1210g;
        long j8 = this.f1207d;
        int i = c0187c.f1051b - 1;
        int i4 = i - (c0187c.m610b(i) ? 1 : 0);
        while (i4 >= 0 && j != Long.MIN_VALUE) {
            C0183b c0183bM609a = c0187c.m609a(i4);
            long j9 = c0183bM609a.f1021a;
            if (j9 != Long.MIN_VALUE) {
                if (j >= j9) {
                    break;
                }
                i4--;
            } else {
                if (j8 != -9223372036854775807L && ((!c0183bM609a.f1029i || c0183bM609a.f1022b != -1) && j >= j8)) {
                    break;
                }
                i4--;
            }
        }
        if (i4 >= 0) {
            C0183b c0183bM609a2 = c0187c.m609a(i4);
            int i8 = c0183bM609a2.f1022b;
            if (i8 != -1) {
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = c0183bM609a2.f1026f[i9];
                    if (i10 != 0 && i10 != 1) {
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* renamed from: d */
    public final long m639d(int i) {
        return this.f1210g.m609a(i).f1021a;
    }

    /* renamed from: e */
    public final int m640e(int i, int i4) {
        C0183b c0183bM609a = this.f1210g.m609a(i);
        if (c0183bM609a.f1022b != -1) {
            return c0183bM609a.f1026f[i4];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0221m1.class.equals(obj.getClass())) {
            C0221m1 c0221m1 = (C0221m1) obj;
            Object obj2 = this.f1204a;
            Object obj3 = c0221m1.f1204a;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.f1205b, c0221m1.f1205b) && this.f1206c == c0221m1.f1206c && this.f1207d == c0221m1.f1207d && this.f1208e == c0221m1.f1208e && this.f1209f == c0221m1.f1209f && Objects.equals(this.f1210g, c0221m1.f1210g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m641f(int i) {
        return this.f1210g.m609a(i).m605b(-1);
    }

    /* renamed from: g */
    public final boolean m642g(int i) {
        C0187c c0187c = this.f1210g;
        return i == c0187c.f1051b - 1 && c0187c.m610b(i);
    }

    /* renamed from: h */
    public final boolean m643h(int i) {
        return this.f1210g.m609a(i).f1029i;
    }

    public final int hashCode() {
        Object obj = this.f1204a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f1205b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1206c) * 31;
        long j = this.f1207d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f1208e;
        return this.f1210g.hashCode() + ((((i + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f1209f ? 1 : 0)) * 31);
    }

    /* renamed from: i */
    public final void m644i(Object obj, Object obj2, int i, long j, long j8, C0187c c0187c, boolean z7) {
        this.f1204a = obj;
        this.f1205b = obj2;
        this.f1206c = i;
        this.f1207d = j;
        this.f1208e = j8;
        this.f1210g = c0187c;
        this.f1209f = z7;
    }
}
