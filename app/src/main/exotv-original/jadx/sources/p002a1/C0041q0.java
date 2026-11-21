package p002a1;

import android.util.Log;
import androidx.lifecycle.AbstractC0157r0;
import androidx.lifecycle.C0161t0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.q0 */
/* loaded from: classes.dex */
public final class C0041q0 extends AbstractC0157r0 {

    /* renamed from: h */
    public static final C0039p0 f168h = new C0039p0(0);

    /* renamed from: e */
    public final boolean f172e;

    /* renamed from: b */
    public final HashMap f169b = new HashMap();

    /* renamed from: c */
    public final HashMap f170c = new HashMap();

    /* renamed from: d */
    public final HashMap f171d = new HashMap();

    /* renamed from: f */
    public boolean f173f = false;

    /* renamed from: g */
    public boolean f174g = false;

    public C0041q0(boolean z7) {
        this.f172e = z7;
    }

    @Override // androidx.lifecycle.AbstractC0157r0
    /* renamed from: b */
    public final void mo191b() {
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f173f = true;
    }

    /* renamed from: c */
    public final void m192c(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0050v);
        }
        m193d(abstractComponentCallbacksC0050v.f240n);
    }

    /* renamed from: d */
    public final void m193d(String str) {
        HashMap map = this.f170c;
        C0041q0 c0041q0 = (C0041q0) map.get(str);
        if (c0041q0 != null) {
            c0041q0.mo191b();
            map.remove(str);
        }
        HashMap map2 = this.f171d;
        C0161t0 c0161t0 = (C0161t0) map2.get(str);
        if (c0161t0 != null) {
            c0161t0.m581a();
            map2.remove(str);
        }
    }

    /* renamed from: e */
    public final void m194e(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (this.f174g) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f169b.remove(abstractComponentCallbacksC0050v.f240n) == null || !C0035n0.m106G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0050v);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0041q0.class == obj.getClass()) {
            C0041q0 c0041q0 = (C0041q0) obj;
            if (this.f169b.equals(c0041q0.f169b) && this.f170c.equals(c0041q0.f170c) && this.f171d.equals(c0041q0.f171d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f171d.hashCode() + ((this.f170c.hashCode() + (this.f169b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f169b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f170c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f171d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
