package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.w0 */
/* loaded from: classes.dex */
public final class C0250w0 extends AbstractC0206h1 {

    /* renamed from: c */
    public static final String f1535c;

    /* renamed from: b */
    public final float f1536b;

    static {
        int i = AbstractC1118i0.f4750a;
        f1535c = Integer.toString(1, 36);
    }

    public C0250w0() {
        this.f1536b = -1.0f;
    }

    @Override // androidx.media3.common.AbstractC0206h1
    /* renamed from: b */
    public final Bundle mo622b() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC0206h1.f1121a, 1);
        bundle.putFloat(f1535c, this.f1536b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0250w0) {
            return this.f1536b == ((C0250w0) obj).f1536b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1536b)});
    }

    public C0250w0(float f8) {
        AbstractC1101a.m2352c("percent must be in the range of [0, 100]", f8 >= 0.0f && f8 <= 100.0f);
        this.f1536b = f8;
    }
}
