package androidx.media3.common;

import java.util.Collections;
import java.util.List;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.r1 */
/* loaded from: classes.dex */
public final class C0236r1 {

    /* renamed from: c */
    public static final String f1401c;

    /* renamed from: d */
    public static final String f1402d;

    /* renamed from: a */
    public final C0233q1 f1403a;

    /* renamed from: b */
    public final AbstractC0983m0 f1404b;

    static {
        int i = AbstractC1118i0.f4750a;
        f1401c = Integer.toString(0, 36);
        f1402d = Integer.toString(1, 36);
    }

    public C0236r1(C0233q1 c0233q1, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c0233q1.f1319a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1403a = c0233q1;
        this.f1404b = AbstractC0983m0.m2165j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0236r1.class == obj.getClass()) {
            C0236r1 c0236r1 = (C0236r1) obj;
            if (this.f1403a.equals(c0236r1.f1403a) && this.f1404b.equals(c0236r1.f1404b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1404b.hashCode() * 31) + this.f1403a.hashCode();
    }
}
