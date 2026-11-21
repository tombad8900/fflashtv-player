package p104m;

import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.p0 */
/* loaded from: classes.dex */
public final class C1757p0 {

    /* renamed from: a */
    public final Typeface f6703a;

    /* renamed from: b */
    public final String f6704b;

    /* renamed from: c */
    public final int f6705c;

    public C1757p0(Typeface typeface, String str, int i) {
        this.f6703a = typeface;
        this.f6704b = str;
        this.f6705c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1757p0)) {
            return false;
        }
        C1757p0 c1757p0 = (C1757p0) obj;
        return this.f6705c == c1757p0.f6705c && Objects.equals(this.f6703a, c1757p0.f6703a) && Objects.equals(this.f6704b, c1757p0.f6704b);
    }

    public final int hashCode() {
        return Objects.hash(this.f6703a, this.f6704b, Integer.valueOf(this.f6705c));
    }
}
