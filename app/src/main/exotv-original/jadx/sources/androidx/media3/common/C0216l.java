package androidx.media3.common;

import java.util.Arrays;
import java.util.Locale;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.l */
/* loaded from: classes.dex */
public final class C0216l {

    /* renamed from: h */
    public static final C0216l f1178h = new C0216l(1, 2, 3, -1, -1, null);

    /* renamed from: i */
    public static final String f1179i;

    /* renamed from: j */
    public static final String f1180j;

    /* renamed from: k */
    public static final String f1181k;

    /* renamed from: l */
    public static final String f1182l;

    /* renamed from: m */
    public static final String f1183m;

    /* renamed from: n */
    public static final String f1184n;

    /* renamed from: a */
    public final int f1185a;

    /* renamed from: b */
    public final int f1186b;

    /* renamed from: c */
    public final int f1187c;

    /* renamed from: d */
    public final byte[] f1188d;

    /* renamed from: e */
    public final int f1189e;

    /* renamed from: f */
    public final int f1190f;

    /* renamed from: g */
    public int f1191g;

    static {
        int i = AbstractC1118i0.f4750a;
        f1179i = Integer.toString(0, 36);
        f1180j = Integer.toString(1, 36);
        f1181k = Integer.toString(2, 36);
        f1182l = Integer.toString(3, 36);
        f1183m = Integer.toString(4, 36);
        f1184n = Integer.toString(5, 36);
    }

    public C0216l(int i, int i4, int i8, int i9, int i10, byte[] bArr) {
        this.f1185a = i;
        this.f1186b = i4;
        this.f1187c = i8;
        this.f1188d = bArr;
        this.f1189e = i9;
        this.f1190f = i10;
    }

    /* renamed from: a */
    public static String m628a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC0008a1.m12h(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    /* renamed from: b */
    public static String m629b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC0008a1.m12h(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    /* renamed from: c */
    public static String m630c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC0008a1.m12h(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* renamed from: e */
    public static boolean m631e(C0216l c0216l) {
        if (c0216l == null) {
            return true;
        }
        int i = c0216l.f1185a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i4 = c0216l.f1186b;
        if (i4 != -1 && i4 != 2) {
            return false;
        }
        int i8 = c0216l.f1187c;
        if ((i8 != -1 && i8 != 3) || c0216l.f1188d != null) {
            return false;
        }
        int i9 = c0216l.f1190f;
        if (i9 != -1 && i9 != 8) {
            return false;
        }
        int i10 = c0216l.f1189e;
        return i10 == -1 || i10 == 8;
    }

    /* renamed from: f */
    public static int m632f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: g */
    public static int m633g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: d */
    public final boolean m634d() {
        return (this.f1185a == -1 || this.f1186b == -1 || this.f1187c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0216l.class == obj.getClass()) {
            C0216l c0216l = (C0216l) obj;
            if (this.f1185a == c0216l.f1185a && this.f1186b == c0216l.f1186b && this.f1187c == c0216l.f1187c && Arrays.equals(this.f1188d, c0216l.f1188d) && this.f1189e == c0216l.f1189e && this.f1190f == c0216l.f1190f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final String m635h() {
        String str;
        String str2;
        int i;
        if (m634d()) {
            String strM629b = m629b(this.f1185a);
            String strM628a = m628a(this.f1186b);
            String strM630c = m630c(this.f1187c);
            int i4 = AbstractC1118i0.f4750a;
            Locale locale = Locale.US;
            str = strM629b + "/" + strM628a + "/" + strM630c;
        } else {
            str = "NA/NA/NA";
        }
        int i8 = this.f1189e;
        if (i8 == -1 || (i = this.f1190f) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i8 + "/" + i;
        }
        return str + "/" + str2;
    }

    public final int hashCode() {
        if (this.f1191g == 0) {
            this.f1191g = ((((Arrays.hashCode(this.f1188d) + ((((((527 + this.f1185a) * 31) + this.f1186b) * 31) + this.f1187c) * 31)) * 31) + this.f1189e) * 31) + this.f1190f;
        }
        return this.f1191g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m629b(this.f1185a));
        sb.append(", ");
        sb.append(m628a(this.f1186b));
        sb.append(", ");
        sb.append(m630c(this.f1187c));
        sb.append(", ");
        sb.append(this.f1188d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f1189e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i4 = this.f1190f;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return AbstractC0008a1.m18n(sb, str2, ")");
    }
}
