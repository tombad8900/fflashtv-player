package androidx.media3.common;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.j0 */
/* loaded from: classes.dex */
public final class C0211j0 {

    /* renamed from: j */
    public static final String f1139j;

    /* renamed from: k */
    public static final String f1140k;

    /* renamed from: l */
    public static final String f1141l;

    /* renamed from: m */
    public static final String f1142m;

    /* renamed from: n */
    public static final String f1143n;

    /* renamed from: o */
    public static final String f1144o;

    /* renamed from: p */
    public static final String f1145p;

    /* renamed from: q */
    public static final String f1146q;

    /* renamed from: a */
    public final Uri f1147a;

    /* renamed from: b */
    public final String f1148b;

    /* renamed from: c */
    public final C0202g0 f1149c;

    /* renamed from: d */
    public final C0170a0 f1150d;

    /* renamed from: e */
    public final List f1151e;

    /* renamed from: f */
    public final String f1152f;

    /* renamed from: g */
    public final AbstractC0983m0 f1153g;

    /* renamed from: h */
    public final Object f1154h;

    /* renamed from: i */
    public final long f1155i;

    static {
        int i = AbstractC1118i0.f4750a;
        f1139j = Integer.toString(0, 36);
        f1140k = Integer.toString(1, 36);
        f1141l = Integer.toString(2, 36);
        f1142m = Integer.toString(3, 36);
        f1143n = Integer.toString(4, 36);
        f1144o = Integer.toString(5, 36);
        f1145p = Integer.toString(6, 36);
        f1146q = Integer.toString(7, 36);
    }

    public C0211j0(Uri uri, String str, C0202g0 c0202g0, C0170a0 c0170a0, List list, String str2, AbstractC0983m0 abstractC0983m0, Object obj, long j) {
        this.f1147a = uri;
        this.f1148b = AbstractC0244u0.m687p(str);
        this.f1149c = c0202g0;
        this.f1150d = c0170a0;
        this.f1151e = list;
        this.f1152f = str2;
        this.f1153g = abstractC0983m0;
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (int i = 0; i < abstractC0983m0.size(); i++) {
            C0223n0 c0223n0 = (C0223n0) abstractC0983m0.get(i);
            C0220m0 c0220m0 = new C0220m0();
            c0220m0.f1192a = c0223n0.f1219a;
            c0220m0.f1193b = c0223n0.f1220b;
            c0220m0.f1194c = c0223n0.f1221c;
            c0220m0.f1195d = c0223n0.f1222d;
            c0220m0.f1196e = c0223n0.f1223e;
            c0220m0.f1197f = c0223n0.f1224f;
            c0220m0.f1198g = c0223n0.f1225g;
            c0974j0M2164i.m2141a(new C0217l0(c0220m0));
        }
        c0974j0M2164i.m2159f();
        this.f1154h = obj;
        this.f1155i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0211j0)) {
            return false;
        }
        C0211j0 c0211j0 = (C0211j0) obj;
        if (this.f1147a.equals(c0211j0.f1147a)) {
            String str = c0211j0.f1148b;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1148b, str) && Objects.equals(this.f1149c, c0211j0.f1149c) && Objects.equals(this.f1150d, c0211j0.f1150d) && this.f1151e.equals(c0211j0.f1151e) && Objects.equals(this.f1152f, c0211j0.f1152f) && this.f1153g.equals(c0211j0.f1153g) && Objects.equals(this.f1154h, c0211j0.f1154h) && Long.valueOf(this.f1155i).equals(Long.valueOf(c0211j0.f1155i))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f1147a.hashCode() * 31;
        String str = this.f1148b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0202g0 c0202g0 = this.f1149c;
        int iHashCode3 = (iHashCode2 + (c0202g0 == null ? 0 : c0202g0.hashCode())) * 31;
        C0170a0 c0170a0 = this.f1150d;
        int iHashCode4 = (this.f1151e.hashCode() + ((iHashCode3 + (c0170a0 == null ? 0 : c0170a0.hashCode())) * 31)) * 31;
        String str2 = this.f1152f;
        int iHashCode5 = (this.f1153g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        return (int) (((iHashCode5 + (this.f1154h != null ? r2.hashCode() : 0)) * 31) + this.f1155i);
    }
}
