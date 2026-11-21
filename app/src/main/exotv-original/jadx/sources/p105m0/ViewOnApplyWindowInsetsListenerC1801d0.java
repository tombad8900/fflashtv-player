package p105m0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.d0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1801d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C1844r1 f6865a = null;

    /* renamed from: b */
    public final /* synthetic */ View f6866b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1833o f6867c;

    public ViewOnApplyWindowInsetsListenerC1801d0(View view, InterfaceC1833o interfaceC1833o) {
        this.f6866b = view;
        this.f6867c = interfaceC1833o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1844r1 c1844r1M3621g = C1844r1.m3621g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC1833o interfaceC1833o = this.f6867c;
        if (i < 30) {
            AbstractC1804e0.m3529a(windowInsets, this.f6866b);
            if (c1844r1M3621g.equals(this.f6865a)) {
                return interfaceC1833o.mo649p(view, c1844r1M3621g).m3626f();
            }
        }
        this.f6865a = c1844r1M3621g;
        C1844r1 c1844r1Mo649p = interfaceC1833o.mo649p(view, c1844r1M3621g);
        if (i >= 30) {
            return c1844r1Mo649p.m3626f();
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1798c0.m3516c(view);
        return c1844r1Mo649p.m3626f();
    }
}
