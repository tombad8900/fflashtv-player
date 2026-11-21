package androidx.media3.common;

import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.z */
/* loaded from: classes.dex */
public final class C0258z {

    /* renamed from: c */
    public static final String f1553c;

    /* renamed from: d */
    public static final String f1554d;

    /* renamed from: a */
    public final String f1555a;

    /* renamed from: b */
    public final String f1556b;

    static {
        int i = AbstractC1118i0.f4750a;
        f1553c = Integer.toString(0, 36);
        f1554d = Integer.toString(1, 36);
    }

    public C0258z(String str, String str2) {
        this.f1555a = AbstractC1118i0.m2429T(str);
        this.f1556b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0258z.class == obj.getClass()) {
            C0258z c0258z = (C0258z) obj;
            String str = c0258z.f1555a;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1555a, str) && Objects.equals(this.f1556b, c0258z.f1556b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f1556b.hashCode() * 31;
        String str = this.f1555a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
