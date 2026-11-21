package p105m0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.j */
/* loaded from: classes.dex */
public final class C1818j {

    /* renamed from: a */
    public final DisplayCutout f6897a;

    public C1818j(DisplayCutout displayCutout) {
        this.f6897a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1818j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f6897a, ((C1818j) obj).f6897a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f6897a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6897a + "}";
    }
}
