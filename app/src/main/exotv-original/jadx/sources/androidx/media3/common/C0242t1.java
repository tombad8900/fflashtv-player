package androidx.media3.common;

import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.t1 */
/* loaded from: classes.dex */
public final class C0242t1 {

    /* renamed from: d */
    public static final C0242t1 f1414d = new C0242t1(new C0239s1());

    /* renamed from: e */
    public static final String f1415e;

    /* renamed from: f */
    public static final String f1416f;

    /* renamed from: g */
    public static final String f1417g;

    /* renamed from: a */
    public final int f1418a;

    /* renamed from: b */
    public final boolean f1419b;

    /* renamed from: c */
    public final boolean f1420c;

    static {
        int i = AbstractC1118i0.f4750a;
        f1415e = Integer.toString(1, 36);
        f1416f = Integer.toString(2, 36);
        f1417g = Integer.toString(3, 36);
    }

    public C0242t1(C0239s1 c0239s1) {
        this.f1418a = c0239s1.f1409a;
        this.f1419b = c0239s1.f1410b;
        this.f1420c = c0239s1.f1411c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0242t1.class == obj.getClass()) {
            C0242t1 c0242t1 = (C0242t1) obj;
            if (this.f1418a == c0242t1.f1418a && this.f1419b == c0242t1.f1419b && this.f1420c == c0242t1.f1420c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1418a + 31) * 31) + (this.f1419b ? 1 : 0)) * 31) + (this.f1420c ? 1 : 0);
    }
}
