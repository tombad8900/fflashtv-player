package p134p3;

import android.graphics.Bitmap;
import java.util.Map;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p3.b */
/* loaded from: classes.dex */
public final class C2208b {

    /* renamed from: a */
    public final Bitmap f7721a;

    /* renamed from: b */
    public final Map f7722b;

    public C2208b(Bitmap bitmap, Map map) {
        this.f7721a = bitmap;
        this.f7722b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208b)) {
            return false;
        }
        C2208b c2208b = (C2208b) obj;
        return AbstractC2980h.m5132a(this.f7721a, c2208b.f7721a) && AbstractC2980h.m5132a(this.f7722b, c2208b.f7722b);
    }

    public final int hashCode() {
        return this.f7722b.hashCode() + (this.f7721a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f7721a + ", extras=" + this.f7722b + ')';
    }
}
