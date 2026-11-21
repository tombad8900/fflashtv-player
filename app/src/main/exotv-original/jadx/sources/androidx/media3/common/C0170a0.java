package androidx.media3.common;

import android.net.Uri;
import p002a1.C0036o;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.a0 */
/* loaded from: classes.dex */
public final class C0170a0 {

    /* renamed from: b */
    public static final String f973b;

    /* renamed from: a */
    public final Uri f974a;

    static {
        int i = AbstractC1118i0.f4750a;
        f973b = Integer.toString(0, 36);
    }

    public C0170a0(C0036o c0036o) {
        this.f974a = (Uri) c0036o.f143k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0170a0) || !this.f974a.equals(((C0170a0) obj).f974a)) {
            return false;
        }
        int i = AbstractC1118i0.f4750a;
        return true;
    }

    public final int hashCode() {
        return this.f974a.hashCode() * 31;
    }
}
