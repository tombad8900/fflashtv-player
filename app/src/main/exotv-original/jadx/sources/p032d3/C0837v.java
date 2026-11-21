package p032d3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.v */
/* loaded from: classes.dex */
public final class C0837v {

    /* renamed from: b */
    public final View f3718b;

    /* renamed from: a */
    public final HashMap f3717a = new HashMap();

    /* renamed from: c */
    public final ArrayList f3719c = new ArrayList();

    public C0837v(View view) {
        this.f3718b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0837v)) {
            return false;
        }
        C0837v c0837v = (C0837v) obj;
        return this.f3718b == c0837v.f3718b && this.f3717a.equals(c0837v.f3717a);
    }

    public final int hashCode() {
        return this.f3717a.hashCode() + (this.f3718b.hashCode() * 31);
    }

    public final String toString() {
        String strM16l = AbstractC0008a1.m16l(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3718b + "\n", "    values:");
        HashMap map = this.f3717a;
        for (String str : map.keySet()) {
            strM16l = strM16l + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM16l;
    }
}
