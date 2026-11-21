package p115n1;

import okhttp3.C2181z;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.b0 */
/* loaded from: classes.dex */
public final class C1966b0 {

    /* renamed from: a */
    public final C1970d0 f7290a;

    /* renamed from: b */
    public final C1970d0 f7291b;

    public C1966b0(C1970d0 c1970d0, C1970d0 c1970d02) {
        c1970d0.getClass();
        this.f7290a = c1970d0;
        c1970d02.getClass();
        this.f7291b = c1970d02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1966b0.class == obj.getClass()) {
            C1966b0 c1966b0 = (C1966b0) obj;
            if (this.f7290a.equals(c1966b0.f7290a) && this.f7291b.equals(c1966b0.f7291b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7291b.hashCode() + (this.f7290a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C1970d0 c1970d0 = this.f7290a;
        sb.append(c1970d0);
        C1970d0 c1970d02 = this.f7291b;
        if (c1970d0.equals(c1970d02)) {
            str = C2181z.FRAGMENT_ENCODE_SET;
        } else {
            str = ", " + c1970d02;
        }
        return AbstractC0008a1.m18n(sb, str, "]");
    }
}
