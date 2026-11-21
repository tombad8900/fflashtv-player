package p216z2;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC2928z0 extends AbstractC2892h0 {

    /* renamed from: a */
    public RecyclerView f10877a;

    /* renamed from: b */
    public final C2926y0 f10878b = new C2926y0(this);

    /* renamed from: a */
    public final void m5089a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10877a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C2926y0 c2926y0 = this.f10878b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f2071r0;
            if (arrayList != null) {
                arrayList.remove(c2926y0);
            }
            this.f10877a.setOnFlingListener(null);
        }
        this.f10877a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f10877a.m1187j(c2926y0);
            this.f10877a.setOnFlingListener(this);
            new Scroller(this.f10877a.getContext(), new DecelerateInterpolator());
            m5090f();
        }
    }

    /* renamed from: b */
    public abstract int[] mo1438b(AbstractC2888f0 abstractC2888f0, View view);

    /* renamed from: c */
    public C2911r mo5055c(AbstractC2888f0 abstractC2888f0) {
        if (abstractC2888f0 instanceof InterfaceC2910q0) {
            return new C2915t(this, this.f10877a.getContext(), 1);
        }
        return null;
    }

    /* renamed from: d */
    public abstract View mo1439d(AbstractC2888f0 abstractC2888f0);

    /* renamed from: e */
    public abstract int mo1440e(AbstractC2888f0 abstractC2888f0, int i, int i4);

    /* renamed from: f */
    public final void m5090f() {
        AbstractC2888f0 layoutManager;
        View viewMo1439d;
        RecyclerView recyclerView = this.f10877a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo1439d = mo1439d(layoutManager)) == null) {
            return;
        }
        int[] iArrMo1438b = mo1438b(layoutManager, viewMo1439d);
        int i = iArrMo1438b[0];
        if (i == 0 && iArrMo1438b[1] == 0) {
            return;
        }
        this.f10877a.m1186i0(i, iArrMo1438b[1], false);
    }
}
