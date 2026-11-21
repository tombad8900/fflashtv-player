package androidx.media3.common;

import java.util.Arrays;
import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.c */
/* loaded from: classes.dex */
public final class C0187c {

    /* renamed from: g */
    public static final C0187c f1044g = new C0187c(null, new C0183b[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    public static final C0183b f1045h = new C0183b(0).m606c(0);

    /* renamed from: i */
    public static final String f1046i;

    /* renamed from: j */
    public static final String f1047j;

    /* renamed from: k */
    public static final String f1048k;

    /* renamed from: l */
    public static final String f1049l;

    /* renamed from: a */
    public final Object f1050a;

    /* renamed from: b */
    public final int f1051b;

    /* renamed from: c */
    public final long f1052c;

    /* renamed from: d */
    public final long f1053d;

    /* renamed from: e */
    public final int f1054e;

    /* renamed from: f */
    public final C0183b[] f1055f;

    static {
        int i = AbstractC1118i0.f4750a;
        f1046i = Integer.toString(1, 36);
        f1047j = Integer.toString(2, 36);
        f1048k = Integer.toString(3, 36);
        f1049l = Integer.toString(4, 36);
    }

    public C0187c(Object obj, C0183b[] c0183bArr, long j, long j8, int i) {
        this.f1050a = obj;
        this.f1052c = j;
        this.f1053d = j8;
        this.f1051b = c0183bArr.length + i;
        this.f1055f = c0183bArr;
        this.f1054e = i;
    }

    /* renamed from: a */
    public final C0183b m609a(int i) {
        int i4 = this.f1054e;
        return i < i4 ? f1045h : this.f1055f[i - i4];
    }

    /* renamed from: b */
    public final boolean m610b(int i) {
        if (i != this.f1051b - 1) {
            return false;
        }
        C0183b c0183bM609a = m609a(i);
        return c0183bM609a.f1029i && c0183bM609a.f1021a == Long.MIN_VALUE && c0183bM609a.f1022b == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0187c.class == obj.getClass()) {
            C0187c c0187c = (C0187c) obj;
            Object obj2 = c0187c.f1050a;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1050a, obj2) && this.f1051b == c0187c.f1051b && this.f1052c == c0187c.f1052c && this.f1053d == c0187c.f1053d && this.f1054e == c0187c.f1054e && Arrays.equals(this.f1055f, c0187c.f1055f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1051b * 31;
        Object obj = this.f1050a;
        return Arrays.hashCode(this.f1055f) + ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f1052c)) * 31) + ((int) this.f1053d)) * 31) + this.f1054e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f1050a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f1052c);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            C0183b[] c0183bArr = this.f1055f;
            if (i >= c0183bArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c0183bArr[i].f1021a);
            sb.append(", ads=[");
            for (int i4 = 0; i4 < c0183bArr[i].f1026f.length; i4++) {
                sb.append("ad(state=");
                int i8 = c0183bArr[i].f1026f[i4];
                if (i8 == 0) {
                    sb.append('_');
                } else if (i8 == 1) {
                    sb.append('R');
                } else if (i8 == 2) {
                    sb.append('S');
                } else if (i8 == 3) {
                    sb.append('P');
                } else if (i8 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c0183bArr[i].f1027g[i4]);
                sb.append(')');
                if (i4 < c0183bArr[i].f1026f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c0183bArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
