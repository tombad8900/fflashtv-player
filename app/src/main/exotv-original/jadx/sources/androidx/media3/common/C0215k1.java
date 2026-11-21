package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.k1 */
/* loaded from: classes.dex */
public final class C0215k1 extends AbstractC0206h1 {

    /* renamed from: d */
    public static final String f1174d;

    /* renamed from: e */
    public static final String f1175e;

    /* renamed from: b */
    public final boolean f1176b;

    /* renamed from: c */
    public final boolean f1177c;

    static {
        int i = AbstractC1118i0.f4750a;
        f1174d = Integer.toString(1, 36);
        f1175e = Integer.toString(2, 36);
    }

    public C0215k1() {
        this.f1176b = false;
        this.f1177c = false;
    }

    @Override // androidx.media3.common.AbstractC0206h1
    /* renamed from: b */
    public final Bundle mo622b() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC0206h1.f1121a, 3);
        bundle.putBoolean(f1174d, this.f1176b);
        bundle.putBoolean(f1175e, this.f1177c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0215k1)) {
            return false;
        }
        C0215k1 c0215k1 = (C0215k1) obj;
        return this.f1177c == c0215k1.f1177c && this.f1176b == c0215k1.f1176b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1176b), Boolean.valueOf(this.f1177c)});
    }

    public C0215k1(boolean z7) {
        this.f1176b = true;
        this.f1177c = z7;
    }
}
