package p073i3;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.g */
/* loaded from: classes.dex */
public final class C1258g {

    /* renamed from: a */
    public final BitmapDrawable f5256a;

    /* renamed from: b */
    public final boolean f5257b;

    public C1258g(BitmapDrawable bitmapDrawable, boolean z7) {
        this.f5256a = bitmapDrawable;
        this.f5257b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258g)) {
            return false;
        }
        C1258g c1258g = (C1258g) obj;
        return this.f5256a.equals(c1258g.f5256a) && this.f5257b == c1258g.f5257b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5257b) + (this.f5256a.hashCode() * 31);
    }
}
