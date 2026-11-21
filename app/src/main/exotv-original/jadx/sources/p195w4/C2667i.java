package p195w4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.exotv.net.MainActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p002a1.AbstractC0008a1;
import p024c5.C0648a1;
import p024c5.C0702y;
import p024c5.RunnableC0653c0;
import p037e0.C0851b;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p114n0.InterfaceC1962n;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C2667i implements InterfaceC1833o, InterfaceC1962n {

    /* renamed from: j */
    public final /* synthetic */ int f9695j;

    /* renamed from: k */
    public final /* synthetic */ Object f9696k;

    public /* synthetic */ C2667i(int i, Object obj) {
        this.f9696k = obj;
        this.f9695j = i;
    }

    @Override // p114n0.InterfaceC1962n
    /* renamed from: a */
    public boolean mo162a(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9696k;
        int i = this.f9695j;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0008a1.m18n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f3392p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.m1886r(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f3392p.get();
        RunnableC0653c0 runnableC0653c0 = new RunnableC0653c0(i, 4, sideSheetBehavior);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
            view2.post(runnableC0653c0);
            return true;
        }
        runnableC0653c0.run();
        return true;
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) throws Resources.NotFoundException {
        LinearLayout linearLayout;
        MainActivity mainActivity = (MainActivity) this.f9696k;
        Set set = MainActivity.f2882p0;
        C1835o1 c1835o1 = c1844r1.f6934a;
        C0851b c0851bMo3563f = c1835o1.mo3563f(647);
        C0702y c0702y = mainActivity.f2886J;
        if (c0702y == null) {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
        LinearLayout linearLayout2 = c0702y.f2749n;
        int paddingLeft = linearLayout2.getPaddingLeft();
        C0702y c0702y2 = mainActivity.f2886J;
        if (c0702y2 == null) {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
        int paddingTop = c0702y2.f2749n.getPaddingTop();
        C0702y c0702y3 = mainActivity.f2886J;
        if (c0702y3 == null) {
            AbstractC2980h.m5139h("nav");
            throw null;
        }
        int paddingRight = c0702y3.f2749n.getPaddingRight();
        boolean zM1681I = mainActivity.m1681I();
        int i = this.f9695j;
        if (!zM1681I) {
            i += c1835o1.mo3563f(2).f3772d;
        }
        linearLayout2.setPadding(paddingLeft, paddingTop, paddingRight, i);
        int i4 = c0851bMo3563f.f3770b;
        mainActivity.f2911i0 = i4;
        Collection collectionValues = mainActivity.f2905c0.values();
        AbstractC2980h.m5135d("<get-values>(...)", collectionValues);
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            LinearLayout linearLayout3 = ((C2673l) it.next()).f9713b;
            int i8 = mainActivity.f2909g0;
            linearLayout3.setPadding(i8, mainActivity.f2911i0, i8, mainActivity.f2910h0);
        }
        mainActivity.f2912j0 = i4;
        mainActivity.m1695t();
        int height = c1835o1.mo3563f(8).f3772d;
        mainActivity.f2891O = height > 0;
        mainActivity.m1694Z();
        if (!mainActivity.m1681I()) {
            C0702y c0702y4 = mainActivity.f2886J;
            if (c0702y4 == null) {
                AbstractC2980h.m5139h("nav");
                throw null;
            }
            height -= c0702y4.f2749n.getHeight();
            if (height < 0) {
                height = 0;
            }
        }
        C0648a1 c0648a1 = mainActivity.f2889M;
        if (c0648a1 != null && (linearLayout = c0648a1.f2564n) != null) {
            linearLayout.setPadding(0, i4, 0, height);
        }
        return c1844r1;
    }
}
