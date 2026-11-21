package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.o1 */
/* loaded from: classes.dex */
public final class C0227o1 {

    /* renamed from: A */
    public static final String f1244A;

    /* renamed from: B */
    public static final String f1245B;

    /* renamed from: C */
    public static final String f1246C;

    /* renamed from: D */
    public static final String f1247D;

    /* renamed from: E */
    public static final String f1248E;

    /* renamed from: F */
    public static final String f1249F;

    /* renamed from: q */
    public static final Object f1250q = new Object();

    /* renamed from: r */
    public static final Object f1251r = new Object();

    /* renamed from: s */
    public static final C0226o0 f1252s;

    /* renamed from: t */
    public static final String f1253t;

    /* renamed from: u */
    public static final String f1254u;

    /* renamed from: v */
    public static final String f1255v;

    /* renamed from: w */
    public static final String f1256w;

    /* renamed from: x */
    public static final String f1257x;

    /* renamed from: y */
    public static final String f1258y;

    /* renamed from: z */
    public static final String f1259z;

    /* renamed from: b */
    public Object f1261b;

    /* renamed from: d */
    public Object f1263d;

    /* renamed from: e */
    public long f1264e;

    /* renamed from: f */
    public long f1265f;

    /* renamed from: g */
    public long f1266g;

    /* renamed from: h */
    public boolean f1267h;

    /* renamed from: i */
    public boolean f1268i;

    /* renamed from: j */
    public C0208i0 f1269j;

    /* renamed from: k */
    public boolean f1270k;

    /* renamed from: l */
    public long f1271l;

    /* renamed from: m */
    public long f1272m;

    /* renamed from: n */
    public int f1273n;

    /* renamed from: o */
    public int f1274o;

    /* renamed from: p */
    public long f1275p;

    /* renamed from: a */
    public Object f1260a = f1250q;

    /* renamed from: c */
    public C0226o0 f1262c = f1252s;

    static {
        C0211j0 c0211j0;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        Uri uri = Uri.EMPTY;
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        C0202g0 c0202g0 = null;
        if (uri != null) {
            if (c0199f0.f1090a != null) {
                c0202g0 = new C0202g0(c0199f0);
            }
            c0211j0 = new C0211j0(uri, null, c0202g0, null, list, null, c0981l1, null, -9223372036854775807L);
        } else {
            c0211j0 = null;
        }
        f1252s = new C0226o0("androidx.media3.common.Timeline", new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
        f1253t = Integer.toString(1, 36);
        f1254u = Integer.toString(2, 36);
        f1255v = Integer.toString(3, 36);
        f1256w = Integer.toString(4, 36);
        f1257x = Integer.toString(5, 36);
        f1258y = Integer.toString(6, 36);
        f1259z = Integer.toString(7, 36);
        f1244A = Integer.toString(8, 36);
        f1245B = Integer.toString(9, 36);
        f1246C = Integer.toString(10, 36);
        f1247D = Integer.toString(11, 36);
        f1248E = Integer.toString(12, 36);
        f1249F = Integer.toString(13, 36);
    }

    /* renamed from: a */
    public final boolean m654a() {
        return this.f1269j != null;
    }

    /* renamed from: b */
    public final void m655b(Object obj, C0226o0 c0226o0, Object obj2, long j, long j8, long j9, boolean z7, boolean z8, C0208i0 c0208i0, long j10, long j11, int i, int i4, long j12) {
        C0211j0 c0211j0;
        this.f1260a = obj;
        this.f1262c = c0226o0 != null ? c0226o0 : f1252s;
        this.f1261b = (c0226o0 == null || (c0211j0 = c0226o0.f1239b) == null) ? null : c0211j0.f1154h;
        this.f1263d = obj2;
        this.f1264e = j;
        this.f1265f = j8;
        this.f1266g = j9;
        this.f1267h = z7;
        this.f1268i = z8;
        this.f1269j = c0208i0;
        this.f1271l = j10;
        this.f1272m = j11;
        this.f1273n = i;
        this.f1274o = i4;
        this.f1275p = j12;
        this.f1270k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0227o1.class.equals(obj.getClass())) {
            C0227o1 c0227o1 = (C0227o1) obj;
            if (Objects.equals(this.f1260a, c0227o1.f1260a) && Objects.equals(this.f1262c, c0227o1.f1262c) && Objects.equals(this.f1263d, c0227o1.f1263d) && Objects.equals(this.f1269j, c0227o1.f1269j) && this.f1264e == c0227o1.f1264e && this.f1265f == c0227o1.f1265f && this.f1266g == c0227o1.f1266g && this.f1267h == c0227o1.f1267h && this.f1268i == c0227o1.f1268i && this.f1270k == c0227o1.f1270k && this.f1271l == c0227o1.f1271l && this.f1272m == c0227o1.f1272m && this.f1273n == c0227o1.f1273n && this.f1274o == c0227o1.f1274o && this.f1275p == c0227o1.f1275p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1262c.hashCode() + ((this.f1260a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1263d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0208i0 c0208i0 = this.f1269j;
        int iHashCode3 = (iHashCode2 + (c0208i0 != null ? c0208i0.hashCode() : 0)) * 31;
        long j = this.f1264e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f1265f;
        int i4 = (i + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f1266g;
        int i8 = (((((((i4 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f1267h ? 1 : 0)) * 31) + (this.f1268i ? 1 : 0)) * 31) + (this.f1270k ? 1 : 0)) * 31;
        long j10 = this.f1271l;
        int i9 = (i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1272m;
        int i10 = (((((i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f1273n) * 31) + this.f1274o) * 31;
        long j12 = this.f1275p;
        return i10 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
