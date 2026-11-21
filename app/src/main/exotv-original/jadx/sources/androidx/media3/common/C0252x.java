package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.x */
/* loaded from: classes.dex */
public final class C0252x extends AbstractC0206h1 {

    /* renamed from: d */
    public static final String f1542d;

    /* renamed from: e */
    public static final String f1543e;

    /* renamed from: b */
    public final boolean f1544b;

    /* renamed from: c */
    public final boolean f1545c;

    static {
        int i = AbstractC1118i0.f4750a;
        f1542d = Integer.toString(1, 36);
        f1543e = Integer.toString(2, 36);
    }

    public C0252x() {
        this.f1544b = false;
        this.f1545c = false;
    }

    @Override // androidx.media3.common.AbstractC0206h1
    /* renamed from: b */
    public final Bundle mo622b() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC0206h1.f1121a, 0);
        bundle.putBoolean(f1542d, this.f1544b);
        bundle.putBoolean(f1543e, this.f1545c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0252x)) {
            return false;
        }
        C0252x c0252x = (C0252x) obj;
        return this.f1545c == c0252x.f1545c && this.f1544b == c0252x.f1544b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1544b), Boolean.valueOf(this.f1545c)});
    }

    public C0252x(boolean z7) {
        this.f1544b = true;
        this.f1545c = z7;
    }
}
