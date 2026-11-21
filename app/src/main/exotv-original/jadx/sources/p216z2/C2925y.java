package p216z2;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p071i1.C1240s;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.y */
/* loaded from: classes.dex */
public final class C2925y extends Observable {
    /* renamed from: a */
    public final boolean m5086a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m5087b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C2904n0) ((Observable) this).mObservers.get(size)).f10775a;
            recyclerView.m1189k(null);
            recyclerView.f2067p0.f10824f = true;
            recyclerView.m1174Y(true);
            if (!recyclerView.f2062n.m2702l()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public final void m5088c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C2904n0) ((Observable) this).mObservers.get(size)).f10775a;
            recyclerView.m1189k(null);
            C1240s c1240s = recyclerView.f2062n;
            ArrayList arrayList = (ArrayList) c1240s.f5178c;
            arrayList.add(c1240s.m2704n(null, 4, i, 1));
            c1240s.f5176a |= 4;
            if (arrayList.size() == 1) {
                if (RecyclerView.f2009N0 && recyclerView.f2018C && recyclerView.f2016B) {
                    RunnableC2919v runnableC2919v = recyclerView.f2070r;
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    recyclerView.postOnAnimation(runnableC2919v);
                } else {
                    recyclerView.f2031J = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
