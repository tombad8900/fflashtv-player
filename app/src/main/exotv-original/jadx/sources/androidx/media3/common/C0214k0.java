package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;
import p005a4.C0073c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.k0 */
/* loaded from: classes.dex */
public final class C0214k0 {

    /* renamed from: d */
    public static final C0214k0 f1167d = new C0214k0(new C0073c(4));

    /* renamed from: e */
    public static final String f1168e;

    /* renamed from: f */
    public static final String f1169f;

    /* renamed from: g */
    public static final String f1170g;

    /* renamed from: a */
    public final Uri f1171a;

    /* renamed from: b */
    public final String f1172b;

    /* renamed from: c */
    public final Bundle f1173c;

    static {
        int i = AbstractC1118i0.f4750a;
        f1168e = Integer.toString(0, 36);
        f1169f = Integer.toString(1, 36);
        f1170g = Integer.toString(2, 36);
    }

    public C0214k0(C0073c c0073c) {
        this.f1171a = (Uri) c0073c.f324k;
        this.f1172b = (String) c0073c.f325l;
        this.f1173c = (Bundle) c0073c.f326m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0214k0)) {
            return false;
        }
        C0214k0 c0214k0 = (C0214k0) obj;
        Uri uri = c0214k0.f1171a;
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(this.f1171a, uri) && Objects.equals(this.f1172b, c0214k0.f1172b)) {
            if ((this.f1173c == null) == (c0214k0.f1173c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f1171a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f1172b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f1173c != null ? 1 : 0);
    }
}
