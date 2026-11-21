package androidx.media3.common;

import java.util.Locale;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.y0 */
/* loaded from: classes.dex */
public final class C0256y0 {

    /* renamed from: d */
    public static final C0256y0 f1548d = new C0256y0(1.0f, 1.0f);

    /* renamed from: a */
    public final float f1549a;

    /* renamed from: b */
    public final float f1550b;

    /* renamed from: c */
    public final int f1551c;

    static {
        AbstractC1118i0.m2422M(0);
        AbstractC1118i0.m2422M(1);
    }

    public C0256y0(float f8, float f9) {
        AbstractC1101a.m2353d(f8 > 0.0f);
        AbstractC1101a.m2353d(f9 > 0.0f);
        this.f1549a = f8;
        this.f1550b = f9;
        this.f1551c = Math.round(f8 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0256y0.class == obj.getClass()) {
            C0256y0 c0256y0 = (C0256y0) obj;
            if (this.f1549a == c0256y0.f1549a && this.f1550b == c0256y0.f1550b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1550b) + ((Float.floatToRawIntBits(this.f1549a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1549a), Float.valueOf(this.f1550b)};
        int i = AbstractC1118i0.f4750a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
