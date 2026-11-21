package androidx.media3.common;

import android.net.Uri;
import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.n0 */
/* loaded from: classes.dex */
public class C0223n0 {

    /* renamed from: h */
    public static final String f1212h;

    /* renamed from: i */
    public static final String f1213i;

    /* renamed from: j */
    public static final String f1214j;

    /* renamed from: k */
    public static final String f1215k;

    /* renamed from: l */
    public static final String f1216l;

    /* renamed from: m */
    public static final String f1217m;

    /* renamed from: n */
    public static final String f1218n;

    /* renamed from: a */
    public final Uri f1219a;

    /* renamed from: b */
    public final String f1220b;

    /* renamed from: c */
    public final String f1221c;

    /* renamed from: d */
    public final int f1222d;

    /* renamed from: e */
    public final int f1223e;

    /* renamed from: f */
    public final String f1224f;

    /* renamed from: g */
    public final String f1225g;

    static {
        int i = AbstractC1118i0.f4750a;
        f1212h = Integer.toString(0, 36);
        f1213i = Integer.toString(1, 36);
        f1214j = Integer.toString(2, 36);
        f1215k = Integer.toString(3, 36);
        f1216l = Integer.toString(4, 36);
        f1217m = Integer.toString(5, 36);
        f1218n = Integer.toString(6, 36);
    }

    public C0223n0(C0220m0 c0220m0) {
        this.f1219a = c0220m0.f1192a;
        this.f1220b = c0220m0.f1193b;
        this.f1221c = c0220m0.f1194c;
        this.f1222d = c0220m0.f1195d;
        this.f1223e = c0220m0.f1196e;
        this.f1224f = c0220m0.f1197f;
        this.f1225g = c0220m0.f1198g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0223n0)) {
            return false;
        }
        C0223n0 c0223n0 = (C0223n0) obj;
        if (this.f1219a.equals(c0223n0.f1219a)) {
            String str = c0223n0.f1220b;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1220b, str) && Objects.equals(this.f1221c, c0223n0.f1221c) && this.f1222d == c0223n0.f1222d && this.f1223e == c0223n0.f1223e && Objects.equals(this.f1224f, c0223n0.f1224f) && Objects.equals(this.f1225g, c0223n0.f1225g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f1219a.hashCode() * 31;
        String str = this.f1220b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1221c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1222d) * 31) + this.f1223e) * 31;
        String str3 = this.f1224f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1225g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
