package androidx.media3.common;

import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.d0 */
/* loaded from: classes.dex */
public class C0192d0 {

    /* renamed from: h */
    public static final C0192d0 f1070h = new C0192d0(new C0188c0());

    /* renamed from: i */
    public static final String f1071i = Integer.toString(0, 36);

    /* renamed from: j */
    public static final String f1072j = Integer.toString(1, 36);

    /* renamed from: k */
    public static final String f1073k = Integer.toString(2, 36);

    /* renamed from: l */
    public static final String f1074l = Integer.toString(3, 36);

    /* renamed from: m */
    public static final String f1075m = Integer.toString(4, 36);

    /* renamed from: n */
    public static final String f1076n = Integer.toString(5, 36);

    /* renamed from: o */
    public static final String f1077o = Integer.toString(6, 36);

    /* renamed from: a */
    public final long f1078a;

    /* renamed from: b */
    public final long f1079b;

    /* renamed from: c */
    public final long f1080c;

    /* renamed from: d */
    public final long f1081d;

    /* renamed from: e */
    public final boolean f1082e;

    /* renamed from: f */
    public final boolean f1083f;

    /* renamed from: g */
    public final boolean f1084g;

    public C0192d0(C0188c0 c0188c0) {
        this.f1078a = AbstractC1118i0.m2447f0(c0188c0.f1056a);
        this.f1080c = AbstractC1118i0.m2447f0(c0188c0.f1057b);
        this.f1079b = c0188c0.f1056a;
        this.f1081d = c0188c0.f1057b;
        this.f1082e = c0188c0.f1058c;
        this.f1083f = c0188c0.f1059d;
        this.f1084g = c0188c0.f1060e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0192d0)) {
            return false;
        }
        C0192d0 c0192d0 = (C0192d0) obj;
        return this.f1079b == c0192d0.f1079b && this.f1081d == c0192d0.f1081d && this.f1082e == c0192d0.f1082e && this.f1083f == c0192d0.f1083f && this.f1084g == c0192d0.f1084g;
    }

    public final int hashCode() {
        long j = this.f1079b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j8 = this.f1081d;
        return ((((((i + ((int) ((j8 >>> 32) ^ j8))) * 31) + (this.f1082e ? 1 : 0)) * 31) + (this.f1083f ? 1 : 0)) * 31) + (this.f1084g ? 1 : 0);
    }
}
