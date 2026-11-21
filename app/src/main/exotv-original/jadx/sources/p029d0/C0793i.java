package p029d0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.i */
/* loaded from: classes.dex */
public final class C0793i {

    /* renamed from: a */
    public final Resources f3566a;

    /* renamed from: b */
    public final Resources.Theme f3567b;

    public C0793i(Resources resources, Resources.Theme theme) {
        this.f3566a = resources;
        this.f3567b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0793i.class == obj.getClass()) {
            C0793i c0793i = (C0793i) obj;
            if (this.f3566a.equals(c0793i.f3566a) && Objects.equals(this.f3567b, c0793i.f3567b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3566a, this.f3567b);
    }
}
